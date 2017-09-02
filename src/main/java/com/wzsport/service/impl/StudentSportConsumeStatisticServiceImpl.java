package com.wzsport.service.impl;

import java.util.List;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wzsport.mapper.StudentSportConsumeStatisticMapper;
import com.wzsport.model.StudentSportConsumeStatistic;
import com.wzsport.service.StudentSportConsumeStatisticService;

@Service
public class StudentSportConsumeStatisticServiceImpl implements StudentSportConsumeStatisticService {
	@Autowired
	private StudentSportConsumeStatisticMapper studentSportConsumeStatisticMapper;

	@Override
	@Transactional
	public boolean create() {
		Calendar cal = Calendar.getInstance();//使用默认时区和语言环境获得一个日历
		cal.add(Calendar.DAY_OF_MONTH, -1);//取当前日期的前一天.
		List<StudentSportConsumeStatistic> list =
				studentSportConsumeStatisticMapper.getStudentSportConsumeStatisticList(cal.getTime());

		for (StudentSportConsumeStatistic studentSportConsumeStatistic : list) {
			studentSportConsumeStatisticMapper.insert(studentSportConsumeStatistic);
		}

		return true;
	}

}
