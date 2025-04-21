package com.kfit.wellnessclub.dao;

import com.kfit.wellnessclub.domain.Ejercicio;
import java.util.List;

/**
 *
 * @author flormartinez
 */
public interface EjercicioDao {
    List<Ejercicio> listarEjercicios();
}