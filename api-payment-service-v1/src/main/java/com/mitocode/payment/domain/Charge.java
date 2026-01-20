package com.mitocode.payment.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;

/**
 * @author Luis Balarezo
 **/
@Data
@AllArgsConstructor
public class Charge {
    private final Long customerId;
    private final Long cardId;
    private final BigDecimal amount;
}
