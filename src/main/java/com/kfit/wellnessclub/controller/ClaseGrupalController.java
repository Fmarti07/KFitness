package com.kfit.wellnessclub.controller;

import com.kfit.wellnessclub.domain.Cita;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ClaseGrupalController {

@GetMapping("/cita/clases")
public String mostrarClasesGrupales(Model model) {
    model.addAttribute("cita", new Cita()); 
    return "cita/clases";
    }
}