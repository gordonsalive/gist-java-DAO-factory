package com.gordons_alive.playground.dao;

import com.gordons_alive.playground.dao.fruit.FruitDAO;
import com.gordons_alive.playground.dao.fruit.FruitTransfer;
import com.gordons_alive.playground.dao.juice.JuiceDAO;
import com.gordons_alive.playground.dao.juice.JuiceTransfer;
import com.gordons_alive.playground.dao.juice.JuiceTransferObject;
import com.gordons_alive.playground.juice.JuiceKind;

public class fileDAO implements JuiceDAO, FruitDAO {
    @Override
    public void insertJuice(JuiceTransfer juice) {
        System.out.println("insert Juice to local file...");
    }

    @Override
    public JuiceTransfer findJuice(int id) {
        System.out.println("find Juice to local file...");

        JuiceTransferObject transfer = new JuiceTransferObject();
        transfer.setJuiciness(3);
        transfer.setName("Banana Juice");
        transfer.setVolume(15.5);
        transfer.setJuiceKind(JuiceKind.BANANA);
        return transfer;
    }

    @Override
    public void deleteJuice(int id) {
        System.out.println("delete Juice to local file...");
    }

    @Override
    public void insertFruit(FruitTransfer fruit) {
        System.out.println("insert fruit to local file...");
    }

    @Override
    public FruitTransfer findFruit(int id) {
        System.out.println("find fruit to local file...");
        return null;
    }

    @Override
    public void deleteFruit(int id) {
        System.out.println("delete fruit to local file...");
    }

}
