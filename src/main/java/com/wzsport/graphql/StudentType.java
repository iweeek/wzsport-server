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
* GraphQL瀛︾敓绫诲瀷鐨勫畾涔夊強鏌ヨ瀛楁瀹氫箟
* 
* @author x1ny
* @date 2017骞�5鏈�25鏃�
*/
@Component
public class StudentType {
	
	private static SqlSessionFactory sqlSessionFactory;
	private static GraphQLObjectType type;
	private static GraphQLFieldDefinition singleQueryField;
	private static GraphQLFieldDefinition listQueryField;
	private static GraphQLFieldDefinition listQueryByConditionsField;

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
	
	public static GraphQLFieldDefinition getListQueryByConditionsField() {
		if(listQueryByConditionsField == null) {
			listQueryByConditionsField = GraphQLFieldDefinition.newFieldDefinition()
	        		.argument(GraphQLArgument.newArgument().name("classId").type(Scalars.GraphQLInt).build())
	        		.argument(GraphQLArgument.newArgument().name("name").type(Scalars.GraphQLString).build())
	        		.argument(GraphQLArgument.newArgument().name("studentNo").type(Scalars.GraphQLString).build())
	        		.argument(GraphQLArgument.newArgument().name("man").type(Scalars.GraphQLBoolean).build())
	                .name("searchStudents")
	                .type(new GraphQLList(getType()))
	                .dataFetcher(environment -> {
	                	Integer classId = environment.getArgument("classId");
	                	String name = environment.getArgument("name");
	                	String studentNo = environment.getArgument("studentNo");
	                	Boolean man = environment.getArgument("man");
	                	SqlSession sqlSession = sqlSessionFactory.openSession();
	                	List<Student> studentList = sqlSession.getMapper(StudentMapper.class).listStudentByConditions(classId, name, studentNo, man);
	                	sqlSession.close();
	                	return studentList;
	                } ).build();
		}
        return listQueryByConditionsField;
    }


	
	public SqlSessionFactory getSqlSessionFactory() {
		return sqlSessionFactory;
	}

	@Autowired(required = true)
	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		StudentType.sqlSessionFactory = sqlSessionFactory;
	}
}
