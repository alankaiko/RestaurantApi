package br.com.restaurant.avaliation.repository;

import br.com.restaurant.avaliation.abstract_core.repository.AbstractRepository;
import br.com.restaurant.avaliation.model.Avaliation;
import br.com.restaurant.avaliation.model.dto.AvaliationDTO;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface AvaliationRepository extends AbstractRepository<Avaliation, AvaliationDTO, Long> {
}
