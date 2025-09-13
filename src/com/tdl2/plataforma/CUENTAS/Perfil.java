package com.tdl2.plataforma;

import java.util.List;

public class Perfil {
    private String nombre;
    private String idiomaPreferido;
    private List<String> generosPreferidos;
    //private List<Reseña> reseñas;
    // private Historial historial;

    public Perfil(String nombre, String idiomaPreferido, List<String> generosPreferidos) {
        this.nombre = nombre;
        this.idiomaPreferido = idiomaPreferido;
        this.generosPreferidos = generosPreferidos;
    }

    // Métodos

    public void actualizarIdioma(String idioma) {
        this.idiomaPreferido = idioma;
    }

    public void agregarGeneroPreferido(String genero) {
        if (!this.generosPreferidos.contains(genero)) {
            this.generosPreferidos.add(genero);
        }
    }

    public void eliminarGeneroPreferido(String genero) {
        this.generosPreferidos.remove(genero);
    }

    public void actualizarPreferencias(List<String> generos) {
        this.generosPreferidos = generos;
    }


    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdiomaPreferido() {
        return idiomaPreferido;
    }

    public void setIdiomaPreferido(String idiomaPreferido) {
        this.idiomaPreferido = idiomaPreferido;
    }

    public List<String> getGenerosPreferidos() {
        return generosPreferidos;
    }

    // public void agregarFavorito(Contenido contenido) { ... }
    // public void crearReseña(Contenido c, int calificacion, String comentario) { ... }


    // Metodos relacionados con Historial
    //public Historial verHistorial() { ... }
    // public void agregarContenidoAHistorial(Contenido contenido) { ... }

    // public void eliminarContenidoDeHistorial(Contenido contenido) { ... }

}