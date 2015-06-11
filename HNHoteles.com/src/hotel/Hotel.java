/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hotel;

import java.util.ArrayList;

/**
 *
 * @author Stward
 */
public class Hotel {
    //busqueda de hoteles
    private String descripcionDelHotel;
    private String fechaDeEntrada;
    private String fechaDeSalida;
    private int cantidadDeHabitaciones;
    private int numeroDeAdultos;
    private int numeroDeNinnos;
        
    private String nombre;
    private String direccion;
    private String pais;
    private int telefono;
    private int annoDeConstruccion;

    private String tamañoDelHotel;
    private String horaDeCheckIn;
    private String horaDeCheckOut;
    
    private String tipoDeHospedaje;//cabina, hotel, hostel, todo incluido, etc
    
    private int numeroDeEstrellas;

    private ArrayList<Atractivos> atraccionesCercanas;
    private ArrayList<String> listaDeFotografias;
    private ArrayList<Habitacion> listaDeHabitaciones;

    public Hotel() {
    }

    public Hotel(String descripcionDelHotel, String fechaDeEntrada, String fechaDeSalida, int cantidadDeHabitaciones, int numeroDeAdultos, int numeroDeNinnos, String nombre, String direccion, String pais, int telefono, int annoDeConstruccion, String horaDeCheckIn, String horaDeCheckOut, String tipoDeHospedaje, int numeroDeEstrellas) {
        this.descripcionDelHotel = descripcionDelHotel;
        this.fechaDeEntrada = fechaDeEntrada;
        this.fechaDeSalida = fechaDeSalida;
        this.cantidadDeHabitaciones = cantidadDeHabitaciones;
        this.numeroDeAdultos = numeroDeAdultos;
        this.numeroDeNinnos = numeroDeNinnos;
        this.nombre = nombre;
        this.direccion = direccion;
        this.pais = pais;
        this.telefono = telefono;
        this.annoDeConstruccion = annoDeConstruccion;
        this.horaDeCheckIn = horaDeCheckIn;
        this.horaDeCheckOut = horaDeCheckOut;
        this.tipoDeHospedaje = tipoDeHospedaje;
        this.numeroDeEstrellas = numeroDeEstrellas;
        this.atraccionesCercanas = new ArrayList<>();
        this.listaDeHabitaciones = new ArrayList<>();
        this.listaDeFotografias = new ArrayList<>();
    }

    public String getDescripcionDelHotel() {
        return descripcionDelHotel;
    }

    public String getFechaDeEntrada() {
        return fechaDeEntrada;
    }

    public String getFechaDeSalida() {
        return fechaDeSalida;
    }

    public int getCantidadDeHabitaciones() {
        return cantidadDeHabitaciones;
    }

    public int getNumeroDeAdultos() {
        return numeroDeAdultos;
    }

    public int getNumeroDeNinnos() {
        return numeroDeNinnos;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getPais() {
        return pais;
    }

    public int getTelefono() {
        return telefono;
    }

    public int getAnnoDeConstruccion() {
        return annoDeConstruccion;
    }

    public String getTamañoDelHotel() {
        return tamañoDelHotel;
    }

    public String getHoraDeCheckIn() {
        return horaDeCheckIn;
    }

    public String getHoraDeCheckOut() {
        return horaDeCheckOut;
    }

    public String getTipoDeHospedaje() {
        return tipoDeHospedaje;
    }

    public int getNumeroDeEstrellas() {
        return numeroDeEstrellas;
    }

    public ArrayList<Atractivos> getAtraccionesCercanas() {
        return this.atraccionesCercanas;
    }

    public ArrayList<String> getListaDeFotografias() {
        return this.listaDeFotografias;
    }

    public ArrayList<Habitacion> getListaDeHabitaciones() {
        return this.listaDeHabitaciones;
    }

    public void setDescripcionDelHotel(String descripcionDelHotel) {
        this.descripcionDelHotel = descripcionDelHotel;
    }

    public void setFechaDeEntrada(String fechaDeEntrada) {
        this.fechaDeEntrada = fechaDeEntrada;
    }

    public void setFechaDeSalida(String fechaDeSalida) {
        this.fechaDeSalida = fechaDeSalida;
    }

    public void setCantidadDeHabitaciones(int cantidadDeHabitaciones) {
        this.cantidadDeHabitaciones = cantidadDeHabitaciones;
    }

    public void setNumeroDeAdultos(int numeroDeAdultos) {
        this.numeroDeAdultos = numeroDeAdultos;
    }

    public void setNumeroDeNinnos(int numeroDeNinnos) {
        this.numeroDeNinnos = numeroDeNinnos;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public void setAnnoDeConstruccion(int annoDeConstruccion) {
        this.annoDeConstruccion = annoDeConstruccion;
    }

    public void setTamañoDelHotel(String tamañoDelHotel) {
        this.tamañoDelHotel = tamañoDelHotel;
    }

    public void setHoraDeCheckIn(String horaDeCheckIn) {
        this.horaDeCheckIn = horaDeCheckIn;
    }

    public void setHoraDeCheckOut(String horaDeCheckOut) {
        this.horaDeCheckOut = horaDeCheckOut;
    }

    public void setTipoDeHospedaje(String tipoDeHospedaje) {
        this.tipoDeHospedaje = tipoDeHospedaje;
    }

    public void setNumeroDeEstrellas(int numeroDeEstrellas) {
        this.numeroDeEstrellas = numeroDeEstrellas;
    }

    @Override
    public String toString() {
        return "Hotel{" + "descripcionDelHotel=" + descripcionDelHotel + ", fechaDeEntrada=" + fechaDeEntrada + ", fechaDeSalida=" + fechaDeSalida + ", cantidadDeHabitaciones=" + cantidadDeHabitaciones + ", numeroDeAdultos=" + numeroDeAdultos + ", numeroDeNinnos=" + numeroDeNinnos + ", nombre=" + nombre + ", direccion=" + direccion + ", pais=" + pais + ", telefono=" + telefono + ", annoDeConstruccion=" + annoDeConstruccion + ", tama\u00f1oDelHotel=" + tamañoDelHotel + ", horaDeCheckIn=" + horaDeCheckIn + ", horaDeCheckOut=" + horaDeCheckOut + ", tipoDeHospedaje=" + tipoDeHospedaje + ", numeroDeEstrellas=" + numeroDeEstrellas + ", atraccionesCercanas=" + atraccionesCercanas + ", listaDeFotografias=" + listaDeFotografias + ", listaDeHabitaciones=" + listaDeHabitaciones + '}';
    }
    
    

}
