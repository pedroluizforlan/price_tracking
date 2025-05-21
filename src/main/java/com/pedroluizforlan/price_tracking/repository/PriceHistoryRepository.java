package com.pedroluizforlan.price_tracking.repository;

import com.pedroluizforlan.price_tracking.model.PriceHistory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PriceHistoryRepository extends JpaRepository<PriceHistory, Long> {
    List<PriceHistory> findByProductIdOrderByCollectedAtDesc(String productId);

}
