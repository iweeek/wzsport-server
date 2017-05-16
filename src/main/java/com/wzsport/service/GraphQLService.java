package com.wzsport.service;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wzsport.mapper.UserMapper;
import com.wzsport.model.User;

import graphql.ExecutionResult;
import graphql.GraphQL;
import graphql.Scalars;
import graphql.schema.GraphQLArgument;
import graphql.schema.GraphQLFieldDefinition;
import graphql.schema.GraphQLObjectType;
import graphql.schema.GraphQLSchema;

/**
* @ClassName: GraphQLService
* @Description: GraphQL查询服务
* @author x1ny
* @date 2017年5月15日
*/
@Service
public class GraphQLService {

	private static SqlSessionFactory sqlSessionFactory;
	private GraphQL graphQL;
	
	public GraphQLService() {
		//创建GraphQL实例
		GraphQLObjectType queryType = GraphQLObjectType.newObject()
                .name("queryType")
                .field(createUserField())
                .build();
		
		GraphQLSchema schema = GraphQLSchema.newSchema()
                .query(queryType)
                .build();
		
		graphQL = GraphQL.newGraphQL(schema).build();
	}
	
	/**
	* @author x1ny
	* @date 2017年5月15日
	* @Description: 执行GraphQL查询
	* @param queryString
	* @return
	* @throws
	*/
	public ExecutionResult query(String queryString) {
		return graphQL.execute(queryString);
	}
	
	/**
	* @author x1ny
	* @date 2017年5月15日
	* @Description: 创建GraphQL User查询类
	* @return
	* @throws
	*/
	private GraphQLFieldDefinition createUserField() {
        return GraphQLFieldDefinition.newFieldDefinition()
        		.argument(GraphQLArgument.newArgument().name("id").type(Scalars.GraphQLInt).build())
                .name("user")
                .type(User.createGraphQLObjectType())
                .dataFetcher(environment ->  {
                	int id = environment.getArgument("id");
                	SqlSession sqlSession = sqlSessionFactory.openSession();
                	UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
                	User user = userMapper.getUserById(id);
                	sqlSession.close();
                	return user;
                } ).build();
    }

	public SqlSessionFactory getSqlSessionFactory() {
		return sqlSessionFactory;
	}

	@Autowired(required = true)
	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		GraphQLService.sqlSessionFactory = sqlSessionFactory;
	}
}
