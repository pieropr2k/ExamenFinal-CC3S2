package org.example.data_server;

import org.example.lluvia.Lluvia;
import org.example.temperatura.Temperatura;
import org.example.viento.Viento;

public interface DataRepository {
    Lluvia getLluvia();
    Temperatura getTemp();
    Viento getViento();
}
