package com.wzsport.service;

import com.wzsport.model.User;
import com.wzsport.util.ResponseBody;

/**
* user service interface.
* 
* @author x1ny
* @date 2017年5月22日
*/
public interface UserService {

	@SuppressWarnings("rawtypes")
	int search(User user, ResponseBody resBody);

	@SuppressWarnings("rawtypes")
	int update(User user, ResponseBody resBody);
	
//    int update(User user);

    String getAvatarUrl(User user);

}
