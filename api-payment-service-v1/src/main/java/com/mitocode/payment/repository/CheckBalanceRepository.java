package com.mitocode.payment.repository;

import com.mitocode.payment.domain.CheckBalance;
import com.mitocode.payment.infrastructure.entity.CheckBalanceEntity;
import com.mitocode.payment.infrastructure.repository.CheckBalanceRepositoryJPA;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

/**
 * @author Luis Balarezo
 **/
@Repository
@RequiredArgsConstructor
public class CheckBalanceRepository {

    private final CheckBalanceRepositoryJPA checkBalanceRepositoryJPA;

    public boolean saveCheckResult(CheckBalance checkBalance, boolean hasFunds) {

        CheckBalanceEntity checkBalanceEntity = CheckBalanceEntity.builder()
                .id(checkBalance.getId())
                .customerId(checkBalance.getCustomerId())
                .cardId(checkBalance.getCardId())
                .requiredAmount(checkBalance.getRequiredAmount())
                .build();

        checkBalanceRepositoryJPA.save(checkBalanceEntity);
        return hasFunds;
    }


}
