package com.wzsport.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wzsport.mapper.DeviceMapper;
import com.wzsport.mapper.RunningActivityDataMapper;
import com.wzsport.mapper.StudentMapper;
import com.wzsport.mapper.UserMapper;
import com.wzsport.model.Device;
import com.wzsport.model.DeviceExample;
import com.wzsport.model.RunningActivityData;
import com.wzsport.model.RunningActivityDataExample;
import com.wzsport.model.Student;
import com.wzsport.model.StudentExample;
import com.wzsport.service.ExportService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiParam;

/**
 * 筛查记录
 * @author nijun
 * @date 2018年5月24日
 */
@Api(tags = "Token相关接口")
@RestController
@RequestMapping(value = "/screen", produces = "application/json;charset=UTF-8")
public class ScreeningController {
	

	@Autowired
	private RunningActivityDataMapper runningActivityDataMapper;
	
	@Autowired
	private ExportService exportService;

	@Autowired
	private UserMapper userMapper;
	
	@Autowired
	private StudentMapper studentMapper;
	
	@Autowired
	private DeviceMapper deviceMapper;
	
	
	/**
	 * 测量经纬度
	 */
	@RequestMapping(value = "/getAbnormalLocation", method = RequestMethod.POST)
	public ResponseEntity<?> getAbnormalLocation(@ApiParam("活动开始时间") @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd")  Date startDate,
	        @ApiParam("活动结束时间") @RequestParam(required = false)  @DateTimeFormat(pattern="yyyy-MM-dd") Date endDate) {

		List<Long> studentIds = new ArrayList<>();
		List<RunningActivityData> runningActivityDatas = new ArrayList<>();
		
		int count = 0;
		RunningActivityDataExample example = new RunningActivityDataExample();
		List<RunningActivityData> list = runningActivityDataMapper.selectByAVGPosition(startDate, endDate);
		if (list != null) {
			for (RunningActivityData data : list) {
				// 注释原因：这是地理位置判断的逻辑。
//				boolean inArea = isInArea(data.getLatitude(), data.getLongitude(),
//						27.181938, 28.695103, 121.204485, 119.495619);
//				if (!inArea) {
//					System.out.println(" inArea : " + data.getId());
//					studentIds.add(Long.valueOf(data.getStudentId()));
					runningActivityDatas.add(data);
					
//				}
				System.out.println("count: " + count++);
			}
		}
		
		if (runningActivityDatas.size() != 0) {
			exportService.createExcelByRunningActivityViews(runningActivityDatas);
		}

		return ResponseEntity.status(1).body(null);
	}
	
	/**
	 * 筛查首次登录与现在登录不同
	 */
	@RequestMapping(value = "/screenLoginInformation", method = RequestMethod.POST)
	public ResponseEntity<?> screenLoginInformation(@ApiParam("活动开始时间") @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd")  Date startDate,
	        @ApiParam("活动结束时间") @RequestParam(required = false)  @DateTimeFormat(pattern="yyyy-MM-dd") Date endDate) {

		List<Long> studentIds = new ArrayList<>();
		List<RunningActivityData> runningActivityDatas = new ArrayList<>();
		
		int count = 0;
		RunningActivityDataExample example = new RunningActivityDataExample();
		List<RunningActivityData> list = runningActivityDataMapper.selectByAVGPosition(startDate, endDate);
		if (list != null) {
			for (RunningActivityData data : list) {
				// 注释原因：这是地理位置判断的逻辑。
//				boolean inArea = isInArea(data.getLatitude(), data.getLongitude(),
//						27.181938, 28.695103, 121.204485, 119.495619);
//				if (!inArea) {
//					System.out.println(" inArea : " + data.getId());
					studentIds.add(Long.valueOf(data.getStudentId()));
//					runningActivityDatas.add(data);
					
//				}
				System.out.println("count: " + count++);
			}
		}
		
		StudentExample studentExample = new StudentExample();
		studentExample.createCriteria().andIdIn(studentIds);
		List<Student> students = studentMapper.selectByExample(studentExample);
		
		DeviceExample deviceExample = new DeviceExample();
		List<Device> devices = null;
		for (Student student : students) {
			deviceExample.createCriteria().andUserIdEqualTo(student.getUserId());
			devices = deviceMapper.selectByExample(deviceExample);
			if (devices.size() > 1) {
				String deviceId = devices.get(devices.size() - 1).getDeviceId();
				String deviceId2 = devices.get(0).getDeviceId();
				System.out.println("deviceId："+ deviceId);
				System.out.println("deviceId2："+ deviceId2);
				if (!devices.get(devices.size() - 1).getDeviceId().equals(devices.get(0).getDeviceId())) {
					System.out.println("device user : " + student.getId());
					System.out.println("---------------------------------------");
				}
			}
			deviceExample.clear();
		}
		
		if (runningActivityDatas.size() != 0) {
			exportService.createExcelByRunningActivityViews(runningActivityDatas);
		}

		return ResponseEntity.status(1).body(null);
	}

	/**
	 * 
	 * @param latitue
	 *            待测点的纬度
	 * @param longitude
	 *            待测点的经度
	 * @param areaLatitude1
	 *            纬度范围限制1
	 * @param areaLatitude2
	 *            纬度范围限制2
	 * @param areaLongitude1
	 *            经度限制范围1
	 * @param areaLongitude2
	 *            经度范围限制2
	 * @return
	 */
	public static boolean isInArea(double latitue, double longitude, double areaLatitude1, double areaLatitude2,
			double areaLongitude1, double areaLongitude2) {
		if (isInRange(latitue, areaLatitude1, areaLatitude2)) {// 如果在纬度的范围内
			if (areaLongitude1 * areaLongitude2 > 0) {// 如果都在东半球或者都在西半球
				if (isInRange(longitude, areaLongitude1, areaLongitude2)) {
					return true;
				} else {
					return false;
				}
			} else {// 如果一个在东半球，一个在西半球
				if (Math.abs(areaLongitude1) + Math.abs(areaLongitude2) < 180) {// 如果跨越0度经线在半圆的范围内
					if (isInRange(longitude, areaLongitude1, areaLongitude2)) {
						return true;
					} else {
						return false;
					}
				} else {// 如果跨越180度经线在半圆范围内
					double left = Math.max(areaLongitude1, areaLongitude2);// 东半球的经度范围left-180
					double right = Math.min(areaLongitude1, areaLongitude2);// 西半球的经度范围right-（-180）
					if (isInRange(longitude, left, 180) || isInRange(longitude, right, -180)) {
						return true;
					} else {
						return false;
					}
				}
			}
		} else {
			return false;
		}
	}

	public static boolean isInRange(double point, double left, double right) {
		if (point >= Math.min(left, right) && point <= Math.max(left, right)) {
			return true;
		} else {
			return false;
		}

	}
}
