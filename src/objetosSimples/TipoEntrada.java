/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetosSimples;

/**
 *
 * @author daniu
 */
public class TipoEntrada {
    String concepto;
    Float precio;

    public TipoEntrada() {
    }

    public TipoEntrada(String concepto, Float precio) {
        this.concepto = concepto;
        this.precio = precio;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public void setPrecio(Float precio) {
        this.precio = precio;
    }

    public String getConcepto() {
        return concepto;
    }

    public Float getPrecio() {
        return precio;
    }
    
    
}
