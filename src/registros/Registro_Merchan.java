/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registros;

import java.util.Date;

/**
 *
 * @author daniu
 */
public class Registro_Merchan {
    int num_ref;
    int ref_pedido;
    String fecha;
    Date fechaReal;
    String concepto;
    int cantidad;
    float preciTotal;

    public Registro_Merchan(int num_ref, int ref_pedido, String fecha, String concepto, int cantidad, float preciTotal) {
        this.num_ref = num_ref;
        this.ref_pedido = ref_pedido;
        this.fecha = fecha;
        this.concepto = concepto;
        this.cantidad = cantidad;
        this.preciTotal = preciTotal;
    }
    
        public Registro_Merchan(int num_ref, int ref_pedido, Date fechaReal, String concepto, int cantidad, float preciTotal) {
        this.num_ref = num_ref;
        this.ref_pedido = ref_pedido;
        this.fechaReal = fechaReal;
        this.concepto = concepto;
        this.cantidad = cantidad;
        this.preciTotal = preciTotal;
    }

    public void setNum_ref(int num_ref) {
        this.num_ref = num_ref;
    }

    public void setRef_pedido(int ref_pedido) {
        this.ref_pedido = ref_pedido;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setPreciTotal(float preciTotal) {
        this.preciTotal = preciTotal;
    }

    public void setFechaReal(Date fechaReal) {
        this.fechaReal = fechaReal;
    }
   
    public int getNum_ref() {
        return num_ref;
    }

    public int getRef_pedido() {
        return ref_pedido;
    }

    public String getFecha() {
        return fecha;
    }

    public String getConcepto() {
        return concepto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public float getPreciTotal() {
        return preciTotal;
    }

    public Date getFechaReal() {
        return fechaReal;
    }
        
    
}
