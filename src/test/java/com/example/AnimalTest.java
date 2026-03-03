package com.example;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {

    Animal animal = new Animal();

    @Test
    void getFoodReturnsHerbivoreFood() throws Exception {
        List<String> food = animal.getFood("Травоядное");

        assertEquals(List.of("Трава", "Различные растения"), food);
    }

    @Test
    void getFoodReturnsPredatorFood() throws Exception {
        List<String> food = animal.getFood("Хищник");

        assertEquals(List.of("Животные", "Птицы", "Рыба"), food);
    }

    @Test
    void getFoodThrowsExceptionWhenUnknownType() {
        Exception exception = assertThrows(Exception.class, () ->
                animal.getFood("Неизвестно")
        );

        assertEquals(
                "Неизвестный вид животного, используйте значение Травоядное или Хищник",
                exception.getMessage()
        );
    }

    @Test
    void getFamilyReturnsCorrectString() {
        assertTrue(animal.getFamily().contains("кошачьи"));
    }
}