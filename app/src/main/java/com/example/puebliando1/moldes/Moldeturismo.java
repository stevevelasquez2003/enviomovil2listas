package com.example.puebliando1.moldes;

import java.io.Serializable;

public class Moldeturismo implements Serializable {
    private String nombre;
    private String nombreContacto;
    private String telefono;
    private String precio;
    private Integer foto;
    private String comentario;
    private  String valoracion;
    private  Integer imagent;

    public Moldeturismo() {
    }

    public Moldeturismo(String nombre, String nombreContacto, String telefono, String precio, Integer foto, String comentario, String valoracion, Integer imagent) {
        this.nombre = nombre;
        this.nombreContacto = nombreContacto;
        this.telefono = telefono;
        this.precio = precio;
        this.foto = foto;
        this.comentario = comentario;
        this.valoracion = valoracion;
        this.imagent = imagent;
    }

    public Integer getImagent() {
        return imagent;
    }

    public void setImagent(Integer imagent) {
        this.imagent = imagent;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public String getValoracion() {
        return valoracion;
    }

    public void setValoracion(String valoracion) {
        this.valoracion = valoracion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombreContacto() {
        return nombreContacto;
    }

    public void setNombreContacto(String nombreContacto) {
        this.nombreContacto = nombreContacto;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public Integer getFoto() {
        return foto;
    }

    public void setFoto(Integer foto) {
        this.foto = foto;
    }
    }

