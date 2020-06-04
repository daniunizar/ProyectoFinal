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
