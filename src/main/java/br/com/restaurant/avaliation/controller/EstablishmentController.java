package br.com.restaurant.avaliation.controller;

import br.com.restaurant.avaliation.core.controller.AbstractController;
import br.com.restaurant.avaliation.model.Establishment;
import br.com.restaurant.avaliation.model.dto.EstablishmentDTO;
import br.com.restaurant.avaliation.service.EstablishmentService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = EstablishmentController.PATH)
public class EstablishmentController extends AbstractController<Establishment, EstablishmentDTO> {

    static final String PATH = "establishmentController";

    private final EstablishmentService service;

    public EstablishmentController(EstablishmentService service) {
        super(service);
        this.service = service;
    }

}
