/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registros;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Esta clase permite genera un registro de información para su inserción en los jTable de los históricos y para su modificación.
 * @author Daniel Marcos Muñoz
 */
public class Registro_Informacion {

    int num_reg;
    String fecha;
    String medio;
    String tema;
    Date fechaReal;

    /**
     * Método constructor con todos los atributos y fechas en formato String.
     * Se utiliza para rellenar jTables.
     * @param num_reg Recibe por parámetro la clave primaria del registro.
     * @param fecha Recibe por parámetro la fecha de la solicitud de información en formato String.
     * @param medio Recibe por parámetro el medio de solicitud empleado.
     * @param tema Recibe por parámetro el tema sobre la consulta realizada.
     */
    public Registro_Informacion(int num_reg, String fecha, String medio, String tema) {
        this.num_reg = num_reg;
        this.fecha = fecha;
        this.medio = medio;
        this.tema = tema;
    }
    
    /**
     * Método constructor con todos los atributos y fechas en formato Date.
     * Se utiliza para modificar registros.
     * @param num_reg Recibe por parámetro la clave primaria del registro.
     * @param fechaReal Recibe por parámetro la fecha de la solicitud de información en formate Date.
     * @param medio Recibe por parámetro el medio de slicitud empleado.
     * @param tema Recibe por parámetro el tema sobre la consulta realizada.
     */
    public Registro_Informacion(int num_reg, Date fechaReal, String medio, String tema) {
        this.num_reg = num_reg;
        this.fechaReal = fechaReal;
        this.medio = medio;
        this.tema = tema;
    }

    public void setNum_reg(int num_reg) {
        this.num_reg = num_reg;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setMedio(String medio) {
        this.medio = medio;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public int getNum_reg() {
        return num_reg;
    }

    public String getFecha() {
        return fecha;
    }

    public String getMedio() {
        return medio;
    }

    public String getTema() {
        return tema;
    }

    public Date getFechaReal() {
        return fechaReal;
    }

    public void setFechaReal(Date fechaReal) {
        this.fechaReal = fechaReal;
    }
    
}
