CREATE SCHEMA car_sales;

CREATE TABLE car_sales.orders (
    id BIGSERIAL PRIMARY KEY,
    car_id BIGINT NOT NULL,
    customer_id BIGINT NOT NULL,
    status TEXT NOT NULL
);