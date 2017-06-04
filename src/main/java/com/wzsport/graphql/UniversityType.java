package com.wzsport.graphql;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.wzsport.mapper.CollegeMapper;
import com.wzsport.mapper.TeacherMapper;
import com.wzsport.mapper.UniversityMapper;
import com.wzsport.model.College;
import com.wzsport.model.University;

import graphql.Scalars;
import graphql.schema.GraphQLArgument;
import graphql.schema.GraphQLFieldDefinition;
import graphql.schema.GraphQLList;
import graphql.schema.GraphQLObjectType;

/**
* GraphQL大学类型的定义及查询字段定义
* 
* @author x1ny
* @date 2017年5月25日
*/
@Component
public class UniversityType {

	private static SqlSessionFactory sqlSessionFactory;
	private static GraphQLObjectType type;
	private static GraphQLFieldDefinition singleQueryField;

	private UniversityType() {}
	
	public static GraphQLObjectType getType() {
		if(type == null) {
			type = GraphQLObjectType.newObject()
					.name("University")
					.field(GraphQLFieldDefinition.newFieldDefinition()
							.name("id")
							.type(Scalars.GraphQLInt)
							.build())
					.field(GraphQLFieldDefinition.newFieldDefinition()
							.name("name")
							.type(Scalars.GraphQLString)
							.build())
					.field(GraphQLFieldDefinition.newFieldDefinition()
							.name("colleges")
							.type(new GraphQLList(CollegeType.getType()))
							.dataFetcher(environment ->  {
								University university = environment.getSource();
								SqlSession sqlSession = sqlSessionFactory.openSession();
			                	List<College> collegeList = sqlSession.getMapper(CollegeMapper.class).listCollegeByUniversityId(university.getId());
			                	sqlSession.close();
			                	return collegeList;
							} )
							.build())
					.field(GraphQLFieldDefinition.newFieldDefinition()
							.name("allTeachersCount")
							.type(Scalars.GraphQLInt)
							.dataFetcher(environment ->  {
								University university = environment.getSource();
			                	SqlSession sqlSession = sqlSessionFactory.openSession();
			                	int allTeachersCount = sqlSession.getMapper(TeacherMapper.class).countAllTeachers(university.getId());
			                	sqlSession.close();
			                	return allTeachersCount;
							} )
							.build())
					.field(GraphQLFieldDefinition.newFieldDefinition()
							.name("maleTeahcersCount")
							.type(Scalars.GraphQLInt)
							.dataFetcher(environment ->  {
								University university = environment.getSource();
			                	SqlSession sqlSession = sqlSessionFactory.openSession();
			                	int maleTeachersCount = sqlSession.getMapper(TeacherMapper.class).countMaleTeachers(university.getId());
			                	sqlSession.close();
			                	return maleTeachersCount;
							} )
							.build())
					.field(GraphQLFieldDefinition.newFieldDefinition()
							.name("femaleTeachersCount")
							.type(Scalars.GraphQLInt)
							.dataFetcher(environment ->  {
								University university = environment.getSource();
			                	SqlSession sqlSession = sqlSessionFactory.openSession();
			                	int femaleTeachersCount = sqlSession.getMapper(TeacherMapper.class).countFemaleTeachers(university.getId());;
			                	sqlSession.close();
			                	return femaleTeachersCount;
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
	                .name("university")
	                .type(getType())
	                .dataFetcher(environment ->  {
	                	int id = environment.getArgument("id");
	                	SqlSession sqlSession = sqlSessionFactory.openSession();
	                	University university = null;
	                	try {
	                		university = sqlSession.getMapper(UniversityMapper.class).getUniversityById(id);
						} catch (Exception e) {
							e.printStackTrace();
						}
	                	sqlSession.close();
	                	return university;
	                } ).build();
		}
        return singleQueryField;
    }
	
	
	public SqlSessionFactory getSqlSessionFactory() {
		return sqlSessionFactory;
	}

	@Autowired(required = true)
	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		UniversityType.sqlSessionFactory = sqlSessionFactory;
	}
}
