package com.kfit.wellnessclub.dao;

import com.kfit.wellnessclub.domain.Cita;
import java.util.List;

public interface CitaDao {
    void guardar(Cita cita);
    List<Cita> listar();
}