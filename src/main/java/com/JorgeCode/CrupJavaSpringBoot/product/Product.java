package com.JorgeCode.CrupJavaSpringBoot.product;


import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.time.LocalDate;
@Entity
@Table
public class Product {


    private Long id;
    private int documento;
    private String names;
    private String last_names;
    private String email;
    private int telefono;
    private LocalDate fecha;
    private int antiguedad;

    public Product() {
    }

    public Product(Long id, int documento, String names, String last_names, String email, int telefono, LocalDate fecha,
                   int antiguedad) {
        this.id = id;
        this.documento = documento;
        this.names = names;
        this.last_names = last_names;
        this.email = email;
        this.telefono = telefono;
        this.fecha = fecha;
        this.antiguedad = antiguedad;
    }

    public Product(int documento, String names, String last_names, String email, int telefono, LocalDate fecha, int antiguedad) {
        this.documento = documento;
        this.names = names;
        this.last_names = last_names;
        this.email = email;
        this.telefono = telefono;
        this.fecha = fecha;
        this.antiguedad = antiguedad;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public String getLast_names() {
        return last_names;
    }

    public void setLast_names(String last_names) {
        this.last_names = last_names;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }
}