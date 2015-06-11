/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hotel;

/**
 *
 * @author Stward
 */
public class Temporada{
    private String codigo;
    private String fechaDeInicio;
    private String fechaDeFin;
    private String nombre; 
    
    public Temporada() {
    }

    public Temporada(String codigo, String fechaDeInicio, String fechaDeFin, String nombre) {
        this.codigo = codigo;
        this.fechaDeInicio = fechaDeInicio;
        this.fechaDeFin = fechaDeFin;
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getFechaDeInicio() {
        return fechaDeInicio;
    }

    public void setFechaDeInicio(String fechaDeInicio) {
        this.fechaDeInicio = fechaDeInicio;
    }

    public String getFechaDeFin() {
        return fechaDeFin;
    }

    public void setFechaDeFin(String fechaDeFin) {
        this.fechaDeFin = fechaDeFin;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Temporada{" + "codigo=" + codigo + ", fechaDeInicio=" + fechaDeInicio + ", fechaDeFin=" + fechaDeFin + ", nombre=" + nombre + '}';
    }
    
}
