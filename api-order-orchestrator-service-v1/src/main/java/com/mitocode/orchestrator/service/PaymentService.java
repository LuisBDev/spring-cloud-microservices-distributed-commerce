package com.mitocode.orchestrator.service;

import com.mitocode.orchestrator.client.payments.PaymentServiceV1FeignClient;
import com.mitocode.orchestrator.client.payments.dto.ChargeRequest;
import com.mitocode.orchestrator.client.payments.dto.CheckBalanceRequest;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
@Slf4j
@RequiredArgsConstructor
public class PaymentService {

    private final PaymentServiceV1FeignClient paymentServiceClient;

    public void checkBalance(Long customerId, Long cardId, BigDecimal amount) {

        log.info("Checking balance for customer ID: {} and card ID: {}, and amount : {}", customerId, cardId, amount);

        CheckBalanceRequest request = new CheckBalanceRequest(customerId, cardId, amount);
        ResponseEntity<Void> response = paymentServiceClient.checkBalance(request);

        if (response.getStatusCode().is4xxClientError()) {
            throw new RuntimeException("Insufficient balance for customer ID: " + customerId + " and card ID: " + cardId);
        }

        log.info("Sufficient funds available for customer ID: {} and card ID: {}, and amount : {}", customerId, cardId, amount);
    }

    public void charge(Long customerId, Long cardId, BigDecimal amount) {

        log.info("Charging amount for customer ID: {} and card ID: {}, and amount : {}", customerId, cardId, amount);

        ChargeRequest request = new ChargeRequest(customerId, cardId, amount);
        ResponseEntity<Void> response = paymentServiceClient.charge(request);

        if (response.getStatusCode().isError()) {
            throw new RuntimeException("Error charging amount for customer ID: " + customerId + " and card ID: " + cardId);
        }

    }


}
