package com.pedroluizforlan.price_tracking.repository;

import com.pedroluizforlan.price_tracking.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
