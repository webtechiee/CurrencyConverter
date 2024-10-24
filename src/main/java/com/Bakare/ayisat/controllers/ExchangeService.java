package com.Bakare.ayisat.controllers;

import com.Bakare.ayisat.models.CurrencyConverter;
import com.Bakare.ayisat.models.CurrencyResponse;
import com.fasterxml.jackson.databind.ObjectMapper;

import com.Bakare.ayisat.models.CurrencyRequest;

import okhttp3.*;

import java.io.IOException;

public class ExchangeService {

    private static final String baseUrl = "https://v6.exchangerate-api.com/v6/c2a86960684baeb88a489c4b/pair/";
    private final StringBuilder url = new StringBuilder(baseUrl);
    private final OkHttpClient client;
    private final ObjectMapper objectMapper;
    public ExchangeService() {
        this.client = new OkHttpClient();
        this.objectMapper = new ObjectMapper();
    }

    public CurrencyResponse exchangeCurrencies(CurrencyRequest currencyRequest) throws IOException {
        //converting the stringbuilder into a string to make call it as original url in okhttp
        String apiUrl = url.append(currencyRequest.getBaseCurrency()).append("/").append(currencyRequest.getTargetCurrency()).append("/").append(currencyRequest.getAmount()).toString();
        Request request = new Request.Builder().url(apiUrl).build();

        try(Response response = client.newCall(request).execute()){
            if(response.isSuccessful()){
               // assert response.body() != null;
                CurrencyConverter currencyConverter = objectMapper.readValue(response.body().string(), CurrencyConverter.class);
                return new CurrencyResponse(currencyConverter.getBaseCode(), currencyConverter.getTargetCode(), currencyConverter.getConversionRate(), currencyConverter.getConversionResult());
            }else{
                throw new IOException("Unexpected response: " + response.code());
            }
        }

    }

}