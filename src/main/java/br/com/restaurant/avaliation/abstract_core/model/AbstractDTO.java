package br.com.restaurant.avaliation.abstract_core.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

@Getter
@Setter
public class AbstractDTO implements Pageable {
    private int page;

    private int itensPage;

    @Override
    public int getPageNumber() {
        return this.getPage();
    }

    @Override
    public int getPageSize() {
        return this.getItensPage();
    }

    @Override
    public long getOffset() {
        return this.itensPage * this.getPage();
    }

    @Override
    public Sort getSort() {
        return Sort.by("id_code").ascending();
    }

    @Override
    public Pageable next() {
        return null;
    }

    @Override
    public Pageable previousOrFirst() {
        return null;
    }

    @Override
    public Pageable first() {
        return null;
    }

    @Override
    public Pageable withPage(int pageNumber) {
        return null;
    }

    @Override
    public boolean hasPrevious() {
        return false;
    }
}
