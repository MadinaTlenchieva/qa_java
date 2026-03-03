package com.example;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FelineTest {

    Feline feline = new Feline();

    @Test
    void eatMeatReturnsPredatorFood() throws Exception {
        List<String> food = feline.eatMeat();

        assertEquals(List.of("Животные", "Птицы", "Рыба"), food);
    }

    @Test
    void getFamilyReturnsFelineFamily() {
        assertEquals("Кошачьи", feline.getFamily());
    }

    @Test
    void getKittensWithoutParamsReturnsOne() {
        assertEquals(1, feline.getKittens());
    }
}