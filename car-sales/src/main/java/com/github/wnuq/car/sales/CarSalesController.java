package com.github.wnuq.car.sales;

import com.github.wnuq.car.sales.api.OrderDto;
import com.github.wnuq.car.sales.api.OrderFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class CarSalesController {

    @Autowired
    private OrderFacade orderFacade;

    @GetMapping("/all-orders")
    public List<OrderDto> getAllOrders() {
        return orderFacade.getOrders();
    }
}
