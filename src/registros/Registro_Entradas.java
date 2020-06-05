/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registros;

import java.util.Date;

/**
 * Esta clase permite la generación de un registro de venta de entradas para rellenar un jTable de histórico o para su modificación.
 * @author Daniel Marcos Muñoz
 */
public class Registro_Entradas {
    int num_ref;
    String fecha;
    String tipoEntrada;
    int cantidad;
    int excenciones;
    float precioTotal;
    Date fechaReal;

    /**
     * Método constructor con todos los atributos.
     * Posee las fechas en formato String, su uso es para rellenar jTables de históricos.
     * @param num_ref Recibe por parámetro la clave primaria del registro.
     * @param fecha Recibe por parámetro la fecha en formato String de la venta de entradas.
     * @param tipoEntrada Recibe por parámetro el tipo de entrada vendida.
     * @param cantidad Recibe por parámetro la cantidad de entradas vendidas.
     * @param excenciones Recibe por parámetro el número de excenciones de pago.
     * @param precioTotal Recibe por parámetro el precio total de la venta.
     */
    public Registro_Entradas(int num_ref, String fecha, String tipoEntrada, int cantidad, int excenciones, float precioTotal) {
        this.num_ref = num_ref;
        this.fecha = fecha;
        this.tipoEntrada = tipoEntrada;
        this.cantidad = cantidad;
        this.excenciones = excenciones;
        this.precioTotal = precioTotal;
    }
    
    /**
     * Método constrctor con todos los atributos.
     * Las fechas se dan en formtato Date, su uso es para modificar registros del histórico.
     * @param num_ref Recibe por parámetro la clave primaria del registro.
     * @param fechaReal Recibe por parámetro la fecha en formato Date de la venta.
     * @param tipoEntrada Recibe por parámetro el tipo de entradas vendidas.
     * @param cantidad Recibe por parámetro la cantidad de entradas vendidas.
     * @param excenciones Recibe por parámetro la cantidad de exenciones de pago existentes.
     * @param precioTotal Recibe por parámetro el precio total de la venta.
     */
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
