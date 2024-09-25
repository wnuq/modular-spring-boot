CREATE SCHEMA car_sales;
CREATE SCHEMA customer;

CREATE TABLE car_sales.orders (
    id BIGSERIAL PRIMARY KEY,
    car_id BIGINT NOT NULL,
    customer_id BIGINT NOT NULL,
    status TEXT NOT NULL
);

CREATE TABLE customer.customers (
    id BIGSERIAL PRIMARY KEY,
    name TEXT NOT NULL,
    second_name TEXT NOT NULL,
    email TEXT NOT NULL
);