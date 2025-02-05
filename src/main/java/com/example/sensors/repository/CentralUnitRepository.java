package com.example.sensors.repository;

import com.example.sensors.model.CentralUnit;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CentralUnitRepository extends CrudRepository<CentralUnit, Long> {
    public Optional<CentralUnit> findById(Long id);
    public List<CentralUnit> findAll();
}
