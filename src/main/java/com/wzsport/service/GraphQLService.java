package com.wzsport.service;

import graphql.ExecutionResult;

/**
* GraphQL查询服务接口类
* 
* @author x1ny
* @date 2017年5月24日
*/
public interface GraphQLService {

	/**
	* 根据传入的查询字符串进行GraphQL查询
	* 
	* @param queryString 查询字符串
	*/
	ExecutionResult query(String queryString);
}
