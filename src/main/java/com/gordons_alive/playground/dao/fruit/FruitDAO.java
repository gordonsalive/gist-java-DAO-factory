package com.gordons_alive.playground.dao.fruit;

import com.gordons_alive.playground.dao.DAO;

public interface FruitDAO extends DAO {
    public void insertFruit(FruitTransfer fruit);
    public FruitTransfer findFruit(int id);
    public void deleteFruit(int id);
}
