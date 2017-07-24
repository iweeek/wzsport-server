package com.wzsport.service.impl;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wzsport.mapper.AreaSportMapper;
import com.wzsport.model.AreaSport;
import com.wzsport.model.AreaSportExample;
import com.wzsport.service.AreaSportService;

/**
 * RunningActivity Service 实现类.
 *
 * @author x1ny
 * @date 2017年5月26日
 */
@Service
public class AreaSportServiceImpl implements AreaSportService {
	private static final Logger logger = LoggerFactory.getLogger(AreaSportServiceImpl.class);
	String logMsg = "";

	@Autowired
	private AreaSportMapper areaSportMapper;

	@Override
	public int create(AreaSport sport) {
		AreaSportExample example = new AreaSportExample();
		example.createCriteria().andNameEqualTo(sport.getName());
		List<AreaSport> list = areaSportMapper.selectByExample(example);
		if (list.size() > 0) {
			logMsg = "重复提交记录，point: " + sport;
			logger.info(logMsg);
			sport.setId(list.get(0).getId());
			return HttpServletResponse.SC_CONFLICT;
		} else {
			areaSportMapper.insert(sport);
			return HttpServletResponse.SC_OK;
		}
	}

	@Override
	public int update(AreaSport sport) {
		AreaSportExample example = new AreaSportExample();
		example.createCriteria().andNameEqualTo(sport.getName());
		List<AreaSport> list = areaSportMapper.selectByExample(example);
		if (list.size() > 0) {
			areaSportMapper.updateByPrimaryKey(sport);
			return HttpServletResponse.SC_OK;
		} else {
			return HttpServletResponse.SC_NOT_FOUND;
		}
	}

	@Override
	public int show(AreaSport sport) {
		AreaSportExample example = new AreaSportExample();
		example.createCriteria().andIdEqualTo(sport.getId());
		List<AreaSport> list = areaSportMapper.selectByExample(example);
		if (list.size() > 0) {
			sport.setAcquisitionInterval(list.get(0).getAcquisitionInterval());
			sport.setIsEnable(list.get(0).getIsEnable());
			sport.setName(list.get(0).getName());
			sport.setQualifiedCostTime(list.get(0).getQualifiedCostTime());
			sport.setUniversityId(list.get(0).getUniversityId());
			return HttpServletResponse.SC_OK;
		} else {
			return HttpServletResponse.SC_NOT_FOUND;
		}
	}

	@Override
	public int index(List<AreaSport> areaList) {
		AreaSportExample example = new AreaSportExample();
		example.createCriteria().andIdNotEqualTo(0l);
		List<AreaSport> list = areaSportMapper.selectByExample(example);
		if (list.size() > 0) {
			areaList.addAll(list);
			return HttpServletResponse.SC_OK;
		} else {
			return HttpServletResponse.SC_NOT_FOUND;
		}
	}

}
