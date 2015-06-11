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
public class Habitacion {
    private int numeroDeLaHabitacion;
    private String tipoDeHabitacion;
    
    //Informacion de almacenamiento
    private boolean disponibilidad;
    private String tipoDeCama;
    private int capacidadDePersonas;
    private String tamannoDeLaHabitacion;
    private String descripcionDeLaHabitacion;
    
    //Indicaciones si posee:
    private boolean salon;
    private boolean terraza;
    private boolean vistaAlMar;
    private boolean todoIncluido;
    private boolean areaDeFumado;
    
    private Temporada temporada;
    private Precio precio;

    public Habitacion() {
    }

    public Habitacion(int numeroDeLaHabitacion, String tipoDeHabitacion, boolean disponibilidad, String tipoDeCama, int capacidadDePersonas, String tamannoDeLaHabitacion, String descripcionDeLaHabitacion, boolean salon, boolean terraza, boolean vistaAlMar, boolean todoIncluido, boolean areaDeFumado, Temporada temporada, Precio precio) {
        this.numeroDeLaHabitacion = numeroDeLaHabitacion;
        this.tipoDeHabitacion = tipoDeHabitacion;
        this.disponibilidad = disponibilidad;
        this.tipoDeCama = tipoDeCama;
        this.capacidadDePersonas = capacidadDePersonas;
        this.tamannoDeLaHabitacion = tamannoDeLaHabitacion;
        this.descripcionDeLaHabitacion = descripcionDeLaHabitacion;
        this.salon = salon;
        this.terraza = terraza;
        this.vistaAlMar = vistaAlMar;
        this.todoIncluido = todoIncluido;
        this.areaDeFumado = areaDeFumado;
        this.temporada = temporada;
        this.precio = precio;
    }

    public int getNumeroDeLaHabitacion() {
        return numeroDeLaHabitacion;
    }

    public void setNumeroDeLaHabitacion(int numeroDeLaHabitacion) {
        this.numeroDeLaHabitacion = numeroDeLaHabitacion;
    }

    public String getTipoDeHabitacion() {
        return tipoDeHabitacion;
    }

    public void setTipoDeHabitacion(String tipoDeHabitacion) {
        this.tipoDeHabitacion = tipoDeHabitacion;
    }

    public boolean isDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public String getTipoDeCama() {
        return tipoDeCama;
    }

    public void setTipoDeCama(String tipoDeCama) {
        this.tipoDeCama = tipoDeCama;
    }

    public int getCapacidadDePersonas() {
        return capacidadDePersonas;
    }

    public void setCapacidadDePersonas(int capacidadDePersonas) {
        this.capacidadDePersonas = capacidadDePersonas;
    }

    public String getTamannoDeLaHabitacion() {
        return tamannoDeLaHabitacion;
    }

    public void setTamannoDeLaHabitacion(String tamannoDeLaHabitacion) {
        this.tamannoDeLaHabitacion = tamannoDeLaHabitacion;
    }

    public String getDescripcionDeLaHabitacion() {
        return descripcionDeLaHabitacion;
    }

    public void setDescripcionDeLaHabitacion(String descripcionDeLaHabitacion) {
        this.descripcionDeLaHabitacion = descripcionDeLaHabitacion;
    }

    public boolean isSalon() {
        return salon;
    }

    public void setSalon(boolean salon) {
        this.salon = salon;
    }

    public boolean isTerraza() {
        return terraza;
    }

    public void setTerraza(boolean terraza) {
        this.terraza = terraza;
    }

    public boolean isVistaAlMar() {
        return vistaAlMar;
    }

    public void setVistaAlMar(boolean vistaAlMar) {
        this.vistaAlMar = vistaAlMar;
    }

    public boolean isTodoIncluido() {
        return todoIncluido;
    }

    public void setTodoIncluido(boolean todoIncluido) {
        this.todoIncluido = todoIncluido;
    }

    public boolean isAreaDeFumado() {
        return areaDeFumado;
    }

    public void setAreaDeFumado(boolean areaDeFumado) {
        this.areaDeFumado = areaDeFumado;
    }

    public Temporada getTemporada() {
        return temporada;
    }

    public void setTemporada(Temporada temporada) {
        this.temporada = temporada;
    }

    public Precio getPrecio() {
        return precio;
    }

    public void setPrecio(Precio precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Habitacion{" + "numeroDeLaHabitacion=" + numeroDeLaHabitacion + ", tipoDeHabitacion=" + tipoDeHabitacion + ", disponibilidad=" + disponibilidad + ", tipoDeCama=" + tipoDeCama + ", capacidadDePersonas=" + capacidadDePersonas + ", tamannoDeLaHabitacion=" + tamannoDeLaHabitacion + ", descripcionDeLaHabitacion=" + descripcionDeLaHabitacion + ", salon=" + salon + ", terraza=" + terraza + ", vistaAlMar=" + vistaAlMar + ", todoIncluido=" + todoIncluido + ", areaDeFumado=" + areaDeFumado + ", temporada=" + temporada + ", precio=" + precio + '}';
    }

    
    
}
