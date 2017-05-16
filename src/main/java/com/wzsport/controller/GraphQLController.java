package com.wzsport.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wzsport.service.GraphQLService;
import com.wzsport.util.ResponseUtil;

import graphql.ExecutionResult;

/**
* @ClassName: GraphQLController
* @Description: GraphQL控制器
* @author x1ny
* @date 2017年5月15日
*/
@Controller
@ResponseBody
@RequestMapping(value="/graphql",produces="application/json;charset=UTF-8")
public class GraphQLController {

	@Autowired
	private GraphQLService graphQLService;
	
	/**
	* @author x1ny
	* @date 2017年5月15日
	* @Description: GraphQL查询接口
	* @param queryString 查询字符串
	* @return
	*/
	@RequestMapping("/query")
	public String query(@RequestParam String queryString) {
		ExecutionResult result = graphQLService.query(queryString);
		int errNumber = result.getErrors().size();
		if(errNumber != 0){
			String[] errMessage = new String[errNumber];
			for(int i=0; i < errNumber; i++) {
				errMessage[i] = result.getErrors().get(i).getMessage();
			}
			return ResponseUtil.standardResponse(errMessage, null);
		} else {
			return ResponseUtil.standardResponse(null, graphQLService.query(queryString).getData());
		}
		
	}

	public GraphQLService getGraphQLService() {
		return graphQLService;
	}

	public void setGraphQLService(GraphQLService graphQLService) {
		this.graphQLService = graphQLService;
	}
}
