package com.github.wnuq.car.sales;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class CarSalesController {

    @Autowired
    private OrderService orderService;

    @GetMapping("/all-orders")
    public List<OrderDto> getAllOrders() {
        return orderService.getOrders();
    }
}
