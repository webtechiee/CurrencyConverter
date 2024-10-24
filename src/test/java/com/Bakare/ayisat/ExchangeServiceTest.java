package com.Bakare.ayisat;

import com.Bakare.ayisat.controllers.ExchangeService;
import com.Bakare.ayisat.models.CurrencyRequest;
import com.Bakare.ayisat.models.CurrencyResponse;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class ExchangeServiceTest {

    @Test
    void exchangeCurrencies() throws IOException {
        ExchangeService exchangeService = new ExchangeService();
        CurrencyRequest currencyRequest = new CurrencyRequest("USD", "NGN", 1.0);
        String expectedResponse = exchangeService.exchangeCurrencies(currencyRequest).toString();
        String actualResponse = new CurrencyResponse("USD", "NGN", 1538.1815, 1538.1815).toString();
        assertEquals(expectedResponse, actualResponse);
    }
}