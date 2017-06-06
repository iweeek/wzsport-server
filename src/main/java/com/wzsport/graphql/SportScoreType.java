package com.wzsport.graphql;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.wzsport.mapper.SportScoreMapper;
import com.wzsport.model.SportScore;
import com.wzsport.model.SportScoreExample;

import graphql.Scalars;
import graphql.schema.GraphQLArgument;
import graphql.schema.GraphQLFieldDefinition;
import graphql.schema.GraphQLList;
import graphql.schema.GraphQLObjectType;
/**
 * SportScore Type
 * @author linhongyong
 * 2017年5月27日
 */
@Component
public class SportScoreType {
	
	private static SportScoreMapper sportScoreMapper;
	private static GraphQLObjectType type;
	private static GraphQLFieldDefinition singleQueryField;
	private static GraphQLFieldDefinition listQueryField;
	
	public SportScoreType() {}
	
	public static GraphQLObjectType getType() {
		if(type == null) {
			type = GraphQLObjectType.newObject()
					.name("SportScore")
					.field(GraphQLFieldDefinition.newFieldDefinition()
							.name("id")
							.type(Scalars.GraphQLLong)
							.build())
					.field(GraphQLFieldDefinition.newFieldDefinition()
							.name("studentId")
							.type(Scalars.GraphQLLong)
							.build())
					.field(GraphQLFieldDefinition.newFieldDefinition()
							.name("meter50SprintTime")
							.type(Scalars.GraphQLFloat)
							.build())
					.field(GraphQLFieldDefinition.newFieldDefinition()
							.name("meter50SprintScore")
							.type(Scalars.GraphQLInt)
							.build())
					.field(GraphQLFieldDefinition.newFieldDefinition()
							.name("standingJumpDistance")
							.type(Scalars.GraphQLInt)
							.build())
					.field(GraphQLFieldDefinition.newFieldDefinition()
							.name("standingJumpScore")
							.type(Scalars.GraphQLInt)
							.build())
					.field(GraphQLFieldDefinition.newFieldDefinition()
							.name("meter1500RunTime")
							.type(Scalars.GraphQLInt)
							.build())
					.field(GraphQLFieldDefinition.newFieldDefinition()
							.name("meter1500RunScore")
							.type(Scalars.GraphQLInt)
							.build())
					.field(GraphQLFieldDefinition.newFieldDefinition()
							.name("abdominalCurlCount")
							.type(Scalars.GraphQLInt)
							.build())
					.field(GraphQLFieldDefinition.newFieldDefinition()
							.name("abdominalCurlScore")
							.type(Scalars.GraphQLInt)
							.build())
					.build();
		}
		
		return type;
	}
	
	public static GraphQLFieldDefinition getSingleQueryField() {
		if(singleQueryField == null) {
			singleQueryField = GraphQLFieldDefinition.newFieldDefinition()
	        		.argument(GraphQLArgument.newArgument().name("id").type(Scalars.GraphQLLong).build())
	                .name("sportScore")
	                .type(getType())
	                .dataFetcher(environment ->  {
	                	long id = environment.getArgument("id");
	                	SportScore sportScore = sportScoreMapper.selectByPrimaryKey(id);
	                	return sportScore;
	                } ).build();
		}
        return singleQueryField;
    }
	
	public static GraphQLFieldDefinition getListQueryField() {
		if(listQueryField == null) {
			listQueryField = GraphQLFieldDefinition.newFieldDefinition()
	        		.argument(GraphQLArgument.newArgument().name("studentId").type(Scalars.GraphQLLong).build())
	                .name("sportScores")
	                .type(new GraphQLList(getType()))
	                .dataFetcher(environment -> {
	                	long studentId = environment.getArgument("studentId");
	                	SportScoreExample sportScoreExample = new SportScoreExample();
	                	sportScoreExample.createCriteria().andStudentIdEqualTo(studentId);
	                	List<SportScore> sportScoreList = sportScoreMapper.selectByExample(sportScoreExample);
	                	return sportScoreList;
	                } ).build();
		}
        return listQueryField;
    }

	@Autowired(required = true)
	public void setSportScoreMapper(SportScoreMapper sportScoreMapper) {
		SportScoreType.sportScoreMapper = sportScoreMapper;
	}
}
