package com.wzsport.service.impl;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wzsport.mapper.FixLocationOutdoorSportPointMapper;
import com.wzsport.model.FixLocationOutdoorSportPoint;
import com.wzsport.model.FixLocationOutdoorSportPointExample;
import com.wzsport.service.FixLocationOutdoorSportPointService;

/**
 * RunningActivity Service 实现类.
 *
 * @author x1ny
 * @date 2017年5月26日
 */
@Service
public class FixLocationOutdoorSportPointServiceImpl implements FixLocationOutdoorSportPointService {

	private static final Logger logger = LoggerFactory.getLogger(FixLocationOutdoorSportPointServiceImpl.class);
	
	private String logMsg = "";
	@Autowired
	private FixLocationOutdoorSportPointMapper fixLocationOutdoorSportPointMapper;

	@Override
	public int create(FixLocationOutdoorSportPoint fixLocationOutdoorSportPoint) {
		//判断数据是否重复
		FixLocationOutdoorSportPointExample example = new FixLocationOutdoorSportPointExample();
		example.createCriteria().andNameEqualTo(fixLocationOutdoorSportPoint.getName());
		List<FixLocationOutdoorSportPoint> sameRecordList = fixLocationOutdoorSportPointMapper.selectByExample(example);
		if (sameRecordList.size() != 0) {
			logMsg = "重复提交记录，point: " + fixLocationOutdoorSportPoint;
			logger.info(logMsg);
			fixLocationOutdoorSportPoint.setId(sameRecordList.get(0).getId());
			return HttpServletResponse.SC_CONFLICT;
		} else {
			fixLocationOutdoorSportPointMapper.insert(fixLocationOutdoorSportPoint);
			return HttpServletResponse.SC_CREATED;
		}
	}

	@Override
	public int show(FixLocationOutdoorSportPoint fixLocationOutdoorSportPoint) {
		FixLocationOutdoorSportPointExample example = new FixLocationOutdoorSportPointExample();
		example.createCriteria().andIdEqualTo(fixLocationOutdoorSportPoint.getId());
		List<FixLocationOutdoorSportPoint> list = fixLocationOutdoorSportPointMapper.selectByExample(example);
		if (list.size() > 0) {
			fixLocationOutdoorSportPoint.setId(list.get(0).getId());
			fixLocationOutdoorSportPoint.setLatitude(list.get(0).getLatitude());
			fixLocationOutdoorSportPoint.setLongitude(list.get(0).getLongitude());
			fixLocationOutdoorSportPoint.setRadius(list.get(0).getRadius());
			fixLocationOutdoorSportPoint.setUniversityId(list.get(0).getUniversityId());
			fixLocationOutdoorSportPoint.setDescription(list.get(0).getDescription());
			return HttpServletResponse.SC_OK;
		} else {
			return HttpServletResponse.SC_NOT_FOUND;
		}
	}

	@Override
	public int update(FixLocationOutdoorSportPoint fixLocationOutdoorSportPoint) {
		FixLocationOutdoorSportPointExample example = new FixLocationOutdoorSportPointExample();
		example.createCriteria().andNameEqualTo(fixLocationOutdoorSportPoint.getName());
		List<FixLocationOutdoorSportPoint> list = fixLocationOutdoorSportPointMapper.selectByExample(example);
		if (list.size() > 0) {
			fixLocationOutdoorSportPointMapper.updateByPrimaryKey(fixLocationOutdoorSportPoint);
			return HttpServletResponse.SC_OK;
		} else {
			return HttpServletResponse.SC_NOT_FOUND;
		}
		
	}

	@Override
	public int index(List<FixLocationOutdoorSportPoint> pointList) {
		FixLocationOutdoorSportPointExample example = new FixLocationOutdoorSportPointExample();
		example.createCriteria().andIdNotEqualTo(0l);
		List<FixLocationOutdoorSportPoint> list = fixLocationOutdoorSportPointMapper.selectByExample(example);
		if (list.size() > 0) {
			pointList.addAll(list);
			return HttpServletResponse.SC_OK;
		} else {
			return HttpServletResponse.SC_NOT_FOUND;
		}
	}
}
