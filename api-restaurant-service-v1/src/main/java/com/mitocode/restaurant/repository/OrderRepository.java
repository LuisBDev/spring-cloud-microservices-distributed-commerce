package com.mitocode.restaurant.repository;

import com.mitocode.restaurant.domain.Order;
import com.mitocode.restaurant.infrastructure.entity.OrderEntity;
import com.mitocode.restaurant.infrastructure.repository.OrderJpaRepository;
import com.mitocode.restaurant.repository.mapper.OrderRepositoryMapper;
import org.springframework.stereotype.Repository;

/**
 * @author Luis Balarezo
 **/
@Repository
public class OrderRepository {

    private final OrderJpaRepository jpaRepository;
    private final OrderRepositoryMapper mapper;

    public OrderRepository(OrderJpaRepository jpaRepository, OrderRepositoryMapper mapper) {
        this.jpaRepository = jpaRepository;
        this.mapper = mapper;
    }

    public Order save(Order order) {
        OrderEntity entity = mapper.toEntity(order);
        OrderEntity saved = jpaRepository.save(entity);
        return mapper.toDomain(saved);
    }
}
