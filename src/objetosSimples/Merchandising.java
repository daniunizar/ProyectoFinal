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
public class Merchandising {

    String concepto;
    int cantidad;
    float precio;

    public Merchandising(String concepto, int cantidad, float precio) {
        this.concepto = concepto;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public String getConcepto() {
        return concepto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public float getPrecio() {
        return precio;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
    
}
