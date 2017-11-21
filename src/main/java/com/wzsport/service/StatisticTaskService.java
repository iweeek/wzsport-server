package com.wzsport.service;

import java.util.Date;

public interface StatisticTaskService {
	public void runningActivityTask(Date startDate, Date endDate);

	public void sportConsumeStatisticTask();

	public void signInTask();

    void runningActivityDataStatisticTask(Date startDate, Date endDate);

    void areaActivityTask(Date startDate, Date endDate);

    void areaActivityDataStatisticTask(Date startDate, Date endDate);

    void runningActivityDataCollectionTask(Date startDate, Date endDate);
}
