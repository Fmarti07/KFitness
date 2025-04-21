package com.kfit.wellnessclub.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SuscripcionController {

    @PostMapping("/suscribirse")
    public String procesarSuscripcion(@RequestParam("correo") String correo) {
        // Aquí puedes guardar el correo en base de datos, enviar email, etc.
        System.out.println("Correo suscrito: " + correo);

     
        return "redirect:/?suscrito=true";
    }
}