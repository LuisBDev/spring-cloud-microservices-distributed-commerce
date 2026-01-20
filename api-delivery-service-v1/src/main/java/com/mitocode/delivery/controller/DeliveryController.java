package com.mitocode.delivery.controller;

import com.mitocode.delivery.controller.mapper.DeliveryControllerMapper;
import com.mitocode.delivery.domain.Delivery;
import com.mitocode.delivery.dto.AssignDriverRequest;
import com.mitocode.delivery.dto.DeliveryResponse;
import com.mitocode.delivery.service.DeliveryService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

/**
 * @author Luis Balarezo
 **/
@RestController
@RequestMapping("/delivery")
public class DeliveryController {

    private final DeliveryService deliveryService;

    public DeliveryController(DeliveryService deliveryService) {
        this.deliveryService = deliveryService;
    }

    @PostMapping("/assign-driver")
    public ResponseEntity<DeliveryResponse> assignDriver(@RequestBody AssignDriverRequest request) {
        Delivery delivery = deliveryService.assignDriver(DeliveryControllerMapper.toDomain(request));
        return ResponseEntity.ok(DeliveryControllerMapper.toResponse(delivery));
    }

    @PostMapping("/{orderId}/start")
    public ResponseEntity<DeliveryResponse> startDelivery(@PathVariable UUID orderId) {
        Delivery delivery = deliveryService.startDelivery(orderId);
        return ResponseEntity.ok(DeliveryControllerMapper.toResponse(delivery));
    }

    @PostMapping("/{orderId}/complete")
    public ResponseEntity<DeliveryResponse> completeDelivery(@PathVariable UUID orderId) {
        Delivery delivery = deliveryService.completeDelivery(orderId);
        return ResponseEntity.ok(DeliveryControllerMapper.toResponse(delivery));
    }

}
