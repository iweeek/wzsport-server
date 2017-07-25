package com.wzsport.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wzsport.model.AreaSport;
import com.wzsport.service.AreaSportService;
import com.wzsport.service.RunningSportService;

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
@RequestMapping(value="/areaSport",produces="application/json;charset=UTF-8")
public class AreaSportController {

	/** The area sport service. */
	@Autowired
	private AreaSportService areaSportService;
	
	/**
	 * Creates the.
	 *
	 * @param name the name
	 * @param acquisitionInterval the acquisition interval
	 * @param isEnable the is enable
	 * @param qualifiedCostTime the qualified cost time
	 * @param universityId the university id
	 * @param response the response
	 * @return the area sport
	 */
	@ApiOperation(value = "创建一个定点运动项目", notes = "创建一个定点运动项目")
	@RequestMapping(value="/",method = RequestMethod.POST) 
	public AreaSport create(
							@ApiParam("项目名称")
							@RequestParam String name,
							@ApiParam("采样间隔")
							@RequestParam byte acquisitionInterval,
							@ApiParam("是否生效")
							@RequestParam boolean isEnable,
							@ApiParam("该项目达标的行动时间(单位：秒)")
							@RequestParam int qualifiedCostTime,
							@ApiParam("学校Id")
							@RequestParam int universityId,
							HttpServletResponse response
							) {
		AreaSport sport = new AreaSport(name, acquisitionInterval, isEnable, qualifiedCostTime, universityId);
		response.setStatus(areaSportService.create(sport));
		return sport;
	}
	
	/**
	 * Update.
	 *
	 * @param id the id
	 * @param name the name
	 * @param acquisitionInterval the acquisition interval
	 * @param isEnable the is enable
	 * @param qualifiedCostTime the qualified cost time
	 * @param universityId the university id
	 * @param response the response
	 * @return the area sport
	 */
	@ApiOperation(value = "根据id来更新一个定点运动项目", notes = "根据id来更新一个定点运动项目")
	@RequestMapping(value="/{id}",method = RequestMethod.POST) 
	public AreaSport update(
							@ApiParam("项目id")
							@PathVariable long id,
							@ApiParam("项目名称")
							@RequestParam String name,
							@ApiParam("采样间隔")
							@RequestParam byte acquisitionInterval,
							@ApiParam("是否生效")
							@RequestParam boolean isEnable,
							@ApiParam("该项目达标的行动时间(单位：秒)")
							@RequestParam int qualifiedCostTime,
							@ApiParam("学校Id")
							@RequestParam int universityId,
							HttpServletResponse response
							) {
		AreaSport sport = new AreaSport(id, name, acquisitionInterval, isEnable, qualifiedCostTime, universityId);
		response.setStatus(areaSportService.update(sport));
		return sport;
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
	public AreaSport show(
							@ApiParam("项目id")
							@PathVariable long id,
							HttpServletResponse response
							) {
		AreaSport sport = new AreaSport();
		sport.setId(id);
		response.setStatus(areaSportService.show(sport));
		return sport;
	}
	
	/**
	 * Index.
	 *
	 * @param response the response
	 * @return the list
	 */
	@ApiOperation(value = "获取定点运动项目列表", notes = "获取定点运动项目列表")
	@RequestMapping(value="/",method = RequestMethod.GET) 
	public List<AreaSport> index(
							HttpServletResponse response
							) {
		List<AreaSport> list = new ArrayList<AreaSport>();
		response.setStatus(areaSportService.index(list));
		return list;
	}
	
}
