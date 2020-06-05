/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registros;

import java.util.Date;

/**
 * Esta claes permite la generación de un registro de visitante bien para rellenar un jTable o para modificar un registro existente.
 * @author Daniel Marcos Muñoz
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

    /**
     * Método constructo con todos los atributos.
     * Fechas en formato String, necesario para rellenar el jTable del histórico.
     * @param num_ref Recibe por parámetro la clave primaria del registro.
     * @param ref_visita Recibe por parámetro la referencia al grupo de visitantes.
     * @param fecha Recibe por parámetro la fecha de la visita en formato String.
     * @param cantidad Recibe por parámetro la cantidad de visitantes de un sexo y rango de edad concreto que componen el grupo.
     * @param ref_sexo Recibe por parámetro el sexo de los visitantes.
     * @param ref_rangoEdad Recibe por parámetro el rango de edad de los visitantes.
     * @param procedencia_Internacional Recibe por parámetro si el grupo de visitantes es de procedencia internacional o no.
     * @param procedencia Recibe por parámetro la procedencia del grupo de visitantes.
     */
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
    /**
     * Método constructor con todos los atributos.
     * Las fechas son en formato Date, necesario para la modificación de registros.
     * @param num_ref Recibe por parámetro la clave primaria del registro.
     * @param ref_visita Recibe por parámetro la referencia al grupo de visitantes.
     * @param fechaReal Recibe por parámetro la fecha de la visita en formato Date.
     * @param cantidad Recibe por parámetro la cantidad de visitantes de un sexo y rango de edad concreto que componen el grupo.
     * @param ref_sexo Recibe por parámetro el sexo de los visitantes.
     * @param ref_rangoEdad Recibe por parámetro el rango de edad de los visitantes.
     * @param procedencia_Internacional Recibe por parámetro si el grupo de visitantes es de procedencia internacional o no.
     * @param procedencia Recibe por parámetro la procedencia del grupo de visitantes.
     */
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
