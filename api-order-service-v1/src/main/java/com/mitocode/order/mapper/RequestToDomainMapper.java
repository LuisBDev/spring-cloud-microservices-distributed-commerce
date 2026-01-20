package com.mitocode.order.mapper;

import com.mitocode.order.domain.Customer;
import com.mitocode.order.domain.Order;
import com.mitocode.order.domain.OrderStatus;
import com.mitocode.order.domain.Restaurant;
import com.mitocode.order.dto.request.CreateOrderRequest;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class RequestToDomainMapper {

    public static Order toDomain(CreateOrderRequest req) {

        Order order = myWayBuildOrderDomain(req);
        return order;

    }

    private static Order professorWayBuildOrderDomain(CreateOrderRequest req) {
        return Order.createNew(
                Customer.of(req.customer().id(), req.customer().name()),
                Restaurant.of(req.restaurant().id(), req.restaurant().name()),
                req.total()
        );
    }

    private static Order myWayBuildOrderDomain(CreateOrderRequest req) {
        return Order.builder()
                .id(null)
                .customer(Customer.builder()
                        .id(req.customer().id())
                        .name(req.customer().name())
                        .build())
                .restaurant(Restaurant.builder()
                        .id(req.restaurant().id())
                        .name(req.restaurant().name())
                        .build())
                .status(OrderStatus.CREATED)
                .total(req.total())
                .build();
    }

}
