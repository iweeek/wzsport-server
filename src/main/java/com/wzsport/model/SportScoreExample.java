package com.wzsport.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SportScoreExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table wzsport_sport_score
	 * @mbg.generated  Mon May 28 16:50:53 CST 2018
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table wzsport_sport_score
	 * @mbg.generated  Mon May 28 16:50:53 CST 2018
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table wzsport_sport_score
	 * @mbg.generated  Mon May 28 16:50:53 CST 2018
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_sport_score
	 * @mbg.generated  Mon May 28 16:50:53 CST 2018
	 */
	public SportScoreExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_sport_score
	 * @mbg.generated  Mon May 28 16:50:53 CST 2018
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_sport_score
	 * @mbg.generated  Mon May 28 16:50:53 CST 2018
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_sport_score
	 * @mbg.generated  Mon May 28 16:50:53 CST 2018
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_sport_score
	 * @mbg.generated  Mon May 28 16:50:53 CST 2018
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_sport_score
	 * @mbg.generated  Mon May 28 16:50:53 CST 2018
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_sport_score
	 * @mbg.generated  Mon May 28 16:50:53 CST 2018
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_sport_score
	 * @mbg.generated  Mon May 28 16:50:53 CST 2018
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_sport_score
	 * @mbg.generated  Mon May 28 16:50:53 CST 2018
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_sport_score
	 * @mbg.generated  Mon May 28 16:50:53 CST 2018
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_sport_score
	 * @mbg.generated  Mon May 28 16:50:53 CST 2018
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table wzsport_sport_score
	 * @mbg.generated  Mon May 28 16:50:53 CST 2018
	 */
	protected abstract static class GeneratedCriteria {
		protected List<Criterion> criteria;

		protected GeneratedCriteria() {
			super();
			criteria = new ArrayList<Criterion>();
		}

		public boolean isValid() {
			return criteria.size() > 0;
		}

		public List<Criterion> getAllCriteria() {
			return criteria;
		}

		public List<Criterion> getCriteria() {
			return criteria;
		}

		protected void addCriterion(String condition) {
			if (condition == null) {
				throw new RuntimeException("Value for condition cannot be null");
			}
			criteria.add(new Criterion(condition));
		}

		protected void addCriterion(String condition, Object value, String property) {
			if (value == null) {
				throw new RuntimeException("Value for " + property + " cannot be null");
			}
			criteria.add(new Criterion(condition, value));
		}

		protected void addCriterion(String condition, Object value1, Object value2, String property) {
			if (value1 == null || value2 == null) {
				throw new RuntimeException("Between values for " + property + " cannot be null");
			}
			criteria.add(new Criterion(condition, value1, value2));
		}

		public Criteria andIdIsNull() {
			addCriterion("id is null");
			return (Criteria) this;
		}

		public Criteria andIdIsNotNull() {
			addCriterion("id is not null");
			return (Criteria) this;
		}

		public Criteria andIdEqualTo(Long value) {
			addCriterion("id =", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotEqualTo(Long value) {
			addCriterion("id <>", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdGreaterThan(Long value) {
			addCriterion("id >", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdGreaterThanOrEqualTo(Long value) {
			addCriterion("id >=", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdLessThan(Long value) {
			addCriterion("id <", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdLessThanOrEqualTo(Long value) {
			addCriterion("id <=", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdIn(List<Long> values) {
			addCriterion("id in", values, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotIn(List<Long> values) {
			addCriterion("id not in", values, "id");
			return (Criteria) this;
		}

		public Criteria andIdBetween(Long value1, Long value2) {
			addCriterion("id between", value1, value2, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotBetween(Long value1, Long value2) {
			addCriterion("id not between", value1, value2, "id");
			return (Criteria) this;
		}

		public Criteria andStudentIdIsNull() {
			addCriterion("student_id is null");
			return (Criteria) this;
		}

		public Criteria andStudentIdIsNotNull() {
			addCriterion("student_id is not null");
			return (Criteria) this;
		}

		public Criteria andStudentIdEqualTo(Long value) {
			addCriterion("student_id =", value, "studentId");
			return (Criteria) this;
		}

		public Criteria andStudentIdNotEqualTo(Long value) {
			addCriterion("student_id <>", value, "studentId");
			return (Criteria) this;
		}

		public Criteria andStudentIdGreaterThan(Long value) {
			addCriterion("student_id >", value, "studentId");
			return (Criteria) this;
		}

		public Criteria andStudentIdGreaterThanOrEqualTo(Long value) {
			addCriterion("student_id >=", value, "studentId");
			return (Criteria) this;
		}

		public Criteria andStudentIdLessThan(Long value) {
			addCriterion("student_id <", value, "studentId");
			return (Criteria) this;
		}

		public Criteria andStudentIdLessThanOrEqualTo(Long value) {
			addCriterion("student_id <=", value, "studentId");
			return (Criteria) this;
		}

		public Criteria andStudentIdIn(List<Long> values) {
			addCriterion("student_id in", values, "studentId");
			return (Criteria) this;
		}

		public Criteria andStudentIdNotIn(List<Long> values) {
			addCriterion("student_id not in", values, "studentId");
			return (Criteria) this;
		}

		public Criteria andStudentIdBetween(Long value1, Long value2) {
			addCriterion("student_id between", value1, value2, "studentId");
			return (Criteria) this;
		}

		public Criteria andStudentIdNotBetween(Long value1, Long value2) {
			addCriterion("student_id not between", value1, value2, "studentId");
			return (Criteria) this;
		}

		public Criteria andTermIdIsNull() {
			addCriterion("term_id is null");
			return (Criteria) this;
		}

		public Criteria andTermIdIsNotNull() {
			addCriterion("term_id is not null");
			return (Criteria) this;
		}

		public Criteria andTermIdEqualTo(Long value) {
			addCriterion("term_id =", value, "termId");
			return (Criteria) this;
		}

		public Criteria andTermIdNotEqualTo(Long value) {
			addCriterion("term_id <>", value, "termId");
			return (Criteria) this;
		}

		public Criteria andTermIdGreaterThan(Long value) {
			addCriterion("term_id >", value, "termId");
			return (Criteria) this;
		}

		public Criteria andTermIdGreaterThanOrEqualTo(Long value) {
			addCriterion("term_id >=", value, "termId");
			return (Criteria) this;
		}

		public Criteria andTermIdLessThan(Long value) {
			addCriterion("term_id <", value, "termId");
			return (Criteria) this;
		}

		public Criteria andTermIdLessThanOrEqualTo(Long value) {
			addCriterion("term_id <=", value, "termId");
			return (Criteria) this;
		}

		public Criteria andTermIdIn(List<Long> values) {
			addCriterion("term_id in", values, "termId");
			return (Criteria) this;
		}

		public Criteria andTermIdNotIn(List<Long> values) {
			addCriterion("term_id not in", values, "termId");
			return (Criteria) this;
		}

		public Criteria andTermIdBetween(Long value1, Long value2) {
			addCriterion("term_id between", value1, value2, "termId");
			return (Criteria) this;
		}

		public Criteria andTermIdNotBetween(Long value1, Long value2) {
			addCriterion("term_id not between", value1, value2, "termId");
			return (Criteria) this;
		}

		public Criteria andMeter50SprintTimeIsNull() {
			addCriterion("meter50_sprint_time is null");
			return (Criteria) this;
		}

		public Criteria andMeter50SprintTimeIsNotNull() {
			addCriterion("meter50_sprint_time is not null");
			return (Criteria) this;
		}

		public Criteria andMeter50SprintTimeEqualTo(Double value) {
			addCriterion("meter50_sprint_time =", value, "meter50SprintTime");
			return (Criteria) this;
		}

		public Criteria andMeter50SprintTimeNotEqualTo(Double value) {
			addCriterion("meter50_sprint_time <>", value, "meter50SprintTime");
			return (Criteria) this;
		}

		public Criteria andMeter50SprintTimeGreaterThan(Double value) {
			addCriterion("meter50_sprint_time >", value, "meter50SprintTime");
			return (Criteria) this;
		}

		public Criteria andMeter50SprintTimeGreaterThanOrEqualTo(Double value) {
			addCriterion("meter50_sprint_time >=", value, "meter50SprintTime");
			return (Criteria) this;
		}

		public Criteria andMeter50SprintTimeLessThan(Double value) {
			addCriterion("meter50_sprint_time <", value, "meter50SprintTime");
			return (Criteria) this;
		}

		public Criteria andMeter50SprintTimeLessThanOrEqualTo(Double value) {
			addCriterion("meter50_sprint_time <=", value, "meter50SprintTime");
			return (Criteria) this;
		}

		public Criteria andMeter50SprintTimeIn(List<Double> values) {
			addCriterion("meter50_sprint_time in", values, "meter50SprintTime");
			return (Criteria) this;
		}

		public Criteria andMeter50SprintTimeNotIn(List<Double> values) {
			addCriterion("meter50_sprint_time not in", values, "meter50SprintTime");
			return (Criteria) this;
		}

		public Criteria andMeter50SprintTimeBetween(Double value1, Double value2) {
			addCriterion("meter50_sprint_time between", value1, value2, "meter50SprintTime");
			return (Criteria) this;
		}

		public Criteria andMeter50SprintTimeNotBetween(Double value1, Double value2) {
			addCriterion("meter50_sprint_time not between", value1, value2, "meter50SprintTime");
			return (Criteria) this;
		}

		public Criteria andMeter50SprintScoreIsNull() {
			addCriterion("meter50_sprint_score is null");
			return (Criteria) this;
		}

		public Criteria andMeter50SprintScoreIsNotNull() {
			addCriterion("meter50_sprint_score is not null");
			return (Criteria) this;
		}

		public Criteria andMeter50SprintScoreEqualTo(Integer value) {
			addCriterion("meter50_sprint_score =", value, "meter50SprintScore");
			return (Criteria) this;
		}

		public Criteria andMeter50SprintScoreNotEqualTo(Integer value) {
			addCriterion("meter50_sprint_score <>", value, "meter50SprintScore");
			return (Criteria) this;
		}

		public Criteria andMeter50SprintScoreGreaterThan(Integer value) {
			addCriterion("meter50_sprint_score >", value, "meter50SprintScore");
			return (Criteria) this;
		}

		public Criteria andMeter50SprintScoreGreaterThanOrEqualTo(Integer value) {
			addCriterion("meter50_sprint_score >=", value, "meter50SprintScore");
			return (Criteria) this;
		}

		public Criteria andMeter50SprintScoreLessThan(Integer value) {
			addCriterion("meter50_sprint_score <", value, "meter50SprintScore");
			return (Criteria) this;
		}

		public Criteria andMeter50SprintScoreLessThanOrEqualTo(Integer value) {
			addCriterion("meter50_sprint_score <=", value, "meter50SprintScore");
			return (Criteria) this;
		}

		public Criteria andMeter50SprintScoreIn(List<Integer> values) {
			addCriterion("meter50_sprint_score in", values, "meter50SprintScore");
			return (Criteria) this;
		}

		public Criteria andMeter50SprintScoreNotIn(List<Integer> values) {
			addCriterion("meter50_sprint_score not in", values, "meter50SprintScore");
			return (Criteria) this;
		}

		public Criteria andMeter50SprintScoreBetween(Integer value1, Integer value2) {
			addCriterion("meter50_sprint_score between", value1, value2, "meter50SprintScore");
			return (Criteria) this;
		}

		public Criteria andMeter50SprintScoreNotBetween(Integer value1, Integer value2) {
			addCriterion("meter50_sprint_score not between", value1, value2, "meter50SprintScore");
			return (Criteria) this;
		}

		public Criteria andStandingJumpDistanceIsNull() {
			addCriterion("standing_jump_distance is null");
			return (Criteria) this;
		}

		public Criteria andStandingJumpDistanceIsNotNull() {
			addCriterion("standing_jump_distance is not null");
			return (Criteria) this;
		}

		public Criteria andStandingJumpDistanceEqualTo(Integer value) {
			addCriterion("standing_jump_distance =", value, "standingJumpDistance");
			return (Criteria) this;
		}

		public Criteria andStandingJumpDistanceNotEqualTo(Integer value) {
			addCriterion("standing_jump_distance <>", value, "standingJumpDistance");
			return (Criteria) this;
		}

		public Criteria andStandingJumpDistanceGreaterThan(Integer value) {
			addCriterion("standing_jump_distance >", value, "standingJumpDistance");
			return (Criteria) this;
		}

		public Criteria andStandingJumpDistanceGreaterThanOrEqualTo(Integer value) {
			addCriterion("standing_jump_distance >=", value, "standingJumpDistance");
			return (Criteria) this;
		}

		public Criteria andStandingJumpDistanceLessThan(Integer value) {
			addCriterion("standing_jump_distance <", value, "standingJumpDistance");
			return (Criteria) this;
		}

		public Criteria andStandingJumpDistanceLessThanOrEqualTo(Integer value) {
			addCriterion("standing_jump_distance <=", value, "standingJumpDistance");
			return (Criteria) this;
		}

		public Criteria andStandingJumpDistanceIn(List<Integer> values) {
			addCriterion("standing_jump_distance in", values, "standingJumpDistance");
			return (Criteria) this;
		}

		public Criteria andStandingJumpDistanceNotIn(List<Integer> values) {
			addCriterion("standing_jump_distance not in", values, "standingJumpDistance");
			return (Criteria) this;
		}

		public Criteria andStandingJumpDistanceBetween(Integer value1, Integer value2) {
			addCriterion("standing_jump_distance between", value1, value2, "standingJumpDistance");
			return (Criteria) this;
		}

		public Criteria andStandingJumpDistanceNotBetween(Integer value1, Integer value2) {
			addCriterion("standing_jump_distance not between", value1, value2, "standingJumpDistance");
			return (Criteria) this;
		}

		public Criteria andStandingJumpScoreIsNull() {
			addCriterion("standing_jump_score is null");
			return (Criteria) this;
		}

		public Criteria andStandingJumpScoreIsNotNull() {
			addCriterion("standing_jump_score is not null");
			return (Criteria) this;
		}

		public Criteria andStandingJumpScoreEqualTo(Integer value) {
			addCriterion("standing_jump_score =", value, "standingJumpScore");
			return (Criteria) this;
		}

		public Criteria andStandingJumpScoreNotEqualTo(Integer value) {
			addCriterion("standing_jump_score <>", value, "standingJumpScore");
			return (Criteria) this;
		}

		public Criteria andStandingJumpScoreGreaterThan(Integer value) {
			addCriterion("standing_jump_score >", value, "standingJumpScore");
			return (Criteria) this;
		}

		public Criteria andStandingJumpScoreGreaterThanOrEqualTo(Integer value) {
			addCriterion("standing_jump_score >=", value, "standingJumpScore");
			return (Criteria) this;
		}

		public Criteria andStandingJumpScoreLessThan(Integer value) {
			addCriterion("standing_jump_score <", value, "standingJumpScore");
			return (Criteria) this;
		}

		public Criteria andStandingJumpScoreLessThanOrEqualTo(Integer value) {
			addCriterion("standing_jump_score <=", value, "standingJumpScore");
			return (Criteria) this;
		}

		public Criteria andStandingJumpScoreIn(List<Integer> values) {
			addCriterion("standing_jump_score in", values, "standingJumpScore");
			return (Criteria) this;
		}

		public Criteria andStandingJumpScoreNotIn(List<Integer> values) {
			addCriterion("standing_jump_score not in", values, "standingJumpScore");
			return (Criteria) this;
		}

		public Criteria andStandingJumpScoreBetween(Integer value1, Integer value2) {
			addCriterion("standing_jump_score between", value1, value2, "standingJumpScore");
			return (Criteria) this;
		}

		public Criteria andStandingJumpScoreNotBetween(Integer value1, Integer value2) {
			addCriterion("standing_jump_score not between", value1, value2, "standingJumpScore");
			return (Criteria) this;
		}

		public Criteria andMeter1500RunTimeIsNull() {
			addCriterion("meter1500_run_time is null");
			return (Criteria) this;
		}

		public Criteria andMeter1500RunTimeIsNotNull() {
			addCriterion("meter1500_run_time is not null");
			return (Criteria) this;
		}

		public Criteria andMeter1500RunTimeEqualTo(Integer value) {
			addCriterion("meter1500_run_time =", value, "meter1500RunTime");
			return (Criteria) this;
		}

		public Criteria andMeter1500RunTimeNotEqualTo(Integer value) {
			addCriterion("meter1500_run_time <>", value, "meter1500RunTime");
			return (Criteria) this;
		}

		public Criteria andMeter1500RunTimeGreaterThan(Integer value) {
			addCriterion("meter1500_run_time >", value, "meter1500RunTime");
			return (Criteria) this;
		}

		public Criteria andMeter1500RunTimeGreaterThanOrEqualTo(Integer value) {
			addCriterion("meter1500_run_time >=", value, "meter1500RunTime");
			return (Criteria) this;
		}

		public Criteria andMeter1500RunTimeLessThan(Integer value) {
			addCriterion("meter1500_run_time <", value, "meter1500RunTime");
			return (Criteria) this;
		}

		public Criteria andMeter1500RunTimeLessThanOrEqualTo(Integer value) {
			addCriterion("meter1500_run_time <=", value, "meter1500RunTime");
			return (Criteria) this;
		}

		public Criteria andMeter1500RunTimeIn(List<Integer> values) {
			addCriterion("meter1500_run_time in", values, "meter1500RunTime");
			return (Criteria) this;
		}

		public Criteria andMeter1500RunTimeNotIn(List<Integer> values) {
			addCriterion("meter1500_run_time not in", values, "meter1500RunTime");
			return (Criteria) this;
		}

		public Criteria andMeter1500RunTimeBetween(Integer value1, Integer value2) {
			addCriterion("meter1500_run_time between", value1, value2, "meter1500RunTime");
			return (Criteria) this;
		}

		public Criteria andMeter1500RunTimeNotBetween(Integer value1, Integer value2) {
			addCriterion("meter1500_run_time not between", value1, value2, "meter1500RunTime");
			return (Criteria) this;
		}

		public Criteria andMeter1500RunScoreIsNull() {
			addCriterion("meter1500_run_score is null");
			return (Criteria) this;
		}

		public Criteria andMeter1500RunScoreIsNotNull() {
			addCriterion("meter1500_run_score is not null");
			return (Criteria) this;
		}

		public Criteria andMeter1500RunScoreEqualTo(Integer value) {
			addCriterion("meter1500_run_score =", value, "meter1500RunScore");
			return (Criteria) this;
		}

		public Criteria andMeter1500RunScoreNotEqualTo(Integer value) {
			addCriterion("meter1500_run_score <>", value, "meter1500RunScore");
			return (Criteria) this;
		}

		public Criteria andMeter1500RunScoreGreaterThan(Integer value) {
			addCriterion("meter1500_run_score >", value, "meter1500RunScore");
			return (Criteria) this;
		}

		public Criteria andMeter1500RunScoreGreaterThanOrEqualTo(Integer value) {
			addCriterion("meter1500_run_score >=", value, "meter1500RunScore");
			return (Criteria) this;
		}

		public Criteria andMeter1500RunScoreLessThan(Integer value) {
			addCriterion("meter1500_run_score <", value, "meter1500RunScore");
			return (Criteria) this;
		}

		public Criteria andMeter1500RunScoreLessThanOrEqualTo(Integer value) {
			addCriterion("meter1500_run_score <=", value, "meter1500RunScore");
			return (Criteria) this;
		}

		public Criteria andMeter1500RunScoreIn(List<Integer> values) {
			addCriterion("meter1500_run_score in", values, "meter1500RunScore");
			return (Criteria) this;
		}

		public Criteria andMeter1500RunScoreNotIn(List<Integer> values) {
			addCriterion("meter1500_run_score not in", values, "meter1500RunScore");
			return (Criteria) this;
		}

		public Criteria andMeter1500RunScoreBetween(Integer value1, Integer value2) {
			addCriterion("meter1500_run_score between", value1, value2, "meter1500RunScore");
			return (Criteria) this;
		}

		public Criteria andMeter1500RunScoreNotBetween(Integer value1, Integer value2) {
			addCriterion("meter1500_run_score not between", value1, value2, "meter1500RunScore");
			return (Criteria) this;
		}

		public Criteria andAbdominalCurlCountIsNull() {
			addCriterion("abdominal_curl_count is null");
			return (Criteria) this;
		}

		public Criteria andAbdominalCurlCountIsNotNull() {
			addCriterion("abdominal_curl_count is not null");
			return (Criteria) this;
		}

		public Criteria andAbdominalCurlCountEqualTo(Integer value) {
			addCriterion("abdominal_curl_count =", value, "abdominalCurlCount");
			return (Criteria) this;
		}

		public Criteria andAbdominalCurlCountNotEqualTo(Integer value) {
			addCriterion("abdominal_curl_count <>", value, "abdominalCurlCount");
			return (Criteria) this;
		}

		public Criteria andAbdominalCurlCountGreaterThan(Integer value) {
			addCriterion("abdominal_curl_count >", value, "abdominalCurlCount");
			return (Criteria) this;
		}

		public Criteria andAbdominalCurlCountGreaterThanOrEqualTo(Integer value) {
			addCriterion("abdominal_curl_count >=", value, "abdominalCurlCount");
			return (Criteria) this;
		}

		public Criteria andAbdominalCurlCountLessThan(Integer value) {
			addCriterion("abdominal_curl_count <", value, "abdominalCurlCount");
			return (Criteria) this;
		}

		public Criteria andAbdominalCurlCountLessThanOrEqualTo(Integer value) {
			addCriterion("abdominal_curl_count <=", value, "abdominalCurlCount");
			return (Criteria) this;
		}

		public Criteria andAbdominalCurlCountIn(List<Integer> values) {
			addCriterion("abdominal_curl_count in", values, "abdominalCurlCount");
			return (Criteria) this;
		}

		public Criteria andAbdominalCurlCountNotIn(List<Integer> values) {
			addCriterion("abdominal_curl_count not in", values, "abdominalCurlCount");
			return (Criteria) this;
		}

		public Criteria andAbdominalCurlCountBetween(Integer value1, Integer value2) {
			addCriterion("abdominal_curl_count between", value1, value2, "abdominalCurlCount");
			return (Criteria) this;
		}

		public Criteria andAbdominalCurlCountNotBetween(Integer value1, Integer value2) {
			addCriterion("abdominal_curl_count not between", value1, value2, "abdominalCurlCount");
			return (Criteria) this;
		}

		public Criteria andAbdominalCurlScoreIsNull() {
			addCriterion("abdominal_curl_score is null");
			return (Criteria) this;
		}

		public Criteria andAbdominalCurlScoreIsNotNull() {
			addCriterion("abdominal_curl_score is not null");
			return (Criteria) this;
		}

		public Criteria andAbdominalCurlScoreEqualTo(Integer value) {
			addCriterion("abdominal_curl_score =", value, "abdominalCurlScore");
			return (Criteria) this;
		}

		public Criteria andAbdominalCurlScoreNotEqualTo(Integer value) {
			addCriterion("abdominal_curl_score <>", value, "abdominalCurlScore");
			return (Criteria) this;
		}

		public Criteria andAbdominalCurlScoreGreaterThan(Integer value) {
			addCriterion("abdominal_curl_score >", value, "abdominalCurlScore");
			return (Criteria) this;
		}

		public Criteria andAbdominalCurlScoreGreaterThanOrEqualTo(Integer value) {
			addCriterion("abdominal_curl_score >=", value, "abdominalCurlScore");
			return (Criteria) this;
		}

		public Criteria andAbdominalCurlScoreLessThan(Integer value) {
			addCriterion("abdominal_curl_score <", value, "abdominalCurlScore");
			return (Criteria) this;
		}

		public Criteria andAbdominalCurlScoreLessThanOrEqualTo(Integer value) {
			addCriterion("abdominal_curl_score <=", value, "abdominalCurlScore");
			return (Criteria) this;
		}

		public Criteria andAbdominalCurlScoreIn(List<Integer> values) {
			addCriterion("abdominal_curl_score in", values, "abdominalCurlScore");
			return (Criteria) this;
		}

		public Criteria andAbdominalCurlScoreNotIn(List<Integer> values) {
			addCriterion("abdominal_curl_score not in", values, "abdominalCurlScore");
			return (Criteria) this;
		}

		public Criteria andAbdominalCurlScoreBetween(Integer value1, Integer value2) {
			addCriterion("abdominal_curl_score between", value1, value2, "abdominalCurlScore");
			return (Criteria) this;
		}

		public Criteria andAbdominalCurlScoreNotBetween(Integer value1, Integer value2) {
			addCriterion("abdominal_curl_score not between", value1, value2, "abdominalCurlScore");
			return (Criteria) this;
		}

		public Criteria andCreatedAtIsNull() {
			addCriterion("created_at is null");
			return (Criteria) this;
		}

		public Criteria andCreatedAtIsNotNull() {
			addCriterion("created_at is not null");
			return (Criteria) this;
		}

		public Criteria andCreatedAtEqualTo(Date value) {
			addCriterion("created_at =", value, "createdAt");
			return (Criteria) this;
		}

		public Criteria andCreatedAtNotEqualTo(Date value) {
			addCriterion("created_at <>", value, "createdAt");
			return (Criteria) this;
		}

		public Criteria andCreatedAtGreaterThan(Date value) {
			addCriterion("created_at >", value, "createdAt");
			return (Criteria) this;
		}

		public Criteria andCreatedAtGreaterThanOrEqualTo(Date value) {
			addCriterion("created_at >=", value, "createdAt");
			return (Criteria) this;
		}

		public Criteria andCreatedAtLessThan(Date value) {
			addCriterion("created_at <", value, "createdAt");
			return (Criteria) this;
		}

		public Criteria andCreatedAtLessThanOrEqualTo(Date value) {
			addCriterion("created_at <=", value, "createdAt");
			return (Criteria) this;
		}

		public Criteria andCreatedAtIn(List<Date> values) {
			addCriterion("created_at in", values, "createdAt");
			return (Criteria) this;
		}

		public Criteria andCreatedAtNotIn(List<Date> values) {
			addCriterion("created_at not in", values, "createdAt");
			return (Criteria) this;
		}

		public Criteria andCreatedAtBetween(Date value1, Date value2) {
			addCriterion("created_at between", value1, value2, "createdAt");
			return (Criteria) this;
		}

		public Criteria andCreatedAtNotBetween(Date value1, Date value2) {
			addCriterion("created_at not between", value1, value2, "createdAt");
			return (Criteria) this;
		}

		public Criteria andUpdatedAtIsNull() {
			addCriterion("updated_at is null");
			return (Criteria) this;
		}

		public Criteria andUpdatedAtIsNotNull() {
			addCriterion("updated_at is not null");
			return (Criteria) this;
		}

		public Criteria andUpdatedAtEqualTo(Date value) {
			addCriterion("updated_at =", value, "updatedAt");
			return (Criteria) this;
		}

		public Criteria andUpdatedAtNotEqualTo(Date value) {
			addCriterion("updated_at <>", value, "updatedAt");
			return (Criteria) this;
		}

		public Criteria andUpdatedAtGreaterThan(Date value) {
			addCriterion("updated_at >", value, "updatedAt");
			return (Criteria) this;
		}

		public Criteria andUpdatedAtGreaterThanOrEqualTo(Date value) {
			addCriterion("updated_at >=", value, "updatedAt");
			return (Criteria) this;
		}

		public Criteria andUpdatedAtLessThan(Date value) {
			addCriterion("updated_at <", value, "updatedAt");
			return (Criteria) this;
		}

		public Criteria andUpdatedAtLessThanOrEqualTo(Date value) {
			addCriterion("updated_at <=", value, "updatedAt");
			return (Criteria) this;
		}

		public Criteria andUpdatedAtIn(List<Date> values) {
			addCriterion("updated_at in", values, "updatedAt");
			return (Criteria) this;
		}

		public Criteria andUpdatedAtNotIn(List<Date> values) {
			addCriterion("updated_at not in", values, "updatedAt");
			return (Criteria) this;
		}

		public Criteria andUpdatedAtBetween(Date value1, Date value2) {
			addCriterion("updated_at between", value1, value2, "updatedAt");
			return (Criteria) this;
		}

		public Criteria andUpdatedAtNotBetween(Date value1, Date value2) {
			addCriterion("updated_at not between", value1, value2, "updatedAt");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table wzsport_sport_score
	 * @mbg.generated  Mon May 28 16:50:53 CST 2018
	 */
	public static class Criterion {
		private String condition;
		private Object value;
		private Object secondValue;
		private boolean noValue;
		private boolean singleValue;
		private boolean betweenValue;
		private boolean listValue;
		private String typeHandler;

		public String getCondition() {
			return condition;
		}

		public Object getValue() {
			return value;
		}

		public Object getSecondValue() {
			return secondValue;
		}

		public boolean isNoValue() {
			return noValue;
		}

		public boolean isSingleValue() {
			return singleValue;
		}

		public boolean isBetweenValue() {
			return betweenValue;
		}

		public boolean isListValue() {
			return listValue;
		}

		public String getTypeHandler() {
			return typeHandler;
		}

		protected Criterion(String condition) {
			super();
			this.condition = condition;
			this.typeHandler = null;
			this.noValue = true;
		}

		protected Criterion(String condition, Object value, String typeHandler) {
			super();
			this.condition = condition;
			this.value = value;
			this.typeHandler = typeHandler;
			if (value instanceof List<?>) {
				this.listValue = true;
			} else {
				this.singleValue = true;
			}
		}

		protected Criterion(String condition, Object value) {
			this(condition, value, null);
		}

		protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
			super();
			this.condition = condition;
			this.value = value;
			this.secondValue = secondValue;
			this.typeHandler = typeHandler;
			this.betweenValue = true;
		}

		protected Criterion(String condition, Object value, Object secondValue) {
			this(condition, value, secondValue, null);
		}
	}

	/**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table wzsport_sport_score
     *
     * @mbg.generated do_not_delete_during_merge Sun Nov 19 17:30:56 CST 2017
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}