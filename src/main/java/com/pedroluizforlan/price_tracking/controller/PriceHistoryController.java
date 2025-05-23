package com.pedroluizforlan.price_tracking.controller;

import com.pedroluizforlan.price_tracking.model.PriceHistory;
import com.pedroluizforlan.price_tracking.service.impl.PriceHistoryServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/pricehistory")
public class PriceHistoryController {

    @Autowired
    private PriceHistoryServiceImpl priceHistoryService;

    @GetMapping
    public ResponseEntity<List<PriceHistory>> listAll(){
        return ResponseEntity.ok(priceHistoryService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<PriceHistory> getById(@PathVariable String id){
        return ResponseEntity.ok(priceHistoryService.findById(id));
    }

    @GetMapping("/bycollection/{id}")
    public ResponseEntity<List<PriceHistory>> getByProductIdOrderByCollectedAtDesc(@PathVariable String id){
        return ResponseEntity.ok(priceHistoryService.findByProductIdOrderByCollectedAtDesc(id));
    }

    @PostMapping
    public ResponseEntity<PriceHistory> createPriceHistory(@RequestBody PriceHistory priceHistory){
        return ResponseEntity.ok(priceHistoryService.create(priceHistory));
    }

    @PutMapping("/{id}")
    public ResponseEntity<PriceHistory> updatePriceHistory(@RequestBody PriceHistory priceHistory, @PathVariable String id){
        return ResponseEntity.ok(priceHistoryService.update(id,priceHistory));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePriceHistory(@PathVariable String id){
        priceHistoryService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
