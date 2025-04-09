package br.com.restaurant.avaliation.model;

import br.com.restaurant.avaliation.core.model.AbstractEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Avaliation extends AbstractEntity {
    private Long note;

    private String coment;

    @ManyToOne
    @JoinColumn(name = "restaurant_id")
    private Establishment establishment;
}
