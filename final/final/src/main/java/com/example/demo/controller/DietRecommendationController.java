package com.example.demo.controller;

import com.example.demo.entity.DietRecommendation;
import com.example.demo.service.DietRecommendationService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/recommendations")
public class DietRecommendationController {
    private final DietRecommendationService recommendationService;

    public DietRecommendationController(DietRecommendationService recommendationService) {
        this.recommendationService = recommendationService;
    }

    @GetMapping
    public String getRecommendations(Model model) {
        List<DietRecommendation> recommendations = recommendationService.getAllRecommendations();
        model.addAttribute("recommendations", recommendations);
        return "recommendations";
    }

    @PostMapping
    public String createRecommendation(@ModelAttribute DietRecommendation recommendation) {
        recommendationService.saveRecommendation(recommendation);
        return "redirect:/recommendations";
    }
}
