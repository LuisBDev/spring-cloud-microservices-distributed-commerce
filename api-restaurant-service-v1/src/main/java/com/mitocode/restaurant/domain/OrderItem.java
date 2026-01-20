package com.mitocode.restaurant.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

/**
 * @author Luis Balarezo
 **/
@Getter
@Setter
@Builder
@RequiredArgsConstructor
public class OrderItem {
    private final Long productId;
    private final String productName;
    private final int quantity;
    private final String description;
}
