package so.dian.pisces.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ForecastShopDayDOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ForecastShopDayDOExample() {
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

        public Criteria andPoi_longitudeIsNull() {
            addCriterion("poi_longitude is null");
            return (Criteria) this;
        }

        public Criteria andPoi_longitudeIsNotNull() {
            addCriterion("poi_longitude is not null");
            return (Criteria) this;
        }

        public Criteria andPoi_longitudeEqualTo(Double value) {
            addCriterion("poi_longitude =", value, "poi_longitude");
            return (Criteria) this;
        }

        public Criteria andPoi_longitudeNotEqualTo(Double value) {
            addCriterion("poi_longitude <>", value, "poi_longitude");
            return (Criteria) this;
        }

        public Criteria andPoi_longitudeGreaterThan(Double value) {
            addCriterion("poi_longitude >", value, "poi_longitude");
            return (Criteria) this;
        }

        public Criteria andPoi_longitudeGreaterThanOrEqualTo(Double value) {
            addCriterion("poi_longitude >=", value, "poi_longitude");
            return (Criteria) this;
        }

        public Criteria andPoi_longitudeLessThan(Double value) {
            addCriterion("poi_longitude <", value, "poi_longitude");
            return (Criteria) this;
        }

        public Criteria andPoi_longitudeLessThanOrEqualTo(Double value) {
            addCriterion("poi_longitude <=", value, "poi_longitude");
            return (Criteria) this;
        }

        public Criteria andPoi_longitudeIn(List<Double> values) {
            addCriterion("poi_longitude in", values, "poi_longitude");
            return (Criteria) this;
        }

        public Criteria andPoi_longitudeNotIn(List<Double> values) {
            addCriterion("poi_longitude not in", values, "poi_longitude");
            return (Criteria) this;
        }

        public Criteria andPoi_longitudeBetween(Double value1, Double value2) {
            addCriterion("poi_longitude between", value1, value2, "poi_longitude");
            return (Criteria) this;
        }

        public Criteria andPoi_longitudeNotBetween(Double value1, Double value2) {
            addCriterion("poi_longitude not between", value1, value2, "poi_longitude");
            return (Criteria) this;
        }

        public Criteria andPoi_latitudeIsNull() {
            addCriterion("poi_latitude is null");
            return (Criteria) this;
        }

        public Criteria andPoi_latitudeIsNotNull() {
            addCriterion("poi_latitude is not null");
            return (Criteria) this;
        }

        public Criteria andPoi_latitudeEqualTo(Double value) {
            addCriterion("poi_latitude =", value, "poi_latitude");
            return (Criteria) this;
        }

        public Criteria andPoi_latitudeNotEqualTo(Double value) {
            addCriterion("poi_latitude <>", value, "poi_latitude");
            return (Criteria) this;
        }

        public Criteria andPoi_latitudeGreaterThan(Double value) {
            addCriterion("poi_latitude >", value, "poi_latitude");
            return (Criteria) this;
        }

        public Criteria andPoi_latitudeGreaterThanOrEqualTo(Double value) {
            addCriterion("poi_latitude >=", value, "poi_latitude");
            return (Criteria) this;
        }

        public Criteria andPoi_latitudeLessThan(Double value) {
            addCriterion("poi_latitude <", value, "poi_latitude");
            return (Criteria) this;
        }

        public Criteria andPoi_latitudeLessThanOrEqualTo(Double value) {
            addCriterion("poi_latitude <=", value, "poi_latitude");
            return (Criteria) this;
        }

        public Criteria andPoi_latitudeIn(List<Double> values) {
            addCriterion("poi_latitude in", values, "poi_latitude");
            return (Criteria) this;
        }

        public Criteria andPoi_latitudeNotIn(List<Double> values) {
            addCriterion("poi_latitude not in", values, "poi_latitude");
            return (Criteria) this;
        }

        public Criteria andPoi_latitudeBetween(Double value1, Double value2) {
            addCriterion("poi_latitude between", value1, value2, "poi_latitude");
            return (Criteria) this;
        }

        public Criteria andPoi_latitudeNotBetween(Double value1, Double value2) {
            addCriterion("poi_latitude not between", value1, value2, "poi_latitude");
            return (Criteria) this;
        }

        public Criteria andDistrictIsNull() {
            addCriterion("district is null");
            return (Criteria) this;
        }

        public Criteria andDistrictIsNotNull() {
            addCriterion("district is not null");
            return (Criteria) this;
        }

        public Criteria andDistrictEqualTo(String value) {
            addCriterion("district =", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictNotEqualTo(String value) {
            addCriterion("district <>", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictGreaterThan(String value) {
            addCriterion("district >", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictGreaterThanOrEqualTo(String value) {
            addCriterion("district >=", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictLessThan(String value) {
            addCriterion("district <", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictLessThanOrEqualTo(String value) {
            addCriterion("district <=", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictLike(String value) {
            addCriterion("district like", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictNotLike(String value) {
            addCriterion("district not like", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictIn(List<String> values) {
            addCriterion("district in", values, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictNotIn(List<String> values) {
            addCriterion("district not in", values, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictBetween(String value1, String value2) {
            addCriterion("district between", value1, value2, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictNotBetween(String value1, String value2) {
            addCriterion("district not between", value1, value2, "district");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNull() {
            addCriterion("province is null");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNotNull() {
            addCriterion("province is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceEqualTo(String value) {
            addCriterion("province =", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotEqualTo(String value) {
            addCriterion("province <>", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThan(String value) {
            addCriterion("province >", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("province >=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThan(String value) {
            addCriterion("province <", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThanOrEqualTo(String value) {
            addCriterion("province <=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLike(String value) {
            addCriterion("province like", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotLike(String value) {
            addCriterion("province not like", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceIn(List<String> values) {
            addCriterion("province in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotIn(List<String> values) {
            addCriterion("province not in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceBetween(String value1, String value2) {
            addCriterion("province between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotBetween(String value1, String value2) {
            addCriterion("province not between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andCity_nameIsNull() {
            addCriterion("city_name is null");
            return (Criteria) this;
        }

        public Criteria andCity_nameIsNotNull() {
            addCriterion("city_name is not null");
            return (Criteria) this;
        }

        public Criteria andCity_nameEqualTo(String value) {
            addCriterion("city_name =", value, "city_name");
            return (Criteria) this;
        }

        public Criteria andCity_nameNotEqualTo(String value) {
            addCriterion("city_name <>", value, "city_name");
            return (Criteria) this;
        }

        public Criteria andCity_nameGreaterThan(String value) {
            addCriterion("city_name >", value, "city_name");
            return (Criteria) this;
        }

        public Criteria andCity_nameGreaterThanOrEqualTo(String value) {
            addCriterion("city_name >=", value, "city_name");
            return (Criteria) this;
        }

        public Criteria andCity_nameLessThan(String value) {
            addCriterion("city_name <", value, "city_name");
            return (Criteria) this;
        }

        public Criteria andCity_nameLessThanOrEqualTo(String value) {
            addCriterion("city_name <=", value, "city_name");
            return (Criteria) this;
        }

        public Criteria andCity_nameLike(String value) {
            addCriterion("city_name like", value, "city_name");
            return (Criteria) this;
        }

        public Criteria andCity_nameNotLike(String value) {
            addCriterion("city_name not like", value, "city_name");
            return (Criteria) this;
        }

        public Criteria andCity_nameIn(List<String> values) {
            addCriterion("city_name in", values, "city_name");
            return (Criteria) this;
        }

        public Criteria andCity_nameNotIn(List<String> values) {
            addCriterion("city_name not in", values, "city_name");
            return (Criteria) this;
        }

        public Criteria andCity_nameBetween(String value1, String value2) {
            addCriterion("city_name between", value1, value2, "city_name");
            return (Criteria) this;
        }

        public Criteria andCity_nameNotBetween(String value1, String value2) {
            addCriterion("city_name not between", value1, value2, "city_name");
            return (Criteria) this;
        }

        public Criteria andParent_type_nameIsNull() {
            addCriterion("parent_type_name is null");
            return (Criteria) this;
        }

        public Criteria andParent_type_nameIsNotNull() {
            addCriterion("parent_type_name is not null");
            return (Criteria) this;
        }

        public Criteria andParent_type_nameEqualTo(String value) {
            addCriterion("parent_type_name =", value, "parent_type_name");
            return (Criteria) this;
        }

        public Criteria andParent_type_nameNotEqualTo(String value) {
            addCriterion("parent_type_name <>", value, "parent_type_name");
            return (Criteria) this;
        }

        public Criteria andParent_type_nameGreaterThan(String value) {
            addCriterion("parent_type_name >", value, "parent_type_name");
            return (Criteria) this;
        }

        public Criteria andParent_type_nameGreaterThanOrEqualTo(String value) {
            addCriterion("parent_type_name >=", value, "parent_type_name");
            return (Criteria) this;
        }

        public Criteria andParent_type_nameLessThan(String value) {
            addCriterion("parent_type_name <", value, "parent_type_name");
            return (Criteria) this;
        }

        public Criteria andParent_type_nameLessThanOrEqualTo(String value) {
            addCriterion("parent_type_name <=", value, "parent_type_name");
            return (Criteria) this;
        }

        public Criteria andParent_type_nameLike(String value) {
            addCriterion("parent_type_name like", value, "parent_type_name");
            return (Criteria) this;
        }

        public Criteria andParent_type_nameNotLike(String value) {
            addCriterion("parent_type_name not like", value, "parent_type_name");
            return (Criteria) this;
        }

        public Criteria andParent_type_nameIn(List<String> values) {
            addCriterion("parent_type_name in", values, "parent_type_name");
            return (Criteria) this;
        }

        public Criteria andParent_type_nameNotIn(List<String> values) {
            addCriterion("parent_type_name not in", values, "parent_type_name");
            return (Criteria) this;
        }

        public Criteria andParent_type_nameBetween(String value1, String value2) {
            addCriterion("parent_type_name between", value1, value2, "parent_type_name");
            return (Criteria) this;
        }

        public Criteria andParent_type_nameNotBetween(String value1, String value2) {
            addCriterion("parent_type_name not between", value1, value2, "parent_type_name");
            return (Criteria) this;
        }

        public Criteria andType_nameIsNull() {
            addCriterion("type_name is null");
            return (Criteria) this;
        }

        public Criteria andType_nameIsNotNull() {
            addCriterion("type_name is not null");
            return (Criteria) this;
        }

        public Criteria andType_nameEqualTo(String value) {
            addCriterion("type_name =", value, "type_name");
            return (Criteria) this;
        }

        public Criteria andType_nameNotEqualTo(String value) {
            addCriterion("type_name <>", value, "type_name");
            return (Criteria) this;
        }

        public Criteria andType_nameGreaterThan(String value) {
            addCriterion("type_name >", value, "type_name");
            return (Criteria) this;
        }

        public Criteria andType_nameGreaterThanOrEqualTo(String value) {
            addCriterion("type_name >=", value, "type_name");
            return (Criteria) this;
        }

        public Criteria andType_nameLessThan(String value) {
            addCriterion("type_name <", value, "type_name");
            return (Criteria) this;
        }

        public Criteria andType_nameLessThanOrEqualTo(String value) {
            addCriterion("type_name <=", value, "type_name");
            return (Criteria) this;
        }

        public Criteria andType_nameLike(String value) {
            addCriterion("type_name like", value, "type_name");
            return (Criteria) this;
        }

        public Criteria andType_nameNotLike(String value) {
            addCriterion("type_name not like", value, "type_name");
            return (Criteria) this;
        }

        public Criteria andType_nameIn(List<String> values) {
            addCriterion("type_name in", values, "type_name");
            return (Criteria) this;
        }

        public Criteria andType_nameNotIn(List<String> values) {
            addCriterion("type_name not in", values, "type_name");
            return (Criteria) this;
        }

        public Criteria andType_nameBetween(String value1, String value2) {
            addCriterion("type_name between", value1, value2, "type_name");
            return (Criteria) this;
        }

        public Criteria andType_nameNotBetween(String value1, String value2) {
            addCriterion("type_name not between", value1, value2, "type_name");
            return (Criteria) this;
        }

        public Criteria andBox_priceIsNull() {
            addCriterion("box_price is null");
            return (Criteria) this;
        }

        public Criteria andBox_priceIsNotNull() {
            addCriterion("box_price is not null");
            return (Criteria) this;
        }

        public Criteria andBox_priceEqualTo(BigDecimal value) {
            addCriterion("box_price =", value, "box_price");
            return (Criteria) this;
        }

        public Criteria andBox_priceNotEqualTo(BigDecimal value) {
            addCriterion("box_price <>", value, "box_price");
            return (Criteria) this;
        }

        public Criteria andBox_priceGreaterThan(BigDecimal value) {
            addCriterion("box_price >", value, "box_price");
            return (Criteria) this;
        }

        public Criteria andBox_priceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("box_price >=", value, "box_price");
            return (Criteria) this;
        }

        public Criteria andBox_priceLessThan(BigDecimal value) {
            addCriterion("box_price <", value, "box_price");
            return (Criteria) this;
        }

        public Criteria andBox_priceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("box_price <=", value, "box_price");
            return (Criteria) this;
        }

        public Criteria andBox_priceIn(List<BigDecimal> values) {
            addCriterion("box_price in", values, "box_price");
            return (Criteria) this;
        }

        public Criteria andBox_priceNotIn(List<BigDecimal> values) {
            addCriterion("box_price not in", values, "box_price");
            return (Criteria) this;
        }

        public Criteria andBox_priceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("box_price between", value1, value2, "box_price");
            return (Criteria) this;
        }

        public Criteria andBox_priceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("box_price not between", value1, value2, "box_price");
            return (Criteria) this;
        }

        public Criteria andShop_levelIsNull() {
            addCriterion("shop_level is null");
            return (Criteria) this;
        }

        public Criteria andShop_levelIsNotNull() {
            addCriterion("shop_level is not null");
            return (Criteria) this;
        }

        public Criteria andShop_levelEqualTo(String value) {
            addCriterion("shop_level =", value, "shop_level");
            return (Criteria) this;
        }

        public Criteria andShop_levelNotEqualTo(String value) {
            addCriterion("shop_level <>", value, "shop_level");
            return (Criteria) this;
        }

        public Criteria andShop_levelGreaterThan(String value) {
            addCriterion("shop_level >", value, "shop_level");
            return (Criteria) this;
        }

        public Criteria andShop_levelGreaterThanOrEqualTo(String value) {
            addCriterion("shop_level >=", value, "shop_level");
            return (Criteria) this;
        }

        public Criteria andShop_levelLessThan(String value) {
            addCriterion("shop_level <", value, "shop_level");
            return (Criteria) this;
        }

        public Criteria andShop_levelLessThanOrEqualTo(String value) {
            addCriterion("shop_level <=", value, "shop_level");
            return (Criteria) this;
        }

        public Criteria andShop_levelLike(String value) {
            addCriterion("shop_level like", value, "shop_level");
            return (Criteria) this;
        }

        public Criteria andShop_levelNotLike(String value) {
            addCriterion("shop_level not like", value, "shop_level");
            return (Criteria) this;
        }

        public Criteria andShop_levelIn(List<String> values) {
            addCriterion("shop_level in", values, "shop_level");
            return (Criteria) this;
        }

        public Criteria andShop_levelNotIn(List<String> values) {
            addCriterion("shop_level not in", values, "shop_level");
            return (Criteria) this;
        }

        public Criteria andShop_levelBetween(String value1, String value2) {
            addCriterion("shop_level between", value1, value2, "shop_level");
            return (Criteria) this;
        }

        public Criteria andShop_levelNotBetween(String value1, String value2) {
            addCriterion("shop_level not between", value1, value2, "shop_level");
            return (Criteria) this;
        }

        public Criteria andTotal_online_timeIsNull() {
            addCriterion("total_online_time is null");
            return (Criteria) this;
        }

        public Criteria andTotal_online_timeIsNotNull() {
            addCriterion("total_online_time is not null");
            return (Criteria) this;
        }

        public Criteria andTotal_online_timeEqualTo(Integer value) {
            addCriterion("total_online_time =", value, "total_online_time");
            return (Criteria) this;
        }

        public Criteria andTotal_online_timeNotEqualTo(Integer value) {
            addCriterion("total_online_time <>", value, "total_online_time");
            return (Criteria) this;
        }

        public Criteria andTotal_online_timeGreaterThan(Integer value) {
            addCriterion("total_online_time >", value, "total_online_time");
            return (Criteria) this;
        }

        public Criteria andTotal_online_timeGreaterThanOrEqualTo(Integer value) {
            addCriterion("total_online_time >=", value, "total_online_time");
            return (Criteria) this;
        }

        public Criteria andTotal_online_timeLessThan(Integer value) {
            addCriterion("total_online_time <", value, "total_online_time");
            return (Criteria) this;
        }

        public Criteria andTotal_online_timeLessThanOrEqualTo(Integer value) {
            addCriterion("total_online_time <=", value, "total_online_time");
            return (Criteria) this;
        }

        public Criteria andTotal_online_timeIn(List<Integer> values) {
            addCriterion("total_online_time in", values, "total_online_time");
            return (Criteria) this;
        }

        public Criteria andTotal_online_timeNotIn(List<Integer> values) {
            addCriterion("total_online_time not in", values, "total_online_time");
            return (Criteria) this;
        }

        public Criteria andTotal_online_timeBetween(Integer value1, Integer value2) {
            addCriterion("total_online_time between", value1, value2, "total_online_time");
            return (Criteria) this;
        }

        public Criteria andTotal_online_timeNotBetween(Integer value1, Integer value2) {
            addCriterion("total_online_time not between", value1, value2, "total_online_time");
            return (Criteria) this;
        }

        public Criteria andDevice_numIsNull() {
            addCriterion("device_num is null");
            return (Criteria) this;
        }

        public Criteria andDevice_numIsNotNull() {
            addCriterion("device_num is not null");
            return (Criteria) this;
        }

        public Criteria andDevice_numEqualTo(Integer value) {
            addCriterion("device_num =", value, "device_num");
            return (Criteria) this;
        }

        public Criteria andDevice_numNotEqualTo(Integer value) {
            addCriterion("device_num <>", value, "device_num");
            return (Criteria) this;
        }

        public Criteria andDevice_numGreaterThan(Integer value) {
            addCriterion("device_num >", value, "device_num");
            return (Criteria) this;
        }

        public Criteria andDevice_numGreaterThanOrEqualTo(Integer value) {
            addCriterion("device_num >=", value, "device_num");
            return (Criteria) this;
        }

        public Criteria andDevice_numLessThan(Integer value) {
            addCriterion("device_num <", value, "device_num");
            return (Criteria) this;
        }

        public Criteria andDevice_numLessThanOrEqualTo(Integer value) {
            addCriterion("device_num <=", value, "device_num");
            return (Criteria) this;
        }

        public Criteria andDevice_numIn(List<Integer> values) {
            addCriterion("device_num in", values, "device_num");
            return (Criteria) this;
        }

        public Criteria andDevice_numNotIn(List<Integer> values) {
            addCriterion("device_num not in", values, "device_num");
            return (Criteria) this;
        }

        public Criteria andDevice_numBetween(Integer value1, Integer value2) {
            addCriterion("device_num between", value1, value2, "device_num");
            return (Criteria) this;
        }

        public Criteria andDevice_numNotBetween(Integer value1, Integer value2) {
            addCriterion("device_num not between", value1, value2, "device_num");
            return (Criteria) this;
        }

        public Criteria andTotal_slot_numIsNull() {
            addCriterion("total_slot_num is null");
            return (Criteria) this;
        }

        public Criteria andTotal_slot_numIsNotNull() {
            addCriterion("total_slot_num is not null");
            return (Criteria) this;
        }

        public Criteria andTotal_slot_numEqualTo(Integer value) {
            addCriterion("total_slot_num =", value, "total_slot_num");
            return (Criteria) this;
        }

        public Criteria andTotal_slot_numNotEqualTo(Integer value) {
            addCriterion("total_slot_num <>", value, "total_slot_num");
            return (Criteria) this;
        }

        public Criteria andTotal_slot_numGreaterThan(Integer value) {
            addCriterion("total_slot_num >", value, "total_slot_num");
            return (Criteria) this;
        }

        public Criteria andTotal_slot_numGreaterThanOrEqualTo(Integer value) {
            addCriterion("total_slot_num >=", value, "total_slot_num");
            return (Criteria) this;
        }

        public Criteria andTotal_slot_numLessThan(Integer value) {
            addCriterion("total_slot_num <", value, "total_slot_num");
            return (Criteria) this;
        }

        public Criteria andTotal_slot_numLessThanOrEqualTo(Integer value) {
            addCriterion("total_slot_num <=", value, "total_slot_num");
            return (Criteria) this;
        }

        public Criteria andTotal_slot_numIn(List<Integer> values) {
            addCriterion("total_slot_num in", values, "total_slot_num");
            return (Criteria) this;
        }

        public Criteria andTotal_slot_numNotIn(List<Integer> values) {
            addCriterion("total_slot_num not in", values, "total_slot_num");
            return (Criteria) this;
        }

        public Criteria andTotal_slot_numBetween(Integer value1, Integer value2) {
            addCriterion("total_slot_num between", value1, value2, "total_slot_num");
            return (Criteria) this;
        }

        public Criteria andTotal_slot_numNotBetween(Integer value1, Integer value2) {
            addCriterion("total_slot_num not between", value1, value2, "total_slot_num");
            return (Criteria) this;
        }

        public Criteria andPowerbank_numIsNull() {
            addCriterion("powerbank_num is null");
            return (Criteria) this;
        }

        public Criteria andPowerbank_numIsNotNull() {
            addCriterion("powerbank_num is not null");
            return (Criteria) this;
        }

        public Criteria andPowerbank_numEqualTo(Integer value) {
            addCriterion("powerbank_num =", value, "powerbank_num");
            return (Criteria) this;
        }

        public Criteria andPowerbank_numNotEqualTo(Integer value) {
            addCriterion("powerbank_num <>", value, "powerbank_num");
            return (Criteria) this;
        }

        public Criteria andPowerbank_numGreaterThan(Integer value) {
            addCriterion("powerbank_num >", value, "powerbank_num");
            return (Criteria) this;
        }

        public Criteria andPowerbank_numGreaterThanOrEqualTo(Integer value) {
            addCriterion("powerbank_num >=", value, "powerbank_num");
            return (Criteria) this;
        }

        public Criteria andPowerbank_numLessThan(Integer value) {
            addCriterion("powerbank_num <", value, "powerbank_num");
            return (Criteria) this;
        }

        public Criteria andPowerbank_numLessThanOrEqualTo(Integer value) {
            addCriterion("powerbank_num <=", value, "powerbank_num");
            return (Criteria) this;
        }

        public Criteria andPowerbank_numIn(List<Integer> values) {
            addCriterion("powerbank_num in", values, "powerbank_num");
            return (Criteria) this;
        }

        public Criteria andPowerbank_numNotIn(List<Integer> values) {
            addCriterion("powerbank_num not in", values, "powerbank_num");
            return (Criteria) this;
        }

        public Criteria andPowerbank_numBetween(Integer value1, Integer value2) {
            addCriterion("powerbank_num between", value1, value2, "powerbank_num");
            return (Criteria) this;
        }

        public Criteria andPowerbank_numNotBetween(Integer value1, Integer value2) {
            addCriterion("powerbank_num not between", value1, value2, "powerbank_num");
            return (Criteria) this;
        }

        public Criteria andPay_ordersIsNull() {
            addCriterion("pay_orders is null");
            return (Criteria) this;
        }

        public Criteria andPay_ordersIsNotNull() {
            addCriterion("pay_orders is not null");
            return (Criteria) this;
        }

        public Criteria andPay_ordersEqualTo(Integer value) {
            addCriterion("pay_orders =", value, "pay_orders");
            return (Criteria) this;
        }

        public Criteria andPay_ordersNotEqualTo(Integer value) {
            addCriterion("pay_orders <>", value, "pay_orders");
            return (Criteria) this;
        }

        public Criteria andPay_ordersGreaterThan(Integer value) {
            addCriterion("pay_orders >", value, "pay_orders");
            return (Criteria) this;
        }

        public Criteria andPay_ordersGreaterThanOrEqualTo(Integer value) {
            addCriterion("pay_orders >=", value, "pay_orders");
            return (Criteria) this;
        }

        public Criteria andPay_ordersLessThan(Integer value) {
            addCriterion("pay_orders <", value, "pay_orders");
            return (Criteria) this;
        }

        public Criteria andPay_ordersLessThanOrEqualTo(Integer value) {
            addCriterion("pay_orders <=", value, "pay_orders");
            return (Criteria) this;
        }

        public Criteria andPay_ordersIn(List<Integer> values) {
            addCriterion("pay_orders in", values, "pay_orders");
            return (Criteria) this;
        }

        public Criteria andPay_ordersNotIn(List<Integer> values) {
            addCriterion("pay_orders not in", values, "pay_orders");
            return (Criteria) this;
        }

        public Criteria andPay_ordersBetween(Integer value1, Integer value2) {
            addCriterion("pay_orders between", value1, value2, "pay_orders");
            return (Criteria) this;
        }

        public Criteria andPay_ordersNotBetween(Integer value1, Integer value2) {
            addCriterion("pay_orders not between", value1, value2, "pay_orders");
            return (Criteria) this;
        }

        public Criteria andZero_ordersIsNull() {
            addCriterion("zero_orders is null");
            return (Criteria) this;
        }

        public Criteria andZero_ordersIsNotNull() {
            addCriterion("zero_orders is not null");
            return (Criteria) this;
        }

        public Criteria andZero_ordersEqualTo(Integer value) {
            addCriterion("zero_orders =", value, "zero_orders");
            return (Criteria) this;
        }

        public Criteria andZero_ordersNotEqualTo(Integer value) {
            addCriterion("zero_orders <>", value, "zero_orders");
            return (Criteria) this;
        }

        public Criteria andZero_ordersGreaterThan(Integer value) {
            addCriterion("zero_orders >", value, "zero_orders");
            return (Criteria) this;
        }

        public Criteria andZero_ordersGreaterThanOrEqualTo(Integer value) {
            addCriterion("zero_orders >=", value, "zero_orders");
            return (Criteria) this;
        }

        public Criteria andZero_ordersLessThan(Integer value) {
            addCriterion("zero_orders <", value, "zero_orders");
            return (Criteria) this;
        }

        public Criteria andZero_ordersLessThanOrEqualTo(Integer value) {
            addCriterion("zero_orders <=", value, "zero_orders");
            return (Criteria) this;
        }

        public Criteria andZero_ordersIn(List<Integer> values) {
            addCriterion("zero_orders in", values, "zero_orders");
            return (Criteria) this;
        }

        public Criteria andZero_ordersNotIn(List<Integer> values) {
            addCriterion("zero_orders not in", values, "zero_orders");
            return (Criteria) this;
        }

        public Criteria andZero_ordersBetween(Integer value1, Integer value2) {
            addCriterion("zero_orders between", value1, value2, "zero_orders");
            return (Criteria) this;
        }

        public Criteria andZero_ordersNotBetween(Integer value1, Integer value2) {
            addCriterion("zero_orders not between", value1, value2, "zero_orders");
            return (Criteria) this;
        }

        public Criteria andNinety_ordersIsNull() {
            addCriterion("ninety_orders is null");
            return (Criteria) this;
        }

        public Criteria andNinety_ordersIsNotNull() {
            addCriterion("ninety_orders is not null");
            return (Criteria) this;
        }

        public Criteria andNinety_ordersEqualTo(Integer value) {
            addCriterion("ninety_orders =", value, "ninety_orders");
            return (Criteria) this;
        }

        public Criteria andNinety_ordersNotEqualTo(Integer value) {
            addCriterion("ninety_orders <>", value, "ninety_orders");
            return (Criteria) this;
        }

        public Criteria andNinety_ordersGreaterThan(Integer value) {
            addCriterion("ninety_orders >", value, "ninety_orders");
            return (Criteria) this;
        }

        public Criteria andNinety_ordersGreaterThanOrEqualTo(Integer value) {
            addCriterion("ninety_orders >=", value, "ninety_orders");
            return (Criteria) this;
        }

        public Criteria andNinety_ordersLessThan(Integer value) {
            addCriterion("ninety_orders <", value, "ninety_orders");
            return (Criteria) this;
        }

        public Criteria andNinety_ordersLessThanOrEqualTo(Integer value) {
            addCriterion("ninety_orders <=", value, "ninety_orders");
            return (Criteria) this;
        }

        public Criteria andNinety_ordersIn(List<Integer> values) {
            addCriterion("ninety_orders in", values, "ninety_orders");
            return (Criteria) this;
        }

        public Criteria andNinety_ordersNotIn(List<Integer> values) {
            addCriterion("ninety_orders not in", values, "ninety_orders");
            return (Criteria) this;
        }

        public Criteria andNinety_ordersBetween(Integer value1, Integer value2) {
            addCriterion("ninety_orders between", value1, value2, "ninety_orders");
            return (Criteria) this;
        }

        public Criteria andNinety_ordersNotBetween(Integer value1, Integer value2) {
            addCriterion("ninety_orders not between", value1, value2, "ninety_orders");
            return (Criteria) this;
        }

        public Criteria andPayment_amountIsNull() {
            addCriterion("payment_amount is null");
            return (Criteria) this;
        }

        public Criteria andPayment_amountIsNotNull() {
            addCriterion("payment_amount is not null");
            return (Criteria) this;
        }

        public Criteria andPayment_amountEqualTo(Float value) {
            addCriterion("payment_amount =", value, "payment_amount");
            return (Criteria) this;
        }

        public Criteria andPayment_amountNotEqualTo(Float value) {
            addCriterion("payment_amount <>", value, "payment_amount");
            return (Criteria) this;
        }

        public Criteria andPayment_amountGreaterThan(Float value) {
            addCriterion("payment_amount >", value, "payment_amount");
            return (Criteria) this;
        }

        public Criteria andPayment_amountGreaterThanOrEqualTo(Float value) {
            addCriterion("payment_amount >=", value, "payment_amount");
            return (Criteria) this;
        }

        public Criteria andPayment_amountLessThan(Float value) {
            addCriterion("payment_amount <", value, "payment_amount");
            return (Criteria) this;
        }

        public Criteria andPayment_amountLessThanOrEqualTo(Float value) {
            addCriterion("payment_amount <=", value, "payment_amount");
            return (Criteria) this;
        }

        public Criteria andPayment_amountIn(List<Float> values) {
            addCriterion("payment_amount in", values, "payment_amount");
            return (Criteria) this;
        }

        public Criteria andPayment_amountNotIn(List<Float> values) {
            addCriterion("payment_amount not in", values, "payment_amount");
            return (Criteria) this;
        }

        public Criteria andPayment_amountBetween(Float value1, Float value2) {
            addCriterion("payment_amount between", value1, value2, "payment_amount");
            return (Criteria) this;
        }

        public Criteria andPayment_amountNotBetween(Float value1, Float value2) {
            addCriterion("payment_amount not between", value1, value2, "payment_amount");
            return (Criteria) this;
        }

        public Criteria andRefund_pay_amountIsNull() {
            addCriterion("refund_pay_amount is null");
            return (Criteria) this;
        }

        public Criteria andRefund_pay_amountIsNotNull() {
            addCriterion("refund_pay_amount is not null");
            return (Criteria) this;
        }

        public Criteria andRefund_pay_amountEqualTo(Float value) {
            addCriterion("refund_pay_amount =", value, "refund_pay_amount");
            return (Criteria) this;
        }

        public Criteria andRefund_pay_amountNotEqualTo(Float value) {
            addCriterion("refund_pay_amount <>", value, "refund_pay_amount");
            return (Criteria) this;
        }

        public Criteria andRefund_pay_amountGreaterThan(Float value) {
            addCriterion("refund_pay_amount >", value, "refund_pay_amount");
            return (Criteria) this;
        }

        public Criteria andRefund_pay_amountGreaterThanOrEqualTo(Float value) {
            addCriterion("refund_pay_amount >=", value, "refund_pay_amount");
            return (Criteria) this;
        }

        public Criteria andRefund_pay_amountLessThan(Float value) {
            addCriterion("refund_pay_amount <", value, "refund_pay_amount");
            return (Criteria) this;
        }

        public Criteria andRefund_pay_amountLessThanOrEqualTo(Float value) {
            addCriterion("refund_pay_amount <=", value, "refund_pay_amount");
            return (Criteria) this;
        }

        public Criteria andRefund_pay_amountIn(List<Float> values) {
            addCriterion("refund_pay_amount in", values, "refund_pay_amount");
            return (Criteria) this;
        }

        public Criteria andRefund_pay_amountNotIn(List<Float> values) {
            addCriterion("refund_pay_amount not in", values, "refund_pay_amount");
            return (Criteria) this;
        }

        public Criteria andRefund_pay_amountBetween(Float value1, Float value2) {
            addCriterion("refund_pay_amount between", value1, value2, "refund_pay_amount");
            return (Criteria) this;
        }

        public Criteria andRefund_pay_amountNotBetween(Float value1, Float value2) {
            addCriterion("refund_pay_amount not between", value1, value2, "refund_pay_amount");
            return (Criteria) this;
        }

        public Criteria andAvg_priceIsNull() {
            addCriterion("avg_price is null");
            return (Criteria) this;
        }

        public Criteria andAvg_priceIsNotNull() {
            addCriterion("avg_price is not null");
            return (Criteria) this;
        }

        public Criteria andAvg_priceEqualTo(BigDecimal value) {
            addCriterion("avg_price =", value, "avg_price");
            return (Criteria) this;
        }

        public Criteria andAvg_priceNotEqualTo(BigDecimal value) {
            addCriterion("avg_price <>", value, "avg_price");
            return (Criteria) this;
        }

        public Criteria andAvg_priceGreaterThan(BigDecimal value) {
            addCriterion("avg_price >", value, "avg_price");
            return (Criteria) this;
        }

        public Criteria andAvg_priceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("avg_price >=", value, "avg_price");
            return (Criteria) this;
        }

        public Criteria andAvg_priceLessThan(BigDecimal value) {
            addCriterion("avg_price <", value, "avg_price");
            return (Criteria) this;
        }

        public Criteria andAvg_priceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("avg_price <=", value, "avg_price");
            return (Criteria) this;
        }

        public Criteria andAvg_priceIn(List<BigDecimal> values) {
            addCriterion("avg_price in", values, "avg_price");
            return (Criteria) this;
        }

        public Criteria andAvg_priceNotIn(List<BigDecimal> values) {
            addCriterion("avg_price not in", values, "avg_price");
            return (Criteria) this;
        }

        public Criteria andAvg_priceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("avg_price between", value1, value2, "avg_price");
            return (Criteria) this;
        }

        public Criteria andAvg_priceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("avg_price not between", value1, value2, "avg_price");
            return (Criteria) this;
        }

        public Criteria andIs_billingIsNull() {
            addCriterion("is_billing is null");
            return (Criteria) this;
        }

        public Criteria andIs_billingIsNotNull() {
            addCriterion("is_billing is not null");
            return (Criteria) this;
        }

        public Criteria andIs_billingEqualTo(Integer value) {
            addCriterion("is_billing =", value, "is_billing");
            return (Criteria) this;
        }

        public Criteria andIs_billingNotEqualTo(Integer value) {
            addCriterion("is_billing <>", value, "is_billing");
            return (Criteria) this;
        }

        public Criteria andIs_billingGreaterThan(Integer value) {
            addCriterion("is_billing >", value, "is_billing");
            return (Criteria) this;
        }

        public Criteria andIs_billingGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_billing >=", value, "is_billing");
            return (Criteria) this;
        }

        public Criteria andIs_billingLessThan(Integer value) {
            addCriterion("is_billing <", value, "is_billing");
            return (Criteria) this;
        }

        public Criteria andIs_billingLessThanOrEqualTo(Integer value) {
            addCriterion("is_billing <=", value, "is_billing");
            return (Criteria) this;
        }

        public Criteria andIs_billingIn(List<Integer> values) {
            addCriterion("is_billing in", values, "is_billing");
            return (Criteria) this;
        }

        public Criteria andIs_billingNotIn(List<Integer> values) {
            addCriterion("is_billing not in", values, "is_billing");
            return (Criteria) this;
        }

        public Criteria andIs_billingBetween(Integer value1, Integer value2) {
            addCriterion("is_billing between", value1, value2, "is_billing");
            return (Criteria) this;
        }

        public Criteria andIs_billingNotBetween(Integer value1, Integer value2) {
            addCriterion("is_billing not between", value1, value2, "is_billing");
            return (Criteria) this;
        }

        public Criteria andIs_entrance_feeIsNull() {
            addCriterion("is_entrance_fee is null");
            return (Criteria) this;
        }

        public Criteria andIs_entrance_feeIsNotNull() {
            addCriterion("is_entrance_fee is not null");
            return (Criteria) this;
        }

        public Criteria andIs_entrance_feeEqualTo(Integer value) {
            addCriterion("is_entrance_fee =", value, "is_entrance_fee");
            return (Criteria) this;
        }

        public Criteria andIs_entrance_feeNotEqualTo(Integer value) {
            addCriterion("is_entrance_fee <>", value, "is_entrance_fee");
            return (Criteria) this;
        }

        public Criteria andIs_entrance_feeGreaterThan(Integer value) {
            addCriterion("is_entrance_fee >", value, "is_entrance_fee");
            return (Criteria) this;
        }

        public Criteria andIs_entrance_feeGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_entrance_fee >=", value, "is_entrance_fee");
            return (Criteria) this;
        }

        public Criteria andIs_entrance_feeLessThan(Integer value) {
            addCriterion("is_entrance_fee <", value, "is_entrance_fee");
            return (Criteria) this;
        }

        public Criteria andIs_entrance_feeLessThanOrEqualTo(Integer value) {
            addCriterion("is_entrance_fee <=", value, "is_entrance_fee");
            return (Criteria) this;
        }

        public Criteria andIs_entrance_feeIn(List<Integer> values) {
            addCriterion("is_entrance_fee in", values, "is_entrance_fee");
            return (Criteria) this;
        }

        public Criteria andIs_entrance_feeNotIn(List<Integer> values) {
            addCriterion("is_entrance_fee not in", values, "is_entrance_fee");
            return (Criteria) this;
        }

        public Criteria andIs_entrance_feeBetween(Integer value1, Integer value2) {
            addCriterion("is_entrance_fee between", value1, value2, "is_entrance_fee");
            return (Criteria) this;
        }

        public Criteria andIs_entrance_feeNotBetween(Integer value1, Integer value2) {
            addCriterion("is_entrance_fee not between", value1, value2, "is_entrance_fee");
            return (Criteria) this;
        }

        public Criteria andScan_numIsNull() {
            addCriterion("scan_num is null");
            return (Criteria) this;
        }

        public Criteria andScan_numIsNotNull() {
            addCriterion("scan_num is not null");
            return (Criteria) this;
        }

        public Criteria andScan_numEqualTo(Integer value) {
            addCriterion("scan_num =", value, "scan_num");
            return (Criteria) this;
        }

        public Criteria andScan_numNotEqualTo(Integer value) {
            addCriterion("scan_num <>", value, "scan_num");
            return (Criteria) this;
        }

        public Criteria andScan_numGreaterThan(Integer value) {
            addCriterion("scan_num >", value, "scan_num");
            return (Criteria) this;
        }

        public Criteria andScan_numGreaterThanOrEqualTo(Integer value) {
            addCriterion("scan_num >=", value, "scan_num");
            return (Criteria) this;
        }

        public Criteria andScan_numLessThan(Integer value) {
            addCriterion("scan_num <", value, "scan_num");
            return (Criteria) this;
        }

        public Criteria andScan_numLessThanOrEqualTo(Integer value) {
            addCriterion("scan_num <=", value, "scan_num");
            return (Criteria) this;
        }

        public Criteria andScan_numIn(List<Integer> values) {
            addCriterion("scan_num in", values, "scan_num");
            return (Criteria) this;
        }

        public Criteria andScan_numNotIn(List<Integer> values) {
            addCriterion("scan_num not in", values, "scan_num");
            return (Criteria) this;
        }

        public Criteria andScan_numBetween(Integer value1, Integer value2) {
            addCriterion("scan_num between", value1, value2, "scan_num");
            return (Criteria) this;
        }

        public Criteria andScan_numNotBetween(Integer value1, Integer value2) {
            addCriterion("scan_num not between", value1, value2, "scan_num");
            return (Criteria) this;
        }

        public Criteria andIs_new_sign_shopIsNull() {
            addCriterion("is_new_sign_shop is null");
            return (Criteria) this;
        }

        public Criteria andIs_new_sign_shopIsNotNull() {
            addCriterion("is_new_sign_shop is not null");
            return (Criteria) this;
        }

        public Criteria andIs_new_sign_shopEqualTo(Integer value) {
            addCriterion("is_new_sign_shop =", value, "is_new_sign_shop");
            return (Criteria) this;
        }

        public Criteria andIs_new_sign_shopNotEqualTo(Integer value) {
            addCriterion("is_new_sign_shop <>", value, "is_new_sign_shop");
            return (Criteria) this;
        }

        public Criteria andIs_new_sign_shopGreaterThan(Integer value) {
            addCriterion("is_new_sign_shop >", value, "is_new_sign_shop");
            return (Criteria) this;
        }

        public Criteria andIs_new_sign_shopGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_new_sign_shop >=", value, "is_new_sign_shop");
            return (Criteria) this;
        }

        public Criteria andIs_new_sign_shopLessThan(Integer value) {
            addCriterion("is_new_sign_shop <", value, "is_new_sign_shop");
            return (Criteria) this;
        }

        public Criteria andIs_new_sign_shopLessThanOrEqualTo(Integer value) {
            addCriterion("is_new_sign_shop <=", value, "is_new_sign_shop");
            return (Criteria) this;
        }

        public Criteria andIs_new_sign_shopIn(List<Integer> values) {
            addCriterion("is_new_sign_shop in", values, "is_new_sign_shop");
            return (Criteria) this;
        }

        public Criteria andIs_new_sign_shopNotIn(List<Integer> values) {
            addCriterion("is_new_sign_shop not in", values, "is_new_sign_shop");
            return (Criteria) this;
        }

        public Criteria andIs_new_sign_shopBetween(Integer value1, Integer value2) {
            addCriterion("is_new_sign_shop between", value1, value2, "is_new_sign_shop");
            return (Criteria) this;
        }

        public Criteria andIs_new_sign_shopNotBetween(Integer value1, Integer value2) {
            addCriterion("is_new_sign_shop not between", value1, value2, "is_new_sign_shop");
            return (Criteria) this;
        }

        public Criteria andIs_direct_salesIsNull() {
            addCriterion("is_direct_sales is null");
            return (Criteria) this;
        }

        public Criteria andIs_direct_salesIsNotNull() {
            addCriterion("is_direct_sales is not null");
            return (Criteria) this;
        }

        public Criteria andIs_direct_salesEqualTo(Integer value) {
            addCriterion("is_direct_sales =", value, "is_direct_sales");
            return (Criteria) this;
        }

        public Criteria andIs_direct_salesNotEqualTo(Integer value) {
            addCriterion("is_direct_sales <>", value, "is_direct_sales");
            return (Criteria) this;
        }

        public Criteria andIs_direct_salesGreaterThan(Integer value) {
            addCriterion("is_direct_sales >", value, "is_direct_sales");
            return (Criteria) this;
        }

        public Criteria andIs_direct_salesGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_direct_sales >=", value, "is_direct_sales");
            return (Criteria) this;
        }

        public Criteria andIs_direct_salesLessThan(Integer value) {
            addCriterion("is_direct_sales <", value, "is_direct_sales");
            return (Criteria) this;
        }

        public Criteria andIs_direct_salesLessThanOrEqualTo(Integer value) {
            addCriterion("is_direct_sales <=", value, "is_direct_sales");
            return (Criteria) this;
        }

        public Criteria andIs_direct_salesIn(List<Integer> values) {
            addCriterion("is_direct_sales in", values, "is_direct_sales");
            return (Criteria) this;
        }

        public Criteria andIs_direct_salesNotIn(List<Integer> values) {
            addCriterion("is_direct_sales not in", values, "is_direct_sales");
            return (Criteria) this;
        }

        public Criteria andIs_direct_salesBetween(Integer value1, Integer value2) {
            addCriterion("is_direct_sales between", value1, value2, "is_direct_sales");
            return (Criteria) this;
        }

        public Criteria andIs_direct_salesNotBetween(Integer value1, Integer value2) {
            addCriterion("is_direct_sales not between", value1, value2, "is_direct_sales");
            return (Criteria) this;
        }

        public Criteria andIs_competitorIsNull() {
            addCriterion("is_competitor is null");
            return (Criteria) this;
        }

        public Criteria andIs_competitorIsNotNull() {
            addCriterion("is_competitor is not null");
            return (Criteria) this;
        }

        public Criteria andIs_competitorEqualTo(Integer value) {
            addCriterion("is_competitor =", value, "is_competitor");
            return (Criteria) this;
        }

        public Criteria andIs_competitorNotEqualTo(Integer value) {
            addCriterion("is_competitor <>", value, "is_competitor");
            return (Criteria) this;
        }

        public Criteria andIs_competitorGreaterThan(Integer value) {
            addCriterion("is_competitor >", value, "is_competitor");
            return (Criteria) this;
        }

        public Criteria andIs_competitorGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_competitor >=", value, "is_competitor");
            return (Criteria) this;
        }

        public Criteria andIs_competitorLessThan(Integer value) {
            addCriterion("is_competitor <", value, "is_competitor");
            return (Criteria) this;
        }

        public Criteria andIs_competitorLessThanOrEqualTo(Integer value) {
            addCriterion("is_competitor <=", value, "is_competitor");
            return (Criteria) this;
        }

        public Criteria andIs_competitorIn(List<Integer> values) {
            addCriterion("is_competitor in", values, "is_competitor");
            return (Criteria) this;
        }

        public Criteria andIs_competitorNotIn(List<Integer> values) {
            addCriterion("is_competitor not in", values, "is_competitor");
            return (Criteria) this;
        }

        public Criteria andIs_competitorBetween(Integer value1, Integer value2) {
            addCriterion("is_competitor between", value1, value2, "is_competitor");
            return (Criteria) this;
        }

        public Criteria andIs_competitorNotBetween(Integer value1, Integer value2) {
            addCriterion("is_competitor not between", value1, value2, "is_competitor");
            return (Criteria) this;
        }

        public Criteria andIs_competitor_ycbIsNull() {
            addCriterion("is_competitor_ycb is null");
            return (Criteria) this;
        }

        public Criteria andIs_competitor_ycbIsNotNull() {
            addCriterion("is_competitor_ycb is not null");
            return (Criteria) this;
        }

        public Criteria andIs_competitor_ycbEqualTo(Integer value) {
            addCriterion("is_competitor_ycb =", value, "is_competitor_ycb");
            return (Criteria) this;
        }

        public Criteria andIs_competitor_ycbNotEqualTo(Integer value) {
            addCriterion("is_competitor_ycb <>", value, "is_competitor_ycb");
            return (Criteria) this;
        }

        public Criteria andIs_competitor_ycbGreaterThan(Integer value) {
            addCriterion("is_competitor_ycb >", value, "is_competitor_ycb");
            return (Criteria) this;
        }

        public Criteria andIs_competitor_ycbGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_competitor_ycb >=", value, "is_competitor_ycb");
            return (Criteria) this;
        }

        public Criteria andIs_competitor_ycbLessThan(Integer value) {
            addCriterion("is_competitor_ycb <", value, "is_competitor_ycb");
            return (Criteria) this;
        }

        public Criteria andIs_competitor_ycbLessThanOrEqualTo(Integer value) {
            addCriterion("is_competitor_ycb <=", value, "is_competitor_ycb");
            return (Criteria) this;
        }

        public Criteria andIs_competitor_ycbIn(List<Integer> values) {
            addCriterion("is_competitor_ycb in", values, "is_competitor_ycb");
            return (Criteria) this;
        }

        public Criteria andIs_competitor_ycbNotIn(List<Integer> values) {
            addCriterion("is_competitor_ycb not in", values, "is_competitor_ycb");
            return (Criteria) this;
        }

        public Criteria andIs_competitor_ycbBetween(Integer value1, Integer value2) {
            addCriterion("is_competitor_ycb between", value1, value2, "is_competitor_ycb");
            return (Criteria) this;
        }

        public Criteria andIs_competitor_ycbNotBetween(Integer value1, Integer value2) {
            addCriterion("is_competitor_ycb not between", value1, value2, "is_competitor_ycb");
            return (Criteria) this;
        }

        public Criteria andIs_competitor_gsIsNull() {
            addCriterion("is_competitor_gs is null");
            return (Criteria) this;
        }

        public Criteria andIs_competitor_gsIsNotNull() {
            addCriterion("is_competitor_gs is not null");
            return (Criteria) this;
        }

        public Criteria andIs_competitor_gsEqualTo(Integer value) {
            addCriterion("is_competitor_gs =", value, "is_competitor_gs");
            return (Criteria) this;
        }

        public Criteria andIs_competitor_gsNotEqualTo(Integer value) {
            addCriterion("is_competitor_gs <>", value, "is_competitor_gs");
            return (Criteria) this;
        }

        public Criteria andIs_competitor_gsGreaterThan(Integer value) {
            addCriterion("is_competitor_gs >", value, "is_competitor_gs");
            return (Criteria) this;
        }

        public Criteria andIs_competitor_gsGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_competitor_gs >=", value, "is_competitor_gs");
            return (Criteria) this;
        }

        public Criteria andIs_competitor_gsLessThan(Integer value) {
            addCriterion("is_competitor_gs <", value, "is_competitor_gs");
            return (Criteria) this;
        }

        public Criteria andIs_competitor_gsLessThanOrEqualTo(Integer value) {
            addCriterion("is_competitor_gs <=", value, "is_competitor_gs");
            return (Criteria) this;
        }

        public Criteria andIs_competitor_gsIn(List<Integer> values) {
            addCriterion("is_competitor_gs in", values, "is_competitor_gs");
            return (Criteria) this;
        }

        public Criteria andIs_competitor_gsNotIn(List<Integer> values) {
            addCriterion("is_competitor_gs not in", values, "is_competitor_gs");
            return (Criteria) this;
        }

        public Criteria andIs_competitor_gsBetween(Integer value1, Integer value2) {
            addCriterion("is_competitor_gs between", value1, value2, "is_competitor_gs");
            return (Criteria) this;
        }

        public Criteria andIs_competitor_gsNotBetween(Integer value1, Integer value2) {
            addCriterion("is_competitor_gs not between", value1, value2, "is_competitor_gs");
            return (Criteria) this;
        }

        public Criteria andIs_competitor_ldIsNull() {
            addCriterion("is_competitor_ld is null");
            return (Criteria) this;
        }

        public Criteria andIs_competitor_ldIsNotNull() {
            addCriterion("is_competitor_ld is not null");
            return (Criteria) this;
        }

        public Criteria andIs_competitor_ldEqualTo(Integer value) {
            addCriterion("is_competitor_ld =", value, "is_competitor_ld");
            return (Criteria) this;
        }

        public Criteria andIs_competitor_ldNotEqualTo(Integer value) {
            addCriterion("is_competitor_ld <>", value, "is_competitor_ld");
            return (Criteria) this;
        }

        public Criteria andIs_competitor_ldGreaterThan(Integer value) {
            addCriterion("is_competitor_ld >", value, "is_competitor_ld");
            return (Criteria) this;
        }

        public Criteria andIs_competitor_ldGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_competitor_ld >=", value, "is_competitor_ld");
            return (Criteria) this;
        }

        public Criteria andIs_competitor_ldLessThan(Integer value) {
            addCriterion("is_competitor_ld <", value, "is_competitor_ld");
            return (Criteria) this;
        }

        public Criteria andIs_competitor_ldLessThanOrEqualTo(Integer value) {
            addCriterion("is_competitor_ld <=", value, "is_competitor_ld");
            return (Criteria) this;
        }

        public Criteria andIs_competitor_ldIn(List<Integer> values) {
            addCriterion("is_competitor_ld in", values, "is_competitor_ld");
            return (Criteria) this;
        }

        public Criteria andIs_competitor_ldNotIn(List<Integer> values) {
            addCriterion("is_competitor_ld not in", values, "is_competitor_ld");
            return (Criteria) this;
        }

        public Criteria andIs_competitor_ldBetween(Integer value1, Integer value2) {
            addCriterion("is_competitor_ld between", value1, value2, "is_competitor_ld");
            return (Criteria) this;
        }

        public Criteria andIs_competitor_ldNotBetween(Integer value1, Integer value2) {
            addCriterion("is_competitor_ld not between", value1, value2, "is_competitor_ld");
            return (Criteria) this;
        }

        public Criteria andIs_competitor_jdIsNull() {
            addCriterion("is_competitor_jd is null");
            return (Criteria) this;
        }

        public Criteria andIs_competitor_jdIsNotNull() {
            addCriterion("is_competitor_jd is not null");
            return (Criteria) this;
        }

        public Criteria andIs_competitor_jdEqualTo(Integer value) {
            addCriterion("is_competitor_jd =", value, "is_competitor_jd");
            return (Criteria) this;
        }

        public Criteria andIs_competitor_jdNotEqualTo(Integer value) {
            addCriterion("is_competitor_jd <>", value, "is_competitor_jd");
            return (Criteria) this;
        }

        public Criteria andIs_competitor_jdGreaterThan(Integer value) {
            addCriterion("is_competitor_jd >", value, "is_competitor_jd");
            return (Criteria) this;
        }

        public Criteria andIs_competitor_jdGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_competitor_jd >=", value, "is_competitor_jd");
            return (Criteria) this;
        }

        public Criteria andIs_competitor_jdLessThan(Integer value) {
            addCriterion("is_competitor_jd <", value, "is_competitor_jd");
            return (Criteria) this;
        }

        public Criteria andIs_competitor_jdLessThanOrEqualTo(Integer value) {
            addCriterion("is_competitor_jd <=", value, "is_competitor_jd");
            return (Criteria) this;
        }

        public Criteria andIs_competitor_jdIn(List<Integer> values) {
            addCriterion("is_competitor_jd in", values, "is_competitor_jd");
            return (Criteria) this;
        }

        public Criteria andIs_competitor_jdNotIn(List<Integer> values) {
            addCriterion("is_competitor_jd not in", values, "is_competitor_jd");
            return (Criteria) this;
        }

        public Criteria andIs_competitor_jdBetween(Integer value1, Integer value2) {
            addCriterion("is_competitor_jd between", value1, value2, "is_competitor_jd");
            return (Criteria) this;
        }

        public Criteria andIs_competitor_jdNotBetween(Integer value1, Integer value2) {
            addCriterion("is_competitor_jd not between", value1, value2, "is_competitor_jd");
            return (Criteria) this;
        }

        public Criteria andCompetitor_cntIsNull() {
            addCriterion("competitor_cnt is null");
            return (Criteria) this;
        }

        public Criteria andCompetitor_cntIsNotNull() {
            addCriterion("competitor_cnt is not null");
            return (Criteria) this;
        }

        public Criteria andCompetitor_cntEqualTo(Integer value) {
            addCriterion("competitor_cnt =", value, "competitor_cnt");
            return (Criteria) this;
        }

        public Criteria andCompetitor_cntNotEqualTo(Integer value) {
            addCriterion("competitor_cnt <>", value, "competitor_cnt");
            return (Criteria) this;
        }

        public Criteria andCompetitor_cntGreaterThan(Integer value) {
            addCriterion("competitor_cnt >", value, "competitor_cnt");
            return (Criteria) this;
        }

        public Criteria andCompetitor_cntGreaterThanOrEqualTo(Integer value) {
            addCriterion("competitor_cnt >=", value, "competitor_cnt");
            return (Criteria) this;
        }

        public Criteria andCompetitor_cntLessThan(Integer value) {
            addCriterion("competitor_cnt <", value, "competitor_cnt");
            return (Criteria) this;
        }

        public Criteria andCompetitor_cntLessThanOrEqualTo(Integer value) {
            addCriterion("competitor_cnt <=", value, "competitor_cnt");
            return (Criteria) this;
        }

        public Criteria andCompetitor_cntIn(List<Integer> values) {
            addCriterion("competitor_cnt in", values, "competitor_cnt");
            return (Criteria) this;
        }

        public Criteria andCompetitor_cntNotIn(List<Integer> values) {
            addCriterion("competitor_cnt not in", values, "competitor_cnt");
            return (Criteria) this;
        }

        public Criteria andCompetitor_cntBetween(Integer value1, Integer value2) {
            addCriterion("competitor_cnt between", value1, value2, "competitor_cnt");
            return (Criteria) this;
        }

        public Criteria andCompetitor_cntNotBetween(Integer value1, Integer value2) {
            addCriterion("competitor_cnt not between", value1, value2, "competitor_cnt");
            return (Criteria) this;
        }

        public Criteria andIs_mallIsNull() {
            addCriterion("is_mall is null");
            return (Criteria) this;
        }

        public Criteria andIs_mallIsNotNull() {
            addCriterion("is_mall is not null");
            return (Criteria) this;
        }

        public Criteria andIs_mallEqualTo(Integer value) {
            addCriterion("is_mall =", value, "is_mall");
            return (Criteria) this;
        }

        public Criteria andIs_mallNotEqualTo(Integer value) {
            addCriterion("is_mall <>", value, "is_mall");
            return (Criteria) this;
        }

        public Criteria andIs_mallGreaterThan(Integer value) {
            addCriterion("is_mall >", value, "is_mall");
            return (Criteria) this;
        }

        public Criteria andIs_mallGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_mall >=", value, "is_mall");
            return (Criteria) this;
        }

        public Criteria andIs_mallLessThan(Integer value) {
            addCriterion("is_mall <", value, "is_mall");
            return (Criteria) this;
        }

        public Criteria andIs_mallLessThanOrEqualTo(Integer value) {
            addCriterion("is_mall <=", value, "is_mall");
            return (Criteria) this;
        }

        public Criteria andIs_mallIn(List<Integer> values) {
            addCriterion("is_mall in", values, "is_mall");
            return (Criteria) this;
        }

        public Criteria andIs_mallNotIn(List<Integer> values) {
            addCriterion("is_mall not in", values, "is_mall");
            return (Criteria) this;
        }

        public Criteria andIs_mallBetween(Integer value1, Integer value2) {
            addCriterion("is_mall between", value1, value2, "is_mall");
            return (Criteria) this;
        }

        public Criteria andIs_mallNotBetween(Integer value1, Integer value2) {
            addCriterion("is_mall not between", value1, value2, "is_mall");
            return (Criteria) this;
        }

        public Criteria andIs_scenic_areaIsNull() {
            addCriterion("is_scenic_area is null");
            return (Criteria) this;
        }

        public Criteria andIs_scenic_areaIsNotNull() {
            addCriterion("is_scenic_area is not null");
            return (Criteria) this;
        }

        public Criteria andIs_scenic_areaEqualTo(Integer value) {
            addCriterion("is_scenic_area =", value, "is_scenic_area");
            return (Criteria) this;
        }

        public Criteria andIs_scenic_areaNotEqualTo(Integer value) {
            addCriterion("is_scenic_area <>", value, "is_scenic_area");
            return (Criteria) this;
        }

        public Criteria andIs_scenic_areaGreaterThan(Integer value) {
            addCriterion("is_scenic_area >", value, "is_scenic_area");
            return (Criteria) this;
        }

        public Criteria andIs_scenic_areaGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_scenic_area >=", value, "is_scenic_area");
            return (Criteria) this;
        }

        public Criteria andIs_scenic_areaLessThan(Integer value) {
            addCriterion("is_scenic_area <", value, "is_scenic_area");
            return (Criteria) this;
        }

        public Criteria andIs_scenic_areaLessThanOrEqualTo(Integer value) {
            addCriterion("is_scenic_area <=", value, "is_scenic_area");
            return (Criteria) this;
        }

        public Criteria andIs_scenic_areaIn(List<Integer> values) {
            addCriterion("is_scenic_area in", values, "is_scenic_area");
            return (Criteria) this;
        }

        public Criteria andIs_scenic_areaNotIn(List<Integer> values) {
            addCriterion("is_scenic_area not in", values, "is_scenic_area");
            return (Criteria) this;
        }

        public Criteria andIs_scenic_areaBetween(Integer value1, Integer value2) {
            addCriterion("is_scenic_area between", value1, value2, "is_scenic_area");
            return (Criteria) this;
        }

        public Criteria andIs_scenic_areaNotBetween(Integer value1, Integer value2) {
            addCriterion("is_scenic_area not between", value1, value2, "is_scenic_area");
            return (Criteria) this;
        }

        public Criteria andWeather_typeIsNull() {
            addCriterion("weather_type is null");
            return (Criteria) this;
        }

        public Criteria andWeather_typeIsNotNull() {
            addCriterion("weather_type is not null");
            return (Criteria) this;
        }

        public Criteria andWeather_typeEqualTo(String value) {
            addCriterion("weather_type =", value, "weather_type");
            return (Criteria) this;
        }

        public Criteria andWeather_typeNotEqualTo(String value) {
            addCriterion("weather_type <>", value, "weather_type");
            return (Criteria) this;
        }

        public Criteria andWeather_typeGreaterThan(String value) {
            addCriterion("weather_type >", value, "weather_type");
            return (Criteria) this;
        }

        public Criteria andWeather_typeGreaterThanOrEqualTo(String value) {
            addCriterion("weather_type >=", value, "weather_type");
            return (Criteria) this;
        }

        public Criteria andWeather_typeLessThan(String value) {
            addCriterion("weather_type <", value, "weather_type");
            return (Criteria) this;
        }

        public Criteria andWeather_typeLessThanOrEqualTo(String value) {
            addCriterion("weather_type <=", value, "weather_type");
            return (Criteria) this;
        }

        public Criteria andWeather_typeLike(String value) {
            addCriterion("weather_type like", value, "weather_type");
            return (Criteria) this;
        }

        public Criteria andWeather_typeNotLike(String value) {
            addCriterion("weather_type not like", value, "weather_type");
            return (Criteria) this;
        }

        public Criteria andWeather_typeIn(List<String> values) {
            addCriterion("weather_type in", values, "weather_type");
            return (Criteria) this;
        }

        public Criteria andWeather_typeNotIn(List<String> values) {
            addCriterion("weather_type not in", values, "weather_type");
            return (Criteria) this;
        }

        public Criteria andWeather_typeBetween(String value1, String value2) {
            addCriterion("weather_type between", value1, value2, "weather_type");
            return (Criteria) this;
        }

        public Criteria andWeather_typeNotBetween(String value1, String value2) {
            addCriterion("weather_type not between", value1, value2, "weather_type");
            return (Criteria) this;
        }

        public Criteria andLowest_temperatureIsNull() {
            addCriterion("lowest_temperature is null");
            return (Criteria) this;
        }

        public Criteria andLowest_temperatureIsNotNull() {
            addCriterion("lowest_temperature is not null");
            return (Criteria) this;
        }

        public Criteria andLowest_temperatureEqualTo(Integer value) {
            addCriterion("lowest_temperature =", value, "lowest_temperature");
            return (Criteria) this;
        }

        public Criteria andLowest_temperatureNotEqualTo(Integer value) {
            addCriterion("lowest_temperature <>", value, "lowest_temperature");
            return (Criteria) this;
        }

        public Criteria andLowest_temperatureGreaterThan(Integer value) {
            addCriterion("lowest_temperature >", value, "lowest_temperature");
            return (Criteria) this;
        }

        public Criteria andLowest_temperatureGreaterThanOrEqualTo(Integer value) {
            addCriterion("lowest_temperature >=", value, "lowest_temperature");
            return (Criteria) this;
        }

        public Criteria andLowest_temperatureLessThan(Integer value) {
            addCriterion("lowest_temperature <", value, "lowest_temperature");
            return (Criteria) this;
        }

        public Criteria andLowest_temperatureLessThanOrEqualTo(Integer value) {
            addCriterion("lowest_temperature <=", value, "lowest_temperature");
            return (Criteria) this;
        }

        public Criteria andLowest_temperatureIn(List<Integer> values) {
            addCriterion("lowest_temperature in", values, "lowest_temperature");
            return (Criteria) this;
        }

        public Criteria andLowest_temperatureNotIn(List<Integer> values) {
            addCriterion("lowest_temperature not in", values, "lowest_temperature");
            return (Criteria) this;
        }

        public Criteria andLowest_temperatureBetween(Integer value1, Integer value2) {
            addCriterion("lowest_temperature between", value1, value2, "lowest_temperature");
            return (Criteria) this;
        }

        public Criteria andLowest_temperatureNotBetween(Integer value1, Integer value2) {
            addCriterion("lowest_temperature not between", value1, value2, "lowest_temperature");
            return (Criteria) this;
        }

        public Criteria andHighest_temperatureIsNull() {
            addCriterion("highest_temperature is null");
            return (Criteria) this;
        }

        public Criteria andHighest_temperatureIsNotNull() {
            addCriterion("highest_temperature is not null");
            return (Criteria) this;
        }

        public Criteria andHighest_temperatureEqualTo(Integer value) {
            addCriterion("highest_temperature =", value, "highest_temperature");
            return (Criteria) this;
        }

        public Criteria andHighest_temperatureNotEqualTo(Integer value) {
            addCriterion("highest_temperature <>", value, "highest_temperature");
            return (Criteria) this;
        }

        public Criteria andHighest_temperatureGreaterThan(Integer value) {
            addCriterion("highest_temperature >", value, "highest_temperature");
            return (Criteria) this;
        }

        public Criteria andHighest_temperatureGreaterThanOrEqualTo(Integer value) {
            addCriterion("highest_temperature >=", value, "highest_temperature");
            return (Criteria) this;
        }

        public Criteria andHighest_temperatureLessThan(Integer value) {
            addCriterion("highest_temperature <", value, "highest_temperature");
            return (Criteria) this;
        }

        public Criteria andHighest_temperatureLessThanOrEqualTo(Integer value) {
            addCriterion("highest_temperature <=", value, "highest_temperature");
            return (Criteria) this;
        }

        public Criteria andHighest_temperatureIn(List<Integer> values) {
            addCriterion("highest_temperature in", values, "highest_temperature");
            return (Criteria) this;
        }

        public Criteria andHighest_temperatureNotIn(List<Integer> values) {
            addCriterion("highest_temperature not in", values, "highest_temperature");
            return (Criteria) this;
        }

        public Criteria andHighest_temperatureBetween(Integer value1, Integer value2) {
            addCriterion("highest_temperature between", value1, value2, "highest_temperature");
            return (Criteria) this;
        }

        public Criteria andHighest_temperatureNotBetween(Integer value1, Integer value2) {
            addCriterion("highest_temperature not between", value1, value2, "highest_temperature");
            return (Criteria) this;
        }

        public Criteria andDate_typeIsNull() {
            addCriterion("date_type is null");
            return (Criteria) this;
        }

        public Criteria andDate_typeIsNotNull() {
            addCriterion("date_type is not null");
            return (Criteria) this;
        }

        public Criteria andDate_typeEqualTo(Integer value) {
            addCriterion("date_type =", value, "date_type");
            return (Criteria) this;
        }

        public Criteria andDate_typeNotEqualTo(Integer value) {
            addCriterion("date_type <>", value, "date_type");
            return (Criteria) this;
        }

        public Criteria andDate_typeGreaterThan(Integer value) {
            addCriterion("date_type >", value, "date_type");
            return (Criteria) this;
        }

        public Criteria andDate_typeGreaterThanOrEqualTo(Integer value) {
            addCriterion("date_type >=", value, "date_type");
            return (Criteria) this;
        }

        public Criteria andDate_typeLessThan(Integer value) {
            addCriterion("date_type <", value, "date_type");
            return (Criteria) this;
        }

        public Criteria andDate_typeLessThanOrEqualTo(Integer value) {
            addCriterion("date_type <=", value, "date_type");
            return (Criteria) this;
        }

        public Criteria andDate_typeIn(List<Integer> values) {
            addCriterion("date_type in", values, "date_type");
            return (Criteria) this;
        }

        public Criteria andDate_typeNotIn(List<Integer> values) {
            addCriterion("date_type not in", values, "date_type");
            return (Criteria) this;
        }

        public Criteria andDate_typeBetween(Integer value1, Integer value2) {
            addCriterion("date_type between", value1, value2, "date_type");
            return (Criteria) this;
        }

        public Criteria andDate_typeNotBetween(Integer value1, Integer value2) {
            addCriterion("date_type not between", value1, value2, "date_type");
            return (Criteria) this;
        }

        public Criteria andWeekdayIsNull() {
            addCriterion("weekday is null");
            return (Criteria) this;
        }

        public Criteria andWeekdayIsNotNull() {
            addCriterion("weekday is not null");
            return (Criteria) this;
        }

        public Criteria andWeekdayEqualTo(Integer value) {
            addCriterion("weekday =", value, "weekday");
            return (Criteria) this;
        }

        public Criteria andWeekdayNotEqualTo(Integer value) {
            addCriterion("weekday <>", value, "weekday");
            return (Criteria) this;
        }

        public Criteria andWeekdayGreaterThan(Integer value) {
            addCriterion("weekday >", value, "weekday");
            return (Criteria) this;
        }

        public Criteria andWeekdayGreaterThanOrEqualTo(Integer value) {
            addCriterion("weekday >=", value, "weekday");
            return (Criteria) this;
        }

        public Criteria andWeekdayLessThan(Integer value) {
            addCriterion("weekday <", value, "weekday");
            return (Criteria) this;
        }

        public Criteria andWeekdayLessThanOrEqualTo(Integer value) {
            addCriterion("weekday <=", value, "weekday");
            return (Criteria) this;
        }

        public Criteria andWeekdayIn(List<Integer> values) {
            addCriterion("weekday in", values, "weekday");
            return (Criteria) this;
        }

        public Criteria andWeekdayNotIn(List<Integer> values) {
            addCriterion("weekday not in", values, "weekday");
            return (Criteria) this;
        }

        public Criteria andWeekdayBetween(Integer value1, Integer value2) {
            addCriterion("weekday between", value1, value2, "weekday");
            return (Criteria) this;
        }

        public Criteria andWeekdayNotBetween(Integer value1, Integer value2) {
            addCriterion("weekday not between", value1, value2, "weekday");
            return (Criteria) this;
        }

        public Criteria andWeekofyearIsNull() {
            addCriterion("weekofyear is null");
            return (Criteria) this;
        }

        public Criteria andWeekofyearIsNotNull() {
            addCriterion("weekofyear is not null");
            return (Criteria) this;
        }

        public Criteria andWeekofyearEqualTo(Integer value) {
            addCriterion("weekofyear =", value, "weekofyear");
            return (Criteria) this;
        }

        public Criteria andWeekofyearNotEqualTo(Integer value) {
            addCriterion("weekofyear <>", value, "weekofyear");
            return (Criteria) this;
        }

        public Criteria andWeekofyearGreaterThan(Integer value) {
            addCriterion("weekofyear >", value, "weekofyear");
            return (Criteria) this;
        }

        public Criteria andWeekofyearGreaterThanOrEqualTo(Integer value) {
            addCriterion("weekofyear >=", value, "weekofyear");
            return (Criteria) this;
        }

        public Criteria andWeekofyearLessThan(Integer value) {
            addCriterion("weekofyear <", value, "weekofyear");
            return (Criteria) this;
        }

        public Criteria andWeekofyearLessThanOrEqualTo(Integer value) {
            addCriterion("weekofyear <=", value, "weekofyear");
            return (Criteria) this;
        }

        public Criteria andWeekofyearIn(List<Integer> values) {
            addCriterion("weekofyear in", values, "weekofyear");
            return (Criteria) this;
        }

        public Criteria andWeekofyearNotIn(List<Integer> values) {
            addCriterion("weekofyear not in", values, "weekofyear");
            return (Criteria) this;
        }

        public Criteria andWeekofyearBetween(Integer value1, Integer value2) {
            addCriterion("weekofyear between", value1, value2, "weekofyear");
            return (Criteria) this;
        }

        public Criteria andWeekofyearNotBetween(Integer value1, Integer value2) {
            addCriterion("weekofyear not between", value1, value2, "weekofyear");
            return (Criteria) this;
        }

        public Criteria andMonthofyearIsNull() {
            addCriterion("monthofyear is null");
            return (Criteria) this;
        }

        public Criteria andMonthofyearIsNotNull() {
            addCriterion("monthofyear is not null");
            return (Criteria) this;
        }

        public Criteria andMonthofyearEqualTo(Integer value) {
            addCriterion("monthofyear =", value, "monthofyear");
            return (Criteria) this;
        }

        public Criteria andMonthofyearNotEqualTo(Integer value) {
            addCriterion("monthofyear <>", value, "monthofyear");
            return (Criteria) this;
        }

        public Criteria andMonthofyearGreaterThan(Integer value) {
            addCriterion("monthofyear >", value, "monthofyear");
            return (Criteria) this;
        }

        public Criteria andMonthofyearGreaterThanOrEqualTo(Integer value) {
            addCriterion("monthofyear >=", value, "monthofyear");
            return (Criteria) this;
        }

        public Criteria andMonthofyearLessThan(Integer value) {
            addCriterion("monthofyear <", value, "monthofyear");
            return (Criteria) this;
        }

        public Criteria andMonthofyearLessThanOrEqualTo(Integer value) {
            addCriterion("monthofyear <=", value, "monthofyear");
            return (Criteria) this;
        }

        public Criteria andMonthofyearIn(List<Integer> values) {
            addCriterion("monthofyear in", values, "monthofyear");
            return (Criteria) this;
        }

        public Criteria andMonthofyearNotIn(List<Integer> values) {
            addCriterion("monthofyear not in", values, "monthofyear");
            return (Criteria) this;
        }

        public Criteria andMonthofyearBetween(Integer value1, Integer value2) {
            addCriterion("monthofyear between", value1, value2, "monthofyear");
            return (Criteria) this;
        }

        public Criteria andMonthofyearNotBetween(Integer value1, Integer value2) {
            addCriterion("monthofyear not between", value1, value2, "monthofyear");
            return (Criteria) this;
        }

        public Criteria andLn_ordersIsNull() {
            addCriterion("ln_orders is null");
            return (Criteria) this;
        }

        public Criteria andLn_ordersIsNotNull() {
            addCriterion("ln_orders is not null");
            return (Criteria) this;
        }

        public Criteria andLn_ordersEqualTo(Double value) {
            addCriterion("ln_orders =", value, "ln_orders");
            return (Criteria) this;
        }

        public Criteria andLn_ordersNotEqualTo(Double value) {
            addCriterion("ln_orders <>", value, "ln_orders");
            return (Criteria) this;
        }

        public Criteria andLn_ordersGreaterThan(Double value) {
            addCriterion("ln_orders >", value, "ln_orders");
            return (Criteria) this;
        }

        public Criteria andLn_ordersGreaterThanOrEqualTo(Double value) {
            addCriterion("ln_orders >=", value, "ln_orders");
            return (Criteria) this;
        }

        public Criteria andLn_ordersLessThan(Double value) {
            addCriterion("ln_orders <", value, "ln_orders");
            return (Criteria) this;
        }

        public Criteria andLn_ordersLessThanOrEqualTo(Double value) {
            addCriterion("ln_orders <=", value, "ln_orders");
            return (Criteria) this;
        }

        public Criteria andLn_ordersIn(List<Double> values) {
            addCriterion("ln_orders in", values, "ln_orders");
            return (Criteria) this;
        }

        public Criteria andLn_ordersNotIn(List<Double> values) {
            addCriterion("ln_orders not in", values, "ln_orders");
            return (Criteria) this;
        }

        public Criteria andLn_ordersBetween(Double value1, Double value2) {
            addCriterion("ln_orders between", value1, value2, "ln_orders");
            return (Criteria) this;
        }

        public Criteria andLn_ordersNotBetween(Double value1, Double value2) {
            addCriterion("ln_orders not between", value1, value2, "ln_orders");
            return (Criteria) this;
        }

        public Criteria andLn_amountIsNull() {
            addCriterion("ln_amount is null");
            return (Criteria) this;
        }

        public Criteria andLn_amountIsNotNull() {
            addCriterion("ln_amount is not null");
            return (Criteria) this;
        }

        public Criteria andLn_amountEqualTo(Double value) {
            addCriterion("ln_amount =", value, "ln_amount");
            return (Criteria) this;
        }

        public Criteria andLn_amountNotEqualTo(Double value) {
            addCriterion("ln_amount <>", value, "ln_amount");
            return (Criteria) this;
        }

        public Criteria andLn_amountGreaterThan(Double value) {
            addCriterion("ln_amount >", value, "ln_amount");
            return (Criteria) this;
        }

        public Criteria andLn_amountGreaterThanOrEqualTo(Double value) {
            addCriterion("ln_amount >=", value, "ln_amount");
            return (Criteria) this;
        }

        public Criteria andLn_amountLessThan(Double value) {
            addCriterion("ln_amount <", value, "ln_amount");
            return (Criteria) this;
        }

        public Criteria andLn_amountLessThanOrEqualTo(Double value) {
            addCriterion("ln_amount <=", value, "ln_amount");
            return (Criteria) this;
        }

        public Criteria andLn_amountIn(List<Double> values) {
            addCriterion("ln_amount in", values, "ln_amount");
            return (Criteria) this;
        }

        public Criteria andLn_amountNotIn(List<Double> values) {
            addCriterion("ln_amount not in", values, "ln_amount");
            return (Criteria) this;
        }

        public Criteria andLn_amountBetween(Double value1, Double value2) {
            addCriterion("ln_amount between", value1, value2, "ln_amount");
            return (Criteria) this;
        }

        public Criteria andLn_amountNotBetween(Double value1, Double value2) {
            addCriterion("ln_amount not between", value1, value2, "ln_amount");
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