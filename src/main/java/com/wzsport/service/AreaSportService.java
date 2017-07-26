package com.wzsport.service;

import java.util.List;

import com.wzsport.model.AreaSport;
import com.wzsport.util.ResponseBody;

public interface AreaSportService {

	void create(AreaSport sport, ResponseBody resBody);

	void update(AreaSport sport, ResponseBody resBody);

	void show(AreaSport sport, ResponseBody resBody);

	void index(List<AreaSport> list, ResponseBody resBody);
	
	
	
}
