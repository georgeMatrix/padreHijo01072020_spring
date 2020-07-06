package com.formatoweb.padrehijo01072020.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
public class Hijos {
    private Long id;
    private String nombreHijo;
    private String apellidoHijo;
    private Integer edadHijo;
    private Timestamp createdAt;
    private Timestamp updatedAt;
    private Padres padres;

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
    @Column(name = "nombre_hijo")
    public String getNombreHijo() {
        return nombreHijo;
    }

    public void setNombreHijo(String nombreHijo) {
        this.nombreHijo = nombreHijo;
    }

    @Basic
    @Column(name = "apellido_hijo")
    public String getApellidoHijo() {
        return apellidoHijo;
    }

    public void setApellidoHijo(String apellidoHijo) {
        this.apellidoHijo = apellidoHijo;
    }

    @Basic
    @Column(name = "edad_hijo")
    public Integer getEdadHijo() {
        return edadHijo;
    }

    public void setEdadHijo(Integer edadHijo) {
        this.edadHijo = edadHijo;
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
        Hijos hijos = (Hijos) o;
        return Objects.equals(id, hijos.id) &&
                Objects.equals(nombreHijo, hijos.nombreHijo) &&
                Objects.equals(apellidoHijo, hijos.apellidoHijo) &&
                Objects.equals(edadHijo, hijos.edadHijo) &&
                Objects.equals(createdAt, hijos.createdAt) &&
                Objects.equals(updatedAt, hijos.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombreHijo, apellidoHijo, edadHijo, createdAt, updatedAt);
    }

    @ManyToOne
    @JsonBackReference
    @JoinColumn(name = "id_padre", referencedColumnName = "id", nullable = false)
    public Padres getPadres() {
        return padres;
    }

    public void setPadres(Padres padres) {
        this.padres = padres;
    }
}
