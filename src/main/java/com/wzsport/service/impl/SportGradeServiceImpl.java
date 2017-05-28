package com.wzsport.service.impl;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wzsport.mapper.SportGradeMapper;
import com.wzsport.model.SportGrade;
import com.wzsport.service.SportGradeService;
import com.wzsport.util.BmiUtil;

@Service
public class SportGradeServiceImpl implements SportGradeService {

	@Autowired
	private SqlSessionFactory sqlSessionFactory;
	

	@Override
	public SportGrade create(SportGrade sportGrade) {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		SportGradeMapper sportGradeMapper = sqlSession.getMapper(SportGradeMapper.class);
		sportGradeMapper.save(sportGrade);
		return sportGrade;
	}

	@Override
	public SportGrade update(SportGrade sportGrade) {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		SportGradeMapper sportGradeMapper = sqlSession.getMapper(SportGradeMapper.class);
		sportGradeMapper.updateSportGradeById(sportGrade);
		return sportGrade;
	}

}
