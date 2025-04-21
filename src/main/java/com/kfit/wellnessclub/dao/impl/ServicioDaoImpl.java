package com.kfit.wellnessclub.dao.impl;

import com.kfit.wellnessclub.dao.ServicioDao;
import com.kfit.wellnessclub.domain.Servicio;
import org.springframework.stereotype.Repository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Repository
public class ServicioDaoImpl implements ServicioDao {

    private final String URL = "jdbc:mysql://localhost:3306/kfit_db";
    private final String USER = "root";
    private final String PASS = "tu_contraseña"; // Reemplaza con la tuya

    @Override
    public List<Servicio> listarServicios() {
        List<Servicio> servicios = new ArrayList<>();
        String sql = "SELECT * FROM servicios";

        try (Connection conn = DriverManager.getConnection(URL, USER, PASS);
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                Servicio s = new Servicio();
                s.setId(rs.getLong("id"));
                s.setTitulo(rs.getString("titulo"));
                s.setDescripcion(rs.getString("descripcion"));
                s.setRutaImagen(rs.getString("ruta_imagen"));
                servicios.add(s);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return servicios;
    }
}