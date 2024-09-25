package com.github.wnuq.car.sales;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;

import static com.github.wnuq.car.sales.OrderStatus.DRAFT;

@Entity
@Table(name = "orders", schema = "car_sales")
@Getter
@NoArgsConstructor
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long carId;
    private Long customerId;
    @Enumerated(EnumType.STRING)
    private OrderStatus status;

    public Order(Long carId, Long customerId) {
        this.carId = carId;
        this.customerId = customerId;
        this.status = DRAFT;
    }

    public void moneyReceived() {
        if(this.status != DRAFT) {
            throw new IllegalStateException("Order is completed or customer has paid");
        }

        this.status = OrderStatus.PAYMENT_COMPLETED;
    }

    public void complete() {
        if(this.status != OrderStatus.PAYMENT_COMPLETED) {
            throw new IllegalStateException("Order is not paid or completed");
        }

        this.status = OrderStatus.COMPLETED;
    }
}
