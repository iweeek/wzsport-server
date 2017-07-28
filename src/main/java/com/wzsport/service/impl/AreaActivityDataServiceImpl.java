package com.wzsport.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wzsport.mapper.RunningActivityDataMapper;
import com.wzsport.model.RunningActivityData;
import com.wzsport.service.RunningActivityDataService;

@Service
public class AreaActivityDataServiceImpl implements RunningActivityDataService {

	@Autowired
	private RunningActivityDataMapper runningActivityDataMapper;
	
	/* (non-Javadoc)
	 * @see com.wzsport.service.RunningActivityDataService#create(com.wzsport.model.RunningActivityData)
	 */
	@Override
	public RunningActivityData create(RunningActivityData runningActivityData) {
		runningActivityDataMapper.insertSelective(runningActivityData);
		return runningActivityData;
	}
}
