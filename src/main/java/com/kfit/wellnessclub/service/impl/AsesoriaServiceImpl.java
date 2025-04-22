package com.kfit.wellnessclub.service.impl;

import com.kfit.wellnessclub.dao.AsesoriaDao;
import com.kfit.wellnessclub.domain.Asesoria;
import com.kfit.wellnessclub.service.AsesoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 *
 * @author flormartinez
 */

@Service
public class AsesoriaServiceImpl implements AsesoriaService {

    @Autowired
    private AsesoriaDao asesoriaDao;

    @Override
    public void guardarAsesoria(Asesoria asesoria) {
        asesoriaDao.guardar(asesoria);
    }
}