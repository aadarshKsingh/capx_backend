package com.cap.x.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.cap.x.entity.Stock;
import com.cap.x.service.StockService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
public class Controller {
    @Autowired
    StockService stockService;

    @GetMapping("/stocks")
    public List<Map<String, Object>> getAllStock() {
        return stockService.getAllStock();
    }

    @PostMapping("/stocks")
    public int saveStock(@RequestBody Stock stock) {
        return stockService.saveStock(stock);
    }
}
