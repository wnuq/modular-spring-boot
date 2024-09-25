package com.github.wnuq.customer;

import com.github.wnuq.car.sales.OrderService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CustomerConfiguration {

    @Bean
    public CustomerService customerService(OrderService orderService, CustomerRepository customerRepository) {
        return new CustomerService(orderService, customerRepository);
    }
}
