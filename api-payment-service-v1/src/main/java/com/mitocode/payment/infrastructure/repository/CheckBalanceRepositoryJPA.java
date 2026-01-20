package com.mitocode.payment.infrastructure.repository;

import com.mitocode.payment.infrastructure.entity.CheckBalanceEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

/**
 * @author Luis Balarezo
 **/
@Repository
public interface CheckBalanceRepositoryJPA extends JpaRepository<CheckBalanceEntity, UUID> {
}
