package com.example.sensors.model.sensor;

import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Table("sensor")
public class SensorAsync {
    private final Long id;
    private double value;
    private double expectedValue;
    @Column("central_unit_id")
    private Long centralUnitId;

    public SensorAsync(Long id, double value, double expectedValue, Long centralUnitId) {
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
