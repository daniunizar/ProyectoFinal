/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formularios;

import Programa.F_Base;
import auxiliares.ConexionBaseDatos;
import auxiliares.Fecha;
import configuracion.ColorInterfaz;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 * Esta clase gestiona el ingreso de nuevas solicitudes de información en la base de datos.
 * @author Daniel Marcos Muñoz
 */
public class F_Informacion extends javax.swing.JFrame {

    /**
     * Creates new form F_Informacion
     */
    public F_Informacion() {
        initComponents();
        establecerColor();
        setTitle("Centro de Investigación El Fuerte");
        setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnG_MedioSolicitud = new javax.swing.ButtonGroup();
        panelFondo = new javax.swing.JPanel();
        labelTitulo = new javax.swing.JLabel();
        P_MedioSolicitud = new javax.swing.JPanel();
        radio_Presencial = new javax.swing.JRadioButton();
        radio_Telefonica = new javax.swing.JRadioButton();
        radio_OnLine = new javax.swing.JRadioButton();
        P_Tematica = new javax.swing.JPanel();
        cb_Edificio = new javax.swing.JCheckBox();
        cb_Actividades = new javax.swing.JCheckBox();
        cb_Otros = new javax.swing.JCheckBox();
        btn_SI_Registrar = new javax.swing.JButton();
        btn_SI_Limpiar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        labelTitulo.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        labelTitulo.setText("Solicitudes de Información");

        P_MedioSolicitud.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Medio de solicitud", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 24), new java.awt.Color(0, 0, 0))); // NOI18N

        btnG_MedioSolicitud.add(radio_Presencial);
        radio_Presencial.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        radio_Presencial.setText("Presencial");

        btnG_MedioSolicitud.add(radio_Telefonica);
        radio_Telefonica.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        radio_Telefonica.setText("Telefónica");

        btnG_MedioSolicitud.add(radio_OnLine);
        radio_OnLine.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        radio_OnLine.setText("Online");

        javax.swing.GroupLayout P_MedioSolicitudLayout = new javax.swing.GroupLayout(P_MedioSolicitud);
        P_MedioSolicitud.setLayout(P_MedioSolicitudLayout);
        P_MedioSolicitudLayout.setHorizontalGroup(
            P_MedioSolicitudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_MedioSolicitudLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(P_MedioSolicitudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(radio_Presencial)
                    .addComponent(radio_Telefonica)
                    .addComponent(radio_OnLine))
                .addContainerGap(102, Short.MAX_VALUE))
        );
        P_MedioSolicitudLayout.setVerticalGroup(
            P_MedioSolicitudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_MedioSolicitudLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(radio_Presencial)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(radio_Telefonica)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(radio_OnLine)
                .addContainerGap(165, Short.MAX_VALUE))
        );

        P_Tematica.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Temática", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 24), new java.awt.Color(0, 0, 0))); // NOI18N

        cb_Edificio.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        cb_Edificio.setText("Edificio");

        cb_Actividades.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        cb_Actividades.setText("Actividades");

        cb_Otros.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        cb_Otros.setText("Otros");

        javax.swing.GroupLayout P_TematicaLayout = new javax.swing.GroupLayout(P_Tematica);
        P_Tematica.setLayout(P_TematicaLayout);
        P_TematicaLayout.setHorizontalGroup(
            P_TematicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_TematicaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(P_TematicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cb_Edificio)
                    .addComponent(cb_Actividades)
                    .addComponent(cb_Otros))
                .addContainerGap(96, Short.MAX_VALUE))
        );
        P_TematicaLayout.setVerticalGroup(
            P_TematicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_TematicaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cb_Edificio)
                .addGap(12, 12, 12)
                .addComponent(cb_Actividades)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cb_Otros)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btn_SI_Registrar.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btn_SI_Registrar.setText("Registrar");
        btn_SI_Registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SI_RegistrarActionPerformed(evt);
            }
        });

        btn_SI_Limpiar.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btn_SI_Limpiar.setText("Limpiar");
        btn_SI_Limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SI_LimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelFondoLayout = new javax.swing.GroupLayout(panelFondo);
        panelFondo.setLayout(panelFondoLayout);
        panelFondoLayout.setHorizontalGroup(
            panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFondoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelFondoLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelFondoLayout.createSequentialGroup()
                                .addComponent(P_MedioSolicitud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(P_Tematica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(labelTitulo)))
                    .addGroup(panelFondoLayout.createSequentialGroup()
                        .addComponent(btn_SI_Registrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_SI_Limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        panelFondoLayout.setVerticalGroup(
            panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFondoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelTitulo)
                .addGap(26, 26, 26)
                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(P_MedioSolicitud, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(P_Tematica, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_SI_Registrar)
                    .addComponent(btn_SI_Limpiar))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_SI_LimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SI_LimpiarActionPerformed
        limpiarFormularioInformacion();
    }//GEN-LAST:event_btn_SI_LimpiarActionPerformed

    private void btn_SI_RegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SI_RegistrarActionPerformed
        // TODO add your handling code here:
        if (!radio_Presencial.isSelected() && !radio_Telefonica.isSelected() && !radio_OnLine.isSelected()) {
            JOptionPane.showMessageDialog(rootPane, "Debe seleccionar al menos un medio de solicitud de información", "Error", 2);
        } else if (!cb_Edificio.isSelected() && !cb_Actividades.isSelected() && !cb_Otros.isSelected()) {
            JOptionPane.showMessageDialog(rootPane, "Debe seleccionar al menos un tema de información", "Error", 2);
        } else {
            String fecha = Fecha.dimeFecha();
            String medio;
            if (radio_Presencial.isSelected()) {
                //medio = radio_Presencial.getText().toUpperCase();
                medio = "PRESENCIAL";
            } else if (radio_Telefonica.isSelected()) {
                //medio = radio_Telefonica.getText().toUpperCase();
                medio = "TELEFONICA";
            } else {
                //medio = radio_OnLine.getText().toUpperCase();
                medio = "ONLINE";
            }
            String tematica;
            tematica = "EDIFICIO";

            if (cb_Edificio.isSelected()) {
                tematica = cb_Edificio.getText().toUpperCase();
                int NUM_REF = asignarNumRegistro_RegistroInformacion();

                try {
                    registrarSolicitudInformacion(NUM_REF, fecha, medio, tematica);
                } catch (SQLException ex) {
                    Logger.getLogger(F_Informacion.class.getName()).log(Level.SEVERE, null, ex);
                    System.out.println("Error al tratar de registrar una solicitud de información");
                }
            }
            if (cb_Actividades.isSelected()) {
                tematica = cb_Actividades.getText().toUpperCase();
                int NUM_REF = asignarNumRegistro_RegistroInformacion();

                try {
                    registrarSolicitudInformacion(NUM_REF, fecha, medio, tematica);
                } catch (SQLException ex) {
                    Logger.getLogger(F_Informacion.class.getName()).log(Level.SEVERE, null, ex);
                    System.out.println("Error al tratar de registrar una solicitud de información");
                }
            }
            if (cb_Otros.isSelected()) {
                tematica = cb_Otros.getText().toUpperCase();
                int NUM_REF = asignarNumRegistro_RegistroInformacion();

                try {
                    registrarSolicitudInformacion(NUM_REF, fecha, medio, tematica);
                } catch (SQLException ex) {
                    Logger.getLogger(F_Informacion.class.getName()).log(Level.SEVERE, null, ex);
                    System.out.println("Error al tratar de registrar una solicitud de información");
                }
            }
            limpiarFormularioInformacion(); //reseteamos los campos del formulario
            JOptionPane.showMessageDialog(rootPane, "Registro realizado con éxito", "Información", 1);

        }
    }//GEN-LAST:event_btn_SI_RegistrarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(F_Informacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(F_Informacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(F_Informacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(F_Informacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new F_Informacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JPanel P_MedioSolicitud;
    private static javax.swing.JPanel P_Tematica;
    private javax.swing.ButtonGroup btnG_MedioSolicitud;
    private static javax.swing.JButton btn_SI_Limpiar;
    private static javax.swing.JButton btn_SI_Registrar;
    private static javax.swing.JCheckBox cb_Actividades;
    private static javax.swing.JCheckBox cb_Edificio;
    private static javax.swing.JCheckBox cb_Otros;
    private static javax.swing.JLabel labelTitulo;
    private static javax.swing.JPanel panelFondo;
    private static javax.swing.JRadioButton radio_OnLine;
    private static javax.swing.JRadioButton radio_Presencial;
    private static javax.swing.JRadioButton radio_Telefonica;
    // End of variables declaration//GEN-END:variables

    /**
     * Este método limpia el formulario de registro de nuevas solicitudes de información reseteando sus componentes.
     */
    public void limpiarFormularioInformacion() {
        radio_Presencial.setSelected(true);
        cb_Edificio.setSelected(false);
        cb_Actividades.setSelected(false);
        cb_Otros.setSelected(false);
    }

    /**
     * Este método asigna un Num_Ref (PrimaryKey) al nuevo registro que se va a realizar previa consulta a la Base de Datos.
     * @return Devuelve un valor entero correspondiente al Num_Ref del nuevo registro.
     */
    public int asignarNumRegistro_RegistroInformacion() {
        Connection conexion;
        int NUM_REF = 0;
        try {
            //conexion = DriverManager.getConnection(urlV, usuario, clave);
            ConexionBaseDatos.ConexionBaseDatos();
            conexion = ConexionBaseDatos.getConnection();
            Statement sentencia = conexion.createStatement();
            String sql;
            sql = "SELECT MAX (NUM_REF) FROM REGISTRO_INFORMACION";

            ResultSet resul = sentencia.executeQuery(sql);
            if (resul.next()) { //Sólo tiene que devolver un único resultado
                System.out.println("En el registro de información hay al menos algún registro para calcular el NUM_REF");
                System.out.println(NUM_REF);
                NUM_REF = resul.getInt(1);
            } else {
                System.out.println("En el registro de información NO hay ningún registro para calcular el NUM_REF");
                System.out.println(NUM_REF);

                NUM_REF = 0;
            }

            resul.close();
            sentencia.close();
            //conexion.close();
            ConexionBaseDatos.desconexionBaseDatos();
        } catch (SQLException ex) {
            Logger.getLogger(F_Base.class.getName()).log(Level.SEVERE, null, ex);
        }
        return NUM_REF + 1;//al máximo número encontrado en la tabla le sumamos 1. Creamos así un campo autoincremental
    }

    /**
     * Este método realiza la inserción en la base de datos de la nueva solicitud de informaición realizada.
     * @param NUM_REF El valor de este campo es la clave primaria del registro en la Base de Datos y se autocompleta previa llamada al método asignarNumRegistro_RegistroInformacion().
     * @param FECHA Es la fecha del ingreso del registro (es deseable que coincida con el de la realización de la consulta) y se autogenera a partir de la fecha del sistema.
     * @param MEDIO Es el tipo de medio empleado para la realización de la consulta: presencial, telefónica o mediante internet. El valor se extrae de un radiogroup.
     * @param TEMATICA Es el tema del que versa la consulta, los contemplados por el pliego de condiciones son: Actividades, Edificio y Otros. Se extrae el valor de un grupo de CheckBox.
     * @throws SQLException Puede lanzar excepciones de conectividad con la Base de Datos.
     */
    public void registrarSolicitudInformacion(int NUM_REF, String FECHA, String MEDIO, String TEMATICA) throws SQLException {

//Conexión a la base de datos
        //Connection conexion = DriverManager.getConnection(urlV, usuario, clave);
        ConexionBaseDatos.ConexionBaseDatos();
        Connection conexion = ConexionBaseDatos.getConnection();
        //Insertar los datos
        String datosInsercion = "INSERT INTO REGISTRO_INFORMACION VALUES (?, ?, ?, ?)";
        PreparedStatement sentencia = conexion.prepareStatement(datosInsercion);
        System.out.println("Vamos a introducir: " + NUM_REF + " " + FECHA + " " + MEDIO + " " + TEMATICA);
        sentencia.setInt(1, NUM_REF);
        sentencia.setString(2, FECHA);
        sentencia.setString(3, MEDIO);
        sentencia.setString(4, TEMATICA);
        System.out.println("ANTES");
        sentencia.executeUpdate();
        System.out.println("DESPUES");
        //Cerrar la conexión
        sentencia.close();
        ConexionBaseDatos.desconexionBaseDatos();
        System.out.println("Inserción en base de datos realizada");
    }

    /**
     * Este método gestiona el color de los componentes del formulario de registro de nuevas solicitudes de información en función de las preferencias del usuario.
     */
    public static void establecerColor() {
        ColorInterfaz.dimeColores();
        Color colorFondo = ColorInterfaz.dimeColores()[0];
        Color colorBotones = ColorInterfaz.dimeColores()[1];
        Color colorTexto = ColorInterfaz.dimeColores()[2];
        
        //Paneles de fondo
        panelFondo.setBackground(colorFondo);
        P_MedioSolicitud.setBackground(colorFondo);
        P_Tematica.setBackground(colorFondo);
        
        //Botones
        btn_SI_Registrar.setBackground(colorBotones);
        btn_SI_Limpiar.setBackground(colorBotones);
        
        //Textos
        labelTitulo.setForeground(colorTexto);
        P_MedioSolicitud.setForeground(colorTexto);
        P_Tematica.setForeground(colorTexto);
        
        radio_Presencial.setForeground(colorTexto);
        radio_Telefonica.setForeground(colorTexto);
        radio_OnLine.setForeground(colorTexto);
        
        cb_Edificio.setForeground(colorTexto);
        cb_Actividades.setForeground(colorTexto);
        cb_Otros.setForeground(colorTexto);

    }
}
