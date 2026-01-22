package com.mitocode.orchestrator.client.orders.httpexchange;

import com.mitocode.orchestrator.client.orders.restclient.dto.CreateOrderRequest;
import com.mitocode.orchestrator.client.orders.restclient.dto.CreateOrderResponse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.service.annotation.HttpExchange;

@HttpExchange("/v1")
public interface OrderServiceV1HttpExchangeClient {

    @PostMapping("/orders")
    CreateOrderResponse create(@RequestBody CreateOrderRequest request);
}
