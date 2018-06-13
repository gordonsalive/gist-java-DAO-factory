package com.gordons_alive.playground.dao;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

import com.gordons_alive.playground.juice.Juice;
import com.gordons_alive.playground.juice.JuiceFactory;
import com.gordons_alive.playground.juice.JuiceKind;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void factoryShouldReturnCorrectJuiceAndJuiciness(){
        JuiceFactory juiceFactory = new JuiceFactory();
        Juice bananaJuice = juiceFactory.getJuice(JuiceKind.BANANA);
        Juice strawberryJuice = juiceFactory.getJuice(JuiceKind.STRAWBERRY);
        assertEquals( "bananaJuice name", "Banana Juice", bananaJuice.getName() );
        assertEquals("bananaJuice juiciness", 3, bananaJuice.getJuiciness() );
        assertEquals("strawberryJuice name", "Strawberry Juice", strawberryJuice.getName() );
        assertEquals("strawberryJuice juiciness", 4, strawberryJuice.getJuiciness() );
    }
}
