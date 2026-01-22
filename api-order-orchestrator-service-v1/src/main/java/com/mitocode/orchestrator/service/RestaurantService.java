package com.mitocode.orchestrator.service;

import com.mitocode.orchestrator.client.restaurants.RestaurantServiceV1WebClient;
import com.mitocode.orchestrator.controller.dto.CreateOrderOrchestratorRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class RestaurantService {

    private final RestaurantServiceV1WebClient restaurantClient;

    public void reserveRestaurant(UUID orderId, CreateOrderOrchestratorRequest createOrderRequest) {
        restaurantClient.reserverOrder(orderId, createOrderRequest);
    }
}
