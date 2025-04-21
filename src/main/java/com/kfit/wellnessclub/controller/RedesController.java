
package com.kfit.wellnessclub.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RedesController {

    @GetMapping("/redes")
    public String mostrarRedes() {
        return "redes/redes";
    }
}