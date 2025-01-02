package com.cap.x.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.cap.x.entity.Stock;

public interface StockRepository extends JpaRepository<Stock, Long>{
    
}
