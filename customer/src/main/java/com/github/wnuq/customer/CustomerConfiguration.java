package com.github.wnuq.customer;

import com.github.wnuq.car.sales.api.OrderFacade;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CustomerConfiguration {

    @Bean
    public CustomerService customerService(OrderFacade orderFacade, CustomerRepository customerRepository) {
        return new CustomerService(orderFacade, customerRepository);
    }
}
