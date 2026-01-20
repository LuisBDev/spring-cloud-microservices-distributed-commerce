package com.mitocode.delivery.repository;

import com.mitocode.delivery.domain.DeliveryPerson;
import com.mitocode.delivery.infrastructure.repository.DeliveryPersonRepositoryJpa;
import com.mitocode.delivery.repository.mapper.DeliveryPersonMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * @author Luis Balarezo
 **/
@Repository
@RequiredArgsConstructor
public class DeliveryPersonRepository {

    private final DeliveryPersonRepositoryJpa deliveryPersonRepository;

    public Optional<DeliveryPerson> getById(Long id) {
        return deliveryPersonRepository.findById(id).map(DeliveryPersonMapper::toDomain);
    }
}
