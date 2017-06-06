package com.wzsport.graphql;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.wzsport.mapper.RunningActivityMapper;
import com.wzsport.model.RunningActivity;
import com.wzsport.model.RunningActivityExample;

import graphql.Scalars;
import graphql.schema.GraphQLArgument;
import graphql.schema.GraphQLFieldDefinition;
import graphql.schema.GraphQLList;
import graphql.schema.GraphQLObjectType;

/**
* GraphQL RunningActivity类型的定义及查询字段定义
* 
* @author x1ny
* @date 2017年5月26日
*/
@Component
public class RunningActivityType {
	
	private static RunningActivityMapper runningActivityMapper;
	private static GraphQLObjectType type;
	private static GraphQLFieldDefinition singleQueryField;
	private static GraphQLFieldDefinition listQueryField;
	
	private RunningActivityType() {}
	
	public static GraphQLObjectType getType() {
		if(type == null) {
			type = GraphQLObjectType.newObject()
					.name("RunningActivity")
					.field(GraphQLFieldDefinition.newFieldDefinition()
							.name("id")
							.type(Scalars.GraphQLLong)
							.build())
					.field(GraphQLFieldDefinition.newFieldDefinition()
							.name("projectId")
							.type(Scalars.GraphQLLong)
							.build())
					.field(GraphQLFieldDefinition.newFieldDefinition()
							.name("studentId")
							.type(Scalars.GraphQLLong)
							.build())
					.field(GraphQLFieldDefinition.newFieldDefinition()
							.name("distance")
							.type(Scalars.GraphQLInt)
							.build())
					.field(GraphQLFieldDefinition.newFieldDefinition()
							.name("costTime")
							.type(Scalars.GraphQLInt)
							.build())
					.field(GraphQLFieldDefinition.newFieldDefinition()
							.name("targetTime")
							.type(Scalars.GraphQLInt)
							.build())
					.field(GraphQLFieldDefinition.newFieldDefinition()
							.name("startTime")
							.type(Scalars.GraphQLLong)
							.dataFetcher(environment ->  {
								RunningActivity runningActivity = environment.getSource();
			                	return runningActivity.getStartTime().getTime();
							} )
							.build())
					.field(GraphQLFieldDefinition.newFieldDefinition()
							.name("costCalorie")
							.type(Scalars.GraphQLInt)
							.build())
					.field(GraphQLFieldDefinition.newFieldDefinition()
							.name("qualified")
							.type(Scalars.GraphQLBoolean)
							.build())
					.build();
		}
		return type;
	}
	
	public static GraphQLFieldDefinition getSingleQueryField() {
		if(singleQueryField == null) {
			singleQueryField = GraphQLFieldDefinition.newFieldDefinition()
	        		.argument(GraphQLArgument.newArgument().name("id").type(Scalars.GraphQLLong).build())
	                .name("runningActivity")
	                .type(getType())
	                .dataFetcher(environment ->  {
	                	long id = environment.getArgument("id");
	                	RunningActivity runningActivity = runningActivityMapper.selectByPrimaryKey(id);
	                	return runningActivity;
	                } ).build();
		}
        return singleQueryField;
    }
	
	public static GraphQLFieldDefinition getListQueryField() {
		if(listQueryField == null) {
			listQueryField = GraphQLFieldDefinition.newFieldDefinition()
	        		.argument(GraphQLArgument.newArgument().name("studentId").type(Scalars.GraphQLLong).build())
	                .name("runningActivitys")
	                .type(new GraphQLList(getType()))
	                .dataFetcher(environment ->  {
	                	long studentId = environment.getArgument("studentId");
	                	RunningActivityExample runningActivityExample = new RunningActivityExample();
	                	runningActivityExample.createCriteria().andStudentIdEqualTo(studentId);
	                	List<RunningActivity> runningActivityList = runningActivityMapper.selectByExample(runningActivityExample);
	                	return runningActivityList;
	                } ).build();
		}
        return listQueryField;
    }

	@Autowired(required = true)
	public void setRunningActivityMapper(RunningActivityMapper runningActivityMapper) {
		RunningActivityType.runningActivityMapper = runningActivityMapper;
	}
}
