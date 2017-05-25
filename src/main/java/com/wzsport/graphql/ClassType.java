package com.wzsport.graphql;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.wzsport.mapper.ClassMapper;
import com.wzsport.mapper.StudentMapper;
import com.wzsport.model.Class;
import com.wzsport.model.Student;

import graphql.Scalars;
import graphql.schema.GraphQLArgument;
import graphql.schema.GraphQLFieldDefinition;
import graphql.schema.GraphQLList;
import graphql.schema.GraphQLObjectType;

/**
* GraphQL班级类型的定义及查询字段定义
* 
* @author x1ny
* @date 2017年5月25日
*/
@Component
public class ClassType {
	
	private static SqlSessionFactory sqlSessionFactory;
	private static GraphQLObjectType type;
	private static GraphQLFieldDefinition singleQueryField;
	private static GraphQLFieldDefinition listQueryField;

	private ClassType() {}
	
	public static GraphQLObjectType getType() {
		if(type == null) {
			type = GraphQLObjectType.newObject()
					.name("Class")
					.field(GraphQLFieldDefinition.newFieldDefinition()
							.name("id")
							.type(Scalars.GraphQLInt)
							.build())
					.field(GraphQLFieldDefinition.newFieldDefinition()
							.name("name")
							.type(Scalars.GraphQLString)
							.build())
					.field(GraphQLFieldDefinition.newFieldDefinition()
							.name("majorId")
							.type(Scalars.GraphQLInt)
							.build())
					.field(GraphQLFieldDefinition.newFieldDefinition()
							.name("universityId")
							.type(Scalars.GraphQLInt)
							.build())
					.field(GraphQLFieldDefinition.newFieldDefinition()
							.name("students")
							.type(new GraphQLList(StudentType.getType()))
							.dataFetcher(environment ->  {
								Class studentClass = environment.getSource();
								SqlSession sqlSession = sqlSessionFactory.openSession();
			                	List<Student> studentList = sqlSession.getMapper(StudentMapper.class).listStudentByClassId(studentClass.getId());
			                	sqlSession.close();
			                	return studentList;
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
	                .name("class")
	                .type(getType())
	                .dataFetcher(environment ->  {
	                	int id = environment.getArgument("id");
	                	SqlSession sqlSession = sqlSessionFactory.openSession();
	                	Class sudentClass = sqlSession.getMapper(ClassMapper.class).getClassById(id);
	                	sqlSession.close();
	                	return sudentClass;
	                } ).build();
		}
        return singleQueryField;
    }
	
	public static GraphQLFieldDefinition getListQueryField() {
		if(listQueryField == null) {
			listQueryField = GraphQLFieldDefinition.newFieldDefinition()
	        		.argument(GraphQLArgument.newArgument().name("majorId").type(Scalars.GraphQLInt).build())
	                .name("classes")
	                .type(new GraphQLList(getType()))
	                .dataFetcher(environment -> {
	                	int majorId = environment.getArgument("majorId");
	                	SqlSession sqlSession = sqlSessionFactory.openSession();
	                	List<Class> classList = sqlSession.getMapper(ClassMapper.class).listClassByMajorId(majorId);
	                	sqlSession.close();
	                	return classList;
	                } ).build();
		}
        return listQueryField;
    }
	
	public SqlSessionFactory getSqlSessionFactory() {
		return sqlSessionFactory;
	}

	@Autowired(required = true)
	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		ClassType.sqlSessionFactory = sqlSessionFactory;
	}
}
