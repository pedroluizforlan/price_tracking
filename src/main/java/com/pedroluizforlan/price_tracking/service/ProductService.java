package com.pedroluizforlan.price_tracking.service;

import com.pedroluizforlan.price_tracking.model.Product;
import com.pedroluizforlan.price_tracking.service.crud.CrudService;

import java.util.List;

public interface ProductService extends CrudService<String,Product> {
    List<Product> findByCategory(String categoryId);
    List<Product> findByActiveTrue();
}
