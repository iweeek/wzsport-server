package com.wzsport.service;

import java.util.List;

import com.wzsport.model.AndroidVersionInfo;
import com.wzsport.util.ResponseBody;

public interface AndroidVersionInfoService {

	AndroidVersionInfo getLatestVersionInfo();

	int create(AndroidVersionInfo info, ResponseBody resBody);

	int update(AndroidVersionInfo info, ResponseBody resBody);

	int index(List<AndroidVersionInfo> list, ResponseBody resBody);

}
