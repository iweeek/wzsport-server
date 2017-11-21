package com.wzsport.service.impl;

import java.util.List;
import java.util.Calendar;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wzsport.mapper.ClassMapper;
import com.wzsport.mapper.CollegeMapper;
import com.wzsport.mapper.MajorMapper;
import com.wzsport.mapper.StudentSportConsumeStatisticMapper;
import com.wzsport.model.ClassExample;
import com.wzsport.model.College;
import com.wzsport.model.Class;
import com.wzsport.model.CollegeExample;
import com.wzsport.model.Major;
import com.wzsport.model.StudentSportConsumeStatistic;
import com.wzsport.service.StudentSportConsumeStatisticService;

@Service
public class StudentSportConsumeStatisticServiceImpl implements StudentSportConsumeStatisticService {
    @Autowired
    private StudentSportConsumeStatisticMapper studentSportConsumeStatisticMapper;
    
    @Autowired
    private CollegeMapper collegeMappper;
    
    @Autowired
    private ClassMapper classMappper;
    
    @Autowired
    private MajorMapper majorMapper;

    private static final Logger logger = LogManager.getLogger(StudentSportConsumeStatisticServiceImpl.class);
    @Override
    @Transactional
    public boolean create() {
        Calendar c = Calendar.getInstance();
        Calendar calFirst = Calendar.getInstance();
        Calendar calLast = Calendar.getInstance();

        int today = c.get(Calendar.DAY_OF_MONTH);
        // 如果是本月第一天，取上个月第一天和最后一天,否则，取本月
        if (today == 1) {
            calFirst.add(Calendar.MONTH, -1); // 上一个月
            calFirst.set(Calendar.DAY_OF_MONTH, 1);

            calLast.set(Calendar.DAY_OF_MONTH, 0);
        } else {
            calFirst.add(Calendar.MONTH, 0);
            calFirst.set(Calendar.DAY_OF_MONTH, 1);

            calLast.set(Calendar.DAY_OF_MONTH, calLast.getActualMaximum(Calendar.DAY_OF_MONTH));
        }
        
        List<StudentSportConsumeStatistic> list =
            studentSportConsumeStatisticMapper.getStudentSportConsumeStatisticList(calFirst.getTime(), calLast.getTime());

        for (StudentSportConsumeStatistic studentSportConsumeStatistic : list) {
            try {
                Class classInfo = classMappper.selectByPrimaryKey(studentSportConsumeStatistic.getClassId());
                studentSportConsumeStatistic.setGrade(classInfo.getGrade());
                studentSportConsumeStatistic.setMajorId(classInfo.getMajorId());
                studentSportConsumeStatistic.setMajorName(classInfo.getName());
                
                Major majorInfo = majorMapper.selectByPrimaryKey(classInfo.getMajorId());
                College collegeInfo = collegeMappper.selectByPrimaryKey(majorInfo.getCollegeId());
                studentSportConsumeStatistic.setCollegeId(collegeInfo.getId());
                studentSportConsumeStatistic.setCollegeName(collegeInfo.getName());
                
                studentSportConsumeStatisticMapper.insert(studentSportConsumeStatistic);
                
            } catch (Exception e) {
                logger.error(e);
            }
        }
        
//        List<StudentSportConsumeDailyStatistic> runningDailylist = studentSportConsumeDailyStatisticMapper.getRunningSportDailyList(calFirst.getTime(), calLast.getTime());
//        for (StudentSportConsumeDailyStatistic runningSport : runningDailylist) {
//            try {
//                studentSportConsumeDailyStatisticMapper.insert(runningSport);
//            } catch (Exception e) {
//                logger.error(e);
//            }
//        }
//        
//        List<StudentSportConsumeDailyStatistic> areaDailylist = studentSportConsumeDailyStatisticMapper.getAreaSportDailyList(calFirst.getTime(), calLast.getTime());
//        for (StudentSportConsumeDailyStatistic areaSport : areaDailylist) {
//            try {
//                studentSportConsumeDailyStatisticMapper.insert(areaSport);
//            } catch (Exception e) {
//                logger.error(e);
//            }
//        }
        return true;
    }

}
