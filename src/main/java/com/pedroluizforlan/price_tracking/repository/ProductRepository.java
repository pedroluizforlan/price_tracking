package com.pedroluizforlan.price_tracking.repository;


import com.pedroluizforlan.price_tracking.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findByCategoryId(String categoryId);
    List<Product> findByActiveTrue();
}
