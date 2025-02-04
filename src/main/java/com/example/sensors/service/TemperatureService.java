package com.example.sensors.service;

import com.example.sensors.repository.CentralUnitRepository;
import com.example.sensors.repository.SensorRepository;
import org.springframework.stereotype.Service;

@Service
public record TemperatureService(
        CentralUnitRepository centralUnitRepository,
        SensorRepository sensorRepository
) {

}
