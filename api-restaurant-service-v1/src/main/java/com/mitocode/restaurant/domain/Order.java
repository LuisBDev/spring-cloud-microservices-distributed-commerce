package com.mitocode.restaurant.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.UUID;

/**
 * @author Luis Balarezo
 **/
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Order {
    private UUID orderId;
    private Restaurant restaurant;
    private Customer customer;
    private List<OrderItem> items;
}
