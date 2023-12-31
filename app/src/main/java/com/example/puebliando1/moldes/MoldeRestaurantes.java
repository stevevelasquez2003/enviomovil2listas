package com.example.puebliando1.moldes;

import java.io.Serializable;

public class MoldeRestaurantes implements Serializable {
    private  String nombre;
    private  Integer foto;
    private  String telefono;
    private  String rangoPrecio;
    private  String platoRecomendado;
    private String comentario;
    private  String valoracion;
    private  Integer imagenr;


    public MoldeRestaurantes() {
    }

    public MoldeRestaurantes(String nombre, Integer foto, String telefono, String rangoPrecio, String platoRecomendado, String comentario, String valoracion, Integer imagenr) {
        this.nombre = nombre;
        this.foto = foto;
        this.telefono = telefono;
        this.rangoPrecio = rangoPrecio;
        this.platoRecomendado = platoRecomendado;
        this.comentario = comentario;
        this.valoracion = valoracion;
        this.imagenr = imagenr;
    }

    public Integer getImagenr() {
        return imagenr;
    }

    public void setImagenr(Integer imagenr) {
        this.imagenr = imagenr;
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

    public Integer getFoto() {
        return foto;
    }

    public void setFoto(Integer foto) {
        this.foto = foto;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getRangoPrecio() {
        return rangoPrecio;
    }

    public void setRangoPrecio(String rangoPrecio) {
        this.rangoPrecio = rangoPrecio;
    }

    public String getPlatoRecomendado() {
        return platoRecomendado;
    }

    public void setPlatoRecomendado(String platoRecomendado) {
        this.platoRecomendado = platoRecomendado;
    }
}

