package com.wzsport.graphql;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.wzsport.mapper.RunningProjectMapper;
import com.wzsport.model.RunningProject;

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

	private static SqlSessionFactory sqlSessionFactory;
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
							.type(Scalars.GraphQLInt)
							.build())
					.field(GraphQLFieldDefinition.newFieldDefinition()
							.name("universityId")
							.type(Scalars.GraphQLInt)
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
	        		.argument(GraphQLArgument.newArgument().name("id").type(Scalars.GraphQLInt).build())
	                .name("runningProject")
	                .type(getType())
	                .dataFetcher(environment ->  {
	                	int id = environment.getArgument("id");
	                	SqlSession sqlSession = sqlSessionFactory.openSession();
	                	RunningProject runningProject = sqlSession.getMapper(RunningProjectMapper.class).getRunningProjectById(id);
	                	sqlSession.close();
	                	return runningProject;
	                } ).build();
		}
        return singleQueryField;
    }
	
	public static GraphQLFieldDefinition getListQueryField() {
		if(listQueryField == null) {
			listQueryField = GraphQLFieldDefinition.newFieldDefinition()
	        		.argument(GraphQLArgument.newArgument().name("universityId").type(Scalars.GraphQLInt).build())
	                .name("runningProjects")
	                .type(new GraphQLList(getType()))
	                .dataFetcher(environment ->  {
	                	int universityId = environment.getArgument("universityId");
	                	SqlSession sqlSession = sqlSessionFactory.openSession();
	                	List<RunningProject> runningProjectList = sqlSession.getMapper(RunningProjectMapper.class).listRunningProjectByUniversityId(universityId);
	                	sqlSession.close();
	                	return runningProjectList;
	                } ).build();
		}
        return listQueryField;
    }
	
	public SqlSessionFactory getSqlSessionFactory() {
		return sqlSessionFactory;
	}

	@Autowired(required = true)
	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		RunningProjectType.sqlSessionFactory = sqlSessionFactory;
	}
}
