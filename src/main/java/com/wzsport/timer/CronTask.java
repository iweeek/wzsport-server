package com.wzsport.timer;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component; 

@Component
public class CronTask {
    @Scheduled(cron = "* * 1 * * ?")  
    public void job() {  
    	System.out.println(System.currentTimeMillis() + ": CronTask");
    } 
}
