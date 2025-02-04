package com.example.sensors.hardware;

import java.util.List;

/**
 * The central unit reads the state of all the sensors in the building complex/cluster. <br>
 * It should also control the flow of heat based on the expected value of the sensor. <br><br>
 * The central unit updates the database with current values since a persistent storage was required,
 * even though the central unit could have acted as an independent storage instead. <br>
 */
public class CentralUnit {
    private Long id;
    private String name;
    private List<Sensor> sensors;

    // TODO: Project Reactor should be able to poll async
    public CentralUnit() {}

    public CentralUnit(String name, List<Sensor> sensors) {
        this.name = name;
        this.sensors = sensors;
    }

    public CentralUnit(Long id, String name, List<Sensor> sensors) {
        this.id = id;
        this.name = name;
        this.sensors = sensors;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Sensor> getSensors() {
        return sensors;
    }

    public void setSensors(List<Sensor> sensors) {
        this.sensors = sensors;
    }
}
