package com.github.wnuq.car.sales.api;

import com.github.wnuq.car.sales.OrderStatus;

public record OrderDto(Long id, Long carId, Long customerId, OrderStatus status) {
}
