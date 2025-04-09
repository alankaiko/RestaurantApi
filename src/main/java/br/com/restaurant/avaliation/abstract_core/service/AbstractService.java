package br.com.restaurant.avaliation.abstract_core.service;

import br.com.restaurant.avaliation.abstract_core.model.AbstractDTO;
import br.com.restaurant.avaliation.abstract_core.model.AbstractEntity;
import org.springframework.data.domain.Page;

import java.util.List;

public interface AbstractService<T extends AbstractEntity, D extends AbstractDTO> {
    T saveEntity(T entity);

    void deleteEntity(Long entity);

    T findById(Long idCode);

    List<T> listEntities();

    Page<T> filtering(D filter);

}
