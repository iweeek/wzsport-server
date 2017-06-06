package com.wzsport.service;

/**
* RunningProject service interface.
* 
* @author x1ny
* @date 2017年5月25日
*/
public interface RunningProjectService {

	/**
	* 修改指定id的项目指标
	* 
	* @param id
	* @param qualifiedDistance 合格距离
	* @param qualifiedCostTime 合格时间
	* @param minCostTime 最少耗时
	*/
	boolean updateIndex(long id, int qualifiedDistance, int qualifiedCostTime, int minCostTime);
	
	/**
	* 更改指定id的项目的启动状态
	* 
	* @param id
	* @param enabled
	*/
	boolean updateEnable(long id, boolean enabled);
}
