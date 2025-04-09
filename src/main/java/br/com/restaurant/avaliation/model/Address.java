package br.com.restaurant.avaliation.model;

import br.com.restaurant.avaliation.model.enuns.EnumState;
import jakarta.persistence.Embeddable;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Embeddable
public class Address {
    private String street;

    private String complement;

    private String neighborhood;

    private String city;

    @Enumerated(EnumType.STRING)
    private EnumState state;

    private String cep;

    private String number;
}
