package com.pedroluizforlan.price_tracking.service;

import com.pedroluizforlan.price_tracking.model.PriceHistory;
import com.pedroluizforlan.price_tracking.service.crud.CrudService;

import java.util.List;

public interface PriceHistoryService extends CrudService<String, PriceHistory> {
    List<PriceHistory> findByProductIdOrderByCollectedAtDesc(String productId);
}
