package com.example;

import java.util.List;

public interface Predator {

    List<String> getFood(String animalKind) throws Exception;

    int getKittens();
}