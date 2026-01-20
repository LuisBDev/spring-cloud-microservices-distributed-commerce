package com.mitocode.order.mapper;

import com.mitocode.order.domain.Order;
import com.mitocode.order.infrastructure.entity.OrderEntity;

public class DomainToEntityMapper {

    public static OrderEntity toEntity(Order domain) {

        return OrderEntity.builder()
                .id(domain.getId())
                .customerId(domain.getCustomer().getId())
                .customerName(domain.getCustomer().getName())
                .restaurantId(domain.getRestaurant().getId())
                .restaurantName(domain.getRestaurant().getName())
                .total(domain.getTotal())
                .status(domain.getStatus())
                .build();

    }

}
