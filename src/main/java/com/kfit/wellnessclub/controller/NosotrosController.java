package com.kfit.wellnessclub.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NosotrosController {

  @GetMapping("/sobrenosotros")
public String mostrarNosotros() {
    return "sobrenosotros"; // si está en /templates directamente

    }
}