package com.kfit.wellnessclub.domain;

public class Plan {
    private Long id;
    private String nombre;
    private String descripcion;
    private Double precio;
    private String duracion;

    private String nombreEn;
    private String descripcionEn;
    private String duracionEn;

    // Getters y setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }

    public Double getPrecio() { return precio; }
    public void setPrecio(Double precio) { this.precio = precio; }

    public String getDuracion() { return duracion; }
    public void setDuracion(String duracion) { this.duracion = duracion; }

    public String getNombreEn() { return nombreEn; }
    public void setNombreEn(String nombreEn) { this.nombreEn = nombreEn; }

    public String getDescripcionEn() { return descripcionEn; }
    public void setDescripcionEn(String descripcionEn) { this.descripcionEn = descripcionEn; }

    public String getDuracionEn() { return duracionEn; }
    public void setDuracionEn(String duracionEn) { this.duracionEn = duracionEn; }
}