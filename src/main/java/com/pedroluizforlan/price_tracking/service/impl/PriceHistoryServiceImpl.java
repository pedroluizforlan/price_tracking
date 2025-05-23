package com.pedroluizforlan.price_tracking.service.impl;

import com.pedroluizforlan.price_tracking.model.PriceHistory;
import com.pedroluizforlan.price_tracking.repository.PriceHistoryRepository;
import com.pedroluizforlan.price_tracking.service.PriceHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PriceHistoryServiceImpl implements PriceHistoryService {

    @Autowired
    private PriceHistoryRepository priceHistoryRepository;

    @Override
    public List<PriceHistory> findByProductIdOrderByCollectedAtDesc(String productId) {
        return priceHistoryRepository.findByProductIdOrderByCollectedAtDesc(productId);
    }

    @Override
    public PriceHistory create(PriceHistory document) {
        return priceHistoryRepository.save(document);
    }

    @Override
    public List<PriceHistory> findAll() {
        return priceHistoryRepository.findAll();
    }

    @Override
    public PriceHistory findById(String s) {
        return priceHistoryRepository.findById(s);
    }

    @Override
    public PriceHistory update(String s, PriceHistory document) {
        PriceHistory priceHistory = priceHistoryRepository.findById(s);
        return priceHistoryRepository.save(this.updatePriceHistory(priceHistory));
    }

    @Override
    public void delete(String s) {
        PriceHistory priceHistory = priceHistoryRepository.findById(s);
        priceHistoryRepository.delete(priceHistory);
    }


    private PriceHistory updatePriceHistory(PriceHistory priceHistory){
        PriceHistory ph = new PriceHistory();
        ph.setPrice(priceHistory.getPrice());
        ph.setCurrency(priceHistory.getCurrency());
        ph.setErrorMessage(priceHistory.getErrorMessage());
        ph.setSuccessful(priceHistory.getSuccessful());
        ph.setRawHtml(priceHistory.getRawHtml());
        ph.setCollectedAt(priceHistory.getCollectedAt());
        return ph;
    }


}
