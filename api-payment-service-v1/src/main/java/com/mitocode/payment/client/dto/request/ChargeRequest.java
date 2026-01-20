package com.mitocode.payment.client.dto.request;

import java.math.BigDecimal;

public record ChargeRequest(String accountId, BigDecimal amount) {
}
