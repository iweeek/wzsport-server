package com.wzsport.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wzsport.model.AndroidVersionInfo;
import com.wzsport.model.AreaActivity;
import com.wzsport.service.AndroidVersionInfoService;
import com.wzsport.service.AreaActivityService;
import com.wzsport.util.ResponseBody;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

/**
* AreaActivity Controller.
* 
* @author x1ny
* @date 2017年5月26日
*/
@Api(tags = "AndroidVersion相关接口")
@RestController()
@RequestMapping(value = "/androidVersions",produces = "application/json;charset=UTF-8")
public class AndroidVersion {

	@Autowired
	private AndroidVersionInfoService androidVersionInfoService;
	
	/** The res body. */
	@SuppressWarnings("rawtypes")
	private ResponseBody resBody;
	
	private int status;
	
	/**
	* 创建AndroidVersion接口
	*/
	@ApiOperation(value = "创建AndroidVersion", notes = "创建一条新的安卓版本信息。")
	@RequestMapping(value = "", method = RequestMethod.POST)
	public ResponseEntity<?> create(
								@ApiParam("版本名称")
								@RequestParam String versionName,
								@ApiParam("版本号")
								@RequestParam Integer versionCode,
								@ApiParam("修改记录")
								@RequestParam String changeLog,
								@ApiParam("是否强制")
								@RequestParam Boolean isForced,
								@ApiParam("apk下载地址")
								@RequestParam String apkUrl)
								{
		AndroidVersionInfo info = new AndroidVersionInfo();
		info.setVersionName(versionName);
		info.setVersionCode(versionCode);
		info.setChangeLog(changeLog);
		info.setIsForced(isForced);
		info.setApkUrl(apkUrl);
		
		resBody = new ResponseBody<AreaActivity>();
		
		status = androidVersionInfoService.create(info, resBody);
		return ResponseEntity.status(status).body(resBody); 
	}
	
	/**
	* 
	*/
	@ApiOperation(value = "更新版本信息", notes = "更新版本信息")
	@RequestMapping(value = "/{id}", method = RequestMethod.POST)
	public ResponseEntity<?> update(
								@ApiParam("活动项目id")
								@PathVariable long id,
								@ApiParam("版本名称")
								@RequestParam(required=false) String versionName,
								@ApiParam("版本号")
								@RequestParam(required=false) Integer versionCode,
								@ApiParam("修改记录")
								@RequestParam(required=false) String changeLog,
								@ApiParam("是否强制")
								@RequestParam(required=false) Boolean isForced,
								@ApiParam("是否发布")
								@RequestParam(required=false) Boolean isPublished,
								@ApiParam("apk下载地址")
								@RequestParam(required=false) String apkUrl)
								{
		
		AndroidVersionInfo info = new AndroidVersionInfo();
		info.setId(id);
		
		if (versionName != null) {
			info.setVersionName(versionName);
		}
		
		if (versionCode != null) {
			info.setVersionCode(versionCode);
		}
		
		if (changeLog != null) {
			info.setChangeLog(changeLog);
		}
		
		if (isForced != null) {
			info.setIsForced(isForced);
		}
		
		if (isPublished != null) {
			info.setIsPublished(isPublished);
		}
		
		if (apkUrl != null) {
			info.setApkUrl(apkUrl);
		}
		
		resBody = new ResponseBody<AreaActivity>();
		
		status = androidVersionInfoService.update(info, resBody);
		
		return ResponseEntity.status(status).body(resBody); 
	}
	
	@ApiOperation(value = "获取版本信息列表", notes = "获取版本信息列表")
	@RequestMapping(value = "", method = RequestMethod.GET)
	public ResponseEntity<?> index() {
		List<AndroidVersionInfo> list = new ArrayList<AndroidVersionInfo>();
		
		resBody = new ResponseBody<List<AndroidVersionInfo>>();
		
		status = androidVersionInfoService.index(list, resBody);
		
		return ResponseEntity.status(status).body(resBody); 
	}
}
