package com.wzsport.service.impl;

import java.util.List;
import java.util.Set;
import java.util.Calendar;
import java.util.Date;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.joda.time.DateTime;
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
import com.wzsport.model.SignIn;
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
        
     // 第一步，取昨天的记录
        DateTime yesterday = new DateTime().withMillisOfDay(0).minusDays(2);
        Date startDate = yesterday.toDate();
        
        DateTime now = new DateTime();
        Date endDate = now.minusDays(1).withTimeAtStartOfDay().toDate();
        
        System.out.println("startDate: " + startDate);
        System.out.println("endDate: " + endDate);
    

        logger.info("consume statistic is starting......");
        
     // 正式库上暂时没有grade、major、college这几个字段
//        List<Class> classes = classMappper.selectByExample(null);
//        List<Major> majors = majorMapper.selectByExample(null);
//        List<College> colleges = collegeMappper.selectByExample(null);
//        Class classInfo = null;
//        Major majorInfo = null;
//        College collegeInfo = null;
        Set<StudentSportConsumeStatistic> list = studentSportConsumeStatisticMapper.getStudentSportConsumeStatisticListAll(startDate, endDate);
        Set<StudentSportConsumeStatistic> allSignInList = studentSportConsumeStatisticMapper.getAllDataList(startDate, endDate);
        
        logger.info("before: " + list.size() + "-" + allSignInList.size());
        boolean b = list.removeAll(allSignInList);
        logger.info("after: " + list.size());
      
          int count = 0;
          logger.info("consume statistic job list size: " + list.size());
          for (StudentSportConsumeStatistic studentSportConsumeStatistic : list) {
              
              try {
                  // 正式库上暂时没有grade、major、college这几个字段
    //                  for (Class c : classes) {
    //                      if (c.getId() == studentSportConsumeStatistic.getClassId()) {
    //                          classInfo = c;
    //                          break;
    //                      }
    //                  }
    //                  Class classInfo = classMappper.selectByPrimaryKey(studentSportConsumeStatistic.getClassId());
    //                  studentSportConsumeStatistic.setGrade(classInfo.getGrade());
    //                  studentSportConsumeStatistic.setMajorId(classInfo.getMajorId());
    //                  studentSportConsumeStatistic.setMajorName(classInfo.getName());
                  
    //                  for (Major m : majors) {
    //                      if (m.getId() == classInfo.getMajorId()) {
    //                          majorInfo = m;
    //                          break;
    //                      }
    //                  }
    //                  Major majorInfo = majorMapper.selectByPrimaryKey(classInfo.getMajorId());
    //                  for (College college : colleges) {
    //                      if (college.getId() == majorInfo.getCollegeId()) {
    //                          collegeInfo = college;
    //                          break;
    //                      }
    //                  }
    //                  College collegeInfo = collegeMappper.selectByPrimaryKey(majorInfo.getCollegeId());
    //                  studentSportConsumeStatistic.setCollegeId(collegeInfo.getId());
    //                  studentSportConsumeStatistic.setCollegeName(collegeInfo.getName());
                  
                  studentSportConsumeStatisticMapper.insert(studentSportConsumeStatistic);
                  
                  logger.info("consume counter: " + ++count);
              } catch (Exception e) {
                  logger.error(e);
              }
          }
        return true;
    }

}
