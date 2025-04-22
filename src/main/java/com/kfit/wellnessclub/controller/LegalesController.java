package com.kfit.wellnessclub.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
/**
 *
 * @author flormartinez
 */
@Controller
public class LegalesController {

    @GetMapping("/legales")
    public String verLegales() {
        return "legales/legales";
    }
}