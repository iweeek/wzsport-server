package com.wzsport.controller;


import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wzsport.model.FitnessCheckData;
import com.wzsport.service.FitnessCheckDataService;

/**
 * FitnessCheckData Controller
 * 
 * @author Watermelon_R(ljf)
 * 2017年5月27日
 */
@RestController
@RequestMapping(value="/fitnessCheckData", produces="application/json;charset=UTF-8")
public class FitnessCheckDataController {
	
	@Autowired
	private FitnessCheckDataService fitnessCheckDataService;
	
	@RequestMapping(method = RequestMethod.POST)
	public FitnessCheckData save(@RequestParam int studentId,
							 	 @RequestParam int height,
							     @RequestParam int weight,
							     @RequestParam int lungCapacity){
		FitnessCheckData fitnessCheckData = new FitnessCheckData();
		fitnessCheckData.setStudentId(studentId);
		fitnessCheckData.setHeight(height);
		fitnessCheckData.setWeight(weight);
		fitnessCheckData.setLungCapacity(lungCapacity);
		fitnessCheckData.setCreateAt(new Date());
		return fitnessCheckDataService.create(fitnessCheckData);
	}
	
	@RequestMapping(value="/{id}", method = RequestMethod.POST)
	public FitnessCheckData update( @PathVariable int id,
							 @RequestParam int studentId,
							 @RequestParam int height,
							 @RequestParam int weight,
							 @RequestParam int lungCapacity){
		FitnessCheckData fitnessCheckData = new FitnessCheckData();
		fitnessCheckData.setId(id);
		fitnessCheckData.setStudentId(studentId);
		fitnessCheckData.setHeight(height);
		fitnessCheckData.setWeight(weight);
		fitnessCheckData.setLungCapacity(lungCapacity);
		return fitnessCheckDataService.update(fitnessCheckData);
	}

}
