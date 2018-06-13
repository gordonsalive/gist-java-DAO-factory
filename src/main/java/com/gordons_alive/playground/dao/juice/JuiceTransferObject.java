package com.gordons_alive.playground.dao.juice;

import com.gordons_alive.playground.juice.JuiceKind;

public class JuiceTransferObject implements JuiceTransfer {
    private int juiciness;
    private String name;
    private double volume;
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

    public void setJuiciness(int juiciness) {
        this.juiciness = juiciness;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public void setJuiceKind(JuiceKind juiceKind) {
        this.juiceKind = juiceKind;
    }
}
