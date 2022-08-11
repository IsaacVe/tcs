package com.tcs.currencyexchange.model;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "currency_exchange")
public class CurrencyExchange implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -7296799006511355633L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="CURRENCYEXCHANGEID", unique = true, nullable = false)
	private Long currencyExchangeId;
	
	@ManyToOne
    @JoinColumn(name = "SOURCECURRENCYID")
	private Currency sourceCurrency;
	
	@ManyToOne
    @JoinColumn(name = "TARGETCURRENCYID")
	private Currency targetCurrency;
	
	@Column(name="CURRENCYRATE")
	private BigDecimal currencyRate;
	
	public Long getCurrencyExchangeId() {
		return currencyExchangeId;
	}
	public void setCurrencyExchangeId(Long currencyExchangeId) {
		this.currencyExchangeId = currencyExchangeId;
	}
	public Currency getSourceCurrency() {
		return sourceCurrency;
	}
	public void setSourceCurrency(Currency sourceCurrency) {
		this.sourceCurrency = sourceCurrency;
	}
	public Currency getTargetCurrency() {
		return targetCurrency;
	}
	public void setTargetCurrency(Currency targetCurrency) {
		this.targetCurrency = targetCurrency;
	}
	public BigDecimal getCurrencyRate() {
		return currencyRate;
	}
	public void setCurrencyRate(BigDecimal currencyRate) {
		this.currencyRate = currencyRate;
	}
	
	

	
	
}
