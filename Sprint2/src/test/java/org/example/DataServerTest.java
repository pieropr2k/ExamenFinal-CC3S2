package org.example;

import org.example.data_server.DataServer;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DataServerTest {
    @Test
    public void testSendMail() {
        DataServer dataServer = new DataServer(-6, 0.5, 470);
        assertEquals(dataServer.getTemp().getValue(), -6);
        assertEquals(dataServer.getLluvia().getHumidity(), 0.5);
        assertEquals(dataServer.getViento().getPresionAtmosferica(), 470);
    }
}
