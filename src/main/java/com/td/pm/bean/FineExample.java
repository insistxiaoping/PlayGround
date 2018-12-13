package com.td.pm.bean;

import java.util.ArrayList;
import java.util.List;

public class FineExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FineExample() {
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

        public Criteria andFineIdIsNull() {
            addCriterion("fine_id is null");
            return (Criteria) this;
        }

        public Criteria andFineIdIsNotNull() {
            addCriterion("fine_id is not null");
            return (Criteria) this;
        }

        public Criteria andFineIdEqualTo(Integer value) {
            addCriterion("fine_id =", value, "fineId");
            return (Criteria) this;
        }

        public Criteria andFineIdNotEqualTo(Integer value) {
            addCriterion("fine_id <>", value, "fineId");
            return (Criteria) this;
        }

        public Criteria andFineIdGreaterThan(Integer value) {
            addCriterion("fine_id >", value, "fineId");
            return (Criteria) this;
        }

        public Criteria andFineIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("fine_id >=", value, "fineId");
            return (Criteria) this;
        }

        public Criteria andFineIdLessThan(Integer value) {
            addCriterion("fine_id <", value, "fineId");
            return (Criteria) this;
        }

        public Criteria andFineIdLessThanOrEqualTo(Integer value) {
            addCriterion("fine_id <=", value, "fineId");
            return (Criteria) this;
        }

        public Criteria andFineIdIn(List<Integer> values) {
            addCriterion("fine_id in", values, "fineId");
            return (Criteria) this;
        }

        public Criteria andFineIdNotIn(List<Integer> values) {
            addCriterion("fine_id not in", values, "fineId");
            return (Criteria) this;
        }

        public Criteria andFineIdBetween(Integer value1, Integer value2) {
            addCriterion("fine_id between", value1, value2, "fineId");
            return (Criteria) this;
        }

        public Criteria andFineIdNotBetween(Integer value1, Integer value2) {
            addCriterion("fine_id not between", value1, value2, "fineId");
            return (Criteria) this;
        }

        public Criteria andFineUserIdIsNull() {
            addCriterion("fine_user_id is null");
            return (Criteria) this;
        }

        public Criteria andFineUserIdIsNotNull() {
            addCriterion("fine_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andFineUserIdEqualTo(String value) {
            addCriterion("fine_user_id =", value, "fineUserId");
            return (Criteria) this;
        }

        public Criteria andFineUserIdNotEqualTo(String value) {
            addCriterion("fine_user_id <>", value, "fineUserId");
            return (Criteria) this;
        }

        public Criteria andFineUserIdGreaterThan(String value) {
            addCriterion("fine_user_id >", value, "fineUserId");
            return (Criteria) this;
        }

        public Criteria andFineUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("fine_user_id >=", value, "fineUserId");
            return (Criteria) this;
        }

        public Criteria andFineUserIdLessThan(String value) {
            addCriterion("fine_user_id <", value, "fineUserId");
            return (Criteria) this;
        }

        public Criteria andFineUserIdLessThanOrEqualTo(String value) {
            addCriterion("fine_user_id <=", value, "fineUserId");
            return (Criteria) this;
        }

        public Criteria andFineUserIdLike(String value) {
            addCriterion("fine_user_id like", value, "fineUserId");
            return (Criteria) this;
        }

        public Criteria andFineUserIdNotLike(String value) {
            addCriterion("fine_user_id not like", value, "fineUserId");
            return (Criteria) this;
        }

        public Criteria andFineUserIdIn(List<String> values) {
            addCriterion("fine_user_id in", values, "fineUserId");
            return (Criteria) this;
        }

        public Criteria andFineUserIdNotIn(List<String> values) {
            addCriterion("fine_user_id not in", values, "fineUserId");
            return (Criteria) this;
        }

        public Criteria andFineUserIdBetween(String value1, String value2) {
            addCriterion("fine_user_id between", value1, value2, "fineUserId");
            return (Criteria) this;
        }

        public Criteria andFineUserIdNotBetween(String value1, String value2) {
            addCriterion("fine_user_id not between", value1, value2, "fineUserId");
            return (Criteria) this;
        }

        public Criteria andFinePayIsNull() {
            addCriterion("fine_pay is null");
            return (Criteria) this;
        }

        public Criteria andFinePayIsNotNull() {
            addCriterion("fine_pay is not null");
            return (Criteria) this;
        }

        public Criteria andFinePayEqualTo(Integer value) {
            addCriterion("fine_pay =", value, "finePay");
            return (Criteria) this;
        }

        public Criteria andFinePayNotEqualTo(Integer value) {
            addCriterion("fine_pay <>", value, "finePay");
            return (Criteria) this;
        }

        public Criteria andFinePayGreaterThan(Integer value) {
            addCriterion("fine_pay >", value, "finePay");
            return (Criteria) this;
        }

        public Criteria andFinePayGreaterThanOrEqualTo(Integer value) {
            addCriterion("fine_pay >=", value, "finePay");
            return (Criteria) this;
        }

        public Criteria andFinePayLessThan(Integer value) {
            addCriterion("fine_pay <", value, "finePay");
            return (Criteria) this;
        }

        public Criteria andFinePayLessThanOrEqualTo(Integer value) {
            addCriterion("fine_pay <=", value, "finePay");
            return (Criteria) this;
        }

        public Criteria andFinePayIn(List<Integer> values) {
            addCriterion("fine_pay in", values, "finePay");
            return (Criteria) this;
        }

        public Criteria andFinePayNotIn(List<Integer> values) {
            addCriterion("fine_pay not in", values, "finePay");
            return (Criteria) this;
        }

        public Criteria andFinePayBetween(Integer value1, Integer value2) {
            addCriterion("fine_pay between", value1, value2, "finePay");
            return (Criteria) this;
        }

        public Criteria andFinePayNotBetween(Integer value1, Integer value2) {
            addCriterion("fine_pay not between", value1, value2, "finePay");
            return (Criteria) this;
        }

        public Criteria andFinePaidIsNull() {
            addCriterion("fine_paid is null");
            return (Criteria) this;
        }

        public Criteria andFinePaidIsNotNull() {
            addCriterion("fine_paid is not null");
            return (Criteria) this;
        }

        public Criteria andFinePaidEqualTo(Integer value) {
            addCriterion("fine_paid =", value, "finePaid");
            return (Criteria) this;
        }

        public Criteria andFinePaidNotEqualTo(Integer value) {
            addCriterion("fine_paid <>", value, "finePaid");
            return (Criteria) this;
        }

        public Criteria andFinePaidGreaterThan(Integer value) {
            addCriterion("fine_paid >", value, "finePaid");
            return (Criteria) this;
        }

        public Criteria andFinePaidGreaterThanOrEqualTo(Integer value) {
            addCriterion("fine_paid >=", value, "finePaid");
            return (Criteria) this;
        }

        public Criteria andFinePaidLessThan(Integer value) {
            addCriterion("fine_paid <", value, "finePaid");
            return (Criteria) this;
        }

        public Criteria andFinePaidLessThanOrEqualTo(Integer value) {
            addCriterion("fine_paid <=", value, "finePaid");
            return (Criteria) this;
        }

        public Criteria andFinePaidIn(List<Integer> values) {
            addCriterion("fine_paid in", values, "finePaid");
            return (Criteria) this;
        }

        public Criteria andFinePaidNotIn(List<Integer> values) {
            addCriterion("fine_paid not in", values, "finePaid");
            return (Criteria) this;
        }

        public Criteria andFinePaidBetween(Integer value1, Integer value2) {
            addCriterion("fine_paid between", value1, value2, "finePaid");
            return (Criteria) this;
        }

        public Criteria andFinePaidNotBetween(Integer value1, Integer value2) {
            addCriterion("fine_paid not between", value1, value2, "finePaid");
            return (Criteria) this;
        }

        public Criteria andFineDescripeIsNull() {
            addCriterion("fine_descripe is null");
            return (Criteria) this;
        }

        public Criteria andFineDescripeIsNotNull() {
            addCriterion("fine_descripe is not null");
            return (Criteria) this;
        }

        public Criteria andFineDescripeEqualTo(String value) {
            addCriterion("fine_descripe =", value, "fineDescripe");
            return (Criteria) this;
        }

        public Criteria andFineDescripeNotEqualTo(String value) {
            addCriterion("fine_descripe <>", value, "fineDescripe");
            return (Criteria) this;
        }

        public Criteria andFineDescripeGreaterThan(String value) {
            addCriterion("fine_descripe >", value, "fineDescripe");
            return (Criteria) this;
        }

        public Criteria andFineDescripeGreaterThanOrEqualTo(String value) {
            addCriterion("fine_descripe >=", value, "fineDescripe");
            return (Criteria) this;
        }

        public Criteria andFineDescripeLessThan(String value) {
            addCriterion("fine_descripe <", value, "fineDescripe");
            return (Criteria) this;
        }

        public Criteria andFineDescripeLessThanOrEqualTo(String value) {
            addCriterion("fine_descripe <=", value, "fineDescripe");
            return (Criteria) this;
        }

        public Criteria andFineDescripeLike(String value) {
            addCriterion("fine_descripe like", value, "fineDescripe");
            return (Criteria) this;
        }

        public Criteria andFineDescripeNotLike(String value) {
            addCriterion("fine_descripe not like", value, "fineDescripe");
            return (Criteria) this;
        }

        public Criteria andFineDescripeIn(List<String> values) {
            addCriterion("fine_descripe in", values, "fineDescripe");
            return (Criteria) this;
        }

        public Criteria andFineDescripeNotIn(List<String> values) {
            addCriterion("fine_descripe not in", values, "fineDescripe");
            return (Criteria) this;
        }

        public Criteria andFineDescripeBetween(String value1, String value2) {
            addCriterion("fine_descripe between", value1, value2, "fineDescripe");
            return (Criteria) this;
        }

        public Criteria andFineDescripeNotBetween(String value1, String value2) {
            addCriterion("fine_descripe not between", value1, value2, "fineDescripe");
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