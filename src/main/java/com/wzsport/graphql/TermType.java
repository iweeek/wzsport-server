package com.wzsport.graphql;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.wzsport.mapper.TermMapper;
import com.wzsport.mapper.TermSportsTaskMapper;
import com.wzsport.model.Term;
import com.wzsport.model.TermSportsTask;

import graphql.Scalars;
import graphql.schema.GraphQLArgument;
import graphql.schema.GraphQLFieldDefinition;
import graphql.schema.GraphQLList;
import graphql.schema.GraphQLObjectType;

/**
* Term GraphQL Type.
* 
* @author x1ny
* @date 2017年5月28日
*/
@Component
public class TermType {

	private static SqlSessionFactory sqlSessionFactory;
	private static GraphQLObjectType type;
	private static GraphQLFieldDefinition singleQueryField;
	private static GraphQLFieldDefinition listQueryField;

	private TermType() {}
	
	public static GraphQLObjectType getType() {
		if(type == null) {
			type = GraphQLObjectType.newObject()
					.name("Term")
					.field(GraphQLFieldDefinition.newFieldDefinition()
							.name("id")
							.type(Scalars.GraphQLInt)
							.build())
					.field(GraphQLFieldDefinition.newFieldDefinition()
							.name("universityId")
							.type(Scalars.GraphQLInt)
							.build())
					.field(GraphQLFieldDefinition.newFieldDefinition()
							.name("name")
							.type(Scalars.GraphQLString)
							.build())
					.field(GraphQLFieldDefinition.newFieldDefinition()
							.name("startDate")
							.type(Scalars.GraphQLLong)
							.dataFetcher(environment ->  {
								Term term = environment.getSource();
			                	return term.getStartDate().getTime();
							} )
							.build())
					.field(GraphQLFieldDefinition.newFieldDefinition()
							.name("endDate")
							.type(Scalars.GraphQLLong)
							.dataFetcher(environment ->  {
								Term term = environment.getSource();
			                	return term.getEndDate().getTime();
							} )
							.build())
					.field(GraphQLFieldDefinition.newFieldDefinition()
							.name("termSportsTask")
							.type(TermSportsTaskType.getType())
							.dataFetcher(environment ->  {
								Term term = environment.getSource();
								SqlSession sqlSession = sqlSessionFactory.openSession();
			                	TermSportsTask termSportsTask = sqlSession.getMapper(TermSportsTaskMapper.class).getTermSportsTaskByTermId(term.getId());
			                	sqlSession.close();
			                	return termSportsTask;
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
	                .name("term")
	                .type(getType())
	                .dataFetcher(environment -> {
	                	int id = environment.getArgument("id");
	                	SqlSession sqlSession = sqlSessionFactory.openSession();
	                	Term term = sqlSession.getMapper(TermMapper.class).getTermById(id);
	                	sqlSession.close();
	                	return term;
	                } )
	                .build();
		}
		
        return singleQueryField;
    }
	
	public static GraphQLFieldDefinition getListQueryField() {
		if(listQueryField == null) {
			listQueryField = GraphQLFieldDefinition.newFieldDefinition()
	        		.argument(GraphQLArgument.newArgument().name("universityId").type(Scalars.GraphQLInt).build())
	                .name("terms")
	                .type(new GraphQLList(getType()))
	                .dataFetcher(environment -> {
	                	int universityId = environment.getArgument("universityId");
	                	SqlSession sqlSession = sqlSessionFactory.openSession();
	                	List<Term> termList = sqlSession.getMapper(TermMapper.class).listTermByUniversiyId(universityId);
	                	sqlSession.close();
	                	return termList;
	                } ).build();
		}
        return listQueryField;
    }
	
	public SqlSessionFactory getSqlSessionFactory() {
		return sqlSessionFactory;
	}

	@Autowired(required = true)
	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		TermType.sqlSessionFactory = sqlSessionFactory;
	}
}
