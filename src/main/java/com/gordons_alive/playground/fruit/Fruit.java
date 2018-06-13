package com.gordons_alive.playground.fruit;

public interface Fruit
{
    int getFreshness();
    String getName();
    double getWeight();
    void setWeight(double weight);
    FruitKind getFruitKind();
}
