package com.mitocode.payment.infrastructure.entity;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.util.UUID;

/**
 * @author Luis Balarezo
 **/
@Entity
@Getter
@Setter
@Table(name = "check_balance")
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CheckBalanceEntity {

    @Id
    private UUID id;

    private Long customerId;
    private Long cardId;
    private BigDecimal requiredAmount;
    private boolean hasSufficientFunds;


}
