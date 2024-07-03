package org.example;

import org.example.alertas.Alertas;
import org.example.auto_acciones.AutoAcciones;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AutoAccionesTest {
    private AutoAcciones autoAcciones;
    @BeforeEach
    public void setUp() {
        autoAcciones = new AutoAcciones();
    }

    @Test
    public void testTemperatureMessage() {
        assertEquals("Poner bloqueador solar", autoAcciones.temperatureMessage(true));
        assertEquals("Abrigarse bien", autoAcciones.temperatureMessage(false));
    }

    @Test
    public void testRainMessage() {
        assertEquals("Activar Sistema de Riego", autoAcciones.rainMessage(true));
        assertEquals("No activar riego", autoAcciones.rainMessage(false));
    }

    @Test
    public void testWindMessage() {
        assertEquals("Cerrar persianas", autoAcciones.windMessage(true));
        assertEquals("No necesidad", autoAcciones.windMessage(false));
    }
}
