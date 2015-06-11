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
public class Tarjeta {
    private String tipoDeTarjeta;
    private int numeroDeLaTarjeta;
    private String codigoDeSeguridad;
    private String fechaDeVencimiento;//mes y año

    public Tarjeta() {
    }

    public Tarjeta(String tipoDeTarjeta, int numeroDeLaTarjeta, String codigoDeSeguridad, String fechaDeVencimiento) {
        this.tipoDeTarjeta = tipoDeTarjeta;
        this.numeroDeLaTarjeta = numeroDeLaTarjeta;
        this.codigoDeSeguridad = codigoDeSeguridad;
        this.fechaDeVencimiento = fechaDeVencimiento;
    }

    public String getTipoDeTarjeta() {
        return tipoDeTarjeta;
    }

    public void setTipoDeTarjeta(String tipoDeTarjeta) {
        this.tipoDeTarjeta = tipoDeTarjeta;
    }

    public int getNumeroDeLaTarjeta() {
        return numeroDeLaTarjeta;
    }

    public void setNumeroDeLaTarjeta(int numeroDeLaTarjeta) {
        this.numeroDeLaTarjeta = numeroDeLaTarjeta;
    }

    public String getCodigoDeSeguridad() {
        return codigoDeSeguridad;
    }

    public void setCodigoDeSeguridad(String codigoDeSeguridad) {
        this.codigoDeSeguridad = codigoDeSeguridad;
    }

    public String getFechaDeVencimiento() {
        return fechaDeVencimiento;
    }

    public void setFechaDeVencimiento(String fechaDeVencimiento) {
        this.fechaDeVencimiento = fechaDeVencimiento;
    }

    @Override
    public String toString() {
        return "Tarjeta{" + "tipoDeTarjeta=" + tipoDeTarjeta + ", numeroDeLaTarjeta=" + numeroDeLaTarjeta + ", codigoDeSeguridad=" + codigoDeSeguridad + ", fechaDeVencimiento=" + fechaDeVencimiento + '}';
    }
    
    
}
