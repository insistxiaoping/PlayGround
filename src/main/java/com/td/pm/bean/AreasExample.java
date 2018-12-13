package com.td.pm.bean;

import java.util.ArrayList;
import java.util.List;

public class AreasExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AreasExample() {
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

        public Criteria andAreaIdIsNull() {
            addCriterion("area_id is null");
            return (Criteria) this;
        }

        public Criteria andAreaIdIsNotNull() {
            addCriterion("area_id is not null");
            return (Criteria) this;
        }

        public Criteria andAreaIdEqualTo(String value) {
            addCriterion("area_id =", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdNotEqualTo(String value) {
            addCriterion("area_id <>", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdGreaterThan(String value) {
            addCriterion("area_id >", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdGreaterThanOrEqualTo(String value) {
            addCriterion("area_id >=", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdLessThan(String value) {
            addCriterion("area_id <", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdLessThanOrEqualTo(String value) {
            addCriterion("area_id <=", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdLike(String value) {
            addCriterion("area_id like", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdNotLike(String value) {
            addCriterion("area_id not like", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdIn(List<String> values) {
            addCriterion("area_id in", values, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdNotIn(List<String> values) {
            addCriterion("area_id not in", values, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdBetween(String value1, String value2) {
            addCriterion("area_id between", value1, value2, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdNotBetween(String value1, String value2) {
            addCriterion("area_id not between", value1, value2, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaNameIsNull() {
            addCriterion("area_name is null");
            return (Criteria) this;
        }

        public Criteria andAreaNameIsNotNull() {
            addCriterion("area_name is not null");
            return (Criteria) this;
        }

        public Criteria andAreaNameEqualTo(String value) {
            addCriterion("area_name =", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameNotEqualTo(String value) {
            addCriterion("area_name <>", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameGreaterThan(String value) {
            addCriterion("area_name >", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameGreaterThanOrEqualTo(String value) {
            addCriterion("area_name >=", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameLessThan(String value) {
            addCriterion("area_name <", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameLessThanOrEqualTo(String value) {
            addCriterion("area_name <=", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameLike(String value) {
            addCriterion("area_name like", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameNotLike(String value) {
            addCriterion("area_name not like", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameIn(List<String> values) {
            addCriterion("area_name in", values, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameNotIn(List<String> values) {
            addCriterion("area_name not in", values, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameBetween(String value1, String value2) {
            addCriterion("area_name between", value1, value2, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameNotBetween(String value1, String value2) {
            addCriterion("area_name not between", value1, value2, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaTotalIsNull() {
            addCriterion("area_total is null");
            return (Criteria) this;
        }

        public Criteria andAreaTotalIsNotNull() {
            addCriterion("area_total is not null");
            return (Criteria) this;
        }

        public Criteria andAreaTotalEqualTo(Integer value) {
            addCriterion("area_total =", value, "areaTotal");
            return (Criteria) this;
        }

        public Criteria andAreaTotalNotEqualTo(Integer value) {
            addCriterion("area_total <>", value, "areaTotal");
            return (Criteria) this;
        }

        public Criteria andAreaTotalGreaterThan(Integer value) {
            addCriterion("area_total >", value, "areaTotal");
            return (Criteria) this;
        }

        public Criteria andAreaTotalGreaterThanOrEqualTo(Integer value) {
            addCriterion("area_total >=", value, "areaTotal");
            return (Criteria) this;
        }

        public Criteria andAreaTotalLessThan(Integer value) {
            addCriterion("area_total <", value, "areaTotal");
            return (Criteria) this;
        }

        public Criteria andAreaTotalLessThanOrEqualTo(Integer value) {
            addCriterion("area_total <=", value, "areaTotal");
            return (Criteria) this;
        }

        public Criteria andAreaTotalIn(List<Integer> values) {
            addCriterion("area_total in", values, "areaTotal");
            return (Criteria) this;
        }

        public Criteria andAreaTotalNotIn(List<Integer> values) {
            addCriterion("area_total not in", values, "areaTotal");
            return (Criteria) this;
        }

        public Criteria andAreaTotalBetween(Integer value1, Integer value2) {
            addCriterion("area_total between", value1, value2, "areaTotal");
            return (Criteria) this;
        }

        public Criteria andAreaTotalNotBetween(Integer value1, Integer value2) {
            addCriterion("area_total not between", value1, value2, "areaTotal");
            return (Criteria) this;
        }

        public Criteria andAreaRestIsNull() {
            addCriterion("area_rest is null");
            return (Criteria) this;
        }

        public Criteria andAreaRestIsNotNull() {
            addCriterion("area_rest is not null");
            return (Criteria) this;
        }

        public Criteria andAreaRestEqualTo(Integer value) {
            addCriterion("area_rest =", value, "areaRest");
            return (Criteria) this;
        }

        public Criteria andAreaRestNotEqualTo(Integer value) {
            addCriterion("area_rest <>", value, "areaRest");
            return (Criteria) this;
        }

        public Criteria andAreaRestGreaterThan(Integer value) {
            addCriterion("area_rest >", value, "areaRest");
            return (Criteria) this;
        }

        public Criteria andAreaRestGreaterThanOrEqualTo(Integer value) {
            addCriterion("area_rest >=", value, "areaRest");
            return (Criteria) this;
        }

        public Criteria andAreaRestLessThan(Integer value) {
            addCriterion("area_rest <", value, "areaRest");
            return (Criteria) this;
        }

        public Criteria andAreaRestLessThanOrEqualTo(Integer value) {
            addCriterion("area_rest <=", value, "areaRest");
            return (Criteria) this;
        }

        public Criteria andAreaRestIn(List<Integer> values) {
            addCriterion("area_rest in", values, "areaRest");
            return (Criteria) this;
        }

        public Criteria andAreaRestNotIn(List<Integer> values) {
            addCriterion("area_rest not in", values, "areaRest");
            return (Criteria) this;
        }

        public Criteria andAreaRestBetween(Integer value1, Integer value2) {
            addCriterion("area_rest between", value1, value2, "areaRest");
            return (Criteria) this;
        }

        public Criteria andAreaRestNotBetween(Integer value1, Integer value2) {
            addCriterion("area_rest not between", value1, value2, "areaRest");
            return (Criteria) this;
        }

        public Criteria andAreaConstIsNull() {
            addCriterion("area_const is null");
            return (Criteria) this;
        }

        public Criteria andAreaConstIsNotNull() {
            addCriterion("area_const is not null");
            return (Criteria) this;
        }

        public Criteria andAreaConstEqualTo(Integer value) {
            addCriterion("area_const =", value, "areaConst");
            return (Criteria) this;
        }

        public Criteria andAreaConstNotEqualTo(Integer value) {
            addCriterion("area_const <>", value, "areaConst");
            return (Criteria) this;
        }

        public Criteria andAreaConstGreaterThan(Integer value) {
            addCriterion("area_const >", value, "areaConst");
            return (Criteria) this;
        }

        public Criteria andAreaConstGreaterThanOrEqualTo(Integer value) {
            addCriterion("area_const >=", value, "areaConst");
            return (Criteria) this;
        }

        public Criteria andAreaConstLessThan(Integer value) {
            addCriterion("area_const <", value, "areaConst");
            return (Criteria) this;
        }

        public Criteria andAreaConstLessThanOrEqualTo(Integer value) {
            addCriterion("area_const <=", value, "areaConst");
            return (Criteria) this;
        }

        public Criteria andAreaConstIn(List<Integer> values) {
            addCriterion("area_const in", values, "areaConst");
            return (Criteria) this;
        }

        public Criteria andAreaConstNotIn(List<Integer> values) {
            addCriterion("area_const not in", values, "areaConst");
            return (Criteria) this;
        }

        public Criteria andAreaConstBetween(Integer value1, Integer value2) {
            addCriterion("area_const between", value1, value2, "areaConst");
            return (Criteria) this;
        }

        public Criteria andAreaConstNotBetween(Integer value1, Integer value2) {
            addCriterion("area_const not between", value1, value2, "areaConst");
            return (Criteria) this;
        }

        public Criteria andAreaPhotoIsNull() {
            addCriterion("area_photo is null");
            return (Criteria) this;
        }

        public Criteria andAreaPhotoIsNotNull() {
            addCriterion("area_photo is not null");
            return (Criteria) this;
        }

        public Criteria andAreaPhotoEqualTo(String value) {
            addCriterion("area_photo =", value, "areaPhoto");
            return (Criteria) this;
        }

        public Criteria andAreaPhotoNotEqualTo(String value) {
            addCriterion("area_photo <>", value, "areaPhoto");
            return (Criteria) this;
        }

        public Criteria andAreaPhotoGreaterThan(String value) {
            addCriterion("area_photo >", value, "areaPhoto");
            return (Criteria) this;
        }

        public Criteria andAreaPhotoGreaterThanOrEqualTo(String value) {
            addCriterion("area_photo >=", value, "areaPhoto");
            return (Criteria) this;
        }

        public Criteria andAreaPhotoLessThan(String value) {
            addCriterion("area_photo <", value, "areaPhoto");
            return (Criteria) this;
        }

        public Criteria andAreaPhotoLessThanOrEqualTo(String value) {
            addCriterion("area_photo <=", value, "areaPhoto");
            return (Criteria) this;
        }

        public Criteria andAreaPhotoLike(String value) {
            addCriterion("area_photo like", value, "areaPhoto");
            return (Criteria) this;
        }

        public Criteria andAreaPhotoNotLike(String value) {
            addCriterion("area_photo not like", value, "areaPhoto");
            return (Criteria) this;
        }

        public Criteria andAreaPhotoIn(List<String> values) {
            addCriterion("area_photo in", values, "areaPhoto");
            return (Criteria) this;
        }

        public Criteria andAreaPhotoNotIn(List<String> values) {
            addCriterion("area_photo not in", values, "areaPhoto");
            return (Criteria) this;
        }

        public Criteria andAreaPhotoBetween(String value1, String value2) {
            addCriterion("area_photo between", value1, value2, "areaPhoto");
            return (Criteria) this;
        }

        public Criteria andAreaPhotoNotBetween(String value1, String value2) {
            addCriterion("area_photo not between", value1, value2, "areaPhoto");
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