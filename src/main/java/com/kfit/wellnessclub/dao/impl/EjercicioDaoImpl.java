package com.kfit.wellnessclub.dao.impl;

import com.kfit.wellnessclub.dao.EjercicioDao;
import com.kfit.wellnessclub.domain.Ejercicio;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

import java.util.List;
/**
 *
 * @author flormartinez
 */
@Repository
@Transactional
public class EjercicioDaoImpl implements EjercicioDao {

    @PersistenceContext
    private EntityManager em;

    @Override
    public List<Ejercicio> listarEjercicios() {
        return em.createQuery("FROM Ejercicio", Ejercicio.class).getResultList();
    }
}