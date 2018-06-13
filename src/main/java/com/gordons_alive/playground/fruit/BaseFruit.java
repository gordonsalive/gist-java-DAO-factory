package com.gordons_alive.playground.fruit;

import com.gordons_alive.playground.dao.fruit.FruitTransfer;
import com.gordons_alive.playground.dao.fruit.FruitTransferObject;
import com.gordons_alive.playground.dao.fruit.FruitTransferable;

public class BaseFruit implements Fruit, FruitTransferable {
    private int freshness = 0;
    private String name = "";
    private double weight = 1.0;
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

    @Override
    public FruitKind getFruitKind() {
        return fruitKind;
    }

    protected void setFreshness(int freshness) {
        this.freshness = freshness;
    }

    protected void setName(String name) {
        this.name = name;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    protected void setFruitKind(FruitKind fruitKind) {
        this.fruitKind = fruitKind;
    }

    public FruitTransfer getFruitTransferObject() {
        FruitTransferObject transfer = new FruitTransferObject();
        transfer.setFreshness(freshness);
        transfer.setName(name);
        transfer.setWeight(weight);
        transfer.setFruitKind(fruitKind);
        return transfer;
    }

    public String toString() {
        String[] arr = {name, "" + freshness, "" + weight, "" + fruitKind};
        String fields = "";
        for (String item: arr) {
            fields += item + ",";
        }
        fields = fields.substring(0, fields.length() - 1);//drop last character

        return "(name,freshness,weight,fruitKind)=(" + fields + ")";
    }
}
