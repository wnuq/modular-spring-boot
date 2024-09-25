package com.github.wnuq.car.sales;

import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class OrderService {

    private final OrderRepository orderRepository;

    public List<OrderDto> getOrders() {
        return orderRepository.findAll().stream()
                .map(order -> new OrderDto(
                        order.getId(),
                        order.getCarId(),
                        order.getStatus()
                ))
                .toList();
    }
}
