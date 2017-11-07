package com.wzsport.util;

import java.text.ParseException;
import java.util.Date;

import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wzsport.graphql.UniversityType;
import com.wzsport.mapper.UniversityMapper;
import com.wzsport.model.Term;
import com.wzsport.service.TermService;

import io.swagger.annotations.ApiParam;

/**
 * 学期时间工具类
 * @author nimon
 *
 */
@Component
public class TermDateUtil {
    
    private static TermService termService;
    
    /**
     * 指定周开始时间，时间从本学期开始计算
     * @param weekNo 指定的周
     * @return 指定周开始时间
     * @throws ParseException 
     */
    public static DateTime getWeekStartDate(Long universityId, int week) {
        Term currentTerm = termService.getCurrentTerm(universityId);
        Date startDate = currentTerm.getStartDate();
        DateTime jodaDate = new DateTime(startDate);
        jodaDate = jodaDate.plusWeeks(week - 1);
        return jodaDate.withDayOfWeek(1).withMillisOfDay(0);
    }
    /**
     * 指定周结束时间，时间从本学期开始计算
     * @param weekNo 指定的周
     * @return 指定周结束时间
     * @throws ParseException 
     */
    public static DateTime getWeekEndDate(Long universityId, int week) {
        Term currentTerm = termService.getCurrentTerm(universityId);
        Date startDate = currentTerm.getStartDate();
        DateTime jodaDate = new DateTime(startDate);
        jodaDate = jodaDate.plusWeeks(week);
        return jodaDate.withDayOfWeek(1).withMillisOfDay(0);
    }
    /**
     * 指定月开始时间，时间从本学期开始计算
     * @param weekNo 指定的月
     * @return 指定月开始时间
     * @throws ParseException 
     */
    public static DateTime getMonthStartDate(Long universityId, int month) {
        Term currentTerm = termService.getCurrentTerm(universityId);
        Date startDate = currentTerm.getStartDate();
        DateTime jodaDate = new DateTime(startDate);
        jodaDate = jodaDate.plusMonths(month - 1);
        return jodaDate.withDayOfMonth(1).withMillisOfDay(0);
    }
    /**
     * 指定月结束时间，时间从本学期开始计算
     * @param weekNo 指定的月
     * @return 指定月结束时间
     * @throws ParseException 
     */
    public static DateTime getMonthEndDate(Long universityId, int month) {
        Term currentTerm = termService.getCurrentTerm(universityId);
        Date startDate = currentTerm.getStartDate();
        DateTime jodaDate = new DateTime(startDate);
        jodaDate = jodaDate.plusMonths(month);
        return jodaDate.withDayOfMonth(1).withMillisOfDay(0);
    }
    
    @Autowired(required = true)
    public void setTermService(TermService termService) {
        TermDateUtil.termService = termService;
    }
}
