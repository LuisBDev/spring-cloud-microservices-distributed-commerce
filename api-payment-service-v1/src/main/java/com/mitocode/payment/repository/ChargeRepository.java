package com.mitocode.payment.repository;

import com.mitocode.payment.domain.Charge;
import com.mitocode.payment.infrastructure.entity.ChargeEntity;
import com.mitocode.payment.infrastructure.repository.ChargeRepositoryJPA;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

/**
 * @author Luis Balarezo
 **/
@Repository
@RequiredArgsConstructor
public class ChargeRepository {

    private final ChargeRepositoryJPA repository;

    public void save(Charge charge) {
        // convertir dominio -> entidad

        ChargeEntity chargeEntity = ChargeEntity.builder()
                .customerId(charge.getCustomerId())
                .cardId(charge.getCardId())
                .amount(charge.getAmount())
                .build();

        repository.save(chargeEntity);
    }
}

