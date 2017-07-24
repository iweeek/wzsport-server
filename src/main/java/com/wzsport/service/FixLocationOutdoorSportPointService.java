package com.wzsport.service;

import java.util.List;

import com.wzsport.model.FixLocationOutdoorSportPoint;

public interface FixLocationOutdoorSportPointService {

	public int create(FixLocationOutdoorSportPoint point);

	public int show(FixLocationOutdoorSportPoint point);

	public int update(FixLocationOutdoorSportPoint point);

	public int index(List<FixLocationOutdoorSportPoint> list);

}
