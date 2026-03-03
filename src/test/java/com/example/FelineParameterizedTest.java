package com.example;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class FelineParameterizedTest {

    Feline feline = new Feline();

    @ParameterizedTest
    @ValueSource(ints = {0, 1, 3, 10})
    void getKittensWithParamReturnsCorrectValue(int kittensCount) {
        assertEquals(kittensCount, feline.getKittens(kittensCount));
    }
}