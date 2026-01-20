package com.mitocode.delivery.infrastructure.entity;

import com.mitocode.delivery.domain.DeliveryStatus;
import jakarta.persistence.*;
import lombok.Data;

import java.util.UUID;

/**
 * @author Luis Balarezo
 **/
@Data
@Entity
@Table(name = "deliveries")
public class DeliveryEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private UUID orderId;

    @Column(nullable = false)
    private String address;

    @Column(nullable = false)
    private Double latitude;

    @Column(nullable = false)
    private Double longitude;

    @Column(nullable = true)
    private String reference;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "delivery_person_id", nullable = false)
    private DeliveryPersonEntity deliveryPerson;

    @Enumerated(EnumType.STRING)
    private DeliveryStatus status;

}