package com.example.sensors.service.reactive;

import com.example.sensors.model.sensor.SensorAsync;
import com.example.sensors.repository.SensorRepository;
import com.example.sensors.repository.reactive.SensorAsyncRepository;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

import java.time.Duration;

@Service
public record TemperatureAsyncService(
        SensorAsyncRepository sensorAsyncRepository,
        SensorRepository sensorRepository
) {
    public Flux<SensorAsync> findAllByCentralUnitId(Long centralUnitId) {
        return Flux.interval(Duration.ofSeconds(3))  // Poll the database every 3 seconds
                .flatMap(tick -> sensorAsyncRepository.findAllByCentralUnitId(centralUnitId));
        // TODO: try distinctUntilChanged
    }

    public void updateSensorExpectedValue(Long id, double expectedValue) {
        sensorRepository.updateExpectedValueBySensorId(id, expectedValue);
    }
}
