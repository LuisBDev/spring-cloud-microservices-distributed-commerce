package com.mitocode.order.repository;

import com.mitocode.order.domain.Order;
import com.mitocode.order.infrastructure.entity.OrderEntity;
import com.mitocode.order.infrastructure.repository.OrderRepositoryJPA;
import com.mitocode.order.mapper.DomainToEntityMapper;
import com.mitocode.order.mapper.EntityToDomainMapper;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

/**
 * @author Luis Balarezo
 **/
@Repository
public class OrderRepository {

    private final OrderRepositoryJPA orderRepository;

    public OrderRepository(OrderRepositoryJPA orderRepository) {
        this.orderRepository = orderRepository;
    }


    public Optional<Order> findById(UUID id) {
        return orderRepository.findById(id)
                .map(EntityToDomainMapper::toDomain);
    }

    public Order save(Order order) {
        OrderEntity entity = DomainToEntityMapper.toEntity(order);

        OrderEntity savedEntity = orderRepository.save(entity);

        return EntityToDomainMapper.toDomain(savedEntity);
    }


}
