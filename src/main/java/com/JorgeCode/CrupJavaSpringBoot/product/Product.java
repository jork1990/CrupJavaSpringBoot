package com.JorgeCode.CrupJavaSpringBoot.product;


import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table
public class Product {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "documento", length =10 , unique = true)
    private int documento;
    @Column(name = "nombres",length = 60,nullable = true)
    private String nombres;
    @Column(name = "apellidos",length = 50,nullable = true)
    private String apellidos;
    @Column(name = "telefono",length = 12,nullable = true)
    private int telefono;
    private LocalDate fecha;
    @Transient
    private int antiguedad;
    @Column(name = "email",length = 50,nullable = true)
    private String email;
    @Column(name = "password",columnDefinition = "TEXT",length = 5,nullable = true)
    private String password;

    public Product() {
    }

    public Product(Long id, int documento, String nombres, String apellidos, int telefono, LocalDate fecha, String email, String password) {
        this.id = id;
        this.documento = documento;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.fecha = fecha;
        this.email = email;
        this.password = password;
    }

    public Product(int documento, String nombres, String apellidos, int telefono, LocalDate fecha,  String email, String password) {
        this.documento = documento;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.fecha = fecha;
        this.email = email;
        this.password = password;
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

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}