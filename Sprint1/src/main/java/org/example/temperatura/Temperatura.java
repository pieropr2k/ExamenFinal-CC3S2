package org.example.temperatura;

public class Temperatura {
    private int value;

    public Temperatura(int value){
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public boolean isHigh() {
        return value > 35;
    }
}
