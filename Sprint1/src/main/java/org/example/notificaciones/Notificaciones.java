package org.example.notificaciones;

import org.example.alertas.Alertas;
import org.example.auto_acciones.AutoAcciones;
import org.example.data_server.DataRepository;

import java.util.ArrayList;
import java.util.List;

public class Notificaciones {
    private AutoAcciones autoAcciones;
    private Alertas alertas;
    private DataRepository dataServer;

    public Notificaciones(AutoAcciones autoAcciones, Alertas alertas, DataRepository dataServer){
        this.autoAcciones = autoAcciones;
        this.alertas = alertas;
        this.dataServer = dataServer;
    }

    public List<String> notifyAlerts(){
        List<String> notifies = new ArrayList<>();
        notifies.add(alertas.temperatureMessage(dataServer.getTemp().isHigh()));
        notifies.add(alertas.rainMessage(dataServer.getLluvia().isIntense()));
        notifies.add(alertas.windMessage(dataServer.getViento().isHigh()));
        return notifies;
    }

    public List<String> notifyActions(){
        List<String> actions = new ArrayList<>();
        actions.add(autoAcciones.temperatureMessage(dataServer.getTemp().isHigh()));
        actions.add(autoAcciones.rainMessage(dataServer.getLluvia().isIntense()));
        actions.add(autoAcciones.windMessage(dataServer.getViento().isHigh()));
        return actions;
    }
}
