package br.com.restaurant.avaliation.repository;

import br.com.restaurant.avaliation.abstract_core.repository.AbstractRepository;
import br.com.restaurant.avaliation.model.Establishment;
import br.com.restaurant.avaliation.model.dto.EstablishmentDTO;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface EstablishmentRepository extends AbstractRepository<Establishment, EstablishmentDTO, Long> {
}
