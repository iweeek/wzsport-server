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
							.name("countAllTeachers")
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
							.name("countMaleTeahcers")
							.type(Scalars.GraphQLInt)
							.dataFetcher(environment ->  {
								University university = environment.getSource();
			                	SqlSession sqlSession = sqlSessionFactory.openSession();
			                	int maleTeachersCount = sqlSession.getMapper(TeacherMapper.class).countDifferentSexTeachers(university.getId(),true);
			                	sqlSession.close();
			                	return maleTeachersCount;
							} )
							.build())
					.field(GraphQLFieldDefinition.newFieldDefinition()
							.name("countFemaleTeachers")
							.type(Scalars.GraphQLInt)
							.dataFetcher(environment ->  {
								University university = environment.getSource();
			                	SqlSession sqlSession = sqlSessionFactory.openSession();
			                	int femaleTeachersCount = sqlSession.getMapper(TeacherMapper.class).countDifferentSexTeachers(university.getId(),false);
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
	                	University university = sqlSession.getMapper(UniversityMapper.class).getUniversityById(id);
	                	sqlSession.close();
	                	return university;
	                } ).build();
		}
        return singleQueryField;
    }
	
	/*
	*//**
	 * 统计返回大学里的全部老师数量
	 * 
	 * @return
	 *//*
	
	public static GraphQLFieldDefinition countAllTeachersByUniversityId() {
		if(countAll == null) {
			countAll = GraphQLFieldDefinition.newFieldDefinition()
	        		.argument(GraphQLArgument.newArgument().name("universityId").type(Scalars.GraphQLInt).build())
	                .name("countAllTeachers")
	                .type(Scalars.GraphQLInt)
	                .dataFetcher(environment ->  {
	                	int universityId = environment.getArgument("universityId");
	                	SqlSession sqlSession = sqlSessionFactory.openSession();
	                	int allTeachersCount = sqlSession.getMapper(TeacherMapper.class).countAllTeachers(universityId);
	                	sqlSession.close();
	                	return allTeachersCount;
	                } ).build();
		}
        return countAll;
    }
	
	
	*//**
	 * 统计返回大学中男女老师数量
	 * 
	 * @return
	 *//*
	public static GraphQLFieldDefinition countTeachersByUniversityIdAndSex() {
		if(countDiffSexTeacher == null) {
			countDiffSexTeacher = GraphQLFieldDefinition.newFieldDefinition()
	        		.argument(GraphQLArgument.newArgument().name("sex").type(Scalars.GraphQLInt).build())
	        		.argument(GraphQLArgument.newArgument().name("universityId").type(Scalars.GraphQLInt).build())
	                .name("countTeachersBySex")
	                .type(Scalars.GraphQLInt)
	                .dataFetcher(environment ->  {
	                	int sex = environment.getArgument("sex");
	                	int universityId = environment.getArgument("universityId");
	                	SqlSession sqlSession = sqlSessionFactory.openSession();
	                	int teacherCount = sqlSession.getMapper(TeacherMapper.class).countDifferentSexTeachers(universityId,sex);
	                	sqlSession.close();
	                	return teacherCount;
	                } ).build();
		}
        return countDiffSexTeacher;
    }
	*/
	
	public SqlSessionFactory getSqlSessionFactory() {
		return sqlSessionFactory;
	}

	@Autowired(required = true)
	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		UniversityType.sqlSessionFactory = sqlSessionFactory;
	}
}
