package org.example;

import org.example.alertas.Alertas;
import org.example.auto_acciones.AutoAcciones;
import org.example.data_server.DataRepository;
import org.example.data_server.DataServer;
import org.example.lluvia.Lluvia;
import org.example.notificaciones.Notificaciones;
import org.example.temperatura.Temperatura;
import org.example.viento.Viento;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class NotifyTest {
    // Implementamos los fakes:
    private DataRepository dataFake = new DataServer(45, 0.6, 100);
    @Mock
    private Alertas alertasMock;
    @Mock
    private AutoAcciones autoAccionesMock;
    @InjectMocks
    private Notificaciones notificacionsMock;
    @Test
    public void notifyGoodAlerts() {
        // Configuramos los stubs:
        when(alertasMock.temperatureMessage(true)).thenReturn("Alerta de temperatura alta");
        when(alertasMock.rainMessage(true)).thenReturn("Alerta: Lluvia intensa");
        when(alertasMock.windMessage(true)).thenReturn("Alerta: Viento fuerte");

        // Injectamos el fake al mock:
        notificacionsMock = new Notificaciones(autoAccionesMock, alertasMock, dataFake);
        List<String> notificationsList = notificacionsMock.notifyAlerts();
        assertEquals(notificationsList.get(0), "Alerta de temperatura alta");
        assertEquals(notificationsList.get(1), "Alerta: Lluvia intensa");
        assertEquals(notificationsList.get(2), "Alerta: Viento fuerte");
    }

    @Test
    public void notifyGoodActions() {
        // Configuramos los stubs:
        when(autoAccionesMock.temperatureMessage(true)).thenReturn("Poner bloqueador solar");
        when(autoAccionesMock.rainMessage(true)).thenReturn("Sistema de riego activado");
        when(autoAccionesMock.windMessage(true)).thenReturn("Persianas cerradas");

        // Injectamos el fake al mock:
        notificacionsMock = new Notificaciones(autoAccionesMock, alertasMock, dataFake);
        List<String> notificationsList = notificacionsMock.notifyActions();
        assertEquals(notificationsList.get(0), "Poner bloqueador solar");
        assertEquals(notificationsList.get(1), "Sistema de riego activado");
        assertEquals(notificationsList.get(2), "Persianas cerradas");
    }

}