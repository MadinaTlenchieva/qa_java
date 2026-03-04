package com.example;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FelineTest {

    Feline feline = new Feline();

    @Test
    void getFoodReturnsPredatorFood() throws Exception {
        List<String> food = feline.getFood("Хищник");

        assertEquals(List.of("Животные", "Птицы", "Рыба"), food);
    }

    @Test
    void getFoodReturnsHerbivoreFood() throws Exception {
        List<String> food = feline.getFood("Травоядное");

        assertEquals(List.of("Трава", "Различные растения"), food);
    }

    @Test
    void getFoodThrowsExceptionWhenUnknownType() {
        Exception exception = assertThrows(Exception.class, () ->
                feline.getFood("Неизвестно")
        );

        assertEquals(
                "Неизвестный вид животного, используйте значение Травоядное или Хищник",
                exception.getMessage()
        );
    }

    @Test
    void getFamilyContainsFelineFamily() {
        assertTrue(feline.getFamily().contains("кошачьи"));
    }

    @Test
    void getKittensReturnsOne() {
        assertEquals(1, feline.getKittens());
    }
}