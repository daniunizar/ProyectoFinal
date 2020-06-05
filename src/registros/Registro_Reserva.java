/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registros;

import java.util.Date;

/**
 * Esta clase permite la realización de un registro de reserva para su inserción en los jTable de los históricos.
 * @author Daniel Marcos Muñoz
 */
public class Registro_Reserva {

    int num_ref;
    String fecha_tramitacion;
    Date fechaReal_Tramitacion;
    Date fechaReal_Reserva;
    String fecha_reserva;
    String entidad;
    String actividad;
    int cantidad;
    String contacto;
    String cargo;
    String tlf;
    String email;
    String observaciones;

    /**
     * Método constructor con todos los atributos.
     * Las fechas se encuentran en formato String, necesario para rellenar los jTables del histórico.
     * @param num_ref Recibe por parámetro la clave primaria del registro.
     * @param fecha_tramitacion Recibe por parámetro la fecha de tramitación de la reserva en formato String.
     * @param fecha_reserva Recibe por parámetro la fecha de la reserva en formato String.
     * @param entidad Recibe por parámetro el nombre de la entidad que reserva.
     * @param actividad Recibe por parámetro la actividad que contrató la entidad que reserva.
     * @param cantidad Recibe por parámetro la cantidad de visitantes que componen el grupo de la entidad que reserva.
     * @param contacto Recibe por parámetro el nombre del contacto con la entidad que reserva.
     * @param cargo Recibe por parámetro el cargo del contacto de la entidad que reserva.
     * @param tlf Recibe por parámetro el teléfono del contacto de la entidad que reserva.
     * @param email Recibe por parámetro el e-mail del contacto de la entidad que reserva.
     * @param observaciones Recibe por parámetro las posibles observaciones u aclarciones a la reserva.
     */
    public Registro_Reserva(int num_ref, String fecha_tramitacion, String fecha_reserva, String entidad, String actividad, int cantidad, String contacto, String cargo, String tlf, String email, String observaciones) {
        this.num_ref = num_ref;
        this.fecha_tramitacion = fecha_tramitacion;
        this.fecha_reserva = fecha_reserva;
        this.entidad = entidad;
        this.actividad = actividad;
        this.cantidad = cantidad;
        this.contacto = contacto;
        this.cargo = cargo;
        this.tlf = tlf;
        this.email = email;
        this.observaciones = observaciones;
    }
    
    /**
     * Método constructor con todos los atributos.
     * Las fechas se encuentran en formato Date, necesario para la modificación de registros.
     * @param num_ref Recibe por parámetro la clave primaria del registro.
     * @param fechaReal_Tramitacion Recibe por parámetro la fecha de tramitación en formado Date.
     * @param fechaReal_Reserva Recibe por parámetro la fecha de reserva en formato Date.
     * @param entidad Recibe por parámetro el nombre de la entidad que realiza la reserva.
     * @param actividad Recibe por parámetro la actividad contratada por la entidad que realiza la reserva.
     * @param cantidad Recibe por parámetro la cantidad de visitantes que componen el grupo de la empresa que ha realizado la reserva.
     * @param contacto Recibe por parámetro el nombre del contacto con la empresa que ha realizado la reserva.
     * @param cargo Recibe por parámetro el cargo del contacto con la empresa que ha realizado la reserva.
     * @param tlf Recibe por parámetro el teléfono del contacto de la empresa que ha realizado la reserva.
     * @param email Recibe por parámetro el e-mail del contacto de la empresa que ha realizado la reserva.
     * @param observaciones  Recibe por parámetro posibles observaciones u aclaraciones de la reserva.
     */
    public Registro_Reserva(int num_ref, Date fechaReal_Tramitacion, Date fechaReal_Reserva, String entidad, String actividad, int cantidad, String contacto, String cargo, String tlf, String email, String observaciones) {
        this.num_ref = num_ref;
        this.fechaReal_Tramitacion = fechaReal_Tramitacion;
        this.fechaReal_Reserva = fechaReal_Reserva;
        this.entidad = entidad;
        this.actividad = actividad;
        this.cantidad = cantidad;
        this.contacto = contacto;
        this.cargo = cargo;
        this.tlf = tlf;
        this.email = email;
        this.observaciones = observaciones;
    }

    public void setNum_ref(int num_ref) {
        this.num_ref = num_ref;
    }

    public void setFecha_tramitacion(String fecha_tramitacion) {
        this.fecha_tramitacion = fecha_tramitacion;
    }

    public void setFecha_reserva(String fecha_reserva) {
        this.fecha_reserva = fecha_reserva;
    }

    public void setEntidad(String entidad) {
        this.entidad = entidad;
    }

    public void setActividad(String actividad) {
        this.actividad = actividad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setTlf(String tlf) {
        this.tlf = tlf;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public void setFechaReal_Tramitacion(Date fechaReal_Tramitacion) {
        this.fechaReal_Tramitacion = fechaReal_Tramitacion;
    }

    public void setFechaReal_Reserva(Date fechaReal_Reserva) {
        this.fechaReal_Reserva = fechaReal_Reserva;
    }

    public int getNum_ref() {
        return num_ref;
    }

    public String getFecha_tramitacion() {
        return fecha_tramitacion;
    }

    public String getFecha_reserva() {
        return fecha_reserva;
    }

    public String getEntidad() {
        return entidad;
    }

    public String getActividad() {
        return actividad;
    }

    public int getCantidad() {
        return cantidad;
    }

    public String getContacto() {
        return contacto;
    }

    public String getCargo() {
        return cargo;
    }

    public String getTlf() {
        return tlf;
    }

    public String getEmail() {
        return email;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public Date getFechaReal_Tramitacion() {
        return fechaReal_Tramitacion;
    }

    public Date getFechaReal_Reserva() {
        return fechaReal_Reserva;
    }
    
    
    
    
}
