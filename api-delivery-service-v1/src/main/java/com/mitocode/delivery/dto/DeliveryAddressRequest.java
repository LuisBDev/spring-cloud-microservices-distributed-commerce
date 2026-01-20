package com.mitocode.delivery.dto;

public record DeliveryAddressRequest(
        String address,
        Double latitude,
        Double longitude,
        String reference
) {
}
