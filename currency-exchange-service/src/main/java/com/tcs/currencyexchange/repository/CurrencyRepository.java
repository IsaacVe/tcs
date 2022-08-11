package com.tcs.currencyexchange.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tcs.currencyexchange.model.Currency;

@Repository
public interface CurrencyRepository extends JpaRepository<Currency, Long> {

	
}
