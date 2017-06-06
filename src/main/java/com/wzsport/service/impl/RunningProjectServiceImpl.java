package com.wzsport.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wzsport.mapper.RunningProjectMapper;
import com.wzsport.model.RunningProject;
import com.wzsport.service.RunningProjectService;

@Service
public class RunningProjectServiceImpl implements RunningProjectService {

	@Autowired
	private RunningProjectMapper runningProjectMapper;
	
	
	/* (non-Javadoc)
	 * @see com.wzsport.service.RunningProjectService#updateIndex(long, int, int, int)
	 */
	@Override
	public boolean updateIndex(long id, int qualifiedDistance, int qualifiedCostTime, int minCostTime) {
		RunningProject runningProject = new RunningProject();
		runningProject.setId(id);
		runningProject.setQualifiedCostTime(qualifiedCostTime);
		runningProject.setQualifiedDistance(qualifiedDistance);
		
		int affectedCount = runningProjectMapper.updateByPrimaryKeySelective(runningProject);
		if(affectedCount > 0) {
			return true;
		}
		
		return false;
	}

	/* (non-Javadoc)
	 * @see com.wzsport.service.RunningProjectService#updateEnable(long, boolean)
	 */
	@Override
	public boolean updateEnable(long id, boolean enabled) {
		RunningProject runningProject = new RunningProject();
		runningProject.setId(id);
		runningProject.setEnabled(enabled);
		
		int affectedCount = runningProjectMapper.updateByPrimaryKeySelective(runningProject);
		if(affectedCount > 0) {
			return true;
		}
		
		return false;
	}
}
