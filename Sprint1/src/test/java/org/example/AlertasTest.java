package org.example;

import org.example.alertas.Alertas;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AlertasTest {
    private Alertas alertas;

    @BeforeEach
    public void setUp() {
        alertas = new Alertas();
    }

    @Test
    public void testTemperatureMessage() {
        assertEquals("Alerta de temperatura alta", alertas.temperatureMessage(true));
        assertEquals("Temperatura suave hoy", alertas.temperatureMessage(false));
    }

    @Test
    public void testRainMessage() {
        assertEquals("Alerta de lluvia intensa", alertas.rainMessage(true));
        assertEquals("Lluvia suave hoy", alertas.rainMessage(false));
    }

    @Test
    public void testWindMessage() {
        assertEquals("Alerta de viento fuerte", alertas.windMessage(true));
        assertEquals("Viento normal", alertas.windMessage(false));
    }
}
