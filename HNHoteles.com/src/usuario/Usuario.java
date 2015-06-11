/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package usuario;

/**
 *
 * @author Stward
 */
public class Usuario {
    private String nombre;
    private String apellidos;
    private String genero;
    private String email;
    private String contraseña; //contener entre 6 y 20 letras, al menos un numero

    public Usuario() {
    }
    
    public Usuario(String nombre, String apellidos, String genero, String email, String contraseña) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.genero = genero;
        this.email = email;
        this.contraseña = contraseña;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", apellidos=" + apellidos + ", genero=" + genero + ", email=" + email + ", contrase\u00f1a=" + contraseña + '}';
    }
    
    
    
}   
