package com.wzsport.graphql;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.wzsport.mapper.StudentMapper;
import com.wzsport.model.Student;

import graphql.Scalars;
import graphql.schema.GraphQLArgument;
import graphql.schema.GraphQLFieldDefinition;
import graphql.schema.GraphQLList;
import graphql.schema.GraphQLObjectType;

/**
* GraphQL学生类型的定义及查询字段定义
* 
* @author x1ny
* @date 2017年5月25日
*/
@Component
public class StudentType {
	
	private static SqlSessionFactory sqlSessionFactory;
	private static GraphQLObjectType type;
	private static GraphQLFieldDefinition singleQueryField;
	private static GraphQLFieldDefinition listQueryField;

	private StudentType() {}
	
	public static GraphQLObjectType getType() {
		if(type == null) {
			type = GraphQLObjectType.newObject()
					.name("Student")
					.field(GraphQLFieldDefinition.newFieldDefinition()
							.name("id")
							.type(Scalars.GraphQLInt)
							.build())
					.field(GraphQLFieldDefinition.newFieldDefinition()
							.name("name")
							.type(Scalars.GraphQLString)
							.build())
					.field(GraphQLFieldDefinition.newFieldDefinition()
							.name("studentNo")
							.type(Scalars.GraphQLString)
							.build())
					.field(GraphQLFieldDefinition.newFieldDefinition()
							.name("man")
							.type(Scalars.GraphQLBoolean)
							.build())
					.field(GraphQLFieldDefinition.newFieldDefinition()
							.name("universityId")
							.type(Scalars.GraphQLInt)
							.build())
					.field(GraphQLFieldDefinition.newFieldDefinition()
							.name("classId")
							.type(Scalars.GraphQLInt)
							.build())
					.field(GraphQLFieldDefinition.newFieldDefinition()
							.name("userId")
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
	                .name("student")
	                .type(getType())
	                .dataFetcher(environment -> {
	                	SqlSession sqlSession = sqlSessionFactory.openSession();
	                	Student student = null;
	                	if(environment.containsArgument("id")){
	                		int id = environment.getArgument("id");
		                	student = sqlSession.getMapper(StudentMapper.class).getStudentById(id);
	                	} else if (environment.containsArgument("userId")) {
	                		int userId = environment.getArgument("id");
		                	student = sqlSession.getMapper(StudentMapper.class).getStudentByUserId(userId);
	                	}
	                	
	                	sqlSession.close();
	                	return student;
	                } )
	                .build();
		}
		
        return singleQueryField;
    }
	
	public static GraphQLFieldDefinition getListQueryField() {
		if(listQueryField == null) {
			listQueryField = GraphQLFieldDefinition.newFieldDefinition()
	        		.argument(GraphQLArgument.newArgument().name("classId").type(Scalars.GraphQLInt).build())
	                .name("students")
	                .type(new GraphQLList(getType()))
	                .dataFetcher(environment -> {
	                	int classId = environment.getArgument("classId");
	                	SqlSession sqlSession = sqlSessionFactory.openSession();
	                	List<Student> studentList = sqlSession.getMapper(StudentMapper.class).listStudentByClassId(classId);
	                	sqlSession.close();
	                	return studentList;
	                } ).build();
		}
        return listQueryField;
    }
	
	public SqlSessionFactory getSqlSessionFactory() {
		return sqlSessionFactory;
	}

	@Autowired(required = true)
	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		StudentType.sqlSessionFactory = sqlSessionFactory;
	}
}
