package com.example.sensors.service.hardware;


import com.example.sensors.model.sensor.Sensor;
import com.example.sensors.repository.SensorRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

class SensorUpdateServiceTest {

    @Mock
    private SensorRepository sensorRepository;

    @Mock
    private JdbcTemplate jdbcTemplate;

    @InjectMocks
    private SensorUpdateService sensorUpdateService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this); // Initialize mocks
    }

    @Test
    void testUpdateSensorValuesForMockedCentralUnit() {
        // Arrange
        Sensor sensor1 = new Sensor(1L, 10.0, 20.0, 1L); // Assuming you have a constructor or setters
        Sensor sensor2 = new Sensor(2L, 20.0, 10.0, 1L);
        List<Sensor> sensors = Arrays.asList(sensor1, sensor2);

        when(sensorRepository.findByCentralUnitId(1L)).thenReturn(sensors);

        sensorUpdateService.updateSensorValuesForMockedCentralUnit();

        verify(sensorRepository).findByCentralUnitId(1L);
    }
}