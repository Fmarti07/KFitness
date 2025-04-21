package com.kfit.wellnessclub.service;

import com.kfit.wellnessclub.domain.Cita;
import java.util.List;

public interface CitaService {
    void guardarCita(Cita cita);
    List<Cita> obtenerCitas();
}