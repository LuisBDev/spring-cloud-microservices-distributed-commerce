package com.mitocode.order.controller;

import com.mitocode.order.domain.Order;
import com.mitocode.order.dto.request.CreateOrderRequest;
import com.mitocode.order.dto.response.OrderResponse;
import com.mitocode.order.mapper.DomainToResponseMapper;
import com.mitocode.order.mapper.RequestToDomainMapper;
import com.mitocode.order.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Luis Balarezo
 **/
@RestController
@RequestMapping("/orders")
@RequiredArgsConstructor
public class OrderController {

    private final OrderService orderService;

    @PostMapping
    public ResponseEntity<OrderResponse> createOrder(@RequestBody CreateOrderRequest createOrderRequest) {

        Order order = RequestToDomainMapper.toDomain(createOrderRequest);
        Order createdOrder = orderService.create(order);

        OrderResponse orderResponse = DomainToResponseMapper.toResponse(createdOrder);

        return ResponseEntity.status(HttpStatus.CREATED).body(orderResponse);
    }

}
