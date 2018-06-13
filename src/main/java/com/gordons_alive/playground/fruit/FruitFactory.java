package com.gordons_alive.playground.fruit;

import com.gordons_alive.playground.dao.fruit.FruitTransfer;

public class FruitFactory {
    public static Fruit getFruit(FruitKind fruitKind) {
        //(no need to break as all options return)
        switch(fruitKind) {
            case BANANA:
                return new Banana();
            case STRAWBERRY:
                return new Strawberry();
            default:
                System.out.println("DIDN'T FIND THAT KIND OF FRUIT" + fruitKind);
                return null;//ho hum...
        }
    }
    public static Fruit getFruitFromTransfer(FruitTransfer fruitTransfer) {
        Fruit fruit = getFruit(fruitTransfer.getFruitKind());
        fruit.setWeight(fruitTransfer.getWeight());
        return fruit;
    }
}
