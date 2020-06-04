/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package configuracion;

import Programa.F_Base;
import auxiliares.ConexionBaseDatos;
import auxiliares.Fecha;
import formularios.F_Informacion;
import historicos.F_Historico_Visitantes;
import java.awt.Color;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import registros.Registro_Entradas;

/**
 * Esta clase Contiene los valores de los colores que se aplicarán a la interfaz
 * gráfica de la aplicación.
 *
 * @author Daniel Marcos Muñoz
 */
public class ColorInterfaz {

    private static Color arrayColores[] = new Color[3];
    private static Color colorFondo = new Color(142, 240, 157); //verde
    private static Color colorBotones = new Color(255, 239, 239); //magenta
    private static Color colorTexto = new Color(0, 0, 0); //negro

    /**
     * Método que establece los valores de los colores que por defecto posee la
     * aplicación
     */
    public static void porDefecto() {
        colorFondo = UIManager.getColor("Panel.background");
        colorBotones = UIManager.getColor("Button.background");
        colorTexto = UIManager.getColor("Label.foreground");
        arrayColores[0] = colorFondo;
        arrayColores[1] = colorBotones;
        arrayColores[2] = colorTexto;
    }

    /**
     * Método que establece los valores de los colores de la aplicación en el
     * estilo cálido (Rojizos y dorados)
     */
    public static void coloresCalidos() {
        colorFondo = new Color(255, 239, 239); //magenta
        colorBotones = new Color(153, 153, 0); //verde
        colorTexto = new Color(0, 0, 0); //negro
        arrayColores[0] = colorFondo;
        arrayColores[1] = colorBotones;
        arrayColores[2] = colorTexto;
    }

    /**
     * Método que establece los valores de los colores de la aplicación en el
     * estilo Neutro (Verdes)
     */
    public static void coloresNeutros() {
        colorFondo = new Color(176, 197, 115); //magenta
        colorBotones = new Color(142, 240, 157); //verde
        colorTexto = new Color(0, 0, 0); //negro
        arrayColores[0] = colorFondo;
        arrayColores[1] = colorBotones;
        arrayColores[2] = colorTexto;
    }

    /**
     * Método que establece los valores de los colores de la aplicación en el
     * estilo frío (Azules)
     */
    public static void coloresFrios() {
        colorFondo = new Color(240, 248, 157); //amarillo
        colorBotones = new Color(60, 219, 241); //azul
        colorTexto = new Color(0, 0, 0); //negro
        arrayColores[0] = colorFondo;
        arrayColores[1] = colorBotones;
        arrayColores[2] = colorTexto;
    }

    /**
     * Método que establece los valores de los colores de la aplicación en el
     * estilo personalizado por el usuario.
     */
    public static void coloresPersonalizados() {
        //hacemos una consulta a la base y deella extraemos los colores
        colorFondo = new Color(extraerDatosDeColorPersonalizado("FONDO", 0), extraerDatosDeColorPersonalizado("FONDO", 1), extraerDatosDeColorPersonalizado("FONDO", 2)); //amarillo
        colorBotones = new Color(extraerDatosDeColorPersonalizado("BOTONES", 0), extraerDatosDeColorPersonalizado("BOTONES", 1), extraerDatosDeColorPersonalizado("BOTONES", 2)); //azul
        colorTexto = new Color(extraerDatosDeColorPersonalizado("TEXTO", 0), extraerDatosDeColorPersonalizado("TEXTO", 1), extraerDatosDeColorPersonalizado("TEXTO", 2)); //negro
        arrayColores[0] = colorFondo;
        arrayColores[1] = colorBotones;
        arrayColores[2] = colorTexto;

        System.out.println(colorFondo);
        System.out.println(colorBotones);
        System.out.println(colorTexto);

    }

    /**
     * Método que devuelve los colores actuales de la aplicación. Lo emplea el
     * método que establece los colores para obtener qué colores debe aplicar.
     *
     * @return Devuelve una array de colores con 3 posiciones. En la 0 el color
     * del Fondo, en la 1 el color de los Botones y en la 2 el color del Texto.
     */
    public static Color[] dimeColores() {
        return arrayColores;
    }

    /**
     * Método que permite recuperar los colores guardados en la Base de Datos
     * correspondientes a los personalizados por el usuario. Se le suele llamar
     * hasta nueve veces, dado que el concepto tiene 3 variantes y se compone de
     * tres subcolores (RED, GREEN y BLUE). Para obtener un color de FONDO, por
     * ejemplo, habría que llamarlo tres veces. En concepto introduciríamos
     * FONDO, y en posición introduciríamos los valores 0 para obtener el RED, 1
     * para el GREEN y 2 para el BLUE Con los tres valores (RED, GREEN Y BLUE)
     * recuperados, tendríamos el color de FONDO.
     *
     * @param concepto Indica a la consulta en la Base de Datos el concepto
     * sobre el que debe buscar el color: FONDO, BOTONES o TEXTO.
     * @param posicion Indica a la consulta en la Base de Datos el código del
     * color sobre el que se consulta: 0 para RED, 1 para GREEN, 2 para BLUE.
     * @return Devuelve un entero con el codigo del color en función de su
     * concepto: FONDO, BOTONES o TEXO, y posición: RED, GREEN o BLUE
     */
    public static int extraerDatosDeColorPersonalizado(String concepto, int posicion) {
        ConexionBaseDatos.ConexionBaseDatos();
        Connection conexion = ConexionBaseDatos.getConnection();
        Statement sentencia;
        int grupoColores[] = new int[3];
        try {
            sentencia = conexion.createStatement();
            String sql;
            sql = "SELECT * FROM COLORES WHERE CONCEPTO = '" + concepto + "'";
            ResultSet resul = sentencia.executeQuery(sql);
            while (resul.next()) {
                Color miColor = new Color(resul.getInt(2), resul.getInt(3), resul.getInt(4));
                int red = resul.getInt(2);
                int green = resul.getInt(3);
                int blue = resul.getInt(4);
                grupoColores[0] = red;
                grupoColores[1] = green;
                grupoColores[2] = blue;
            }
        } catch (SQLException ex) {
            Logger.getLogger(F_Historico_Visitantes.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error al tratar de conectar con la base de datos desde la personalización de colores");
        }

        ConexionBaseDatos.desconexionBaseDatos();
        return grupoColores[posicion];
    }

}
