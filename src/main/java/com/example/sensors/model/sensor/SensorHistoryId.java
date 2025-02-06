package com.example.sensors.model.sensor;

import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class SensorHistoryId implements Serializable {
    private Long sensorId;
    private Long centralUnitId;

    public SensorHistoryId() {}

    public SensorHistoryId(Long sensorId, Long centralUnitId) {
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
        SensorHistoryId that = (SensorHistoryId) o;
        return Objects.equals(sensorId, that.sensorId) && Objects.equals(centralUnitId, that.centralUnitId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sensorId, centralUnitId);
    }
}


