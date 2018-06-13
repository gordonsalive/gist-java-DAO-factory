package com.gordons_alive.playground.juice;

import com.gordons_alive.playground.dao.juice.JuiceTransfer;

public class JuiceFactory {
    public static Juice getJuice(JuiceKind juiceKind) {
        //(no need to break as all options return)
        switch(juiceKind) {
            case BANANA:
                return new BananaJuice();
            case STRAWBERRY:
                return new StrawberryJuice();
            default:
                System.out.println("DIDN'T FIND THAT KIND OF FRUIT" + juiceKind);
                return null;//ho hum...
        }
    }
    public static Juice getJuiceFromTransfer(JuiceTransfer juiceTransfer) {
        Juice juice = getJuice(juiceTransfer.getJuiceKind());
        juice.setVolume(juiceTransfer.getVolume());
        return juice;
    }
}
