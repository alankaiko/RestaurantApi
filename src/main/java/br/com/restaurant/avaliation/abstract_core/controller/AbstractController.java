package br.com.restaurant.avaliation.abstract_core.controller;

import br.com.restaurant.avaliation.abstract_core.model.AbstractDTO;
import br.com.restaurant.avaliation.abstract_core.model.AbstractEntity;
import br.com.restaurant.avaliation.abstract_core.service.AbstractService;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

public abstract class AbstractController<T extends AbstractEntity, D extends AbstractDTO> {
    private final AbstractService<T, D> service;

    public AbstractController(AbstractService<T, D> service) {
        this.service = service;
    }

    @PostMapping
    public T saveEntity(@Valid @RequestBody T entity) {
        return this.service.saveEntity(entity);
    }

    @DeleteMapping
    public void deleteEntity(@PathVariable Long idCode) {
        this.service.deleteEntity(idCode);
    }

    @GetMapping({"{codigo}"})
    public T findById(@PathVariable Long idCode) {
        return this.service.findById(idCode);
    }

    @GetMapping
    public List<T> listEntities() {
        return this.service.listEntities();
    }

    @PostMapping("listarPaginado")
    public Page<T> filtering(@RequestBody D filter) {
        return this.service.filtering(filter);
    }

}
