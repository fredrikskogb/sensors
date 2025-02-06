package com.example.sensors.model;

import jakarta.persistence.*;

// Has multiple CentralUnit
@Entity
public class Cluster {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private final Long id;
    private String name;
    @ManyToOne
    private Customer customer;

    public Cluster(Long id, String name, Customer customer) {
        this.id = id;
        this.name = name;
        this.customer = customer;
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

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
