package com.wzsport.graphql;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.wzsport.mapper.CollegeMapper;
import com.wzsport.mapper.MajorMapper;
import com.wzsport.model.College;
import com.wzsport.model.Major;

import graphql.Scalars;
import graphql.schema.GraphQLArgument;
import graphql.schema.GraphQLFieldDefinition;
import graphql.schema.GraphQLList;
import graphql.schema.GraphQLObjectType;

/**
* GraphQL学院类型的定义及查询字段定义
* 
* @author x1ny
* @date 2017年5月25日
*/
@Component
public class CollegeType {

	private static SqlSessionFactory sqlSessionFactory;
	private static GraphQLObjectType type;
	private static GraphQLFieldDefinition singleQueryField;
	private static GraphQLFieldDefinition listQueryField;

	private CollegeType() {}
	
	public static GraphQLObjectType getType() {
		if(type == null) {
			type = GraphQLObjectType.newObject()
					.name("College")
					.field(GraphQLFieldDefinition.newFieldDefinition()
							.name("id")
							.type(Scalars.GraphQLInt)
							.build())
					.field(GraphQLFieldDefinition.newFieldDefinition()
							.name("name")
							.type(Scalars.GraphQLString)
							.build())
					.field(GraphQLFieldDefinition.newFieldDefinition()
							.name("universityId")
							.type(Scalars.GraphQLInt)
							.build())
					.field(GraphQLFieldDefinition.newFieldDefinition()
							.name("majors")
							.type(new GraphQLList(MajorType.getType()))
							.dataFetcher(environment ->  {
								College college = environment.getSource();
								SqlSession sqlSession = sqlSessionFactory.openSession();
			                	List<Major> majorList = sqlSession.getMapper(MajorMapper.class).listMajorByCollegeId(college.getId());
			                	sqlSession.close();
			                	return majorList;
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
	                .name("college")
	                .type(getType())
	                .dataFetcher(environment ->  {
	                	int id = environment.getArgument("id");
	                	SqlSession sqlSession = sqlSessionFactory.openSession();
	                	College college = sqlSession.getMapper(CollegeMapper.class).getCollegeById(id);
	                	sqlSession.close();
	                	return college;
	                } ).build();
		}
        return singleQueryField;
    }
	
	public static GraphQLFieldDefinition getListQueryField() {
		if(listQueryField == null) {
			listQueryField = GraphQLFieldDefinition.newFieldDefinition()
	        		.argument(GraphQLArgument.newArgument().name("universityId").type(Scalars.GraphQLInt).build())
	                .name("colleges")
	                .type(new GraphQLList(getType()))
	                .dataFetcher(environment ->  {
	                	int universityId = environment.getArgument("universityId");
	                	SqlSession sqlSession = sqlSessionFactory.openSession();
	                	List<College> collegeList = sqlSession.getMapper(CollegeMapper.class).listCollegeByUniversityId(universityId);
	                	sqlSession.close();
	                	return collegeList;
	                } ).build();
		}
        return listQueryField;
    }
	
	public SqlSessionFactory getSqlSessionFactory() {
		return sqlSessionFactory;
	}

	@Autowired(required = true)
	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		CollegeType.sqlSessionFactory = sqlSessionFactory;
	}
}
