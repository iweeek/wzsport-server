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
					.description("学生类型")
					.field(GraphQLFieldDefinition.newFieldDefinition()
							.name("id")
							.description("唯一主键")
							.type(Scalars.GraphQLLong)
							.build())
					.field(GraphQLFieldDefinition.newFieldDefinition()
							.name("name")
							.description("学生名称")
							.type(Scalars.GraphQLString)
							.build())
					.field(GraphQLFieldDefinition.newFieldDefinition()
							.name("studentNo")
							.description("学号")
							.type(Scalars.GraphQLString)
							.build())
					.field(GraphQLFieldDefinition.newFieldDefinition()
							.name("isMan")
							.description("性别")
							.type(Scalars.GraphQLBoolean)
							.dataFetcher(environment ->  {
								Student student = environment.getSource();
			                	return student.getMan();
							} )
							.build())
					.field(GraphQLFieldDefinition.newFieldDefinition()
							.name("universityId")
							.description("所属大学的ID")
							.type(Scalars.GraphQLLong)
							.build())
					.field(GraphQLFieldDefinition.newFieldDefinition()
							.name("classId")
							.description("所属班级的ID")
							.type(Scalars.GraphQLLong)
							.build())
					.field(GraphQLFieldDefinition.newFieldDefinition()
							.name("userId")
							.description("关联的user的ID")
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
	                .description("根据ID或者user的ID来获取学生")
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
	                .description("根据班级的ID获取该班级的所有学生")
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
	                .description("搜索学生")
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
