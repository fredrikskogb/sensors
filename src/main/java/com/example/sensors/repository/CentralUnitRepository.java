package com.example.sensors.repository;

import com.example.sensors.model.CentralUnit;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface CentralUnitRepository extends CrudRepository<CentralUnit, Long> {
    public Optional<CentralUnit> findById(Long id);
    public List<CentralUnit> findAll();
}
