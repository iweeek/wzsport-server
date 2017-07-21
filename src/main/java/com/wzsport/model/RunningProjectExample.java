package com.wzsport.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RunningProjectExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table wzsport_running_project
	 * @mbg.generated  Fri Jul 21 15:05:33 CST 2017
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table wzsport_running_project
	 * @mbg.generated  Fri Jul 21 15:05:33 CST 2017
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table wzsport_running_project
	 * @mbg.generated  Fri Jul 21 15:05:33 CST 2017
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_running_project
	 * @mbg.generated  Fri Jul 21 15:05:33 CST 2017
	 */
	public RunningProjectExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_running_project
	 * @mbg.generated  Fri Jul 21 15:05:33 CST 2017
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_running_project
	 * @mbg.generated  Fri Jul 21 15:05:33 CST 2017
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_running_project
	 * @mbg.generated  Fri Jul 21 15:05:33 CST 2017
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_running_project
	 * @mbg.generated  Fri Jul 21 15:05:33 CST 2017
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_running_project
	 * @mbg.generated  Fri Jul 21 15:05:33 CST 2017
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_running_project
	 * @mbg.generated  Fri Jul 21 15:05:33 CST 2017
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_running_project
	 * @mbg.generated  Fri Jul 21 15:05:33 CST 2017
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_running_project
	 * @mbg.generated  Fri Jul 21 15:05:33 CST 2017
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_running_project
	 * @mbg.generated  Fri Jul 21 15:05:33 CST 2017
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_running_project
	 * @mbg.generated  Fri Jul 21 15:05:33 CST 2017
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table wzsport_running_project
	 * @mbg.generated  Fri Jul 21 15:05:33 CST 2017
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

		public Criteria andUniversityIdIsNull() {
			addCriterion("university_id is null");
			return (Criteria) this;
		}

		public Criteria andUniversityIdIsNotNull() {
			addCriterion("university_id is not null");
			return (Criteria) this;
		}

		public Criteria andUniversityIdEqualTo(Long value) {
			addCriterion("university_id =", value, "universityId");
			return (Criteria) this;
		}

		public Criteria andUniversityIdNotEqualTo(Long value) {
			addCriterion("university_id <>", value, "universityId");
			return (Criteria) this;
		}

		public Criteria andUniversityIdGreaterThan(Long value) {
			addCriterion("university_id >", value, "universityId");
			return (Criteria) this;
		}

		public Criteria andUniversityIdGreaterThanOrEqualTo(Long value) {
			addCriterion("university_id >=", value, "universityId");
			return (Criteria) this;
		}

		public Criteria andUniversityIdLessThan(Long value) {
			addCriterion("university_id <", value, "universityId");
			return (Criteria) this;
		}

		public Criteria andUniversityIdLessThanOrEqualTo(Long value) {
			addCriterion("university_id <=", value, "universityId");
			return (Criteria) this;
		}

		public Criteria andUniversityIdIn(List<Long> values) {
			addCriterion("university_id in", values, "universityId");
			return (Criteria) this;
		}

		public Criteria andUniversityIdNotIn(List<Long> values) {
			addCriterion("university_id not in", values, "universityId");
			return (Criteria) this;
		}

		public Criteria andUniversityIdBetween(Long value1, Long value2) {
			addCriterion("university_id between", value1, value2, "universityId");
			return (Criteria) this;
		}

		public Criteria andUniversityIdNotBetween(Long value1, Long value2) {
			addCriterion("university_id not between", value1, value2, "universityId");
			return (Criteria) this;
		}

		public Criteria andNameIsNull() {
			addCriterion("name is null");
			return (Criteria) this;
		}

		public Criteria andNameIsNotNull() {
			addCriterion("name is not null");
			return (Criteria) this;
		}

		public Criteria andNameEqualTo(String value) {
			addCriterion("name =", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameNotEqualTo(String value) {
			addCriterion("name <>", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameGreaterThan(String value) {
			addCriterion("name >", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameGreaterThanOrEqualTo(String value) {
			addCriterion("name >=", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameLessThan(String value) {
			addCriterion("name <", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameLessThanOrEqualTo(String value) {
			addCriterion("name <=", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameLike(String value) {
			addCriterion("name like", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameNotLike(String value) {
			addCriterion("name not like", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameIn(List<String> values) {
			addCriterion("name in", values, "name");
			return (Criteria) this;
		}

		public Criteria andNameNotIn(List<String> values) {
			addCriterion("name not in", values, "name");
			return (Criteria) this;
		}

		public Criteria andNameBetween(String value1, String value2) {
			addCriterion("name between", value1, value2, "name");
			return (Criteria) this;
		}

		public Criteria andNameNotBetween(String value1, String value2) {
			addCriterion("name not between", value1, value2, "name");
			return (Criteria) this;
		}

		public Criteria andTypeIsNull() {
			addCriterion("type is null");
			return (Criteria) this;
		}

		public Criteria andTypeIsNotNull() {
			addCriterion("type is not null");
			return (Criteria) this;
		}

		public Criteria andTypeEqualTo(String value) {
			addCriterion("type =", value, "type");
			return (Criteria) this;
		}

		public Criteria andTypeNotEqualTo(String value) {
			addCriterion("type <>", value, "type");
			return (Criteria) this;
		}

		public Criteria andTypeGreaterThan(String value) {
			addCriterion("type >", value, "type");
			return (Criteria) this;
		}

		public Criteria andTypeGreaterThanOrEqualTo(String value) {
			addCriterion("type >=", value, "type");
			return (Criteria) this;
		}

		public Criteria andTypeLessThan(String value) {
			addCriterion("type <", value, "type");
			return (Criteria) this;
		}

		public Criteria andTypeLessThanOrEqualTo(String value) {
			addCriterion("type <=", value, "type");
			return (Criteria) this;
		}

		public Criteria andTypeLike(String value) {
			addCriterion("type like", value, "type");
			return (Criteria) this;
		}

		public Criteria andTypeNotLike(String value) {
			addCriterion("type not like", value, "type");
			return (Criteria) this;
		}

		public Criteria andTypeIn(List<String> values) {
			addCriterion("type in", values, "type");
			return (Criteria) this;
		}

		public Criteria andTypeNotIn(List<String> values) {
			addCriterion("type not in", values, "type");
			return (Criteria) this;
		}

		public Criteria andTypeBetween(String value1, String value2) {
			addCriterion("type between", value1, value2, "type");
			return (Criteria) this;
		}

		public Criteria andTypeNotBetween(String value1, String value2) {
			addCriterion("type not between", value1, value2, "type");
			return (Criteria) this;
		}

		public Criteria andEnabledIsNull() {
			addCriterion("enabled is null");
			return (Criteria) this;
		}

		public Criteria andEnabledIsNotNull() {
			addCriterion("enabled is not null");
			return (Criteria) this;
		}

		public Criteria andEnabledEqualTo(Boolean value) {
			addCriterion("enabled =", value, "enabled");
			return (Criteria) this;
		}

		public Criteria andEnabledNotEqualTo(Boolean value) {
			addCriterion("enabled <>", value, "enabled");
			return (Criteria) this;
		}

		public Criteria andEnabledGreaterThan(Boolean value) {
			addCriterion("enabled >", value, "enabled");
			return (Criteria) this;
		}

		public Criteria andEnabledGreaterThanOrEqualTo(Boolean value) {
			addCriterion("enabled >=", value, "enabled");
			return (Criteria) this;
		}

		public Criteria andEnabledLessThan(Boolean value) {
			addCriterion("enabled <", value, "enabled");
			return (Criteria) this;
		}

		public Criteria andEnabledLessThanOrEqualTo(Boolean value) {
			addCriterion("enabled <=", value, "enabled");
			return (Criteria) this;
		}

		public Criteria andEnabledIn(List<Boolean> values) {
			addCriterion("enabled in", values, "enabled");
			return (Criteria) this;
		}

		public Criteria andEnabledNotIn(List<Boolean> values) {
			addCriterion("enabled not in", values, "enabled");
			return (Criteria) this;
		}

		public Criteria andEnabledBetween(Boolean value1, Boolean value2) {
			addCriterion("enabled between", value1, value2, "enabled");
			return (Criteria) this;
		}

		public Criteria andEnabledNotBetween(Boolean value1, Boolean value2) {
			addCriterion("enabled not between", value1, value2, "enabled");
			return (Criteria) this;
		}

		public Criteria andQualifiedDistanceIsNull() {
			addCriterion("qualified_distance is null");
			return (Criteria) this;
		}

		public Criteria andQualifiedDistanceIsNotNull() {
			addCriterion("qualified_distance is not null");
			return (Criteria) this;
		}

		public Criteria andQualifiedDistanceEqualTo(Integer value) {
			addCriterion("qualified_distance =", value, "qualifiedDistance");
			return (Criteria) this;
		}

		public Criteria andQualifiedDistanceNotEqualTo(Integer value) {
			addCriterion("qualified_distance <>", value, "qualifiedDistance");
			return (Criteria) this;
		}

		public Criteria andQualifiedDistanceGreaterThan(Integer value) {
			addCriterion("qualified_distance >", value, "qualifiedDistance");
			return (Criteria) this;
		}

		public Criteria andQualifiedDistanceGreaterThanOrEqualTo(Integer value) {
			addCriterion("qualified_distance >=", value, "qualifiedDistance");
			return (Criteria) this;
		}

		public Criteria andQualifiedDistanceLessThan(Integer value) {
			addCriterion("qualified_distance <", value, "qualifiedDistance");
			return (Criteria) this;
		}

		public Criteria andQualifiedDistanceLessThanOrEqualTo(Integer value) {
			addCriterion("qualified_distance <=", value, "qualifiedDistance");
			return (Criteria) this;
		}

		public Criteria andQualifiedDistanceIn(List<Integer> values) {
			addCriterion("qualified_distance in", values, "qualifiedDistance");
			return (Criteria) this;
		}

		public Criteria andQualifiedDistanceNotIn(List<Integer> values) {
			addCriterion("qualified_distance not in", values, "qualifiedDistance");
			return (Criteria) this;
		}

		public Criteria andQualifiedDistanceBetween(Integer value1, Integer value2) {
			addCriterion("qualified_distance between", value1, value2, "qualifiedDistance");
			return (Criteria) this;
		}

		public Criteria andQualifiedDistanceNotBetween(Integer value1, Integer value2) {
			addCriterion("qualified_distance not between", value1, value2, "qualifiedDistance");
			return (Criteria) this;
		}

		public Criteria andQualifiedCostTimeIsNull() {
			addCriterion("qualified_cost_time is null");
			return (Criteria) this;
		}

		public Criteria andQualifiedCostTimeIsNotNull() {
			addCriterion("qualified_cost_time is not null");
			return (Criteria) this;
		}

		public Criteria andQualifiedCostTimeEqualTo(Integer value) {
			addCriterion("qualified_cost_time =", value, "qualifiedCostTime");
			return (Criteria) this;
		}

		public Criteria andQualifiedCostTimeNotEqualTo(Integer value) {
			addCriterion("qualified_cost_time <>", value, "qualifiedCostTime");
			return (Criteria) this;
		}

		public Criteria andQualifiedCostTimeGreaterThan(Integer value) {
			addCriterion("qualified_cost_time >", value, "qualifiedCostTime");
			return (Criteria) this;
		}

		public Criteria andQualifiedCostTimeGreaterThanOrEqualTo(Integer value) {
			addCriterion("qualified_cost_time >=", value, "qualifiedCostTime");
			return (Criteria) this;
		}

		public Criteria andQualifiedCostTimeLessThan(Integer value) {
			addCriterion("qualified_cost_time <", value, "qualifiedCostTime");
			return (Criteria) this;
		}

		public Criteria andQualifiedCostTimeLessThanOrEqualTo(Integer value) {
			addCriterion("qualified_cost_time <=", value, "qualifiedCostTime");
			return (Criteria) this;
		}

		public Criteria andQualifiedCostTimeIn(List<Integer> values) {
			addCriterion("qualified_cost_time in", values, "qualifiedCostTime");
			return (Criteria) this;
		}

		public Criteria andQualifiedCostTimeNotIn(List<Integer> values) {
			addCriterion("qualified_cost_time not in", values, "qualifiedCostTime");
			return (Criteria) this;
		}

		public Criteria andQualifiedCostTimeBetween(Integer value1, Integer value2) {
			addCriterion("qualified_cost_time between", value1, value2, "qualifiedCostTime");
			return (Criteria) this;
		}

		public Criteria andQualifiedCostTimeNotBetween(Integer value1, Integer value2) {
			addCriterion("qualified_cost_time not between", value1, value2, "qualifiedCostTime");
			return (Criteria) this;
		}

		public Criteria andMinCostTimeIsNull() {
			addCriterion("min_cost_time is null");
			return (Criteria) this;
		}

		public Criteria andMinCostTimeIsNotNull() {
			addCriterion("min_cost_time is not null");
			return (Criteria) this;
		}

		public Criteria andMinCostTimeEqualTo(Integer value) {
			addCriterion("min_cost_time =", value, "minCostTime");
			return (Criteria) this;
		}

		public Criteria andMinCostTimeNotEqualTo(Integer value) {
			addCriterion("min_cost_time <>", value, "minCostTime");
			return (Criteria) this;
		}

		public Criteria andMinCostTimeGreaterThan(Integer value) {
			addCriterion("min_cost_time >", value, "minCostTime");
			return (Criteria) this;
		}

		public Criteria andMinCostTimeGreaterThanOrEqualTo(Integer value) {
			addCriterion("min_cost_time >=", value, "minCostTime");
			return (Criteria) this;
		}

		public Criteria andMinCostTimeLessThan(Integer value) {
			addCriterion("min_cost_time <", value, "minCostTime");
			return (Criteria) this;
		}

		public Criteria andMinCostTimeLessThanOrEqualTo(Integer value) {
			addCriterion("min_cost_time <=", value, "minCostTime");
			return (Criteria) this;
		}

		public Criteria andMinCostTimeIn(List<Integer> values) {
			addCriterion("min_cost_time in", values, "minCostTime");
			return (Criteria) this;
		}

		public Criteria andMinCostTimeNotIn(List<Integer> values) {
			addCriterion("min_cost_time not in", values, "minCostTime");
			return (Criteria) this;
		}

		public Criteria andMinCostTimeBetween(Integer value1, Integer value2) {
			addCriterion("min_cost_time between", value1, value2, "minCostTime");
			return (Criteria) this;
		}

		public Criteria andMinCostTimeNotBetween(Integer value1, Integer value2) {
			addCriterion("min_cost_time not between", value1, value2, "minCostTime");
			return (Criteria) this;
		}

		public Criteria andHourlyKcalConsumptionIsNull() {
			addCriterion("hourly_kcal_consumption is null");
			return (Criteria) this;
		}

		public Criteria andHourlyKcalConsumptionIsNotNull() {
			addCriterion("hourly_kcal_consumption is not null");
			return (Criteria) this;
		}

		public Criteria andHourlyKcalConsumptionEqualTo(Integer value) {
			addCriterion("hourly_kcal_consumption =", value, "hourlyKcalConsumption");
			return (Criteria) this;
		}

		public Criteria andHourlyKcalConsumptionNotEqualTo(Integer value) {
			addCriterion("hourly_kcal_consumption <>", value, "hourlyKcalConsumption");
			return (Criteria) this;
		}

		public Criteria andHourlyKcalConsumptionGreaterThan(Integer value) {
			addCriterion("hourly_kcal_consumption >", value, "hourlyKcalConsumption");
			return (Criteria) this;
		}

		public Criteria andHourlyKcalConsumptionGreaterThanOrEqualTo(Integer value) {
			addCriterion("hourly_kcal_consumption >=", value, "hourlyKcalConsumption");
			return (Criteria) this;
		}

		public Criteria andHourlyKcalConsumptionLessThan(Integer value) {
			addCriterion("hourly_kcal_consumption <", value, "hourlyKcalConsumption");
			return (Criteria) this;
		}

		public Criteria andHourlyKcalConsumptionLessThanOrEqualTo(Integer value) {
			addCriterion("hourly_kcal_consumption <=", value, "hourlyKcalConsumption");
			return (Criteria) this;
		}

		public Criteria andHourlyKcalConsumptionIn(List<Integer> values) {
			addCriterion("hourly_kcal_consumption in", values, "hourlyKcalConsumption");
			return (Criteria) this;
		}

		public Criteria andHourlyKcalConsumptionNotIn(List<Integer> values) {
			addCriterion("hourly_kcal_consumption not in", values, "hourlyKcalConsumption");
			return (Criteria) this;
		}

		public Criteria andHourlyKcalConsumptionBetween(Integer value1, Integer value2) {
			addCriterion("hourly_kcal_consumption between", value1, value2, "hourlyKcalConsumption");
			return (Criteria) this;
		}

		public Criteria andHourlyKcalConsumptionNotBetween(Integer value1, Integer value2) {
			addCriterion("hourly_kcal_consumption not between", value1, value2, "hourlyKcalConsumption");
			return (Criteria) this;
		}

		public Criteria andAcquisitionIntervalIsNull() {
			addCriterion("acquisition_interval is null");
			return (Criteria) this;
		}

		public Criteria andAcquisitionIntervalIsNotNull() {
			addCriterion("acquisition_interval is not null");
			return (Criteria) this;
		}

		public Criteria andAcquisitionIntervalEqualTo(Integer value) {
			addCriterion("acquisition_interval =", value, "acquisitionInterval");
			return (Criteria) this;
		}

		public Criteria andAcquisitionIntervalNotEqualTo(Integer value) {
			addCriterion("acquisition_interval <>", value, "acquisitionInterval");
			return (Criteria) this;
		}

		public Criteria andAcquisitionIntervalGreaterThan(Integer value) {
			addCriterion("acquisition_interval >", value, "acquisitionInterval");
			return (Criteria) this;
		}

		public Criteria andAcquisitionIntervalGreaterThanOrEqualTo(Integer value) {
			addCriterion("acquisition_interval >=", value, "acquisitionInterval");
			return (Criteria) this;
		}

		public Criteria andAcquisitionIntervalLessThan(Integer value) {
			addCriterion("acquisition_interval <", value, "acquisitionInterval");
			return (Criteria) this;
		}

		public Criteria andAcquisitionIntervalLessThanOrEqualTo(Integer value) {
			addCriterion("acquisition_interval <=", value, "acquisitionInterval");
			return (Criteria) this;
		}

		public Criteria andAcquisitionIntervalIn(List<Integer> values) {
			addCriterion("acquisition_interval in", values, "acquisitionInterval");
			return (Criteria) this;
		}

		public Criteria andAcquisitionIntervalNotIn(List<Integer> values) {
			addCriterion("acquisition_interval not in", values, "acquisitionInterval");
			return (Criteria) this;
		}

		public Criteria andAcquisitionIntervalBetween(Integer value1, Integer value2) {
			addCriterion("acquisition_interval between", value1, value2, "acquisitionInterval");
			return (Criteria) this;
		}

		public Criteria andAcquisitionIntervalNotBetween(Integer value1, Integer value2) {
			addCriterion("acquisition_interval not between", value1, value2, "acquisitionInterval");
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
	 * This class was generated by MyBatis Generator. This class corresponds to the database table wzsport_running_project
	 * @mbg.generated  Fri Jul 21 15:05:33 CST 2017
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
     * This class corresponds to the database table wzsport_running_project
     *
     * @mbg.generated do_not_delete_during_merge Tue Jun 06 15:38:49 CST 2017
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}