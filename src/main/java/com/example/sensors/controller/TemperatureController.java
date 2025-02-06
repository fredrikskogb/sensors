package com.example.sensors.controller;

import com.example.sensors.model.sensor.SensorAsync;
import com.example.sensors.service.reactive.TemperatureAsyncService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.MediaType;
import org.springframework.http.codec.ServerSentEvent;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;

@Tag(name = "TemperatureController", description = "Endpoints for temperature data")
@RestController
@RequestMapping("/temperature")
public record TemperatureController(TemperatureAsyncService temperatureService) {

    @Operation(summary = "Endpoint for sensor states")
    @GetMapping(value = "/stream/sensor/{centralUnitId}", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<ServerSentEvent<SensorAsync>> streamSensorData(@PathVariable Long centralUnitId) {
        return this.temperatureService.findAllByCentralUnitId(centralUnitId)
                .map(sensor -> ServerSentEvent.builder(sensor)
                        .event("sensor-update")
                        .data(sensor)
                        .build());
    }

    @Operation(summary = "Update sensor's expected value")
    @PutMapping("/{id}/{expectedValue}")
    public void updateSensorExpectedValue(@PathVariable Long id, @PathVariable double expectedValue) {
        temperatureService.updateSensorExpectedValue(id, expectedValue);
    }

    // TODO: Add endpoint for single sensor history in point values to enable to see temperature over time for client

}