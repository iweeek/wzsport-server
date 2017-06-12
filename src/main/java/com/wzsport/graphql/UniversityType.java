package com.wzsport.graphql;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.wzsport.mapper.CollegeMapper;
import com.wzsport.mapper.TeacherMapper;
import com.wzsport.mapper.UniversityMapper;
import com.wzsport.model.College;
import com.wzsport.model.CollegeExample;
import com.wzsport.model.TeacherExample;
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

	private static UniversityMapper universityMapper;
	private static CollegeMapper collegeMapper;
	private static TeacherMapper teacherMapper;
	private static GraphQLObjectType type;
	private static GraphQLFieldDefinition singleQueryField;

	private UniversityType() {}
	
	public static GraphQLObjectType getType() {
		if(type == null) {
			type = GraphQLObjectType.newObject()
					.name("University")
					.description("大学类型")
					.field(GraphQLFieldDefinition.newFieldDefinition()
							.name("id")
							.description("唯一主键")
							.type(Scalars.GraphQLLong)
							.build())
					.field(GraphQLFieldDefinition.newFieldDefinition()
							.name("name")
							.description("大学名称")
							.type(Scalars.GraphQLString)
							.build())
					.field(GraphQLFieldDefinition.newFieldDefinition()
							.name("colleges")
							.description("该大学中的所有学院")
							.type(new GraphQLList(CollegeType.getType()))
							.dataFetcher(environment ->  {
								University university = environment.getSource();
								CollegeExample collegeExample = new CollegeExample();
								collegeExample.createCriteria().andUniversityIdEqualTo(university.getId());
			                	List<College> collegeList = collegeMapper.selectByExample(collegeExample);
			                	return collegeList;
							} )
							.build())
					.field(GraphQLFieldDefinition.newFieldDefinition()
							.name("teachersCount")
							.description("该大学中的教师总数")
							.type(Scalars.GraphQLInt)
							.dataFetcher(environment ->  {
								University university = environment.getSource();
								TeacherExample teacherExample = new TeacherExample();
								teacherExample.createCriteria().andUniversityIdEqualTo(university.getId());
			                	int teachersCount = (int) teacherMapper.countByExample(teacherExample);
			                	return teachersCount;
							} )
							.build())
					.field(GraphQLFieldDefinition.newFieldDefinition()
							.name("maleTeachersCount")
							.description("该大学中的男性教师总数")
							.type(Scalars.GraphQLInt)
							.dataFetcher(environment ->  {
								University university = environment.getSource();
								TeacherExample teacherExample = new TeacherExample();
								teacherExample.createCriteria().andUniversityIdEqualTo(university.getId()).andManEqualTo(true);
			                	int maleTeachersCount = (int) teacherMapper.countByExample(teacherExample);
			                	return maleTeachersCount;
							} )
							.build())
					.field(GraphQLFieldDefinition.newFieldDefinition()
							.name("femaleTeachersCount")
							.description("该大学中的女性教师总数")
							.type(Scalars.GraphQLInt)
							.dataFetcher(environment ->  {
								University university = environment.getSource();
								TeacherExample teacherExample = new TeacherExample();
								teacherExample.createCriteria().andUniversityIdEqualTo(university.getId()).andManEqualTo(false);
			                	int femaleTeachersCount = (int) teacherMapper.countByExample(teacherExample);
			                	return femaleTeachersCount;
							} )
							.build())
//					.field(GraphQLFieldDefinition.newFieldDefinition()
//							.name("caloriesConsumptionRanking")
//							.type(new GraphQLList(StudentCaloriesConsumptionType.getType()))
//							.dataFetcher(environment ->  {
//								University university = environment.getSource();
//			                	return universityMapper.getCalorieCostedRanking(university.getId(), 10);
//							} )
//							.build())
//					.field(GraphQLFieldDefinition.newFieldDefinition()
//							.name("timeCostedRanking")
//							.type(new GraphQLList(StudentTimeCostedType.getType()))
//							.dataFetcher(environment ->  {
//								University university = environment.getSource();
//			                	return universityMapper.getTimeCostedRanking(university.getId(), 10);
//							} )
//							.build())
					.build();
			
		}
		
		return type;
	}
	
	public static GraphQLFieldDefinition getSingleQueryField() {
		if(singleQueryField == null) {
			singleQueryField = GraphQLFieldDefinition.newFieldDefinition()
	        		.argument(GraphQLArgument.newArgument().name("id").type(Scalars.GraphQLLong).build())
	                .name("university")
	                .description("根据ID获取大学")
	                .type(getType())
	                .dataFetcher(environment ->  {
	                	long id = environment.getArgument("id");
	                	University university = universityMapper.selectByPrimaryKey(id);
	                	return university;
	                } ).build();
		}
        return singleQueryField;
    }

	@Autowired(required = true)
	public void setCollegeMapper(CollegeMapper collegeMapper) {
		UniversityType.collegeMapper = collegeMapper;
	}
	
	@Autowired(required = true)
	public void setTeacherMapper(TeacherMapper teacherMapper) {
		UniversityType.teacherMapper = teacherMapper;
	}
	
	@Autowired(required = true)
	public void setUniversityMapper(UniversityMapper universityMapper) {
		UniversityType.universityMapper = universityMapper;
	}
}
