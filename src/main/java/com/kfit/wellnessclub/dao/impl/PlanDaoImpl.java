package com.kfit.wellnessclub.dao.impl;

import com.kfit.wellnessclub.dao.PlanDao;
import com.kfit.wellnessclub.domain.Plan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Repository
public class PlanDaoImpl implements PlanDao {

    @Autowired
    private DataSource dataSource;

    @Override
    public List<Plan> listarPlanes() {
        List<Plan> planes = new ArrayList<>();
        String sql = "SELECT * FROM planes";

        try (Connection conn = dataSource.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                Plan plan = new Plan();
                plan.setId(rs.getLong("id"));
                plan.setNombre(rs.getString("nombre"));
                plan.setDescripcion(rs.getString("descripcion"));
                plan.setPrecio(rs.getDouble("precio"));
                plan.setDuracion(rs.getString("duracion"));
                planes.add(plan);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return planes;
    }
}