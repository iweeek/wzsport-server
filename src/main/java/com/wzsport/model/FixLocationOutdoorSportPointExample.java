package com.wzsport.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;

public class FixLocationOutdoorSportPointExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table wzsport_fix_location_outdoor_sport_point
	 * @mbg.generated  Sun Aug 27 19:11:17 CST 2017
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table wzsport_fix_location_outdoor_sport_point
	 * @mbg.generated  Sun Aug 27 19:11:17 CST 2017
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table wzsport_fix_location_outdoor_sport_point
	 * @mbg.generated  Sun Aug 27 19:11:17 CST 2017
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_fix_location_outdoor_sport_point
	 * @mbg.generated  Sun Aug 27 19:11:17 CST 2017
	 */
	public FixLocationOutdoorSportPointExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_fix_location_outdoor_sport_point
	 * @mbg.generated  Sun Aug 27 19:11:17 CST 2017
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_fix_location_outdoor_sport_point
	 * @mbg.generated  Sun Aug 27 19:11:17 CST 2017
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_fix_location_outdoor_sport_point
	 * @mbg.generated  Sun Aug 27 19:11:17 CST 2017
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_fix_location_outdoor_sport_point
	 * @mbg.generated  Sun Aug 27 19:11:17 CST 2017
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_fix_location_outdoor_sport_point
	 * @mbg.generated  Sun Aug 27 19:11:17 CST 2017
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_fix_location_outdoor_sport_point
	 * @mbg.generated  Sun Aug 27 19:11:17 CST 2017
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_fix_location_outdoor_sport_point
	 * @mbg.generated  Sun Aug 27 19:11:17 CST 2017
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_fix_location_outdoor_sport_point
	 * @mbg.generated  Sun Aug 27 19:11:17 CST 2017
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_fix_location_outdoor_sport_point
	 * @mbg.generated  Sun Aug 27 19:11:17 CST 2017
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_fix_location_outdoor_sport_point
	 * @mbg.generated  Sun Aug 27 19:11:17 CST 2017
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table wzsport_fix_location_outdoor_sport_point
	 * @mbg.generated  Sun Aug 27 19:11:17 CST 2017
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

		public Criteria andLatitudeIsNull() {
			addCriterion("latitude is null");
			return (Criteria) this;
		}

		public Criteria andLatitudeIsNotNull() {
			addCriterion("latitude is not null");
			return (Criteria) this;
		}

		public Criteria andLatitudeEqualTo(BigDecimal value) {
			addCriterion("latitude =", value, "latitude");
			return (Criteria) this;
		}

		public Criteria andLatitudeNotEqualTo(BigDecimal value) {
			addCriterion("latitude <>", value, "latitude");
			return (Criteria) this;
		}

		public Criteria andLatitudeGreaterThan(BigDecimal value) {
			addCriterion("latitude >", value, "latitude");
			return (Criteria) this;
		}

		public Criteria andLatitudeGreaterThanOrEqualTo(BigDecimal value) {
			addCriterion("latitude >=", value, "latitude");
			return (Criteria) this;
		}

		public Criteria andLatitudeLessThan(BigDecimal value) {
			addCriterion("latitude <", value, "latitude");
			return (Criteria) this;
		}

		public Criteria andLatitudeLessThanOrEqualTo(BigDecimal value) {
			addCriterion("latitude <=", value, "latitude");
			return (Criteria) this;
		}

		public Criteria andLatitudeIn(List<BigDecimal> values) {
			addCriterion("latitude in", values, "latitude");
			return (Criteria) this;
		}

		public Criteria andLatitudeNotIn(List<BigDecimal> values) {
			addCriterion("latitude not in", values, "latitude");
			return (Criteria) this;
		}

		public Criteria andLatitudeBetween(BigDecimal value1, BigDecimal value2) {
			addCriterion("latitude between", value1, value2, "latitude");
			return (Criteria) this;
		}

		public Criteria andLatitudeNotBetween(BigDecimal value1, BigDecimal value2) {
			addCriterion("latitude not between", value1, value2, "latitude");
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

		public Criteria andLongitudeEqualTo(BigDecimal value) {
			addCriterion("longitude =", value, "longitude");
			return (Criteria) this;
		}

		public Criteria andLongitudeNotEqualTo(BigDecimal value) {
			addCriterion("longitude <>", value, "longitude");
			return (Criteria) this;
		}

		public Criteria andLongitudeGreaterThan(BigDecimal value) {
			addCriterion("longitude >", value, "longitude");
			return (Criteria) this;
		}

		public Criteria andLongitudeGreaterThanOrEqualTo(BigDecimal value) {
			addCriterion("longitude >=", value, "longitude");
			return (Criteria) this;
		}

		public Criteria andLongitudeLessThan(BigDecimal value) {
			addCriterion("longitude <", value, "longitude");
			return (Criteria) this;
		}

		public Criteria andLongitudeLessThanOrEqualTo(BigDecimal value) {
			addCriterion("longitude <=", value, "longitude");
			return (Criteria) this;
		}

		public Criteria andLongitudeIn(List<BigDecimal> values) {
			addCriterion("longitude in", values, "longitude");
			return (Criteria) this;
		}

		public Criteria andLongitudeNotIn(List<BigDecimal> values) {
			addCriterion("longitude not in", values, "longitude");
			return (Criteria) this;
		}

		public Criteria andLongitudeBetween(BigDecimal value1, BigDecimal value2) {
			addCriterion("longitude between", value1, value2, "longitude");
			return (Criteria) this;
		}

		public Criteria andLongitudeNotBetween(BigDecimal value1, BigDecimal value2) {
			addCriterion("longitude not between", value1, value2, "longitude");
			return (Criteria) this;
		}

		public Criteria andRadiusIsNull() {
			addCriterion("radius is null");
			return (Criteria) this;
		}

		public Criteria andRadiusIsNotNull() {
			addCriterion("radius is not null");
			return (Criteria) this;
		}

		public Criteria andRadiusEqualTo(Byte value) {
			addCriterion("radius =", value, "radius");
			return (Criteria) this;
		}

		public Criteria andRadiusNotEqualTo(Byte value) {
			addCriterion("radius <>", value, "radius");
			return (Criteria) this;
		}

		public Criteria andRadiusGreaterThan(Byte value) {
			addCriterion("radius >", value, "radius");
			return (Criteria) this;
		}

		public Criteria andRadiusGreaterThanOrEqualTo(Byte value) {
			addCriterion("radius >=", value, "radius");
			return (Criteria) this;
		}

		public Criteria andRadiusLessThan(Byte value) {
			addCriterion("radius <", value, "radius");
			return (Criteria) this;
		}

		public Criteria andRadiusLessThanOrEqualTo(Byte value) {
			addCriterion("radius <=", value, "radius");
			return (Criteria) this;
		}

		public Criteria andRadiusIn(List<Byte> values) {
			addCriterion("radius in", values, "radius");
			return (Criteria) this;
		}

		public Criteria andRadiusNotIn(List<Byte> values) {
			addCriterion("radius not in", values, "radius");
			return (Criteria) this;
		}

		public Criteria andRadiusBetween(Byte value1, Byte value2) {
			addCriterion("radius between", value1, value2, "radius");
			return (Criteria) this;
		}

		public Criteria andRadiusNotBetween(Byte value1, Byte value2) {
			addCriterion("radius not between", value1, value2, "radius");
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

		public Criteria andAddrIsNull() {
			addCriterion("addr is null");
			return (Criteria) this;
		}

		public Criteria andAddrIsNotNull() {
			addCriterion("addr is not null");
			return (Criteria) this;
		}

		public Criteria andAddrEqualTo(String value) {
			addCriterion("addr =", value, "addr");
			return (Criteria) this;
		}

		public Criteria andAddrNotEqualTo(String value) {
			addCriterion("addr <>", value, "addr");
			return (Criteria) this;
		}

		public Criteria andAddrGreaterThan(String value) {
			addCriterion("addr >", value, "addr");
			return (Criteria) this;
		}

		public Criteria andAddrGreaterThanOrEqualTo(String value) {
			addCriterion("addr >=", value, "addr");
			return (Criteria) this;
		}

		public Criteria andAddrLessThan(String value) {
			addCriterion("addr <", value, "addr");
			return (Criteria) this;
		}

		public Criteria andAddrLessThanOrEqualTo(String value) {
			addCriterion("addr <=", value, "addr");
			return (Criteria) this;
		}

		public Criteria andAddrLike(String value) {
			addCriterion("addr like", value, "addr");
			return (Criteria) this;
		}

		public Criteria andAddrNotLike(String value) {
			addCriterion("addr not like", value, "addr");
			return (Criteria) this;
		}

		public Criteria andAddrIn(List<String> values) {
			addCriterion("addr in", values, "addr");
			return (Criteria) this;
		}

		public Criteria andAddrNotIn(List<String> values) {
			addCriterion("addr not in", values, "addr");
			return (Criteria) this;
		}

		public Criteria andAddrBetween(String value1, String value2) {
			addCriterion("addr between", value1, value2, "addr");
			return (Criteria) this;
		}

		public Criteria andAddrNotBetween(String value1, String value2) {
			addCriterion("addr not between", value1, value2, "addr");
			return (Criteria) this;
		}

		public Criteria andIsEnabledIsNull() {
			addCriterion("is_enabled is null");
			return (Criteria) this;
		}

		public Criteria andIsEnabledIsNotNull() {
			addCriterion("is_enabled is not null");
			return (Criteria) this;
		}

		public Criteria andIsEnabledEqualTo(Boolean value) {
			addCriterion("is_enabled =", value, "isEnabled");
			return (Criteria) this;
		}

		public Criteria andIsEnabledNotEqualTo(Boolean value) {
			addCriterion("is_enabled <>", value, "isEnabled");
			return (Criteria) this;
		}

		public Criteria andIsEnabledGreaterThan(Boolean value) {
			addCriterion("is_enabled >", value, "isEnabled");
			return (Criteria) this;
		}

		public Criteria andIsEnabledGreaterThanOrEqualTo(Boolean value) {
			addCriterion("is_enabled >=", value, "isEnabled");
			return (Criteria) this;
		}

		public Criteria andIsEnabledLessThan(Boolean value) {
			addCriterion("is_enabled <", value, "isEnabled");
			return (Criteria) this;
		}

		public Criteria andIsEnabledLessThanOrEqualTo(Boolean value) {
			addCriterion("is_enabled <=", value, "isEnabled");
			return (Criteria) this;
		}

		public Criteria andIsEnabledIn(List<Boolean> values) {
			addCriterion("is_enabled in", values, "isEnabled");
			return (Criteria) this;
		}

		public Criteria andIsEnabledNotIn(List<Boolean> values) {
			addCriterion("is_enabled not in", values, "isEnabled");
			return (Criteria) this;
		}

		public Criteria andIsEnabledBetween(Boolean value1, Boolean value2) {
			addCriterion("is_enabled between", value1, value2, "isEnabled");
			return (Criteria) this;
		}

		public Criteria andIsEnabledNotBetween(Boolean value1, Boolean value2) {
			addCriterion("is_enabled not between", value1, value2, "isEnabled");
			return (Criteria) this;
		}

		public Criteria andDescriptionIsNull() {
			addCriterion("description is null");
			return (Criteria) this;
		}

		public Criteria andDescriptionIsNotNull() {
			addCriterion("description is not null");
			return (Criteria) this;
		}

		public Criteria andDescriptionEqualTo(String value) {
			addCriterion("description =", value, "description");
			return (Criteria) this;
		}

		public Criteria andDescriptionNotEqualTo(String value) {
			addCriterion("description <>", value, "description");
			return (Criteria) this;
		}

		public Criteria andDescriptionGreaterThan(String value) {
			addCriterion("description >", value, "description");
			return (Criteria) this;
		}

		public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
			addCriterion("description >=", value, "description");
			return (Criteria) this;
		}

		public Criteria andDescriptionLessThan(String value) {
			addCriterion("description <", value, "description");
			return (Criteria) this;
		}

		public Criteria andDescriptionLessThanOrEqualTo(String value) {
			addCriterion("description <=", value, "description");
			return (Criteria) this;
		}

		public Criteria andDescriptionLike(String value) {
			addCriterion("description like", value, "description");
			return (Criteria) this;
		}

		public Criteria andDescriptionNotLike(String value) {
			addCriterion("description not like", value, "description");
			return (Criteria) this;
		}

		public Criteria andDescriptionIn(List<String> values) {
			addCriterion("description in", values, "description");
			return (Criteria) this;
		}

		public Criteria andDescriptionNotIn(List<String> values) {
			addCriterion("description not in", values, "description");
			return (Criteria) this;
		}

		public Criteria andDescriptionBetween(String value1, String value2) {
			addCriterion("description between", value1, value2, "description");
			return (Criteria) this;
		}

		public Criteria andDescriptionNotBetween(String value1, String value2) {
			addCriterion("description not between", value1, value2, "description");
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
	 * This class was generated by MyBatis Generator. This class corresponds to the database table wzsport_fix_location_outdoor_sport_point
	 * @mbg.generated  Sun Aug 27 19:11:17 CST 2017
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
     * This class corresponds to the database table wzsport_fix_location_outdoor_sport_point
     *
     * @mbg.generated do_not_delete_during_merge Fri Jul 21 15:05:33 CST 2017
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}