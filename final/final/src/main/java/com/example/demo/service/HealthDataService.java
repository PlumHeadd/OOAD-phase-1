package com.example.demo.service;

import com.example.demo.entity.HealthData;
import com.example.demo.repository.HealthDataRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HealthDataService {
    private final HealthDataRepository healthDataRepository;

    public HealthDataService(HealthDataRepository healthDataRepository) {
        this.healthDataRepository = healthDataRepository;
    }

    public HealthData saveHealthData(HealthData healthData) {
        return healthDataRepository.save(healthData);
    }

    public List<HealthData> getAllHealthData() {
        return healthDataRepository.findAll();
    }
}
