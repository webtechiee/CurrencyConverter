package com.Bakare.ayisat;

import com.Bakare.ayisat.models.CurrencyResponse;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static org.junit.jupiter.api.Assertions.*;
class CurrencyResponseTest {

    @Test
    void getLocalDateTime() {
        CurrencyResponse currencyResponse = new CurrencyResponse();
        assertEquals(currencyResponse.getDateTime(), LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
    }
}