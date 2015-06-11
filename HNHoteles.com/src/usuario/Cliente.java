/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package usuario;

import hotel.Reservacion;
import java.util.ArrayList;

/**
 *
 * @author Stward
 */
public class Cliente extends Usuario{
    private int numeroDeSocio;
    private String pais;
    private int telefono;
    private int tipoDeMoneda;//Moneda de predileccion
    
    private ArrayList<Reservacion> reservacionesCanceladas;
    private ArrayList<Reservacion> reservacionesPendientes;
    private ArrayList<Reservacion> reservasCompletadas;

    public Cliente() {
    }

    public Cliente(int numeroDeSocio, String pais, int telefono, int tipoDeMoneda, String nombre, String apellidos, String genero, String email, String contraseña) {
        super(nombre, apellidos, genero, email, contraseña);
        this.numeroDeSocio = numeroDeSocio;
        this.pais = pais;
        this.telefono = telefono;
        this.tipoDeMoneda = tipoDeMoneda;
        this.reservacionesCanceladas=new ArrayList<>();
        this.reservacionesPendientes=new ArrayList<>();
        this.reservasCompletadas=new ArrayList<>();
    }

    public int getNumeroDeSocio() {
        return numeroDeSocio;
    }

    public String getPais() {
        return pais;
    }

    public int getTelefono() {
        return telefono;
    }

    public int getTipoDeMoneda() {
        return tipoDeMoneda;
    }

    public ArrayList<Reservacion> getReservacionesCanceladas() {
        return this.reservacionesCanceladas;
    }

    public ArrayList<Reservacion> getReservacionesPendientes() {
        return this.reservacionesPendientes;
    }

    public ArrayList<Reservacion> getReservasCompletadas() {
        return this.reservasCompletadas;
    }

    public void setNumeroDeSocio(int numeroDeSocio) {
        this.numeroDeSocio = numeroDeSocio;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public void setTipoDeMoneda(int tipoDeMoneda) {
        this.tipoDeMoneda = tipoDeMoneda;
    }
    
    
}
