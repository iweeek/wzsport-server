package com.wzsport.sqlproviders;

import java.util.Map;

import org.apache.ibatis.jdbc.SQL;


/**
 * 教师实体动态SQL类
 * 
 * @author Watermelon_R(ljf)
 * 2017年5月29日
 */

public class TeacherDynaSqlProvider {
	public String getDifferentSexTeachersCount(Integer universityId,Boolean sex) {
		String sql = new SQL() {
			{
				SELECT("count(id)");
				FROM("teacher");
				if(sex!=null && sex)
					WHERE("is_man=" + 1);
				else if(sex!=null && !sex)
					WHERE("is_man=" + 0);
				
				WHERE("university_id=" + universityId);
			}
		}.toString();
		return sql;
	}
	
	public String listTeacherByIdAndNameAndSex(Map<String, Object> map) {
		 String sql = new SQL() {
				{
					String jobNo = (String) map.get("param1");
					String name = (String) map.get("param2");
					Boolean man = (Boolean) map.get("param3");
					SELECT("*");
					FROM("teacher");
					if (jobNo != null && jobNo.length()>0)
						WHERE("job_no like '%" + jobNo+"%'");
					if(name != null && name.length()>0)
						WHERE("name like '%" +name+"%'");
					if(man!=null && man)
						WHERE("is_man=" + 1);
					else if(man!=null && !man)
						WHERE("is_man=" + 0);
				}
			}.toString();
			System.out.println(sql);
		return sql;
	}
}
