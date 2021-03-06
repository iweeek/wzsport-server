package com.wzsport.controller;

import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wzsport.mapper.ClassMapper;
import com.wzsport.mapper.CollegeMapper;
import com.wzsport.mapper.MajorMapper;
import com.wzsport.mapper.SignInAnotherMapper;
import com.wzsport.mapper.SignInCopyMapper;
import com.wzsport.mapper.SignInMapper;
import com.wzsport.mapper.StudentSportConsumeStatisticMapper;
import com.wzsport.model.Class;
import com.wzsport.model.College;
import com.wzsport.model.Major;
import com.wzsport.model.SignIn;
import com.wzsport.model.SignInCopy;
import com.wzsport.model.StudentSportConsumeStatistic;
import com.wzsport.service.StatisticTaskService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@Api(tags = "Task相关接口")
@RestController
@RequestMapping(value="/statisticTasks",produces="application/json;charset=UTF-8")
public class StatisticTasksController {
	@Autowired
	private StatisticTaskService taskService;
	
    @Autowired
    SignInMapper signInMapper;
    
    @Autowired
    SignInCopyMapper signInCopyMapper;
    
    @Autowired
    SignInAnotherMapper signInAnotherMapper;
    
    @Autowired
    private StudentSportConsumeStatisticMapper studentSportConsumeStatisticMapper;
    
    @Autowired
    private CollegeMapper collegeMappper;
    
    @Autowired
    private ClassMapper classMappper;
    
    @Autowired
    private MajorMapper majorMapper;
	   
	private static final Logger logger = LogManager.getLogger(StatisticTaskService.class);

	@ApiOperation(value = "调用跑步运动的统计任务", notes = "调用跑步运动的统计任务")
	@RequestMapping(value="/runningActivityTask", method = RequestMethod.GET)
	public ResponseEntity<?> runningActiviy(@ApiParam("活动开始时间") @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd")  Date startDate,
	        @ApiParam("活动结束时间") @RequestParam(required = false)  @DateTimeFormat(pattern="yyyy-MM-dd") Date endDate) {
	    
	    if (startDate == null) {
	        DateTime yesterday = new DateTime().withMillisOfDay(0).minusDays(1);
	        startDate = yesterday.toDate();
	    }
	    
	    if (endDate == null) {
	        DateTime now = new DateTime();
	        endDate = now.withTimeAtStartOfDay().toDate();
	    }
	    
		try {
			taskService.runningActivityTask(startDate, endDate);
			return ResponseEntity.ok().build();
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}
	
	@ApiOperation(value = "调用跑步运动的统计任务", notes = "调用跑步运动的统计任务")
    @RequestMapping(value="/areaActivityTask", method = RequestMethod.GET)
    public ResponseEntity<?> areaActiviy(@ApiParam("活动开始时间") @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd")  Date startDate,
            @ApiParam("活动结束时间") @RequestParam(required = false)  @DateTimeFormat(pattern="yyyy-MM-dd") Date endDate) {
        
        if (startDate == null) {
            DateTime yesterday = new DateTime().withMillisOfDay(0).minusDays(1);
            startDate = yesterday.toDate();
        }
        
        if (endDate == null) {
            DateTime now = new DateTime();
            endDate = now.withTimeAtStartOfDay().toDate();
        }
        
        try {
            taskService.areaActivityTask(startDate, endDate);
            return ResponseEntity.ok().build();
        } catch (Exception e) {
            logger.error(e);
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

	@RequestMapping(value="/sportConsumeStatistic", method = RequestMethod.GET)
	public ResponseEntity<?> sportConsumeStatistic() {
		try {
			taskService.sportConsumeStatisticTask();
			return ResponseEntity.ok().build();
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}

	@RequestMapping(value="/signIn", method = RequestMethod.POST)
	public ResponseEntity<?> signIn(@ApiParam("活动开始时间") @RequestParam @DateTimeFormat(pattern="yyyy-MM-dd")  Date startDate,
            @ApiParam("活动结束时间") @RequestParam  @DateTimeFormat(pattern="yyyy-MM-dd") Date endDate, @RequestParam Boolean isTest) {
		try {
//			taskService.signInTask();
		    createSignIn(startDate, endDate, isTest);
//		    createSignIns(startDate, endDate);
			return ResponseEntity.ok().build();
		} catch (Exception e) {
		    e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}
	
	@Transactional
    public boolean createSignIns(Date startDate, Date endDate) {
        Set<SignInCopy> allSignCopyInList = signInCopyMapper.getAllDataList(startDate, endDate);
        HashSet<SignIn> allSignInList = signInMapper.getAllDataList(startDate, endDate);
        Set<SignIn> temp = new HashSet<>();
        SignIn sign = null;
        for (SignInCopy s : allSignCopyInList) {
//            if (s.getSportType() == 1) {
                sign = new SignIn();
                sign.setStudentId(s.getStudentId());
                sign.setSignInTime(s.getSignInTime());
                sign.setActivityId(s.getActivityId());
                sign.setId(s.getId());
                sign.setSportType(s.getSportType());
                sign.setName(s.getName());
                sign.setUniversityId(s.getUniversityId());
                temp.add(sign);
//            }
        }
        
        logger.info("before:signIn " + allSignInList.size() + "- signInCopy " + allSignCopyInList.size());
        logger.info("signIn " + allSignInList.size() + "- different " + temp.size());
        boolean b = temp.removeAll(allSignInList);
//        allSignInList.removeAll(temp);
        logger.info("after:signIn " + allSignInList.size() + "- different " + temp.size());
//        logger.info(allSignInList);
        logger.info(temp);
        
        return true;
	}
	
    @Transactional
    public boolean createSignIn(Date startDate, Date endDate, boolean isTest) {
        logger.info("startDate: " + startDate);
        logger.info("endDate: " + endDate);
        logger.info("sign in statistic is starting......");
        
        if (isTest) {
          Set<SignInCopy> list = signInCopyMapper.getAllSignInDataList(startDate, endDate);
          Set<SignInCopy> allSignInList = signInCopyMapper.getAllDataList(startDate, endDate);
          
          logger.info("before: " + list.size() + "-" + allSignInList.size());
          boolean b = list.removeAll(allSignInList);
          logger.info("after: " + list.size());
          
          int count = 0;
          logger.info("sign in statistic job list size: " + list.size());
          for (SignInCopy signIn : list) {
              logger.info("counter: " + ++count);
              try {
                  signInCopyMapper.insert(signIn);
              } catch (Exception e) {
                  logger.error(e);
              }
          }
        } else {
//          List<SignIn> list = signInMapper.getSignInDataList(startDate, endDate);
          Set<SignIn> list = signInMapper.getAllSignInDataList(startDate, endDate);
          Set<SignIn> allSignInList = signInMapper.getAllDataList(startDate, endDate);
          
          logger.info("before: " + list.size() + "-" + allSignInList.size());
          boolean b = list.removeAll(allSignInList);
          logger.info("after: " + list.size());
          
          int count = 0;
          logger.info("sign in statistic job list size: " + list.size());
//          logger.info(list);
          for (SignIn signIn : list) {
              logger.info("counter: " + ++count);
              try {
                  signInMapper.insert(signIn);
              } catch (Exception e) {
                  logger.error(e);
              }
          }
        }
        
        return true;
    }
	
	@ApiOperation(value = "调用跑步运动的统计任务", notes = "调用跑步运动的统计任务")
    @RequestMapping(value="/runningActivityDataStatisticTask", method = RequestMethod.GET)
    public ResponseEntity<?> runningActivityDataStatistic(@ApiParam("活动开始时间") @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd")  Date startDate,
            @ApiParam("活动结束时间") @RequestParam(required = false)  @DateTimeFormat(pattern="yyyy-MM-dd") Date endDate) {
        
        if (startDate == null) {
            DateTime yesterday = new DateTime().withMillisOfDay(0).minusDays(1);
            startDate = yesterday.toDate();
        }
        
        if (endDate == null) {
            DateTime now = new DateTime();
            endDate = now.withTimeAtStartOfDay().toDate();
        }
        
        try {
            taskService.runningActivityDataStatisticTask(startDate, endDate);
            return ResponseEntity.ok().build();
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
	
	@ApiOperation(value = "调用跑步运动的统计任务", notes = "调用跑步运动的统计任务")
    @RequestMapping(value="/areaActivityDataStatisticTask", method = RequestMethod.GET)
    public ResponseEntity<?> areaActivityDataStatistic(@ApiParam("活动开始时间") @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd")  Date startDate,
            @ApiParam("活动结束时间") @RequestParam(required = false)  @DateTimeFormat(pattern="yyyy-MM-dd") Date endDate) {
        
        if (startDate == null) {
            DateTime yesterday = new DateTime().withMillisOfDay(0).minusDays(1);
            startDate = yesterday.toDate();
        }
        
        if (endDate == null) {
            DateTime now = new DateTime();
            endDate = now.withTimeAtStartOfDay().toDate();
        }
        
        try {
            taskService.areaActivityDataStatisticTask(startDate, endDate);
            return ResponseEntity.ok().build();
        } catch (Exception e) {
            logger.error(e);
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
	
	@ApiOperation(value = "调用跑步运动的统计任务", notes = "调用跑步运动的统计任务")
    @RequestMapping(value="/runningActivityDataCollectionTask", method = RequestMethod.GET)
    public ResponseEntity<?> runningActivityDataCollection(@ApiParam("活动开始时间") @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd")  Date startDate,
            @ApiParam("活动结束时间") @RequestParam(required = false)  @DateTimeFormat(pattern="yyyy-MM-dd") Date endDate) {
        
        if (startDate == null) {
            DateTime yesterday = new DateTime().withMillisOfDay(0).minusDays(1);
            startDate = yesterday.toDate();
        }
        
        if (endDate == null) {
            DateTime now = new DateTime();
            endDate = now.withTimeAtStartOfDay().toDate();
        }
        
        try {
            taskService.runningActivityDataCollectionTask(startDate, endDate);
            return ResponseEntity.ok().build();
        } catch (Exception e) {
            logger.error(e);
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
	
	
	// 热量统计
    @RequestMapping(value="/consume", method = RequestMethod.POST)
    public ResponseEntity<?> consume(@ApiParam("活动开始时间") @RequestParam @DateTimeFormat(pattern="yyyy-MM-dd")  Date startDate,
            @ApiParam("活动结束时间") @RequestParam  @DateTimeFormat(pattern="yyyy-MM-dd") Date endDate, @RequestParam Boolean isTest) {
        try {
//	          taskService.signInTask();
            createConsume(startDate, endDate, isTest);
//	          createSignIns(startDate, endDate);
            return ResponseEntity.ok().build();
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    private boolean createConsume(Date startDate, Date endDate, Boolean isTest) {
        logger.info("startDate: " + startDate);
        logger.info("endDate: " + endDate);
        logger.info("consume statistic is starting......");
        
        List<Class> classes = classMappper.selectByExample(null);
        List<Major> majors = majorMapper.selectByExample(null);
        List<College> colleges = collegeMappper.selectByExample(null);
        Class classInfo = null;
        Major majorInfo = null;
        College collegeInfo = null;
        Set<StudentSportConsumeStatistic> list = studentSportConsumeStatisticMapper.getStudentSportConsumeStatisticListAll(startDate, endDate);
        Set<StudentSportConsumeStatistic> allSignInList = studentSportConsumeStatisticMapper.getAllDataList(startDate, endDate);
        
        logger.info("before: " + list.size() + "-" + allSignInList.size());
        boolean b = list.removeAll(allSignInList);
        logger.info("after: " + list.size());
      
          int count = 0;
          logger.info("consume statistic job list size: " + list.size());
          for (StudentSportConsumeStatistic studentSportConsumeStatistic : list) {
              
              try {
                  
                  studentSportConsumeStatisticMapper.insert(studentSportConsumeStatistic);
                  
                  logger.info("consume counter: " + ++count);
              } catch (Exception e) {
                  logger.error(e);
              }
          }
        
        return true;
    }
    
	// 热量排行统计
    @RequestMapping(value="/consumeRank", method = RequestMethod.POST)
    public ResponseEntity<?> consumeRank(
//    			@ApiParam("活动开始时间") @RequestParam @DateTimeFormat(pattern="yyyy-MM-dd")  Date startDate,
//            @ApiParam("活动结束时间") @RequestParam @DateTimeFormat(pattern="yyyy-MM-dd") Date endDate, 
            @ApiParam("大学ID") @RequestParam Long universityID, 
            @RequestParam Boolean isTest) {
        try {
	        taskService.consumeRankTask(universityID);
//            createConsume(startDate, endDate, isTest);
            return ResponseEntity.ok().build();
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
    
	
    @RequestMapping(value="/finishLongTimeRunningActivityTask", method = RequestMethod.POST)
    public ResponseEntity<?> finishLongTimeRunningActivityTask(
            @RequestParam Boolean isTest) {
        try {
	        taskService.finishLongTimeRunningActivityTask();
//            createConsume(startDate, endDate, isTest);
            return ResponseEntity.ok().build();
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
    
    public static void main(String[] args) {
        System.out.println(new DateTime("2017-12-21").toDate());
        if (new DateTime("2017-12-21").toDate() == new DateTime("2017-12-21").toDate()) {
            System.out.println(new DateTime("2017-12-21").toDate());
        }
        StudentSportConsumeStatistic s1 = new StudentSportConsumeStatistic();
        s1.setStudentNo("123456");
        s1.setSportDate(new DateTime("2017-12-21").toDate());
        
        StudentSportConsumeStatistic s2 = new StudentSportConsumeStatistic();
        s2.setStudentNo("123456");
        s2.setSportDate(new DateTime("2017-12-21").toDate());
        
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
//        if (s1 == s2) {
//            System.out.println("haha");
//        }
        
        if (s1.equals(s2)) {
            System.out.println("haha");
        }
    }
}
