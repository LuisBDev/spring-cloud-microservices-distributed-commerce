package com.mitocode.order.infrastructure.repository;

import com.mitocode.order.infrastructure.entity.OrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

/**
 * @author Luis Balarezo
 **/
@Repository
public interface OrderRepositoryJPA extends JpaRepository<OrderEntity, UUID> {
}
