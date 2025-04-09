package br.com.restaurant.avaliation.model;

import br.com.restaurant.avaliation.core.model.AbstractEntity;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Establishment extends AbstractEntity {
    private String name;

    private Contact contact;

    private Address address;

    private Double latitude;

    private Double longitude;

    private String imageUrl;

    @OneToMany(mappedBy = "establishment", cascade = CascadeType.ALL)
    private List<Avaliation> avaliations;
}
