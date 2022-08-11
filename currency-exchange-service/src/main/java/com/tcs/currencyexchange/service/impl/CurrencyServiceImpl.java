package com.tcs.currencyexchange.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tcs.currencyexchange.model.Currency;
import com.tcs.currencyexchange.repository.CurrencyRepository;
import com.tcs.currencyexchange.service.CurrencyService;

@Service
public class CurrencyServiceImpl implements CurrencyService {

	@Autowired
	CurrencyRepository currencyRepository;

	@Override
	public List<Currency> findAll() {
		return currencyRepository.findAll();
	}
}
