package com.example.demo.controller;

import com.example.demo.entity.HealthData;
import com.example.demo.service.HealthDataService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/healthdata")
public class HealthDataController {
    private final HealthDataService healthDataService;

    public HealthDataController(HealthDataService healthDataService) {
        this.healthDataService = healthDataService;
    }

    @GetMapping
    public String getHealthData(Model model) {
        List<HealthData> healthData = healthDataService.getAllHealthData();
        model.addAttribute("healthData", healthData);
        return "healthdata";
    }

    @PostMapping
    public String createHealthData(@ModelAttribute HealthData healthData) {
        healthDataService.saveHealthData(healthData);
        return "redirect:/healthdata";
    }
}
