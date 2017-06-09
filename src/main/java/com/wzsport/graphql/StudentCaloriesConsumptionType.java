package com.wzsport.graphql;

import graphql.Scalars;
import graphql.schema.GraphQLFieldDefinition;
import graphql.schema.GraphQLObjectType;

public class StudentCaloriesConsumptionType {

	private static GraphQLObjectType type;
	
	public static GraphQLObjectType getType() {
		if(type == null) {
			type = GraphQLObjectType.newObject()
					.name("StudentCaloriesCosted")
					.field(GraphQLFieldDefinition.newFieldDefinition()
							.name("studentId")
							.type(Scalars.GraphQLLong)
							.build())
					.field(GraphQLFieldDefinition.newFieldDefinition()
							.name("studentName")
							.type(Scalars.GraphQLString)
							.build())
					.field(GraphQLFieldDefinition.newFieldDefinition()
							.name("caloriesConsumption")
							.type(Scalars.GraphQLInt)
							.build())
					.build();
		}
		
		return type;
	}
}
