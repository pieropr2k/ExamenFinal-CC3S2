package org.example;

import org.example.viento.Viento;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class VientoTest {
    private Viento viento;
    @BeforeEach
    public void setUp() {
        viento = new Viento(100);
    }

    @Test
    public void testConstructorWithValidPressure() {
        Viento viento = new Viento(100);
        assertEquals(130, viento.getVelocidad());
        assertEquals(100, viento.getPresionAtmosferica());
    }
    @Test
    public void testConstructorWithInvalidPressure() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Viento(-10);
        });
    }
    @Test
    public void testGetVelocidad() {
        assertEquals(130, viento.getVelocidad());
    }
    @Test
    public void testSetVelocidad() {
        viento.setVelocidad(150);
        assertEquals(150, viento.getVelocidad());
    }
    @Test
    public void testGetPresionAtmosferica() {
        assertEquals(100, viento.getPresionAtmosferica());
    }
    @Test
    public void testSetPresionAtmosferica() {
        viento.setPresionAtmosferica(200);
        assertEquals(200, viento.getPresionAtmosferica());
    }
    @Test
    public void testIsHigh() {
        Viento vientoBajo = new Viento(750);
        assertFalse(vientoBajo.isHigh());
        Viento vientoAlto = new Viento(100);
        assertTrue(vientoAlto.isHigh());
    }
}
