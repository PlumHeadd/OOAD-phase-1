package com.example.demo.entity;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Meal> meals;

    @OneToOne(cascade = CascadeType.ALL)
    private HealthData healthData;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<DietRecommendation> recommendations;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<EmotionalHealth> emotionalHealthRecords;

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public List<Meal> getMeals() { return meals; }
    public void setMeals(List<Meal> meals) { this.meals = meals; }
    public HealthData getHealthData() { return healthData; }
    public void setHealthData(HealthData healthData) { this.healthData = healthData; }
    public List<DietRecommendation> getRecommendations() { return recommendations; }
    public void setRecommendations(List<DietRecommendation> recommendations) { this.recommendations = recommendations; }
    public List<EmotionalHealth> getEmotionalHealthRecords() { return emotionalHealthRecords; }
    public void setEmotionalHealthRecords(List<EmotionalHealth> emotionalHealthRecords) { this.emotionalHealthRecords = emotionalHealthRecords; }
}
