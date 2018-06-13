package com.gordons_alive.playground.dao.juice;

import com.gordons_alive.playground.dao.Transfer;
import com.gordons_alive.playground.juice.JuiceKind;

public interface JuiceTransfer extends Transfer {
    double getVolume();
    JuiceKind getJuiceKind();
}
