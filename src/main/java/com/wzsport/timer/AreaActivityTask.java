package com.wzsport.timer;

import org.joda.time.DateTime;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.wzsport.controller.FixLocationOutdoorSportPointsController;
import com.wzsport.mapper.AreaActivityDataMapper;
import com.wzsport.mapper.AreaActivityMapper;
import com.wzsport.model.AreaActivity;
import com.wzsport.model.AreaActivityData;
import com.wzsport.model.AreaActivityDataExample;
import com.wzsport.model.AreaActivityExample;
import com.wzsport.service.AreaActivityService;
import com.wzsport.service.StatisticTaskService;

import java.util.Date;
import java.util.List;

@Component
public class AreaActivityTask {
//	@Autowired
//	private AreaActivityDataMapper areaActivityDataMapper;
//	@Autowired
//	private AreaActivityMapper areaActivityMapper;
//	@Autowired
//	private AreaActivityService areaActivityService;
//	
	@Autowired
    private StatisticTaskService taskService;
	
	private static final Logger logger = LoggerFactory.getLogger(FixLocationOutdoorSportPointsController.class);
	
//    @Scheduled(cron = "0 0 1 * * ?")  
//    public void job() 	{  
//	    	//找到昨天所有没有正常结束的活动
//	    	AreaActivityExample example = new AreaActivityExample();
//	    	example.createCriteria().andEndedAtIsNull();
//	    	List<AreaActivity> list = areaActivityMapper.selectByExample(example);
//	
//	    	int costTime = 0;
//	    	
//	    	//根据活动数据表最后一条记录来进行统计，把结果写入活动表
//	    	for (AreaActivity act : list) {
//	    		AreaActivityDataExample dataExample = new AreaActivityDataExample();
//	    		dataExample.createCriteria().andActivityIdEqualTo(act.getId());
//	    		dataExample.setOrderByClause("created_at desc");
//	    		List<AreaActivityData> areaActivityDataList = areaActivityDataMapper.selectByExample(dataExample);
//	    		if (areaActivityDataList.size() > 0) {
//		    		costTime = (int) ((areaActivityDataList.get(0).getAcquisitionTime().getTime()
//		    				- areaActivityDataList.get(areaActivityDataList.size() - 1).getAcquisitionTime().getTime()) / 1000);
//			} 
//	
//			AreaActivity areaActivity = new AreaActivity();
//			areaActivity.setId(act.getId());
//			areaActivity.setAreaSportId(act.getAreaSportId());
//			areaActivity.setCostTime(costTime);
//			areaActivity.setEndedBy(true);
//
//			areaActivity = areaActivityService.endAreaActivity(areaActivity);
//			
//			//是否审核通过
//			areaActivity.setIsVerified(true);
//			
//			areaActivityMapper.updateByPrimaryKey(areaActivity);
//			
//		} 
//    }
    
    
    @Scheduled(cron = "0 0 1 * * ?")
//  @Scheduled(cron = "*/5 * * * * ?")
    public void job() {
        DateTime yesterday = new DateTime().withMillisOfDay(0).minusDays(1);
        Date startDate = yesterday.toDate();
        
        DateTime now = new DateTime();
        Date endDate = now.withTimeAtStartOfDay().toDate();
        
        taskService.areaActivityTask(startDate, endDate);
    }
}

