package com.td.pm.bean;

import java.util.ArrayList;
import java.util.List;

public class EquipmentsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EquipmentsExample() {
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

        public Criteria andEquipIdIsNull() {
            addCriterion("equip_id is null");
            return (Criteria) this;
        }

        public Criteria andEquipIdIsNotNull() {
            addCriterion("equip_id is not null");
            return (Criteria) this;
        }

        public Criteria andEquipIdEqualTo(String value) {
            addCriterion("equip_id =", value, "equipId");
            return (Criteria) this;
        }

        public Criteria andEquipIdNotEqualTo(String value) {
            addCriterion("equip_id <>", value, "equipId");
            return (Criteria) this;
        }

        public Criteria andEquipIdGreaterThan(String value) {
            addCriterion("equip_id >", value, "equipId");
            return (Criteria) this;
        }

        public Criteria andEquipIdGreaterThanOrEqualTo(String value) {
            addCriterion("equip_id >=", value, "equipId");
            return (Criteria) this;
        }

        public Criteria andEquipIdLessThan(String value) {
            addCriterion("equip_id <", value, "equipId");
            return (Criteria) this;
        }

        public Criteria andEquipIdLessThanOrEqualTo(String value) {
            addCriterion("equip_id <=", value, "equipId");
            return (Criteria) this;
        }

        public Criteria andEquipIdLike(String value) {
            addCriterion("equip_id like", value, "equipId");
            return (Criteria) this;
        }

        public Criteria andEquipIdNotLike(String value) {
            addCriterion("equip_id not like", value, "equipId");
            return (Criteria) this;
        }

        public Criteria andEquipIdIn(List<String> values) {
            addCriterion("equip_id in", values, "equipId");
            return (Criteria) this;
        }

        public Criteria andEquipIdNotIn(List<String> values) {
            addCriterion("equip_id not in", values, "equipId");
            return (Criteria) this;
        }

        public Criteria andEquipIdBetween(String value1, String value2) {
            addCriterion("equip_id between", value1, value2, "equipId");
            return (Criteria) this;
        }

        public Criteria andEquipIdNotBetween(String value1, String value2) {
            addCriterion("equip_id not between", value1, value2, "equipId");
            return (Criteria) this;
        }

        public Criteria andEquipNameIsNull() {
            addCriterion("equip_name is null");
            return (Criteria) this;
        }

        public Criteria andEquipNameIsNotNull() {
            addCriterion("equip_name is not null");
            return (Criteria) this;
        }

        public Criteria andEquipNameEqualTo(String value) {
            addCriterion("equip_name =", value, "equipName");
            return (Criteria) this;
        }

        public Criteria andEquipNameNotEqualTo(String value) {
            addCriterion("equip_name <>", value, "equipName");
            return (Criteria) this;
        }

        public Criteria andEquipNameGreaterThan(String value) {
            addCriterion("equip_name >", value, "equipName");
            return (Criteria) this;
        }

        public Criteria andEquipNameGreaterThanOrEqualTo(String value) {
            addCriterion("equip_name >=", value, "equipName");
            return (Criteria) this;
        }

        public Criteria andEquipNameLessThan(String value) {
            addCriterion("equip_name <", value, "equipName");
            return (Criteria) this;
        }

        public Criteria andEquipNameLessThanOrEqualTo(String value) {
            addCriterion("equip_name <=", value, "equipName");
            return (Criteria) this;
        }

        public Criteria andEquipNameLike(String value) {
            addCriterion("equip_name like", value, "equipName");
            return (Criteria) this;
        }

        public Criteria andEquipNameNotLike(String value) {
            addCriterion("equip_name not like", value, "equipName");
            return (Criteria) this;
        }

        public Criteria andEquipNameIn(List<String> values) {
            addCriterion("equip_name in", values, "equipName");
            return (Criteria) this;
        }

        public Criteria andEquipNameNotIn(List<String> values) {
            addCriterion("equip_name not in", values, "equipName");
            return (Criteria) this;
        }

        public Criteria andEquipNameBetween(String value1, String value2) {
            addCriterion("equip_name between", value1, value2, "equipName");
            return (Criteria) this;
        }

        public Criteria andEquipNameNotBetween(String value1, String value2) {
            addCriterion("equip_name not between", value1, value2, "equipName");
            return (Criteria) this;
        }

        public Criteria andEquipTotalIsNull() {
            addCriterion("equip_total is null");
            return (Criteria) this;
        }

        public Criteria andEquipTotalIsNotNull() {
            addCriterion("equip_total is not null");
            return (Criteria) this;
        }

        public Criteria andEquipTotalEqualTo(Integer value) {
            addCriterion("equip_total =", value, "equipTotal");
            return (Criteria) this;
        }

        public Criteria andEquipTotalNotEqualTo(Integer value) {
            addCriterion("equip_total <>", value, "equipTotal");
            return (Criteria) this;
        }

        public Criteria andEquipTotalGreaterThan(Integer value) {
            addCriterion("equip_total >", value, "equipTotal");
            return (Criteria) this;
        }

        public Criteria andEquipTotalGreaterThanOrEqualTo(Integer value) {
            addCriterion("equip_total >=", value, "equipTotal");
            return (Criteria) this;
        }

        public Criteria andEquipTotalLessThan(Integer value) {
            addCriterion("equip_total <", value, "equipTotal");
            return (Criteria) this;
        }

        public Criteria andEquipTotalLessThanOrEqualTo(Integer value) {
            addCriterion("equip_total <=", value, "equipTotal");
            return (Criteria) this;
        }

        public Criteria andEquipTotalIn(List<Integer> values) {
            addCriterion("equip_total in", values, "equipTotal");
            return (Criteria) this;
        }

        public Criteria andEquipTotalNotIn(List<Integer> values) {
            addCriterion("equip_total not in", values, "equipTotal");
            return (Criteria) this;
        }

        public Criteria andEquipTotalBetween(Integer value1, Integer value2) {
            addCriterion("equip_total between", value1, value2, "equipTotal");
            return (Criteria) this;
        }

        public Criteria andEquipTotalNotBetween(Integer value1, Integer value2) {
            addCriterion("equip_total not between", value1, value2, "equipTotal");
            return (Criteria) this;
        }

        public Criteria andEquipRestIsNull() {
            addCriterion("equip_rest is null");
            return (Criteria) this;
        }

        public Criteria andEquipRestIsNotNull() {
            addCriterion("equip_rest is not null");
            return (Criteria) this;
        }

        public Criteria andEquipRestEqualTo(Integer value) {
            addCriterion("equip_rest =", value, "equipRest");
            return (Criteria) this;
        }

        public Criteria andEquipRestNotEqualTo(Integer value) {
            addCriterion("equip_rest <>", value, "equipRest");
            return (Criteria) this;
        }

        public Criteria andEquipRestGreaterThan(Integer value) {
            addCriterion("equip_rest >", value, "equipRest");
            return (Criteria) this;
        }

        public Criteria andEquipRestGreaterThanOrEqualTo(Integer value) {
            addCriterion("equip_rest >=", value, "equipRest");
            return (Criteria) this;
        }

        public Criteria andEquipRestLessThan(Integer value) {
            addCriterion("equip_rest <", value, "equipRest");
            return (Criteria) this;
        }

        public Criteria andEquipRestLessThanOrEqualTo(Integer value) {
            addCriterion("equip_rest <=", value, "equipRest");
            return (Criteria) this;
        }

        public Criteria andEquipRestIn(List<Integer> values) {
            addCriterion("equip_rest in", values, "equipRest");
            return (Criteria) this;
        }

        public Criteria andEquipRestNotIn(List<Integer> values) {
            addCriterion("equip_rest not in", values, "equipRest");
            return (Criteria) this;
        }

        public Criteria andEquipRestBetween(Integer value1, Integer value2) {
            addCriterion("equip_rest between", value1, value2, "equipRest");
            return (Criteria) this;
        }

        public Criteria andEquipRestNotBetween(Integer value1, Integer value2) {
            addCriterion("equip_rest not between", value1, value2, "equipRest");
            return (Criteria) this;
        }

        public Criteria andEquipConstIsNull() {
            addCriterion("equip_const is null");
            return (Criteria) this;
        }

        public Criteria andEquipConstIsNotNull() {
            addCriterion("equip_const is not null");
            return (Criteria) this;
        }

        public Criteria andEquipConstEqualTo(Integer value) {
            addCriterion("equip_const =", value, "equipConst");
            return (Criteria) this;
        }

        public Criteria andEquipConstNotEqualTo(Integer value) {
            addCriterion("equip_const <>", value, "equipConst");
            return (Criteria) this;
        }

        public Criteria andEquipConstGreaterThan(Integer value) {
            addCriterion("equip_const >", value, "equipConst");
            return (Criteria) this;
        }

        public Criteria andEquipConstGreaterThanOrEqualTo(Integer value) {
            addCriterion("equip_const >=", value, "equipConst");
            return (Criteria) this;
        }

        public Criteria andEquipConstLessThan(Integer value) {
            addCriterion("equip_const <", value, "equipConst");
            return (Criteria) this;
        }

        public Criteria andEquipConstLessThanOrEqualTo(Integer value) {
            addCriterion("equip_const <=", value, "equipConst");
            return (Criteria) this;
        }

        public Criteria andEquipConstIn(List<Integer> values) {
            addCriterion("equip_const in", values, "equipConst");
            return (Criteria) this;
        }

        public Criteria andEquipConstNotIn(List<Integer> values) {
            addCriterion("equip_const not in", values, "equipConst");
            return (Criteria) this;
        }

        public Criteria andEquipConstBetween(Integer value1, Integer value2) {
            addCriterion("equip_const between", value1, value2, "equipConst");
            return (Criteria) this;
        }

        public Criteria andEquipConstNotBetween(Integer value1, Integer value2) {
            addCriterion("equip_const not between", value1, value2, "equipConst");
            return (Criteria) this;
        }

        public Criteria andEquipPhotoIsNull() {
            addCriterion("equip_photo is null");
            return (Criteria) this;
        }

        public Criteria andEquipPhotoIsNotNull() {
            addCriterion("equip_photo is not null");
            return (Criteria) this;
        }

        public Criteria andEquipPhotoEqualTo(String value) {
            addCriterion("equip_photo =", value, "equipPhoto");
            return (Criteria) this;
        }

        public Criteria andEquipPhotoNotEqualTo(String value) {
            addCriterion("equip_photo <>", value, "equipPhoto");
            return (Criteria) this;
        }

        public Criteria andEquipPhotoGreaterThan(String value) {
            addCriterion("equip_photo >", value, "equipPhoto");
            return (Criteria) this;
        }

        public Criteria andEquipPhotoGreaterThanOrEqualTo(String value) {
            addCriterion("equip_photo >=", value, "equipPhoto");
            return (Criteria) this;
        }

        public Criteria andEquipPhotoLessThan(String value) {
            addCriterion("equip_photo <", value, "equipPhoto");
            return (Criteria) this;
        }

        public Criteria andEquipPhotoLessThanOrEqualTo(String value) {
            addCriterion("equip_photo <=", value, "equipPhoto");
            return (Criteria) this;
        }

        public Criteria andEquipPhotoLike(String value) {
            addCriterion("equip_photo like", value, "equipPhoto");
            return (Criteria) this;
        }

        public Criteria andEquipPhotoNotLike(String value) {
            addCriterion("equip_photo not like", value, "equipPhoto");
            return (Criteria) this;
        }

        public Criteria andEquipPhotoIn(List<String> values) {
            addCriterion("equip_photo in", values, "equipPhoto");
            return (Criteria) this;
        }

        public Criteria andEquipPhotoNotIn(List<String> values) {
            addCriterion("equip_photo not in", values, "equipPhoto");
            return (Criteria) this;
        }

        public Criteria andEquipPhotoBetween(String value1, String value2) {
            addCriterion("equip_photo between", value1, value2, "equipPhoto");
            return (Criteria) this;
        }

        public Criteria andEquipPhotoNotBetween(String value1, String value2) {
            addCriterion("equip_photo not between", value1, value2, "equipPhoto");
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