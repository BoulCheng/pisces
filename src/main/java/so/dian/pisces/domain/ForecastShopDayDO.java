package so.dian.pisces.domain;

import java.math.BigDecimal;

public class ForecastShopDayDO {
    private Integer id;

    private Integer shop_id;

    private Double poi_longitude;

    private Double poi_latitude;

    private String district;

    private String province;

    private String city_name;

    private String parent_type_name;

    private String type_name;

    private BigDecimal box_price;

    private String shop_level;

    private Integer total_online_time;

    private Integer device_num;

    private Integer total_slot_num;

    private Integer powerbank_num;

    private Integer pay_orders;

    private Integer zero_orders;

    private Integer ninety_orders;

    private Float payment_amount;

    private Float refund_pay_amount;

    private BigDecimal avg_price;

    private Integer is_billing;

    private Integer is_entrance_fee;

    private Integer scan_num;

    private Integer is_new_sign_shop;

    private Integer is_direct_sales;

    private Integer is_competitor;

    private Integer is_competitor_ycb;

    private Integer is_competitor_gs;

    private Integer is_competitor_ld;

    private Integer is_competitor_jd;

    private Integer competitor_cnt;

    private Integer is_mall;

    private Integer is_scenic_area;

    private String weather_type;

    private Integer lowest_temperature;

    private Integer highest_temperature;

    private Integer date_type;

    private Integer weekday;

    private Integer weekofyear;

    private Integer monthofyear;

    private Double ln_orders;

    private Double ln_amount;

    private String biz_date;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getShop_id() {
        return shop_id;
    }

    public void setShop_id(Integer shop_id) {
        this.shop_id = shop_id;
    }

    public Double getPoi_longitude() {
        return poi_longitude;
    }

    public void setPoi_longitude(Double poi_longitude) {
        this.poi_longitude = poi_longitude;
    }

    public Double getPoi_latitude() {
        return poi_latitude;
    }

    public void setPoi_latitude(Double poi_latitude) {
        this.poi_latitude = poi_latitude;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district == null ? null : district.trim();
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    public String getCity_name() {
        return city_name;
    }

    public void setCity_name(String city_name) {
        this.city_name = city_name == null ? null : city_name.trim();
    }

    public String getParent_type_name() {
        return parent_type_name;
    }

    public void setParent_type_name(String parent_type_name) {
        this.parent_type_name = parent_type_name == null ? null : parent_type_name.trim();
    }

    public String getType_name() {
        return type_name;
    }

    public void setType_name(String type_name) {
        this.type_name = type_name == null ? null : type_name.trim();
    }

    public BigDecimal getBox_price() {
        return box_price;
    }

    public void setBox_price(BigDecimal box_price) {
        this.box_price = box_price;
    }

    public String getShop_level() {
        return shop_level;
    }

    public void setShop_level(String shop_level) {
        this.shop_level = shop_level == null ? null : shop_level.trim();
    }

    public Integer getTotal_online_time() {
        return total_online_time;
    }

    public void setTotal_online_time(Integer total_online_time) {
        this.total_online_time = total_online_time;
    }

    public Integer getDevice_num() {
        return device_num;
    }

    public void setDevice_num(Integer device_num) {
        this.device_num = device_num;
    }

    public Integer getTotal_slot_num() {
        return total_slot_num;
    }

    public void setTotal_slot_num(Integer total_slot_num) {
        this.total_slot_num = total_slot_num;
    }

    public Integer getPowerbank_num() {
        return powerbank_num;
    }

    public void setPowerbank_num(Integer powerbank_num) {
        this.powerbank_num = powerbank_num;
    }

    public Integer getPay_orders() {
        return pay_orders;
    }

    public void setPay_orders(Integer pay_orders) {
        this.pay_orders = pay_orders;
    }

    public Integer getZero_orders() {
        return zero_orders;
    }

    public void setZero_orders(Integer zero_orders) {
        this.zero_orders = zero_orders;
    }

    public Integer getNinety_orders() {
        return ninety_orders;
    }

    public void setNinety_orders(Integer ninety_orders) {
        this.ninety_orders = ninety_orders;
    }

    public Float getPayment_amount() {
        return payment_amount;
    }

    public void setPayment_amount(Float payment_amount) {
        this.payment_amount = payment_amount;
    }

    public Float getRefund_pay_amount() {
        return refund_pay_amount;
    }

    public void setRefund_pay_amount(Float refund_pay_amount) {
        this.refund_pay_amount = refund_pay_amount;
    }

    public BigDecimal getAvg_price() {
        return avg_price;
    }

    public void setAvg_price(BigDecimal avg_price) {
        this.avg_price = avg_price;
    }

    public Integer getIs_billing() {
        return is_billing;
    }

    public void setIs_billing(Integer is_billing) {
        this.is_billing = is_billing;
    }

    public Integer getIs_entrance_fee() {
        return is_entrance_fee;
    }

    public void setIs_entrance_fee(Integer is_entrance_fee) {
        this.is_entrance_fee = is_entrance_fee;
    }

    public Integer getScan_num() {
        return scan_num;
    }

    public void setScan_num(Integer scan_num) {
        this.scan_num = scan_num;
    }

    public Integer getIs_new_sign_shop() {
        return is_new_sign_shop;
    }

    public void setIs_new_sign_shop(Integer is_new_sign_shop) {
        this.is_new_sign_shop = is_new_sign_shop;
    }

    public Integer getIs_direct_sales() {
        return is_direct_sales;
    }

    public void setIs_direct_sales(Integer is_direct_sales) {
        this.is_direct_sales = is_direct_sales;
    }

    public Integer getIs_competitor() {
        return is_competitor;
    }

    public void setIs_competitor(Integer is_competitor) {
        this.is_competitor = is_competitor;
    }

    public Integer getIs_competitor_ycb() {
        return is_competitor_ycb;
    }

    public void setIs_competitor_ycb(Integer is_competitor_ycb) {
        this.is_competitor_ycb = is_competitor_ycb;
    }

    public Integer getIs_competitor_gs() {
        return is_competitor_gs;
    }

    public void setIs_competitor_gs(Integer is_competitor_gs) {
        this.is_competitor_gs = is_competitor_gs;
    }

    public Integer getIs_competitor_ld() {
        return is_competitor_ld;
    }

    public void setIs_competitor_ld(Integer is_competitor_ld) {
        this.is_competitor_ld = is_competitor_ld;
    }

    public Integer getIs_competitor_jd() {
        return is_competitor_jd;
    }

    public void setIs_competitor_jd(Integer is_competitor_jd) {
        this.is_competitor_jd = is_competitor_jd;
    }

    public Integer getCompetitor_cnt() {
        return competitor_cnt;
    }

    public void setCompetitor_cnt(Integer competitor_cnt) {
        this.competitor_cnt = competitor_cnt;
    }

    public Integer getIs_mall() {
        return is_mall;
    }

    public void setIs_mall(Integer is_mall) {
        this.is_mall = is_mall;
    }

    public Integer getIs_scenic_area() {
        return is_scenic_area;
    }

    public void setIs_scenic_area(Integer is_scenic_area) {
        this.is_scenic_area = is_scenic_area;
    }

    public String getWeather_type() {
        return weather_type;
    }

    public void setWeather_type(String weather_type) {
        this.weather_type = weather_type == null ? null : weather_type.trim();
    }

    public Integer getLowest_temperature() {
        return lowest_temperature;
    }

    public void setLowest_temperature(Integer lowest_temperature) {
        this.lowest_temperature = lowest_temperature;
    }

    public Integer getHighest_temperature() {
        return highest_temperature;
    }

    public void setHighest_temperature(Integer highest_temperature) {
        this.highest_temperature = highest_temperature;
    }

    public Integer getDate_type() {
        return date_type;
    }

    public void setDate_type(Integer date_type) {
        this.date_type = date_type;
    }

    public Integer getWeekday() {
        return weekday;
    }

    public void setWeekday(Integer weekday) {
        this.weekday = weekday;
    }

    public Integer getWeekofyear() {
        return weekofyear;
    }

    public void setWeekofyear(Integer weekofyear) {
        this.weekofyear = weekofyear;
    }

    public Integer getMonthofyear() {
        return monthofyear;
    }

    public void setMonthofyear(Integer monthofyear) {
        this.monthofyear = monthofyear;
    }

    public Double getLn_orders() {
        return ln_orders;
    }

    public void setLn_orders(Double ln_orders) {
        this.ln_orders = ln_orders;
    }

    public Double getLn_amount() {
        return ln_amount;
    }

    public void setLn_amount(Double ln_amount) {
        this.ln_amount = ln_amount;
    }

    public String getBiz_date() {
        return biz_date;
    }

    public void setBiz_date(String biz_date) {
        this.biz_date = biz_date == null ? null : biz_date.trim();
    }
}