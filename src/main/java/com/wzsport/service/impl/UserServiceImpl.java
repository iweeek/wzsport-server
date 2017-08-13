package com.wzsport.service.impl;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wzsport.mapper.UserMapper;
import com.wzsport.model.User;
import com.wzsport.model.UserExample;
import com.wzsport.service.UserService;
import com.wzsport.util.ResponseBody;
import com.wzsport.util.RetMsgTemplate;

/**
* TokenService 实现类.
* 
* @author x1ny
* @date 2017年5月22日
*/
@Service
public class UserServiceImpl implements UserService {
	
	/** The Constant logger. */
	private static final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

	@Autowired
	private UserMapper userMapper;
	
	/** The log msg. */
	private String logMsg = "";

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public int search(User user, ResponseBody resBody) {
		UserExample example = new UserExample();
		example.createCriteria().andUsernameEqualTo(user.getUsername()).andUniversityIdEqualTo(user.getUniversityId());
		List<User> list = userMapper.selectByExample(example);
		if (list.size() == 0) {
			logMsg = RetMsgTemplate.MSG_TEMPLATE_NOT_FIND;
			logger.error(logMsg);
			return HttpServletResponse.SC_NOT_FOUND;
		} else {
			logMsg = RetMsgTemplate.MSG_TEMPLATE_OPERATION_OK;
			logger.info(logMsg);
			
			resBody.obj = list.get(0);
			resBody.statusMsg = logMsg; 
			
			return HttpServletResponse.SC_OK;
		}
	}
	

}
