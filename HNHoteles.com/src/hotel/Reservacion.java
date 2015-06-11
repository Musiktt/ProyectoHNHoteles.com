/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hotel;

import java.util.ArrayList;
import usuario.Cliente;

/**
 *
 * @author Stward
 */
public class Reservacion {
    private ArrayList<Habitacion> habitaciones;
    private String entrada;
    private String salida;
    private String tipoDeHabitacion;
    private double total;
    private Cliente personaEncargada;
    private int cantidadNinnos;
    private int cantidadAdultos;
    private Hotel hotel;

    public Reservacion() {
    }

    public Reservacion(String entrada, String salida, String tipoDeHabitacion, double total, Cliente personaEncargada, int cantidadNinnos, int cantidadAdultos, Hotel hotel) {
        this.habitaciones = new ArrayList<>();
        this.entrada = entrada;
        this.salida = salida;
        this.tipoDeHabitacion = tipoDeHabitacion;
        this.total = total;
        this.personaEncargada = personaEncargada;
        this.cantidadNinnos = cantidadNinnos;
        this.cantidadAdultos = cantidadAdultos;
        this.hotel = hotel;
    }

    public ArrayList<Habitacion> getHabitaciones() {
        return this.habitaciones;
    }

    public String getEntrada() {
        return entrada;
    }

    public void setEntrada(String entrada) {
        this.entrada = entrada;
    }

    public String getSalida() {
        return salida;
    }

    public void setSalida(String salida) {
        this.salida = salida;
    }

    public String getTipoDeHabitacion() {
        return tipoDeHabitacion;
    }

    public void setTipoDeHabitacion(String tipoDeHabitacion) {
        this.tipoDeHabitacion = tipoDeHabitacion;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public Cliente getPersonaEncargada() {
        return personaEncargada;
    }

    public void setPersonaEncargada(Cliente personaEncargada) {
        this.personaEncargada = personaEncargada;
    }

    public int getCantidadNinnos() {
        return cantidadNinnos;
    }

    public void setCantidadNinnos(int cantidadNinnos) {
        this.cantidadNinnos = cantidadNinnos;
    }

    public int getCantidadAdultos() {
        return cantidadAdultos;
    }

    public void setCantidadAdultos(int cantidadAdultos) {
        this.cantidadAdultos = cantidadAdultos;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    @Override
    public String toString() {
        return "Reservacion{" + "habitaciones=" + habitaciones + ", entrada=" + entrada + ", salida=" + salida + ", tipoDeHabitacion=" + tipoDeHabitacion + ", total=" + total + ", personaEncargada=" + personaEncargada + ", cantidadNinnos=" + cantidadNinnos + ", cantidadAdultos=" + cantidadAdultos + ", hotel=" + hotel + '}';
    }
    
    
}
