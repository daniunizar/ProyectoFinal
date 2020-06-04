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
public class Registro_Visitante {
    private int num_ref;
    int ref_visita;
    String fecha;
    Date fechaReal;
    int cantidad;
    String ref_sexo;
    String ref_rangoEdad;
    String procedencia_Internacional;
    String procedencia;

    public Registro_Visitante(int num_ref, int ref_visita, String fecha, int cantidad, String ref_sexo, String ref_rangoEdad, String procedencia_Internacional, String procedencia) {
        this.num_ref = num_ref;
        this.ref_visita = ref_visita;
        this.fecha = fecha;
        this.cantidad = cantidad;
        this.ref_sexo = ref_sexo;
        this.ref_rangoEdad = ref_rangoEdad;
        this.procedencia_Internacional = procedencia_Internacional;
        this.procedencia = procedencia;
    }
        public Registro_Visitante(int num_ref, int ref_visita, Date fechaReal, int cantidad, String ref_sexo, String ref_rangoEdad, String procedencia_Internacional, String procedencia) {
        this.num_ref = num_ref;
        this.ref_visita = ref_visita;
        this.fechaReal = fechaReal;
        this.cantidad = cantidad;
        this.ref_sexo = ref_sexo;
        this.ref_rangoEdad = ref_rangoEdad;
        this.procedencia_Internacional = procedencia_Internacional;
        this.procedencia = procedencia;
    }

    public int getNum_ref() {
        return num_ref;
    }

    public int getRef_visita() {
        return ref_visita;
    }

    public String getFecha() {
        return fecha;
    }

    public int getCantidad() {
        return cantidad;
    }

    public String getRef_sexo() {
        return ref_sexo;
    }

    public String getRef_rangoEdad() {
        return ref_rangoEdad;
    }

    public String getProcedencia_Internacional() {
        return procedencia_Internacional;
    }

    public String getProcedencia() {
        return procedencia;
    }

    public Date getFechaReal() {
        return fechaReal;
    }

    public void setNum_ref(int num_ref) {
        this.num_ref = num_ref;
    }

    public void setRef_visita(int ref_visita) {
        this.ref_visita = ref_visita;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setFechaReal(Date fechaReal) {
        this.fechaReal = fechaReal;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setRef_sexo(String ref_sexo) {
        this.ref_sexo = ref_sexo;
    }

    public void setRef_rangoEdad(String ref_rangoEdad) {
        this.ref_rangoEdad = ref_rangoEdad;
    }

    public void setProcedencia_Internacional(String procedencia_Internacional) {
        this.procedencia_Internacional = procedencia_Internacional;
    }

    public void setProcedencia(String procedencia) {
        this.procedencia = procedencia;
    }
    
    
    
    
}
