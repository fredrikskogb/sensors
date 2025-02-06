package com.example.sensors.model;

import jakarta.persistence.*;

// Has multiple Sensor
@Entity
public class CentralUnit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private final Long id;
    private String name;
    @ManyToOne
    private Cluster cluster;

    public CentralUnit(Long id, String name, Cluster cluster) {
        this.id = id;
        this.name = name;
        this.cluster = cluster;
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

    public Cluster getCluster() {
        return cluster;
    }

    public void setCluster(Cluster cluster) {
        this.cluster = cluster;
    }
}
