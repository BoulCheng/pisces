-- 预测过去订单数结果表
```
CREATE SEQUENCE forecast_past_order_id_seq
START WITH 1
INCREMENT BY 1
NO MINVALUE
NO MAXVALUE
CACHE 1;

CREATE TABLE "dx2"."forecast_past_order" (
  "source_id" int4 NOT NULL,
  "shop_id" int4 NOT NULL,
  "biz_date" varchar(32) COLLATE "pg_catalog"."default",
  "pay_orders_original" int4,
  "pay_orders_forecast" float8,
  "status" int4,
  "create_time" timestamp(6) NOT NULL,
  "id" int4 NOT NULL DEFAULT nextval('forecast_past_order_id_seq'::regclass),
  CONSTRAINT "forecast_past_order_pkey" PRIMARY KEY ("id")
)
;

COMMENT ON COLUMN "dx2"."forecast_past_order"."source_id" IS '原始数据id';

COMMENT ON COLUMN "dx2"."forecast_past_order"."shop_id" IS '门店id';

COMMENT ON COLUMN "dx2"."forecast_past_order"."biz_date" IS '日期';

COMMENT ON COLUMN "dx2"."forecast_past_order"."pay_orders_original" IS '原始订单数';

COMMENT ON COLUMN "dx2"."forecast_past_order"."pay_orders_forecast" IS '预测订单数';

COMMENT ON COLUMN "dx2"."forecast_past_order"."status" IS '预测状态: 0-成功 1-失败';

COMMENT ON COLUMN "dx2"."forecast_past_order"."create_time" IS '创建时间';

COMMENT ON COLUMN "dx2"."forecast_past_order"."id" IS '主键';

```
-- 预测未来订单数结果表
```
CREATE SEQUENCE forecast_future_order_id_seq
START WITH 1
INCREMENT BY 1
NO MINVALUE
NO MAXVALUE
CACHE 1;

CREATE TABLE "dx2"."forecast_future_order" (
  "source_id" int4 NOT NULL,
  "shop_id" int4 NOT NULL,
  "biz_date" varchar(32) COLLATE "pg_catalog"."default",
  "pay_orders_forecast" float8,
  "status" int4,
  "create_time" timestamp(6) NOT NULL,
  "id" int4 NOT NULL DEFAULT nextval('forecast_future_order_id_seq'::regclass),
  CONSTRAINT "forecast_future_order_pkey" PRIMARY KEY ("id")
)
;

COMMENT ON COLUMN "dx2"."forecast_future_order"."source_id" IS '原始数据id';

COMMENT ON COLUMN "dx2"."forecast_future_order"."shop_id" IS '门店id';

COMMENT ON COLUMN "dx2"."forecast_future_order"."biz_date" IS '日期';

COMMENT ON COLUMN "dx2"."forecast_future_order"."pay_orders_forecast" IS '预测订单数';

COMMENT ON COLUMN "dx2"."forecast_future_order"."status" IS '预测状态: 0-成功 1-失败';

COMMENT ON COLUMN "dx2"."forecast_future_order"."create_time" IS '创建时间';

COMMENT ON COLUMN "dx2"."forecast_future_order"."id" IS '主键';

```
-- 预测过去支付金额结果表
```
CREATE SEQUENCE forecast_past_amount_id_seq
START WITH 1
INCREMENT BY 1
NO MINVALUE
NO MAXVALUE
CACHE 1;

CREATE TABLE "dx2"."forecast_past_amount" (
  "source_id" int4 NOT NULL,
  "shop_id" int4 NOT NULL,
  "biz_date" varchar(32) COLLATE "pg_catalog"."default",
	"payment_amount_original" float4,
  "payment_amount_forecast" float8,
  "status" int4,
  "create_time" timestamp(6) NOT NULL,
  "id" int4 NOT NULL DEFAULT nextval('forecast_past_amount_id_seq'::regclass),
  CONSTRAINT "forecast_past_amount_pkey" PRIMARY KEY ("id")
);

COMMENT ON COLUMN "dx2"."forecast_past_amount"."source_id" IS '原始数据id';

COMMENT ON COLUMN "dx2"."forecast_past_amount"."shop_id" IS '门店id';

COMMENT ON COLUMN "dx2"."forecast_past_amount"."biz_date" IS '日期';

COMMENT ON COLUMN "dx2"."forecast_past_amount"."payment_amount_original" IS '原始支付金额';

COMMENT ON COLUMN "dx2"."forecast_past_amount"."payment_amount_forecast" IS '预测支付金额';

COMMENT ON COLUMN "dx2"."forecast_past_amount"."status" IS '预测状态: 0-成功 1-失败';

COMMENT ON COLUMN "dx2"."forecast_past_amount"."create_time" IS '创建时间';

COMMENT ON COLUMN "dx2"."forecast_past_amount"."id" IS '主键';

```
-- 预测未来支付金额结果表
```
CREATE SEQUENCE forecast_future_amount_id_seq
START WITH 1
INCREMENT BY 1
NO MINVALUE
NO MAXVALUE
CACHE 1;

CREATE TABLE "dx2"."forecast_future_amount" (
  "source_id" int4 NOT NULL,
  "shop_id" int4 NOT NULL,
  "biz_date" varchar(32) COLLATE "pg_catalog"."default",
  "payment_amount_forecast" float8,
  "status" int4,
  "create_time" timestamp(6) NOT NULL,
  "id" int4 NOT NULL DEFAULT nextval('forecast_future_amount_id_seq'::regclass),
  CONSTRAINT "forecast_future_amount_pkey" PRIMARY KEY ("id")
);

COMMENT ON COLUMN "dx2"."forecast_future_amount"."source_id" IS '原始数据id';

COMMENT ON COLUMN "dx2"."forecast_future_amount"."shop_id" IS '门店id';

COMMENT ON COLUMN "dx2"."forecast_future_amount"."biz_date" IS '日期';

COMMENT ON COLUMN "dx2"."forecast_future_amount"."payment_amount_forecast" IS '预测支付金额';

COMMENT ON COLUMN "dx2"."forecast_future_amount"."status" IS '预测状态: 0-成功 1-失败';

COMMENT ON COLUMN "dx2"."forecast_future_amount"."create_time" IS '创建时间';

COMMENT ON COLUMN "dx2"."forecast_future_amount"."id" IS '主键';

```