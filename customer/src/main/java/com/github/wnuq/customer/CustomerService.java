package com.github.wnuq.customer;

import com.github.wnuq.car.sales.api.OrderDto;
import com.github.wnuq.car.sales.api.OrderFacade;
import lombok.AllArgsConstructor;

import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
public class CustomerService {

    private OrderFacade orderFacade;

    private CustomerRepository customerRepository;

    public void createCustomer(CustomerDto customerDto) {
        Customer customer = Customer.builder()
                .name(customerDto.name())
                .secondName(customerDto.secondName())
                .email(customerDto.email())
                .build();
        customerRepository.save(customer);
    }

    public List<OrderDto> getCustomerOrders(Long customerId) {
        return orderFacade.getOrders().stream()
                .filter(order -> order.customerId().equals(customerId))
                .collect(Collectors.toList());
    }
}
