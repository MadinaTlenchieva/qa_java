package com.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class LionTest {

    @Mock
    Feline feline;

    @Test
    void getFoodReturnsMeat() throws Exception {
        when(feline.eatMeat()).thenReturn(List.of("Животные"));

        Lion lion = new Lion("Самец", feline);

        assertEquals(List.of("Животные"), lion.getFood());

        verify(feline).eatMeat();
    }

    @Test
    void getKittensReturnsValueFromFeline() throws Exception {
        when(feline.getKittens()).thenReturn(3);

        Lion lion = new Lion("Самка", feline);

        assertEquals(3, lion.getKittens());
    }

    @Test
    void constructorThrowsExceptionWhenSexInvalid() {
        assertThrows(Exception.class, () ->
                new Lion("Неизвестно", feline)
        );
    }
}