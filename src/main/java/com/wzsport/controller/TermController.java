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

import com.wzsport.model.Term;
import com.wzsport.service.TermService;

/**
* Term Controller.
* 
* @author x1ny
* @date 2017年5月28日
*/
@RestController
@RequestMapping(value="/terms",produces="application/json;charset=UTF-8")
public class TermController {
	
	@Autowired
	private TermService termService;
	
	/**
	* 创建term接口
	*/
	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<?> create(@RequestParam String name,
									@RequestParam long universityId,
									@RequestParam long startDate,
									@RequestParam long endDate) {
		Term term = new Term();
		term.setUniversityId(universityId);
		term.setName(name);
		term.setStartDate(new Date(startDate));
		term.setEndDate(new Date(endDate));
		if(!termService.create(term)) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
		return ResponseEntity.ok().build();
	}

	/**
	* 更新term接口
	*/
	@RequestMapping(value="/{id}", method = RequestMethod.POST)
	public ResponseEntity<?> update(@RequestParam String name,
									@RequestParam long startDate,
									@RequestParam long endDate,
									@PathVariable long id) {
		Term term = new Term();
		term.setId(id);
		term.setName(name);
		term.setStartDate(new Date(startDate));
		term.setEndDate(new Date(endDate));
		if(!termService.update(term)) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
		return ResponseEntity.ok().build();
	}
	
	/**
	* 删除term接口
	*/
	@RequestMapping(value="/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<?> delete(@PathVariable int id) {
		if(!termService.delete(id)) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
		return ResponseEntity.ok().build();
	}
}
