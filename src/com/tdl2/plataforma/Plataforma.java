package com.tdl2.plataforma;

import java.util.ArrayList;
import java.util.List;

public class Plataforma {
    private List<Usuario> usuarios;
    //private List<Contenido> contenidos;
    //private List<Reporte> reportes;

    public Plataforma() {
        this.usuarios = new ArrayList<>();
        //this.contenidos = new ArrayList<>();
        //this.reportes = new ArrayList<>();
    }

    public List<Usuario> getUsuarios() { return usuarios; }

    public void setUsuarios(List<Usuario> usuarios) { this.usuarios = usuarios; }

    //public List<Contenido> getContenidos() { return contenidos; }

    //public void setContenidos(List<Contenido> contenidos) { this.contenidos = contenidos; }

    //public List<Reporte> getReportes() { return reportes; }

    //public void setReportes(List<Reporte> reportes) { this.reportes = reportes; }

    private String verificarTipoUsuario(Usuario usuario) {
        if (usuario instanceof Administrador) return "administrador";
        if (usuario instanceof Cuenta) return "cuenta";
        return "Desconocido";
    }

    public void agregarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public void eliminarUsuario(Usuario usuario) {
        usuarios.remove(usuario);
    }

    public Usuario buscarUsuarioPorCredenciales(String email, String contraseña) {
        for (Usuario usuario : usuarios) {
            if (usuario.iniciarSesion(email, contraseña)) return usuario;
        }
        return null;
    }
}
