package com.wzsport.graphql;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.wzsport.mapper.ClassMapper;
import com.wzsport.mapper.MajorMapper;
import com.wzsport.model.Class;
import com.wzsport.model.Major;

import graphql.Scalars;
import graphql.schema.GraphQLArgument;
import graphql.schema.GraphQLFieldDefinition;
import graphql.schema.GraphQLList;
import graphql.schema.GraphQLObjectType;

/**
* GraphQL专业类型的定义及查询字段定义
* 
* @author x1ny
* @date 2017年5月25日
*/
@Component
public class MajorType {

	private static SqlSessionFactory sqlSessionFactory;
	private static GraphQLObjectType type;
	private static GraphQLFieldDefinition singleQueryField;
	private static GraphQLFieldDefinition listQueryField;
	
	private MajorType() {}
	
	public static GraphQLObjectType getType() {
		if(type == null) {
			type = GraphQLObjectType.newObject()
					.name("Major")
					.field(GraphQLFieldDefinition.newFieldDefinition()
							.name("id")
							.type(Scalars.GraphQLInt)
							.build())
					.field(GraphQLFieldDefinition.newFieldDefinition()
							.name("name")
							.type(Scalars.GraphQLString)
							.build())
					.field(GraphQLFieldDefinition.newFieldDefinition()
							.name("universityId")
							.type(Scalars.GraphQLInt)
							.build())
					.field(GraphQLFieldDefinition.newFieldDefinition()
							.name("collegeId")
							.type(Scalars.GraphQLInt)
							.build())
					.field(GraphQLFieldDefinition.newFieldDefinition()
							.name("classes")
							.type(new GraphQLList(ClassType.getType()))
							.dataFetcher(environment ->  {
								Major major = environment.getSource();
								SqlSession sqlSession = sqlSessionFactory.openSession();
			                	List<Class> classList = sqlSession.getMapper(ClassMapper.class).listClassByMajorId(major.getId());
			                	sqlSession.close();
			                	return classList;
							} )
							.build())
					.build();
		}
		return type;
	}
	
	public static GraphQLFieldDefinition getSingleQueryField() {
		if(singleQueryField == null) {
			singleQueryField = GraphQLFieldDefinition.newFieldDefinition()
	        		.argument(GraphQLArgument.newArgument().name("id").type(Scalars.GraphQLInt).build())
	                .name("major")
	                .type(getType())
	                .dataFetcher(environment ->  {
	                	int id = environment.getArgument("id");
	                	SqlSession sqlSession = sqlSessionFactory.openSession();
	                	Major major = sqlSession.getMapper(MajorMapper.class).getMajorById(id);
	                	sqlSession.close();
	                	return major;
	                } ).build();
		}
        return singleQueryField;
    }
	
	public static GraphQLFieldDefinition getListQueryField() {
		if(listQueryField == null) {
			listQueryField = GraphQLFieldDefinition.newFieldDefinition()
	        		.argument(GraphQLArgument.newArgument().name("collegeId").type(Scalars.GraphQLInt).build())
	                .name("majors")
	                .type(new GraphQLList(getType()))
	                .dataFetcher(environment ->  {
	                	int collegeId = environment.getArgument("collegeId");
	                	SqlSession sqlSession = sqlSessionFactory.openSession();
	                	List<Major> majorList = sqlSession.getMapper(MajorMapper.class).listMajorByCollegeId(collegeId);
	                	sqlSession.close();
	                	return majorList;
	                } ).build();
		}
        return listQueryField;
    }
	
	public SqlSessionFactory getSqlSessionFactory() {
		return sqlSessionFactory;
	}

	@Autowired(required = true)
	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		MajorType.sqlSessionFactory = sqlSessionFactory;
	}
}
