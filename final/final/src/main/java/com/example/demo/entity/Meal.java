package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
public class Meal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String type;
    private String category;
    private String portion;

    @ManyToOne
    private User user;

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getType() { return type; }
    public void setType(String type) { this.type = type; }
    public String getCategory() { return category; }
    public void setCategory(String category) { this.category = category; }
    public String getPortion() { return portion; }
    public void setPortion(String portion) { this.portion = portion; }
    public User getUser() { return user; }
    public void setUser(User user) { this.user = user; }
}
