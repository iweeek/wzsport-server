package com.wzsport.shiro;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

import com.wzsport.mapper.UserMapper;
import com.wzsport.model.Role;
import com.wzsport.model.User;

/**
* @ClassName: DatabaseRealm
* @Description: 提供Shiro认证数据来源
* @author x1ny
* @date 2017年5月9日
*/
public class DatabaseRealm extends AuthorizingRealm {

	@Autowired
	private SqlSessionFactory sqlSessionFactory;

	@Override
	public String getName() {
		return "DatabaseRealm";
	}

	/* (non-Javadoc)
	 * @see org.apache.shiro.realm.AuthenticatingRealm#supports(org.apache.shiro.authc.AuthenticationToken)
	 */
	@Override
	public boolean supports(AuthenticationToken token) {
		// 仅支持UsernamePasswordToken类型的Token
		return token instanceof UsernamePasswordToken;
	}
	
	/* (non-Javadoc)
	 * @see org.apache.shiro.realm.AuthenticatingRealm#doGetAuthenticationInfo(org.apache.shiro.authc.AuthenticationToken)
	 */
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
		String username = (String) token.getPrincipal();
		String password = new String((char[]) token.getCredentials());
		User user = null;
		SqlSession sqlSession = sqlSessionFactory.openSession();
		try {
			user = sqlSession.getMapper(UserMapper.class).getUserByUserName(username);
		} finally {
			sqlSession.close();
		}
		if (user == null) {

		}
		if (!user.getPassword().equals(password)) {
			throw new IncorrectCredentialsException();
		}
		// 如果身份认证验证成功，返回一个AuthenticationInfo实现；
		SimpleAuthenticationInfo authenticationInfo = new SimpleAuthenticationInfo(user, password, getName());
		return authenticationInfo;
	}

	/* (non-Javadoc)
	 * @see org.apache.shiro.realm.AuthorizingRealm#doGetAuthorizationInfo(org.apache.shiro.subject.PrincipalCollection)
	 */
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
		User user = (User) principals.getPrimaryPrincipal();
		SimpleAuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo();
		for(Role role:user.getRoles()) {
			authorizationInfo.addRole(role.getName());
		}
		return authorizationInfo;
	}

	public SqlSessionFactory getSqlSessionFactory() {
		return sqlSessionFactory;
	}

	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		this.sqlSessionFactory = sqlSessionFactory;
	}
}
