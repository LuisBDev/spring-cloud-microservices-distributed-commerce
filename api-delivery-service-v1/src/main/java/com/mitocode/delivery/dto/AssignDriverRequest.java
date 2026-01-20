package com.mitocode.delivery.dto;


import java.util.UUID;

public record AssignDriverRequest(
        UUID orderId,
        DeliveryAddressRequest deliveryAddress,
        DeliveryPersonRequest deliveryPerson
) {
}
