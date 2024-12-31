package com.example.demo.controller;

import com.example.demo.entity.Meal;
import com.example.demo.service.MealService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/meals")
public class MealController {
    private final MealService mealService;

    public MealController(MealService mealService) {
        this.mealService = mealService;
    }

    @GetMapping
    public String getMeals(Model model) {
        List<Meal> meals = mealService.getAllMeals();
        model.addAttribute("meals", meals);
        return "meals";
    }

    @PostMapping
    public String createMeal(@ModelAttribute Meal meal) {
        mealService.saveMeal(meal);
        return "redirect:/meals";
    }
}
