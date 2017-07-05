package com.wzsport.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wzsport.mapper.AndroidVersionInfoMapper;
import com.wzsport.model.AndroidVersionInfo;
import com.wzsport.service.AndroidVersionInfoService;

@Service
public class AndroidVersionInfoServiceImpl implements AndroidVersionInfoService {

	@Autowired
	private AndroidVersionInfoMapper androidVersionInfoMapper;
	
	@Override
	public AndroidVersionInfo getLatestVersionInfo() {
		return androidVersionInfoMapper.getLasetVersionInfo();
	}

}
