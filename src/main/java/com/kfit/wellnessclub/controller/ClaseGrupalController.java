package com.kfit.wellnessclub.controller;

import com.kfit.wellnessclub.domain.Cita;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

@Controller
public class ClaseGrupalController {

    @GetMapping("/cita/clases")
    public String mostrarClasesGrupales(Model model) {
        model.addAttribute("cita", new Cita());
        return "cita/clases";
    }

    @PostMapping("/cita/reservar-clase")
    public String reservarClase(
            @RequestParam String tipoClase,
            @RequestParam String nombre,
            @RequestParam String correo,
            @RequestParam String fecha,
            @RequestParam String hora,
            Model model) {

        // Formatear hora a AM/PM
        String horaFormateada;
        try {
            LocalTime horaOriginal = LocalTime.parse(hora);
            DateTimeFormatter formatoAMPM = DateTimeFormatter.ofPattern("hh:mm a", new Locale("es"));
            horaFormateada = horaOriginal.format(formatoAMPM);
        } catch (Exception e) {
            horaFormateada = hora;
        }

        model.addAttribute("nombre", nombre);
        model.addAttribute("tipoClase", tipoClase);
        model.addAttribute("fecha", fecha);
        model.addAttribute("hora", horaFormateada);

        return "cita/confirmacion_citagrupal";
    }
}