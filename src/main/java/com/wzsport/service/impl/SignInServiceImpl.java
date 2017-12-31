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

import com.wzsport.mapper.SignInMapper;
import com.wzsport.model.SignIn;
import com.wzsport.model.SignInAnother;
import com.wzsport.model.SignInExample;
import com.wzsport.service.SignInService;

@Service
public class SignInServiceImpl implements SignInService {
	@Autowired
	SignInMapper signInMapper;

	private static final Logger logger = LogManager.getLogger(SignInServiceImpl.class);

	@Override
	@Transactional
	public boolean create() {
		// 第一步，取昨天的记录
		DateTime yesterday = new DateTime().withMillisOfDay(0).minusDays(1);
		Date startDate = yesterday.toDate();
		
		DateTime now = new DateTime();
		Date endDate = now.withTimeAtStartOfDay().toDate();
		
		System.out.println("startDate: " + startDate);
		System.out.println("endDate: " + endDate);
	

		logger.info("sign in statistic is starting......");
		
		Set<SignIn> list = signInMapper.getAllSignInDataList(startDate, endDate);
        Set<SignIn> allSignInList = signInMapper.getAllDataList(startDate, endDate);
        
        logger.info("before: " + list.size() + "-" + allSignInList.size());
        boolean b = list.removeAll(allSignInList);
        logger.info("after: " + list.size());
        
        int count = 0;
        logger.info("sign in statistic job list size: " + list.size());
        for (SignIn signIn : list) {
            logger.info("counter: " + ++count);
            try {
                signInMapper.insert(signIn);
            } catch (Exception e) {
                logger.error(e);
            }
        }

		return true;
	}
	
	public static void main(String[] args) {
	 // 第一步，取昨天的记录
        DateTime yesterday = new DateTime();
        DateTime withMillisOfDay = yesterday.withMillisOfDay(0);
        System.out.println(withMillisOfDay.toDate());
        
        Calendar calFirst = Calendar.getInstance();
        System.out.println(calFirst.getTime());
        
    }
}
