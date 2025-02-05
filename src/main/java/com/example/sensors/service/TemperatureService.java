package com.example.sensors.service;

import com.example.sensors.model.sensor.SensorAsync;
import com.example.sensors.repository.reactor.SensorRepository;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

import java.time.Duration;

@Service
public record TemperatureService(
        SensorRepository sensorRepository
) {
    public Flux<SensorAsync> findAllByCentralUnitId(Long centralUnitId) {
        return Flux.interval(Duration.ofSeconds(3))  // Poll the database every 1 second
                .flatMap(tick -> sensorRepository.findAllByCentralUnitId(centralUnitId));
        // TODO: try distinctUntilChanged
    }
}
