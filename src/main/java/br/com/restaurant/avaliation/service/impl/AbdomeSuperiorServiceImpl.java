package br.com.restaurant.avaliation.service.impl;

import br.com.restaurant.avaliation.core.service.impl.AbstractServiceImpl;
import br.com.restaurant.avaliation.model.Avaliation;
import br.com.restaurant.avaliation.model.dto.AvaliationDTO;
import br.com.restaurant.avaliation.repository.AvaliationRepository;
import br.com.restaurant.avaliation.service.AvaliationService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class AbdomeSuperiorServiceImpl extends AbstractServiceImpl<Avaliation, AvaliationDTO> implements AvaliationService {

    private final AvaliationRepository repository;

    public AbdomeSuperiorServiceImpl(AvaliationRepository repository) {
        super(repository);
        this.repository = repository;
    }
}
