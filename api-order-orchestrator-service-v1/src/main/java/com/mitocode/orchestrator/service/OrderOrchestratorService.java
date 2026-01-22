package com.mitocode.orchestrator.service;

import com.mitocode.orchestrator.client.orders.restclient.dto.CreateOrderResponse;
import com.mitocode.orchestrator.controller.dto.CreateOrderOrchestratorRequest;
import com.mitocode.orchestrator.controller.dto.CreateOrderOrchestratorResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderOrchestratorService {

    private final OrderService orderService;
    private final PaymentService paymentService;
//    private final RestaurantService restaurantService;
//    private final DeliveryService deliveryService;

    public CreateOrderOrchestratorResponse createOrder(CreateOrderOrchestratorRequest request) {

        CreateOrderResponse orderCreated = orderService.createOrder(request);

        paymentService.checkBalance(request.customer().id(), request.card().id(), request.total());

        paymentService.charge(request.customer().id(), request.card().id(), request.total());


        return new CreateOrderOrchestratorResponse(orderCreated.id());
    }

}
