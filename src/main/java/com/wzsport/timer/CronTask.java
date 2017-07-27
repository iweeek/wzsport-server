package com.wzsport.timer;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;


@Component
public class CronTask {
	@Autowired
	RunningActivityDataMapper runningActivityDataMapper;
	@Autowired
	RunningActivityMapper runningActivityMapper;
	@Autowired
	RunningActivityService runningActivityService;
	
	private static final Logger logger = LoggerFactory.getLogger(FixLocationOutdoorSportPointsController.class);
	
    @Scheduled(cron = "0 0 1 * * ?")  
    public void job() {  

    } 
}