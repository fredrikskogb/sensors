package com.example.sensors.repository;

import com.example.sensors.model.sensor.Sensor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface SensorRepository extends CrudRepository<Sensor, Long> {
    List<Sensor> findByCentralUnitId(Long centralUnitId);

    @Modifying
    @Transactional
    @Query(value = "UPDATE sensor SET expected_value = :expectedValue WHERE id = :id", nativeQuery = true)
    void updateExpectedValueBySensorId(@Param("id") Long id, @Param("expectedValue") double expectedValue);

    @Modifying
    @Transactional
    @Query(value = "UPDATE sensor SET \"value\" = :value WHERE id = :id", nativeQuery = true)
    void updateValueBySensorId(@Param("id") Long id, @Param("value") double value);
}
