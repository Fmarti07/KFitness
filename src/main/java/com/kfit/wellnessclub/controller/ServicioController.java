package com.kfit.wellnessclub.controller;

import com.kfit.wellnessclub.service.ServicioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ServicioController {

    @Autowired
    private ServicioService servicioService;

    @GetMapping("/servicios")
    public String mostrarServicios(Model model) {
        model.addAttribute("servicios", servicioService.listar());
        return "servicios/servicios";
    }
}