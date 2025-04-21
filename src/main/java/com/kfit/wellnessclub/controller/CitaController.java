package com.kfit.wellnessclub.controller;

import com.kfit.wellnessclub.domain.Cita;
import com.kfit.wellnessclub.service.CitaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CitaController {

    @Autowired
    private CitaService citaService;

    @GetMapping("/cita/formulario")
    public String mostrarFormulario(Model model) {
        model.addAttribute("cita", new Cita());
        return "cita/formulario";
    }
    @GetMapping("/clases")
    public String verClasesGrupales() {
        return "cita/clases";
    }

    @PostMapping("/cita/guardar")
    public String guardar(Cita cita) {
        citaService.guardarCita(cita);
        return "redirect:/"; // o una página de éxito
    }
}
