package com.tcs.currencyexchange.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.tcs.currencyexchange.model.CurrencyExchange;

@Repository
public interface CurrencyExchangeRepository extends JpaRepository<CurrencyExchange, Long>{

	@Query(value="select a from CurrencyExchange a where a.sourceCurrency.symbol = ?1 and a.targetCurrency.symbol = ?2" )
	Optional<CurrencyExchange> findByCurrencyExchangeBySymbols(String sourceCurrencySymbol, String targetCurrencySymbol); 
}
