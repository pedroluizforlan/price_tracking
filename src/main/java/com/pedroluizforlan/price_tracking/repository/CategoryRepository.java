package com.pedroluizforlan.price_tracking.repository;

import com.pedroluizforlan.price_tracking.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
    Category findById(String id);
}
