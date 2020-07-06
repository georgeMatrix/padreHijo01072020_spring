package com.formatoweb.padrehijo01072020.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.*;
import java.util.List;

@Entity
public class Padres {
    private Long id;
    private String nombrePadre;
    private String apellidoPadre;
    private Integer edadPadre;
    private Timestamp createdAt;
    private Timestamp updatedAt;
    private java.util.List<Hijos> hijos;

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "nombre_padre")
    public String getNombrePadre() {
        return nombrePadre;
    }

    public void setNombrePadre(String nombrePadre) {
        this.nombrePadre = nombrePadre;
    }

    @Basic
    @Column(name = "apellido_padre")
    public String getApellidoPadre() {
        return apellidoPadre;
    }

    public void setApellidoPadre(String apellidoPadre) {
        this.apellidoPadre = apellidoPadre;
    }

    @Basic
    @Column(name = "edad_padre")
    public Integer getEdadPadre() {
        return edadPadre;
    }

    public void setEdadPadre(Integer edadPadre) {
        this.edadPadre = edadPadre;
    }

    @Basic
    @Column(name = "created_at")
    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    @Basic
    @Column(name = "updated_at")
    public Timestamp getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Timestamp updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Padres padres = (Padres) o;
        return Objects.equals(id, padres.id) &&
                Objects.equals(nombrePadre, padres.nombrePadre) &&
                Objects.equals(apellidoPadre, padres.apellidoPadre) &&
                Objects.equals(edadPadre, padres.edadPadre) &&
                Objects.equals(createdAt, padres.createdAt) &&
                Objects.equals(updatedAt, padres.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombrePadre, apellidoPadre, edadPadre, createdAt, updatedAt);
    }

    @OneToMany(mappedBy = "padres")
    @JsonManagedReference
    public java.util.List<Hijos> getHijos() {
        return hijos;
    }

    public void setHijos(List<Hijos> hijos) {
        this.hijos = hijos;
    }
}
