package com.mitocode.delivery.infrastructure.repository;

import com.mitocode.delivery.infrastructure.entity.DeliveryPersonEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Luis Balarezo
 **/
public interface DeliveryPersonRepositoryJpa extends JpaRepository<DeliveryPersonEntity, Long> {
}