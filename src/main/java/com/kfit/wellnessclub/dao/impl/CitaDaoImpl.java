package com.kfit.wellnessclub.dao.impl;

import com.kfit.wellnessclub.dao.CitaDao;
import com.kfit.wellnessclub.domain.Cita;
import org.springframework.stereotype.Repository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Repository
public class CitaDaoImpl implements CitaDao {

    private final String URL = "jdbc:mysql://localhost:3306/kfit_db";
    private final String USER = "root";
    private final String PASS = "Zoe070887*";

    @Override
    public void guardar(Cita cita) {
        try (Connection conn = DriverManager.getConnection(URL, USER, PASS)) {
            String sql = "INSERT INTO citas (nombre, correo, fecha, tipo) VALUES (?, ?, ?, ?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, cita.getNombre());
            stmt.setString(2, cita.getCorreo());
            stmt.setString(3, cita.getFecha());
            stmt.setString(4, cita.getTipo());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Cita> listar() {
        List<Cita> citas = new ArrayList<>();
        try (Connection conn = DriverManager.getConnection(URL, USER, PASS)) {
            String sql = "SELECT * FROM citas";
            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Cita c = new Cita();
                c.setId(rs.getLong("id"));
                c.setNombre(rs.getString("nombre"));
                c.setCorreo(rs.getString("correo"));
                c.setFecha(rs.getString("fecha"));
                c.setTipo(rs.getString("tipo"));
                citas.add(c);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return citas;
    }
}