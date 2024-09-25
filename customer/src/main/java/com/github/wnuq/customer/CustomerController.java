package com.github.wnuq.customer;

import com.github.wnuq.car.sales.OrderDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping("/customer-orders/{customerId}")
    public List<OrderDto> getAllOrders(@PathVariable Long customerId) {
        return customerService.getCustomerOrders(customerId);
    }
}
