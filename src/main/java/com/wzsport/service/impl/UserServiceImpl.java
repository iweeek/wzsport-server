package com.wzsport.service.impl;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import com.wzsport.exception.ObjectNotFoundException;
import com.wzsport.service.CloudStorageService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wzsport.mapper.UserMapper;
import com.wzsport.model.User;
import com.wzsport.model.UserExample;
import com.wzsport.model.UserExample.Criteria;
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

    @Autowired
    private CloudStorageService cloudStorageService;

    /** The log msg. */
	private String logMsg = "";

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public int search(User user, ResponseBody resBody) {
		UserExample example = new UserExample();
		Criteria criteria = example.createCriteria();
		criteria.andUniversityIdEqualTo(user.getUniversityId());
		
		if (user.getUsername() == null) {
			criteria.andUsernameEqualTo(user.getUsername());
		}
		
		List<User> list = userMapper.selectByExample(example);
		if (list.size() == 0) {
			logMsg = RetMsgTemplate.MSG_TEMPLATE_NOT_FIND;
			logger.info(logMsg);
			return HttpServletResponse.SC_NOT_FOUND;
		} else {
			logMsg = RetMsgTemplate.MSG_TEMPLATE_OPERATION_OK;
			logger.info(logMsg);
			
			resBody.obj = list.get(0);
			resBody.statusMsg = logMsg; 
			
			return HttpServletResponse.SC_OK;
		}
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public int update(User user, ResponseBody resBody) {
		int result = userMapper.updateByPrimaryKeySelective(user);
		if (result == 0) {
			logMsg = RetMsgTemplate.MSG_TEMPLATE_NOT_FIND;
			logger.info(logMsg);
			return HttpServletResponse.SC_NOT_FOUND;
		} else {
			logMsg = RetMsgTemplate.MSG_TEMPLATE_OPERATION_OK;
			logger.info(logMsg);
			
			resBody.obj = user;
			resBody.statusMsg = logMsg; 
			
			return HttpServletResponse.SC_OK;
		}
	}
	
//    public User getUserById(long id) {
//        UserExample userExample = new UserExample();
//        userExample.createCriteria().andIdEqualTo(id);
//
//        List<User> userList = userMapper.selectByExample(userExample);
//
//        if (userList.size() == 0) {
//            throw new ObjectNotFoundException("找不到该学生信息哦！");
//        }
//
//		userList.set(0, this.getAvatarUrl(userList.get(0)));
//
//        return userList.get(0);
//    }
//
//    @Override
//    public int update(User user) {
//        return userMapper.updateByPrimaryKey(user);
//    }

    @Override
    public String getAvatarUrl(User user) {
		return this.cloudStorageService.generateUrl(user.getAvatarUrl());
    }
}
