package com.example.sensors.service;

import com.example.sensors.repository.CentralUnitRepository;
import org.springframework.stereotype.Service;

@Service
public record TemperatureService(
        CentralUnitRepository centralUnitRepository
) {

}
