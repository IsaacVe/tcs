package com.tcs.currencyexchange.controller;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tcs.currencyexchange.dto.CurrencyExchangeDTO;
import com.tcs.currencyexchange.model.CurrencyExchange;
import com.tcs.currencyexchange.service.CurrencyExchangeService;

@RestController
@RequestMapping("/currencyexchange")
public class CurrencyExchangeController {

	@Autowired
	CurrencyExchangeService currencyExchangeService;

	@PostMapping("/convert")
	public ResponseEntity<CurrencyExchangeDTO> convert(@Valid @RequestBody CurrencyExchangeDTO dto){
		Optional<CurrencyExchange> ce = currencyExchangeService.findByCurrencyExchangeBySymbols(dto.getFrom(),
				dto.getTo());
		if (ce.isEmpty()) {
			return new ResponseEntity<CurrencyExchangeDTO>(HttpStatus.NOT_FOUND);
		}

		dto.setCurrencyRate(ce.get().getCurrencyRate());
		dto.setTotalCalculatedAmount(dto.getAmount().multiply(dto.getCurrencyRate()));
		return new ResponseEntity<CurrencyExchangeDTO>(dto, HttpStatus.OK);

	}

}
