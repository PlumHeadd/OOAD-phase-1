package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
public class HealthData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String heartRate;
    private String steps;
    private String caloriesBurned;

    @OneToOne(mappedBy = "healthData")
    private User user;

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getHeartRate() { return heartRate; }
    public void setHeartRate(String heartRate) { this.heartRate = heartRate; }
    public String getSteps() { return steps; }
    public void setSteps(String steps) { this.steps = steps; }
    public String getCaloriesBurned() { return caloriesBurned; }
    public void setCaloriesBurned(String caloriesBurned) { this.caloriesBurned = caloriesBurned; }
    public User getUser() { return user; }
    public void setUser(User user) { this.user = user; }
}
