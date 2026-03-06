package com.example;

import java.util.List;

public class Feline extends Animal implements Predator {

    @Override
    public List<String> getFood(String animalKind) throws Exception {
        return super.getFood(animalKind);
    }

    @Override
    public int getKittens() {
        return 1;
    }
}