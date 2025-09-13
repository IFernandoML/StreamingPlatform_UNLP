package com.tdl2.plataforma;
/**
 *Clase que representa un usuario (Abstracto)
 *@author grupo4
 *@version 1.0
 *@since 12/09/2025
 */
public abstract class Usuario {
    private String email;
    private String contraseña;
    private boolean activo;
    public Usuario(String email, String contraseña) {
        this.setContraseña(contraseña);
        this.setEmail(email);
        this.activo = true;
    }
    public Usuario(){}

    public String getEmail() { return email; }

    public void setEmail(String email) { this.email = email; }

    public String getContraseña() { return contraseña; }

    public void setContraseña(String contraseña) { this.contraseña = contraseña; }

    public boolean getActivo() { return activo; }

    public void setActivo(boolean activo) { this.activo = activo; }

    public boolean iniciarSesion(String email, String contraseña) {
        return this.email.equals(email) && this.contraseña.equals(contraseña);
    }

    public void cerrarSesion() {
        this.activo = false;
    }

}
