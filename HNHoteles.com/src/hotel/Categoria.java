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
public class Categoria {
    private String tipoDeImpuesto;
    private String descripcion;

    public Categoria() {
    }

    public Categoria(String tipoDeImpuesto, String descripcion) {
        this.tipoDeImpuesto = tipoDeImpuesto;
        this.descripcion = descripcion;
    }

    public String getTipoDeImpuesto() {
        return tipoDeImpuesto;
    }

    public void setTipoDeImpuesto(String tipoDeImpuesto) {
        this.tipoDeImpuesto = tipoDeImpuesto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Categoria{" + "tipoDeImpuesto=" + tipoDeImpuesto + ", descripcion=" + descripcion + '}';
    }
    
    
}
