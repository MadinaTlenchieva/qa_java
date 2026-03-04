package com.example;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;

class LionParameterizedTest {

    @ParameterizedTest
    @CsvSource({
            "Самец, true",
            "Самка, false"
    })
    void doesHaveManeDependsOnSex(String sex, boolean expected) throws Exception {
        Predator predatorMock = mock(Predator.class);
        Lion lion = new Lion(sex, predatorMock);

        assertEquals(expected, lion.doesHaveMane());
    }
}