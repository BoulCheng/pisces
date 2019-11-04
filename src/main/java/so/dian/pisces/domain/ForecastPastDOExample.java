package so.dian.pisces.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ForecastPastDOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ForecastPastDOExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andSource_idIsNull() {
            addCriterion("source_id is null");
            return (Criteria) this;
        }

        public Criteria andSource_idIsNotNull() {
            addCriterion("source_id is not null");
            return (Criteria) this;
        }

        public Criteria andSource_idEqualTo(Integer value) {
            addCriterion("source_id =", value, "source_id");
            return (Criteria) this;
        }

        public Criteria andSource_idNotEqualTo(Integer value) {
            addCriterion("source_id <>", value, "source_id");
            return (Criteria) this;
        }

        public Criteria andSource_idGreaterThan(Integer value) {
            addCriterion("source_id >", value, "source_id");
            return (Criteria) this;
        }

        public Criteria andSource_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("source_id >=", value, "source_id");
            return (Criteria) this;
        }

        public Criteria andSource_idLessThan(Integer value) {
            addCriterion("source_id <", value, "source_id");
            return (Criteria) this;
        }

        public Criteria andSource_idLessThanOrEqualTo(Integer value) {
            addCriterion("source_id <=", value, "source_id");
            return (Criteria) this;
        }

        public Criteria andSource_idIn(List<Integer> values) {
            addCriterion("source_id in", values, "source_id");
            return (Criteria) this;
        }

        public Criteria andSource_idNotIn(List<Integer> values) {
            addCriterion("source_id not in", values, "source_id");
            return (Criteria) this;
        }

        public Criteria andSource_idBetween(Integer value1, Integer value2) {
            addCriterion("source_id between", value1, value2, "source_id");
            return (Criteria) this;
        }

        public Criteria andSource_idNotBetween(Integer value1, Integer value2) {
            addCriterion("source_id not between", value1, value2, "source_id");
            return (Criteria) this;
        }

        public Criteria andShop_idIsNull() {
            addCriterion("shop_id is null");
            return (Criteria) this;
        }

        public Criteria andShop_idIsNotNull() {
            addCriterion("shop_id is not null");
            return (Criteria) this;
        }

        public Criteria andShop_idEqualTo(Integer value) {
            addCriterion("shop_id =", value, "shop_id");
            return (Criteria) this;
        }

        public Criteria andShop_idNotEqualTo(Integer value) {
            addCriterion("shop_id <>", value, "shop_id");
            return (Criteria) this;
        }

        public Criteria andShop_idGreaterThan(Integer value) {
            addCriterion("shop_id >", value, "shop_id");
            return (Criteria) this;
        }

        public Criteria andShop_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("shop_id >=", value, "shop_id");
            return (Criteria) this;
        }

        public Criteria andShop_idLessThan(Integer value) {
            addCriterion("shop_id <", value, "shop_id");
            return (Criteria) this;
        }

        public Criteria andShop_idLessThanOrEqualTo(Integer value) {
            addCriterion("shop_id <=", value, "shop_id");
            return (Criteria) this;
        }

        public Criteria andShop_idIn(List<Integer> values) {
            addCriterion("shop_id in", values, "shop_id");
            return (Criteria) this;
        }

        public Criteria andShop_idNotIn(List<Integer> values) {
            addCriterion("shop_id not in", values, "shop_id");
            return (Criteria) this;
        }

        public Criteria andShop_idBetween(Integer value1, Integer value2) {
            addCriterion("shop_id between", value1, value2, "shop_id");
            return (Criteria) this;
        }

        public Criteria andShop_idNotBetween(Integer value1, Integer value2) {
            addCriterion("shop_id not between", value1, value2, "shop_id");
            return (Criteria) this;
        }

        public Criteria andBiz_dateIsNull() {
            addCriterion("biz_date is null");
            return (Criteria) this;
        }

        public Criteria andBiz_dateIsNotNull() {
            addCriterion("biz_date is not null");
            return (Criteria) this;
        }

        public Criteria andBiz_dateEqualTo(String value) {
            addCriterion("biz_date =", value, "biz_date");
            return (Criteria) this;
        }

        public Criteria andBiz_dateNotEqualTo(String value) {
            addCriterion("biz_date <>", value, "biz_date");
            return (Criteria) this;
        }

        public Criteria andBiz_dateGreaterThan(String value) {
            addCriterion("biz_date >", value, "biz_date");
            return (Criteria) this;
        }

        public Criteria andBiz_dateGreaterThanOrEqualTo(String value) {
            addCriterion("biz_date >=", value, "biz_date");
            return (Criteria) this;
        }

        public Criteria andBiz_dateLessThan(String value) {
            addCriterion("biz_date <", value, "biz_date");
            return (Criteria) this;
        }

        public Criteria andBiz_dateLessThanOrEqualTo(String value) {
            addCriterion("biz_date <=", value, "biz_date");
            return (Criteria) this;
        }

        public Criteria andBiz_dateLike(String value) {
            addCriterion("biz_date like", value, "biz_date");
            return (Criteria) this;
        }

        public Criteria andBiz_dateNotLike(String value) {
            addCriterion("biz_date not like", value, "biz_date");
            return (Criteria) this;
        }

        public Criteria andBiz_dateIn(List<String> values) {
            addCriterion("biz_date in", values, "biz_date");
            return (Criteria) this;
        }

        public Criteria andBiz_dateNotIn(List<String> values) {
            addCriterion("biz_date not in", values, "biz_date");
            return (Criteria) this;
        }

        public Criteria andBiz_dateBetween(String value1, String value2) {
            addCriterion("biz_date between", value1, value2, "biz_date");
            return (Criteria) this;
        }

        public Criteria andBiz_dateNotBetween(String value1, String value2) {
            addCriterion("biz_date not between", value1, value2, "biz_date");
            return (Criteria) this;
        }

        public Criteria andPay_orders_originalIsNull() {
            addCriterion("pay_orders_original is null");
            return (Criteria) this;
        }

        public Criteria andPay_orders_originalIsNotNull() {
            addCriterion("pay_orders_original is not null");
            return (Criteria) this;
        }

        public Criteria andPay_orders_originalEqualTo(Integer value) {
            addCriterion("pay_orders_original =", value, "pay_orders_original");
            return (Criteria) this;
        }

        public Criteria andPay_orders_originalNotEqualTo(Integer value) {
            addCriterion("pay_orders_original <>", value, "pay_orders_original");
            return (Criteria) this;
        }

        public Criteria andPay_orders_originalGreaterThan(Integer value) {
            addCriterion("pay_orders_original >", value, "pay_orders_original");
            return (Criteria) this;
        }

        public Criteria andPay_orders_originalGreaterThanOrEqualTo(Integer value) {
            addCriterion("pay_orders_original >=", value, "pay_orders_original");
            return (Criteria) this;
        }

        public Criteria andPay_orders_originalLessThan(Integer value) {
            addCriterion("pay_orders_original <", value, "pay_orders_original");
            return (Criteria) this;
        }

        public Criteria andPay_orders_originalLessThanOrEqualTo(Integer value) {
            addCriterion("pay_orders_original <=", value, "pay_orders_original");
            return (Criteria) this;
        }

        public Criteria andPay_orders_originalIn(List<Integer> values) {
            addCriterion("pay_orders_original in", values, "pay_orders_original");
            return (Criteria) this;
        }

        public Criteria andPay_orders_originalNotIn(List<Integer> values) {
            addCriterion("pay_orders_original not in", values, "pay_orders_original");
            return (Criteria) this;
        }

        public Criteria andPay_orders_originalBetween(Integer value1, Integer value2) {
            addCriterion("pay_orders_original between", value1, value2, "pay_orders_original");
            return (Criteria) this;
        }

        public Criteria andPay_orders_originalNotBetween(Integer value1, Integer value2) {
            addCriterion("pay_orders_original not between", value1, value2, "pay_orders_original");
            return (Criteria) this;
        }

        public Criteria andPay_orders_forecastIsNull() {
            addCriterion("pay_orders_forecast is null");
            return (Criteria) this;
        }

        public Criteria andPay_orders_forecastIsNotNull() {
            addCriterion("pay_orders_forecast is not null");
            return (Criteria) this;
        }

        public Criteria andPay_orders_forecastEqualTo(Double value) {
            addCriterion("pay_orders_forecast =", value, "pay_orders_forecast");
            return (Criteria) this;
        }

        public Criteria andPay_orders_forecastNotEqualTo(Double value) {
            addCriterion("pay_orders_forecast <>", value, "pay_orders_forecast");
            return (Criteria) this;
        }

        public Criteria andPay_orders_forecastGreaterThan(Double value) {
            addCriterion("pay_orders_forecast >", value, "pay_orders_forecast");
            return (Criteria) this;
        }

        public Criteria andPay_orders_forecastGreaterThanOrEqualTo(Double value) {
            addCriterion("pay_orders_forecast >=", value, "pay_orders_forecast");
            return (Criteria) this;
        }

        public Criteria andPay_orders_forecastLessThan(Double value) {
            addCriterion("pay_orders_forecast <", value, "pay_orders_forecast");
            return (Criteria) this;
        }

        public Criteria andPay_orders_forecastLessThanOrEqualTo(Double value) {
            addCriterion("pay_orders_forecast <=", value, "pay_orders_forecast");
            return (Criteria) this;
        }

        public Criteria andPay_orders_forecastIn(List<Double> values) {
            addCriterion("pay_orders_forecast in", values, "pay_orders_forecast");
            return (Criteria) this;
        }

        public Criteria andPay_orders_forecastNotIn(List<Double> values) {
            addCriterion("pay_orders_forecast not in", values, "pay_orders_forecast");
            return (Criteria) this;
        }

        public Criteria andPay_orders_forecastBetween(Double value1, Double value2) {
            addCriterion("pay_orders_forecast between", value1, value2, "pay_orders_forecast");
            return (Criteria) this;
        }

        public Criteria andPay_orders_forecastNotBetween(Double value1, Double value2) {
            addCriterion("pay_orders_forecast not between", value1, value2, "pay_orders_forecast");
            return (Criteria) this;
        }

        public Criteria andStatuIsNull() {
            addCriterion("statu is null");
            return (Criteria) this;
        }

        public Criteria andStatuIsNotNull() {
            addCriterion("statu is not null");
            return (Criteria) this;
        }

        public Criteria andStatuEqualTo(Integer value) {
            addCriterion("statu =", value, "statu");
            return (Criteria) this;
        }

        public Criteria andStatuNotEqualTo(Integer value) {
            addCriterion("statu <>", value, "statu");
            return (Criteria) this;
        }

        public Criteria andStatuGreaterThan(Integer value) {
            addCriterion("statu >", value, "statu");
            return (Criteria) this;
        }

        public Criteria andStatuGreaterThanOrEqualTo(Integer value) {
            addCriterion("statu >=", value, "statu");
            return (Criteria) this;
        }

        public Criteria andStatuLessThan(Integer value) {
            addCriterion("statu <", value, "statu");
            return (Criteria) this;
        }

        public Criteria andStatuLessThanOrEqualTo(Integer value) {
            addCriterion("statu <=", value, "statu");
            return (Criteria) this;
        }

        public Criteria andStatuIn(List<Integer> values) {
            addCriterion("statu in", values, "statu");
            return (Criteria) this;
        }

        public Criteria andStatuNotIn(List<Integer> values) {
            addCriterion("statu not in", values, "statu");
            return (Criteria) this;
        }

        public Criteria andStatuBetween(Integer value1, Integer value2) {
            addCriterion("statu between", value1, value2, "statu");
            return (Criteria) this;
        }

        public Criteria andStatuNotBetween(Integer value1, Integer value2) {
            addCriterion("statu not between", value1, value2, "statu");
            return (Criteria) this;
        }

        public Criteria andCreate_timeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreate_timeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreate_timeEqualTo(Date value) {
            addCriterion("create_time =", value, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeGreaterThan(Date value) {
            addCriterion("create_time >", value, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeLessThan(Date value) {
            addCriterion("create_time <", value, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeIn(List<Date> values) {
            addCriterion("create_time in", values, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "create_time");
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