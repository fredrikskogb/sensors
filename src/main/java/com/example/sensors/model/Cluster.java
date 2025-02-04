package com.example.sensors.model;

import jakarta.persistence.*;

// Has multiple CentralUnit
@Entity
public class Cluster {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @ManyToOne
    private Long customerId;
}
