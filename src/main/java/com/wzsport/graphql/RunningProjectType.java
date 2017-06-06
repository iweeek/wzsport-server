package com.wzsport.graphql;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.wzsport.mapper.RunningProjectMapper;
import com.wzsport.model.RunningProject;
import com.wzsport.model.RunningProjectExample;

import graphql.Scalars;
import graphql.schema.GraphQLArgument;
import graphql.schema.GraphQLFieldDefinition;
import graphql.schema.GraphQLList;
import graphql.schema.GraphQLObjectType;

/**
* GraphQL RunningProject类型的定义及查询字段定义
* 
* @author x1ny
* @date 2017年5月26日
*/
@Component
public class RunningProjectType {

	private static RunningProjectMapper runningProjectMapper;
	private static GraphQLObjectType type;
	private static GraphQLFieldDefinition singleQueryField;
	private static GraphQLFieldDefinition listQueryField;
	
	private RunningProjectType() {}
	
	public static GraphQLObjectType getType() {
		if(type == null) {
			type = GraphQLObjectType.newObject()
					.name("RunningProject")
					.field(GraphQLFieldDefinition.newFieldDefinition()
							.name("id")
							.type(Scalars.GraphQLLong)
							.build())
					.field(GraphQLFieldDefinition.newFieldDefinition()
							.name("universityId")
							.type(Scalars.GraphQLLong)
							.build())
					.field(GraphQLFieldDefinition.newFieldDefinition()
							.name("name")
							.type(Scalars.GraphQLString)
							.build())
					.field(GraphQLFieldDefinition.newFieldDefinition()
							.name("type")
							.type(Scalars.GraphQLString)
							.build())
					.field(GraphQLFieldDefinition.newFieldDefinition()
							.name("enabled")
							.type(Scalars.GraphQLBoolean)
							.build())
					.field(GraphQLFieldDefinition.newFieldDefinition()
							.name("qualifiedDistance")
							.type(Scalars.GraphQLInt)
							.build())
					.field(GraphQLFieldDefinition.newFieldDefinition()
							.name("qualifiedCostTime")
							.type(Scalars.GraphQLInt)
							.build())
					.field(GraphQLFieldDefinition.newFieldDefinition()
							.name("minCostTime")
							.type(Scalars.GraphQLInt)
							.build())
					.build();
		}
		return type;
	}
	
	public static GraphQLFieldDefinition getSingleQueryField() {
		if(singleQueryField == null) {
			singleQueryField = GraphQLFieldDefinition.newFieldDefinition()
	        		.argument(GraphQLArgument.newArgument().name("id").type(Scalars.GraphQLLong).build())
	                .name("runningProject")
	                .type(getType())
	                .dataFetcher(environment ->  {
	                	long id = environment.getArgument("id");
	                	RunningProject runningProject = runningProjectMapper.selectByPrimaryKey(id);
	                	return runningProject;
	                } ).build();
		}
        return singleQueryField;
    }
	
	public static GraphQLFieldDefinition getListQueryField() {
		if(listQueryField == null) {
			listQueryField = GraphQLFieldDefinition.newFieldDefinition()
	        		.argument(GraphQLArgument.newArgument().name("universityId").type(Scalars.GraphQLLong).build())
	                .name("runningProjects")
	                .type(new GraphQLList(getType()))
	                .dataFetcher(environment ->  {
	                	long universityId = environment.getArgument("universityId");
	                	RunningProjectExample runningProjectExample = new RunningProjectExample();
	                	runningProjectExample.createCriteria().andUniversityIdEqualTo(universityId);
	                	List<RunningProject> runningProjectList = runningProjectMapper.selectByExample(runningProjectExample);
	                	return runningProjectList;
	                } ).build();
		}
        return listQueryField;
    }

	@Autowired(required = true)
	public void setRunningProjectMapper(RunningProjectMapper runningProjectMapper) {
		RunningProjectType.runningProjectMapper = runningProjectMapper;
	}
}
