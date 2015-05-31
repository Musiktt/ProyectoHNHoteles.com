/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package usuario;

import hotel.Reservacion;

/**
 *
 * @author Stward
 */
public class Cliente extends Usuario{
    private int numeroDeSocio;
    private String pais;
    private int telefono;
    private int tipoDeMoneda;//Moneda de predileccion
    
    private Reservacion reservacionesCanceladas;
    private Reservacion reservacionesPendientes;
    private Reservacion reservasCompletadas;
   
}
