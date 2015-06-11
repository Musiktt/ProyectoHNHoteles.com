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
public class Administrador extends Usuario{
    private int telefono;
    private String pais;

    public Administrador() {
    }

    public Administrador(int telefono, String pais, String nombre, String apellidos, String genero, String email, String contraseña) {
        super(nombre, apellidos, genero, email, contraseña);
        this.telefono = telefono;
        this.pais = pais;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "Administrador{" + "telefono=" + telefono + ", pais=" + pais + '}';
    }

    
}
