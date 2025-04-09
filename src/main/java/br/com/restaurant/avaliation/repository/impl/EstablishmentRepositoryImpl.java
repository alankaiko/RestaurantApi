package br.com.restaurant.avaliation.repository.impl;

import br.com.restaurant.avaliation.abstract_core.repository.impl.AbstractRepositoryImpl;
import br.com.restaurant.avaliation.model.Establishment;
import br.com.restaurant.avaliation.model.dto.EstablishmentDTO;
import br.com.restaurant.avaliation.repository.EstablishmentRepository;
import jakarta.persistence.EntityManager;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional(readOnly = true)
public class EstablishmentRepositoryImpl extends AbstractRepositoryImpl<Establishment, EstablishmentDTO, Long> implements EstablishmentRepository {
    private final EntityManager entityManager;

    public EstablishmentRepositoryImpl(EntityManager entityManager) {
        super(Establishment.class, entityManager);
        this.entityManager = entityManager;
    }

}
