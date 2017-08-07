package com.wzsport.graphql;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.wzsport.service.AndroidVersionInfoService;

import graphql.Scalars;
import graphql.schema.GraphQLFieldDefinition;
import graphql.schema.GraphQLObjectType;

@Component
public class AndroidVersionInfoType {

	private static AndroidVersionInfoService androidVersionInfoService;
	private static GraphQLObjectType type;
	private static GraphQLFieldDefinition latestVerisonQueryField;
	
	public static GraphQLObjectType getType() {
		if(type == null) {
			type = GraphQLObjectType.newObject()
					.name("AndroidVersionInfo")
					.description("安卓版本信息")
					.field(GraphQLFieldDefinition.newFieldDefinition()
							.name("id")
							.type(Scalars.GraphQLLong)
							.description("唯一主键")
							.build())
					.field(GraphQLFieldDefinition.newFieldDefinition()
							.name("versionName")
							.type(Scalars.GraphQLString)
							.description("版本名称")
							.build())
					.field(GraphQLFieldDefinition.newFieldDefinition()
							.name("versionCode")
							.type(Scalars.GraphQLInt)
							.description("版本号")
							.build())
					.field(GraphQLFieldDefinition.newFieldDefinition()
							.name("changeLog")
							.type(Scalars.GraphQLString)
							.description("版本更新信息")
							.build())
					.field(GraphQLFieldDefinition.newFieldDefinition()
							.name("apkUrl")
							.type(Scalars.GraphQLString)
							.description("安装包下载地址")
							.build())
					.field(GraphQLFieldDefinition.newFieldDefinition()
							.name("isForced")
							.type(Scalars.GraphQLBoolean)
							.description("是否强制安装")
							.build())
					.build();
		}
		
		return type;
	}
	
	public static GraphQLFieldDefinition getLatestVerisonQueryField() {
		if(latestVerisonQueryField == null) {
			latestVerisonQueryField = GraphQLFieldDefinition.newFieldDefinition()
	                .name("latestAndroidVerisonInfo")
	                .description("获取安卓最新版本信息")
	                .type(getType())
	                .dataFetcher(environment ->  {
	                	return androidVersionInfoService.getLatestVersionInfo();
	                } ).build();
		}
        return latestVerisonQueryField;
    }
	
	@Autowired(required = true) 
	public void setAndroidVersionInfoService(AndroidVersionInfoService androidVersionInfoService) {
		AndroidVersionInfoType.androidVersionInfoService = androidVersionInfoService;
	}
}
