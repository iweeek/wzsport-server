package com.wzsport.graphql;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.wzsport.mapper.ClassMapper;
import com.wzsport.mapper.StudentMapper;
import com.wzsport.model.Class;
import com.wzsport.model.ClassExample;
import com.wzsport.model.Student;
import com.wzsport.model.StudentExample;

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

	private static ClassMapper classMapper;
	private static StudentMapper studentMapper;
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
							.type(Scalars.GraphQLLong)
							.build())
					.field(GraphQLFieldDefinition.newFieldDefinition()
							.name("name")
							.type(Scalars.GraphQLString)
							.build())
					.field(GraphQLFieldDefinition.newFieldDefinition()
							.name("majorId")
							.type(Scalars.GraphQLLong)
							.build())
					.field(GraphQLFieldDefinition.newFieldDefinition()
							.name("universityId")
							.type(Scalars.GraphQLLong)
							.build())
					.field(GraphQLFieldDefinition.newFieldDefinition()
							.name("students")
							.type(new GraphQLList(StudentType.getType()))
							.dataFetcher(environment ->  {
								Class studentClass = environment.getSource();
								StudentExample studentExample = new StudentExample();
								studentExample.createCriteria().andClassIdEqualTo(studentClass.getId());
			                	List<Student> studentList = studentMapper.selectByExample(studentExample);
			                	return studentList;
							} )
							.build())
					.field(GraphQLFieldDefinition.newFieldDefinition()
							.name("studentsCount")
							.type(Scalars.GraphQLInt)
							.dataFetcher(environment ->  {
								Class studentClass = environment.getSource();
								StudentExample studentExample = new StudentExample();
								studentExample.createCriteria().andClassIdEqualTo(studentClass.getId());
			                	int  studentCount = (int) studentMapper.countByExample(studentExample);
			                	return studentCount;
							} )
							.build())
					.field(GraphQLFieldDefinition.newFieldDefinition()
							.name("maleStudentsCount")
							.type(Scalars.GraphQLInt)
							.dataFetcher(environment ->  {
								Class studentClass = environment.getSource();
								StudentExample studentExample = new StudentExample();
								studentExample.createCriteria().andClassIdEqualTo(studentClass.getId()).andManEqualTo(true);
								int maleStudentCount = (int)studentMapper.countByExample(studentExample);
			                	return maleStudentCount;
							} )
							.build())
					.field(GraphQLFieldDefinition.newFieldDefinition()
							.name("femaleStudentsCount")
							.type(Scalars.GraphQLInt)
							.dataFetcher(environment ->  {
								Class studentClass = environment.getSource();
								StudentExample studentExample = new StudentExample();
								studentExample.createCriteria().andClassIdEqualTo(studentClass.getId()).andManEqualTo(false);
								int femaleStudentCount = (int) studentMapper.countByExample(studentExample);
			                	return femaleStudentCount;
							} )
							.build())
					.build();
		}
		
		return type;
	}
	
	public static GraphQLFieldDefinition getSingleQueryField() {
		if(singleQueryField == null) {
			singleQueryField = GraphQLFieldDefinition.newFieldDefinition()
	        		.argument(GraphQLArgument.newArgument().name("id").type(Scalars.GraphQLLong).build())
	                .name("class")
	                .type(getType())
	                .dataFetcher(environment ->  {
	                	long id = environment.getArgument("id");
	                	Class sudentClass = classMapper.selectByPrimaryKey(id);
	                	return sudentClass;
	                } ).build();
		}
        return singleQueryField;
    }
	
	public static GraphQLFieldDefinition getListQueryField() {
		if(listQueryField == null) {
			listQueryField = GraphQLFieldDefinition.newFieldDefinition()
	        		.argument(GraphQLArgument.newArgument().name("majorId").type(Scalars.GraphQLLong).build())
	                .name("classes")
	                .type(new GraphQLList(getType()))
	                .dataFetcher(environment -> {
	                	long majorId = environment.getArgument("majorId");
	                	ClassExample classExample = new ClassExample();
	                	classExample.createCriteria().andMajorIdEqualTo(majorId);
	                	List<Class> classList = classMapper.selectByExample(classExample);
	                	return classList;
	                } ).build();
		}
        return listQueryField;
    }

	@Autowired(required = true) 
	public void setClassMapper(ClassMapper classMapper) {
		ClassType.classMapper = classMapper;
	}

	@Autowired(required = true) 
	public void setStudentMapper(StudentMapper studentMapper) {
		ClassType.studentMapper = studentMapper;
	}
}
