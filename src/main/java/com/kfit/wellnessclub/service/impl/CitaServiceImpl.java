package com.kfit.wellnessclub.service.impl;

import com.kfit.wellnessclub.dao.CitaDao;
import com.kfit.wellnessclub.domain.Cita;
import com.kfit.wellnessclub.service.CitaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
/**
 *
 * @author flormartinez
 */

@Service
public class CitaServiceImpl implements CitaService {

    @Autowired
    private CitaDao citaDao;

    @Override
    public void guardarCita(Cita cita) {
        citaDao.guardar(cita);
    }

    @Override
    public List<Cita> obtenerCitas() {
        return citaDao.listar();
    }
}