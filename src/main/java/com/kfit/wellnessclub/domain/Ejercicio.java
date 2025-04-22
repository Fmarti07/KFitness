package com.kfit.wellnessclub.domain;

import jakarta.persistence.*;
import lombok.Data;
/**
 *
 * @author flormartinez
 */

@Entity
@Data
public class Ejercicio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;
    private String descripcion;
    private String rutaImagen;
}