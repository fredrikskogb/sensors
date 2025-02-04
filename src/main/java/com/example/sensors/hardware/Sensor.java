package com.example.sensors.hardware;

public class Sensor {
    private Long id;
    private double value;
    private double expectedValue;

    public Long getId() {
        return id;
    }

    // TODO: Simulate changes in temperature
    // Project Reactor should be able to poll async
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
