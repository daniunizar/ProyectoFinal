/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package configuracion;

import auxiliares.ConexionBaseDatos;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 * Esta clase permite la inserción en la Base de Datos de nuevos tipos de
 * productos promocionales.
 *
 * @author Daniel Marcos Muñoz
 */
public class F_Config_NuevoMerchandising extends javax.swing.JFrame {

    public F_Config_NuevoMerchandising() {
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
        lblConcepto = new javax.swing.JLabel();
        campoConcepto = new javax.swing.JTextField();
        lblPrecio = new javax.swing.JLabel();
        campoPrecio = new javax.swing.JSpinner();
        btnRegistrar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        labelTitulo.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        labelTitulo.setText("Nueva Entrada");

        lblConcepto.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblConcepto.setText("Concepto:");

        campoConcepto.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        campoConcepto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                campoConceptoKeyTyped(evt);
            }
        });

        lblPrecio.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblPrecio.setText("Precio:");

        campoPrecio.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        campoPrecio.setModel(new javax.swing.SpinnerNumberModel(Float.valueOf(0.0f), Float.valueOf(0.0f), Float.valueOf(99.99f), Float.valueOf(1.0f)));

        btnRegistrar.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        btnLimpiar.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
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
                        .addComponent(lblConcepto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(campoConcepto))
                    .addGroup(panelFondoLayout.createSequentialGroup()
                        .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelTitulo)
                            .addGroup(panelFondoLayout.createSequentialGroup()
                                .addComponent(lblPrecio)
                                .addGap(40, 40, 40)
                                .addComponent(campoPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelFondoLayout.createSequentialGroup()
                                .addComponent(btnRegistrar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 144, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelFondoLayout.setVerticalGroup(
            panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFondoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblConcepto)
                    .addComponent(campoConcepto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPrecio)
                    .addComponent(campoPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistrar)
                    .addComponent(btnLimpiar))
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

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // TODO add your handling code here:
        limpiarFormulario();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        // TODO add your handling code here:
        if (campoConcepto.getText() == "") {
            JOptionPane.showMessageDialog(rootPane, "El campo concepto debe tener algún valor.", "Información", 1);
        } else {
            try {
                registrarDatos();
            } catch (SQLException ex) {
                Logger.getLogger(F_Config_NuevoMerchandising.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(rootPane, "No se ha pidodo registrar", "Error", 2);
            }
        }
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void campoConceptoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoConceptoKeyTyped
        // TODO add your handling code here:
        comprobarDimensionTexto(campoConcepto.getText(), 25, evt);
    }//GEN-LAST:event_campoConceptoKeyTyped

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
            java.util.logging.Logger.getLogger(F_Config_NuevoMerchandising.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(F_Config_NuevoMerchandising.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(F_Config_NuevoMerchandising.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(F_Config_NuevoMerchandising.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new F_Config_NuevoMerchandising().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JButton btnLimpiar;
    private static javax.swing.JButton btnRegistrar;
    private javax.swing.JTextField campoConcepto;
    private static javax.swing.JSpinner campoPrecio;
    private static javax.swing.JLabel labelTitulo;
    private static javax.swing.JLabel lblConcepto;
    private static javax.swing.JLabel lblPrecio;
    private static javax.swing.JPanel panelFondo;
    // End of variables declaration//GEN-END:variables

    /**
     * Este método realiza la inserción en la Base de Datos de un nuevo producto
     * promocional generado en el formulario.
     *
     * @throws SQLException Puede lanzar excepciones de conectividad con la Base
     * de Datos.
     */
    public void registrarDatos() throws SQLException {
        String concepto = campoConcepto.getText();
        float precio = (float) campoPrecio.getValue();
        ConexionBaseDatos.ConexionBaseDatos();
        Connection conexion = ConexionBaseDatos.getConnection();
        //Insertar los datos
        String datosInsercion = "INSERT INTO MERCHANDISING VALUES (?, ?)";
        PreparedStatement sentencia;
        sentencia = conexion.prepareStatement(datosInsercion);

        sentencia.setString(1, concepto);
        sentencia.setFloat(2, precio);
        sentencia.executeUpdate();
        //Cerrar la conexión
        sentencia.close();
        ConexionBaseDatos.desconexionBaseDatos();
        JOptionPane.showMessageDialog(rootPane, "Registro realizado con éxito", "Información", 1);
        limpiarFormulario();
        F_ConfiguracionMerchandising.rellenarTabla();
        System.out.println("Inserción en base de datos realizada");
    }

    /**
     * Este método limpia el formulario de generación de nuevos productos
     * promocionales reseteando sus campos.
     */
    public void limpiarFormulario() {
        campoConcepto.setText("");
        campoPrecio.setValue(0);
    }

    /**
     * Métdo que controla la cantidad máxima de caracteres para cada campo en
     * que el usuario puede introducir texto.
     *
     * @param textoAComprobar Recibe por parámetro el texto a comprobar, se debe
     * extraer de cada campo con un método getText().
     * @param cantidadCaracteresMaxima Recibe por parámetro la cantidad máxima
     * de caracteres permitidos.
     * @param evt Recibe por parámetro el evento que activa este control.
     * Generalmente un evento de tipo key typed en el textField o textArea.
     */
    public void comprobarDimensionTexto(String textoAComprobar, int cantidadCaracteresMaxima, java.awt.event.KeyEvent evt) {
        if (textoAComprobar.length() == cantidadCaracteresMaxima) {
            evt.consume();
        }
    }

    /**
     * Este método gestiona el color de los componentes del formulario de
     * generación de nuevos productos promocionales en función de las
     * preferencias del usuario.
     */
    public static void establecerColor() {
        ColorInterfaz.dimeColores();
        Color colorFondo = ColorInterfaz.dimeColores()[0];
        Color colorBotones = ColorInterfaz.dimeColores()[1];
        Color colorTexto = ColorInterfaz.dimeColores()[2];

        //Paneles de fondo
        panelFondo.setBackground(colorFondo);

        //Botones
        btnRegistrar.setBackground(colorBotones);
        btnLimpiar.setBackground(colorBotones);

        //Textos
        labelTitulo.setForeground(colorTexto);
        lblConcepto.setForeground(colorTexto);
        lblPrecio.setForeground(colorTexto);
        btnRegistrar.setForeground(colorTexto);
        btnLimpiar.setForeground(colorTexto);
    }
}
