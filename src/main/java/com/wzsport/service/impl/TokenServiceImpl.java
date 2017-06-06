package com.wzsport.service.impl;

import java.util.Date;

import org.apache.commons.lang3.time.DateUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.wzsport.dto.TokenDTO;
import com.wzsport.mapper.UserMapper;
import com.wzsport.model.User;
import com.wzsport.service.TokenService;

import io.jsonwebtoken.CompressionCodecs;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

/**
* TokenService 实现类.
* 
* @author x1ny
* @date 2017年5月22日
*/
@Service
public class TokenServiceImpl implements TokenService {
	
	/**
	 * jwt加密、解密的密匙
	 */
	private final String KEY;
	
	/**
	 * 默认token的有效时间(小时).
	 */
	private final int DEFAULT_EXPIRED_HOUR = 1;

	@Autowired
	private UserMapper userMapper;
	
	public TokenServiceImpl(@Value("${jwt.key}") String key) {		
		KEY = key;
	}
	
	/* (non-Javadoc)
	 * @see com.wzsport.service.TokenService#create(java.lang.String, java.lang.String)
	 */
	@Override
	public TokenDTO create(String username, String password, int expiredHour) {
		
		User user = userMapper.selectWithRolesByUsername(username);
		
		if(user == null) {
			throw new UnknownAccountException();
		}
		
		if (!user.getPassword().equals(password)) {
			throw new IncorrectCredentialsException();
		}
		
		//创建token
		long userId = user.getId();
		Date expiredDate = DateUtils.addHours(new Date(), expiredHour);
		String[] roles = new String[user.getRoles().size()];
		for(int i = 0; i < roles.length; i++) {
			roles[i] = user.getRoles().get(i).getName();
		}
		String token = Jwts.builder()
				.setSubject(String.valueOf(userId))
				.setExpiration(expiredDate)
				.claim("roles", roles)
				.compressWith(CompressionCodecs.DEFLATE)
				.signWith(SignatureAlgorithm.HS512, KEY)
				.compact();
		
		return new TokenDTO(userId, roles, token, expiredDate);
	}
	
	/* (non-Javadoc)
	 * @see com.wzsport.service.TokenService#create(java.lang.String, java.lang.String)
	 */
	@Override
	public TokenDTO create(String username, String password) {
		return create(username, password, DEFAULT_EXPIRED_HOUR);
	}
}
