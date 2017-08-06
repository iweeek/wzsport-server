package com.wzsport.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FitnessCheckDataExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table wzsport_fitness_check_data
	 * @mbg.generated  Fri Aug 04 16:05:05 CST 2017
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table wzsport_fitness_check_data
	 * @mbg.generated  Fri Aug 04 16:05:05 CST 2017
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table wzsport_fitness_check_data
	 * @mbg.generated  Fri Aug 04 16:05:05 CST 2017
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_fitness_check_data
	 * @mbg.generated  Fri Aug 04 16:05:05 CST 2017
	 */
	public FitnessCheckDataExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_fitness_check_data
	 * @mbg.generated  Fri Aug 04 16:05:05 CST 2017
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_fitness_check_data
	 * @mbg.generated  Fri Aug 04 16:05:05 CST 2017
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_fitness_check_data
	 * @mbg.generated  Fri Aug 04 16:05:05 CST 2017
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_fitness_check_data
	 * @mbg.generated  Fri Aug 04 16:05:05 CST 2017
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_fitness_check_data
	 * @mbg.generated  Fri Aug 04 16:05:05 CST 2017
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_fitness_check_data
	 * @mbg.generated  Fri Aug 04 16:05:05 CST 2017
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_fitness_check_data
	 * @mbg.generated  Fri Aug 04 16:05:05 CST 2017
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_fitness_check_data
	 * @mbg.generated  Fri Aug 04 16:05:05 CST 2017
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_fitness_check_data
	 * @mbg.generated  Fri Aug 04 16:05:05 CST 2017
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_fitness_check_data
	 * @mbg.generated  Fri Aug 04 16:05:05 CST 2017
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table wzsport_fitness_check_data
	 * @mbg.generated  Fri Aug 04 16:05:05 CST 2017
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

		public Criteria andHeightIsNull() {
			addCriterion("height is null");
			return (Criteria) this;
		}

		public Criteria andHeightIsNotNull() {
			addCriterion("height is not null");
			return (Criteria) this;
		}

		public Criteria andHeightEqualTo(Integer value) {
			addCriterion("height =", value, "height");
			return (Criteria) this;
		}

		public Criteria andHeightNotEqualTo(Integer value) {
			addCriterion("height <>", value, "height");
			return (Criteria) this;
		}

		public Criteria andHeightGreaterThan(Integer value) {
			addCriterion("height >", value, "height");
			return (Criteria) this;
		}

		public Criteria andHeightGreaterThanOrEqualTo(Integer value) {
			addCriterion("height >=", value, "height");
			return (Criteria) this;
		}

		public Criteria andHeightLessThan(Integer value) {
			addCriterion("height <", value, "height");
			return (Criteria) this;
		}

		public Criteria andHeightLessThanOrEqualTo(Integer value) {
			addCriterion("height <=", value, "height");
			return (Criteria) this;
		}

		public Criteria andHeightIn(List<Integer> values) {
			addCriterion("height in", values, "height");
			return (Criteria) this;
		}

		public Criteria andHeightNotIn(List<Integer> values) {
			addCriterion("height not in", values, "height");
			return (Criteria) this;
		}

		public Criteria andHeightBetween(Integer value1, Integer value2) {
			addCriterion("height between", value1, value2, "height");
			return (Criteria) this;
		}

		public Criteria andHeightNotBetween(Integer value1, Integer value2) {
			addCriterion("height not between", value1, value2, "height");
			return (Criteria) this;
		}

		public Criteria andWeightIsNull() {
			addCriterion("weight is null");
			return (Criteria) this;
		}

		public Criteria andWeightIsNotNull() {
			addCriterion("weight is not null");
			return (Criteria) this;
		}

		public Criteria andWeightEqualTo(Integer value) {
			addCriterion("weight =", value, "weight");
			return (Criteria) this;
		}

		public Criteria andWeightNotEqualTo(Integer value) {
			addCriterion("weight <>", value, "weight");
			return (Criteria) this;
		}

		public Criteria andWeightGreaterThan(Integer value) {
			addCriterion("weight >", value, "weight");
			return (Criteria) this;
		}

		public Criteria andWeightGreaterThanOrEqualTo(Integer value) {
			addCriterion("weight >=", value, "weight");
			return (Criteria) this;
		}

		public Criteria andWeightLessThan(Integer value) {
			addCriterion("weight <", value, "weight");
			return (Criteria) this;
		}

		public Criteria andWeightLessThanOrEqualTo(Integer value) {
			addCriterion("weight <=", value, "weight");
			return (Criteria) this;
		}

		public Criteria andWeightIn(List<Integer> values) {
			addCriterion("weight in", values, "weight");
			return (Criteria) this;
		}

		public Criteria andWeightNotIn(List<Integer> values) {
			addCriterion("weight not in", values, "weight");
			return (Criteria) this;
		}

		public Criteria andWeightBetween(Integer value1, Integer value2) {
			addCriterion("weight between", value1, value2, "weight");
			return (Criteria) this;
		}

		public Criteria andWeightNotBetween(Integer value1, Integer value2) {
			addCriterion("weight not between", value1, value2, "weight");
			return (Criteria) this;
		}

		public Criteria andLungCapacityIsNull() {
			addCriterion("lung_capacity is null");
			return (Criteria) this;
		}

		public Criteria andLungCapacityIsNotNull() {
			addCriterion("lung_capacity is not null");
			return (Criteria) this;
		}

		public Criteria andLungCapacityEqualTo(Integer value) {
			addCriterion("lung_capacity =", value, "lungCapacity");
			return (Criteria) this;
		}

		public Criteria andLungCapacityNotEqualTo(Integer value) {
			addCriterion("lung_capacity <>", value, "lungCapacity");
			return (Criteria) this;
		}

		public Criteria andLungCapacityGreaterThan(Integer value) {
			addCriterion("lung_capacity >", value, "lungCapacity");
			return (Criteria) this;
		}

		public Criteria andLungCapacityGreaterThanOrEqualTo(Integer value) {
			addCriterion("lung_capacity >=", value, "lungCapacity");
			return (Criteria) this;
		}

		public Criteria andLungCapacityLessThan(Integer value) {
			addCriterion("lung_capacity <", value, "lungCapacity");
			return (Criteria) this;
		}

		public Criteria andLungCapacityLessThanOrEqualTo(Integer value) {
			addCriterion("lung_capacity <=", value, "lungCapacity");
			return (Criteria) this;
		}

		public Criteria andLungCapacityIn(List<Integer> values) {
			addCriterion("lung_capacity in", values, "lungCapacity");
			return (Criteria) this;
		}

		public Criteria andLungCapacityNotIn(List<Integer> values) {
			addCriterion("lung_capacity not in", values, "lungCapacity");
			return (Criteria) this;
		}

		public Criteria andLungCapacityBetween(Integer value1, Integer value2) {
			addCriterion("lung_capacity between", value1, value2, "lungCapacity");
			return (Criteria) this;
		}

		public Criteria andLungCapacityNotBetween(Integer value1, Integer value2) {
			addCriterion("lung_capacity not between", value1, value2, "lungCapacity");
			return (Criteria) this;
		}

		public Criteria andBmiIsNull() {
			addCriterion("BMI is null");
			return (Criteria) this;
		}

		public Criteria andBmiIsNotNull() {
			addCriterion("BMI is not null");
			return (Criteria) this;
		}

		public Criteria andBmiEqualTo(Double value) {
			addCriterion("BMI =", value, "bmi");
			return (Criteria) this;
		}

		public Criteria andBmiNotEqualTo(Double value) {
			addCriterion("BMI <>", value, "bmi");
			return (Criteria) this;
		}

		public Criteria andBmiGreaterThan(Double value) {
			addCriterion("BMI >", value, "bmi");
			return (Criteria) this;
		}

		public Criteria andBmiGreaterThanOrEqualTo(Double value) {
			addCriterion("BMI >=", value, "bmi");
			return (Criteria) this;
		}

		public Criteria andBmiLessThan(Double value) {
			addCriterion("BMI <", value, "bmi");
			return (Criteria) this;
		}

		public Criteria andBmiLessThanOrEqualTo(Double value) {
			addCriterion("BMI <=", value, "bmi");
			return (Criteria) this;
		}

		public Criteria andBmiIn(List<Double> values) {
			addCriterion("BMI in", values, "bmi");
			return (Criteria) this;
		}

		public Criteria andBmiNotIn(List<Double> values) {
			addCriterion("BMI not in", values, "bmi");
			return (Criteria) this;
		}

		public Criteria andBmiBetween(Double value1, Double value2) {
			addCriterion("BMI between", value1, value2, "bmi");
			return (Criteria) this;
		}

		public Criteria andBmiNotBetween(Double value1, Double value2) {
			addCriterion("BMI not between", value1, value2, "bmi");
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
	 * This class was generated by MyBatis Generator. This class corresponds to the database table wzsport_fitness_check_data
	 * @mbg.generated  Fri Aug 04 16:05:05 CST 2017
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
     * This class corresponds to the database table wzsport_fitness_check_data
     *
     * @mbg.generated do_not_delete_during_merge Tue Jun 06 17:44:00 CST 2017
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}