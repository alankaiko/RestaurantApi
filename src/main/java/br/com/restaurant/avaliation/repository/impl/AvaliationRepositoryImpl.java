package br.com.restaurant.avaliation.repository.impl;

import br.com.restaurant.avaliation.abstract_core.repository.impl.AbstractRepositoryImpl;
import br.com.restaurant.avaliation.model.Avaliation;
import br.com.restaurant.avaliation.model.dto.AvaliationDTO;
import br.com.restaurant.avaliation.repository.AvaliationRepository;
import jakarta.persistence.EntityManager;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional(readOnly = true)
public class AvaliationRepositoryImpl extends AbstractRepositoryImpl<Avaliation, AvaliationDTO, Long> implements AvaliationRepository {
    private final EntityManager entityManager;

    public AvaliationRepositoryImpl(EntityManager entityManager) {
        super(Avaliation.class, entityManager);
        this.entityManager = entityManager;
    }

}
