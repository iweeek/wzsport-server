package com.wzsport.timer;

import java.util.Date;

import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.wzsport.service.StatisticTaskService;


@Component
public class RunningActivityTask {
	@Autowired
	private StatisticTaskService taskService;

	@Scheduled(cron = "0 0 1 * * ?")
    public void job() {
        DateTime yesterday = new DateTime().withMillisOfDay(0).minusDays(1);
        Date startDate = yesterday.toDate();
        
        DateTime now = new DateTime();
        Date endDate = now.withTimeAtStartOfDay().toDate();
	    
		taskService.runningActivityTask(startDate, endDate);
    }
}
