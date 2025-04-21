package com.kfit.wellnessclub.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CookiesController {

    @GetMapping("/cookies")
    public String mostrarConfiguracionCookies() {
        return "cookies";
    }

    @PostMapping("/cookies/guardar")
    public String guardarPreferenciasCookies(
            @RequestParam(required = false) String analiticas,
            @RequestParam(required = false) String marketing) {

        // Aquí podrías guardar las preferencias en una cookie real o base de datos.
        System.out.println("Preferencias de cookies:");
        System.out.println("Analíticas: " + (analiticas != null));
        System.out.println("Marketing: " + (marketing != null));

        return "redirect:/?cookiesGuardadas=true";
    }
}