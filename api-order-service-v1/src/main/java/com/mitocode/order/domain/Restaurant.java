package com.mitocode.order.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * @author Luis Balarezo
 **/
@Getter
@Setter
@AllArgsConstructor(staticName = "of")
public class Restaurant {

    private Long id;
    private String name;
}
