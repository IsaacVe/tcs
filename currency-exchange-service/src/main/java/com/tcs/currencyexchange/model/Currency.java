package com.tcs.currencyexchange.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "currency")
public class Currency implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4630522510442517424L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="CURRENCYID", unique = true, nullable = false)
	private Long currencyId;
	@Column(name="NAME")
	private String name;
	@Column(name="SYMBOL")
	private String symbol;
	public Long getCurrencyId() {
		return currencyId;
	}
	public void setCurrencyId(Long currencyId) {
		this.currencyId = currencyId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSymbol() {
		return symbol;
	}
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	
	
}
