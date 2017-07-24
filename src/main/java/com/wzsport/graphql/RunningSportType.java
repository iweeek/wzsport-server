package com.wzsport.graphql;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.wzsport.mapper.RunningSportMapper;
import com.wzsport.model.RunningSport;
import com.wzsport.model.RunningSportExample;
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
public class RunningSportType {

	private static RunningSportMapper runningSportMapper;
	private static GraphQLObjectType type;
	private static GraphQLFieldDefinition singleQueryField;
	private static GraphQLFieldDefinition listQueryField;
	private static RunningActivityService runningActivityService;
	
	private RunningSportType() {}
	
	public static GraphQLObjectType getType() {
		if(type == null) {
			type = GraphQLObjectType.newObject()
					.name("RunningSport")
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
								RunningSport runningSport = environment.getSource();
								return runningActivityService.getParticipantNum(runningSport.getId());
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
	                	RunningSport runningSport = runningSportMapper.selectByPrimaryKey(id);
	                	return runningSport;
	                } ).build();
		}
        return singleQueryField;
    }
	
	public static GraphQLFieldDefinition getListQueryField() {
		if(listQueryField == null) {
			listQueryField = GraphQLFieldDefinition.newFieldDefinition()
	        		.argument(GraphQLArgument.newArgument().name("universityId").type(Scalars.GraphQLLong).build())
	                .name("runningSport")
	                .description("根据大学ID获取关联的所有跑步项目")
	                .type(new GraphQLList(getType()))
	                .dataFetcher(environment ->  {
	                	long universityId = environment.getArgument("universityId");
	                	RunningSportExample runningSportExample = new RunningSportExample();
	                	runningSportExample.createCriteria().andUniversityIdEqualTo(universityId);
	                	List<RunningSport> runningSportList = runningSportMapper.selectByExample(runningSportExample);
	                	return runningSportList;
	                } ).build();
		}
        return listQueryField;
    }

	@Autowired(required = true)
	public void setRunningProjectMapper(RunningSportMapper runningSportMapper) {
		RunningSportType.runningSportMapper = runningSportMapper;
	}
	
	@Autowired(required = true)
	public void setRunningActivityService(RunningActivityService runningActivityService) {
		RunningSportType.runningActivityService = runningActivityService;
	}
}
