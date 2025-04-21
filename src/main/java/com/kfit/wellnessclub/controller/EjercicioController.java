package com.kfit.wellnessclub.controller;

import com.kfit.wellnessclub.service.EjercicioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EjercicioController {

    @Autowired
    private EjercicioService ejercicioService;

    @GetMapping("/ejercicio")
    public String mostrarEjercicios(Model model) {
        model.addAttribute("ejercicios", ejercicioService.listarEjercicios());
        return "ejercicio/ejercicio";
    }
}