package com.example.sensors.service.hardware;

import com.example.sensors.model.CentralUnit;
import com.example.sensors.model.sensor.Sensor;
import com.example.sensors.repository.CentralUnitRepository;
import com.example.sensors.repository.SensorRepository;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.List;

// Simulates the hardware updates to the db
@Service
public record SensorUpdateService(
        CentralUnitRepository centralUnitRepository,
        SensorRepository sensorRepository,
        JdbcTemplate jdbcTemplate
) {

    @Scheduled(fixedRate = 5000) // Runs every 5 seconds
    public void updateSensorValuesForMockedCentralUnit() {
        List<Sensor> sensors = sensorRepository.findByCentralUnitId(1L);

        for (Sensor sensor : sensors) {
            double newValue = sensor.getValue() + (Math.random() > 0.5 ? 1 : -1); // Randomly increase or decrease by 1
            sensor.setValue(newValue);
        }

        String sql = "UPDATE sensor SET \"value\" = ? WHERE id = ?";

        List<Object[]> batchArgs = sensors.stream()
                .map(sensor -> new Object[]{sensor.getValue(), sensor.getId()})
                .toList();

        jdbcTemplate.batchUpdate(sql, batchArgs);
    }
}