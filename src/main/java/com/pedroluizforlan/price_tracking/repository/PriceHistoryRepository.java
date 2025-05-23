package com.pedroluizforlan.price_tracking.repository;

import com.pedroluizforlan.price_tracking.model.PriceHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PriceHistoryRepository extends JpaRepository<PriceHistory, Long> {
    List<PriceHistory> findByProductIdOrderByCollectedAtDesc(String productId);

    PriceHistory findById(String id);
}
