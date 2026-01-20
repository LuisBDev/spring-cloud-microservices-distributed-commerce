package com.mitocode.payment.dto.request;

import java.math.BigDecimal;

public record ChargeRequest(Long customerId, Long cardId, BigDecimal amount) {
}

