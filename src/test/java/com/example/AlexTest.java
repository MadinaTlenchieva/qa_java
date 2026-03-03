package com.example;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class AlexTest {

    @Test
    void getFriendsReturnsCorrectList() throws Exception {
        Alex alex = new Alex(mock(Feline.class));

        assertEquals(
                List.of("Марти", "Глория", "Мелман"),
                alex.getFriends()
        );
    }

    @Test
    void getPlaceOfLivingReturnsZoo() throws Exception {
        Alex alex = new Alex(mock(Feline.class));

        assertEquals("Нью-Йоркский зоопарк", alex.getPlaceOfLiving());
    }

    @Test
    void getKittensReturnsZero() throws Exception {
        Alex alex = new Alex(mock(Feline.class));

        assertEquals(0, alex.getKittens());
    }
}