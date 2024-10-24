package com.Bakare.ayisat.models;

public class CurrencyRequest {
	private String baseCurrency;
	private String targetCurrency;
	private double amount;

	public CurrencyRequest() {
	}

	public CurrencyRequest(String baseCurrency, String targetCurrency, double amount) {
		this.baseCurrency = baseCurrency;
		this.targetCurrency = targetCurrency;
		this.amount = amount;
	}

	public String getBaseCurrency() {
		return baseCurrency;
	}

	public void setBaseCurrency(String baseCurrency) {
		this.baseCurrency = baseCurrency;
	}

	public String getTargetCurrency() {
		return targetCurrency;
	}

	public void setTargetCurrency(String targetCurrency) {
		this.targetCurrency = targetCurrency;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

}
