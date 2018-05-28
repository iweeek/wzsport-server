package com.wzsport.timer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.wzsport.service.ConsumeRankService;
import com.wzsport.service.StudentSportConsumeStatisticService;

@Component
public class StudentSportConsumeStatisticTask {
	@Autowired
	private StudentSportConsumeStatisticService studentSportConsumeStatisticService;
	
	@Autowired
	private ConsumeRankService consumeRankService;
	
	

	@Scheduled(cron = "0 30 2 * * ?")
//	@Scheduled(cron = "*/5 * * * * ?")

    public void job() {
		studentSportConsumeStatisticService.create();
		consumeRankService.create(1);
		consumeRankService.create(2);
//		consumeRankService.create(3);
    }
}
