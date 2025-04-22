package com.kfit.wellnessclub.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
/**
 *
 * @author flormartinez
 */
@Controller
@RequestMapping("/pago")
public class PagoController {

    @GetMapping("/formulario")
    public String mostrarFormularioPago(@RequestParam("plan") String plan, Model model) {
        model.addAttribute("plan", plan);
        return "pago/formulario";
    }

  @PostMapping("/confirmar")
public String procesarPago(@RequestParam String plan,
                            @RequestParam String nombre,
                            @RequestParam("numero") String tarjeta,
                            @RequestParam String expiracion,
                            @RequestParam String cvv,
                            Model model) {

    String mensaje = "¡Gracias por suscribirte al " + plan + "!";
    model.addAttribute("mensaje", mensaje);
    return "pago/confirmacion";
}
}