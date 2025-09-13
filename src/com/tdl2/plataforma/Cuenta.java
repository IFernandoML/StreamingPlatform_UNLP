package com.tdl2.plataforma;

import java.util.ArrayList;
import java.util.List;

public class Cuenta extends Usuario {
    //private Plan plan;
    private List<Perfil> perfiles;
    //private List<Contenido> listaFavoritos;

    public Cuenta(String email, String contraseña) {
        super(email, contraseña);
        this.perfiles = new ArrayList<>();
        //this.listaFavoritos = new ArrayList<>();
    }

    // Métodos
    public void agregarPerfil(Perfil perfil) {
        this.perfiles.add(perfil);
    }
    public void actualizarPerfil(Perfil perfil) {
        // lógica para actualizar perfil
    }

    // public void cambiarPlan(Plan nuevoPlan) { ... }

    // public void agregarFavorito(Contenido c) { ... }

    // Getters y Setters
    public List<Perfil> getPerfiles() { return perfiles; }
    public void setPerfiles(List<Perfil> perfiles) { this.perfiles = perfiles; }
    //public List<Contenido> getListaFavoritos() { return listaFavoritos; }
    //public void  setListaFavoritos(List<Contenido> listaFavoritos) { this.listaFavoritos = listaFavoritos; } creo que no es
}