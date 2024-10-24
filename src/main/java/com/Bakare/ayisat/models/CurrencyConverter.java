package com.Bakare.ayisat.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"result",
"documentation",
"terms_of_use",
"time_last_update_unix",
"time_last_update_utc",
"time_next_update_unix",
"time_next_update_utc",
"base_code",
"target_code",
"conversion_rate",
"conversion_result"
})

public class CurrencyConverter {
public CurrencyConverter() {

}
public CurrencyConverter(String result, String documentation, String termsOfUse, Integer timeLastUpdateUnix,
			String timeLastUpdateUtc, Integer timeNextUpdateUnix, String timeNextUpdateUtc, String baseCode,
			String targetCode, Double conversionRate, Double conversionResult) {
		super();
		this.result = result;
		this.documentation = documentation;
		this.termsOfUse = termsOfUse;
		this.timeLastUpdateUnix = timeLastUpdateUnix;
		this.timeLastUpdateUtc = timeLastUpdateUtc;
		this.timeNextUpdateUnix = timeNextUpdateUnix;
		this.timeNextUpdateUtc = timeNextUpdateUtc;
		this.baseCode = baseCode;
		this.targetCode = targetCode;
		this.conversionRate = conversionRate;
		this.conversionResult = conversionResult;
	}


@JsonProperty("result")
public String result;
@JsonProperty("documentation")
public String documentation;
@JsonProperty("terms_of_use")
public String termsOfUse;
@JsonProperty("time_last_update_unix")
public Integer timeLastUpdateUnix;
@JsonProperty("time_last_update_utc")
public String timeLastUpdateUtc;
@JsonProperty("time_next_update_unix")
public Integer timeNextUpdateUnix;
@JsonProperty("time_next_update_utc")
public String timeNextUpdateUtc;
@JsonProperty("base_code")
public String baseCode;
@JsonProperty("target_code")
public String targetCode;
@JsonProperty("conversion_rate")
public Double conversionRate;
@JsonProperty("conversion_result")
public Double conversionResult;
public String getResult() {
	return result;
}
public void setResult(String result) {
	this.result = result;
}
public String getDocumentation() {
	return documentation;
}
public void setDocumentation(String documentation) {
	this.documentation = documentation;
}
public String getTermsOfUse() {
	return termsOfUse;
}
public void setTermsOfUse(String termsOfUse) {
	this.termsOfUse = termsOfUse;
}
public Integer getTimeLastUpdateUnix() {
	return timeLastUpdateUnix;
}
public void setTimeLastUpdateUnix(Integer timeLastUpdateUnix) {
	this.timeLastUpdateUnix = timeLastUpdateUnix;
}
public String getTimeLastUpdateUtc() {
	return timeLastUpdateUtc;
}
public void setTimeLastUpdateUtc(String timeLastUpdateUtc) {
	this.timeLastUpdateUtc = timeLastUpdateUtc;
}
public Integer getTimeNextUpdateUnix() {
	return timeNextUpdateUnix;
}
public void setTimeNextUpdateUnix(Integer timeNextUpdateUnix) {
	this.timeNextUpdateUnix = timeNextUpdateUnix;
}
public String getTimeNextUpdateUtc() {
	return timeNextUpdateUtc;
}
public void setTimeNextUpdateUtc(String timeNextUpdateUtc) {
	this.timeNextUpdateUtc = timeNextUpdateUtc;
}
public String getBaseCode() {
	return baseCode;
}
public void setBaseCode(String baseCode) {
	this.baseCode = baseCode;
}
public String getTargetCode() {
	return targetCode;
}
public void setTargetCode(String targetCode) {
	this.targetCode = targetCode;
}
public Double getConversionRate() {
	return conversionRate;
}
public void setConversionRate(Double conversionRate) {
	this.conversionRate = conversionRate;
}
public Double getConversionResult() {
	return conversionResult;
}
public void setConversionResult(Double conversionResult) {
	this.conversionResult = conversionResult;
}

}