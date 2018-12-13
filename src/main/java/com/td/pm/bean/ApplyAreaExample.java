package com.td.pm.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ApplyAreaExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ApplyAreaExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

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

        public Criteria andApplyIdIsNull() {
            addCriterion("apply_id is null");
            return (Criteria) this;
        }

        public Criteria andApplyIdIsNotNull() {
            addCriterion("apply_id is not null");
            return (Criteria) this;
        }

        public Criteria andApplyIdEqualTo(Integer value) {
            addCriterion("apply_id =", value, "applyId");
            return (Criteria) this;
        }

        public Criteria andApplyIdNotEqualTo(Integer value) {
            addCriterion("apply_id <>", value, "applyId");
            return (Criteria) this;
        }

        public Criteria andApplyIdGreaterThan(Integer value) {
            addCriterion("apply_id >", value, "applyId");
            return (Criteria) this;
        }

        public Criteria andApplyIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("apply_id >=", value, "applyId");
            return (Criteria) this;
        }

        public Criteria andApplyIdLessThan(Integer value) {
            addCriterion("apply_id <", value, "applyId");
            return (Criteria) this;
        }

        public Criteria andApplyIdLessThanOrEqualTo(Integer value) {
            addCriterion("apply_id <=", value, "applyId");
            return (Criteria) this;
        }

        public Criteria andApplyIdIn(List<Integer> values) {
            addCriterion("apply_id in", values, "applyId");
            return (Criteria) this;
        }

        public Criteria andApplyIdNotIn(List<Integer> values) {
            addCriterion("apply_id not in", values, "applyId");
            return (Criteria) this;
        }

        public Criteria andApplyIdBetween(Integer value1, Integer value2) {
            addCriterion("apply_id between", value1, value2, "applyId");
            return (Criteria) this;
        }

        public Criteria andApplyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("apply_id not between", value1, value2, "applyId");
            return (Criteria) this;
        }

        public Criteria andApplyAreaIdIsNull() {
            addCriterion("apply_area_id is null");
            return (Criteria) this;
        }

        public Criteria andApplyAreaIdIsNotNull() {
            addCriterion("apply_area_id is not null");
            return (Criteria) this;
        }

        public Criteria andApplyAreaIdEqualTo(String value) {
            addCriterion("apply_area_id =", value, "applyAreaId");
            return (Criteria) this;
        }

        public Criteria andApplyAreaIdNotEqualTo(String value) {
            addCriterion("apply_area_id <>", value, "applyAreaId");
            return (Criteria) this;
        }

        public Criteria andApplyAreaIdGreaterThan(String value) {
            addCriterion("apply_area_id >", value, "applyAreaId");
            return (Criteria) this;
        }

        public Criteria andApplyAreaIdGreaterThanOrEqualTo(String value) {
            addCriterion("apply_area_id >=", value, "applyAreaId");
            return (Criteria) this;
        }

        public Criteria andApplyAreaIdLessThan(String value) {
            addCriterion("apply_area_id <", value, "applyAreaId");
            return (Criteria) this;
        }

        public Criteria andApplyAreaIdLessThanOrEqualTo(String value) {
            addCriterion("apply_area_id <=", value, "applyAreaId");
            return (Criteria) this;
        }

        public Criteria andApplyAreaIdLike(String value) {
            addCriterion("apply_area_id like", value, "applyAreaId");
            return (Criteria) this;
        }

        public Criteria andApplyAreaIdNotLike(String value) {
            addCriterion("apply_area_id not like", value, "applyAreaId");
            return (Criteria) this;
        }

        public Criteria andApplyAreaIdIn(List<String> values) {
            addCriterion("apply_area_id in", values, "applyAreaId");
            return (Criteria) this;
        }

        public Criteria andApplyAreaIdNotIn(List<String> values) {
            addCriterion("apply_area_id not in", values, "applyAreaId");
            return (Criteria) this;
        }

        public Criteria andApplyAreaIdBetween(String value1, String value2) {
            addCriterion("apply_area_id between", value1, value2, "applyAreaId");
            return (Criteria) this;
        }

        public Criteria andApplyAreaIdNotBetween(String value1, String value2) {
            addCriterion("apply_area_id not between", value1, value2, "applyAreaId");
            return (Criteria) this;
        }

        public Criteria andApplyUserIdIsNull() {
            addCriterion("apply_user_id is null");
            return (Criteria) this;
        }

        public Criteria andApplyUserIdIsNotNull() {
            addCriterion("apply_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andApplyUserIdEqualTo(String value) {
            addCriterion("apply_user_id =", value, "applyUserId");
            return (Criteria) this;
        }

        public Criteria andApplyUserIdNotEqualTo(String value) {
            addCriterion("apply_user_id <>", value, "applyUserId");
            return (Criteria) this;
        }

        public Criteria andApplyUserIdGreaterThan(String value) {
            addCriterion("apply_user_id >", value, "applyUserId");
            return (Criteria) this;
        }

        public Criteria andApplyUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("apply_user_id >=", value, "applyUserId");
            return (Criteria) this;
        }

        public Criteria andApplyUserIdLessThan(String value) {
            addCriterion("apply_user_id <", value, "applyUserId");
            return (Criteria) this;
        }

        public Criteria andApplyUserIdLessThanOrEqualTo(String value) {
            addCriterion("apply_user_id <=", value, "applyUserId");
            return (Criteria) this;
        }

        public Criteria andApplyUserIdLike(String value) {
            addCriterion("apply_user_id like", value, "applyUserId");
            return (Criteria) this;
        }

        public Criteria andApplyUserIdNotLike(String value) {
            addCriterion("apply_user_id not like", value, "applyUserId");
            return (Criteria) this;
        }

        public Criteria andApplyUserIdIn(List<String> values) {
            addCriterion("apply_user_id in", values, "applyUserId");
            return (Criteria) this;
        }

        public Criteria andApplyUserIdNotIn(List<String> values) {
            addCriterion("apply_user_id not in", values, "applyUserId");
            return (Criteria) this;
        }

        public Criteria andApplyUserIdBetween(String value1, String value2) {
            addCriterion("apply_user_id between", value1, value2, "applyUserId");
            return (Criteria) this;
        }

        public Criteria andApplyUserIdNotBetween(String value1, String value2) {
            addCriterion("apply_user_id not between", value1, value2, "applyUserId");
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

        public Criteria andEndTimeIsNull() {
            addCriterion("end_time is null");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNotNull() {
            addCriterion("end_time is not null");
            return (Criteria) this;
        }

        public Criteria andEndTimeEqualTo(Date value) {
            addCriterion("end_time =", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotEqualTo(Date value) {
            addCriterion("end_time <>", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThan(Date value) {
            addCriterion("end_time >", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("end_time >=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThan(Date value) {
            addCriterion("end_time <", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("end_time <=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIn(List<Date> values) {
            addCriterion("end_time in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotIn(List<Date> values) {
            addCriterion("end_time not in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeBetween(Date value1, Date value2) {
            addCriterion("end_time between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("end_time not between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andApplyPayIsNull() {
            addCriterion("apply_pay is null");
            return (Criteria) this;
        }

        public Criteria andApplyPayIsNotNull() {
            addCriterion("apply_pay is not null");
            return (Criteria) this;
        }

        public Criteria andApplyPayEqualTo(Integer value) {
            addCriterion("apply_pay =", value, "applyPay");
            return (Criteria) this;
        }

        public Criteria andApplyPayNotEqualTo(Integer value) {
            addCriterion("apply_pay <>", value, "applyPay");
            return (Criteria) this;
        }

        public Criteria andApplyPayGreaterThan(Integer value) {
            addCriterion("apply_pay >", value, "applyPay");
            return (Criteria) this;
        }

        public Criteria andApplyPayGreaterThanOrEqualTo(Integer value) {
            addCriterion("apply_pay >=", value, "applyPay");
            return (Criteria) this;
        }

        public Criteria andApplyPayLessThan(Integer value) {
            addCriterion("apply_pay <", value, "applyPay");
            return (Criteria) this;
        }

        public Criteria andApplyPayLessThanOrEqualTo(Integer value) {
            addCriterion("apply_pay <=", value, "applyPay");
            return (Criteria) this;
        }

        public Criteria andApplyPayIn(List<Integer> values) {
            addCriterion("apply_pay in", values, "applyPay");
            return (Criteria) this;
        }

        public Criteria andApplyPayNotIn(List<Integer> values) {
            addCriterion("apply_pay not in", values, "applyPay");
            return (Criteria) this;
        }

        public Criteria andApplyPayBetween(Integer value1, Integer value2) {
            addCriterion("apply_pay between", value1, value2, "applyPay");
            return (Criteria) this;
        }

        public Criteria andApplyPayNotBetween(Integer value1, Integer value2) {
            addCriterion("apply_pay not between", value1, value2, "applyPay");
            return (Criteria) this;
        }

        public Criteria andApplyPaidIsNull() {
            addCriterion("apply_paid is null");
            return (Criteria) this;
        }

        public Criteria andApplyPaidIsNotNull() {
            addCriterion("apply_paid is not null");
            return (Criteria) this;
        }

        public Criteria andApplyPaidEqualTo(Integer value) {
            addCriterion("apply_paid =", value, "applyPaid");
            return (Criteria) this;
        }

        public Criteria andApplyPaidNotEqualTo(Integer value) {
            addCriterion("apply_paid <>", value, "applyPaid");
            return (Criteria) this;
        }

        public Criteria andApplyPaidGreaterThan(Integer value) {
            addCriterion("apply_paid >", value, "applyPaid");
            return (Criteria) this;
        }

        public Criteria andApplyPaidGreaterThanOrEqualTo(Integer value) {
            addCriterion("apply_paid >=", value, "applyPaid");
            return (Criteria) this;
        }

        public Criteria andApplyPaidLessThan(Integer value) {
            addCriterion("apply_paid <", value, "applyPaid");
            return (Criteria) this;
        }

        public Criteria andApplyPaidLessThanOrEqualTo(Integer value) {
            addCriterion("apply_paid <=", value, "applyPaid");
            return (Criteria) this;
        }

        public Criteria andApplyPaidIn(List<Integer> values) {
            addCriterion("apply_paid in", values, "applyPaid");
            return (Criteria) this;
        }

        public Criteria andApplyPaidNotIn(List<Integer> values) {
            addCriterion("apply_paid not in", values, "applyPaid");
            return (Criteria) this;
        }

        public Criteria andApplyPaidBetween(Integer value1, Integer value2) {
            addCriterion("apply_paid between", value1, value2, "applyPaid");
            return (Criteria) this;
        }

        public Criteria andApplyPaidNotBetween(Integer value1, Integer value2) {
            addCriterion("apply_paid not between", value1, value2, "applyPaid");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

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