package com.example.sensors.hardware;

import java.util.List;

/**
 * The central unit reads the state of all the sensors in the building complex. <br>
 * It also controls the flow of heat based on the expected value of the sensor. <br><br>
 * To keep it simple as a PoC the sensor will in this case hold the expected value instead of the central unit,
 * making the sensor a bit more tightly coupled to the behavior.
 */
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
