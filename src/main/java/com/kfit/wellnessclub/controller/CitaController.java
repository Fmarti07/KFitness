package com.kfit.wellnessclub.controller;

import com.kfit.wellnessclub.domain.Cita;
import com.kfit.wellnessclub.service.CitaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

@Controller
public class CitaController {

    @Autowired
    private CitaService citaService;

    @GetMapping("/cita/formulario")
    public String mostrarFormulario(Model model) {
        model.addAttribute("cita", new Cita());
        return "cita/formulario";
    }

    @PostMapping("/cita/guardar")
    public String guardarCita(
            @RequestParam String nombre,
            @RequestParam String correo,
            @RequestParam String fecha,
            @RequestParam String tipo,
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
        model.addAttribute("correo", correo);
        model.addAttribute("fecha", fecha);
        model.addAttribute("tipo", tipo);
        model.addAttribute("hora", horaFormateada);

        return "cita/confirmacion_cita";
    }
}