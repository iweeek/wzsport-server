package com.wzsport.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wzsport.mapper.RunningActivityDataMapper;
import com.wzsport.mapper.StudentMapper;
import com.wzsport.mapper.UserMapper;
import com.wzsport.model.RunningActivityData;
import com.wzsport.model.RunningActivityDataExample;
import com.wzsport.model.Student;
import com.wzsport.model.StudentExample;
import com.wzsport.model.User;
import com.wzsport.service.ExportService;
import com.wzsport.service.TokenService;
import com.wzsport.util.ResponseBody;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

/**
 * token资源的restful控制器
 * 
 * @author x1ny
 * @date 2017年5月22日
 */
@Api(tags = "Token相关接口")
@RestController
@RequestMapping(value = "/tokens", produces = "application/json;charset=UTF-8")
public class TokenController {

	// private int status = 0;

	@Autowired
	private TokenService tokenService;

	@Autowired
	private RunningActivityDataMapper runningActivityDataMapper;
	
	@Autowired
	private ExportService exportService;

	@Autowired
	private UserMapper userMapper;

	@Autowired
	private StudentMapper studentMapper;

	/**
	 * 验证username和password，创建token
	 * 
	 * @param username
	 *            用户名
	 * @param password
	 *            密码
	 * @param expiredHour
	 *            过期时间(小时)
	 */
	@SuppressWarnings("rawtypes")
	@ApiOperation(value = "创建token", notes = "验证用户名与密码，为用户创建一个用于鉴权的Token")
	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<?> create(@ApiParam("学校Id") @RequestParam long universityId,
			@ApiParam("用户名") @RequestParam String username, @ApiParam("密码") @RequestParam String password,
			@ApiParam("设备Id") @RequestParam String deviceId,
			@ApiParam("有效时间(单位:小时)，不填则默认为1") @RequestParam(required = false, defaultValue = "1") Integer expiredHour,
			@RequestHeader("User-Agent") String userAgent) {
		System.out.println(userAgent);

		ResponseBody resBody = new ResponseBody();
		int status = tokenService.create(universityId, username, password, expiredHour, deviceId, userAgent, resBody);

		return ResponseEntity.status(status).body(resBody);
	}

	@ApiOperation(value = "创建token", notes = "验证用户名与密码，为用户创建一个用于鉴权的Token")
	@RequestMapping(value = "/doSomething", method = RequestMethod.POST)
	public ResponseEntity<?> doSomething() {

		System.out.println("begin");
		// for (int i = 1; i <= 50; i++) {
		// User user = new User();
		// user.setUsername("test" + i);
		// user.setPassword("e10adc3949ba59abbe56e057f20f883e");
		// user.setUniversityId(1l);
		// user.setUserType((byte)1);
		// user.setLatestToken("");
		// user.setAvatarUrl("");
		// user.setOpenId("");
		// userMapper.insert(user);
		// System.out.println("count: " + i);
		// }
		int j = 1;
		for (int i = 37183; i < 37233; i++) {
			Student student = new Student();
			student.setUserId(Long.valueOf(i));
			student.setClassId(0l);
			student.setUniversityId(1l);
			student.setStudentNo("test" + j);
			student.setMan(true);
			student.setName("test" + j);

			studentMapper.insert(student);
			System.out.println("count: " + j);
			j++;
		}
		System.out.println("end");

		return ResponseEntity.status(1).body(null);
	}

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
//		example.createCriteria().andActivityIdEqualTo(175755l);
		List<RunningActivityData> list = runningActivityDataMapper.selectByAVGPosition(startDate, endDate);
		if (list != null) {
			for (RunningActivityData data : list) {
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
