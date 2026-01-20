package com.mitocode.delivery.controller.mapper;

import com.mitocode.delivery.domain.Delivery;
import com.mitocode.delivery.domain.DeliveryPerson;
import com.mitocode.delivery.dto.AssignDriverRequest;
import com.mitocode.delivery.dto.DeliveryResponse;
import lombok.NoArgsConstructor;

/**
 * @author Luis Balarezo
 **/
@NoArgsConstructor
public class DeliveryControllerMapper {

    public static Delivery toDomain(AssignDriverRequest request) {

        Delivery domain = new Delivery();
        domain.setOrderId(request.orderId());
        domain.setAddress(request.deliveryAddress().address());
        domain.setLatitude(request.deliveryAddress().latitude());
        domain.setLongitude(request.deliveryAddress().longitude());
        domain.setReference(request.deliveryAddress().reference());
        domain.setDeliveryPerson(new DeliveryPerson(request.deliveryPerson().id()));

        return domain;
    }

    public static DeliveryResponse toResponse(Delivery delivery) {
        return new DeliveryResponse(
                delivery.getId(),
                delivery.getOrderId(),
                delivery.getAddress(),
                delivery.getStatus().name(),
                delivery.getDeliveryPerson().getName()
        );
    }
}
