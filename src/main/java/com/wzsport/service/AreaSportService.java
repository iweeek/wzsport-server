package com.wzsport.service;

import java.util.List;

import com.wzsport.model.AreaSport;

/**
* AreaSport service interface.
* 
* @author x1ny
* @date 2017年5月26日
*/
public interface AreaSportService {

	int create(AreaSport sport);

	int update(AreaSport sport);

	int show(AreaSport sport);

	int index(List<AreaSport> list);
	
	
	
}
