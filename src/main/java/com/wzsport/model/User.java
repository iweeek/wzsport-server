package com.wzsport.model;

import java.util.List;

import graphql.Scalars;
import graphql.schema.GraphQLFieldDefinition;
import graphql.schema.GraphQLList;
import graphql.schema.GraphQLObjectType;
/**
* @ClassName: User
* @Description: 用户
* @author x1ny
* @date 2017年5月9日
*/
public class User {
	
	private int id;
	private String username;
	private String password;
	private List<Role> roles;
	
	/**
	* @author x1ny
	* @date 2017年5月15日
	* @Description: 创建相应的GraphQL类型
	* @return
	* @throws
	*/
	public static GraphQLObjectType createGraphQLObjectType() {
		return GraphQLObjectType.newObject()
				.name("User")
				.field(GraphQLFieldDefinition.newFieldDefinition()
						.name("id")
						.type(Scalars.GraphQLInt)
						.build())
				.field(GraphQLFieldDefinition.newFieldDefinition()
						.name("username")
						.type(Scalars.GraphQLString)
						.build())
				.field(GraphQLFieldDefinition.newFieldDefinition()
						.name("roles")
						.type(new GraphQLList(Role.createGraphQLObjectType()))
						.dataFetcher(environment ->  {
							User user = environment.getSource();
							return user.roles;
						} )
						.build())
				.build();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<Role> getRoles() {
		return roles;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}
}
