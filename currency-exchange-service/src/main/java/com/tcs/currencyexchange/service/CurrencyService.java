package com.tcs.currencyexchange.service;

import java.util.List;

import com.tcs.currencyexchange.model.Currency;

public interface CurrencyService {

	List<Currency> findAll();
}
