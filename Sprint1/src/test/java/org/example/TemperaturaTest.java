package org.example;

import org.example.lluvia.Lluvia;
import org.example.temperatura.Temperatura;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TemperaturaTest {
    @Test
    public void isHigh(){
        Temperatura temp = new Temperatura(50);
        assertEquals(true, temp.isHigh());
    }

    @Test
    public void isNotHigh(){
        Temperatura temp = new Temperatura(-20);
        assertEquals(false, temp.isHigh());
    }
}