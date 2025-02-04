package com.example.sensors.controller;

import com.example.sensors.service.TemperatureService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/temperature")
public record TemperatureController(TemperatureService temperatureService) {

}
