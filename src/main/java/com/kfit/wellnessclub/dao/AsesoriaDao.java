/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kfit.wellnessclub.dao;

import com.kfit.wellnessclub.domain.Asesoria;
import java.util.List;
/**
 *
 * @author flormartinez
 */
public interface AsesoriaDao {
    void guardar(Asesoria asesoria);
    List<Asesoria> listar();
}