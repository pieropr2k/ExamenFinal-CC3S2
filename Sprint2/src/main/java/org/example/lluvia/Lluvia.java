package org.example.lluvia;

public class Lluvia {
    private int quantity;
    private double humidity;

    public Lluvia(double humidity){
        if (humidity < 0 || humidity > 1) throw new IllegalArgumentException("Humidity must be between 0 and 1");
        this.humidity = humidity;
        this.quantity = (int) (humidity * 5000);
    }

    public double getHumidity() {
        return humidity;
    }

    public void setHumidity(double humidity) {
        this.humidity = humidity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public boolean isIntense() {
        return humidity > 0.4;
    }
}
