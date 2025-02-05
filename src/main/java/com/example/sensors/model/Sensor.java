package com.example.sensors.model;

import jakarta.persistence.*;

@Entity
public class Sensor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private final Long id;
    private double value;
    private double expectedValue;
    @ManyToOne
    private CentralUnit centralUnit;

    public Sensor(Long id, double value, double expectedValue, CentralUnit centralUnit) {
        this.id = id;
        this.value = value;
        this.expectedValue = expectedValue;
        this.centralUnit = centralUnit;
    }

    public Long getId() {
        return id;
    }

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

    public CentralUnit getCentralUnit() {
        return this.centralUnit;
    }

    public void setCentralUnit(CentralUnit centralUnit) {
        this.centralUnit = centralUnit;
    }
}
