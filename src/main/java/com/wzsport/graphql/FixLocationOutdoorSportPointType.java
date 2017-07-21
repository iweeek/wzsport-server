package com.wzsport.graphql;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.wzsport.mapper.FixLocationOutdoorSportPointMapper;
import com.wzsport.model.FixLocationOutdoorSportPoint;
import com.wzsport.model.FixLocationOutdoorSportPointExample;
import graphql.Scalars;
import graphql.schema.GraphQLArgument;
import graphql.schema.GraphQLFieldDefinition;
import graphql.schema.GraphQLList;
import graphql.schema.GraphQLObjectType;

/**
* GraphQL班级类型的定义及查询字段定义
* 
* @author chaiyu
* @date 2017年7月21日
*/
@Component
public class FixLocationOutdoorSportPointType {
	private static GraphQLObjectType type;
	private static GraphQLFieldDefinition listQueryField;
	private static FixLocationOutdoorSportPointMapper fixLocationOutdoorSportPointMapper;

	private FixLocationOutdoorSportPointType() {}
	
	public static GraphQLObjectType getType() {
		if(type == null) {
			type = GraphQLObjectType.newObject()
					.name("FixLocationOutdoorSportPoint")
					.description("室外定点运动地点")
					.field(GraphQLFieldDefinition.newFieldDefinition()
							.name("id")
							.type(Scalars.GraphQLLong)
							.description("唯一主键")
							.build())
					.field(GraphQLFieldDefinition.newFieldDefinition()
							.name("name")
							.description("运动地点名称")
							.type(Scalars.GraphQLString)
							.build())
					.field(GraphQLFieldDefinition.newFieldDefinition()
							.name("latitude")
							.description("纬度")
							.type(Scalars.GraphQLFloat)
							.build())
					.field(GraphQLFieldDefinition.newFieldDefinition()
							.name("longitude")
							.description("经度")
							.type(Scalars.GraphQLFloat)
							.build())
					.field(GraphQLFieldDefinition.newFieldDefinition()
							.name("radius")
							.description("半径（米）")
							.type(Scalars.GraphQLLong)
							.build())
					.field(GraphQLFieldDefinition.newFieldDefinition()
							.name("universityId")
							.description("所属大学的ID")
							.type(Scalars.GraphQLLong)
							.build())
					.build();
		}
		
		return type;
	}
	
	public static GraphQLFieldDefinition getListQueryField() {
		if(listQueryField == null) {
			listQueryField = GraphQLFieldDefinition.newFieldDefinition()
	        		.argument(GraphQLArgument.newArgument().name("universityId").type(Scalars.GraphQLLong).build())
	                .name("points")
	                .description("根据学校ID获取关联的固定运动的地点")
	                .type(new GraphQLList(getType()))
	                .dataFetcher(environment -> {
	                	int universityId = environment.getArgument("universityId");
	                	FixLocationOutdoorSportPointExample example = new FixLocationOutdoorSportPointExample();
	                	example.createCriteria().andUniversityIdEqualTo(universityId);
	                	List<FixLocationOutdoorSportPoint> pointList = fixLocationOutdoorSportPointMapper.selectByExample(example);
	                	return pointList;
	                } ).build();
		}
        return listQueryField;
    }

	@Autowired(required = true) 
	public void setClassMapper(FixLocationOutdoorSportPointMapper fixLocationOutdoorSportPointMapper) {
		FixLocationOutdoorSportPointType.fixLocationOutdoorSportPointMapper = fixLocationOutdoorSportPointMapper;
	}
}
