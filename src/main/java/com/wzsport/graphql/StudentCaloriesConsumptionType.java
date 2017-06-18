package com.wzsport.graphql;

import graphql.Scalars;
import graphql.schema.GraphQLFieldDefinition;
import graphql.schema.GraphQLObjectType;

public class StudentCaloriesConsumptionType {

	private static GraphQLObjectType type;
	
	public static GraphQLObjectType getType() {
		if(type == null) {
			type = GraphQLObjectType.newObject()
					.name("StudentCaloriesConsumption")
					.description("学生卡路里消耗量")
					.field(GraphQLFieldDefinition.newFieldDefinition()
							.name("studentId")
							.description("所属学生的ID")
							.type(Scalars.GraphQLLong)
							.build())
					.field(GraphQLFieldDefinition.newFieldDefinition()
							.name("studentName")
							.description("所属学生的姓名")
							.type(Scalars.GraphQLString)
							.build())
					.field(GraphQLFieldDefinition.newFieldDefinition()
							.name("avatarUrl")
							.description("学生的头像地址")
							.type(Scalars.GraphQLString)
							.staticValue("http://wx.qlogo.cn/mmopen/2eKq6oMge2lyho7S3shicMAticbD2KWhIe9fBicYtAjDDDrnmV5QC952hiaNVdLiaz8OQibs53pZZeej60XStgEWSfow/0")
							.build())
					.field(GraphQLFieldDefinition.newFieldDefinition()
							.name("caloriesConsumption")
							.description("卡路里消耗量")
							.type(Scalars.GraphQLInt)
							.build())
					.build();
		}
		return type;
	}
}
