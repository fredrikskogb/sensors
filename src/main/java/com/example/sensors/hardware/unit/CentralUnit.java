package com.example.sensors.hardware.unit;

import java.util.List;

/**
 * The central unit reads the state of all the sensors in the building complex/cluster. <br>
 * It should also control the flow of heat based on the expected value of the sensor. <br><br>
 * The central unit calls the database with current values, since a persistent storage was required.
 * Even though the central unit could act as an independent storage. <br>
 * I have decided to let the central unit call the database, instead of reading from the database,
 * to simulate it to be independent and working without a connection. <br><br>
 * To keep it simple as a PoC the sensor will in this case hold the expected value instead of the central unit,
 * making the sensor a bit more tightly coupled to the behavior.<br>
 * The heat control will also not be implemented.
 */
public class CentralUnit {
    private Long id;
    private String name;
    private List<Sensor> sensors;

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
