package com.wzsport.service.impl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.joda.time.DateTime;
import org.joda.time.Interval;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wzsport.mapper.ActivityDataCollectionMapper;
import com.wzsport.mapper.AreaActivityDataMapper;
import com.wzsport.mapper.AreaActivityDataStatisticMapper;
import com.wzsport.mapper.AreaActivityMapper;
import com.wzsport.mapper.RunningActivityDataMapper;
import com.wzsport.mapper.RunningActivityDataStatisticMapper;
import com.wzsport.mapper.RunningActivityMapper;
import com.wzsport.model.ActivityDataCollection;
import com.wzsport.model.AreaActivity;
import com.wzsport.model.AreaActivityData;
import com.wzsport.model.AreaActivityDataExample;
import com.wzsport.model.AreaActivityDataStatistic;
import com.wzsport.model.AreaActivityExample;
import com.wzsport.model.RunningActivity;
import com.wzsport.model.RunningActivityData;
import com.wzsport.model.RunningActivityDataExample;
import com.wzsport.model.RunningActivityDataStatistic;
import com.wzsport.model.RunningActivityExample;
import com.wzsport.service.AreaActivityService;
import com.wzsport.service.RunningActivityService;
import com.wzsport.service.SignInService;
import com.wzsport.service.StudentSportConsumeStatisticService;
import com.wzsport.service.StatisticTaskService;

@Service
public class StatisticTaskServiceImpl implements StatisticTaskService {

    @Autowired
    private RunningActivityDataMapper runningActivityDataMapper;
    @Autowired
    private RunningActivityMapper runningActivityMapper;
    @Autowired
    private RunningActivityDataStatisticMapper runningActivityDataStatisticMapper;
    @Autowired
    private RunningActivityService runningActivityService;
    @Autowired
    private StudentSportConsumeStatisticService studentSportConsumeStatisticService;
    @Autowired
    private SignInService signInService;
    @Autowired
    private AreaActivityDataMapper areaActivityDataMapper;
    @Autowired
    private AreaActivityMapper areaActivityMapper;
    @Autowired
    private AreaActivityDataStatisticMapper areaActivityDataStatisticMapper;
    @Autowired
    private AreaActivityService areaActivityService;
    
    @Autowired
    private ActivityDataCollectionMapper activityDataCollectionMapper;
    
    private static final Logger logger = LogManager.getLogger(StatisticTaskService.class);

    @Override
    public void runningActivityTask(Date startDate, Date endDate) {
        // 找到昨天所有没有正常结束的活动
        RunningActivityExample example = new RunningActivityExample();
        example.createCriteria().andStartTimeBetween(startDate, endDate);
        List<RunningActivity> list = runningActivityMapper.selectByExample(example);
        int targetFinishedTime = 0;
        int distance = 0;
        int stepCount = 0;
        int costTime = 0;

        System.out.println("running job list size: " + list.size());

        // 根据活动数据表最后一条记录来进行统计，把结果写入活动表
        for (RunningActivity act : list) {
            if (act.getEndedAt() == null) {
                distance = 0;
                stepCount = 0;
                costTime = 0;
                targetFinishedTime = 0;

                RunningActivityDataExample dataExample = new RunningActivityDataExample();
                dataExample.createCriteria().andActivityIdEqualTo(act.getId());
                dataExample.setOrderByClause("created_at asc");
                List<RunningActivityData> runningActivityDataList = runningActivityDataMapper
                        .selectByExample(dataExample);
                if (runningActivityDataList.size() > 0) {

                    RunningActivityDataStatistic runningActivityDataStatistic = new RunningActivityDataStatistic();
                    int distancePerStepAgainst = 0;
                    int speedAgainst = 0;

                    Integer lastDistance = null;
                    RunningActivityData lastRunningActivityData = null;
                    DateTime acquisitionTime = null;
                    DateTime lastAcquisitionTime = null;

                    for (RunningActivityData data : runningActivityDataList) {
                        try {
                            if (data.getDistance() > act.getQualifiedDistance() && targetFinishedTime == 0) {
                                targetFinishedTime = (int) ((data.getAcquisitionTime().getTime()
                                        - act.getStartTime().getTime()) / 1000);
                            }

                            // 违背了速度的规则
                            if (lastDistance != null) {
                                int distanceInterval = data.getDistance().intValue() - lastDistance.intValue();
                                acquisitionTime = new DateTime(data.getAcquisitionTime());
                                lastAcquisitionTime = new DateTime(lastRunningActivityData.getAcquisitionTime());
                                Long interval = new Interval(lastAcquisitionTime, acquisitionTime).toDuration()
                                        .getMillis();
                                if (interval / 1000 <= 0) {

                                } else {
                                    if (distanceInterval / (interval / 1000) > 10) {
                                        speedAgainst++;
                                    }
                                }
                            }
                            lastDistance = data.getDistance();
                            lastRunningActivityData = data;

                            // 违背了步幅的规则
                            BigDecimal distancePerStep = new BigDecimal(data.getDistancePerStep());
                            if (distancePerStep.compareTo(new BigDecimal(2)) > 0) {
                                distancePerStepAgainst++;
                            }
                        } catch (Exception e) {
                            logger.error(e);
                        }
                    }
                    System.out.println("speedAgainst: " + speedAgainst);
                    runningActivityDataStatistic.setStudentId(act.getStudentId());
                    runningActivityDataStatistic.setActivityId(act.getId());
                    runningActivityDataStatistic.setDistancePerStepAgainst(distancePerStepAgainst);
                    runningActivityDataStatistic.setLocationTotalCount(runningActivityDataList.size());
                    runningActivityDataStatistic.setSpeedAgainst(speedAgainst);
                    try {
                        runningActivityDataStatisticMapper.insertSelective(runningActivityDataStatistic);
                    } catch (Exception e) {
                        logger.error(e);
                    }

                    distance = runningActivityDataList.get(runningActivityDataList.size() - 1).getDistance();
                    stepCount = runningActivityDataList.get(runningActivityDataList.size() - 1).getStepCount();
                    costTime = (int) ((runningActivityDataList.get(runningActivityDataList.size() - 1)
                            .getAcquisitionTime().getTime()
                            - runningActivityDataList.get(0).getAcquisitionTime().getTime()) / 1000);
                }

                RunningActivity runningActivity = new RunningActivity();
                runningActivity.setId(act.getId());
                runningActivity.setDistance(distance);
                runningActivity.setStepCount(stepCount);
                runningActivity.setCostTime(costTime);
                runningActivity.setTargetFinishedTime(targetFinishedTime);
                runningActivity.setEndedBy(true);

                // 未完成运动结束运动
                try {
                    act = runningActivityService.endRunningActivity(runningActivity);
                } catch (Exception e) {
                    logger.error(e);
                }
            }

            // TODO完成审核
            try {
                act.setIsVerified(true);
                runningActivityMapper.updateByPrimaryKey(act);
            } catch (Exception e) {
                logger.error(e);
            }

        }
    }

    @Override
    public void sportConsumeStatisticTask() {
        studentSportConsumeStatisticService.create();
    }

    @Override
    public void signInTask() {
        signInService.create();
    }

    @Override
    public void runningActivityDataStatisticTask(Date startDate, Date endDate) {
        // 找到昨天所有没有正常结束的活动
        RunningActivityExample example = new RunningActivityExample();
        example.createCriteria().andStartTimeBetween(startDate, endDate);
        List<RunningActivity> list = runningActivityMapper.selectByExample(example);
        int targetFinishedTime = 0;

        System.out.println("job list size: " + list.size());

        // 根据活动数据表最后一条记录来进行统计，把结果写入活动表
        for (RunningActivity act : list) {
            RunningActivityDataExample dataExample = new RunningActivityDataExample();
            dataExample.createCriteria().andActivityIdEqualTo(act.getId());
            dataExample.setOrderByClause("created_at asc");
            List<RunningActivityData> runningActivityDataList = runningActivityDataMapper.selectByExample(dataExample);
            if (runningActivityDataList.size() > 0) {

                RunningActivityDataStatistic runningActivityDataStatistic = new RunningActivityDataStatistic();
                int distancePerStepAgainst = 0;
                int speedAgainst = 0;

                Integer lastDistance = null;
                RunningActivityData lastRunningActivityData = null;
                DateTime acquisitionTime = null;
                DateTime lastAcquisitionTime = null;

                for (RunningActivityData data : runningActivityDataList) {
                    try {
                        if (data.getDistance() > act.getQualifiedDistance() && targetFinishedTime == 0) {
                            targetFinishedTime = (int) ((data.getAcquisitionTime().getTime()
                                    - act.getStartTime().getTime()) / 1000);
                        }

                        // 违背了速度的规则
                        if (lastDistance != null) {
                            int distanceInterval = data.getDistance().intValue() - lastDistance.intValue();
                            acquisitionTime = new DateTime(data.getAcquisitionTime());
                            lastAcquisitionTime = new DateTime(lastRunningActivityData.getAcquisitionTime());
                            Long interval = 0l;
                            if (acquisitionTime.getMillis() > lastAcquisitionTime.getMillis()) {
                                interval = new Interval(lastAcquisitionTime, acquisitionTime).toDuration().getMillis();
                            } else {
                                interval = new Interval(acquisitionTime, lastAcquisitionTime).toDuration().getMillis();
                            }
                            if (interval / 1000 <= 0) {

                            } else {
                                if (distanceInterval / (interval / 1000) > 10) {
                                    speedAgainst++;
                                }
                            }
                        }
                        lastDistance = data.getDistance();
                        lastRunningActivityData = data;

                        // 违背了步幅的规则
                        BigDecimal distancePerStep = new BigDecimal(data.getDistancePerStep());
                        if (distancePerStep.compareTo(new BigDecimal(2)) > 0) {
                            distancePerStepAgainst++;
                        }
                    } catch (Exception e) {
                        logger.error(e);
                    }
                }
                System.out.println("speedAgainst: " + speedAgainst);
                runningActivityDataStatistic.setStudentId(act.getStudentId());
                runningActivityDataStatistic.setActivityId(act.getId());
                runningActivityDataStatistic.setDistancePerStepAgainst(distancePerStepAgainst);
                runningActivityDataStatistic.setLocationTotalCount(runningActivityDataList.size());
                runningActivityDataStatistic.setSpeedAgainst(speedAgainst);
                try {
                    runningActivityDataStatisticMapper.insertSelective(runningActivityDataStatistic);
                } catch (Exception e) {
                    logger.error(e);
                }
            }
        }
    }

    @Override
    public void areaActivityTask(Date startDate, Date endDate) {
        AreaActivityExample example = new AreaActivityExample();
        example.createCriteria().andStartTimeBetween(startDate, endDate);
        List<AreaActivity> list = areaActivityMapper.selectByExample(example);
        int costTime = 0;

        System.out.println("area job list size: " + list.size());
        int counter = 0;
        // 根据活动数据表最后一条记录来进行统计，把结果写入活动表
        for (AreaActivity act : list) {
            if (act.getEndedAt() == null) {

                AreaActivityDataExample dataExample = new AreaActivityDataExample();
                dataExample.createCriteria().andActivityIdEqualTo(act.getId());
                dataExample.setOrderByClause("created_at asc");
                List<AreaActivityData> areaActivityDataList = areaActivityDataMapper.selectByExample(dataExample);
                if (areaActivityDataList.size() > 0) {
                    costTime = (int) ((areaActivityDataList.get(areaActivityDataList.size() - 1).getAcquisitionTime()
                            .getTime() - areaActivityDataList.get(0).getAcquisitionTime().getTime()) / 1000);
                }

                AreaActivity areaActivity = new AreaActivity();
                areaActivity.setId(act.getId());
                areaActivity.setAreaSportId(act.getAreaSportId());
                areaActivity.setCostTime(costTime);
                areaActivity.setEndedBy(true);

                // 未完成运动结束运动
                try {
                    act = areaActivityService.endAreaActivity(areaActivity);
                } catch (Exception e) {
                    logger.error(e);
                }
            }

            // 完成审核
            try {
                counter++;
                System.out.println("counter: " + counter);
                act.setIsVerified(true);
                areaActivityMapper.updateByPrimaryKey(act);
            } catch (Exception e) {
                logger.error(e);
            }
        }
    }

    @Override
    public void areaActivityDataStatisticTask(Date startDate, Date endDate) {
        AreaActivityExample example = new AreaActivityExample();
        example.createCriteria().andStartTimeBetween(startDate, endDate);
        List<AreaActivity> list = areaActivityMapper.selectByExample(example);

        System.out.println("area statistic job list size: " + list.size());

        for (AreaActivity act : list) {
            AreaActivityDataExample dataExample = new AreaActivityDataExample();
            dataExample.createCriteria().andActivityIdEqualTo(act.getId());
            dataExample.setOrderByClause("created_at asc");
            List<AreaActivityData> areaActivityDataList = areaActivityDataMapper.selectByExample(dataExample);
            if (areaActivityDataList.size() > 0) {
                int locationAgainst = 0;
                AreaActivityDataStatistic areaActivityDataStatistic = new AreaActivityDataStatistic();

                for (AreaActivityData data : areaActivityDataList) {
                    // 违背了区域范围的规则
                    if (!data.getIsNormal()) {
                        locationAgainst++;
                    }
                }
                System.out.println("locationAgainst: " + locationAgainst);
                areaActivityDataStatistic.setStudentId(act.getStudentId());
                areaActivityDataStatistic.setActivityId(act.getId());
                areaActivityDataStatistic.setLocationTotalCount(areaActivityDataList.size());
                areaActivityDataStatistic.setLocationAgainst(locationAgainst);
                try {
                    areaActivityDataStatisticMapper.insertSelective(areaActivityDataStatistic);
                } catch (Exception e) {
                    logger.error(e);
                }
            }
        }
    }

    @Override
    public void runningActivityDataCollectionTask(Date startDate, Date endDate) {

        // 压缩data表
        RunningActivityExample example = new RunningActivityExample();
        example.createCriteria().andStartTimeBetween(startDate, endDate);
        List<RunningActivity> list = runningActivityMapper.selectByExample(example);
        System.out.println("collection job list size: " + list.size());
        int counter = 0;
        for (RunningActivity act : list) {
            
            ActivityDataCollection activityDataCollection = new ActivityDataCollection();
            RunningActivityDataExample dataExample = new RunningActivityDataExample();
            dataExample.createCriteria().andActivityIdEqualTo(act.getId());
            dataExample.setOrderByClause("created_at asc");
            List<RunningActivityData> runningActivityDataList = runningActivityDataMapper.selectByExample(dataExample);
            StringBuilder sb = new StringBuilder();
            StringBuilder idBuilder = new StringBuilder("id:[");
            StringBuilder acquisitionTimeBuilder = new StringBuilder("acquisitionTime:[");
            StringBuilder stepCountBuilder = new StringBuilder("stepCount:[");
            StringBuilder stepCountCalBuilder = new StringBuilder("stepCountCal:[");
            StringBuilder distanceBuilder = new StringBuilder("distance:[");
            StringBuilder distancePerStepBuilder = new StringBuilder("distancePerStep:[");
            StringBuilder stepPerSecondBuilder = new StringBuilder("stepPerSecond:[");
            StringBuilder longitudeBuilder = new StringBuilder("longitude:[");
            StringBuilder latitudeBuilder = new StringBuilder("latitude:[");
            StringBuilder locationTypeBuilder = new StringBuilder("locationType:[");
            StringBuilder isNormalBuilder = new StringBuilder("isNormal:[");
            
            if (runningActivityDataList.size() > 0) {
//                sb.append("{data:{activityId:" + runningActivityDataList.get(0).getActivityId() +",");
                sb.append("{data:{");
                int i = 0;
                for (RunningActivityData data : runningActivityDataList) {
                    if (i >= 200) {
                        break;
                    }
                    idBuilder.append(data.getId() + ",");
                    String millis = String.valueOf(new DateTime(data.getAcquisitionTime()).getMillis());
                    acquisitionTimeBuilder.append(millis.substring(0, millis.length() - 3) + ","); // 精确到秒
                    stepCountBuilder.append(data.getStepCount() + ",");
                    stepCountCalBuilder.append(data.getStepCountCal() + ",");
                    distanceBuilder.append(data.getDistance() + ",");
                    distancePerStepBuilder.append(data.getDistancePerStep() + ",");
                    stepPerSecondBuilder.append(data.getStepPerSecond() + ",");
                    longitudeBuilder.append(data.getLongitude() + ",");
                    latitudeBuilder.append(data.getLatitude() + ",");
                    locationTypeBuilder.append(data.getLocationType() + ",");
                    isNormalBuilder.append(data.getIsNormal() + ",");
                    
//                    sb.append("{id:" + data.getId() + ",");
//                    sb.append("activityId:" + data.getActivityId() + ",");
//                     sb.append("acquisitionTime:" + new
//                     DateTime(data.getAcquisitionTime()).getMillis() + ",");
////                    sb.append("acquisitionTime:" + data.getAcquisitionTime() + ",");
//                    sb.append("stepCount:" + data.getStepCount() + ",");
//                    sb.append("stepCountCal:" + data.getStepCountCal() + ",");
//                    sb.append("distance:" + data.getDistance() + ",");
//                    sb.append("distancePerStep:" + data.getDistancePerStep() + ",");
//                    sb.append("stepPerSecond:" + data.getStepPerSecond() + ",");
//                    sb.append("longitude:" + data.getLongitude() + ",");
//                    sb.append("latitude:" + data.getLatitude() + ",");
//                    sb.append("locationType:" + data.getLocationType() + ",");
//                    sb.append("isNormal:" + data.getIsNormal() + "},");
                    
                    
                    
                    // sb.append("{" + data.getId() + ",");
                    // sb.append(data.getActivityId() + ",");
                    // sb.append(data.getAcquisitionTime() + ",");
                    // sb.append(data.getStepCount() + ",");
                    // sb.append(data.getStepCountCal() + ",");
                    // sb.append(data.getDistance() + ",");
                    // sb.append(data.getDistancePerStep() + ",");
                    // sb.append(data.getStepPerSecond() + ",");
                    // sb.append(data.getLongitude() + ",");
                    // sb.append(data.getLatitude() + ",");
                    // sb.append(data.getLocationType() + ",");
                    // sb.append(data.getIsNormal() + "},");
                    i++;
                }
                idBuilder.deleteCharAt(idBuilder.length() - 1).append("],");
                acquisitionTimeBuilder.deleteCharAt(acquisitionTimeBuilder.length() - 1).append("],");
                stepCountBuilder.deleteCharAt(stepCountBuilder.length() - 1).append("],");
                stepCountCalBuilder.deleteCharAt(stepCountCalBuilder.length() - 1).append("],");
                distanceBuilder.deleteCharAt(distanceBuilder.length() - 1).append("],");
                distancePerStepBuilder.deleteCharAt(distancePerStepBuilder.length() - 1).append("],");
                stepPerSecondBuilder.deleteCharAt(stepPerSecondBuilder.length() - 1).append("],");
                longitudeBuilder.deleteCharAt(longitudeBuilder.length() - 1).append("],");
                latitudeBuilder.deleteCharAt(latitudeBuilder.length() - 1).append("],");
                locationTypeBuilder.deleteCharAt(locationTypeBuilder.length() - 1).append("],");
                isNormalBuilder.deleteCharAt(isNormalBuilder.length() - 1).append("]");
                
                sb.append(
                        idBuilder.toString() 
                        + acquisitionTimeBuilder.toString()
                        + stepCountBuilder.toString()
                        + stepCountCalBuilder.toString()
                        + distanceBuilder.toString()
                        + distancePerStepBuilder.toString()
                        + stepPerSecondBuilder.toString()
                        + longitudeBuilder.toString()
                        + latitudeBuilder.toString()
                        + locationTypeBuilder.toString()
                        + isNormalBuilder.toString()
                        );
                sb.append("}}");
//                System.out.println("collection: " + sb.toString());
                System.out.println("collection.length: " + sb.toString().length());
            }
            activityDataCollection.setActivityId(act.getId());
            activityDataCollection.setCollectionData(sb.toString());
            try {
                activityDataCollectionMapper.insertSelective(activityDataCollection);
                counter++;
                System.out.println("counter: " + counter);
            } catch (Exception e) {
                logger.error(e);
            }
        }

    }

}
