package com.example.sensors.service;

import com.example.sensors.model.sensor.Sensor;
import com.example.sensors.model.sensor.SensorAsync;
import com.example.sensors.repository.reactor.SensorRepository;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
public record TemperatureService(
        SensorRepository sensorRepository
) {
    public Flux<SensorAsync> findAllByCentralUnitId(Long centralUnitId) {
        return sensorRepository.findAllByCentralUnitId(centralUnitId);
    }
}
