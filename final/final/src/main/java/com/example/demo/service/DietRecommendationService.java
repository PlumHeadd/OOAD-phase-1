package com.example.demo.service;

import com.example.demo.entity.DietRecommendation;
import com.example.demo.repository.DietRecommendationRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DietRecommendationService {
    private final DietRecommendationRepository recommendationRepository;

    public DietRecommendationService(DietRecommendationRepository recommendationRepository) {
        this.recommendationRepository = recommendationRepository;
    }

    public DietRecommendation saveRecommendation(DietRecommendation recommendation) {
        return recommendationRepository.save(recommendation);
    }

    public List<DietRecommendation> getAllRecommendations() {
        return recommendationRepository.findAll();
    }
}
