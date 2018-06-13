package com.gordons_alive.playground.dao.juice;

import com.gordons_alive.playground.dao.DAO;

public interface JuiceDAO extends DAO {
    public void insertJuice(JuiceTransfer juice);
    public JuiceTransfer findJuice(int id);
    public void deleteJuice(int id);
}
