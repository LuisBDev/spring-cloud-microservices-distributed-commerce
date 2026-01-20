package com.mitocode.restaurant.infrastructure.repository;

import com.mitocode.restaurant.infrastructure.entity.OrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

/**
 * @author Luis Balarezo
 **/
public interface OrderJpaRepository extends JpaRepository<OrderEntity, UUID> {
}
