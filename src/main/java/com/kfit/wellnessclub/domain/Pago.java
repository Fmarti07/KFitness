
package com.kfit.wellnessclub.domain;

public class Pago {
    private String nombre;
    private String numeroTarjeta;
    private String expiracion;
    private String cvv;
    private String plan;

    // Getters y Setters
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getNumeroTarjeta() { return numeroTarjeta; }
    public void setNumeroTarjeta(String numeroTarjeta) { this.numeroTarjeta = numeroTarjeta; }

    public String getExpiracion() { return expiracion; }
    public void setExpiracion(String expiracion) { this.expiracion = expiracion; }

    public String getCvv() { return cvv; }
    public void setCvv(String cvv) { this.cvv = cvv; }

    public String getPlan() { return plan; }
    public void setPlan(String plan) { this.plan = plan; }
}