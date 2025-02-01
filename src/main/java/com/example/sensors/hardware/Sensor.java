package com.example.sensors.hardware;

public class Sensor {
    private Long id;
    private double value;

    public Long getId() {
        return id;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
}
