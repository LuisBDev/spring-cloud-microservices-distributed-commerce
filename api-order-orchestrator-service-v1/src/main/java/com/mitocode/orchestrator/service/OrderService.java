package com.mitocode.orchestrator.service;

import com.mitocode.orchestrator.client.orders.restclient.OrderServiceV1RestClient;
import com.mitocode.orchestrator.client.orders.restclient.dto.CreateOrderResponse;
import com.mitocode.orchestrator.controller.dto.CreateOrderOrchestratorRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderService {

    private final OrderServiceV1RestClient orderServiceV1RestClient;

    public CreateOrderResponse createOrder(CreateOrderOrchestratorRequest createOrderOrchestratorRequest) {
        return orderServiceV1RestClient.createOrder(createOrderOrchestratorRequest);
    }


}
