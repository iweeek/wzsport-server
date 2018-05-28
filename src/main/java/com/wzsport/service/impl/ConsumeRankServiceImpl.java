package com.wzsport.service.impl;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Set;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wzsport.dto.StudentKcalConsumptionDTO;
import com.wzsport.dto.StudentTimeCostedDTO;
import com.wzsport.mapper.SignInMapper;
import com.wzsport.mapper.StudentConsumeRankMapper;
import com.wzsport.mapper.StudentTimecostedRankMapper;
import com.wzsport.mapper.UniversityMapper;
import com.wzsport.model.SignIn;
import com.wzsport.model.SignInAnother;
import com.wzsport.model.SignInExample;
import com.wzsport.model.StudentConsumeRank;
import com.wzsport.model.StudentTimecostedRank;
import com.wzsport.service.ConsumeRankService;
import com.wzsport.service.SignInService;

@Service
public class ConsumeRankServiceImpl implements ConsumeRankService {
	
	@Autowired
	StudentConsumeRankMapper studentConsumeRankMapper;
	
	@Autowired
	StudentTimecostedRankMapper studentTimecostedRankMapper;
	
	@Autowired
	UniversityMapper universityMapper;

	private static final Logger logger = LogManager.getLogger(ConsumeRankServiceImpl.class);

	@Override
	@Transactional
	public boolean create(long universityID) {
		// 第一步，取昨天的记录
		DateTime yesterday = new DateTime().withMillisOfDay(0).minusDays(1);
		Date startDate = yesterday.toDate();
		
		DateTime now = new DateTime();
		Date endDate = now.withTimeAtStartOfDay().toDate();
		
		System.out.println("startDate: " + startDate);
		System.out.println("endDate: " + endDate);
	

		logger.info("sign in statistic is starting......");
		
		List<StudentTimeCostedDTO> timeCostedRanking = universityMapper.getTimeCostedRanking(universityID);
		List<StudentKcalConsumptionDTO> kcalCostedRanking = universityMapper.getKcalCostedRanking(universityID);
		int count = 0;
		
		logger.info("timeCostedRanking：" + timeCostedRanking.size());
		logger.info("kcalCostedRanking: "+ kcalCostedRanking.size());
		
		StudentConsumeRank studentConsumeRank;
		for (StudentKcalConsumptionDTO kcalConsumptionDTO : kcalCostedRanking) {
			studentConsumeRank = new StudentConsumeRank();
			studentConsumeRank.setStudentId(kcalConsumptionDTO.getStudentId());
			studentConsumeRank.setKcalConsumed(kcalConsumptionDTO.getKcalConsumption());
			studentConsumeRank.setAvatarUrl(kcalConsumptionDTO.getAvatarUrl());
			studentConsumeRank.setStudentName(kcalConsumptionDTO.getStudentName());
			studentConsumeRank.setUniversityId(kcalConsumptionDTO.getUniversityId());
			studentConsumeRankMapper.insertSelective(studentConsumeRank);
			count++;
			System.out.println("count: " + count);
		}
		
		count = 0;
		StudentTimecostedRank studentTimecostedRank;
		for (StudentTimeCostedDTO timeCostedDTO : timeCostedRanking) {
			studentTimecostedRank = new StudentTimecostedRank();
			studentTimecostedRank.setStudentId(timeCostedDTO.getStudentId());
			studentTimecostedRank.setCostTime(timeCostedDTO.getTimeCosted());
			studentTimecostedRank.setAvatarUrl(timeCostedDTO.getAvatarUrl());
			studentTimecostedRank.setStudentName(timeCostedDTO.getStudentName());
			studentTimecostedRank.setUniversityId(timeCostedDTO.getUniversityId());
			studentTimecostedRankMapper.insertSelective(studentTimecostedRank);
			count++;
			System.out.println("count: " + count);
		}
        
//        int count = 0;
//        logger.info("sign in statistic job list size: " + list.size());
//        for (SignIn signIn : list) {
//            logger.info("counter: " + ++count);
//            try {
//                signInMapper.insert(signIn);
//            } catch (Exception e) {
//                logger.error(e);
//            }
//        }
		
		return true;
	}

}
