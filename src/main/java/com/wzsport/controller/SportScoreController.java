package com.wzsport.controller;


import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wzsport.model.SportScore;
import com.wzsport.service.SportScoreService;

/**
 * sportScore Controller
 * 
 * @author linhongyong
 * 2017年5月27日
 */

@RestController
@RequestMapping(value="/sportScores", produces="application/json;charset=UTF-8")
public class SportScoreController {
	
	@Autowired
	private SportScoreService sportScoreService;
	
	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<SportScore> save(@RequestParam int studentId,
							 	 @RequestParam float meter50Sprint,
							 	 @RequestParam int meter50SprintScore,
							 	 @RequestParam int standingJump,
							 	 @RequestParam int standingJumpScore,
							 	 @RequestParam int meter1500Run,
							 	 @RequestParam int meter1500RunScore,
							 	 @RequestParam int abdominalCurl,
							 	 @RequestParam int abdominalCurlScore){
		SportScore sportScore = new SportScore();
		sportScore.setStudentId(studentId);
		sportScore.setMeter50Sprint(meter50Sprint);
		sportScore.setMeter50SprintScore(meter50SprintScore);
		sportScore.setStandingJump(standingJump);
		sportScore.setStandingJumpScore(standingJumpScore);
		sportScore.setMeter1500Run(meter1500Run);
		sportScore.setMeter1500RunScore(meter1500RunScore);
		sportScore.setAbdominalCurl(abdominalCurl);
		sportScore.setAbdominalCurlScore(abdominalCurlScore);
	
		sportScore.setCreatedAt(new Date());
		
		if(!sportScoreService.create(sportScore)) {
			ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
		return ResponseEntity.ok().build();
		
	}
	
	@RequestMapping(value="/{id}", method = RequestMethod.POST)
	public ResponseEntity<SportScore> update( 
			 @PathVariable int id,
			 @RequestParam int studentId,
			 @RequestParam float meter50Sprint,
		 	 @RequestParam int meter50SprintScore,
		 	 @RequestParam int standingJump,
		 	 @RequestParam int standingJumpScore,
		 	 @RequestParam int meter1500Run,
		 	 @RequestParam int meter1500RunScore,
		 	 @RequestParam int abdominalCurl,
		 	 @RequestParam int abdominalCurlScore){
		SportScore sportScore = new SportScore();
		sportScore.setId(id);
		sportScore.setStudentId(studentId);
		sportScore.setMeter50Sprint(meter50Sprint);
		sportScore.setMeter50SprintScore(meter50SprintScore);
		sportScore.setStandingJump(standingJump);
		sportScore.setStandingJumpScore(standingJumpScore);
		sportScore.setMeter1500Run(meter1500Run);
		sportScore.setMeter1500RunScore(meter1500RunScore);
		sportScore.setAbdominalCurl(abdominalCurl);
		sportScore.setAbdominalCurlScore(abdominalCurlScore);
		
		if(!sportScoreService.update(sportScore)) {
			ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
		return ResponseEntity.ok().build();
	}

}
