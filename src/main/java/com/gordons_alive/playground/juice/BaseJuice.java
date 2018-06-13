package com.gordons_alive.playground.juice;

import com.gordons_alive.playground.dao.juice.JuiceTransfer;
import com.gordons_alive.playground.dao.juice.JuiceTransferObject;
import com.gordons_alive.playground.dao.juice.JuiceTransferable;

public class BaseJuice implements Juice, JuiceTransferable {
    private int juiciness = 0;
    private String name = "";
    private double volume = 10.0;
    private JuiceKind juiceKind;

    public int getJuiciness() {
        return juiciness;
    }

    public String getName() {
        return name;
    }

    public double getVolume() {
        return volume;
    }

    public JuiceKind getJuiceKind() {
        return juiceKind;
    }

    protected void setJuiciness(int juiciness) {
        this.juiciness = juiciness;
    }

    protected void setName(String name) {
        this.name = name;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    protected void setJuiceKind(JuiceKind juiceKind) {
        this.juiceKind = juiceKind;
    }

    public JuiceTransfer getJuiceTransferObject() {
        JuiceTransferObject transfer = new JuiceTransferObject();
        transfer.setJuiciness(juiciness);
        transfer.setName(name);
        transfer.setVolume(volume);
        transfer.setJuiceKind(juiceKind);
        return transfer;
    }

    public String toString() {
        String[] arr = {name, "" + juiciness, "" + volume, "" + juiceKind};
        String fields = "";
        for (String item: arr) {
            fields += item + ",";
        }
        fields = fields.substring(0, fields.length() - 1);//drop last character

        return "(name,juiciness,volume,juiceKind)=(" + fields + ")";
    }
}
