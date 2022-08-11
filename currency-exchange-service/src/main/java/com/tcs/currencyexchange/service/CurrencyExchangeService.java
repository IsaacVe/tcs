package com.tcs.currencyexchange.service;

import java.util.Optional;

import com.tcs.currencyexchange.model.CurrencyExchange;

public interface CurrencyExchangeService {
	
	Optional<CurrencyExchange> findByCurrencyExchangeBySymbols(String sourceCurrencySymbol, String targetCurrencySymbol);

}
