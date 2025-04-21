package com.kfit.wellnessclub.service.impl;

import com.kfit.wellnessclub.dao.EjercicioDao;
import com.kfit.wellnessclub.domain.Ejercicio;
import com.kfit.wellnessclub.service.EjercicioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EjercicioServiceImpl implements EjercicioService {

    @Autowired
    private EjercicioDao ejercicioDao;

    @Override
    public List<Ejercicio> listarEjercicios() {
        return ejercicioDao.listarEjercicios();
    }
}