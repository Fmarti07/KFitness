package com.kfit.wellnessclub.dao.impl;

import com.kfit.wellnessclub.dao.AsesoriaDao;
import com.kfit.wellnessclub.domain.Asesoria;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;
/**
 *
 * @author flormartinez
 */

@Repository
public class AsesoriaDaoImpl implements AsesoriaDao {

    private final String JDBC_URL = "jdbc:mysql://localhost:3306/kfit_db";
    private final String USER = "root";
    private final String PASSWORD = "Zoe070887*";

    @Override
    public void guardar(Asesoria asesoria) {
        String sql = "INSERT INTO asesorias (nombre, correo, mensaje) VALUES (?, ?, ?)";

        try (Connection conn = DriverManager.getConnection(JDBC_URL, USER, PASSWORD);
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, asesoria.getNombre());
            stmt.setString(2, asesoria.getCorreo());
            stmt.setString(3, asesoria.getMensaje());

            stmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Asesoria> listar() {
        List<Asesoria> lista = new ArrayList<>();
        String sql = "SELECT * FROM asesorias";

        try (Connection conn = DriverManager.getConnection(JDBC_URL, USER, PASSWORD);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                Asesoria a = new Asesoria();
                a.setId(rs.getInt("id"));
                a.setNombre(rs.getString("nombre"));
                a.setCorreo(rs.getString("correo"));
                a.setMensaje(rs.getString("mensaje"));
                lista.add(a);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return lista;
    }
}