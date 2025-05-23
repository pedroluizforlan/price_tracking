package com.pedroluizforlan.price_tracking.service.impl;

import com.pedroluizforlan.price_tracking.model.Category;
import com.pedroluizforlan.price_tracking.repository.CategoryRepository;
import com.pedroluizforlan.price_tracking.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public Category create(Category document) {
        return categoryRepository.save(document);
    }

    @Override
    public List<Category> findAll() {
        return categoryRepository.findAll();
    }

    @Override
    public Category findById(String s) {
        return categoryRepository.findById(s);
    }

    @Override
    public Category update(String s, Category document) {
        Category category = categoryRepository.findById(s);
        return categoryRepository.save(this.updateCategory(category));
    }

    @Override
    public void delete(String s) {
        Category category = categoryRepository.findById(s);
        categoryRepository.delete(category);
    }


    private Category updateCategory(Category category){
        Category c = new Category();
        c.setName(category.getName());
        c.setDescription(category.getDescription());
        return c;
    }
}
