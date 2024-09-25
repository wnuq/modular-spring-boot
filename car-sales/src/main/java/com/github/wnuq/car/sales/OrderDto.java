package com.github.wnuq.car.sales;

public record OrderDto(Long id, Long carId, OrderStatus status) {
}
