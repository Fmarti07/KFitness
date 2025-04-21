package com.kfit.wellnessclub.service.impl;

import com.kfit.wellnessclub.dao.ServicioDao;
import com.kfit.wellnessclub.domain.Servicio;
import com.kfit.wellnessclub.service.ServicioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicioServiceImpl implements ServicioService {

    @Autowired
    private ServicioDao servicioDao;

    @Override
    public List<Servicio> listar() {
        return servicioDao.listarServicios();
    }
}