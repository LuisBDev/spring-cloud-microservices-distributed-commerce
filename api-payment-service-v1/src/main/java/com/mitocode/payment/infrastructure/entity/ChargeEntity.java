package com.mitocode.payment.infrastructure.entity;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

/**
 * @author Luis Balarezo
 **/
@Entity
@Getter
@Setter
@Table(name = "charges")
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ChargeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long cardId;
    private Long customerId;
    private BigDecimal amount;

}
