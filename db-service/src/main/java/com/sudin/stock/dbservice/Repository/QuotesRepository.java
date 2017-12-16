package com.sudin.stock.dbservice.Repository;

import com.sudin.stock.dbservice.Model.Quote;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface QuotesRepository extends JpaRepository<Quote,Integer> {
    List<Quote> findByUserName(String username);
}
