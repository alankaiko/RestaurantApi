package br.com.restaurant.avaliation.abstract_core.service.impl;

import br.com.restaurant.avaliation.abstract_core.model.AbstractDTO;
import br.com.restaurant.avaliation.abstract_core.model.AbstractEntity;
import br.com.restaurant.avaliation.abstract_core.repository.AbstractRepository;
import br.com.restaurant.avaliation.abstract_core.service.AbstractService;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public abstract class AbstractServiceImpl<T extends AbstractEntity, D extends AbstractDTO> implements AbstractService<T, D> {
    protected AbstractRepository<T, D, Long> dao;

    public AbstractServiceImpl(AbstractRepository<T, D, Long> dao) {
        this.dao = dao;
    }

    @Override
    public T saveEntity(T entity) {
        return this.dao.save(entity);
    }

    @Override
    public void deleteEntity(Long idCode) {
        this.dao.deleteById(idCode);
    }

    @Override
    public T findById(Long idCode) {
        return this.dao.findById(idCode).orElse((T) null);
    }

    @Override
    public List<T> listEntities() {
        return this.dao.findAll();
    }

    @Override
    public Page<T> filtering(D filter) {
        return this.dao.filtering(filter);
    }

}
