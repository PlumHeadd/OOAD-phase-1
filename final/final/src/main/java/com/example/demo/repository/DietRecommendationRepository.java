package com.example.demo.repository;

import com.example.demo.entity.DietRecommendation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DietRecommendationRepository extends JpaRepository<DietRecommendation, Long> { }
