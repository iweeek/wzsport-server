package com.wzsport.util;

import java.util.Date;

import org.joda.time.DateTime;

public class MyDateUtil {
	
	public static Date getCurrentWeekStartDate() {
		
		DateTime now = new DateTime();
		if (now.getDayOfWeek() == 1) {
			return now.withMillisOfDay(0).toDate();
		} else {
			return now.withDayOfWeek(1)
					.withMillisOfDay(0)
					.toDate();
		}
	}
	
	public static Date getCurrentMonthStartDate() {
		
		DateTime now = new DateTime();
		if (now.getDayOfMonth() == 1) {
			return now.withMillisOfDay(0).toDate();
		} else {
			return now.withDayOfMonth(1)
					.withMillisOfDay(0)
					.toDate();
		}
	}
}
