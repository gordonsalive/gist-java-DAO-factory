package com.gordons_alive.playground.dao;

import com.gordons_alive.playground.dao.fruit.FruitDAO;
import com.gordons_alive.playground.dao.juice.JuiceDAO;

public class DAOFactory {
    private static DAO getDAO(String sourceType) {
        //(no need to break as all options return)
        switch(sourceType) {
            case "RDBMS":
                return new RDBMSDAO();
            case "file":
                return new fileDAO();
        }
        return null;
    }

    public static JuiceDAO getJuiceDAO(String sourceType) {
        return (JuiceDAO) getDAO(sourceType);
    }

    public static FruitDAO getFruitDAO(String sourceType) {
        return (FruitDAO) getDAO(sourceType);
    }
}
