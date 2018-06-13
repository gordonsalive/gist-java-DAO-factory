package com.gordons_alive.playground.dao;

import com.gordons_alive.playground.dao.fruit.FruitDAO;
import com.gordons_alive.playground.dao.fruit.FruitTransfer;
import com.gordons_alive.playground.dao.juice.JuiceDAO;
import com.gordons_alive.playground.dao.juice.JuiceTransfer;

public class RDBMSDAO implements JuiceDAO, FruitDAO {
    @Override
    public void insertJuice(JuiceTransfer juice) {
        System.out.println("insert Juice...");
    }

    @Override
    public JuiceTransfer findJuice(int id) {
        System.out.println("find Juice...");
        return null;
    }

    @Override
    public void deleteJuice(int id) {
        System.out.println("delete Juice...");
    }

    @Override
    public void insertFruit(FruitTransfer fruit) {
        System.out.println("insert fruit...");
    }

    @Override
    public FruitTransfer findFruit(int id) {
        System.out.println("find fruit...");
        return null;
    }

    @Override
    public void deleteFruit(int id) {
        System.out.println("delete fruit...");
    }

}
