package org.example.alertas;

import org.example.MessagesRepository;

public class Alertas implements MessagesRepository {
    public String temperatureMessage(boolean isHigh){
        return isHigh ? "Alerta de temperatura alta" : "Temperatura suave hoy";
    }
    public String rainMessage(boolean isIntense){
        return isIntense ? "Alerta de lluvia intensa" : "Lluvia suave hoy";
    }
    public String windMessage(boolean isWindy){
        return isWindy ? "Alerta de viento fuerte" : "Viento normal";
    }
}
