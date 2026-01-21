package com.mitocode.orchestrator.client.orders;

import com.mitocode.orchestrator.client.orders.dto.CreateOrderRequest;
import com.mitocode.orchestrator.client.orders.dto.CreateOrderResponse;
import com.mitocode.orchestrator.client.orders.dto.CustomerRequest;
import com.mitocode.orchestrator.client.orders.dto.RestaurantRequest;
import com.mitocode.orchestrator.controller.dto.CreateOrderOrchestratorRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClient;

/**
 * @author Luis Balarezo
 **/
@Component
@RequiredArgsConstructor
public class OrderServiceV1RestClient {

    private final RestClient orderRestClient;

    public CreateOrderResponse createOrder(CreateOrderOrchestratorRequest createOrderOrchestratorRequest) {

        CreateOrderRequest request = new CreateOrderRequest(
                new CustomerRequest(createOrderOrchestratorRequest.customer().id(), createOrderOrchestratorRequest.customer().name()),
                new RestaurantRequest(createOrderOrchestratorRequest.restaurant().id(), createOrderOrchestratorRequest.restaurant().name()),
                createOrderOrchestratorRequest.total()
        );

        return orderRestClient.post()
                .uri("/orders")
                .body(request)
                .retrieve()
                .body(CreateOrderResponse.class);

    }


}
