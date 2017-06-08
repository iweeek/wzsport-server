package com.wzsport.graphql;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.wzsport.mapper.StudentMapper;
import com.wzsport.model.Student;
import com.wzsport.model.StudentExample;
import com.wzsport.model.StudentExample.Criteria;

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
	
	private static StudentMapper studentMapper;
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
							.type(Scalars.GraphQLLong)
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
							.name("isMan")
							.type(Scalars.GraphQLBoolean)
							.dataFetcher(environment ->  {
								Student student = environment.getSource();
			                	return student.getMan();
							} )
							.build())
					.field(GraphQLFieldDefinition.newFieldDefinition()
							.name("universityId")
							.type(Scalars.GraphQLLong)
							.build())
					.field(GraphQLFieldDefinition.newFieldDefinition()
							.name("classId")
							.type(Scalars.GraphQLLong)
							.build())
					.field(GraphQLFieldDefinition.newFieldDefinition()
							.name("userId")
							.type(Scalars.GraphQLLong)
							.build())
					.build();
		}
		
		return type;
	}
	
	public static GraphQLFieldDefinition getSingleQueryField() {
		if(singleQueryField == null) {
			singleQueryField = GraphQLFieldDefinition.newFieldDefinition()
	        		.argument(GraphQLArgument.newArgument().name("id").type(Scalars.GraphQLLong).build())
	        		.argument(GraphQLArgument.newArgument().name("userId").type(Scalars.GraphQLLong).build())
	                .name("student")
	                .type(getType())
	                .dataFetcher(environment -> {
	                	Student student = null;
	                	Long id = environment.getArgument("id");
	                	if(id != null){
		                	student = studentMapper.selectByPrimaryKey(id);
	                	} else if (environment.containsArgument("userId")) {
	                		long userId = environment.getArgument("userId");
	                		StudentExample studentExample = new StudentExample();
	                		studentExample.createCriteria().andUserIdEqualTo(userId);
		                	student = studentMapper.selectByExample(studentExample).get(0);
	                	}
	                	
	                	return student;
	                } )
	                .build();
		}
		
        return singleQueryField;
    }
	
	public static GraphQLFieldDefinition getListQueryField() {
		if(listQueryField == null) {
			listQueryField = GraphQLFieldDefinition.newFieldDefinition()
	        		.argument(GraphQLArgument.newArgument().name("classId").type(Scalars.GraphQLLong).build())
	                .name("students")
	                .type(new GraphQLList(getType()))
	                .dataFetcher(environment -> {
	                	long classId = environment.getArgument("classId");
	                	StudentExample studentExample = new StudentExample();
                		studentExample.createCriteria().andClassIdEqualTo(classId);
	                	List<Student> studentList = studentMapper.selectByExample(studentExample);
	                	return studentList;
	                } ).build();
		}
        return listQueryField;
    }
	
	public static GraphQLFieldDefinition getListQueryByConditionsField() {
		if(listQueryByConditionsField == null) {
			listQueryByConditionsField = GraphQLFieldDefinition.newFieldDefinition()
	        		.argument(GraphQLArgument.newArgument().name("classId").type(Scalars.GraphQLLong).build())
	        		.argument(GraphQLArgument.newArgument().name("name").type(Scalars.GraphQLString).build())
	        		.argument(GraphQLArgument.newArgument().name("studentNo").type(Scalars.GraphQLString).build())
	        		.argument(GraphQLArgument.newArgument().name("isMan").type(Scalars.GraphQLBoolean).build())
	                .name("searchStudents")
	                .type(new GraphQLList(getType()))
	                .dataFetcher(environment -> {
	                	Long classId = environment.getArgument("classId");
	                	String name = environment.getArgument("name");
	                	String studentNo = environment.getArgument("studentNo");
	                	Boolean isMan = environment.getArgument("isMan");
	                	
	                	StudentExample studentExample = new StudentExample();
	                	Criteria studentExamplesCriteria = studentExample.createCriteria();
	                	if(classId != null) {
	                		studentExamplesCriteria.andClassIdEqualTo(classId);
	                	}
	                	if(name != null) {
	                		studentExamplesCriteria.andNameLike("%" + name +"%");
	                	}
	                	if(studentNo != null) {
	                		studentExamplesCriteria.andStudentNoLike("%" + studentNo +"%");
	                	}
	                	if(isMan != null) {
	                		studentExamplesCriteria.andManEqualTo(isMan);
	                	}
	                	
	                	List<Student> studentList = studentMapper.selectByExample(studentExample);
	                			
	                	return studentList;
	                } ).build();
		}
		
        return listQueryByConditionsField;
    }

	@Autowired(required = true)
	public void setStudentMapper(StudentMapper studentMapper) {
		StudentType.studentMapper = studentMapper;
	}
}
