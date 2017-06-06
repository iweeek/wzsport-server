package com.wzsport.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wzsport.model.TermSportsTask;
import com.wzsport.service.TermSportsTaskService;

/**
* TermSportsTask Controller
* 
* @author x1ny
* @date 2017年5月28日
*/
@RestController
@RequestMapping(value="/termSportsTasks",produces="application/json;charset=UTF-8")
public class TermSportsTaskController {
	
	@Autowired
	private TermSportsTaskService termSportsTaskService;
	
	/**
	* 更新TermSportsTask接口
	*/
	@RequestMapping(value="/{id}", method = RequestMethod.POST)
	public ResponseEntity<?> update(@RequestParam int targetSportsTimes,
									@PathVariable long id) {
		TermSportsTask termSportsTask = new TermSportsTask();
		termSportsTask.setId(id);
		termSportsTask.setTargetSportsTimes(targetSportsTimes);
		
		if(!termSportsTaskService.update(termSportsTask)) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
		return ResponseEntity.ok().build();
	}
}
