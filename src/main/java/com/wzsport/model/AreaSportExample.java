package com.wzsport.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AreaSportExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table wzsport_area_sport
	 * @mbg.generated  Fri Jul 28 15:35:38 CST 2017
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table wzsport_area_sport
	 * @mbg.generated  Fri Jul 28 15:35:38 CST 2017
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table wzsport_area_sport
	 * @mbg.generated  Fri Jul 28 15:35:38 CST 2017
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_area_sport
	 * @mbg.generated  Fri Jul 28 15:35:38 CST 2017
	 */
	public AreaSportExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_area_sport
	 * @mbg.generated  Fri Jul 28 15:35:38 CST 2017
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_area_sport
	 * @mbg.generated  Fri Jul 28 15:35:38 CST 2017
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_area_sport
	 * @mbg.generated  Fri Jul 28 15:35:38 CST 2017
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_area_sport
	 * @mbg.generated  Fri Jul 28 15:35:38 CST 2017
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_area_sport
	 * @mbg.generated  Fri Jul 28 15:35:38 CST 2017
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_area_sport
	 * @mbg.generated  Fri Jul 28 15:35:38 CST 2017
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_area_sport
	 * @mbg.generated  Fri Jul 28 15:35:38 CST 2017
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_area_sport
	 * @mbg.generated  Fri Jul 28 15:35:38 CST 2017
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_area_sport
	 * @mbg.generated  Fri Jul 28 15:35:38 CST 2017
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_area_sport
	 * @mbg.generated  Fri Jul 28 15:35:38 CST 2017
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table wzsport_area_sport
	 * @mbg.generated  Fri Jul 28 15:35:38 CST 2017
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

		public Criteria andIsEnableIsNull() {
			addCriterion("is_enable is null");
			return (Criteria) this;
		}

		public Criteria andIsEnableIsNotNull() {
			addCriterion("is_enable is not null");
			return (Criteria) this;
		}

		public Criteria andIsEnableEqualTo(Boolean value) {
			addCriterion("is_enable =", value, "isEnable");
			return (Criteria) this;
		}

		public Criteria andIsEnableNotEqualTo(Boolean value) {
			addCriterion("is_enable <>", value, "isEnable");
			return (Criteria) this;
		}

		public Criteria andIsEnableGreaterThan(Boolean value) {
			addCriterion("is_enable >", value, "isEnable");
			return (Criteria) this;
		}

		public Criteria andIsEnableGreaterThanOrEqualTo(Boolean value) {
			addCriterion("is_enable >=", value, "isEnable");
			return (Criteria) this;
		}

		public Criteria andIsEnableLessThan(Boolean value) {
			addCriterion("is_enable <", value, "isEnable");
			return (Criteria) this;
		}

		public Criteria andIsEnableLessThanOrEqualTo(Boolean value) {
			addCriterion("is_enable <=", value, "isEnable");
			return (Criteria) this;
		}

		public Criteria andIsEnableIn(List<Boolean> values) {
			addCriterion("is_enable in", values, "isEnable");
			return (Criteria) this;
		}

		public Criteria andIsEnableNotIn(List<Boolean> values) {
			addCriterion("is_enable not in", values, "isEnable");
			return (Criteria) this;
		}

		public Criteria andIsEnableBetween(Boolean value1, Boolean value2) {
			addCriterion("is_enable between", value1, value2, "isEnable");
			return (Criteria) this;
		}

		public Criteria andIsEnableNotBetween(Boolean value1, Boolean value2) {
			addCriterion("is_enable not between", value1, value2, "isEnable");
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

		public Criteria andSampleNumIsNull() {
			addCriterion("sample_num is null");
			return (Criteria) this;
		}

		public Criteria andSampleNumIsNotNull() {
			addCriterion("sample_num is not null");
			return (Criteria) this;
		}

		public Criteria andSampleNumEqualTo(Byte value) {
			addCriterion("sample_num =", value, "sampleNum");
			return (Criteria) this;
		}

		public Criteria andSampleNumNotEqualTo(Byte value) {
			addCriterion("sample_num <>", value, "sampleNum");
			return (Criteria) this;
		}

		public Criteria andSampleNumGreaterThan(Byte value) {
			addCriterion("sample_num >", value, "sampleNum");
			return (Criteria) this;
		}

		public Criteria andSampleNumGreaterThanOrEqualTo(Byte value) {
			addCriterion("sample_num >=", value, "sampleNum");
			return (Criteria) this;
		}

		public Criteria andSampleNumLessThan(Byte value) {
			addCriterion("sample_num <", value, "sampleNum");
			return (Criteria) this;
		}

		public Criteria andSampleNumLessThanOrEqualTo(Byte value) {
			addCriterion("sample_num <=", value, "sampleNum");
			return (Criteria) this;
		}

		public Criteria andSampleNumIn(List<Byte> values) {
			addCriterion("sample_num in", values, "sampleNum");
			return (Criteria) this;
		}

		public Criteria andSampleNumNotIn(List<Byte> values) {
			addCriterion("sample_num not in", values, "sampleNum");
			return (Criteria) this;
		}

		public Criteria andSampleNumBetween(Byte value1, Byte value2) {
			addCriterion("sample_num between", value1, value2, "sampleNum");
			return (Criteria) this;
		}

		public Criteria andSampleNumNotBetween(Byte value1, Byte value2) {
			addCriterion("sample_num not between", value1, value2, "sampleNum");
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

		public Criteria andAcquisitionIntervalEqualTo(Byte value) {
			addCriterion("acquisition_interval =", value, "acquisitionInterval");
			return (Criteria) this;
		}

		public Criteria andAcquisitionIntervalNotEqualTo(Byte value) {
			addCriterion("acquisition_interval <>", value, "acquisitionInterval");
			return (Criteria) this;
		}

		public Criteria andAcquisitionIntervalGreaterThan(Byte value) {
			addCriterion("acquisition_interval >", value, "acquisitionInterval");
			return (Criteria) this;
		}

		public Criteria andAcquisitionIntervalGreaterThanOrEqualTo(Byte value) {
			addCriterion("acquisition_interval >=", value, "acquisitionInterval");
			return (Criteria) this;
		}

		public Criteria andAcquisitionIntervalLessThan(Byte value) {
			addCriterion("acquisition_interval <", value, "acquisitionInterval");
			return (Criteria) this;
		}

		public Criteria andAcquisitionIntervalLessThanOrEqualTo(Byte value) {
			addCriterion("acquisition_interval <=", value, "acquisitionInterval");
			return (Criteria) this;
		}

		public Criteria andAcquisitionIntervalIn(List<Byte> values) {
			addCriterion("acquisition_interval in", values, "acquisitionInterval");
			return (Criteria) this;
		}

		public Criteria andAcquisitionIntervalNotIn(List<Byte> values) {
			addCriterion("acquisition_interval not in", values, "acquisitionInterval");
			return (Criteria) this;
		}

		public Criteria andAcquisitionIntervalBetween(Byte value1, Byte value2) {
			addCriterion("acquisition_interval between", value1, value2, "acquisitionInterval");
			return (Criteria) this;
		}

		public Criteria andAcquisitionIntervalNotBetween(Byte value1, Byte value2) {
			addCriterion("acquisition_interval not between", value1, value2, "acquisitionInterval");
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
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table wzsport_area_sport
	 * @mbg.generated  Fri Jul 28 15:35:38 CST 2017
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
     * This class corresponds to the database table wzsport_area_sport
     *
     * @mbg.generated do_not_delete_during_merge Mon Jul 24 10:57:36 CST 2017
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}