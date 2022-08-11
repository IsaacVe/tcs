package com.tcs.currencyexchange.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tcs.currencyexchange.model.CurrencyExchange;
import com.tcs.currencyexchange.repository.CurrencyExchangeRepository;
import com.tcs.currencyexchange.service.CurrencyExchangeService;

@Service
public class CurrencyExchangeServiceImpl implements CurrencyExchangeService {

	@Autowired
	CurrencyExchangeRepository currencyExchangeRepository;
	

	@Override
	public Optional<CurrencyExchange> findByCurrencyExchangeBySymbols(String sourceCurrencySymbol, String targetCurrencySymbol) {
		return currencyExchangeRepository.findByCurrencyExchangeBySymbols(sourceCurrencySymbol, targetCurrencySymbol);
	}

}
