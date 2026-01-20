package com.mitocode.order.service;

import com.mitocode.order.domain.Order;
import com.mitocode.order.repository.OrderRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

/**
 * @author Luis Balarezo
 **/
@Service
public class OrderService {

    private final OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Transactional
    public Order create(Order domain) {

        domain.setId(UUID.randomUUID());

        return orderRepository.save(domain);
    }
}
