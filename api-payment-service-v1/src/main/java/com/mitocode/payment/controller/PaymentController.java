package com.mitocode.payment.controller;

import com.mitocode.payment.domain.Charge;
import com.mitocode.payment.dto.request.ChargeRequest;
import com.mitocode.payment.service.PaymentService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Luis Balarezo
 **/
@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/payments")
public class PaymentController {

    private final PaymentService service;

    @PostMapping("/charge")
    public void charge(@RequestBody ChargeRequest chargeRequest) {
        log.info("Charging amount");
        // request -> dominio
        Charge charge = new Charge(chargeRequest.customerId(), chargeRequest.cardId(), chargeRequest.amount());
        service.charge(charge);
    }

}


