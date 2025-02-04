package com.example.sensors.model;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;

import java.time.Instant;

@Entity
public class SensorData {
    @EmbeddedId
    private SensorDataId id;
    private double value;
    private double expectedValue;
    private Instant time;
}
