package com.wzsport.service;


import com.wzsport.model.RunningActivity;
import com.wzsport.model.SportDataValidateRule;

public interface SportDataValidateService {

	boolean rapidValidateForRunningActivity(RunningActivity runningActivity);

	int create(SportDataValidateRule rule);

	int update(SportDataValidateRule rule);
	

}
