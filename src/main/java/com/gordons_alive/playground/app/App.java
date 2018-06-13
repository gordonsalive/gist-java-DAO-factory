package com.gordons_alive.playground.app;

import com.gordons_alive.playground.dao.*;
import com.gordons_alive.playground.dao.fruit.FruitDAO;
import com.gordons_alive.playground.dao.fruit.FruitTransfer;
import com.gordons_alive.playground.dao.fruit.FruitTransferable;
import com.gordons_alive.playground.fruit.Fruit;
import com.gordons_alive.playground.fruit.FruitFactory;
import com.gordons_alive.playground.fruit.FruitKind;
import com.gordons_alive.playground.juice.Juice;
import com.gordons_alive.playground.dao.juice.JuiceDAO;
import com.gordons_alive.playground.dao.juice.JuiceTransfer;
import com.gordons_alive.playground.dao.juice.JuiceTransferable;
import com.gordons_alive.playground.juice.JuiceFactory;
import com.gordons_alive.playground.juice.JuiceKind;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        //Use juice factory to create juice
        System.out.println("now working on object factories...");
        JuiceFactory juiceFactory = new JuiceFactory();
        Juice bananaJuice = juiceFactory.getJuice(JuiceKind.BANANA);
        System.out.println(bananaJuice);
        Juice strawberryJuice = juiceFactory.getJuice(JuiceKind.STRAWBERRY);
        System.out.println(strawberryJuice);
        //Use factory to create fruit
        FruitFactory fruitFactory = new FruitFactory();
        Fruit banana = fruitFactory.getFruit(FruitKind.BANANA);
        System.out.println(banana);

        //Use DAO factory to 'insert' and 'find' juice
        System.out.println("now working on DAOs and DAO factories...");
        JuiceDAO juiceDAO = DAOFactory.getJuiceDAO("file");
        //In java casting is how you switch between interfaces (use instanceOf to ensure interface is supported)
        System.out.println(bananaJuice);
        JuiceTransferable bananaJuiceTransferable = (JuiceTransferable) bananaJuice;
        JuiceTransfer bananaJuiceTransfer = bananaJuiceTransferable.getJuiceTransferObject();
        juiceDAO.insertJuice(bananaJuiceTransfer);
        bananaJuiceTransfer = juiceDAO.findJuice(12);
        bananaJuice = juiceFactory.getJuiceFromTransfer(bananaJuiceTransfer);
        System.out.println(bananaJuice);

        System.out.println(strawberryJuice);
        JuiceTransferable strawberryJuiceTransferable = (JuiceTransferable) strawberryJuice;
        JuiceTransfer strawberryJuiceTransfer = strawberryJuiceTransferable.getJuiceTransferObject();
        juiceDAO.insertJuice(strawberryJuiceTransfer);
        bananaJuiceTransfer = juiceDAO.findJuice(12);
        bananaJuice = juiceFactory.getJuiceFromTransfer(bananaJuiceTransfer);
        System.out.println(bananaJuice);

        System.out.println("show I can use a different persistence mechanism with the same transfer objects...");
        FruitDAO fruitDAO = DAOFactory.getFruitDAO("RDBMS");
        FruitTransferable bananaTransferable = (FruitTransferable) banana;
        FruitTransfer bananaTransfer = bananaTransferable.getFruitTransferObject();
        fruitDAO.insertFruit(bananaTransfer);
    }
}
