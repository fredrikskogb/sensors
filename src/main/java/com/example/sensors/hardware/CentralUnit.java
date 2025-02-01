package com.example.sensors.hardware;

import java.util.List;

public class CentralUnit {
    private Long id;
    private String model;
    private List<Sensor> sensors;

    public CentralUnit() {}

    public CentralUnit(String model, List<Sensor> sensors) {
        this.model = model;
        this.sensors = sensors;
    }

    public CentralUnit(Long id, String model, List<Sensor> sensors) {
        this.id = id;
        this.model = model;
        this.sensors = sensors;
    }

    public Long getId() {
        return id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public List<Sensor> getSensors() {
        return sensors;
    }

    public void setSensors(List<Sensor> sensors) {
        this.sensors = sensors;
    }
}
