/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package auxiliares;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Esta clase gestiona las fechas de la aplicación y sus formatos
 * @author Daniel Marcos Muñoz
 */
public class Fecha {

    /**
     * Método que obtiene la fecha actual del sistema y le aplica un formato de tipo dd/MM/yyyy
     * @return devuelve la fecha actual como una String en formato dd/MM/yyyy
     */
    public static String dimeFecha() {
        Date fechaActual = new java.util.Date();
        SimpleDateFormat mask = new SimpleDateFormat("dd/MM/yyyy");
        String cadenaFecha = mask.format(fechaActual);
        //System.out.println("La fecha actual es " + cadenaFecha);
        return cadenaFecha;
    }

    /**
     * Método que convierte una fecha pasada por parámetro en String.Utilizada generalmente para rellenar los jTable con los historicos de los registros, dado que de la Base de Datos se obtiene un tipo Fecha pero el JTable sólo admite Strings.
     * @param fecha Fecha que se desea convertir a formato String dd/MM/yyyy.
     * @return Devuelve una cadena de texto con la fecha pasada por parámetro.
     */
    public static String formateaFecha(Date fecha) {
        Date fechaAFormatear = fecha;
        SimpleDateFormat mask = new SimpleDateFormat("dd/MM/yyyy");
        String cadenaFecha = mask.format(fechaAFormatear);
        //System.out.println(fecha);
        //System.out.println(cadenaFecha);
        return cadenaFecha;
    }
}
