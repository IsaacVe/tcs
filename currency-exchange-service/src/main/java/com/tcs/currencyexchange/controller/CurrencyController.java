package com.tcs.currencyexchange.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tcs.currencyexchange.model.Currency;
import com.tcs.currencyexchange.service.CurrencyService;

@RestController
@RequestMapping("/currency")
public class CurrencyController {

	
	@Autowired
	CurrencyService currencyService;


	@GetMapping
	public ResponseEntity<List<Currency>> convert() {
		return new ResponseEntity<List<Currency>>(currencyService.findAll(), HttpStatus.OK);
		
		
	}
}
