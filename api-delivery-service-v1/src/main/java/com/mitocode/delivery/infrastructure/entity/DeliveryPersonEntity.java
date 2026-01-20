package com.mitocode.delivery.infrastructure.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

/**
 * @author Luis Balarezo
 **/
@Data
@Entity
@Table(name = "delivery_persons")
public class DeliveryPersonEntity {

    @Id
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String phoneNumber;

    @Column(nullable = false)
    private String vehicleType;

    private String licensePlate;

}