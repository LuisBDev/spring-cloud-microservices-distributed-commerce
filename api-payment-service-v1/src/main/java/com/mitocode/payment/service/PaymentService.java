package com.mitocode.payment.service;

import com.mitocode.payment.client.VisaRestTemplateClient;
import com.mitocode.payment.domain.Charge;
import com.mitocode.payment.repository.ChargeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @author Luis Balarezo
 **/
@Service
@RequiredArgsConstructor
public class PaymentService {

    private final ChargeRepository chargeRepository;
    private final VisaRestTemplateClient visaClient;

    public void charge(Charge charge) {

        visaClient.charge(charge.getCardId(), charge.getAmount());

        chargeRepository.save(charge);
    }


}
