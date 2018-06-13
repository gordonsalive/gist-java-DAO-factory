package com.gordons_alive.playground.dao.fruit;

import com.gordons_alive.playground.dao.Transfer;
import com.gordons_alive.playground.fruit.FruitKind;

public interface FruitTransfer extends Transfer {
    double getWeight();
    FruitKind getFruitKind();
}
