package com.mitocode.order.mapper;

import com.mitocode.order.domain.Customer;
import com.mitocode.order.domain.Order;
import com.mitocode.order.domain.Restaurant;
import com.mitocode.order.infrastructure.entity.OrderEntity;

public class EntityToDomainMapper {

    public static Order toDomain(OrderEntity entity) {

//        return new Order(
//                entity.getId(),
//                Customer.of(entity.getCustomerId(), entity.getCustomerName()),
//                Restaurant.of(entity.getRestaurantId(), entity.getRestaurantName()),
//                entity.getTotal(),
//                entity.getStatus()
//        );

        return Order.builder()
                .id(entity.getId())
                .customer(Customer.builder()
                        .id(entity.getCustomerId())
                        .name(entity.getCustomerName())
                        .build())
                .restaurant(Restaurant.builder()
                        .id(entity.getRestaurantId())
                        .name(entity.getRestaurantName())
                        .build())
                .total(entity.getTotal())
                .status(entity.getStatus())
                .build();

    }
}
