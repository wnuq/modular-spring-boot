package com.github.wnuq.car.sales;

import com.github.wnuq.car.sales.api.OrderFacade;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OrderConfiguration {

    @Bean
    public OrderFacade orderService(OrderRepository orderRepository) {
        return new OrderFacade(orderRepository);
    }
}
