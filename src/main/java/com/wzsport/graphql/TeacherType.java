package com.wzsport.graphql;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.wzsport.mapper.ClassMapper;
import com.wzsport.mapper.TeacherMapper;
import com.wzsport.model.Class;
import com.wzsport.model.Teacher;

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
	
	private static SqlSessionFactory sqlSessionFactory;
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
							.type(Scalars.GraphQLInt)
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
							.name("man")
							.type(Scalars.GraphQLBoolean)
							.build())
					.field(GraphQLFieldDefinition.newFieldDefinition()
							.name("classes")
							.type(new GraphQLList(ClassType.getType()))
							.dataFetcher(environment ->  {
								Teacher teacher = environment.getSource();
								SqlSession sqlSession = sqlSessionFactory.openSession();
			                	List<Class> classList = sqlSession.getMapper(ClassMapper.class).listClassByTeacherId(teacher.getId());
			                	sqlSession.close();
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
	        		.argument(GraphQLArgument.newArgument().name("id").type(Scalars.GraphQLInt).build())
	                .name("teacher")
	                .type(getType())
	                .dataFetcher(environment -> {
	                	int id = environment.getArgument("id");
	                	SqlSession sqlSession = sqlSessionFactory.openSession();
	                	Teacher teacher = sqlSession.getMapper(TeacherMapper.class).getTeacherById(id);
	                	sqlSession.close();
	                	return teacher;
	                } )
	                .build();
		}
		
        return singleQueryField;
    }
	
	public static GraphQLFieldDefinition getListQueryField() {
		if(listQueryField == null) {
			listQueryField = GraphQLFieldDefinition.newFieldDefinition()
	        		.argument(GraphQLArgument.newArgument().name("classId").type(Scalars.GraphQLInt).build())
	                .name("teachers")
	                .type(new GraphQLList(getType()))
	                .dataFetcher(environment -> {
	                	int classId = environment.getArgument("classId");
	                	SqlSession sqlSession = sqlSessionFactory.openSession();
	                	List<Teacher> teacherList = sqlSession.getMapper(TeacherMapper.class).listTeacherByClassId(classId);
	                	sqlSession.close();
	                	return teacherList;
	                } ).build();
		}
        return listQueryField;
    }
	
	/**
	 * 根据 工号+姓名+性别chaxun
	 * @return
	 */
	public static GraphQLFieldDefinition getListTeacherByJobNoAndNameAndSex() {
		if(listTeachers == null) {
			listTeachers = GraphQLFieldDefinition.newFieldDefinition()
					.name("searchTeachers")
	        		.argument(GraphQLArgument.newArgument().name("jobNo").type(Scalars.GraphQLString).build())
	        		.argument(GraphQLArgument.newArgument().name("name").type(Scalars.GraphQLString).build())
	        		.argument(GraphQLArgument.newArgument().name("man").type(Scalars.GraphQLBoolean).build())
	                .type(new GraphQLList(getType()))
	                .dataFetcher(environment -> {
	                	String jobNo = environment.getArgument("jobNo");
	                	String name = environment.getArgument("name");
	                	Boolean isMan = environment.getArgument("man");
	                	SqlSession sqlSession = sqlSessionFactory.openSession();
	                	List<Teacher> teacherList = sqlSession.getMapper(TeacherMapper.class).searcherTeachers(jobNo,name,isMan);
	                	sqlSession.close();
	                	return teacherList;
	                } ).build();
		}
        return listTeachers;
    }
	
	public SqlSessionFactory getSqlSessionFactory() {
		return sqlSessionFactory;
	}

	@Autowired(required = true)
	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		TeacherType.sqlSessionFactory = sqlSessionFactory;
	}
}
