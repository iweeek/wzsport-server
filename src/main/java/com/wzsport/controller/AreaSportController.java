package com.wzsport.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wzsport.model.AreaSport;
import com.wzsport.service.AreaSportService;
import com.wzsport.util.ResponseBody;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

/**
* AreaSport Controller.
* 
* @author x1ny
* @date 2017年5月25日
*/
@Api(tags = "定点区域运动相关接口")
@RestController
@RequestMapping(value="/areaSports",produces="application/json;charset=UTF-8")
public class AreaSportController {
	
	private int status = 0;
	
	/** The res body. */
	@SuppressWarnings("rawtypes")
	private ResponseBody resBody;

	/** The area sport service. */
	@Autowired
	private AreaSportService areaSportService;
	
	/**
	 * Creates the.
	 *
	 * @param name the name
	 * @param sampleNum the sample num
	 * @param isEnabled the is enable
	 * @param addr the addr
	 * @param type the type
	 * @param qualifiedCostTime the qualified cost time
	 * @param universityId the university id
	 * @return the area sport
	 */
	@ApiOperation(value = "创建一个定点运动项目", notes = "创建一个定点运动项目")
	@RequestMapping(value="",method = RequestMethod.POST) 
	public ResponseEntity<?> create(
							@ApiParam("项目名称")
							@RequestParam String name,
							@ApiParam("采样样本数，范围1-120")
							@RequestParam byte sampleNum,
							@ApiParam("是否生效")
							@RequestParam boolean isEnabled,
							@ApiParam("该项目达标的行动时间(单位：秒)")
							@RequestParam int qualifiedCostTime,
							@ApiParam("学校Id")
							@RequestParam long universityId
							) {
		AreaSport sport = new AreaSport();
		sport.setName(name);
		sport.setSampleNum(sampleNum);
		byte acquisitionInterval = (byte) (qualifiedCostTime / sampleNum);
		sport.setAcquisitionInterval(acquisitionInterval);
		sport.setIsEnabled(isEnabled);
		sport.setQualifiedCostTime(qualifiedCostTime);
		sport.setUniversityId(universityId);
		
		resBody = new ResponseBody<AreaSport>();
		status = areaSportService.create(sport, resBody);
		return ResponseEntity.status(status).body(resBody);
	}
	
	/**
	 * Update.
	 *
	 * @param id the id
	 * @param name the name
	 * @param sampleNum the sample num
	 * @param isEnabled the is enabled
	 * @param addr the addr
	 * @param type the type
	 * @param qualifiedCostTime the qualified cost time
	 * @param universityId the university id
	 * @param response the response
	 * @return the area sport
	 */
	@ApiOperation(value = "根据id来更新一个定点运动项目", notes = "根据id来更新一个定点运动项目")
	@RequestMapping(value="/{id}",method = RequestMethod.POST) 
	public ResponseEntity<?> update(
							@ApiParam("id")
							@PathVariable long id,
							@ApiParam("项目名称")
							@RequestParam String name,
							@ApiParam("采样样本数，范围1-120")
							@RequestParam byte sampleNum,
							@ApiParam("是否生效")
							@RequestParam boolean isEnabled,
							@ApiParam("该项目达标的行动时间(单位：秒)")
							@RequestParam int qualifiedCostTime,
							@ApiParam("学校Id")
							@RequestParam long universityId,
							HttpServletResponse response
							) {
		AreaSport sport = new AreaSport();
		sport.setId(id);
		sport.setName(name);
		sport.setSampleNum(sampleNum);
		byte acquisitionInterval = (byte) (qualifiedCostTime / sampleNum);
		sport.setAcquisitionInterval(acquisitionInterval);
		sport.setIsEnabled(isEnabled);
		sport.setQualifiedCostTime(qualifiedCostTime);
		sport.setUniversityId(universityId);
		sport.setHourlyKcalConsumption(200);
		resBody = new ResponseBody<AreaSport>();
		status = areaSportService.update(sport, resBody);
		return ResponseEntity.status(status).body(resBody);
	}
	
	/**
	 * Show.
	 *
	 * @param id the id
	 * @param response the response
	 * @return the area sport
	 */
	@ApiOperation(value = "根据id来获取定点运动项目", notes = "根据id来获取定点运动项目")
	@RequestMapping(value="/{id}",method = RequestMethod.GET) 
	public ResponseEntity<?> show(
							@ApiParam("项目id")
							@PathVariable long id,
							HttpServletResponse response
							) {
		AreaSport sport = new AreaSport();
		sport.setId(id);
		resBody = new ResponseBody<AreaSport>();
		status = areaSportService.show(sport, resBody);
		return ResponseEntity.status(status).body(resBody);
	}
	
	/**
	 * Index.
	 *
	 * @param response the response
	 * @return the list
	 */
	@ApiOperation(value = "获取定点运动项目列表", notes = "获取定点运动项目列表")
	@RequestMapping(value="",method = RequestMethod.GET) 
	public ResponseEntity<?> index(
							HttpServletResponse response
							) {
		List<AreaSport> list = new ArrayList<AreaSport>();
		resBody = new ResponseBody<AreaSport>();
		status = areaSportService.index(list, resBody);
		return ResponseEntity.status(status).body(resBody);
	}
	
}
