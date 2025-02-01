package com.example.sensors.repository;

import com.example.sensors.model.Sensor;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface SensorRepository extends CrudRepository<Sensor, Long> {
    public List<Sensor> findAllByCentralUnitId(Long centralUnitId);
}
