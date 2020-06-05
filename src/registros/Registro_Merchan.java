/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registros;

import java.util.Date;

/**
 * Esta clase permite generar un registro de venta de productos promocionales para su inserción en los jTable de los históricos.
 * @author Daniel Marcos Muñoz
 */
public class Registro_Merchan {
    int num_ref;
    int ref_pedido;
    String fecha;
    Date fechaReal;
    String concepto;
    int cantidad;
    float preciTotal;

    /**
     * Método constructor con todos los parámetros.
     * Posee las fechas en formato String, necesario para rellenar los jTable de los históricos.
     * @param num_ref Recibe por parámetro la clave primaria del registro.
     * @param ref_pedido Rebibe por parámetro la referencia del pedido, común a todos los registros que conforman un pedido.
     * @param fecha Recibe por parámetro la fecha de venta.
     * @param concepto Recibe por parámetro el tipo de producto vendido.
     * @param cantidad Recibe por parámetro la cantidad de productos vendidos.
     * @param preciTotal Recibe por parámetro el precio total del producto seleccionado.
     */
    public Registro_Merchan(int num_ref, int ref_pedido, String fecha, String concepto, int cantidad, float preciTotal) {
        this.num_ref = num_ref;
        this.ref_pedido = ref_pedido;
        this.fecha = fecha;
        this.concepto = concepto;
        this.cantidad = cantidad;
        this.preciTotal = preciTotal;
    }
    
    /**
     * Método constructor con todos los atributos.
     * Posee las fechas en formato Date, útil para modificar los registros.
     * @param num_ref Recibe por parámetro la clave primaria del registro.
     * @param ref_pedido Recibe por parámetro el número de referencia del pedido.
     * @param fechaReal Recibe por parámetro la fecha en formato Date de la venta.
     * @param concepto Recibe por parámetro el tipo de producto vendido.
     * @param cantidad Recibe por parámetro la cantidad de productos del tipo seleccionado vendidos.
     * @param preciTotal Recibe por parámetro el precio del total de productos del tipo seleccionado vedidos.
     */
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
