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
					.description("跑步活动类型")
					.field(GraphQLFieldDefinition.newFieldDefinition()
							.name("id")
							.description("唯一主键")
							.type(Scalars.GraphQLLong)
							.build())
					.field(GraphQLFieldDefinition.newFieldDefinition()
							.name("projectId")
							.description("该活动关联的项目的ID")
							.type(Scalars.GraphQLLong)
							.build())
					.field(GraphQLFieldDefinition.newFieldDefinition()
							.name("studentId")
							.description("该活动关联的学生的ID")
							.type(Scalars.GraphQLLong)
							.build())
					.field(GraphQLFieldDefinition.newFieldDefinition()
							.name("distance")
							.description("活动距离(单位:米)")
							.type(Scalars.GraphQLInt)
							.build())
					.field(GraphQLFieldDefinition.newFieldDefinition()
							.name("costTime")
							.description("活动耗时(单位:秒)")
							.type(Scalars.GraphQLInt)
							.build())
					.field(GraphQLFieldDefinition.newFieldDefinition()
							.name("targetTime")
							.description("达到目标距离的时间(单位:秒)")
							.type(Scalars.GraphQLInt)
							.build())
					.field(GraphQLFieldDefinition.newFieldDefinition()
							.name("startTime")
							.description("活动开始时间,时间戳格式(毫秒)")
							.type(Scalars.GraphQLLong)
							.dataFetcher(environment ->  {
								RunningActivity runningActivity = environment.getSource();
			                	return runningActivity.getStartTime().getTime();
							} )
							.build())
					.field(GraphQLFieldDefinition.newFieldDefinition()
							.name("costCalorie")
							.description("本次活动的卡路里消耗量")
							.type(Scalars.GraphQLInt)
							.build())
					.field(GraphQLFieldDefinition.newFieldDefinition()
							.name("qualified")
							.description("本次活动是否达标")
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
	                .description("根据ID获取跑步活动类型")
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
	                .description("根据学生ID获取相关联的所有跑步活动")
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
