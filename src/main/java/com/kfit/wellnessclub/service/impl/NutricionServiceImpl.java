package com.kfit.wellnessclub.service.impl;

import com.kfit.wellnessclub.dao.NutricionDao;
import com.kfit.wellnessclub.domain.Nutricion;
import com.kfit.wellnessclub.service.NutricionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NutricionServiceImpl implements NutricionService {

    @Autowired
    private NutricionDao nutricionDao;

    @Override
    public List<Nutricion> obtenerContenido() {
        return nutricionDao.listarTodo();
    }
}