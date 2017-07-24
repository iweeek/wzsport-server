package com.wzsport.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wzsport.mapper.RunningSportMapper;
import com.wzsport.model.RunningSport;
import com.wzsport.service.RunningSportService;

@Service
public class RunningProjectServiceImpl implements RunningSportService {

	@Autowired
	private RunningSportMapper runningSportMapper;
	
	
	/* (non-Javadoc)
	 * @see com.wzsport.service.RunningProjectService#updateIndex(long, int, int, int)
	 */
	@Override
	public boolean updateIndex(long id, int qualifiedDistance, int qualifiedCostTime, int minCostTime, int acquisitionInterval) {
		RunningSport runningSport = new RunningSport();
		runningSport.setId(id);
		runningSport.setQualifiedCostTime(qualifiedCostTime);
		runningSport.setQualifiedDistance(qualifiedDistance);
		runningSport.setAcquisitionInterval(acquisitionInterval);
		
		int affectedCount = runningSportMapper.updateByPrimaryKeySelective(runningSport);
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
		RunningSport runningSport = new RunningSport();
		runningSport.setId(id);
		runningSport.setEnabled(enabled);
		
		int affectedCount = runningSportMapper.updateByPrimaryKeySelective(runningSport);
		if(affectedCount > 0) {
			return true;
		}
		
		return false;
	}
}
