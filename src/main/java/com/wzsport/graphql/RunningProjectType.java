package com.wzsport.graphql;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.wzsport.mapper.RunningProjectMapper;
import com.wzsport.model.RunningActivity;
import com.wzsport.model.RunningProject;
import com.wzsport.model.RunningProjectExample;
import com.wzsport.service.RunningActivityService;

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
	private static RunningActivityService runningActivityService;
	
	private RunningProjectType() {}
	
	public static GraphQLObjectType getType() {
		if(type == null) {
			type = GraphQLObjectType.newObject()
					.name("RunningProject")
					.description("跑步项目类型")
					.field(GraphQLFieldDefinition.newFieldDefinition()
							.name("id")
							.description("唯一主键")
							.type(Scalars.GraphQLLong)
							.build())
					.field(GraphQLFieldDefinition.newFieldDefinition()
							.name("universityId")
							.description("所属大学的ID")
							.type(Scalars.GraphQLLong)
							.build())
					.field(GraphQLFieldDefinition.newFieldDefinition()
							.name("name")
							.description("跑步项目名称")
							.type(Scalars.GraphQLString)
							.build())
					.field(GraphQLFieldDefinition.newFieldDefinition()
							.name("type")
							.description("项目的类型")
							.type(Scalars.GraphQLString)
							.build())
					.field(GraphQLFieldDefinition.newFieldDefinition()
							.name("enabled")
							.description("该项目是否启用")
							.type(Scalars.GraphQLBoolean)
							.build())
					.field(GraphQLFieldDefinition.newFieldDefinition()
							.name("qualifiedDistance")
							.description("该项目的合格距离(单位:米)")
							.type(Scalars.GraphQLInt)
							.build())
					.field(GraphQLFieldDefinition.newFieldDefinition()
							.name("qualifiedCostTime")
							.description("该项目的合格耗时(单位:秒)")
							.type(Scalars.GraphQLInt)
							.build())
					.field(GraphQLFieldDefinition.newFieldDefinition()
							.name("minCostTime")
							.description("该项目的最少耗时(单位:秒)")
							.type(Scalars.GraphQLInt)
							.build())
					.field(GraphQLFieldDefinition.newFieldDefinition()
							.name("acquisitionInterval")
							.description("采集运动数据的时间间隔(单位:秒)")
							.type(Scalars.GraphQLInt)
							.build())
					.field(GraphQLFieldDefinition.newFieldDefinition()
							.name("participantNum")
							.description("参加人数")
							.type(Scalars.GraphQLInt)
							.dataFetcher(environment -> {
								RunningProject runningProject = environment.getSource();
								return runningActivityService.getParticipantNum(runningProject.getId());
							} )
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
	                .description("根据ID获取跑步项目")
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
	                .description("根据大学ID获取关联的所有跑步项目")
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
	
	@Autowired(required = true)
	public void setRunningActivityService(RunningActivityService runningActivityService) {
		RunningProjectType.runningActivityService = runningActivityService;
	}
}
