package com.mitocode.payment.client.dto.request;

import java.math.BigDecimal;

public record CheckBalanceRequest(String accountId, BigDecimal requiredAmount) {
}
