package com.example.sensors.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Sensor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private final Long id;
    private double value;
    private double expectedValue;
    private Long centralUnitId;

    public Sensor(Long id, double value, double expectedValue, Long centralUnitId) {
        this.id = id;
        this.value = value;
        this.expectedValue = expectedValue;
        this.centralUnitId = centralUnitId;
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

    public Long getCentralUnitId() {
        return centralUnitId;
    }

    public void setCentralUnitId(Long centralUnitId) {
        this.centralUnitId = centralUnitId;
    }
}
