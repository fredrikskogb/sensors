package com.example.sensors.repository.reactor;

import com.example.sensors.model.sensor.SensorAsync;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

@Repository
public interface SensorRepository extends ReactiveCrudRepository<SensorAsync, Long> {
    public Flux<SensorAsync> findAllByCentralUnitId(Long centralUnitId);
}
