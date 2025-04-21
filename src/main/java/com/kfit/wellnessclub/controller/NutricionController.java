package com.kfit.wellnessclub.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author flormartinez
 */
@Controller
public class NutricionController {

    @GetMapping("/nutricion")
    public String mostrarVistaNutricion() {
        return "nutricion/nutricion";
    }
}
