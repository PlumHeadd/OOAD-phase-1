package com.example.demo.service;

import com.example.demo.entity.EmotionalHealth;
import com.example.demo.repository.EmotionalHealthRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmotionalHealthService {
    private final EmotionalHealthRepository emotionalHealthRepository;

    public EmotionalHealthService(EmotionalHealthRepository emotionalHealthRepository) {
        this.emotionalHealthRepository = emotionalHealthRepository;
    }

    public EmotionalHealth saveEmotionalHealth(EmotionalHealth emotionalHealth) {
        return emotionalHealthRepository.save(emotionalHealth);
    }

    public List<EmotionalHealth> getAllEmotionalHealthRecords() {
        return emotionalHealthRepository.findAll();
    }
}
