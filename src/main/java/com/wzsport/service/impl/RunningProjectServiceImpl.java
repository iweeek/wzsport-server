package com.wzsport.service.impl;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wzsport.mapper.RunningProjectMapper;
import com.wzsport.service.RunningProjectService;

@Service
public class RunningProjectServiceImpl implements RunningProjectService {

	@Autowired
	private SqlSessionFactory sqlSessionFactory;
	
	/* (non-Javadoc)
	 * @see com.wzsport.service.RunningProjectService#updateIndex(int, int, int, int)
	 */
	@Override
	public boolean updateIndex(int id, int qualifiedDistance, int qualifiedCostTime, int minCostTime) {
		try(SqlSession sqlSession = sqlSessionFactory.openSession()) {
			RunningProjectMapper runningProjectMapper = sqlSession.getMapper(RunningProjectMapper.class);
			int line = runningProjectMapper.updateRunningProjectIndex(id, qualifiedDistance, qualifiedCostTime, minCostTime);
			if(line > 0) {
				return true;
			}
		}
		return false;
	}

	/* (non-Javadoc)
	 * @see com.wzsport.service.RunningProjectService#updateEnable(int, boolean)
	 */
	@Override
	public boolean updateEnable(int id, boolean enabled) {
		try(SqlSession sqlSession = sqlSessionFactory.openSession()) {
			RunningProjectMapper runningProjectMapper = sqlSession.getMapper(RunningProjectMapper.class);
			int line = runningProjectMapper.updateRunningProjectEnabled(id, enabled);
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
