package org.example;

import org.example.lluvia.Lluvia;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class LluviaTest {
    @Test
    public void isIntense(){
        Lluvia lluvia = new Lluvia(0.8);
        assertEquals(true, lluvia.isIntense());
    }
    @Test
    public void isNotIntense(){
        Lluvia lluvia = new Lluvia(0.2);
        assertEquals(false, lluvia.isIntense());
    }
    @Test
    public void isNotOnRange(){
        assertThrows(IllegalArgumentException.class, () -> {
            new Lluvia(2);
        });
    }
    @Test
    public void isOnRange(){
        Lluvia lluvia = new Lluvia(0.5);
        assertEquals(0.5, lluvia.getHumidity());
        assertEquals(2500, lluvia.getQuantity());
    }
}
