/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formularios;

import objetosSimples.Item_Facturacion;
import historicos.F_Historico_Visitantes;
import auxiliares.ConexionBaseDatos;
import auxiliares.Fecha;
import configuracion.ColorInterfaz;
import java.awt.Color;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 * Esta clase ofrece al usuario información sobre la facturación total del museo entre las dos fechas que se escojan.
 * @author Daniel Marcos Muñoz
 */
public class F_Facturacion extends javax.swing.JFrame {

    ArrayList<Item_Facturacion> listaFacturacion;
    ArrayList<String> listaEntradas, listaMerchan;
    String fechaInicio = "";
    String fechaFin = "";

    /**
     * Creates new form F_Facturacion
     */
    public F_Facturacion() {
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
        lblFechaInicio = new javax.swing.JLabel();
        lblFechaFin = new javax.swing.JLabel();
        calendar_Inicio = new rojeru_san.componentes.RSDateChooser();
        calendar_Fin = new rojeru_san.componentes.RSDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_Entradas = new javax.swing.JTable();
        btnFacturar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        labelTitulo.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        labelTitulo.setText("Facturación");

        panelContenedor.setLayout(new java.awt.GridLayout(2, 2));

        lblFechaInicio.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblFechaInicio.setText("Fecha inicial");
        panelContenedor.add(lblFechaInicio);

        lblFechaFin.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblFechaFin.setText("Fecha final");
        panelContenedor.add(lblFechaFin);

        calendar_Inicio.setFormatoFecha("dd/MM/yyyy");
        calendar_Inicio.setFuente(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        panelContenedor.add(calendar_Inicio);

        calendar_Fin.setFormatoFecha("dd/MM/yyyy");
        calendar_Fin.setFuente(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        panelContenedor.add(calendar_Fin);

        tabla_Entradas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Concepto", "Cantidad", "Ingreso"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla_Entradas.setCellSelectionEnabled(true);
        tabla_Entradas.setEnabled(false);
        tabla_Entradas.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tabla_Entradas);

        btnFacturar.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btnFacturar.setText("Facturar");
        btnFacturar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFacturarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelFondoLayout = new javax.swing.GroupLayout(panelFondo);
        panelFondo.setLayout(panelFondoLayout);
        panelFondoLayout.setHorizontalGroup(
            panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFondoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelTitulo, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelContenedor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 664, Short.MAX_VALUE)
                    .addComponent(btnFacturar, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap())
        );
        panelFondoLayout.setVerticalGroup(
            panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFondoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelContenedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnFacturar)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFondo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFacturarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFacturarActionPerformed
        boolean fechasSeleccionadas = false;
        try {
            fechaInicio = Fecha.formateaFecha(calendar_Inicio.getDatoFecha());
            fechaFin = Fecha.formateaFecha(calendar_Fin.getDatoFecha());
            fechasSeleccionadas = true;
        } catch (Exception e) {
            fechasSeleccionadas = false;
            JOptionPane.showMessageDialog(rootPane, "Debe seleccionar una fecha de inicio y otra de fin del periodo de facturación.\nAmbas se incluirán en la búsqueda.", "Error", 2);
        }
        if (fechasSeleccionadas == true) {
            extraerDatosDeBase();
            rellenarTabla();
        }
    }//GEN-LAST:event_btnFacturarActionPerformed

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
            java.util.logging.Logger.getLogger(F_Facturacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(F_Facturacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(F_Facturacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(F_Facturacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new F_Facturacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JButton btnFacturar;
    private rojeru_san.componentes.RSDateChooser calendar_Fin;
    private rojeru_san.componentes.RSDateChooser calendar_Inicio;
    private javax.swing.JScrollPane jScrollPane1;
    private static javax.swing.JLabel labelTitulo;
    private static javax.swing.JLabel lblFechaFin;
    private static javax.swing.JLabel lblFechaInicio;
    private static javax.swing.JPanel panelContenedor;
    private static javax.swing.JPanel panelFondo;
    private javax.swing.JTable tabla_Entradas;
    // End of variables declaration//GEN-END:variables

    /**
     * Este método realiza una consulta en la Base de Datos de la que extrae totales sobre el número de entradas y productos promocionales vendidos entre las dos fechas que se indiquen en los componentes Calendar.
     */
    public void extraerDatosDeBase() {
        listaFacturacion = new ArrayList<>();
        listaEntradas = new ArrayList<>();
        listaMerchan = new ArrayList<>();
        ConexionBaseDatos.ConexionBaseDatos();
        Connection conexion = ConexionBaseDatos.getConnection();
        Statement sentencia;
        try {
            sentencia = conexion.createStatement();
            String sql;
            ResultSet resul;

            //ENTRADAS
            sql = "SELECT * FROM ENTRADA";
            resul = sentencia.executeQuery(sql);
            while (resul.next()) {
                listaEntradas.add(resul.getString(1));
            }

            for (String element : listaEntradas) {
                System.out.println(element);
                sql = "SELECT SUM(CANTIDAD)-SUM(EXENCIONES) FROM REGISTRO_ENTRADAS WHERE TIPO_ENTRADA = '" + element + "' AND FECHA >= '" + fechaInicio + "' AND FECHA <= '" + fechaFin + "' ORDER BY NUM_REF DESC";
                System.out.println(sql);
                resul = sentencia.executeQuery(sql);
                Item_Facturacion item = new Item_Facturacion();
                item.setConcepto(element);
                while (resul.next()) {
                    item.setCantidad(resul.getInt(1));
                }
                sql = "SELECT SUM(PRECIO_TOTAL) FROM REGISTRO_ENTRADAS WHERE TIPO_ENTRADA = '" + element + "' AND FECHA >= '" + fechaInicio + "' AND FECHA <= '" + fechaFin + "' ORDER BY NUM_REF DESC";
                resul = sentencia.executeQuery(sql);
                while (resul.next()) {
                    item.setIngresos(resul.getInt(1));
                }
                listaFacturacion.add(item);
            }

            //MERCHANDISING
            sql = "SELECT * FROM MERCHANDISING";
            resul = sentencia.executeQuery(sql);
            while (resul.next()) {
                listaMerchan.add(resul.getString(1));
            }

            for (String element : listaMerchan) {
                System.out.println(element);
                sql = "SELECT SUM(CANTIDAD) FROM REGISTRO_MERCHANDISING WHERE CONCEPTO = '" + element + "' AND FECHA >= '" + fechaInicio + "' AND FECHA <= '" + fechaFin + "' ORDER BY NUM_REF DESC";
                System.out.println(sql);
                resul = sentencia.executeQuery(sql);
                Item_Facturacion item = new Item_Facturacion();
                item.setConcepto(element);
                while (resul.next()) {
                    item.setCantidad(resul.getInt(1));
                }
                sql = "SELECT SUM(PRECIO_TOTAL) FROM REGISTRO_MERCHANDISING WHERE CONCEPTO = '" + element + "' AND FECHA >= '" + fechaInicio + "' AND FECHA <= '" + fechaFin + "' ORDER BY NUM_REF DESC";
                resul = sentencia.executeQuery(sql);
                while (resul.next()) {
                    item.setIngresos(resul.getInt(1));
                }
                listaFacturacion.add(item);
            }
            resul.close();
            sentencia.close();
        } catch (SQLException ex) {
            Logger.getLogger(F_Historico_Visitantes.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error al tratar de conectar con la base de datos desde Facturación");
        }

        ConexionBaseDatos.desconexionBaseDatos();
    }

    /**
     * Este método rellena un jTable con a información relativa a la factuación extraída por el método extraerDatosDeBase().
     */
    public void rellenarTabla() {
        extraerDatosDeBase();
        String matrizDatos[][] = new String[listaFacturacion.size() + 1][3];//el segundo número es el número de campos
        float precioTotal = 0;
        for (int i = 0; i < listaFacturacion.size(); i++) {
            matrizDatos[i][0] = listaFacturacion.get(i).getConcepto();
            matrizDatos[i][1] = Integer.toString(listaFacturacion.get(i).getCantidad());
            matrizDatos[i][2] = Float.toString(listaFacturacion.get(i).getIngresos());
            precioTotal += listaFacturacion.get(i).getIngresos();
        }
        matrizDatos[listaFacturacion.size()][1] = "TOTAL";
        matrizDatos[listaFacturacion.size()][2] = Float.toString(precioTotal);

        tabla_Entradas.setModel(new javax.swing.table.DefaultTableModel(
                matrizDatos,
                new String[]{
                    "CONCEPTO", "CANTIDAD", "INGRESOS"
                }
        ));
    }

    /**
     * Este método gestiona el color de los componentes de Facturación en función de las preferencias del usuario.
     */
    public static void establecerColor() {
        ColorInterfaz.dimeColores();
        Color colorFondo = ColorInterfaz.dimeColores()[0];
        Color colorBotones = ColorInterfaz.dimeColores()[1];
        Color colorTexto = ColorInterfaz.dimeColores()[2];

        //Paneles de fondo
        panelFondo.setBackground(colorFondo);
        panelContenedor.setBackground(colorFondo);

        //Botones
        btnFacturar.setBackground(colorBotones);

        //Textos
        labelTitulo.setForeground(colorTexto);
        lblFechaInicio.setForeground(colorTexto);
        lblFechaFin.setForeground(colorTexto);
        btnFacturar.setForeground(colorTexto);

    }
}
