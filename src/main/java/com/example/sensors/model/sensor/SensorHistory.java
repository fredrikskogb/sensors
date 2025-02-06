package com.example.sensors.model.sensor;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;

import java.time.Instant;

@Entity
public class SensorHistory {
    @EmbeddedId
    private SensorHistoryId id;
    private double value;
    private double expectedValue;
    private Instant time;
}
