package com.mitocode.payment.dto.request;

import java.math.BigDecimal;

public record CheckBalanceRequest(Long customerId, Long cardId, BigDecimal requiredAmount) {
}
