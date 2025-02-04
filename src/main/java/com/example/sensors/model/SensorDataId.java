package com.example.sensors.model;

import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class SensorDataId implements Serializable {
    private Long sensorId;
    private Long centralUnitId;

    public SensorDataId() {}

    public SensorDataId(Long sensorId, Long centralUnitId) {
        this.sensorId = sensorId;
        this.centralUnitId = centralUnitId;
    }

    public Long getSensorId() {
        return sensorId;
    }

    public void setSensorId(Long sensorId) {
        this.sensorId = sensorId;
    }

    public Long getCentralUnitId() {
        return centralUnitId;
    }

    public void setCentralUnitId(Long centralUnitId) {
        this.centralUnitId = centralUnitId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SensorDataId that = (SensorDataId) o;
        return Objects.equals(sensorId, that.sensorId) && Objects.equals(centralUnitId, that.centralUnitId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sensorId, centralUnitId);
    }
}


