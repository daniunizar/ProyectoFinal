/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package historicos;

import modificacionHistoricos.F_Modificar_Visitantes;
import registros.Registro_Visitante;
import auxiliares.ConexionBaseDatos;
import auxiliares.Fecha;
import configuracion.ColorInterfaz;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 * Esta clase muestra los registros de visitantes existentes en la Base de Datos.
 * Su utilidad es la de permitir modificar y eliminar registros de visitantes con datos erróneos.
 * @author Daniel Marcos Muñoz
 */
public class F_Historico_Visitantes extends javax.swing.JFrame {

    private static ArrayList<Registro_Visitante> miLista;
    private static F_Modificar_Visitantes modificarVisitantes;

    /**
     * Creates new form F_Historico_Visitantes
     */
    public F_Historico_Visitantes() {
        initComponents();
        establecerColor();
        setTitle("Centro de Investigación El Fuerte");
        setResizable(false);
        //rellenarTablaHistoricoVisitantes(); Lo llamamos mejor desde F_Base al pulsar en el menú, porque sino no actualiza hasta que no cerramos el programa completo
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
        btnEliminar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_Historico_Visitantes = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        labelTitulo.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        labelTitulo.setText("Histórico de Visitantes");

        btnEliminar.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnModificar.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        tabla_Historico_Visitantes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "NUM_REF", "REF_VISITA", "FECHA", "CANTIDAD", "REF_SEXO", "REF_RANGOEDAD", "PROCEDENCIA_INTERNACIONAL", "PROCEDENCIA"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla_Historico_Visitantes.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tabla_Historico_Visitantes);

        javax.swing.GroupLayout panelFondoLayout = new javax.swing.GroupLayout(panelFondo);
        panelFondo.setLayout(panelFondoLayout);
        panelFondoLayout.setHorizontalGroup(
            panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFondoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(panelFondoLayout.createSequentialGroup()
                        .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelTitulo)
                            .addGroup(panelFondoLayout.createSequentialGroup()
                                .addComponent(btnModificar)
                                .addGap(18, 18, 18)
                                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 359, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelFondoLayout.setVerticalGroup(
            panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFondoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnModificar)
                    .addComponent(btnEliminar))
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

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // NECESITO SACAR LOS NÚMEROS DE REGISTRO DE TODAS LAS FILAS SELECCIONADAS, PARA LUEGO HACER UN DELETE WHERE NUMERO DE REGISTRO COINCIDA CON ELLOS
        int cantidadFilasSeleccionadas = tabla_Historico_Visitantes.getSelectedRowCount();
        if (cantidadFilasSeleccionadas > 0) {
            ArrayList<String> listaEliminar = new ArrayList<>();
            System.out.println("Cantidad filas seleccionadas: " + cantidadFilasSeleccionadas);
            String indice = "0";
            int opcion = JOptionPane.showConfirmDialog(rootPane, "Se van a eliminar " + cantidadFilasSeleccionadas + " registros.\n¿Desea continuar?", "Aviso", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (opcion == JOptionPane.YES_OPTION) {
                for (int i = 0; i < cantidadFilasSeleccionadas; i++) {
                    indice = (String) tabla_Historico_Visitantes.getValueAt(tabla_Historico_Visitantes.getSelectedRow() + i, 0);
                    listaEliminar.add(indice);
                }
                for (String element : listaEliminar) {
                    eliminarRegistrosTablaHistoricoVisitantes(Integer.parseInt(element));
                }
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Debe seleccionar al menos una fila para eliminarla del registro.", "Información", 1);
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        int cantCamposSeleccionados = tabla_Historico_Visitantes.getSelectedRowCount();
        if (cantCamposSeleccionados == 1) {
            if (modificarVisitantes == null) {
                modificarVisitantes = new F_Modificar_Visitantes();
            }
            modificarVisitantes.setLocationRelativeTo(this);
            modificarVisitantes.setVisible(true);
            int numRefModificar = Integer.valueOf((String) tabla_Historico_Visitantes.getValueAt(tabla_Historico_Visitantes.getSelectedRow(), 0));
            modificarVisitantes.cargarDatos(numRefModificar);
        } else {
            JOptionPane.showMessageDialog(rootPane, "Debe seleccionar una ÚNICA fila para poder modificarla.", "Información", 1);
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
            java.util.logging.Logger.getLogger(F_Historico_Visitantes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(F_Historico_Visitantes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(F_Historico_Visitantes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(F_Historico_Visitantes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new F_Historico_Visitantes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JButton btnEliminar;
    private static javax.swing.JButton btnModificar;
    private javax.swing.JScrollPane jScrollPane1;
    private static javax.swing.JLabel labelTitulo;
    private static javax.swing.JPanel panelFondo;
    private static javax.swing.JTable tabla_Historico_Visitantes;
    // End of variables declaration//GEN-END:variables

    /**
     * Este método extrae todos los registros de visitantes de la Base de Datos.
     */
    public static void extraerDatosDeBase() {
        miLista = new ArrayList<>();
        ConexionBaseDatos.ConexionBaseDatos();
        Connection conexion = ConexionBaseDatos.getConnection();
        Statement sentencia;
        try {
            sentencia = conexion.createStatement();
            String sql;
            sql = "SELECT * FROM REGISTRO_VISITANTES ORDER BY NUM_REF DESC";
            ResultSet resul = sentencia.executeQuery(sql);
            while (resul.next()) {
                Registro_Visitante registro = new Registro_Visitante(resul.getInt(1), resul.getInt(2), Fecha.formateaFecha(resul.getDate(3)), resul.getInt(4), resul.getString(5), resul.getString(6), resul.getString(7), resul.getString(8));
                miLista.add(registro);
            }
        } catch (SQLException ex) {
            Logger.getLogger(F_Historico_Visitantes.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error al tratar de conectar con la base de datos desde el Histórico de Visitantes");
        }

        ConexionBaseDatos.desconexionBaseDatos();
    }

    /**
     * Este método rellena el jTable con la inforación extraída de la Base de Datos por el método extraerDatosDeBase().
     */
    public static void rellenarTabla() {
        extraerDatosDeBase();
        String matrizDatos[][] = new String[miLista.size()][8]; //el segundo número es el número de campos
        for (int i = 0; i < miLista.size(); i++) {
            matrizDatos[i][0] = Integer.toString(miLista.get(i).getNum_ref());
            matrizDatos[i][1] = Integer.toString(miLista.get(i).getRef_visita());
            matrizDatos[i][2] = miLista.get(i).getFecha();
            matrizDatos[i][3] = Integer.toString(miLista.get(i).getCantidad());
            matrizDatos[i][4] = miLista.get(i).getRef_sexo();
            matrizDatos[i][5] = miLista.get(i).getRef_rangoEdad();
            matrizDatos[i][6] = miLista.get(i).getProcedencia_Internacional();
            matrizDatos[i][7] = miLista.get(i).getProcedencia();
        }

        tabla_Historico_Visitantes.setModel(new javax.swing.table.DefaultTableModel(
                matrizDatos,
                new String[]{
                    "NUM_REF", "REF_VISITA", "FECHA", "CANTIDAD", "REF_SEXO", "REF_RANGOEDAD", "PROCEDENCIA_INTERNACIONAL", "PROCEDENCIA"
                }
        ));
    }

    /**
     * Este método procede a la eliminación, previa confirmación por parte del usuario, de los registros de visitantes que se le indiquen.
     * @param indice Recibe por parámetro la clave primaria de los registros a eliminar.
     */
    public void eliminarRegistrosTablaHistoricoVisitantes(int indice) {
        ConexionBaseDatos.ConexionBaseDatos();
        Connection conexion = ConexionBaseDatos.getConnection();
        Statement sentencia;
        try {
            sentencia = conexion.createStatement();
            String sql;
            sql = "DELETE FROM REGISTRO_VISITANTES WHERE NUM_REF =" + indice;
            ResultSet resul = sentencia.executeQuery(sql);
            System.out.println("Se ha eliminado el registro " + indice);
        } catch (SQLException ex) {
            Logger.getLogger(F_Historico_Visitantes.class.getName()).log(Level.SEVERE, null, ex);
        }

        rellenarTabla();
    }

    /**
     * Este método permite modificar un registro a partir del propio jTable.
     * Actualmente no tiene uso, dado que la actual forma de modificación se realiza a través de una nueva ventana con su propio formulario.
     * Se conserva por posible utilidad futura, y no existe en el resto de clases 'Históricas'.
     */
    public void actualizarRegistroTablaHistoricoVisitantes() {
        String NUM_REF, REF_VISITA, CANTIDAD;
        String FECHA, REF_SEXO, REF_RANGOEDAD, PROCEDENCIA_INTERNACIONAL, PROCEDENCIA;
        NUM_REF = (String) tabla_Historico_Visitantes.getValueAt(tabla_Historico_Visitantes.getSelectedRow(), 0);
        REF_VISITA = (String) tabla_Historico_Visitantes.getValueAt(tabla_Historico_Visitantes.getSelectedRow(), 1);
        FECHA = (String) tabla_Historico_Visitantes.getValueAt(tabla_Historico_Visitantes.getSelectedRow(), 2);
        CANTIDAD = (String) tabla_Historico_Visitantes.getValueAt(tabla_Historico_Visitantes.getSelectedRow(), 3);
        REF_SEXO = (String) tabla_Historico_Visitantes.getValueAt(tabla_Historico_Visitantes.getSelectedRow(), 4);
        REF_RANGOEDAD = (String) tabla_Historico_Visitantes.getValueAt(tabla_Historico_Visitantes.getSelectedRow(), 5);
        PROCEDENCIA_INTERNACIONAL = (String) tabla_Historico_Visitantes.getValueAt(tabla_Historico_Visitantes.getSelectedRow(), 6);
        PROCEDENCIA = (String) tabla_Historico_Visitantes.getValueAt(tabla_Historico_Visitantes.getSelectedRow(), 7);

        int opcion = JOptionPane.showConfirmDialog(rootPane, "¿Está seguro de querer modificar el registro seleccionado?", "Aviso", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (opcion == JOptionPane.YES_OPTION) {
            ConexionBaseDatos.ConexionBaseDatos();
            Connection conexion = ConexionBaseDatos.getConnection();
            String datosActualizacion = "UPDATE REGISTRO_VISITANTES SET REF_VISITA = " + REF_VISITA
                    + ", FECHA = '" + FECHA + "'"
                    + ", CANTIDAD = " + CANTIDAD
                    + ", REF_SEXO = '" + REF_SEXO + "'"
                    + ", REF_RANGOEDAD = '" + REF_RANGOEDAD + "'"
                    + ", PROCEDENCIA_INTERNACIONAL = '" + PROCEDENCIA_INTERNACIONAL + "'"
                    + ", PROCEDENCIA = '" + PROCEDENCIA + "'"
                    + " WHERE NUM_REF = " + NUM_REF;
            PreparedStatement sentencia;
            try {
                sentencia = conexion.prepareStatement(datosActualizacion);
                sentencia.executeUpdate();
                JOptionPane.showMessageDialog(rootPane, "Registro modificado con éxito", "Información", 3);
            } catch (SQLException ex) {
                Logger.getLogger(F_Historico_Visitantes.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(rootPane, "Los datos introducidos no son válidos.\nEl registro NO ha sido modificado.", "Error", 2);
            }
            ConexionBaseDatos.desconexionBaseDatos();
        }
        //Modficado o no, recargamos la tabla
        rellenarTabla();
    }

    /**
     * Este método gestiona el color de los diferentes componentes del registro de visitantes en función de las preferencias del usuario.
     */
    public static void establecerColor() {
        ColorInterfaz.dimeColores();
        Color colorFondo = ColorInterfaz.dimeColores()[0];
        Color colorBotones = ColorInterfaz.dimeColores()[1];
        Color colorTexto = ColorInterfaz.dimeColores()[2];

        //Paneles de fondo
        panelFondo.setBackground(colorFondo);

        //Botones
        btnModificar.setBackground(colorBotones);
        btnEliminar.setBackground(colorBotones);

        //Textos
        labelTitulo.setForeground(colorTexto);
        btnModificar.setForeground(colorTexto);
        btnEliminar.setForeground(colorTexto);
        if (modificarVisitantes != null) {
            modificarVisitantes.establecerColor();
        }
    }
}
