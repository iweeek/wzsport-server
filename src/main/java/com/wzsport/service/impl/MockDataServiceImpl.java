package com.wzsport.service.impl;

import java.util.Date;
import java.util.Locale;

import org.apache.commons.lang3.time.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.javafaker.Faker;
import com.wzsport.mapper.ClassMapper;
import com.wzsport.mapper.CollegeMapper;
import com.wzsport.mapper.FitnessCheckDataMapper;
import com.wzsport.mapper.MajorMapper;
import com.wzsport.mapper.SportScoreMapper;
import com.wzsport.mapper.StudentMapper;
import com.wzsport.mapper.TeacherMapper;
import com.wzsport.mapper.TermMapper;
import com.wzsport.mapper.TermSportsTaskMapper;
import com.wzsport.mapper.UniversityMapper;
import com.wzsport.mapper.UserMapper;
import com.wzsport.model.Class;
import com.wzsport.model.College;
import com.wzsport.model.FitnessCheckData;
import com.wzsport.model.Major;
import com.wzsport.model.RunningActivity;
import com.wzsport.model.SportScore;
import com.wzsport.model.Student;
import com.wzsport.model.Teacher;
import com.wzsport.model.Term;
import com.wzsport.model.TermSportsTask;
import com.wzsport.model.University;
import com.wzsport.model.User;
import com.wzsport.service.MockDataService;
import com.wzsport.service.RunningActivityService;

@Service
public class MockDataServiceImpl implements MockDataService {

	@Autowired
	private UniversityMapper universityMapper;
	@Autowired
	private CollegeMapper collegeMapper;
	@Autowired
	private MajorMapper majorMapper;
	@Autowired
	private ClassMapper classMapper;
	@Autowired
	private StudentMapper studentMapper;
	@Autowired
	private UserMapper userMapper;
	@Autowired
	private TermMapper termMapper;
	@Autowired
	private TermSportsTaskMapper termSportsTaskMapper;
	@Autowired
	private FitnessCheckDataMapper fitnessCheckDataMapper;
	@Autowired
	private SportScoreMapper sportScoreMapper;
	@Autowired
	private TeacherMapper teacherMapper;
	@Autowired
	private RunningActivityService runningActivityService;
	
	@Override
	@Transactional
	public boolean mockData() {
		Faker faker = new Faker(new Locale("zh-CN"));
		University university = new University();
		university.setName("温州大学");
		universityMapper.insertSelective(university);
		long universityId = university.getId();

		Term term = new Term();
		term.setUniversityId(universityId);
		term.setName("学期1");
		term.setStartDate(new Date());
		term.setEndDate(DateUtils.addYears(new Date(), 1));
		termMapper.insertSelective(term);
		long termId = term.getId();
		
		TermSportsTask task = new TermSportsTask();
		task.setTermId(termId);
		task.setTargetSportsTimes(5);
		termSportsTaskMapper.insertSelective(task);
		
		for(int i = 1; i <= 3; i ++) {
			College college = new College();
			college.setUniversityId(universityId);
			college.setName("学院" + i);
			collegeMapper.insertSelective(college);
			for(int j = 1; j <= 3; j ++) {
				Major major = new Major();
				major.setCollegeId(college.getId());
				major.setUniversityId(universityId);
				major.setName("专业" + j);
				majorMapper.insertSelective(major);
				for(int k = 1; k <= 5; k++ ) {
					Class studentClasss = new Class();
					studentClasss.setName("班级" + k);
					studentClasss.setGradle(2017);
					studentClasss.setMajorId(major.getId());
					studentClasss.setUniversityId(universityId);
					classMapper.insertSelective(studentClasss);
					
					Teacher teacher = new Teacher();
					teacher.setMan(faker.bool().bool());
					teacher.setName(faker.name().fullName());
					teacher.setUniversityId(universityId);
					teacher.setJobNo(faker.idNumber().valid());
					teacherMapper.insertSelective(teacher);
					
					teacherMapper.associateTeacherAndClass(teacher.getId(), studentClasss.getId());
					
					for(int x = 1; x <= 50; x ++) {
						String studentNo = faker.idNumber().valid();
						User user = new User();
						user.setUsername(studentNo);
						user.setPassword("123456");
						userMapper.insertSelective(user);
						faker.name().fullName();
						
						Student student = new Student();
						student.setName(faker.name().fullName());
						student.setClassId(studentClasss.getId());
						student.setMan(faker.bool().bool());
						student.setStudentNo(studentNo);
						student.setUniversityId(universityId);
						student.setUserId(user.getId());
						studentMapper.insertSelective(student);
						
						FitnessCheckData fitnessCheckData = new FitnessCheckData();
						fitnessCheckData.setBmi(8.8);
						fitnessCheckData.setHeight(175);
						fitnessCheckData.setWeight(70);
						fitnessCheckData.setLungCapacity(2500);
						fitnessCheckData.setStudentId(student.getId());
						fitnessCheckData.setTermId(termId);
						fitnessCheckDataMapper.insertSelective(fitnessCheckData);
						
						SportScore sportScore = new SportScore();
						sportScore.setAbdominalCurlCount(50);
						sportScore.setAbdominalCurlScore(70);
						sportScore.setMeter1500RunScore(70);
						sportScore.setMeter1500RunTime(200);
						sportScore.setMeter50SprintScore(70);
						sportScore.setMeter50SprintTime(6.5);
						sportScore.setStandingJumpDistance(180);
						sportScore.setStandingJumpScore(60);
						sportScore.setStudentId(student.getId());
						sportScore.setTermId(termId);
						sportScoreMapper.insertSelective(sportScore);
						
						RunningActivity runningActivity = new RunningActivity();
						runningActivity.setProjectId(2l);
						runningActivity.setStudentId(student.getId());
						runningActivity.setDistance(1000);
						runningActivity.setCostTime(300);
						runningActivity.setTargetTime(250);
						runningActivity.setStartTime(new Date());
						runningActivity = runningActivityService.create(runningActivity);
					}
				}
			}
		}
		return true;
	}
}
