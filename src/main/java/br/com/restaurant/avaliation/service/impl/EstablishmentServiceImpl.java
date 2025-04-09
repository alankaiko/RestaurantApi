package br.com.restaurant.avaliation.service.impl;

import br.com.restaurant.avaliation.abstract_core.service.impl.AbstractServiceImpl;
import br.com.restaurant.avaliation.model.Establishment;
import br.com.restaurant.avaliation.model.dto.EstablishmentDTO;
import br.com.restaurant.avaliation.repository.EstablishmentRepository;
import br.com.restaurant.avaliation.service.EstablishmentService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class EstablishmentServiceImpl extends AbstractServiceImpl<Establishment, EstablishmentDTO> implements EstablishmentService {

    private final EstablishmentRepository repository;

    public EstablishmentServiceImpl(EstablishmentRepository repository) {
        super(repository);
        this.repository = repository;
    }
}
