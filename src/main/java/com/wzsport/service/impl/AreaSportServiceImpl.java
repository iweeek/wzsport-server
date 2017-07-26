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
import com.wzsport.util.ResponseBody;

/**
 * RunningActivity Service 实现类.
 *
 * @author x1ny
 * @date 2017年5月26日
 */
@Service
public class AreaSportServiceImpl implements AreaSportService {
	private static final Logger logger = LoggerFactory.getLogger(AreaSportServiceImpl.class);
	public String MSG_TEMPLATE_NAME_EXIST = "已经存在使用‘%s’这个名字的运动";
	public String MSG_TEMPLATE_OPERATION_OK = "记录提交成功";
	public String MSG_TEMPLATE_NOT_FIND_SPORT_BY_ID = "没有找到id是‘%s’的运动";
	public String MSG_TEMPLATE_NOT_FIND_SPORT = "没有找到运动";
	String logMsg = "";

	@Autowired
	private AreaSportMapper areaSportMapper;

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public void create(AreaSport sport, ResponseBody respBody) {
		AreaSportExample example = new AreaSportExample();
		example.createCriteria().andNameEqualTo(sport.getName());
		List<AreaSport> list = areaSportMapper.selectByExample(example);
		if (list.size() > 0) {
			logMsg = MSG_TEMPLATE_NAME_EXIST.replace("%s", sport.getName());
			logger.error(logMsg);
			sport.setId(list.get(0).getId());
			respBody.obj = sport;
			respBody.status = HttpServletResponse.SC_CONFLICT;
			respBody.statusMsg = logMsg; 
		} else {
			areaSportMapper.insert(sport);
			logMsg = MSG_TEMPLATE_OPERATION_OK;
			logger.info(logMsg);
			respBody.obj = sport;
			respBody.status = HttpServletResponse.SC_OK;
			respBody.statusMsg = logMsg; 
		}
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public void update(AreaSport sport, ResponseBody respBody) {
		AreaSportExample example = new AreaSportExample();
		example.createCriteria().andNameEqualTo(sport.getName()).andIdNotEqualTo(sport.getId());
		List<AreaSport> list = areaSportMapper.selectByExample(example);
		if (list.size() > 0) {
			logMsg = MSG_TEMPLATE_NAME_EXIST.replace("%s", sport.getName());
			logger.error(logMsg);
			respBody.obj = sport;
			respBody.status = HttpServletResponse.SC_CONFLICT;
			respBody.statusMsg = logMsg; 
		} else {
			example.createCriteria().andIdEqualTo(sport.getId());
			list = areaSportMapper.selectByExample(example);
			if (list.size() > 0) {
				areaSportMapper.updateByPrimaryKey(sport);
				logMsg = MSG_TEMPLATE_OPERATION_OK;
				logger.info(logMsg);
				respBody.obj = sport;
				respBody.status = HttpServletResponse.SC_OK;
				respBody.statusMsg = logMsg; 
			} else {
				logMsg = MSG_TEMPLATE_NOT_FIND_SPORT_BY_ID.replace("%s", String.valueOf(sport.getId()));
				logger.error(logMsg);
				respBody.obj = null;
				respBody.status = HttpServletResponse.SC_NOT_FOUND;
				respBody.statusMsg = logMsg;
			}
		}
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public void show(AreaSport sport, ResponseBody respBody) {
		AreaSportExample example = new AreaSportExample();
		example.createCriteria().andIdEqualTo(sport.getId());
		List<AreaSport> list = areaSportMapper.selectByExample(example);
		if (list.size() > 0) {
			sport.setAcquisitionInterval(list.get(0).getAcquisitionInterval());
			sport.setIsEnable(list.get(0).getIsEnable());
			sport.setName(list.get(0).getName());
			sport.setQualifiedCostTime(list.get(0).getQualifiedCostTime());
			sport.setUniversityId(list.get(0).getUniversityId());
			sport.setAddr(list.get(0).getAddr());
			sport.setType(list.get(0).getType());
			logMsg = MSG_TEMPLATE_OPERATION_OK;
			logger.info(logMsg);
			respBody.obj = sport;
			respBody.status = HttpServletResponse.SC_OK;
			respBody.statusMsg = logMsg; 
		} else {
			logMsg = MSG_TEMPLATE_NOT_FIND_SPORT_BY_ID.replace("%s", String.valueOf(sport.getId()));
			logger.error(logMsg);
			respBody.obj = null;
			respBody.status = HttpServletResponse.SC_NOT_FOUND;
			respBody.statusMsg = logMsg;
		}
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public void index(List<AreaSport> areaList, ResponseBody resBody) {
		AreaSportExample example = new AreaSportExample();
		example.createCriteria().andIdNotEqualTo(0l);
		List<AreaSport> list = areaSportMapper.selectByExample(example);
		if (list.size() > 0) {
			areaList.addAll(list);
			logMsg = "MSG_TEMPLATE_OPERATION_OK";
			logger.info(logMsg);
			resBody.obj = areaList;
			resBody.status = HttpServletResponse.SC_OK;
			resBody.statusMsg = logMsg;
		} else {
			logMsg = MSG_TEMPLATE_NOT_FIND_SPORT;
			logger.error(logMsg);
			resBody.obj = null;
			resBody.status = HttpServletResponse.SC_NOT_FOUND;
			resBody.statusMsg = logMsg;
		}
	}

}
