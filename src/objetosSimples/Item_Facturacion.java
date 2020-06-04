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
public class Item_Facturacion {
    String concepto;
    int cantidad;
    float ingresos;

    public Item_Facturacion(){
        
    }
    
    public Item_Facturacion(String concepto, int cantidad, float ingresos) {
        this.concepto = concepto;
        this.cantidad = cantidad;
        this.ingresos = ingresos;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setIngresos(float ingresos) {
        this.ingresos = ingresos;
    }

    public String getConcepto() {
        return concepto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public float getIngresos() {
        return ingresos;
    }
}
