package com.wzsport.service;

import com.wzsport.model.RunningActivityData;

public interface RunningActivityDataService {

	/**
	* 提交运动采集数据
	*/
	RunningActivityData create(RunningActivityData runningActivityData);
}
