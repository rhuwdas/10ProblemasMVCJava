
package com.mycompany.login.Modelo;

public class Usuario {
    String usuario;
    String contrasenia;

    public Usuario(String usuario, String contraseña) {
        this.usuario = usuario;
        this.contrasenia = contraseña;
    }

    @Override
    public String toString() {
        return  usuario + "," + contrasenia ;
    }
    
}
