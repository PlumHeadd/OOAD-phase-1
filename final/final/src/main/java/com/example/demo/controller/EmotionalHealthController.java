package com.example.demo.controller;

import com.example.demo.entity.EmotionalHealth;
import com.example.demo.service.EmotionalHealthService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/emotions")
public class EmotionalHealthController {
    private final EmotionalHealthService emotionalHealthService;

    public EmotionalHealthController(EmotionalHealthService emotionalHealthService) {
        this.emotionalHealthService = emotionalHealthService;
    }

    @GetMapping
    public String getEmotions(Model model) {
        List<EmotionalHealth> emotions = emotionalHealthService.getAllEmotionalHealthRecords();
        model.addAttribute("emotions", emotions);
        return "emotions";
    }

    @PostMapping
    public String createEmotion(@ModelAttribute EmotionalHealth emotion) {
        emotionalHealthService.saveEmotionalHealth(emotion);
        return "redirect:/emotions";
    }
}
