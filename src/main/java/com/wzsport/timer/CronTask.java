package com.wzsport.timer;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;


@Component
public class CronTask {

    @Scheduled(cron = "*/5 * * * * ?")  
    public void job() {  

    } 
}
