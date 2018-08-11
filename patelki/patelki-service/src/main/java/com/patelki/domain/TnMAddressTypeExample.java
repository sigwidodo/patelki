package com.patelki.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TnMAddressTypeExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tn_m_address_type
     *
     * @mbg.generated Sat Aug 11 20:55:03 WIB 2018
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tn_m_address_type
     *
     * @mbg.generated Sat Aug 11 20:55:03 WIB 2018
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tn_m_address_type
     *
     * @mbg.generated Sat Aug 11 20:55:03 WIB 2018
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tn_m_address_type
     *
     * @mbg.generated Sat Aug 11 20:55:03 WIB 2018
     */
    public TnMAddressTypeExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tn_m_address_type
     *
     * @mbg.generated Sat Aug 11 20:55:03 WIB 2018
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tn_m_address_type
     *
     * @mbg.generated Sat Aug 11 20:55:03 WIB 2018
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tn_m_address_type
     *
     * @mbg.generated Sat Aug 11 20:55:03 WIB 2018
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tn_m_address_type
     *
     * @mbg.generated Sat Aug 11 20:55:03 WIB 2018
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tn_m_address_type
     *
     * @mbg.generated Sat Aug 11 20:55:03 WIB 2018
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tn_m_address_type
     *
     * @mbg.generated Sat Aug 11 20:55:03 WIB 2018
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tn_m_address_type
     *
     * @mbg.generated Sat Aug 11 20:55:03 WIB 2018
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tn_m_address_type
     *
     * @mbg.generated Sat Aug 11 20:55:03 WIB 2018
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tn_m_address_type
     *
     * @mbg.generated Sat Aug 11 20:55:03 WIB 2018
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tn_m_address_type
     *
     * @mbg.generated Sat Aug 11 20:55:03 WIB 2018
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table tn_m_address_type
     *
     * @mbg.generated Sat Aug 11 20:55:03 WIB 2018
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

        public Criteria andAddressTypeIdIsNull() {
            addCriterion("address_type_id is null");
            return (Criteria) this;
        }

        public Criteria andAddressTypeIdIsNotNull() {
            addCriterion("address_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andAddressTypeIdEqualTo(Integer value) {
            addCriterion("address_type_id =", value, "addressTypeId");
            return (Criteria) this;
        }

        public Criteria andAddressTypeIdNotEqualTo(Integer value) {
            addCriterion("address_type_id <>", value, "addressTypeId");
            return (Criteria) this;
        }

        public Criteria andAddressTypeIdGreaterThan(Integer value) {
            addCriterion("address_type_id >", value, "addressTypeId");
            return (Criteria) this;
        }

        public Criteria andAddressTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("address_type_id >=", value, "addressTypeId");
            return (Criteria) this;
        }

        public Criteria andAddressTypeIdLessThan(Integer value) {
            addCriterion("address_type_id <", value, "addressTypeId");
            return (Criteria) this;
        }

        public Criteria andAddressTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("address_type_id <=", value, "addressTypeId");
            return (Criteria) this;
        }

        public Criteria andAddressTypeIdIn(List<Integer> values) {
            addCriterion("address_type_id in", values, "addressTypeId");
            return (Criteria) this;
        }

        public Criteria andAddressTypeIdNotIn(List<Integer> values) {
            addCriterion("address_type_id not in", values, "addressTypeId");
            return (Criteria) this;
        }

        public Criteria andAddressTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("address_type_id between", value1, value2, "addressTypeId");
            return (Criteria) this;
        }

        public Criteria andAddressTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("address_type_id not between", value1, value2, "addressTypeId");
            return (Criteria) this;
        }

        public Criteria andAddressTypeIsNull() {
            addCriterion("address_type is null");
            return (Criteria) this;
        }

        public Criteria andAddressTypeIsNotNull() {
            addCriterion("address_type is not null");
            return (Criteria) this;
        }

        public Criteria andAddressTypeEqualTo(String value) {
            addCriterion("address_type =", value, "addressType");
            return (Criteria) this;
        }

        public Criteria andAddressTypeNotEqualTo(String value) {
            addCriterion("address_type <>", value, "addressType");
            return (Criteria) this;
        }

        public Criteria andAddressTypeGreaterThan(String value) {
            addCriterion("address_type >", value, "addressType");
            return (Criteria) this;
        }

        public Criteria andAddressTypeGreaterThanOrEqualTo(String value) {
            addCriterion("address_type >=", value, "addressType");
            return (Criteria) this;
        }

        public Criteria andAddressTypeLessThan(String value) {
            addCriterion("address_type <", value, "addressType");
            return (Criteria) this;
        }

        public Criteria andAddressTypeLessThanOrEqualTo(String value) {
            addCriterion("address_type <=", value, "addressType");
            return (Criteria) this;
        }

        public Criteria andAddressTypeLike(String value) {
            addCriterion("address_type like", value, "addressType");
            return (Criteria) this;
        }

        public Criteria andAddressTypeNotLike(String value) {
            addCriterion("address_type not like", value, "addressType");
            return (Criteria) this;
        }

        public Criteria andAddressTypeIn(List<String> values) {
            addCriterion("address_type in", values, "addressType");
            return (Criteria) this;
        }

        public Criteria andAddressTypeNotIn(List<String> values) {
            addCriterion("address_type not in", values, "addressType");
            return (Criteria) this;
        }

        public Criteria andAddressTypeBetween(String value1, String value2) {
            addCriterion("address_type between", value1, value2, "addressType");
            return (Criteria) this;
        }

        public Criteria andAddressTypeNotBetween(String value1, String value2) {
            addCriterion("address_type not between", value1, value2, "addressType");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andCreatedByIsNull() {
            addCriterion("created_by is null");
            return (Criteria) this;
        }

        public Criteria andCreatedByIsNotNull() {
            addCriterion("created_by is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedByEqualTo(Integer value) {
            addCriterion("created_by =", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotEqualTo(Integer value) {
            addCriterion("created_by <>", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByGreaterThan(Integer value) {
            addCriterion("created_by >", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByGreaterThanOrEqualTo(Integer value) {
            addCriterion("created_by >=", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByLessThan(Integer value) {
            addCriterion("created_by <", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByLessThanOrEqualTo(Integer value) {
            addCriterion("created_by <=", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByIn(List<Integer> values) {
            addCriterion("created_by in", values, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotIn(List<Integer> values) {
            addCriterion("created_by not in", values, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByBetween(Integer value1, Integer value2) {
            addCriterion("created_by between", value1, value2, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotBetween(Integer value1, Integer value2) {
            addCriterion("created_by not between", value1, value2, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedDateIsNull() {
            addCriterion("created_date is null");
            return (Criteria) this;
        }

        public Criteria andCreatedDateIsNotNull() {
            addCriterion("created_date is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedDateEqualTo(Date value) {
            addCriterion("created_date =", value, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateNotEqualTo(Date value) {
            addCriterion("created_date <>", value, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateGreaterThan(Date value) {
            addCriterion("created_date >", value, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateGreaterThanOrEqualTo(Date value) {
            addCriterion("created_date >=", value, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateLessThan(Date value) {
            addCriterion("created_date <", value, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateLessThanOrEqualTo(Date value) {
            addCriterion("created_date <=", value, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateIn(List<Date> values) {
            addCriterion("created_date in", values, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateNotIn(List<Date> values) {
            addCriterion("created_date not in", values, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateBetween(Date value1, Date value2) {
            addCriterion("created_date between", value1, value2, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateNotBetween(Date value1, Date value2) {
            addCriterion("created_date not between", value1, value2, "createdDate");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table tn_m_address_type
     *
     * @mbg.generated do_not_delete_during_merge Sat Aug 11 20:55:03 WIB 2018
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table tn_m_address_type
     *
     * @mbg.generated Sat Aug 11 20:55:03 WIB 2018
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
}