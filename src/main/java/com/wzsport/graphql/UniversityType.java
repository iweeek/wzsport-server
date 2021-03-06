package com.wzsport.graphql;

import static org.hamcrest.CoreMatchers.not;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.mysql.cj.api.x.io.MessageWriter;
import com.wzsport.dto.StudentKcalConsumptionDTO;
import com.wzsport.dto.StudentTimeCostedDTO;
import com.wzsport.mapper.CollegeMapper;
import com.wzsport.mapper.StudentConsumeRankMapper;
import com.wzsport.mapper.StudentTimecostedRankMapper;
import com.wzsport.mapper.TeacherMapper;
import com.wzsport.mapper.UniversityMapper;
import com.wzsport.model.College;
import com.wzsport.model.CollegeExample;
import com.wzsport.model.Student;
import com.wzsport.model.StudentConsumeRank;
import com.wzsport.model.StudentConsumeRankExample;
import com.wzsport.model.StudentExample;
import com.wzsport.model.StudentTimecostedRank;
import com.wzsport.model.StudentTimecostedRankExample;
import com.wzsport.model.TeacherExample;
import com.wzsport.model.Term;
import com.wzsport.model.University;
import com.wzsport.model.UniversityExample;
import com.wzsport.service.TermService;
import com.wzsport.util.MyDateUtil;

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
	private static StudentConsumeRankMapper studentConsumeRankMapper;
	private static StudentTimecostedRankMapper studentTimecostedRankMapper;
	private static CollegeMapper collegeMapper;
	private static TeacherMapper teacherMapper;
	private static TermService termService;
	private static GraphQLObjectType type;
	private static GraphQLFieldDefinition singleQueryField;
	private static GraphQLFieldDefinition listField;

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
					.field(GraphQLFieldDefinition.newFieldDefinition()
                            .name("kcalConsumptionRanking")
                            .description("该校的学生累计热量消耗量排行榜")
                            .argument(GraphQLArgument.newArgument().name("pageNumber").type(Scalars.GraphQLInt).build())
                            .argument(GraphQLArgument.newArgument().name("pageSize").type(Scalars.GraphQLInt).build())
                            .type(PageType.getPageTypeBuidler(StudentKcalConsumptionType.getType())
                                    .name("StudentKcalConsumptionPage")
                                    .description("学生卡路里消耗量分页")
                                    .build())
                            .dataFetcher(environment ->  {
                                University university = environment.getSource();
                                StudentConsumeRankExample example = new StudentConsumeRankExample();
                                example.createCriteria().andUniversityIdEqualTo(university.getId());
                                
                                PageHelper.startPage(environment.getArgument("pageNumber"), environment.getArgument("pageSize"));
                                List<StudentKcalConsumptionDTO> list = studentConsumeRankMapper.getKcalCostedRanking(university.getId());
                                
                                return list;
//                                return universityMapper.getKcalCostedRanking(university.getId());
                            } )
                            .build())
//					.field(GraphQLFieldDefinition.newFieldDefinition()
//							.name("kcalConsumptionRanking")
//							.description("该校的学生累计热量消耗量排行榜")
//							.argument(GraphQLArgument.newArgument().name("pageNumber").type(Scalars.GraphQLInt).build())
//							.argument(GraphQLArgument.newArgument().name("pageSize").type(Scalars.GraphQLInt).build())
//							.argument(GraphQLArgument.newArgument().name("period").type(Scalars.GraphQLInt).build())
//							.argument(GraphQLArgument.newArgument().name("collegeId").type(Scalars.GraphQLLong).build())
//							.argument(GraphQLArgument.newArgument().name("majorId").type(Scalars.GraphQLLong).build())
//							.argument(GraphQLArgument.newArgument().name("grade").type(Scalars.GraphQLInt).build())
//							.argument(GraphQLArgument.newArgument().name("isMan").type(Scalars.GraphQLBoolean).build())
//							.type(PageType.getPageTypeBuidler(StudentKcalConsumptionType.getType())
//									.name("StudentKcalConsumptionPage")
//									.description("学生卡路里消耗量分页")
//									.build())
//							.dataFetcher(environment ->  {
//								University university = environment.getSource();
//								
//								Integer period = environment.getArgument("period");
//								Date start = null;
//								if (period != null) {
//								    switch (period) {
//								    case 0:
//                                        start = MyDateUtil.getCurrentWeekStartDate();
//                                        break;
//                                    case 1:
//                                        start = MyDateUtil.getCurrentMonthStartDate();
//                                        break;
//                                    case 2:
//                                        Term currentTerm = termService.getCurrentTerm(university.getId());
//                                        if (currentTerm == null) {
//                                            return 0;
//                                        } else {
//                                            start = currentTerm.getStartDate();
//                                        }
//                                        break;
//                                    default:
//                                        start = MyDateUtil.getCurrentWeekStartDate();
//                                        break;
//								    }
//								} else {
//								    start = MyDateUtil.getCurrentWeekStartDate();
//								}
//								
//								Long collegeId = environment.getArgument("collegeId");
//								
//								Integer grade = environment.getArgument("grade");
//								
//								PageHelper.startPage(environment.getArgument("pageNumber"), environment.getArgument("pageSize"));
//								
////								 return universityMapper.getKcalCostedRankingByDate(university.getId(), start);
//								
//								if (collegeId == null) {
//								    if (grade == null) {
//								        return universityMapper.getKcalCostedRankingByDate(university.getId(), start);
//								    } else {
//								        return universityMapper.getKcalCostedRankingByDateGrade(university.getId(), start, grade);
//								    }
//								} else {
//								    return universityMapper.getKcalCostedRankingByDateGradeCollege(university.getId(), start, grade, collegeId);
//								}
//								
//							} )
//							.build())
					.field(GraphQLFieldDefinition.newFieldDefinition()
							.name("timeCostedRanking")
							.description("该校的学生累计锻炼时长排行榜")
							.argument(GraphQLArgument.newArgument().name("pageNumber").type(Scalars.GraphQLInt).build())
							.argument(GraphQLArgument.newArgument().name("pageSize").type(Scalars.GraphQLInt).build())
							.type(PageType.getPageTypeBuidler(StudentTimeCostedType.getType())
									.name("StudentTimeCostedPage")
									.description("学生锻炼时间累计分页")
									.build())
							.dataFetcher(environment ->  {
								University university = environment.getSource();
								PageHelper.startPage(environment.getArgument("pageNumber"), environment.getArgument("pageSize"));
                                	List<StudentTimeCostedDTO> list = 
                                			studentTimecostedRankMapper.getTimeCostedRanking(university.getId());
                                
                                return list;
//			                	return universityMapper.getTimeCostedRanking(university.getId());
							} )
							.build())
					.field(GraphQLFieldDefinition.newFieldDefinition()
							.name("currentTerm")
							.type(TermType.getType())
							.dataFetcher(environment ->  {
								University university = environment.getSource();
								return termService.getCurrentTerm(university.getId());
							} )
							.build())
					.build();
		}
		
		return type;
	}
	
	public static GraphQLFieldDefinition getSingleQueryField() {
		if(singleQueryField == null) {
			singleQueryField = GraphQLFieldDefinition.newFieldDefinition()
	                .name("university")
	                .description("根据ID获取大学")
	                .argument(GraphQLArgument.newArgument().name("id").type(Scalars.GraphQLLong).build())
	                .type(getType())
	                .dataFetcher(environment ->  {
	                	long id = environment.getArgument("id");
	                	University university = universityMapper.selectByPrimaryKey(id);
	                	return university;
	                } ).build();
		}
        return singleQueryField;
    }
	
	public static GraphQLFieldDefinition getListField() {
		if (listField == null) {
			listField = GraphQLFieldDefinition.newFieldDefinition()
					.name("universities")
	                .description("获取大学列表")
	                .type(new GraphQLList(getType()))
					.dataFetcher(environment -> {
						UniversityExample example = new UniversityExample();
						example.createCriteria().andIdGreaterThan(0L);
						List<University> list = universityMapper.selectByExample(example);
						return list;
					}).build();
		}
		return listField;
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
	
	@Autowired(required = true)
	public void setTermService(TermService termService) {
		UniversityType.termService = termService;
	}
	
	@Autowired(required = true)
	public void setStudentConsumeRankMapper(StudentConsumeRankMapper studentConsumeRankMapper) {
		UniversityType.studentConsumeRankMapper = studentConsumeRankMapper;
	}
	
	@Autowired(required = true)
	public void setStudentTimecostedRankMapper(StudentTimecostedRankMapper studentTimecostedRankMapper) {
		UniversityType.studentTimecostedRankMapper = studentTimecostedRankMapper;
	}
}
