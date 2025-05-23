package com.pedroluizforlan.price_tracking.service.impl;

import com.pedroluizforlan.price_tracking.model.Product;
import com.pedroluizforlan.price_tracking.repository.ProductRepository;
import com.pedroluizforlan.price_tracking.service.ProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    @Transactional(readOnly = true)
    public List<Product> findByCategoryId(String categoryId) {
        return productRepository.findByCategoryId(categoryId);
    }

    @Override
    public List<Product> findByActiveTrue() {
        return productRepository.findByActiveTrue();
    }

    @Override
    public Product create(Product document) {
        return productRepository.save(document);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Product> findAll() {
        return productRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Product findById(String s) {
        return productRepository.findById(s);
    }

    @Override
    public Product update(String s, Product document) {
        Product productUpdate = productRepository.findById(s);
        return productRepository.save(this.updateProduct(productUpdate));
    }

    @Override
    public void delete(String s) {
        productRepository.delete(productRepository.findById(s));
    }


    private Product updateProduct(Product product){
        Product p = new Product();
        p.setName(product.getName());
        p.setUrl(product.getUrl());
        p.setCategoryId(product.getCategoryId());
        p.setStore(product.getStore());
        p.setImageUrl(product.getImageUrl());
        p.setActive(product.getActive());
        p.setLastPrice(product.getLastPrice());
        return p;
    }
}
