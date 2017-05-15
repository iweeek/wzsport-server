package com.wzsport.model;

import graphql.Scalars;
import graphql.schema.GraphQLFieldDefinition;
import graphql.schema.GraphQLObjectType;

/**
* @ClassName: Role
* @Description: 角色
* @author x1ny
* @date 2017年5月9日
*/
public class Role {
	
	private int id;
	private String name;
	
	/**
	* @author x1ny
	* @date 2017年5月15日
	* @Description: 创建相应的GraphQL类型
	* @return
	* @throws
	*/
	public static GraphQLObjectType createGraphQLObjectType() {
		return GraphQLObjectType.newObject()
				.name("Role")
				.field(GraphQLFieldDefinition.newFieldDefinition()
						.name("id")
						.type(Scalars.GraphQLInt)
						.build())
				.field(GraphQLFieldDefinition.newFieldDefinition()
						.name("name")
						.type(Scalars.GraphQLString)
						.build())
				.build();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
