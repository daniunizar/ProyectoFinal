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
 *
 * @author daniu
 */
public class Registro_Informacion {

    int num_reg;
    String fecha;
    String medio;
    String tema;
    Date fechaReal;

    public Registro_Informacion(int num_reg, String fecha, String medio, String tema) {
        this.num_reg = num_reg;
        this.fecha = fecha;
        this.medio = medio;
        this.tema = tema;
    }
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
