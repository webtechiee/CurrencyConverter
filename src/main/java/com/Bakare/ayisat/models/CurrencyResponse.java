package com.Bakare.ayisat.models;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CurrencyResponse {

	public CurrencyResponse() {
		LocalDateTime localDateTime = LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		this.dateTime = localDateTime.format(formatter);
	}

	public CurrencyResponse(String baseCurrency, String targetCurrency, double conversionRate, double conversionResult) {
		this.baseCurrency = baseCurrency;
		this.targetCurrency = targetCurrency;
		this.conversionRate = conversionRate;
		this.conversionResult = conversionResult;

		LocalDateTime localDateTime = LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		this.dateTime = localDateTime.format(formatter);
	}

	private String baseCurrency;
	private String targetCurrency;
	private double conversionRate;
	private double conversionResult;
	private String dateTime;

	public String getDateTime() {
		return dateTime;
	}

	public void setDateTime(String dateTime) {
		this.dateTime = dateTime;
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

	public double getConversionRate() {
		return conversionRate;
	}

	public void setConversionRate(double conversionRate) {
		this.conversionRate = conversionRate;
	}

	public double getConversionResult() {
		return conversionResult;
	}

	public void setConversionResult(double conversionResult) {
		this.conversionResult = conversionResult;
	}

	@Override
	public String toString() {
		return "CurrencyResponse{" +
				"baseCurrency='" + baseCurrency + '\'' +
				", targetCurrency='" + targetCurrency + '\'' +
				", conversionRate=" + conversionRate +
				", conversionResult=" + conversionResult +
				", dateTime='" + dateTime + '\'' +
				'}';
	}
}
