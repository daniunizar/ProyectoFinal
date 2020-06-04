/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modificacionHistoricos;

import Programa.F_Base;
import registros.Registro_Reserva;
import historicos.F_Historico_Visitantes;
import auxiliares.ConexionBaseDatos;
import auxiliares.Fecha;
import configuracion.ColorInterfaz;
import historicos.F_Historico_Reservas;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author daniu
 */
public class F_Modificar_Reservas extends javax.swing.JFrame {

    ArrayList<String> listaActividades;

    /**
     * Creates new form F_Modificar_Reservas
     */
    public F_Modificar_Reservas() {
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

        panelFondo = new javax.swing.JPanel();
        labelTitulo = new javax.swing.JLabel();
        panelContenedor = new javax.swing.JPanel();
        lblRef = new javax.swing.JLabel();
        label_numRef = new javax.swing.JLabel();
        lblFechaTra = new javax.swing.JLabel();
        calendar_FechaTra = new rojeru_san.componentes.RSDateChooser();
        lblFechaRes = new javax.swing.JLabel();
        calendar_FechaRes = new rojeru_san.componentes.RSDateChooser();
        lblEntidad = new javax.swing.JLabel();
        campo_Entidad = new javax.swing.JTextField();
        lblActividad = new javax.swing.JLabel();
        cmb_Actividad = new javax.swing.JComboBox<>();
        lblCantidad = new javax.swing.JLabel();
        spn_Cantidad = new javax.swing.JSpinner();
        lblContacto = new javax.swing.JLabel();
        campo_Contacto = new javax.swing.JTextField();
        lblCargo = new javax.swing.JLabel();
        campo_Cargo = new javax.swing.JTextField();
        lblTlf = new javax.swing.JLabel();
        campo_Tlf = new javax.swing.JTextField();
        lblMail = new javax.swing.JLabel();
        campo_Email = new javax.swing.JTextField();
        lblObservaciones = new javax.swing.JLabel();
        btnModificar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtArea_Observaciones = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        labelTitulo.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        labelTitulo.setText("Modificar Registro");

        panelContenedor.setLayout(new java.awt.GridLayout(11, 2));

        lblRef.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblRef.setText("Nº Ref:");
        panelContenedor.add(lblRef);

        label_numRef.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        label_numRef.setText("-");
        panelContenedor.add(label_numRef);

        lblFechaTra.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblFechaTra.setText("Fecha Tramitación:");
        panelContenedor.add(lblFechaTra);

        calendar_FechaTra.setFormatoFecha("dd/MM/yyyy");
        calendar_FechaTra.setFuente(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        panelContenedor.add(calendar_FechaTra);

        lblFechaRes.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblFechaRes.setText("Fecha Reservada:");
        panelContenedor.add(lblFechaRes);

        calendar_FechaRes.setFormatoFecha("dd/MM/yyyy");
        calendar_FechaRes.setFuente(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        panelContenedor.add(calendar_FechaRes);

        lblEntidad.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblEntidad.setText("Entidad:");
        panelContenedor.add(lblEntidad);

        campo_Entidad.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        panelContenedor.add(campo_Entidad);

        lblActividad.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblActividad.setText("Actividad:");
        panelContenedor.add(lblActividad);

        cmb_Actividad.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        cmb_Actividad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        panelContenedor.add(cmb_Actividad);

        lblCantidad.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblCantidad.setText("Cantidad:");
        panelContenedor.add(lblCantidad);

        spn_Cantidad.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        spn_Cantidad.setModel(new javax.swing.SpinnerNumberModel(0, 0, 999, 1));
        panelContenedor.add(spn_Cantidad);

        lblContacto.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblContacto.setText("Contacto:");
        panelContenedor.add(lblContacto);

        campo_Contacto.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        panelContenedor.add(campo_Contacto);

        lblCargo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblCargo.setText("Cargo:");
        panelContenedor.add(lblCargo);

        campo_Cargo.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        panelContenedor.add(campo_Cargo);

        lblTlf.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblTlf.setText("Tlf:");
        panelContenedor.add(lblTlf);

        campo_Tlf.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        panelContenedor.add(campo_Tlf);

        lblMail.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblMail.setText("E-mail:");
        panelContenedor.add(lblMail);

        campo_Email.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        panelContenedor.add(campo_Email);

        lblObservaciones.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblObservaciones.setText("Observaciones:");
        panelContenedor.add(lblObservaciones);

        btnModificar.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnCancelar.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        txtArea_Observaciones.setColumns(20);
        txtArea_Observaciones.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtArea_Observaciones.setRows(5);
        jScrollPane1.setViewportView(txtArea_Observaciones);

        javax.swing.GroupLayout panelFondoLayout = new javax.swing.GroupLayout(panelFondo);
        panelFondo.setLayout(panelFondoLayout);
        panelFondoLayout.setHorizontalGroup(
            panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFondoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelContenedor, javax.swing.GroupLayout.DEFAULT_SIZE, 683, Short.MAX_VALUE)
                    .addGroup(panelFondoLayout.createSequentialGroup()
                        .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelFondoLayout.createSequentialGroup()
                                .addComponent(btnModificar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        panelFondoLayout.setVerticalGroup(
            panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFondoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelContenedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnModificar)
                    .addComponent(btnCancelar))
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

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        int opcion = JOptionPane.showConfirmDialog(rootPane, "¿Está seguro de querer modificar el registro seleccionado?", "Aviso", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (opcion == JOptionPane.YES_OPTION) {
            ConexionBaseDatos.ConexionBaseDatos();
            Connection conexion = ConexionBaseDatos.getConnection();
            String datosActualizacion = "UPDATE REGISTRO_RESERVAS SET FECHA_TRAMITACION = '" + Fecha.formateaFecha(calendar_FechaTra.getDatoFecha()) + "'"
                    + ", FECHA_RESERVA = '" + Fecha.formateaFecha(calendar_FechaRes.getDatoFecha()) + "'"
                    + ", ENTIDAD = '" + campo_Entidad.getText() + "'"
                    + ", ACTIVIDAD = '" + cmb_Actividad.getSelectedItem() + "'"
                    + ", CANTIDAD = " + spn_Cantidad.getValue()
                    + ", CONTACTO = '" + campo_Contacto.getText() + "'"
                    + ", CARGO = '" + campo_Cargo.getText() + "'"
                    + ", TLF = '" + campo_Tlf.getText() + "'"
                    + ", EMAIL = '" + campo_Email.getText() + "'"
                    + ", OBSERVACIONES = '" + txtArea_Observaciones.getText() + "'"
                    + " WHERE NUM_REF = " + Integer.parseInt(label_numRef.getText());
            System.out.println(datosActualizacion);
            PreparedStatement sentencia;
            try {
                sentencia = conexion.prepareStatement(datosActualizacion);
                sentencia.executeUpdate();
                JOptionPane.showMessageDialog(rootPane, "Registro modificado con éxito", "Información", 3);
                F_Historico_Reservas.rellenarTabla();
            } catch (SQLException ex) {
                Logger.getLogger(F_Historico_Visitantes.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(rootPane, "Los datos introducidos no son válidos.\nEl registro NO ha sido modificado.", "Error", 2);
            }
            ConexionBaseDatos.desconexionBaseDatos();
            dispose();
        }
    }//GEN-LAST:event_btnModificarActionPerformed

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
            java.util.logging.Logger.getLogger(F_Modificar_Reservas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(F_Modificar_Reservas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(F_Modificar_Reservas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(F_Modificar_Reservas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new F_Modificar_Reservas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JButton btnCancelar;
    private static javax.swing.JButton btnModificar;
    private rojeru_san.componentes.RSDateChooser calendar_FechaRes;
    private rojeru_san.componentes.RSDateChooser calendar_FechaTra;
    private javax.swing.JTextField campo_Cargo;
    private javax.swing.JTextField campo_Contacto;
    private javax.swing.JTextField campo_Email;
    private javax.swing.JTextField campo_Entidad;
    private javax.swing.JTextField campo_Tlf;
    private javax.swing.JComboBox<String> cmb_Actividad;
    private javax.swing.JScrollPane jScrollPane1;
    private static javax.swing.JLabel labelTitulo;
    private static javax.swing.JLabel label_numRef;
    private static javax.swing.JLabel lblActividad;
    private static javax.swing.JLabel lblCantidad;
    private static javax.swing.JLabel lblCargo;
    private static javax.swing.JLabel lblContacto;
    private static javax.swing.JLabel lblEntidad;
    private static javax.swing.JLabel lblFechaRes;
    private static javax.swing.JLabel lblFechaTra;
    private static javax.swing.JLabel lblMail;
    private static javax.swing.JLabel lblObservaciones;
    private static javax.swing.JLabel lblRef;
    private static javax.swing.JLabel lblTlf;
    private static javax.swing.JPanel panelContenedor;
    private static javax.swing.JPanel panelFondo;
    private javax.swing.JSpinner spn_Cantidad;
    private static javax.swing.JTextArea txtArea_Observaciones;
    // End of variables declaration//GEN-END:variables

    public void cargarDatos(int numRef) { //consulta a la base de datos con el NUM_REF de la celda seleccionada en la tabla del registro
        cargarComboBoxActividades();
        ConexionBaseDatos.ConexionBaseDatos();
        Connection conexion = ConexionBaseDatos.getConnection();
        Statement sentencia;
        try {
            sentencia = conexion.createStatement();
            String sql;
            sql = "SELECT * FROM REGISTRO_RESERVAS WHERE NUM_REF = " + numRef;
            ResultSet resul = sentencia.executeQuery(sql);
            Registro_Reserva registro = null;
            while (resul.next()) {
                registro = new Registro_Reserva(resul.getInt(1), resul.getDate(2), resul.getDate(3), resul.getString(4), resul.getString(5), resul.getInt(6), resul.getString(7), resul.getString(8), resul.getString(9), resul.getString(10), resul.getString(11));
            }
            numRef = registro.getNum_ref();
            label_numRef.setText(Integer.toString(numRef));
            calendar_FechaTra.setDatoFecha(registro.getFechaReal_Tramitacion());
            calendar_FechaRes.setDatoFecha(registro.getFechaReal_Reserva());

            campo_Entidad.setText(registro.getEntidad());
            cmb_Actividad.setSelectedItem(registro.getActividad());
            spn_Cantidad.setValue(registro.getCantidad());
            campo_Contacto.setText(registro.getContacto());
            campo_Cargo.setText(registro.getCargo());
            campo_Tlf.setText(registro.getTlf());
            campo_Email.setText(registro.getEmail());
            txtArea_Observaciones.setText(registro.getObservaciones());

        } catch (SQLException ex) {
            Logger.getLogger(F_Historico_Visitantes.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error al tratar de conectar con la base de datos desde la modificación de reservas");
        }

        ConexionBaseDatos.desconexionBaseDatos();
    }

    public void cargarComboBoxActividades() {
        try {
            //reseteamos la lista de procedencias y los ítems del combo box
            listaActividades = new ArrayList<>();
            cmb_Actividad.removeAllItems();

            ConexionBaseDatos.ConexionBaseDatos();
            Connection conexion = ConexionBaseDatos.getConnection();
            Statement sentencia = conexion.createStatement();
            String sql;
            sql = "SELECT * FROM ACTIVIDADES";

            ResultSet resul = sentencia.executeQuery(sql);
            //Recorremos el resulSet introducinedo todo en nuestro Array del comboBox
            while (resul.next()) {
                listaActividades.add(resul.getString(1));
            }
            resul.close();
            sentencia.close();
            //conexion.close(); lo cerramos a continuación desde la clase
            ConexionBaseDatos.desconexionBaseDatos();

        } catch (SQLException ex) {
            System.out.println("Error al conectar a la base de datos desde el método cargarComboBoxActividades");
            Logger.getLogger(F_Base.class.getName()).log(Level.SEVERE, null, ex);
        }

        cmb_Actividad.removeAllItems();
        for (String element : listaActividades) {
            cmb_Actividad.addItem(element);
        }
    }

    public static void establecerColor() {
        ColorInterfaz.dimeColores();
        Color colorFondo = ColorInterfaz.dimeColores()[0];
        Color colorBotones = ColorInterfaz.dimeColores()[1];
        Color colorTexto = ColorInterfaz.dimeColores()[2];

        //Paneles de fondo
        panelFondo.setBackground(colorFondo);
        panelContenedor.setBackground(colorFondo);
        txtArea_Observaciones.setBackground(colorFondo);

        //Botones
        btnModificar.setBackground(colorBotones);
        btnCancelar.setBackground(colorBotones);

        //Textos
        labelTitulo.setForeground(colorTexto);
        label_numRef.setForeground(colorTexto);
        lblRef.setForeground(colorTexto);
        lblFechaTra.setForeground(colorTexto);
        lblFechaRes.setForeground(colorTexto);
        lblActividad.setForeground(colorTexto);
        lblCantidad.setForeground(colorTexto);
        lblCargo.setForeground(colorTexto);
        lblContacto.setForeground(colorTexto);
        lblTlf.setForeground(colorTexto);
        lblMail.setForeground(colorTexto);
        lblObservaciones.setForeground(colorTexto);
        txtArea_Observaciones.setForeground(colorTexto);
        btnModificar.setForeground(colorTexto);
        btnCancelar.setForeground(colorTexto);
    }
}
