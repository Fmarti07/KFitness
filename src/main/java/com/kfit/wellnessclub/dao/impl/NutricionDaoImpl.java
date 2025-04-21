package com.kfit.wellnessclub.dao.impl;

import com.kfit.wellnessclub.dao.NutricionDao;
import com.kfit.wellnessclub.domain.Nutricion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class NutricionDaoImpl implements NutricionDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<Nutricion> listarTodo() {
        String sql = "SELECT * FROM nutricion WHERE activo = true";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Nutricion.class));
    }
}