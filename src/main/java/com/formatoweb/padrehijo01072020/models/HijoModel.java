package com.formatoweb.padrehijo01072020.models;

import com.formatoweb.padrehijo01072020.entity.Padres;
import org.springframework.stereotype.Component;

@Component
public class HijoModel {
    private Long id;
    private Long idPadre;
    private String nombreHijo;
    private String apellidoHijo;
    private Integer edadHijo;
    private Padres padres;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdPadre() {
        return idPadre;
    }

    public void setIdPadre(Long idPadre) {
        this.idPadre = idPadre;
    }

    public String getNombreHijo() {
        return nombreHijo;
    }

    public void setNombreHijo(String nombreHijo) {
        this.nombreHijo = nombreHijo;
    }

    public String getApellidoHijo() {
        return apellidoHijo;
    }

    public void setApellidoHijo(String apellidoHijo) {
        this.apellidoHijo = apellidoHijo;
    }

    public Integer getEdadHijo() {
        return edadHijo;
    }

    public void setEdadHijo(Integer edadHijo) {
        this.edadHijo = edadHijo;
    }

    public Padres getPadres() {
        return padres;
    }

    public void setPadres(Padres padres) {
        this.padres = padres;
    }
}
