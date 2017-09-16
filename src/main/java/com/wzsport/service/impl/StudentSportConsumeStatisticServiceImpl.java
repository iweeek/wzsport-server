package com.wzsport.service.impl;

import java.util.List;
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
		Calendar c = Calendar.getInstance();
		Calendar calFirst = Calendar.getInstance();
		Calendar calLast = Calendar.getInstance();

		int today = 	c.get(Calendar.DAY_OF_MONTH);
		// 如果是本月第一天，取上个月第一天和最后一天,否则，取本月
		if (today == 1) {
			calFirst.add(Calendar.MONTH, -1); // 上一个月
			calFirst.set(Calendar.DAY_OF_MONTH, 1);

			calLast.set(Calendar.DAY_OF_MONTH,0);
		} else {
			calFirst.add(Calendar.MONTH, 0);
			calFirst.set(Calendar.DAY_OF_MONTH,1);

			calLast.set(Calendar.DAY_OF_MONTH, calLast.getActualMaximum(Calendar.DAY_OF_MONTH));
		}
		List<StudentSportConsumeStatistic> list =
				studentSportConsumeStatisticMapper.getStudentSportConsumeStatisticList(calFirst.getTime(),calLast.getTime());

		for (StudentSportConsumeStatistic studentSportConsumeStatistic : list) {
			studentSportConsumeStatisticMapper.insert(studentSportConsumeStatistic);
		}

		return true;
	}

}
