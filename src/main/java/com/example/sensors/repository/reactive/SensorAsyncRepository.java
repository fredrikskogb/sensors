package com.example.sensors.repository.reactive;

import com.example.sensors.model.sensor.SensorAsync;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

@Repository
public interface SensorAsyncRepository extends ReactiveCrudRepository<SensorAsync, Long> {
    public Flux<SensorAsync> findAllByCentralUnitId(Long centralUnitId);
}
