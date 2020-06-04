/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetosSimples;

/**
 *
 * @author daniu
 */
public class Reserva {
    int NUM_REF;
    String entidad;
    String actividad;
    
    public Reserva(int NUM_REF, String entidad, String actividad){
        this.NUM_REF = NUM_REF;
        this.entidad = entidad;
        this.actividad = actividad;
    }
    
    public String toString(){
        return entidad + " | " + actividad;
    }
}
