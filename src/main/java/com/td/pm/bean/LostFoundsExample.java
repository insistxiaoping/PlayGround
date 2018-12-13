package com.td.pm.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LostFoundsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LostFoundsExample() {
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

        public Criteria andLadIdIsNull() {
            addCriterion("lad_id is null");
            return (Criteria) this;
        }

        public Criteria andLadIdIsNotNull() {
            addCriterion("lad_id is not null");
            return (Criteria) this;
        }

        public Criteria andLadIdEqualTo(Integer value) {
            addCriterion("lad_id =", value, "ladId");
            return (Criteria) this;
        }

        public Criteria andLadIdNotEqualTo(Integer value) {
            addCriterion("lad_id <>", value, "ladId");
            return (Criteria) this;
        }

        public Criteria andLadIdGreaterThan(Integer value) {
            addCriterion("lad_id >", value, "ladId");
            return (Criteria) this;
        }

        public Criteria andLadIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("lad_id >=", value, "ladId");
            return (Criteria) this;
        }

        public Criteria andLadIdLessThan(Integer value) {
            addCriterion("lad_id <", value, "ladId");
            return (Criteria) this;
        }

        public Criteria andLadIdLessThanOrEqualTo(Integer value) {
            addCriterion("lad_id <=", value, "ladId");
            return (Criteria) this;
        }

        public Criteria andLadIdIn(List<Integer> values) {
            addCriterion("lad_id in", values, "ladId");
            return (Criteria) this;
        }

        public Criteria andLadIdNotIn(List<Integer> values) {
            addCriterion("lad_id not in", values, "ladId");
            return (Criteria) this;
        }

        public Criteria andLadIdBetween(Integer value1, Integer value2) {
            addCriterion("lad_id between", value1, value2, "ladId");
            return (Criteria) this;
        }

        public Criteria andLadIdNotBetween(Integer value1, Integer value2) {
            addCriterion("lad_id not between", value1, value2, "ladId");
            return (Criteria) this;
        }

        public Criteria andLadDateIsNull() {
            addCriterion("lad_date is null");
            return (Criteria) this;
        }

        public Criteria andLadDateIsNotNull() {
            addCriterion("lad_date is not null");
            return (Criteria) this;
        }

        public Criteria andLadDateEqualTo(Date value) {
            addCriterion("lad_date =", value, "ladDate");
            return (Criteria) this;
        }

        public Criteria andLadDateNotEqualTo(Date value) {
            addCriterion("lad_date <>", value, "ladDate");
            return (Criteria) this;
        }

        public Criteria andLadDateGreaterThan(Date value) {
            addCriterion("lad_date >", value, "ladDate");
            return (Criteria) this;
        }

        public Criteria andLadDateGreaterThanOrEqualTo(Date value) {
            addCriterion("lad_date >=", value, "ladDate");
            return (Criteria) this;
        }

        public Criteria andLadDateLessThan(Date value) {
            addCriterion("lad_date <", value, "ladDate");
            return (Criteria) this;
        }

        public Criteria andLadDateLessThanOrEqualTo(Date value) {
            addCriterion("lad_date <=", value, "ladDate");
            return (Criteria) this;
        }

        public Criteria andLadDateIn(List<Date> values) {
            addCriterion("lad_date in", values, "ladDate");
            return (Criteria) this;
        }

        public Criteria andLadDateNotIn(List<Date> values) {
            addCriterion("lad_date not in", values, "ladDate");
            return (Criteria) this;
        }

        public Criteria andLadDateBetween(Date value1, Date value2) {
            addCriterion("lad_date between", value1, value2, "ladDate");
            return (Criteria) this;
        }

        public Criteria andLadDateNotBetween(Date value1, Date value2) {
            addCriterion("lad_date not between", value1, value2, "ladDate");
            return (Criteria) this;
        }

        public Criteria andLadDescripeIsNull() {
            addCriterion("lad_descripe is null");
            return (Criteria) this;
        }

        public Criteria andLadDescripeIsNotNull() {
            addCriterion("lad_descripe is not null");
            return (Criteria) this;
        }

        public Criteria andLadDescripeEqualTo(String value) {
            addCriterion("lad_descripe =", value, "ladDescripe");
            return (Criteria) this;
        }

        public Criteria andLadDescripeNotEqualTo(String value) {
            addCriterion("lad_descripe <>", value, "ladDescripe");
            return (Criteria) this;
        }

        public Criteria andLadDescripeGreaterThan(String value) {
            addCriterion("lad_descripe >", value, "ladDescripe");
            return (Criteria) this;
        }

        public Criteria andLadDescripeGreaterThanOrEqualTo(String value) {
            addCriterion("lad_descripe >=", value, "ladDescripe");
            return (Criteria) this;
        }

        public Criteria andLadDescripeLessThan(String value) {
            addCriterion("lad_descripe <", value, "ladDescripe");
            return (Criteria) this;
        }

        public Criteria andLadDescripeLessThanOrEqualTo(String value) {
            addCriterion("lad_descripe <=", value, "ladDescripe");
            return (Criteria) this;
        }

        public Criteria andLadDescripeLike(String value) {
            addCriterion("lad_descripe like", value, "ladDescripe");
            return (Criteria) this;
        }

        public Criteria andLadDescripeNotLike(String value) {
            addCriterion("lad_descripe not like", value, "ladDescripe");
            return (Criteria) this;
        }

        public Criteria andLadDescripeIn(List<String> values) {
            addCriterion("lad_descripe in", values, "ladDescripe");
            return (Criteria) this;
        }

        public Criteria andLadDescripeNotIn(List<String> values) {
            addCriterion("lad_descripe not in", values, "ladDescripe");
            return (Criteria) this;
        }

        public Criteria andLadDescripeBetween(String value1, String value2) {
            addCriterion("lad_descripe between", value1, value2, "ladDescripe");
            return (Criteria) this;
        }

        public Criteria andLadDescripeNotBetween(String value1, String value2) {
            addCriterion("lad_descripe not between", value1, value2, "ladDescripe");
            return (Criteria) this;
        }

        public Criteria andLoserNameIsNull() {
            addCriterion("loser_name is null");
            return (Criteria) this;
        }

        public Criteria andLoserNameIsNotNull() {
            addCriterion("loser_name is not null");
            return (Criteria) this;
        }

        public Criteria andLoserNameEqualTo(String value) {
            addCriterion("loser_name =", value, "loserName");
            return (Criteria) this;
        }

        public Criteria andLoserNameNotEqualTo(String value) {
            addCriterion("loser_name <>", value, "loserName");
            return (Criteria) this;
        }

        public Criteria andLoserNameGreaterThan(String value) {
            addCriterion("loser_name >", value, "loserName");
            return (Criteria) this;
        }

        public Criteria andLoserNameGreaterThanOrEqualTo(String value) {
            addCriterion("loser_name >=", value, "loserName");
            return (Criteria) this;
        }

        public Criteria andLoserNameLessThan(String value) {
            addCriterion("loser_name <", value, "loserName");
            return (Criteria) this;
        }

        public Criteria andLoserNameLessThanOrEqualTo(String value) {
            addCriterion("loser_name <=", value, "loserName");
            return (Criteria) this;
        }

        public Criteria andLoserNameLike(String value) {
            addCriterion("loser_name like", value, "loserName");
            return (Criteria) this;
        }

        public Criteria andLoserNameNotLike(String value) {
            addCriterion("loser_name not like", value, "loserName");
            return (Criteria) this;
        }

        public Criteria andLoserNameIn(List<String> values) {
            addCriterion("loser_name in", values, "loserName");
            return (Criteria) this;
        }

        public Criteria andLoserNameNotIn(List<String> values) {
            addCriterion("loser_name not in", values, "loserName");
            return (Criteria) this;
        }

        public Criteria andLoserNameBetween(String value1, String value2) {
            addCriterion("loser_name between", value1, value2, "loserName");
            return (Criteria) this;
        }

        public Criteria andLoserNameNotBetween(String value1, String value2) {
            addCriterion("loser_name not between", value1, value2, "loserName");
            return (Criteria) this;
        }

        public Criteria andFounderNameIsNull() {
            addCriterion("founder_name is null");
            return (Criteria) this;
        }

        public Criteria andFounderNameIsNotNull() {
            addCriterion("founder_name is not null");
            return (Criteria) this;
        }

        public Criteria andFounderNameEqualTo(String value) {
            addCriterion("founder_name =", value, "founderName");
            return (Criteria) this;
        }

        public Criteria andFounderNameNotEqualTo(String value) {
            addCriterion("founder_name <>", value, "founderName");
            return (Criteria) this;
        }

        public Criteria andFounderNameGreaterThan(String value) {
            addCriterion("founder_name >", value, "founderName");
            return (Criteria) this;
        }

        public Criteria andFounderNameGreaterThanOrEqualTo(String value) {
            addCriterion("founder_name >=", value, "founderName");
            return (Criteria) this;
        }

        public Criteria andFounderNameLessThan(String value) {
            addCriterion("founder_name <", value, "founderName");
            return (Criteria) this;
        }

        public Criteria andFounderNameLessThanOrEqualTo(String value) {
            addCriterion("founder_name <=", value, "founderName");
            return (Criteria) this;
        }

        public Criteria andFounderNameLike(String value) {
            addCriterion("founder_name like", value, "founderName");
            return (Criteria) this;
        }

        public Criteria andFounderNameNotLike(String value) {
            addCriterion("founder_name not like", value, "founderName");
            return (Criteria) this;
        }

        public Criteria andFounderNameIn(List<String> values) {
            addCriterion("founder_name in", values, "founderName");
            return (Criteria) this;
        }

        public Criteria andFounderNameNotIn(List<String> values) {
            addCriterion("founder_name not in", values, "founderName");
            return (Criteria) this;
        }

        public Criteria andFounderNameBetween(String value1, String value2) {
            addCriterion("founder_name between", value1, value2, "founderName");
            return (Criteria) this;
        }

        public Criteria andFounderNameNotBetween(String value1, String value2) {
            addCriterion("founder_name not between", value1, value2, "founderName");
            return (Criteria) this;
        }

        public Criteria andLosePhoneIsNull() {
            addCriterion("lose_phone is null");
            return (Criteria) this;
        }

        public Criteria andLosePhoneIsNotNull() {
            addCriterion("lose_phone is not null");
            return (Criteria) this;
        }

        public Criteria andLosePhoneEqualTo(String value) {
            addCriterion("lose_phone =", value, "losePhone");
            return (Criteria) this;
        }

        public Criteria andLosePhoneNotEqualTo(String value) {
            addCriterion("lose_phone <>", value, "losePhone");
            return (Criteria) this;
        }

        public Criteria andLosePhoneGreaterThan(String value) {
            addCriterion("lose_phone >", value, "losePhone");
            return (Criteria) this;
        }

        public Criteria andLosePhoneGreaterThanOrEqualTo(String value) {
            addCriterion("lose_phone >=", value, "losePhone");
            return (Criteria) this;
        }

        public Criteria andLosePhoneLessThan(String value) {
            addCriterion("lose_phone <", value, "losePhone");
            return (Criteria) this;
        }

        public Criteria andLosePhoneLessThanOrEqualTo(String value) {
            addCriterion("lose_phone <=", value, "losePhone");
            return (Criteria) this;
        }

        public Criteria andLosePhoneLike(String value) {
            addCriterion("lose_phone like", value, "losePhone");
            return (Criteria) this;
        }

        public Criteria andLosePhoneNotLike(String value) {
            addCriterion("lose_phone not like", value, "losePhone");
            return (Criteria) this;
        }

        public Criteria andLosePhoneIn(List<String> values) {
            addCriterion("lose_phone in", values, "losePhone");
            return (Criteria) this;
        }

        public Criteria andLosePhoneNotIn(List<String> values) {
            addCriterion("lose_phone not in", values, "losePhone");
            return (Criteria) this;
        }

        public Criteria andLosePhoneBetween(String value1, String value2) {
            addCriterion("lose_phone between", value1, value2, "losePhone");
            return (Criteria) this;
        }

        public Criteria andLosePhoneNotBetween(String value1, String value2) {
            addCriterion("lose_phone not between", value1, value2, "losePhone");
            return (Criteria) this;
        }

        public Criteria andFounderPhoneIsNull() {
            addCriterion("founder_phone is null");
            return (Criteria) this;
        }

        public Criteria andFounderPhoneIsNotNull() {
            addCriterion("founder_phone is not null");
            return (Criteria) this;
        }

        public Criteria andFounderPhoneEqualTo(String value) {
            addCriterion("founder_phone =", value, "founderPhone");
            return (Criteria) this;
        }

        public Criteria andFounderPhoneNotEqualTo(String value) {
            addCriterion("founder_phone <>", value, "founderPhone");
            return (Criteria) this;
        }

        public Criteria andFounderPhoneGreaterThan(String value) {
            addCriterion("founder_phone >", value, "founderPhone");
            return (Criteria) this;
        }

        public Criteria andFounderPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("founder_phone >=", value, "founderPhone");
            return (Criteria) this;
        }

        public Criteria andFounderPhoneLessThan(String value) {
            addCriterion("founder_phone <", value, "founderPhone");
            return (Criteria) this;
        }

        public Criteria andFounderPhoneLessThanOrEqualTo(String value) {
            addCriterion("founder_phone <=", value, "founderPhone");
            return (Criteria) this;
        }

        public Criteria andFounderPhoneLike(String value) {
            addCriterion("founder_phone like", value, "founderPhone");
            return (Criteria) this;
        }

        public Criteria andFounderPhoneNotLike(String value) {
            addCriterion("founder_phone not like", value, "founderPhone");
            return (Criteria) this;
        }

        public Criteria andFounderPhoneIn(List<String> values) {
            addCriterion("founder_phone in", values, "founderPhone");
            return (Criteria) this;
        }

        public Criteria andFounderPhoneNotIn(List<String> values) {
            addCriterion("founder_phone not in", values, "founderPhone");
            return (Criteria) this;
        }

        public Criteria andFounderPhoneBetween(String value1, String value2) {
            addCriterion("founder_phone between", value1, value2, "founderPhone");
            return (Criteria) this;
        }

        public Criteria andFounderPhoneNotBetween(String value1, String value2) {
            addCriterion("founder_phone not between", value1, value2, "founderPhone");
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