package org.example.data_server;

import org.example.lluvia.Lluvia;
import org.example.temperatura.Temperatura;
import org.example.viento.Viento;

public class DataServer implements DataRepository {
    private Temperatura temp;
    private Viento viento;
    private Lluvia lluvia;

    public DataServer(int tempValue, double humidityValue, int atmosfericPresionValue) {
        this.temp = new Temperatura(tempValue);
        this.lluvia = new Lluvia(humidityValue);
        this.viento = new Viento(atmosfericPresionValue);
    }

    public Lluvia getLluvia() {
        return lluvia;
    }

    public Temperatura getTemp() {
        return temp;
    }

    public Viento getViento() {
        return viento;
    }
}
