package com.example.sensors.model;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(schema = "sensor")
public class SensorAsync {
    @Id
    private final Long id;
    private double value;
    private double expectedValue;
    @Column(name = "central_unit_id")
    private Long centralUnitId;

    public SensorAsync(Long id, double value, double expectedValue, Long centralUnitId) {
        this.id = id;
        this.value = value;
        this.expectedValue = expectedValue;
        this.centralUnitId = centralUnitId;
    }
}
