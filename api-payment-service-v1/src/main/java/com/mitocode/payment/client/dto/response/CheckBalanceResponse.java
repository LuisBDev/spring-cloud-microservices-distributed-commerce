package com.mitocode.payment.client.dto.response;

import java.math.BigDecimal;

public record CheckBalanceResponse(String accountId, BigDecimal balance, boolean sufficient) {
}
