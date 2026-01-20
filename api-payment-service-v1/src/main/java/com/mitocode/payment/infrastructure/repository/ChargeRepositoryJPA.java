package com.mitocode.payment.infrastructure.repository;

import com.mitocode.payment.infrastructure.entity.ChargeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Luis Balarezo
 **/
@Repository
public interface ChargeRepositoryJPA extends JpaRepository<ChargeEntity, Long> {
}
