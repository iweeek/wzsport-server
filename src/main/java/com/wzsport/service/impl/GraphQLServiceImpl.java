package com.wzsport.service.impl;

import org.springframework.stereotype.Service;

import com.wzsport.graphql.ClassType;
import com.wzsport.graphql.CollegeType;
import com.wzsport.graphql.FitnessCheckDataType;
import com.wzsport.graphql.MajorType;
import com.wzsport.graphql.RunningActivityType;
import com.wzsport.graphql.RunningProjectType;
import com.wzsport.graphql.SportScoreType;
import com.wzsport.graphql.StudentType;
import com.wzsport.graphql.TeacherType;
import com.wzsport.graphql.TermType;
import com.wzsport.graphql.UniversityType;
import com.wzsport.service.GraphQLService;

import graphql.ExecutionResult;
import graphql.GraphQL;
import graphql.schema.GraphQLObjectType;
import graphql.schema.GraphQLSchema;


/**
* GraphQL查询服务实现类
* 
* @author x1ny
* @date 2017年5月24日
*/
@Service
public class GraphQLServiceImpl implements GraphQLService {

	private GraphQL graphQL;
	
	public GraphQLServiceImpl() {
		//创建GraphQL实例
		GraphQLObjectType queryType = GraphQLObjectType.newObject()
                .name("root")
//                .field(createUserField())
                .field(UniversityType.getSingleQueryField())
                .field(CollegeType.getSingleQueryField())
                .field(CollegeType.getListQueryField())
                .field(MajorType.getSingleQueryField())
                .field(MajorType.getListQueryField())
                .field(ClassType.getSingleQueryField())
                .field(ClassType.getListQueryField())
                .field(StudentType.getSingleQueryField())
                .field(StudentType.getListQueryField())
                .field(StudentType.getListQueryByConditionsField())
                .field(TeacherType.getSingleQueryField())
                .field(TeacherType.getListQueryField())
                .field(RunningProjectType.getSingleQueryField())
                .field(RunningProjectType.getListQueryField())
                .field(RunningActivityType.getSingleQueryField())
                .field(RunningActivityType.getListQueryField())
                .field(TermType.getSingleQueryField())
                .field(TermType.getListQueryField())
                .field(FitnessCheckDataType.getListQueryField())
                .field(FitnessCheckDataType.getSingleQueryField())
                .field(SportScoreType.getListQueryField())
                .field(SportScoreType.getSingleQueryField())
                .build();
		
		GraphQLSchema schema = GraphQLSchema.newSchema()
                .query(queryType)
                .build();
		
		graphQL = GraphQL.newGraphQL(schema).build();
	}
	

	/* (non-Javadoc)
	 * @see com.wzsport.service.GraphQLService#query(java.lang.String)
	 */
	public ExecutionResult query(String queryString) {
		return graphQL.execute(queryString);
	}
	
//	/**
//	* @author x1ny
//	* @date 2017年5月15日
//	* @Description: 创建GraphQL User查询类
//	* @return
//	* @throws
//	*/
//	private GraphQLFieldDefinition createUserField() {
//        return GraphQLFieldDefinition.newFieldDefinition()
//        		.argument(GraphQLArgument.newArgument().name("id").type(Scalars.GraphQLInt).build())
//                .name("user")
//                .type(User.createGraphQLObjectType())
//                .dataFetcher(environment ->  {
//                	int id = environment.getArgument("id");
//                	SqlSession sqlSession = sqlSessionFactory.openSession();
//                	UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
//                	User user = userMapper.getUserById(id);
//                	sqlSession.close();
//                	return user;
//                } ).build();
//    }
}
