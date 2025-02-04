package com.example.sensors.repository;

import com.example.sensors.model.Sensor;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Flux;

public interface SensorRepository extends ReactiveCrudRepository<Sensor, Long> {
    /**
    * Flux will stream data from the sensor table and return Sensor when available instead
    * of the whole collection once.
    */
    public Flux<Sensor> findAllByCentralUnitId(Long centralUnitId);
}
