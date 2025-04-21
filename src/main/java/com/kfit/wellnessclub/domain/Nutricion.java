package com.kfit.wellnessclub.domain;

import lombok.Data;
import java.util.Date;

@Data
public class Nutricion {
    private int idNutricion;
    private String titulo;
    private String descripcion;
    private String rutaImagen;
    private Date fechaPublicacion;
    private boolean activo;
}