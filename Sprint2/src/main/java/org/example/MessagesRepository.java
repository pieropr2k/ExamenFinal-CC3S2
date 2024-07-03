package org.example;

public interface MessagesRepository {
    String temperatureMessage(boolean isHigh);
    String rainMessage(boolean isIntense);
    String windMessage(boolean isWindy);
}
