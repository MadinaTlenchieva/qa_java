package com.example;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;

class LionParameterizedTest {

    @ParameterizedTest
    @CsvSource({
            "Самец, true",
            "Самка, false"
    })
    void doesHaveManeDependsOnSex(String sex, boolean expected) throws Exception {

        // Используем настоящий Mockito.mock напрямую
        Feline felineMock = mock(Feline.class);
        Lion lion = new Lion(sex, felineMock);

        assertEquals(expected, lion.doesHaveMane());
    }
}