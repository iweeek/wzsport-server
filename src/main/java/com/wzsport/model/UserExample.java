package com.wzsport.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table wzsport_user
	 * @mbg.generated  Mon May 28 16:50:53 CST 2018
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table wzsport_user
	 * @mbg.generated  Mon May 28 16:50:53 CST 2018
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table wzsport_user
	 * @mbg.generated  Mon May 28 16:50:53 CST 2018
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_user
	 * @mbg.generated  Mon May 28 16:50:53 CST 2018
	 */
	public UserExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_user
	 * @mbg.generated  Mon May 28 16:50:53 CST 2018
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_user
	 * @mbg.generated  Mon May 28 16:50:53 CST 2018
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_user
	 * @mbg.generated  Mon May 28 16:50:53 CST 2018
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_user
	 * @mbg.generated  Mon May 28 16:50:53 CST 2018
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_user
	 * @mbg.generated  Mon May 28 16:50:53 CST 2018
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_user
	 * @mbg.generated  Mon May 28 16:50:53 CST 2018
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_user
	 * @mbg.generated  Mon May 28 16:50:53 CST 2018
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_user
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
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_user
	 * @mbg.generated  Mon May 28 16:50:53 CST 2018
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_user
	 * @mbg.generated  Mon May 28 16:50:53 CST 2018
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table wzsport_user
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

		public Criteria andUsernameIsNull() {
			addCriterion("username is null");
			return (Criteria) this;
		}

		public Criteria andUsernameIsNotNull() {
			addCriterion("username is not null");
			return (Criteria) this;
		}

		public Criteria andUsernameEqualTo(String value) {
			addCriterion("username =", value, "username");
			return (Criteria) this;
		}

		public Criteria andUsernameNotEqualTo(String value) {
			addCriterion("username <>", value, "username");
			return (Criteria) this;
		}

		public Criteria andUsernameGreaterThan(String value) {
			addCriterion("username >", value, "username");
			return (Criteria) this;
		}

		public Criteria andUsernameGreaterThanOrEqualTo(String value) {
			addCriterion("username >=", value, "username");
			return (Criteria) this;
		}

		public Criteria andUsernameLessThan(String value) {
			addCriterion("username <", value, "username");
			return (Criteria) this;
		}

		public Criteria andUsernameLessThanOrEqualTo(String value) {
			addCriterion("username <=", value, "username");
			return (Criteria) this;
		}

		public Criteria andUsernameLike(String value) {
			addCriterion("username like", value, "username");
			return (Criteria) this;
		}

		public Criteria andUsernameNotLike(String value) {
			addCriterion("username not like", value, "username");
			return (Criteria) this;
		}

		public Criteria andUsernameIn(List<String> values) {
			addCriterion("username in", values, "username");
			return (Criteria) this;
		}

		public Criteria andUsernameNotIn(List<String> values) {
			addCriterion("username not in", values, "username");
			return (Criteria) this;
		}

		public Criteria andUsernameBetween(String value1, String value2) {
			addCriterion("username between", value1, value2, "username");
			return (Criteria) this;
		}

		public Criteria andUsernameNotBetween(String value1, String value2) {
			addCriterion("username not between", value1, value2, "username");
			return (Criteria) this;
		}

		public Criteria andPasswordIsNull() {
			addCriterion("password is null");
			return (Criteria) this;
		}

		public Criteria andPasswordIsNotNull() {
			addCriterion("password is not null");
			return (Criteria) this;
		}

		public Criteria andPasswordEqualTo(String value) {
			addCriterion("password =", value, "password");
			return (Criteria) this;
		}

		public Criteria andPasswordNotEqualTo(String value) {
			addCriterion("password <>", value, "password");
			return (Criteria) this;
		}

		public Criteria andPasswordGreaterThan(String value) {
			addCriterion("password >", value, "password");
			return (Criteria) this;
		}

		public Criteria andPasswordGreaterThanOrEqualTo(String value) {
			addCriterion("password >=", value, "password");
			return (Criteria) this;
		}

		public Criteria andPasswordLessThan(String value) {
			addCriterion("password <", value, "password");
			return (Criteria) this;
		}

		public Criteria andPasswordLessThanOrEqualTo(String value) {
			addCriterion("password <=", value, "password");
			return (Criteria) this;
		}

		public Criteria andPasswordLike(String value) {
			addCriterion("password like", value, "password");
			return (Criteria) this;
		}

		public Criteria andPasswordNotLike(String value) {
			addCriterion("password not like", value, "password");
			return (Criteria) this;
		}

		public Criteria andPasswordIn(List<String> values) {
			addCriterion("password in", values, "password");
			return (Criteria) this;
		}

		public Criteria andPasswordNotIn(List<String> values) {
			addCriterion("password not in", values, "password");
			return (Criteria) this;
		}

		public Criteria andPasswordBetween(String value1, String value2) {
			addCriterion("password between", value1, value2, "password");
			return (Criteria) this;
		}

		public Criteria andPasswordNotBetween(String value1, String value2) {
			addCriterion("password not between", value1, value2, "password");
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

		public Criteria andUserTypeIsNull() {
			addCriterion("user_type is null");
			return (Criteria) this;
		}

		public Criteria andUserTypeIsNotNull() {
			addCriterion("user_type is not null");
			return (Criteria) this;
		}

		public Criteria andUserTypeEqualTo(Byte value) {
			addCriterion("user_type =", value, "userType");
			return (Criteria) this;
		}

		public Criteria andUserTypeNotEqualTo(Byte value) {
			addCriterion("user_type <>", value, "userType");
			return (Criteria) this;
		}

		public Criteria andUserTypeGreaterThan(Byte value) {
			addCriterion("user_type >", value, "userType");
			return (Criteria) this;
		}

		public Criteria andUserTypeGreaterThanOrEqualTo(Byte value) {
			addCriterion("user_type >=", value, "userType");
			return (Criteria) this;
		}

		public Criteria andUserTypeLessThan(Byte value) {
			addCriterion("user_type <", value, "userType");
			return (Criteria) this;
		}

		public Criteria andUserTypeLessThanOrEqualTo(Byte value) {
			addCriterion("user_type <=", value, "userType");
			return (Criteria) this;
		}

		public Criteria andUserTypeIn(List<Byte> values) {
			addCriterion("user_type in", values, "userType");
			return (Criteria) this;
		}

		public Criteria andUserTypeNotIn(List<Byte> values) {
			addCriterion("user_type not in", values, "userType");
			return (Criteria) this;
		}

		public Criteria andUserTypeBetween(Byte value1, Byte value2) {
			addCriterion("user_type between", value1, value2, "userType");
			return (Criteria) this;
		}

		public Criteria andUserTypeNotBetween(Byte value1, Byte value2) {
			addCriterion("user_type not between", value1, value2, "userType");
			return (Criteria) this;
		}

		public Criteria andLatestTokenIsNull() {
			addCriterion("latest_token is null");
			return (Criteria) this;
		}

		public Criteria andLatestTokenIsNotNull() {
			addCriterion("latest_token is not null");
			return (Criteria) this;
		}

		public Criteria andLatestTokenEqualTo(String value) {
			addCriterion("latest_token =", value, "latestToken");
			return (Criteria) this;
		}

		public Criteria andLatestTokenNotEqualTo(String value) {
			addCriterion("latest_token <>", value, "latestToken");
			return (Criteria) this;
		}

		public Criteria andLatestTokenGreaterThan(String value) {
			addCriterion("latest_token >", value, "latestToken");
			return (Criteria) this;
		}

		public Criteria andLatestTokenGreaterThanOrEqualTo(String value) {
			addCriterion("latest_token >=", value, "latestToken");
			return (Criteria) this;
		}

		public Criteria andLatestTokenLessThan(String value) {
			addCriterion("latest_token <", value, "latestToken");
			return (Criteria) this;
		}

		public Criteria andLatestTokenLessThanOrEqualTo(String value) {
			addCriterion("latest_token <=", value, "latestToken");
			return (Criteria) this;
		}

		public Criteria andLatestTokenLike(String value) {
			addCriterion("latest_token like", value, "latestToken");
			return (Criteria) this;
		}

		public Criteria andLatestTokenNotLike(String value) {
			addCriterion("latest_token not like", value, "latestToken");
			return (Criteria) this;
		}

		public Criteria andLatestTokenIn(List<String> values) {
			addCriterion("latest_token in", values, "latestToken");
			return (Criteria) this;
		}

		public Criteria andLatestTokenNotIn(List<String> values) {
			addCriterion("latest_token not in", values, "latestToken");
			return (Criteria) this;
		}

		public Criteria andLatestTokenBetween(String value1, String value2) {
			addCriterion("latest_token between", value1, value2, "latestToken");
			return (Criteria) this;
		}

		public Criteria andLatestTokenNotBetween(String value1, String value2) {
			addCriterion("latest_token not between", value1, value2, "latestToken");
			return (Criteria) this;
		}

		public Criteria andAvatarUrlIsNull() {
			addCriterion("avatar_url is null");
			return (Criteria) this;
		}

		public Criteria andAvatarUrlIsNotNull() {
			addCriterion("avatar_url is not null");
			return (Criteria) this;
		}

		public Criteria andAvatarUrlEqualTo(String value) {
			addCriterion("avatar_url =", value, "avatarUrl");
			return (Criteria) this;
		}

		public Criteria andAvatarUrlNotEqualTo(String value) {
			addCriterion("avatar_url <>", value, "avatarUrl");
			return (Criteria) this;
		}

		public Criteria andAvatarUrlGreaterThan(String value) {
			addCriterion("avatar_url >", value, "avatarUrl");
			return (Criteria) this;
		}

		public Criteria andAvatarUrlGreaterThanOrEqualTo(String value) {
			addCriterion("avatar_url >=", value, "avatarUrl");
			return (Criteria) this;
		}

		public Criteria andAvatarUrlLessThan(String value) {
			addCriterion("avatar_url <", value, "avatarUrl");
			return (Criteria) this;
		}

		public Criteria andAvatarUrlLessThanOrEqualTo(String value) {
			addCriterion("avatar_url <=", value, "avatarUrl");
			return (Criteria) this;
		}

		public Criteria andAvatarUrlLike(String value) {
			addCriterion("avatar_url like", value, "avatarUrl");
			return (Criteria) this;
		}

		public Criteria andAvatarUrlNotLike(String value) {
			addCriterion("avatar_url not like", value, "avatarUrl");
			return (Criteria) this;
		}

		public Criteria andAvatarUrlIn(List<String> values) {
			addCriterion("avatar_url in", values, "avatarUrl");
			return (Criteria) this;
		}

		public Criteria andAvatarUrlNotIn(List<String> values) {
			addCriterion("avatar_url not in", values, "avatarUrl");
			return (Criteria) this;
		}

		public Criteria andAvatarUrlBetween(String value1, String value2) {
			addCriterion("avatar_url between", value1, value2, "avatarUrl");
			return (Criteria) this;
		}

		public Criteria andAvatarUrlNotBetween(String value1, String value2) {
			addCriterion("avatar_url not between", value1, value2, "avatarUrl");
			return (Criteria) this;
		}

		public Criteria andOpenIdIsNull() {
			addCriterion("open_id is null");
			return (Criteria) this;
		}

		public Criteria andOpenIdIsNotNull() {
			addCriterion("open_id is not null");
			return (Criteria) this;
		}

		public Criteria andOpenIdEqualTo(String value) {
			addCriterion("open_id =", value, "openId");
			return (Criteria) this;
		}

		public Criteria andOpenIdNotEqualTo(String value) {
			addCriterion("open_id <>", value, "openId");
			return (Criteria) this;
		}

		public Criteria andOpenIdGreaterThan(String value) {
			addCriterion("open_id >", value, "openId");
			return (Criteria) this;
		}

		public Criteria andOpenIdGreaterThanOrEqualTo(String value) {
			addCriterion("open_id >=", value, "openId");
			return (Criteria) this;
		}

		public Criteria andOpenIdLessThan(String value) {
			addCriterion("open_id <", value, "openId");
			return (Criteria) this;
		}

		public Criteria andOpenIdLessThanOrEqualTo(String value) {
			addCriterion("open_id <=", value, "openId");
			return (Criteria) this;
		}

		public Criteria andOpenIdLike(String value) {
			addCriterion("open_id like", value, "openId");
			return (Criteria) this;
		}

		public Criteria andOpenIdNotLike(String value) {
			addCriterion("open_id not like", value, "openId");
			return (Criteria) this;
		}

		public Criteria andOpenIdIn(List<String> values) {
			addCriterion("open_id in", values, "openId");
			return (Criteria) this;
		}

		public Criteria andOpenIdNotIn(List<String> values) {
			addCriterion("open_id not in", values, "openId");
			return (Criteria) this;
		}

		public Criteria andOpenIdBetween(String value1, String value2) {
			addCriterion("open_id between", value1, value2, "openId");
			return (Criteria) this;
		}

		public Criteria andOpenIdNotBetween(String value1, String value2) {
			addCriterion("open_id not between", value1, value2, "openId");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table wzsport_user
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
     * This class corresponds to the database table wzsport_user
     *
     * @mbg.generated do_not_delete_during_merge Tue Jun 06 22:11:58 CST 2017
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}