package com.wzsport.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RunningActivityExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table wzsport_running_activity
	 * @mbg.generated  Tue Jul 04 15:46:25 CST 2017
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table wzsport_running_activity
	 * @mbg.generated  Tue Jul 04 15:46:25 CST 2017
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table wzsport_running_activity
	 * @mbg.generated  Tue Jul 04 15:46:25 CST 2017
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_running_activity
	 * @mbg.generated  Tue Jul 04 15:46:25 CST 2017
	 */
	public RunningActivityExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_running_activity
	 * @mbg.generated  Tue Jul 04 15:46:25 CST 2017
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_running_activity
	 * @mbg.generated  Tue Jul 04 15:46:25 CST 2017
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_running_activity
	 * @mbg.generated  Tue Jul 04 15:46:25 CST 2017
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_running_activity
	 * @mbg.generated  Tue Jul 04 15:46:25 CST 2017
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_running_activity
	 * @mbg.generated  Tue Jul 04 15:46:25 CST 2017
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_running_activity
	 * @mbg.generated  Tue Jul 04 15:46:25 CST 2017
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_running_activity
	 * @mbg.generated  Tue Jul 04 15:46:25 CST 2017
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_running_activity
	 * @mbg.generated  Tue Jul 04 15:46:25 CST 2017
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_running_activity
	 * @mbg.generated  Tue Jul 04 15:46:25 CST 2017
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_running_activity
	 * @mbg.generated  Tue Jul 04 15:46:25 CST 2017
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table wzsport_running_activity
	 * @mbg.generated  Tue Jul 04 15:46:25 CST 2017
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

		public Criteria andProjectIdIsNull() {
			addCriterion("project_id is null");
			return (Criteria) this;
		}

		public Criteria andProjectIdIsNotNull() {
			addCriterion("project_id is not null");
			return (Criteria) this;
		}

		public Criteria andProjectIdEqualTo(Long value) {
			addCriterion("project_id =", value, "projectId");
			return (Criteria) this;
		}

		public Criteria andProjectIdNotEqualTo(Long value) {
			addCriterion("project_id <>", value, "projectId");
			return (Criteria) this;
		}

		public Criteria andProjectIdGreaterThan(Long value) {
			addCriterion("project_id >", value, "projectId");
			return (Criteria) this;
		}

		public Criteria andProjectIdGreaterThanOrEqualTo(Long value) {
			addCriterion("project_id >=", value, "projectId");
			return (Criteria) this;
		}

		public Criteria andProjectIdLessThan(Long value) {
			addCriterion("project_id <", value, "projectId");
			return (Criteria) this;
		}

		public Criteria andProjectIdLessThanOrEqualTo(Long value) {
			addCriterion("project_id <=", value, "projectId");
			return (Criteria) this;
		}

		public Criteria andProjectIdIn(List<Long> values) {
			addCriterion("project_id in", values, "projectId");
			return (Criteria) this;
		}

		public Criteria andProjectIdNotIn(List<Long> values) {
			addCriterion("project_id not in", values, "projectId");
			return (Criteria) this;
		}

		public Criteria andProjectIdBetween(Long value1, Long value2) {
			addCriterion("project_id between", value1, value2, "projectId");
			return (Criteria) this;
		}

		public Criteria andProjectIdNotBetween(Long value1, Long value2) {
			addCriterion("project_id not between", value1, value2, "projectId");
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

		public Criteria andDistanceIsNull() {
			addCriterion("distance is null");
			return (Criteria) this;
		}

		public Criteria andDistanceIsNotNull() {
			addCriterion("distance is not null");
			return (Criteria) this;
		}

		public Criteria andDistanceEqualTo(Integer value) {
			addCriterion("distance =", value, "distance");
			return (Criteria) this;
		}

		public Criteria andDistanceNotEqualTo(Integer value) {
			addCriterion("distance <>", value, "distance");
			return (Criteria) this;
		}

		public Criteria andDistanceGreaterThan(Integer value) {
			addCriterion("distance >", value, "distance");
			return (Criteria) this;
		}

		public Criteria andDistanceGreaterThanOrEqualTo(Integer value) {
			addCriterion("distance >=", value, "distance");
			return (Criteria) this;
		}

		public Criteria andDistanceLessThan(Integer value) {
			addCriterion("distance <", value, "distance");
			return (Criteria) this;
		}

		public Criteria andDistanceLessThanOrEqualTo(Integer value) {
			addCriterion("distance <=", value, "distance");
			return (Criteria) this;
		}

		public Criteria andDistanceIn(List<Integer> values) {
			addCriterion("distance in", values, "distance");
			return (Criteria) this;
		}

		public Criteria andDistanceNotIn(List<Integer> values) {
			addCriterion("distance not in", values, "distance");
			return (Criteria) this;
		}

		public Criteria andDistanceBetween(Integer value1, Integer value2) {
			addCriterion("distance between", value1, value2, "distance");
			return (Criteria) this;
		}

		public Criteria andDistanceNotBetween(Integer value1, Integer value2) {
			addCriterion("distance not between", value1, value2, "distance");
			return (Criteria) this;
		}

		public Criteria andStepCountIsNull() {
			addCriterion("step_count is null");
			return (Criteria) this;
		}

		public Criteria andStepCountIsNotNull() {
			addCriterion("step_count is not null");
			return (Criteria) this;
		}

		public Criteria andStepCountEqualTo(Integer value) {
			addCriterion("step_count =", value, "stepCount");
			return (Criteria) this;
		}

		public Criteria andStepCountNotEqualTo(Integer value) {
			addCriterion("step_count <>", value, "stepCount");
			return (Criteria) this;
		}

		public Criteria andStepCountGreaterThan(Integer value) {
			addCriterion("step_count >", value, "stepCount");
			return (Criteria) this;
		}

		public Criteria andStepCountGreaterThanOrEqualTo(Integer value) {
			addCriterion("step_count >=", value, "stepCount");
			return (Criteria) this;
		}

		public Criteria andStepCountLessThan(Integer value) {
			addCriterion("step_count <", value, "stepCount");
			return (Criteria) this;
		}

		public Criteria andStepCountLessThanOrEqualTo(Integer value) {
			addCriterion("step_count <=", value, "stepCount");
			return (Criteria) this;
		}

		public Criteria andStepCountIn(List<Integer> values) {
			addCriterion("step_count in", values, "stepCount");
			return (Criteria) this;
		}

		public Criteria andStepCountNotIn(List<Integer> values) {
			addCriterion("step_count not in", values, "stepCount");
			return (Criteria) this;
		}

		public Criteria andStepCountBetween(Integer value1, Integer value2) {
			addCriterion("step_count between", value1, value2, "stepCount");
			return (Criteria) this;
		}

		public Criteria andStepCountNotBetween(Integer value1, Integer value2) {
			addCriterion("step_count not between", value1, value2, "stepCount");
			return (Criteria) this;
		}

		public Criteria andCostTimeIsNull() {
			addCriterion("cost_time is null");
			return (Criteria) this;
		}

		public Criteria andCostTimeIsNotNull() {
			addCriterion("cost_time is not null");
			return (Criteria) this;
		}

		public Criteria andCostTimeEqualTo(Integer value) {
			addCriterion("cost_time =", value, "costTime");
			return (Criteria) this;
		}

		public Criteria andCostTimeNotEqualTo(Integer value) {
			addCriterion("cost_time <>", value, "costTime");
			return (Criteria) this;
		}

		public Criteria andCostTimeGreaterThan(Integer value) {
			addCriterion("cost_time >", value, "costTime");
			return (Criteria) this;
		}

		public Criteria andCostTimeGreaterThanOrEqualTo(Integer value) {
			addCriterion("cost_time >=", value, "costTime");
			return (Criteria) this;
		}

		public Criteria andCostTimeLessThan(Integer value) {
			addCriterion("cost_time <", value, "costTime");
			return (Criteria) this;
		}

		public Criteria andCostTimeLessThanOrEqualTo(Integer value) {
			addCriterion("cost_time <=", value, "costTime");
			return (Criteria) this;
		}

		public Criteria andCostTimeIn(List<Integer> values) {
			addCriterion("cost_time in", values, "costTime");
			return (Criteria) this;
		}

		public Criteria andCostTimeNotIn(List<Integer> values) {
			addCriterion("cost_time not in", values, "costTime");
			return (Criteria) this;
		}

		public Criteria andCostTimeBetween(Integer value1, Integer value2) {
			addCriterion("cost_time between", value1, value2, "costTime");
			return (Criteria) this;
		}

		public Criteria andCostTimeNotBetween(Integer value1, Integer value2) {
			addCriterion("cost_time not between", value1, value2, "costTime");
			return (Criteria) this;
		}

		public Criteria andSpeedIsNull() {
			addCriterion("speed is null");
			return (Criteria) this;
		}

		public Criteria andSpeedIsNotNull() {
			addCriterion("speed is not null");
			return (Criteria) this;
		}

		public Criteria andSpeedEqualTo(Double value) {
			addCriterion("speed =", value, "speed");
			return (Criteria) this;
		}

		public Criteria andSpeedNotEqualTo(Double value) {
			addCriterion("speed <>", value, "speed");
			return (Criteria) this;
		}

		public Criteria andSpeedGreaterThan(Double value) {
			addCriterion("speed >", value, "speed");
			return (Criteria) this;
		}

		public Criteria andSpeedGreaterThanOrEqualTo(Double value) {
			addCriterion("speed >=", value, "speed");
			return (Criteria) this;
		}

		public Criteria andSpeedLessThan(Double value) {
			addCriterion("speed <", value, "speed");
			return (Criteria) this;
		}

		public Criteria andSpeedLessThanOrEqualTo(Double value) {
			addCriterion("speed <=", value, "speed");
			return (Criteria) this;
		}

		public Criteria andSpeedIn(List<Double> values) {
			addCriterion("speed in", values, "speed");
			return (Criteria) this;
		}

		public Criteria andSpeedNotIn(List<Double> values) {
			addCriterion("speed not in", values, "speed");
			return (Criteria) this;
		}

		public Criteria andSpeedBetween(Double value1, Double value2) {
			addCriterion("speed between", value1, value2, "speed");
			return (Criteria) this;
		}

		public Criteria andSpeedNotBetween(Double value1, Double value2) {
			addCriterion("speed not between", value1, value2, "speed");
			return (Criteria) this;
		}

		public Criteria andStepPerSecondIsNull() {
			addCriterion("step_per_second is null");
			return (Criteria) this;
		}

		public Criteria andStepPerSecondIsNotNull() {
			addCriterion("step_per_second is not null");
			return (Criteria) this;
		}

		public Criteria andStepPerSecondEqualTo(Double value) {
			addCriterion("step_per_second =", value, "stepPerSecond");
			return (Criteria) this;
		}

		public Criteria andStepPerSecondNotEqualTo(Double value) {
			addCriterion("step_per_second <>", value, "stepPerSecond");
			return (Criteria) this;
		}

		public Criteria andStepPerSecondGreaterThan(Double value) {
			addCriterion("step_per_second >", value, "stepPerSecond");
			return (Criteria) this;
		}

		public Criteria andStepPerSecondGreaterThanOrEqualTo(Double value) {
			addCriterion("step_per_second >=", value, "stepPerSecond");
			return (Criteria) this;
		}

		public Criteria andStepPerSecondLessThan(Double value) {
			addCriterion("step_per_second <", value, "stepPerSecond");
			return (Criteria) this;
		}

		public Criteria andStepPerSecondLessThanOrEqualTo(Double value) {
			addCriterion("step_per_second <=", value, "stepPerSecond");
			return (Criteria) this;
		}

		public Criteria andStepPerSecondIn(List<Double> values) {
			addCriterion("step_per_second in", values, "stepPerSecond");
			return (Criteria) this;
		}

		public Criteria andStepPerSecondNotIn(List<Double> values) {
			addCriterion("step_per_second not in", values, "stepPerSecond");
			return (Criteria) this;
		}

		public Criteria andStepPerSecondBetween(Double value1, Double value2) {
			addCriterion("step_per_second between", value1, value2, "stepPerSecond");
			return (Criteria) this;
		}

		public Criteria andStepPerSecondNotBetween(Double value1, Double value2) {
			addCriterion("step_per_second not between", value1, value2, "stepPerSecond");
			return (Criteria) this;
		}

		public Criteria andDistancePerStepIsNull() {
			addCriterion("distance_per_step is null");
			return (Criteria) this;
		}

		public Criteria andDistancePerStepIsNotNull() {
			addCriterion("distance_per_step is not null");
			return (Criteria) this;
		}

		public Criteria andDistancePerStepEqualTo(Double value) {
			addCriterion("distance_per_step =", value, "distancePerStep");
			return (Criteria) this;
		}

		public Criteria andDistancePerStepNotEqualTo(Double value) {
			addCriterion("distance_per_step <>", value, "distancePerStep");
			return (Criteria) this;
		}

		public Criteria andDistancePerStepGreaterThan(Double value) {
			addCriterion("distance_per_step >", value, "distancePerStep");
			return (Criteria) this;
		}

		public Criteria andDistancePerStepGreaterThanOrEqualTo(Double value) {
			addCriterion("distance_per_step >=", value, "distancePerStep");
			return (Criteria) this;
		}

		public Criteria andDistancePerStepLessThan(Double value) {
			addCriterion("distance_per_step <", value, "distancePerStep");
			return (Criteria) this;
		}

		public Criteria andDistancePerStepLessThanOrEqualTo(Double value) {
			addCriterion("distance_per_step <=", value, "distancePerStep");
			return (Criteria) this;
		}

		public Criteria andDistancePerStepIn(List<Double> values) {
			addCriterion("distance_per_step in", values, "distancePerStep");
			return (Criteria) this;
		}

		public Criteria andDistancePerStepNotIn(List<Double> values) {
			addCriterion("distance_per_step not in", values, "distancePerStep");
			return (Criteria) this;
		}

		public Criteria andDistancePerStepBetween(Double value1, Double value2) {
			addCriterion("distance_per_step between", value1, value2, "distancePerStep");
			return (Criteria) this;
		}

		public Criteria andDistancePerStepNotBetween(Double value1, Double value2) {
			addCriterion("distance_per_step not between", value1, value2, "distancePerStep");
			return (Criteria) this;
		}

		public Criteria andTargetFinishedTimeIsNull() {
			addCriterion("target_finished_time is null");
			return (Criteria) this;
		}

		public Criteria andTargetFinishedTimeIsNotNull() {
			addCriterion("target_finished_time is not null");
			return (Criteria) this;
		}

		public Criteria andTargetFinishedTimeEqualTo(Integer value) {
			addCriterion("target_finished_time =", value, "targetFinishedTime");
			return (Criteria) this;
		}

		public Criteria andTargetFinishedTimeNotEqualTo(Integer value) {
			addCriterion("target_finished_time <>", value, "targetFinishedTime");
			return (Criteria) this;
		}

		public Criteria andTargetFinishedTimeGreaterThan(Integer value) {
			addCriterion("target_finished_time >", value, "targetFinishedTime");
			return (Criteria) this;
		}

		public Criteria andTargetFinishedTimeGreaterThanOrEqualTo(Integer value) {
			addCriterion("target_finished_time >=", value, "targetFinishedTime");
			return (Criteria) this;
		}

		public Criteria andTargetFinishedTimeLessThan(Integer value) {
			addCriterion("target_finished_time <", value, "targetFinishedTime");
			return (Criteria) this;
		}

		public Criteria andTargetFinishedTimeLessThanOrEqualTo(Integer value) {
			addCriterion("target_finished_time <=", value, "targetFinishedTime");
			return (Criteria) this;
		}

		public Criteria andTargetFinishedTimeIn(List<Integer> values) {
			addCriterion("target_finished_time in", values, "targetFinishedTime");
			return (Criteria) this;
		}

		public Criteria andTargetFinishedTimeNotIn(List<Integer> values) {
			addCriterion("target_finished_time not in", values, "targetFinishedTime");
			return (Criteria) this;
		}

		public Criteria andTargetFinishedTimeBetween(Integer value1, Integer value2) {
			addCriterion("target_finished_time between", value1, value2, "targetFinishedTime");
			return (Criteria) this;
		}

		public Criteria andTargetFinishedTimeNotBetween(Integer value1, Integer value2) {
			addCriterion("target_finished_time not between", value1, value2, "targetFinishedTime");
			return (Criteria) this;
		}

		public Criteria andStartTimeIsNull() {
			addCriterion("start_time is null");
			return (Criteria) this;
		}

		public Criteria andStartTimeIsNotNull() {
			addCriterion("start_time is not null");
			return (Criteria) this;
		}

		public Criteria andStartTimeEqualTo(Date value) {
			addCriterion("start_time =", value, "startTime");
			return (Criteria) this;
		}

		public Criteria andStartTimeNotEqualTo(Date value) {
			addCriterion("start_time <>", value, "startTime");
			return (Criteria) this;
		}

		public Criteria andStartTimeGreaterThan(Date value) {
			addCriterion("start_time >", value, "startTime");
			return (Criteria) this;
		}

		public Criteria andStartTimeGreaterThanOrEqualTo(Date value) {
			addCriterion("start_time >=", value, "startTime");
			return (Criteria) this;
		}

		public Criteria andStartTimeLessThan(Date value) {
			addCriterion("start_time <", value, "startTime");
			return (Criteria) this;
		}

		public Criteria andStartTimeLessThanOrEqualTo(Date value) {
			addCriterion("start_time <=", value, "startTime");
			return (Criteria) this;
		}

		public Criteria andStartTimeIn(List<Date> values) {
			addCriterion("start_time in", values, "startTime");
			return (Criteria) this;
		}

		public Criteria andStartTimeNotIn(List<Date> values) {
			addCriterion("start_time not in", values, "startTime");
			return (Criteria) this;
		}

		public Criteria andStartTimeBetween(Date value1, Date value2) {
			addCriterion("start_time between", value1, value2, "startTime");
			return (Criteria) this;
		}

		public Criteria andStartTimeNotBetween(Date value1, Date value2) {
			addCriterion("start_time not between", value1, value2, "startTime");
			return (Criteria) this;
		}

		public Criteria andCaloriesConsumedIsNull() {
			addCriterion("calories_consumed is null");
			return (Criteria) this;
		}

		public Criteria andCaloriesConsumedIsNotNull() {
			addCriterion("calories_consumed is not null");
			return (Criteria) this;
		}

		public Criteria andCaloriesConsumedEqualTo(Integer value) {
			addCriterion("calories_consumed =", value, "caloriesConsumed");
			return (Criteria) this;
		}

		public Criteria andCaloriesConsumedNotEqualTo(Integer value) {
			addCriterion("calories_consumed <>", value, "caloriesConsumed");
			return (Criteria) this;
		}

		public Criteria andCaloriesConsumedGreaterThan(Integer value) {
			addCriterion("calories_consumed >", value, "caloriesConsumed");
			return (Criteria) this;
		}

		public Criteria andCaloriesConsumedGreaterThanOrEqualTo(Integer value) {
			addCriterion("calories_consumed >=", value, "caloriesConsumed");
			return (Criteria) this;
		}

		public Criteria andCaloriesConsumedLessThan(Integer value) {
			addCriterion("calories_consumed <", value, "caloriesConsumed");
			return (Criteria) this;
		}

		public Criteria andCaloriesConsumedLessThanOrEqualTo(Integer value) {
			addCriterion("calories_consumed <=", value, "caloriesConsumed");
			return (Criteria) this;
		}

		public Criteria andCaloriesConsumedIn(List<Integer> values) {
			addCriterion("calories_consumed in", values, "caloriesConsumed");
			return (Criteria) this;
		}

		public Criteria andCaloriesConsumedNotIn(List<Integer> values) {
			addCriterion("calories_consumed not in", values, "caloriesConsumed");
			return (Criteria) this;
		}

		public Criteria andCaloriesConsumedBetween(Integer value1, Integer value2) {
			addCriterion("calories_consumed between", value1, value2, "caloriesConsumed");
			return (Criteria) this;
		}

		public Criteria andCaloriesConsumedNotBetween(Integer value1, Integer value2) {
			addCriterion("calories_consumed not between", value1, value2, "caloriesConsumed");
			return (Criteria) this;
		}

		public Criteria andQualifiedIsNull() {
			addCriterion("qualified is null");
			return (Criteria) this;
		}

		public Criteria andQualifiedIsNotNull() {
			addCriterion("qualified is not null");
			return (Criteria) this;
		}

		public Criteria andQualifiedEqualTo(Boolean value) {
			addCriterion("qualified =", value, "qualified");
			return (Criteria) this;
		}

		public Criteria andQualifiedNotEqualTo(Boolean value) {
			addCriterion("qualified <>", value, "qualified");
			return (Criteria) this;
		}

		public Criteria andQualifiedGreaterThan(Boolean value) {
			addCriterion("qualified >", value, "qualified");
			return (Criteria) this;
		}

		public Criteria andQualifiedGreaterThanOrEqualTo(Boolean value) {
			addCriterion("qualified >=", value, "qualified");
			return (Criteria) this;
		}

		public Criteria andQualifiedLessThan(Boolean value) {
			addCriterion("qualified <", value, "qualified");
			return (Criteria) this;
		}

		public Criteria andQualifiedLessThanOrEqualTo(Boolean value) {
			addCriterion("qualified <=", value, "qualified");
			return (Criteria) this;
		}

		public Criteria andQualifiedIn(List<Boolean> values) {
			addCriterion("qualified in", values, "qualified");
			return (Criteria) this;
		}

		public Criteria andQualifiedNotIn(List<Boolean> values) {
			addCriterion("qualified not in", values, "qualified");
			return (Criteria) this;
		}

		public Criteria andQualifiedBetween(Boolean value1, Boolean value2) {
			addCriterion("qualified between", value1, value2, "qualified");
			return (Criteria) this;
		}

		public Criteria andQualifiedNotBetween(Boolean value1, Boolean value2) {
			addCriterion("qualified not between", value1, value2, "qualified");
			return (Criteria) this;
		}

		public Criteria andEndedIsNull() {
			addCriterion("ended is null");
			return (Criteria) this;
		}

		public Criteria andEndedIsNotNull() {
			addCriterion("ended is not null");
			return (Criteria) this;
		}

		public Criteria andEndedEqualTo(Boolean value) {
			addCriterion("ended =", value, "ended");
			return (Criteria) this;
		}

		public Criteria andEndedNotEqualTo(Boolean value) {
			addCriterion("ended <>", value, "ended");
			return (Criteria) this;
		}

		public Criteria andEndedGreaterThan(Boolean value) {
			addCriterion("ended >", value, "ended");
			return (Criteria) this;
		}

		public Criteria andEndedGreaterThanOrEqualTo(Boolean value) {
			addCriterion("ended >=", value, "ended");
			return (Criteria) this;
		}

		public Criteria andEndedLessThan(Boolean value) {
			addCriterion("ended <", value, "ended");
			return (Criteria) this;
		}

		public Criteria andEndedLessThanOrEqualTo(Boolean value) {
			addCriterion("ended <=", value, "ended");
			return (Criteria) this;
		}

		public Criteria andEndedIn(List<Boolean> values) {
			addCriterion("ended in", values, "ended");
			return (Criteria) this;
		}

		public Criteria andEndedNotIn(List<Boolean> values) {
			addCriterion("ended not in", values, "ended");
			return (Criteria) this;
		}

		public Criteria andEndedBetween(Boolean value1, Boolean value2) {
			addCriterion("ended between", value1, value2, "ended");
			return (Criteria) this;
		}

		public Criteria andEndedNotBetween(Boolean value1, Boolean value2) {
			addCriterion("ended not between", value1, value2, "ended");
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
	 * This class was generated by MyBatis Generator. This class corresponds to the database table wzsport_running_activity
	 * @mbg.generated  Tue Jul 04 15:46:25 CST 2017
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
     * This class corresponds to the database table wzsport_running_activity
     *
     * @mbg.generated do_not_delete_during_merge Tue Jun 06 15:38:49 CST 2017
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}