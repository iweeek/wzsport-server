package com.wzsport.service.impl;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wzsport.mapper.AndroidVersionInfoMapper;
import com.wzsport.model.AndroidVersionInfo;
import com.wzsport.model.AndroidVersionInfoExample;
import com.wzsport.service.AndroidVersionInfoService;
import com.wzsport.util.ResponseBody;
import com.wzsport.util.RetMsgTemplate;

@Service
public class AndroidVersionInfoServiceImpl implements AndroidVersionInfoService {
	
	private static final Logger logger = LoggerFactory.getLogger(AndroidVersionInfoServiceImpl.class);
	
	String logMsg = "";

	@Autowired
	private AndroidVersionInfoMapper androidVersionInfoMapper;
	
	@Override
	public AndroidVersionInfo getLatestVersionInfo() {
		return androidVersionInfoMapper.getLasetVersionInfo();
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public int create(AndroidVersionInfo info, ResponseBody resBody) {
		int count = androidVersionInfoMapper.insertSelective(info);
		if (count > 0) {
			logMsg = RetMsgTemplate.MSG_TEMPLATE_OPERATION_OK;
			logger.info(logMsg);
			
			resBody.obj = info;
			resBody.statusMsg = logMsg;
			
			return HttpServletResponse.SC_CREATED;
		} else {
			//TODO 如何获得错误？
//			logMsg = RetMsgTemplate.MSG_TEMPLATE_OPERATION_OK;
//			logger.info(logMsg);
//			
//			resBody.obj = info;
//			resBody.statusMsg = logMsg;
//			
			return HttpServletResponse.SC_OK;
		}
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public int update(AndroidVersionInfo info, ResponseBody resBody) {
		int count = androidVersionInfoMapper.updateByPrimaryKeySelective(info);
		if (count > 0) {
			logMsg = RetMsgTemplate.MSG_TEMPLATE_OPERATION_OK;
			logger.info(logMsg);
			
			resBody.obj = info;
			resBody.statusMsg = logMsg;
			
			return HttpServletResponse.SC_OK;
		} else {
			logMsg = RetMsgTemplate.MSG_TEMPLATE_NOT_FIND_BY_ID;
			logger.info(logMsg);
			
			resBody.obj = info;
			resBody.statusMsg = logMsg;
			
			return HttpServletResponse.SC_NOT_FOUND;
		}
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public int index(List<AndroidVersionInfo> list, ResponseBody resBody) {
		AndroidVersionInfoExample example = new AndroidVersionInfoExample();
		example.createCriteria().andIdGreaterThan(0L);
		example.setOrderByClause("version_code desc");
		
		list = androidVersionInfoMapper.selectByExample(example);
		
		logMsg = RetMsgTemplate.MSG_TEMPLATE_OPERATION_OK;
		logger.info(logMsg);
		
		resBody.obj = list;
		resBody.statusMsg = logMsg;
		
		return HttpServletResponse.SC_OK;
	}

}
