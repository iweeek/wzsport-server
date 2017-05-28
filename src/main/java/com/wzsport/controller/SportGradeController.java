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

/**
 * SportGrade Controller
 * 
 * @author linhongyong
 * 2017年5月27日
 */

@RestController
@RequestMapping(value="/sportGrade", produces="application/json;charset=UTF-8")
public class SportGradeController {
	
	@Autowired
	private SportGradeService sportGradeService;
	
	@RequestMapping(method = RequestMethod.POST)
	public SportGrade save(@RequestParam int studentId,
							 	 @RequestParam float meter50,
							 	 @RequestParam int meter50Grade,
							 	 @RequestParam float standingJump,
							 	 @RequestParam int standingJumpGrade,
							 	 @RequestParam int meter1500,
							 	 @RequestParam int meter1500Grade,
							 	 @RequestParam int abdominalCurl,
							 	 @RequestParam int abdominalCurlGrade){
		SportGrade sportGrade = new SportGrade();
		sportGrade.setStudentId(studentId);
		sportGrade.setMeter50(meter50);
		sportGrade.setMeter50Grade(meter50Grade);
		sportGrade.setStandingJump(standingJump);
		sportGrade.setStandingJumpGrade(standingJumpGrade);
		sportGrade.setMeter1500(meter1500);
		sportGrade.setMeter1500Grade(meter1500Grade);
		sportGrade.setAbdominalCurl(abdominalCurl);
		sportGrade.setAbdominalCurlGrade(abdominalCurlGrade);
	
		sportGrade.setCreatedAt(new Date());
		return sportGradeService.create(sportGrade);
	}
	
	@RequestMapping(value="/{id}", method = RequestMethod.POST)
	public SportGrade update( 
			 @PathVariable int id,
			 @RequestParam int studentId,
		 	 @RequestParam float meter50,
		 	 @RequestParam int meter50Grade,
		 	 @RequestParam float standingJump,
		 	 @RequestParam int standingJumpGrade,
		 	 @RequestParam int meter1500,
		 	 @RequestParam int meter1500Grade,
		 	 @RequestParam int abdominalCurl,
		 	 @RequestParam int abdominalCurlGrade){
		SportGrade sportGrade = new SportGrade();
		sportGrade.setId(id);
		sportGrade.setStudentId(studentId);
		sportGrade.setMeter50(meter50);
		sportGrade.setMeter50Grade(meter50Grade);
		sportGrade.setStandingJump(standingJump);
		sportGrade.setStandingJumpGrade(standingJumpGrade);
		sportGrade.setMeter1500(meter1500);
		sportGrade.setMeter1500Grade(meter1500Grade);
		sportGrade.setAbdominalCurl(abdominalCurl);
		sportGrade.setAbdominalCurlGrade(abdominalCurlGrade);
		
		return sportGradeService.update(sportGrade);
	}

}
