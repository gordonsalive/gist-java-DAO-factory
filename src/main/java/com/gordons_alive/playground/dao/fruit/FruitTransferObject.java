package com.gordons_alive.playground.dao.fruit;

import com.gordons_alive.playground.fruit.FruitKind;

public class FruitTransferObject implements FruitTransfer {
    private int freshness;
    private String name;
    private double weight;
    private FruitKind fruitKind;

    public int getFreshness() {
        return freshness;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public FruitKind getFruitKind() {
        return fruitKind;
    }

    public void setFreshness(int freshness) {
        this.freshness = freshness;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setFruitKind(FruitKind fruitKind) {
        this.fruitKind = fruitKind;
    }
}
