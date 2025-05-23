package com.pedroluizforlan.price_tracking.service.crud;

import java.util.List;

public interface CrudService<ID, T> {
    T create(T document);
    List<T> findAll();
    T findById(ID id);
    T update(ID id, T document);
    void delete(ID id);
}
