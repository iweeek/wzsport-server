package com.wzsport.mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import com.wzsport.model.User;

/**
* @ClassName: UserMapper
* @Description: User Mybatis Mapper
* @author x1ny
* @date 2017年5月9日
*/
public interface UserMapper {
	
	/**
	* @author x1ny
	* @date 2017年5月9日
	* @Description: 根据id获取User
	* @param id - 主键
	* @return
	* @throws
	*/
	@Select("SELECT user.id as user_id,"
			+ "user.username as user_username,"
			+ "user.password as user_password,"
			+ "role.id as role_id,"
			+ "role.name as role_name "
			+ "FROM xmheart_users as user "
			+ "LEFT JOIN xmheart_user_role_relation as relation ON user.id = relation.user_id "
			+ "LEFT JOIN xmheart_roles as role ON role.id = relation.role_id "
			+ "WHERE user.id = #{id}")
	@ResultMap(value = { "userResultMap" })
	User getUserById(@Param("id") int id);
	
	/**
	* @author x1ny
	* @date 2017年5月9日
	* @Description: 根据usernma获取User
	* @param username - 用户名
	* @return
	* @throws
	*/
	@Select("SELECT user.id as user_id,"
			+ "user.username as user_username,"
			+ "user.password as user_password,"
			+ "role.id as role_id,"
			+ "role.name as role_name "
			+ "FROM xmheart_users as user "
			+ "LEFT JOIN xmheart_user_role_relation as relation ON user.id = relation.user_id "
			+ "LEFT JOIN xmheart_roles as role ON role.id = relation.role_id "
			+ "WHERE user.username = #{username}")
	@ResultMap(value = { "userResultMap" })
	User getUserByUserName(@Param("username") String username);
}