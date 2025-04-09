package br.com.restaurant.avaliation.model;

import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Embeddable
public class Contact {
    private String phone;

    private String phone2;

    private String cellPhone;

    private String email;
}
