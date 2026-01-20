package com.mitocode.order.domain;

import lombok.*;

import java.math.BigDecimal;
import java.util.UUID;

/**
 * @author Luis Balarezo
 **/
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Order {

    private UUID id;
    private Customer customer;
    private Restaurant restaurant;
    private BigDecimal total;
    private OrderStatus status;

    // Factory for creation
    public static Order createNew(Customer customer, Restaurant restaurant, BigDecimal total) {
        return new Order(null, customer, restaurant, total, OrderStatus.CREATED);
    }


}
