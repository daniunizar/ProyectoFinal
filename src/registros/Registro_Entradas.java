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
public class Registro_Entradas {
    int num_ref;
    String fecha;
    String tipoEntrada;
    int cantidad;
    int excenciones;
    float precioTotal;
    Date fechaReal;

    public Registro_Entradas(int num_ref, String fecha, String tipoEntrada, int cantidad, int excenciones, float precioTotal) {
        this.num_ref = num_ref;
        this.fecha = fecha;
        this.tipoEntrada = tipoEntrada;
        this.cantidad = cantidad;
        this.excenciones = excenciones;
        this.precioTotal = precioTotal;
    }
    
        public Registro_Entradas(int num_ref, Date fechaReal, String tipoEntrada, int cantidad, int excenciones, float precioTotal) {
        this.num_ref = num_ref;
        this.fechaReal = fechaReal;
        this.tipoEntrada = tipoEntrada;
        this.cantidad = cantidad;
        this.excenciones = excenciones;
        this.precioTotal = precioTotal;
    }

    public void setNum_ref(int num_ref) {
        this.num_ref = num_ref;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setTipoEntrada(String tipoEntrada) {
        this.tipoEntrada = tipoEntrada;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setExcenciones(int excenciones) {
        this.excenciones = excenciones;
    }

    public void setPrecioTotal(float precioTotal) {
        this.precioTotal = precioTotal;
    }

    public void setFechaReal(Date fechaReal) {
        this.fechaReal = fechaReal;
    }
        
    public int getNum_ref() {
        return num_ref;
    }

    public String getFecha() {
        return fecha;
    }

    public String getTipoEntrada() {
        return tipoEntrada;
    }

    public int getCantidad() {
        return cantidad;
    }

    public int getExcenciones() {
        return excenciones;
    }

    public float getPrecioTotal() {
        return precioTotal;
    }

    public Date getFechaReal() {
        return fechaReal;
    }
    
    
}
