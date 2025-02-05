package com.example.sensors.controller;

import com.example.sensors.model.sensor.SensorAsync;
import com.example.sensors.service.TemperatureService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/stream/temperature")
public record TemperatureController(TemperatureService temperatureService) {
    @GetMapping("/{centralUnitId}")
    public Flux<SensorAsync> findAllByCentralUnitId(@PathVariable Long centralUnitId) {
        return this.temperatureService.findAllByCentralUnitId(centralUnitId);
    }
}