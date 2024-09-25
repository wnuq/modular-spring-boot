package com.github.wnuq.car.sales.api;

import com.github.wnuq.car.sales.OrderRepository;
import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class OrderFacade {

    private final OrderRepository orderRepository;

    public List<OrderDto> getOrders() {
        return orderRepository.findAll().stream()
                .map(order -> new OrderDto(
                        order.getId(),
                        order.getCarId(),
                        order.getCustomerId(),
                        order.getStatus()
                ))
                .toList();
    }
}
