package com.kfit.wellnessclub.controller;

import com.kfit.wellnessclub.service.PlanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
/**
 *
 * @author flormartinez
 */
@Controller
public class PlanController {

    @Autowired
    private PlanService planService;

    @GetMapping("/planes")
    public String mostrarPlanes(Model model) {
        model.addAttribute("planes", planService.obtenerPlanes());
        return "planes/listado";
    }
}