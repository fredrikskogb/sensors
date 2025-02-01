package com.example.sensors.hardware.unit;

public class Sensor {
    private Long id;
    private double value;
    private double expectedValue;

    public Long getId() {
        return id;
    }

    // TODO: Simulate changes in temperature
    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public double getExpectedValue() {
        return expectedValue;
    }

    public void setExpectedValue(double expectedValue) {
        this.expectedValue = expectedValue;
    }
}
