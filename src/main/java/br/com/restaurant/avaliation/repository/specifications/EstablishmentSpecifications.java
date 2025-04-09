package br.com.restaurant.avaliation.repository.specifications;

import br.com.restaurant.avaliation.model.Establishment;
import br.com.restaurant.avaliation.model.dto.EstablishmentDTO;
import jakarta.persistence.criteria.Predicate;
import org.springframework.data.jpa.domain.Specification;

import java.util.ArrayList;
import java.util.List;

public class EstablishmentSpecifications {

    public static Specification<Establishment> filteringByDto(EstablishmentDTO filter) {
        return (root, query, builder) -> {
            List<Predicate> predicateList = new ArrayList<>();

            return builder.and(predicateList.toArray(Predicate[]::new));
        };
    }
}
