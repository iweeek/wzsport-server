package com.wzsport.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class StudentExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table wzsport_student
	 * @mbg.generated  Fri Jul 28 15:35:37 CST 2017
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table wzsport_student
	 * @mbg.generated  Fri Jul 28 15:35:37 CST 2017
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table wzsport_student
	 * @mbg.generated  Fri Jul 28 15:35:37 CST 2017
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_student
	 * @mbg.generated  Fri Jul 28 15:35:37 CST 2017
	 */
	public StudentExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_student
	 * @mbg.generated  Fri Jul 28 15:35:37 CST 2017
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_student
	 * @mbg.generated  Fri Jul 28 15:35:37 CST 2017
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_student
	 * @mbg.generated  Fri Jul 28 15:35:37 CST 2017
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_student
	 * @mbg.generated  Fri Jul 28 15:35:37 CST 2017
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_student
	 * @mbg.generated  Fri Jul 28 15:35:37 CST 2017
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_student
	 * @mbg.generated  Fri Jul 28 15:35:37 CST 2017
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_student
	 * @mbg.generated  Fri Jul 28 15:35:37 CST 2017
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_student
	 * @mbg.generated  Fri Jul 28 15:35:37 CST 2017
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_student
	 * @mbg.generated  Fri Jul 28 15:35:37 CST 2017
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_student
	 * @mbg.generated  Fri Jul 28 15:35:37 CST 2017
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table wzsport_student
	 * @mbg.generated  Fri Jul 28 15:35:37 CST 2017
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

		public Criteria andUserIdIsNull() {
			addCriterion("user_id is null");
			return (Criteria) this;
		}

		public Criteria andUserIdIsNotNull() {
			addCriterion("user_id is not null");
			return (Criteria) this;
		}

		public Criteria andUserIdEqualTo(Long value) {
			addCriterion("user_id =", value, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdNotEqualTo(Long value) {
			addCriterion("user_id <>", value, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdGreaterThan(Long value) {
			addCriterion("user_id >", value, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdGreaterThanOrEqualTo(Long value) {
			addCriterion("user_id >=", value, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdLessThan(Long value) {
			addCriterion("user_id <", value, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdLessThanOrEqualTo(Long value) {
			addCriterion("user_id <=", value, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdIn(List<Long> values) {
			addCriterion("user_id in", values, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdNotIn(List<Long> values) {
			addCriterion("user_id not in", values, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdBetween(Long value1, Long value2) {
			addCriterion("user_id between", value1, value2, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdNotBetween(Long value1, Long value2) {
			addCriterion("user_id not between", value1, value2, "userId");
			return (Criteria) this;
		}

		public Criteria andClassIdIsNull() {
			addCriterion("class_id is null");
			return (Criteria) this;
		}

		public Criteria andClassIdIsNotNull() {
			addCriterion("class_id is not null");
			return (Criteria) this;
		}

		public Criteria andClassIdEqualTo(Long value) {
			addCriterion("class_id =", value, "classId");
			return (Criteria) this;
		}

		public Criteria andClassIdNotEqualTo(Long value) {
			addCriterion("class_id <>", value, "classId");
			return (Criteria) this;
		}

		public Criteria andClassIdGreaterThan(Long value) {
			addCriterion("class_id >", value, "classId");
			return (Criteria) this;
		}

		public Criteria andClassIdGreaterThanOrEqualTo(Long value) {
			addCriterion("class_id >=", value, "classId");
			return (Criteria) this;
		}

		public Criteria andClassIdLessThan(Long value) {
			addCriterion("class_id <", value, "classId");
			return (Criteria) this;
		}

		public Criteria andClassIdLessThanOrEqualTo(Long value) {
			addCriterion("class_id <=", value, "classId");
			return (Criteria) this;
		}

		public Criteria andClassIdIn(List<Long> values) {
			addCriterion("class_id in", values, "classId");
			return (Criteria) this;
		}

		public Criteria andClassIdNotIn(List<Long> values) {
			addCriterion("class_id not in", values, "classId");
			return (Criteria) this;
		}

		public Criteria andClassIdBetween(Long value1, Long value2) {
			addCriterion("class_id between", value1, value2, "classId");
			return (Criteria) this;
		}

		public Criteria andClassIdNotBetween(Long value1, Long value2) {
			addCriterion("class_id not between", value1, value2, "classId");
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

		public Criteria andStudentNoIsNull() {
			addCriterion("student_no is null");
			return (Criteria) this;
		}

		public Criteria andStudentNoIsNotNull() {
			addCriterion("student_no is not null");
			return (Criteria) this;
		}

		public Criteria andStudentNoEqualTo(String value) {
			addCriterion("student_no =", value, "studentNo");
			return (Criteria) this;
		}

		public Criteria andStudentNoNotEqualTo(String value) {
			addCriterion("student_no <>", value, "studentNo");
			return (Criteria) this;
		}

		public Criteria andStudentNoGreaterThan(String value) {
			addCriterion("student_no >", value, "studentNo");
			return (Criteria) this;
		}

		public Criteria andStudentNoGreaterThanOrEqualTo(String value) {
			addCriterion("student_no >=", value, "studentNo");
			return (Criteria) this;
		}

		public Criteria andStudentNoLessThan(String value) {
			addCriterion("student_no <", value, "studentNo");
			return (Criteria) this;
		}

		public Criteria andStudentNoLessThanOrEqualTo(String value) {
			addCriterion("student_no <=", value, "studentNo");
			return (Criteria) this;
		}

		public Criteria andStudentNoLike(String value) {
			addCriterion("student_no like", value, "studentNo");
			return (Criteria) this;
		}

		public Criteria andStudentNoNotLike(String value) {
			addCriterion("student_no not like", value, "studentNo");
			return (Criteria) this;
		}

		public Criteria andStudentNoIn(List<String> values) {
			addCriterion("student_no in", values, "studentNo");
			return (Criteria) this;
		}

		public Criteria andStudentNoNotIn(List<String> values) {
			addCriterion("student_no not in", values, "studentNo");
			return (Criteria) this;
		}

		public Criteria andStudentNoBetween(String value1, String value2) {
			addCriterion("student_no between", value1, value2, "studentNo");
			return (Criteria) this;
		}

		public Criteria andStudentNoNotBetween(String value1, String value2) {
			addCriterion("student_no not between", value1, value2, "studentNo");
			return (Criteria) this;
		}

		public Criteria andManIsNull() {
			addCriterion("is_man is null");
			return (Criteria) this;
		}

		public Criteria andManIsNotNull() {
			addCriterion("is_man is not null");
			return (Criteria) this;
		}

		public Criteria andManEqualTo(Boolean value) {
			addCriterion("is_man =", value, "man");
			return (Criteria) this;
		}

		public Criteria andManNotEqualTo(Boolean value) {
			addCriterion("is_man <>", value, "man");
			return (Criteria) this;
		}

		public Criteria andManGreaterThan(Boolean value) {
			addCriterion("is_man >", value, "man");
			return (Criteria) this;
		}

		public Criteria andManGreaterThanOrEqualTo(Boolean value) {
			addCriterion("is_man >=", value, "man");
			return (Criteria) this;
		}

		public Criteria andManLessThan(Boolean value) {
			addCriterion("is_man <", value, "man");
			return (Criteria) this;
		}

		public Criteria andManLessThanOrEqualTo(Boolean value) {
			addCriterion("is_man <=", value, "man");
			return (Criteria) this;
		}

		public Criteria andManIn(List<Boolean> values) {
			addCriterion("is_man in", values, "man");
			return (Criteria) this;
		}

		public Criteria andManNotIn(List<Boolean> values) {
			addCriterion("is_man not in", values, "man");
			return (Criteria) this;
		}

		public Criteria andManBetween(Boolean value1, Boolean value2) {
			addCriterion("is_man between", value1, value2, "man");
			return (Criteria) this;
		}

		public Criteria andManNotBetween(Boolean value1, Boolean value2) {
			addCriterion("is_man not between", value1, value2, "man");
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
	 * This class was generated by MyBatis Generator. This class corresponds to the database table wzsport_student
	 * @mbg.generated  Fri Jul 28 15:35:37 CST 2017
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
     * This class corresponds to the database table wzsport_student
     *
     * @mbg.generated do_not_delete_during_merge Tue Jun 06 15:38:49 CST 2017
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}