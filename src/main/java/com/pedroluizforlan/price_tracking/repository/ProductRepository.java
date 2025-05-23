package com.pedroluizforlan.price_tracking.repository;


import com.pedroluizforlan.price_tracking.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findByCategoryId(String categoryId);
    List<Product> findByActiveTrue();

    Product findById(String id);
}
