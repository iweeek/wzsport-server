package com.wzsport.graphql;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.wzsport.mapper.ClassMapper;
import com.wzsport.mapper.TeacherMapper;
import com.wzsport.model.Class;
import com.wzsport.model.Teacher;
import com.wzsport.model.TeacherExample;
import com.wzsport.model.TeacherExample.Criteria;

import graphql.Scalars;
import graphql.schema.GraphQLArgument;
import graphql.schema.GraphQLFieldDefinition;
import graphql.schema.GraphQLList;
import graphql.schema.GraphQLObjectType;

/**
* GraphQL教师类型的定义及查询字段定义
* 
* @author x1ny
* @date 2017年5月25日
*/
@Component
public class TeacherType {
	
	private static TeacherMapper teacherMapper;
	private static ClassMapper classMapper;
	private static GraphQLObjectType type;
	private static GraphQLFieldDefinition singleQueryField;
	private static GraphQLFieldDefinition listQueryField;
	private static GraphQLFieldDefinition listTeachers;
	private TeacherType() {}
	
	public static GraphQLObjectType getType() {
		if(type == null) {
			type = GraphQLObjectType.newObject()
					.name("Teacher")
					.field(GraphQLFieldDefinition.newFieldDefinition()
							.name("id")
							.type(Scalars.GraphQLLong)
							.build())
					.field(GraphQLFieldDefinition.newFieldDefinition()
							.name("universityId")
							.type(Scalars.GraphQLLong)
							.build())
					.field(GraphQLFieldDefinition.newFieldDefinition()
							.name("jobNo")
							.type(Scalars.GraphQLString)
							.build())
					.field(GraphQLFieldDefinition.newFieldDefinition()
							.name("name")
							.type(Scalars.GraphQLString)
							.build())
					.field(GraphQLFieldDefinition.newFieldDefinition()
							.name("isMan")
							.type(Scalars.GraphQLBoolean)
							.dataFetcher(environment ->  {
								Teacher teacher = environment.getSource();
			                	return teacher.getMan();
							} )
							.build())
					.field(GraphQLFieldDefinition.newFieldDefinition()
							.name("classes")
							.type(new GraphQLList(ClassType.getType()))
							.dataFetcher(environment ->  {
								Teacher teacher = environment.getSource();
			                	List<Class> classList = classMapper.listClassByTeacherId(teacher.getId());
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
	        		.argument(GraphQLArgument.newArgument().name("id").type(Scalars.GraphQLLong).build())
	                .name("teacher")
	                .type(getType())
	                .dataFetcher(environment -> {
	                	long id = environment.getArgument("id");
	                	Teacher teacher = teacherMapper.selectByPrimaryKey(id);
	                	return teacher;
	                } )
	                .build();
		}
		
        return singleQueryField;
    }
	
	public static GraphQLFieldDefinition getListQueryField() {
		if(listQueryField == null) {
			listQueryField = GraphQLFieldDefinition.newFieldDefinition()
	        		.argument(GraphQLArgument.newArgument().name("classId").type(Scalars.GraphQLLong).build())
	                .name("teachers")
	                .type(new GraphQLList(getType()))
	                .dataFetcher(environment -> {
	                	long classId = environment.getArgument("classId");
	                	List<Teacher> teacherList = teacherMapper.listTeacherByClassId(classId);
	                	return teacherList;
	                } ).build();
		}
		
        return listQueryField;
    }
	
	public static GraphQLFieldDefinition getListTeacherByJobNoAndNameAndSex() {
		if(listTeachers == null) {
			listTeachers = GraphQLFieldDefinition.newFieldDefinition()
					.name("searchTeachers")
					.argument(GraphQLArgument.newArgument().name("universityId").type(Scalars.GraphQLLong).build())
	        		.argument(GraphQLArgument.newArgument().name("jobNo").type(Scalars.GraphQLString).build())
	        		.argument(GraphQLArgument.newArgument().name("name").type(Scalars.GraphQLString).build())
	        		.argument(GraphQLArgument.newArgument().name("isMan").type(Scalars.GraphQLBoolean).build())
	                .type(new GraphQLList(getType()))
	                .dataFetcher(environment -> {
	                	Long universityId = environment.getArgument("universityId");
	                	String jobNo = environment.getArgument("jobNo");
	                	String name = environment.getArgument("name");
	                	Boolean isMan = environment.getArgument("isMan");
	                	
	                	TeacherExample teacherExample = new TeacherExample();
	                	Criteria teacherExampleCriteria = teacherExample.createCriteria();
	                	if(universityId != null) {
	                		teacherExampleCriteria.andUniversityIdEqualTo(universityId);
	                	}
	                	if(name != null) {
	                		teacherExampleCriteria.andNameLike("%" + name + "%");
	                	}
	                	if(jobNo != null) {
	                		teacherExampleCriteria.andJobNoLike("%" + jobNo + "%");
	                	}
	                	if(isMan != null) {
	                		teacherExampleCriteria.andManEqualTo(isMan);
	                	}
	                	
	                	List<Teacher> teacherList = teacherMapper.selectByExample(teacherExample);
	                	
	                	return teacherList;
	                } ).build();
		}
        return listTeachers;
    }

	@Autowired(required = true)
	public void setTeacherMapper(TeacherMapper teacherMapper) {
		TeacherType.teacherMapper = teacherMapper;
	}
	
	@Autowired(required = true)
	public void setClassMapper(ClassMapper classMapper) {
		TeacherType.classMapper = classMapper;
	}
}
