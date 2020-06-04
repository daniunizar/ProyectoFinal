/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package auxiliares;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 * Esta clase gestiona de forma centralizada las conexiones y desconexiones a la base de datos de todas las demás.
 * @author Daniel Marcos Muñoz
 */
public class ConexionBaseDatos {

    private static Connection conexion;
    private static final String usuario = "ELFUERTE";
    private static final String clave = "ELFUERTE";
    private static final String urlV = "jdbc:oracle:thin:@192.168.0.20:1521:XE"; //url que conecta a la base de datos de la máquina virtual
    private static final String url = "jdbc:oracle:thin:@localhost:1521:XE"; //url que conecta a la base de datos en localhost
//Al hacerlo desde una máquina virtual, la ip se hace estática desde Centro de redes y recursos compartidos: Camiar configuración del adaptador de red.    
//método de conexión

    /**
     * Método que establece conexión con la base de datos.
     */
    public static void ConexionBaseDatos() {
        conexion = null;
        try {
            //conexion = DriverManager.getConnection(url, usuario, clave);
            conexion = DriverManager.getConnection(urlV, usuario, clave);
            System.out.println("Conexión con la base de datos establecida DESDE SU PROPIA CLASE");
        } catch (SQLException ex) {
            Logger.getLogger(ConexionBaseDatos.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error al conectar con la base de datos.");
            JOptionPane.showMessageDialog(null, "Error en la conexión");
        }
    }

    /**
     * Método que recupera la información de la conexión para vincularla a un objeto Connect de la clase que la solicita.
     * @return Devuelve la conexión actual.
     */
    public static Connection getConnection() {
        return conexion;
    }

    /**
     * Método que pone fin a la conexión actual con la Base de Datos.
     */
    public static void desconexionBaseDatos() {
        try {
            conexion.close();
            System.out.println("Se ha cerrado la conexión con la base de datos DESDE SU PROPIA CLASE");

        } catch (SQLException ex) {
            Logger.getLogger(ConexionBaseDatos.class
                    .getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error al desconectar de la base de datos");
        }
    }

}
