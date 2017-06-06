package com.wzsport.service.impl;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wzsport.mapper.TermMapper;
import com.wzsport.mapper.TermSportsTaskMapper;
import com.wzsport.model.Term;
import com.wzsport.model.TermSportsTask;
import com.wzsport.service.TermService;

/**
* Term Service implement
* 
* @author x1ny
* @date 2017年5月28日
*/
@Service
public class TermServiceImpl implements TermService {

	@Autowired
	private SqlSessionFactory sqlSessionFactory;
	
	/* (non-Javadoc)
	 * @see com.wzsport.service.TermService#create(com.wzsport.model.Term)
	 */
	@Override
	public boolean create(Term term) {
		try(SqlSession sqlSession = sqlSessionFactory.openSession(false)) {
			TermMapper termMapper = sqlSession.getMapper(TermMapper.class);
			int affectedCount = termMapper.save(term);
			if(affectedCount == 0) {
				return false;
			}
			
			//创建关联的TermSportsTask
			TermSportsTask termSportsTask =  new TermSportsTask();
			termSportsTask.setTermId(term.getId());
			termSportsTask.setTargetSportsTimes(0);
			TermSportsTaskMapper termSportsTaskMapper = sqlSession.getMapper(TermSportsTaskMapper.class);
			affectedCount = termSportsTaskMapper.save(termSportsTask);
			if(affectedCount == 0) {
				return false;
			} else {
				sqlSession.commit();
				return true;
			}
		}
	}

	/* (non-Javadoc)
	 * @see com.wzsport.service.TermService#delete(int)
	 */
	@Override
	public boolean delete(int id) {
		try(SqlSession sqlSession = sqlSessionFactory.openSession(false)) {
			TermMapper termMapper = sqlSession.getMapper(TermMapper.class);
			int affectedCount = termMapper.delete(id);
			if(affectedCount == 0) {
				return false;
			}
			TermSportsTaskMapper termSportsTaskMapper = sqlSession.getMapper(TermSportsTaskMapper.class);
			termSportsTaskMapper.deleteByTermId(id);
			sqlSession.commit();
			return true;
		}
	}

	/* (non-Javadoc)
	 * @see com.wzsport.service.TermService#update(com.wzsport.model.Term)
	 */
	@Override
	public boolean update(Term term) {
		try(SqlSession sqlSession = sqlSessionFactory.openSession()) {
			TermMapper termMapper = sqlSession.getMapper(TermMapper.class);
			int line = termMapper.update(term);
			if(line >= 1) {
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
