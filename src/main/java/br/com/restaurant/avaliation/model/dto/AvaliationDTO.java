package br.com.restaurant.avaliation.model.dto;

import br.com.restaurant.avaliation.core.model.AbstractDTO;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AvaliationDTO extends AbstractDTO {
    private Long establishmentIdCode;
}
