package com.cap.x.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.cap.x.entity.Stock;

@Service
public class StockService {

    @Autowired
    private final JdbcTemplate jdbcTemplate;

    public StockService(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Map<String, Object>> getAllStock(){
        String query = "SELECT * FROM capxportfolio";
        return jdbcTemplate.queryForList(query);
    }

    public int saveStock(Stock stock){
        String sql = "INSERT INTO capxportfolio (noOfShares, symbol, price, company_name, currency, website) " +
                 "VALUES (?, ?, ?, ?, ?, ?)";
        return jdbcTemplate.update(sql, stock.getNoOfShares(), stock.getSymbol(), stock.getPrice(),
                 stock.getCompanyName(), stock.getCurrency(), stock.getWebsite());

    }
}
