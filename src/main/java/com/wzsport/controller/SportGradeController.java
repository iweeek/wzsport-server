package com.wzsport.controller;


import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wzsport.model.SportGrade;
import com.wzsport.service.SportGradeService;


@RestController
@RequestMapping(value="/sportGrade", produces="application/json;charset=UTF-8")
public class SportGradeController {
	
	@Autowired
	private SportGradeService sportGradeService;
	
	@RequestMapping(method = RequestMethod.POST)
	public SportGrade save(@RequestParam int studentId,
							 @RequestParam int height,
							 @RequestParam int weight,
							 @RequestParam int lungCapacity){
		SportGrade sportGrade = new SportGrade();
		sportGrade.setStudentId(studentId);
		sportGrade.setHeight(height);
		sportGrade.setWeight(weight);
		sportGrade.setLungCapacity(lungCapacity);
		sportGrade.setCreateAt(new Date());
		return sportGradeService.create(sportGrade);
	}
	
	@RequestMapping(value="/{id}", method = RequestMethod.POST)
	public SportGrade update( @PathVariable int id,
							 @RequestParam int studentId,
							 @RequestParam int height,
							 @RequestParam int weight,
							 @RequestParam int lungCapacity){
		SportGrade sportGrade = new SportGrade();
		sportGrade.setId(id);
		sportGrade.setStudentId(studentId);
		sportGrade.setHeight(height);
		sportGrade.setWeight(weight);
		sportGrade.setLungCapacity(lungCapacity);
		return sportGradeService.update(sportGrade);
	}

}
