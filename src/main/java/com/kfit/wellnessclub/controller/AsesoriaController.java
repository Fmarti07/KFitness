package com.kfit.wellnessclub.controller;

import com.kfit.wellnessclub.domain.Asesoria;
import com.kfit.wellnessclub.service.AsesoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class AsesoriaController {

    @Autowired
    private AsesoriaService asesoriaService;

    @GetMapping("/nutricion/formulario")
    public String mostrarFormulario(Model model) {
        model.addAttribute("asesoria", new Asesoria());
        return "templates.nutricion.formulario";
    }

    @PostMapping("/nutricion/guardar")
    public String guardarAsesoria(@ModelAttribute Asesoria asesoria) {
        asesoriaService.guardarAsesoria(asesoria);
        return "redirect:/nutricion?exito";
    }
}