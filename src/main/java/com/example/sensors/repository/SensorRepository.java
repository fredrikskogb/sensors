package com.example.sensors.repository;

import com.example.sensors.model.Sensor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Flux;

import java.util.List;

public interface SensorRepository extends CrudRepository<Sensor, Long> {
    /**
    * Flux will stream data from the sensor table and return Sensor when available instead
    * of the whole collection once.
    */
    public List<Sensor> findAllByCentralUnitId(Long centralUnitId);
}
