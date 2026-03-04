package com.example;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;

class AlexTest {

    @Test
    void getFriendsReturnsCorrectList() throws Exception {
        Predator predator = mock(Predator.class);
        Alex alex = new Alex(predator);

        assertEquals(
                List.of("Марти", "Глория", "Мелман"),
                alex.getFriends()
        );
    }

    @Test
    void getPlaceOfLivingReturnsZoo() throws Exception {
        Predator predator = mock(Predator.class);
        Alex alex = new Alex(predator);

        assertEquals("Нью-Йоркский зоопарк", alex.getPlaceOfLiving());
    }

    @Test
    void getKittensReturnsZero() throws Exception {
        Predator predator = mock(Predator.class);
        Alex alex = new Alex(predator);

        assertEquals(0, alex.getKittens());
    }
}