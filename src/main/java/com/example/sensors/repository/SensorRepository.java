package com.example.sensors.repository;

import com.example.sensors.model.sensor.Sensor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface SensorRepository extends CrudRepository<Sensor, Long> {
    @Modifying
    @Transactional
    @Query(value = "UPDATE sensor SET expected_value = :expectedValue WHERE id = :id", nativeQuery = true)
    void updateExpectedValue(@Param("id") Long id, @Param("expectedValue") double expectedValue);
}
