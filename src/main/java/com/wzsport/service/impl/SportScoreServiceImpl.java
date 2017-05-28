package com.wzsport.service.impl;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wzsport.mapper.SportScoreMapper;
import com.wzsport.model.SportScore;
import com.wzsport.service.SportScoreService;
@Service
public class SportScoreServiceImpl implements SportScoreService {

	@Autowired
	private SqlSessionFactory sqlSessionFactory;
	

	@Override
	public boolean create(SportScore sportScore) {
		boolean result;
		try(SqlSession sqlSession = sqlSessionFactory.openSession()) {
			SportScoreMapper sportScoreMapper = sqlSession.getMapper(SportScoreMapper.class);
			if(sportScoreMapper.save(sportScore) == 0){
				result = false;
			}else{
				result = true;
			}
			
		}
		return result;
	}

	@Override
	public boolean update(SportScore sportScore) {
		boolean result;
		try(SqlSession sqlSession = sqlSessionFactory.openSession()) {
			SportScoreMapper sportScoreMapper = sqlSession.getMapper(SportScoreMapper.class);
			if(sportScoreMapper.updateSportScoreById(sportScore) == 0){
				result = false;
			}else{
				result = true;
			}
		}
		return result;
	}

}

