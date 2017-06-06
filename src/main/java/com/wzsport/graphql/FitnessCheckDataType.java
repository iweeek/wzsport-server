package com.wzsport.graphql;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.wzsport.mapper.FitnessCheckDataMapper;
import com.wzsport.model.FitnessCheckData;
import com.wzsport.model.FitnessCheckDataExample;

import graphql.Scalars;
import graphql.schema.GraphQLArgument;
import graphql.schema.GraphQLFieldDefinition;
import graphql.schema.GraphQLList;
import graphql.schema.GraphQLObjectType;

@Component
public class FitnessCheckDataType {
	
	private static FitnessCheckDataMapper fitnessCheckDataMapper;
	private static GraphQLObjectType type;
	private static GraphQLFieldDefinition singleQueryField;
	private static GraphQLFieldDefinition listQueryField;
	
	public FitnessCheckDataType() {}
	
	public static GraphQLObjectType getType() {
		if(type == null) {
			type = GraphQLObjectType.newObject()
					.name("FitnessCheckData")
					.field(GraphQLFieldDefinition.newFieldDefinition()
							.name("id")
							.type(Scalars.GraphQLLong)
							.build())
					.field(GraphQLFieldDefinition.newFieldDefinition()
							.name("studentId")
							.type(Scalars.GraphQLLong)
							.build())
					.field(GraphQLFieldDefinition.newFieldDefinition()
							.name("height")
							.type(Scalars.GraphQLInt)
							.build())
					.field(GraphQLFieldDefinition.newFieldDefinition()
							.name("weight")
							.type(Scalars.GraphQLInt)
							.build())
					.field(GraphQLFieldDefinition.newFieldDefinition()
							.name("lungCapacity")
							.type(Scalars.GraphQLInt)
							.build())
					.field(GraphQLFieldDefinition.newFieldDefinition()
							.name("bmi")
							.type(Scalars.GraphQLFloat)
							.build())
					.build();
		}
		
		return type;
	}
	
	public static GraphQLFieldDefinition getSingleQueryField() {
		if(singleQueryField == null) {
			singleQueryField = GraphQLFieldDefinition.newFieldDefinition()
	        		.argument(GraphQLArgument.newArgument().name("id").type(Scalars.GraphQLLong).build())
	                .name("fitnessCheckData")
	                .type(getType())
	                .dataFetcher(environment ->  {
	                	long id = environment.getArgument("id");
	                	FitnessCheckData fitnessCheckData = fitnessCheckDataMapper.selectByPrimaryKey(id);
	                	return fitnessCheckData;
	                } ).build();
		}
        return singleQueryField;
    }
	
	public static GraphQLFieldDefinition getListQueryField() {
		if(listQueryField == null) {
			listQueryField = GraphQLFieldDefinition.newFieldDefinition()
	        		.argument(GraphQLArgument.newArgument().name("studentId").type(Scalars.GraphQLLong).build())
	                .name("fitnessCheckDatas")
	                .type(new GraphQLList(getType()))
	                .dataFetcher(environment -> {
	                	long studentId = environment.getArgument("studentId");
	                	FitnessCheckDataExample fitnessCheckDataExample = new FitnessCheckDataExample();
	                	fitnessCheckDataExample.createCriteria().andStudentIdEqualTo(studentId);
	                	List<FitnessCheckData> sportGradeList = fitnessCheckDataMapper.selectByExample(fitnessCheckDataExample);
	                	return sportGradeList;
	                } ).build();
		}
        return listQueryField;
    }

	@Autowired(required = true)
	public void setFitnessCheckDataMapper(FitnessCheckDataMapper fitnessCheckDataMapper) {
		FitnessCheckDataType.fitnessCheckDataMapper = fitnessCheckDataMapper;
	}
}
