package com.mitocode.restaurant.domain;

import lombok.*;

/**
 * @author Luis Balarezo
 **/
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Restaurant {
    private Long id;
    private String name;

}
