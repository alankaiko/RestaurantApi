package br.com.restaurant.avaliation.controller;

import br.com.restaurant.avaliation.core.controller.AbstractController;
import br.com.restaurant.avaliation.model.Avaliation;
import br.com.restaurant.avaliation.model.dto.AvaliationDTO;
import br.com.restaurant.avaliation.service.AvaliationService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = AvaliationController.PATH)
public class AvaliationController extends AbstractController<Avaliation, AvaliationDTO> {

    static final String PATH = "avaliationController";

    private final AvaliationService service;

    public AvaliationController(AvaliationService service) {
        super(service);
        this.service = service;
    }

}
