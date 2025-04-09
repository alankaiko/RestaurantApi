package br.com.restaurant.avaliation.repository.specifications;

import br.com.restaurant.avaliation.model.Avaliation;
import br.com.restaurant.avaliation.model.dto.AvaliationDTO;
import jakarta.persistence.criteria.Predicate;
import org.springframework.data.jpa.domain.Specification;

import java.util.ArrayList;
import java.util.List;

public class AvaliationSpecifications {

    public static Specification<Avaliation> filteringByDto(AvaliationDTO filter) {
        return (root, query, builder) -> {
            List<Predicate> predicateList = new ArrayList<>();

            return builder.and(predicateList.toArray(Predicate[]::new));
        };
    }
}
