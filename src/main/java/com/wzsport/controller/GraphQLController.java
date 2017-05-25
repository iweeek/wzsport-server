package com.wzsport.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wzsport.service.GraphQLService;

import graphql.ExecutionResult;

/**
* GraphQL查询 控制器.
* 
* @author x1ny
* @date 2017年5月15日
*/
@RestController
@RequestMapping(value="/graphql",produces="application/json;charset=UTF-8")
public class GraphQLController {

	@Autowired
	private GraphQLService graphQLService;
	
	
	/**
	* GraphQL查询接口
	* 
	* @param queryString GraphQL查询字符串
	* @return
	* @throws
	*/
	@RequestMapping(method = RequestMethod.POST)
	public ExecutionResult query(@RequestParam String queryString) {
		ExecutionResult result = graphQLService.query(queryString);
		return result;
	}

	public GraphQLService getGraphQLService() {
		return graphQLService;
	}

	public void setGraphQLService(GraphQLService graphQLService) {
		this.graphQLService = graphQLService;
	}
}
