package com.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class CatTest {

    @Mock
    Predator predator;

    @Test
    void getSoundReturnsMeow() {
        Cat cat = new Cat(predator);

        assertEquals("Мяу", cat.getSound());
    }

    @Test
    void getFoodReturnsPredatorFood() throws Exception {
        when(predator.getFood("Хищник")).thenReturn(List.of("Животные"));

        Cat cat = new Cat(predator);

        assertEquals(List.of("Животные"), cat.getFood());

        verify(predator).getFood("Хищник");
    }
}