package com.gordons_alive.playground.juice;

public interface Juice
//        extends Transferable
{
    int getJuiciness();
    String getName();
    double getVolume();
    void setVolume(double volume);
    JuiceKind getJuiceKind();
}
