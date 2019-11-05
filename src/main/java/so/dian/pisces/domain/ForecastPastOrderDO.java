package so.dian.pisces.domain;

import java.util.Date;

public class ForecastPastOrderDO {
    private Integer id;

    private Integer source_id;

    private Integer shop_id;

    private String biz_date;

    private Integer pay_orders_original;

    private Double pay_orders_forecast;

    private Integer status;

    private Date create_time;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSource_id() {
        return source_id;
    }

    public void setSource_id(Integer source_id) {
        this.source_id = source_id;
    }

    public Integer getShop_id() {
        return shop_id;
    }

    public void setShop_id(Integer shop_id) {
        this.shop_id = shop_id;
    }

    public String getBiz_date() {
        return biz_date;
    }

    public void setBiz_date(String biz_date) {
        this.biz_date = biz_date == null ? null : biz_date.trim();
    }

    public Integer getPay_orders_original() {
        return pay_orders_original;
    }

    public void setPay_orders_original(Integer pay_orders_original) {
        this.pay_orders_original = pay_orders_original;
    }

    public Double getPay_orders_forecast() {
        return pay_orders_forecast;
    }

    public void setPay_orders_forecast(Double pay_orders_forecast) {
        this.pay_orders_forecast = pay_orders_forecast;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }
}