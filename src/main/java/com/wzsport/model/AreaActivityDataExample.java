package com.wzsport.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AreaActivityDataExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table wzsport_area_activity_data
	 * @mbg.generated  Mon May 28 16:50:53 CST 2018
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table wzsport_area_activity_data
	 * @mbg.generated  Mon May 28 16:50:53 CST 2018
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table wzsport_area_activity_data
	 * @mbg.generated  Mon May 28 16:50:53 CST 2018
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_area_activity_data
	 * @mbg.generated  Mon May 28 16:50:53 CST 2018
	 */
	public AreaActivityDataExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_area_activity_data
	 * @mbg.generated  Mon May 28 16:50:53 CST 2018
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_area_activity_data
	 * @mbg.generated  Mon May 28 16:50:53 CST 2018
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_area_activity_data
	 * @mbg.generated  Mon May 28 16:50:53 CST 2018
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_area_activity_data
	 * @mbg.generated  Mon May 28 16:50:53 CST 2018
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_area_activity_data
	 * @mbg.generated  Mon May 28 16:50:53 CST 2018
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_area_activity_data
	 * @mbg.generated  Mon May 28 16:50:53 CST 2018
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_area_activity_data
	 * @mbg.generated  Mon May 28 16:50:53 CST 2018
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_area_activity_data
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
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_area_activity_data
	 * @mbg.generated  Mon May 28 16:50:53 CST 2018
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_area_activity_data
	 * @mbg.generated  Mon May 28 16:50:53 CST 2018
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table wzsport_area_activity_data
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

		public Criteria andActivityIdIsNull() {
			addCriterion("activity_id is null");
			return (Criteria) this;
		}

		public Criteria andActivityIdIsNotNull() {
			addCriterion("activity_id is not null");
			return (Criteria) this;
		}

		public Criteria andActivityIdEqualTo(Long value) {
			addCriterion("activity_id =", value, "activityId");
			return (Criteria) this;
		}

		public Criteria andActivityIdNotEqualTo(Long value) {
			addCriterion("activity_id <>", value, "activityId");
			return (Criteria) this;
		}

		public Criteria andActivityIdGreaterThan(Long value) {
			addCriterion("activity_id >", value, "activityId");
			return (Criteria) this;
		}

		public Criteria andActivityIdGreaterThanOrEqualTo(Long value) {
			addCriterion("activity_id >=", value, "activityId");
			return (Criteria) this;
		}

		public Criteria andActivityIdLessThan(Long value) {
			addCriterion("activity_id <", value, "activityId");
			return (Criteria) this;
		}

		public Criteria andActivityIdLessThanOrEqualTo(Long value) {
			addCriterion("activity_id <=", value, "activityId");
			return (Criteria) this;
		}

		public Criteria andActivityIdIn(List<Long> values) {
			addCriterion("activity_id in", values, "activityId");
			return (Criteria) this;
		}

		public Criteria andActivityIdNotIn(List<Long> values) {
			addCriterion("activity_id not in", values, "activityId");
			return (Criteria) this;
		}

		public Criteria andActivityIdBetween(Long value1, Long value2) {
			addCriterion("activity_id between", value1, value2, "activityId");
			return (Criteria) this;
		}

		public Criteria andActivityIdNotBetween(Long value1, Long value2) {
			addCriterion("activity_id not between", value1, value2, "activityId");
			return (Criteria) this;
		}

		public Criteria andAcquisitionTimeIsNull() {
			addCriterion("acquisition_time is null");
			return (Criteria) this;
		}

		public Criteria andAcquisitionTimeIsNotNull() {
			addCriterion("acquisition_time is not null");
			return (Criteria) this;
		}

		public Criteria andAcquisitionTimeEqualTo(Date value) {
			addCriterion("acquisition_time =", value, "acquisitionTime");
			return (Criteria) this;
		}

		public Criteria andAcquisitionTimeNotEqualTo(Date value) {
			addCriterion("acquisition_time <>", value, "acquisitionTime");
			return (Criteria) this;
		}

		public Criteria andAcquisitionTimeGreaterThan(Date value) {
			addCriterion("acquisition_time >", value, "acquisitionTime");
			return (Criteria) this;
		}

		public Criteria andAcquisitionTimeGreaterThanOrEqualTo(Date value) {
			addCriterion("acquisition_time >=", value, "acquisitionTime");
			return (Criteria) this;
		}

		public Criteria andAcquisitionTimeLessThan(Date value) {
			addCriterion("acquisition_time <", value, "acquisitionTime");
			return (Criteria) this;
		}

		public Criteria andAcquisitionTimeLessThanOrEqualTo(Date value) {
			addCriterion("acquisition_time <=", value, "acquisitionTime");
			return (Criteria) this;
		}

		public Criteria andAcquisitionTimeIn(List<Date> values) {
			addCriterion("acquisition_time in", values, "acquisitionTime");
			return (Criteria) this;
		}

		public Criteria andAcquisitionTimeNotIn(List<Date> values) {
			addCriterion("acquisition_time not in", values, "acquisitionTime");
			return (Criteria) this;
		}

		public Criteria andAcquisitionTimeBetween(Date value1, Date value2) {
			addCriterion("acquisition_time between", value1, value2, "acquisitionTime");
			return (Criteria) this;
		}

		public Criteria andAcquisitionTimeNotBetween(Date value1, Date value2) {
			addCriterion("acquisition_time not between", value1, value2, "acquisitionTime");
			return (Criteria) this;
		}

		public Criteria andIsNormalIsNull() {
			addCriterion("is_normal is null");
			return (Criteria) this;
		}

		public Criteria andIsNormalIsNotNull() {
			addCriterion("is_normal is not null");
			return (Criteria) this;
		}

		public Criteria andIsNormalEqualTo(Boolean value) {
			addCriterion("is_normal =", value, "isNormal");
			return (Criteria) this;
		}

		public Criteria andIsNormalNotEqualTo(Boolean value) {
			addCriterion("is_normal <>", value, "isNormal");
			return (Criteria) this;
		}

		public Criteria andIsNormalGreaterThan(Boolean value) {
			addCriterion("is_normal >", value, "isNormal");
			return (Criteria) this;
		}

		public Criteria andIsNormalGreaterThanOrEqualTo(Boolean value) {
			addCriterion("is_normal >=", value, "isNormal");
			return (Criteria) this;
		}

		public Criteria andIsNormalLessThan(Boolean value) {
			addCriterion("is_normal <", value, "isNormal");
			return (Criteria) this;
		}

		public Criteria andIsNormalLessThanOrEqualTo(Boolean value) {
			addCriterion("is_normal <=", value, "isNormal");
			return (Criteria) this;
		}

		public Criteria andIsNormalIn(List<Boolean> values) {
			addCriterion("is_normal in", values, "isNormal");
			return (Criteria) this;
		}

		public Criteria andIsNormalNotIn(List<Boolean> values) {
			addCriterion("is_normal not in", values, "isNormal");
			return (Criteria) this;
		}

		public Criteria andIsNormalBetween(Boolean value1, Boolean value2) {
			addCriterion("is_normal between", value1, value2, "isNormal");
			return (Criteria) this;
		}

		public Criteria andIsNormalNotBetween(Boolean value1, Boolean value2) {
			addCriterion("is_normal not between", value1, value2, "isNormal");
			return (Criteria) this;
		}

		public Criteria andLongitudeIsNull() {
			addCriterion("longitude is null");
			return (Criteria) this;
		}

		public Criteria andLongitudeIsNotNull() {
			addCriterion("longitude is not null");
			return (Criteria) this;
		}

		public Criteria andLongitudeEqualTo(Double value) {
			addCriterion("longitude =", value, "longitude");
			return (Criteria) this;
		}

		public Criteria andLongitudeNotEqualTo(Double value) {
			addCriterion("longitude <>", value, "longitude");
			return (Criteria) this;
		}

		public Criteria andLongitudeGreaterThan(Double value) {
			addCriterion("longitude >", value, "longitude");
			return (Criteria) this;
		}

		public Criteria andLongitudeGreaterThanOrEqualTo(Double value) {
			addCriterion("longitude >=", value, "longitude");
			return (Criteria) this;
		}

		public Criteria andLongitudeLessThan(Double value) {
			addCriterion("longitude <", value, "longitude");
			return (Criteria) this;
		}

		public Criteria andLongitudeLessThanOrEqualTo(Double value) {
			addCriterion("longitude <=", value, "longitude");
			return (Criteria) this;
		}

		public Criteria andLongitudeIn(List<Double> values) {
			addCriterion("longitude in", values, "longitude");
			return (Criteria) this;
		}

		public Criteria andLongitudeNotIn(List<Double> values) {
			addCriterion("longitude not in", values, "longitude");
			return (Criteria) this;
		}

		public Criteria andLongitudeBetween(Double value1, Double value2) {
			addCriterion("longitude between", value1, value2, "longitude");
			return (Criteria) this;
		}

		public Criteria andLongitudeNotBetween(Double value1, Double value2) {
			addCriterion("longitude not between", value1, value2, "longitude");
			return (Criteria) this;
		}

		public Criteria andLatitudeIsNull() {
			addCriterion("latitude is null");
			return (Criteria) this;
		}

		public Criteria andLatitudeIsNotNull() {
			addCriterion("latitude is not null");
			return (Criteria) this;
		}

		public Criteria andLatitudeEqualTo(Double value) {
			addCriterion("latitude =", value, "latitude");
			return (Criteria) this;
		}

		public Criteria andLatitudeNotEqualTo(Double value) {
			addCriterion("latitude <>", value, "latitude");
			return (Criteria) this;
		}

		public Criteria andLatitudeGreaterThan(Double value) {
			addCriterion("latitude >", value, "latitude");
			return (Criteria) this;
		}

		public Criteria andLatitudeGreaterThanOrEqualTo(Double value) {
			addCriterion("latitude >=", value, "latitude");
			return (Criteria) this;
		}

		public Criteria andLatitudeLessThan(Double value) {
			addCriterion("latitude <", value, "latitude");
			return (Criteria) this;
		}

		public Criteria andLatitudeLessThanOrEqualTo(Double value) {
			addCriterion("latitude <=", value, "latitude");
			return (Criteria) this;
		}

		public Criteria andLatitudeIn(List<Double> values) {
			addCriterion("latitude in", values, "latitude");
			return (Criteria) this;
		}

		public Criteria andLatitudeNotIn(List<Double> values) {
			addCriterion("latitude not in", values, "latitude");
			return (Criteria) this;
		}

		public Criteria andLatitudeBetween(Double value1, Double value2) {
			addCriterion("latitude between", value1, value2, "latitude");
			return (Criteria) this;
		}

		public Criteria andLatitudeNotBetween(Double value1, Double value2) {
			addCriterion("latitude not between", value1, value2, "latitude");
			return (Criteria) this;
		}

		public Criteria andLocationTypeIsNull() {
			addCriterion("location_type is null");
			return (Criteria) this;
		}

		public Criteria andLocationTypeIsNotNull() {
			addCriterion("location_type is not null");
			return (Criteria) this;
		}

		public Criteria andLocationTypeEqualTo(Integer value) {
			addCriterion("location_type =", value, "locationType");
			return (Criteria) this;
		}

		public Criteria andLocationTypeNotEqualTo(Integer value) {
			addCriterion("location_type <>", value, "locationType");
			return (Criteria) this;
		}

		public Criteria andLocationTypeGreaterThan(Integer value) {
			addCriterion("location_type >", value, "locationType");
			return (Criteria) this;
		}

		public Criteria andLocationTypeGreaterThanOrEqualTo(Integer value) {
			addCriterion("location_type >=", value, "locationType");
			return (Criteria) this;
		}

		public Criteria andLocationTypeLessThan(Integer value) {
			addCriterion("location_type <", value, "locationType");
			return (Criteria) this;
		}

		public Criteria andLocationTypeLessThanOrEqualTo(Integer value) {
			addCriterion("location_type <=", value, "locationType");
			return (Criteria) this;
		}

		public Criteria andLocationTypeIn(List<Integer> values) {
			addCriterion("location_type in", values, "locationType");
			return (Criteria) this;
		}

		public Criteria andLocationTypeNotIn(List<Integer> values) {
			addCriterion("location_type not in", values, "locationType");
			return (Criteria) this;
		}

		public Criteria andLocationTypeBetween(Integer value1, Integer value2) {
			addCriterion("location_type between", value1, value2, "locationType");
			return (Criteria) this;
		}

		public Criteria andLocationTypeNotBetween(Integer value1, Integer value2) {
			addCriterion("location_type not between", value1, value2, "locationType");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table wzsport_area_activity_data
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
     * This class corresponds to the database table wzsport_area_activity_data
     *
     * @mbg.generated do_not_delete_during_merge Sun Nov 19 17:30:56 CST 2017
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}