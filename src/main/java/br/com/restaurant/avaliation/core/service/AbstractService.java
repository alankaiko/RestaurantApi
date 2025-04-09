package br.com.restaurant.avaliation.core.service;

import br.com.restaurant.avaliation.core.model.AbstractDTO;
import br.com.restaurant.avaliation.core.model.AbstractEntity;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface AbstractService<T extends AbstractEntity, D extends AbstractDTO> {
    T salvar(T entidade);

    void deletar(Long codigo);

    T buscarId(Long codigo);

    List<T> listar();

    ResponseEntity<?> imprimir(Long codigo);

    Page<T> filtering(D filter);

}
