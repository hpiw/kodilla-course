package com.kodilla.testing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void currencySpot() {
        //given
        final double currentCurrency = 3.92;

        //when
        double result = Main.currencySpot();

        //then
        assertEquals(currentCurrency, result);
    }
}