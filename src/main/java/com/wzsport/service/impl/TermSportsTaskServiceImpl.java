package com.wzsport.service.impl;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wzsport.mapper.TermSportsTaskMapper;
import com.wzsport.model.TermSportsTask;
import com.wzsport.service.TermSportsTaskService;

/**
* TermSportsTask service implement
* 
* @author x1ny
* @date 2017年5月28日
*/
@Service
public class TermSportsTaskServiceImpl implements TermSportsTaskService {

	@Autowired
	private SqlSessionFactory sqlSessionFactory;
	

	/* (non-Javadoc)
	 * @see com.wzsport.service.TermSportsTaskService#update(com.wzsport.model.TermSportsTask)
	 */
	@Override
	public boolean update(TermSportsTask termSportsTask) {
		try(SqlSession sqlSession = sqlSessionFactory.openSession()) {
			TermSportsTaskMapper termSportsTaskMapper = sqlSession.getMapper(TermSportsTaskMapper.class);
			int line = termSportsTaskMapper.update(termSportsTask);
			if(line > 0) {
				return true;
			}
		}
		return false;
	}
	
	public SqlSessionFactory getSqlSessionFactory() {
		return sqlSessionFactory;
	}

	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		this.sqlSessionFactory = sqlSessionFactory;
	}
}
