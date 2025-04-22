package com.kfit.wellnessclub.service.impl;

import com.kfit.wellnessclub.dao.PlanDao;
import com.kfit.wellnessclub.domain.Plan;
import com.kfit.wellnessclub.service.PlanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
/**
 *
 * @author flormartinez
 */


@Service
public class PlanServiceImpl implements PlanService {

    @Autowired
    private PlanDao planDao;

    @Override
    public List<Plan> obtenerPlanes() {
        return planDao.listarPlanes();
    }
}