package org.example.auto_acciones;

import org.example.MessagesRepository;

public class AutoAcciones implements MessagesRepository {
    public String temperatureMessage(boolean isHigh) {
        return isHigh ? "Poner bloqueador solar" : "Abrigarse bien";
    }

    public String rainMessage(boolean riego) {
        return riego ? "Activar Sistema de Riego" : "No activar riego";
    }

    public String windMessage(boolean vientoEsFuerte) {
        return vientoEsFuerte ? "Cerrar persianas" : "No necesidad";
    }
}
