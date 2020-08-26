/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FrontEnd;

import BackEnd.Main;
import BaseDeDatos.Conexion;
import Reportes.Reporte1;
import Reportes.Reporte3;
import Reportes.Reporte4;
import Reportes.Reporte2;
import Reportes.Reporte7;
import Reportes.Reporte8;
import Reportes.Reporte9;
import Reportes.ReportesMenu;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author potz
 */
public class MenuEmpresa extends javax.swing.JFrame {
    
    public static String codigoTiendaOrigen;

    /**
     * Creates new form MenuEmpresa
     */
    public MenuEmpresa() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.pack();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        cargar = new javax.swing.JButton();
        usuario = new javax.swing.JButton();
        tiempo = new javax.swing.JButton();
        ventas = new javax.swing.JButton();
        tiendas = new javax.swing.JButton();
        productos = new javax.swing.JButton();
        combotienda = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        pedidos = new javax.swing.JButton();
        visualizar = new javax.swing.JButton();
        reporte = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Menu Empleado");
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LogoIntelaf.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 270, 80));

        cargar.setBackground(new java.awt.Color(153, 153, 153));
        cargar.setForeground(new java.awt.Color(51, 51, 51));
        cargar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Loginicono.png"))); // NOI18N
        cargar.setText("Cargar Datos");
        cargar.setBorder(null);
        cargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cargarActionPerformed(evt);
            }
        });
        jPanel1.add(cargar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 300, 130, 40));

        usuario.setBackground(new java.awt.Color(153, 153, 153));
        usuario.setForeground(new java.awt.Color(51, 51, 51));
        usuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Usuarios.png"))); // NOI18N
        usuario.setText("Usuarios");
        usuario.setBorder(null);
        usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuarioActionPerformed(evt);
            }
        });
        jPanel1.add(usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 220, 120, 40));

        tiempo.setBackground(new java.awt.Color(153, 153, 153));
        tiempo.setForeground(new java.awt.Color(51, 51, 51));
        tiempo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Reloj.png"))); // NOI18N
        tiempo.setText("Tiempo");
        tiempo.setBorder(null);
        tiempo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tiempoActionPerformed(evt);
            }
        });
        jPanel1.add(tiempo, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 140, 120, 40));

        ventas.setBackground(new java.awt.Color(153, 153, 153));
        ventas.setForeground(new java.awt.Color(51, 51, 51));
        ventas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ventas.png"))); // NOI18N
        ventas.setText("Ventas");
        ventas.setBorder(null);
        ventas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ventasActionPerformed(evt);
            }
        });
        jPanel1.add(ventas, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, 120, 40));

        tiendas.setBackground(new java.awt.Color(153, 153, 153));
        tiendas.setForeground(new java.awt.Color(51, 51, 51));
        tiendas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconotiende.png"))); // NOI18N
        tiendas.setText("Tiendas");
        tiendas.setBorder(null);
        tiendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tiendasActionPerformed(evt);
            }
        });
        jPanel1.add(tiendas, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 120, 40));

        productos.setBackground(new java.awt.Color(153, 153, 153));
        productos.setForeground(new java.awt.Color(51, 51, 51));
        productos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LogoComprar.png"))); // NOI18N
        productos.setText("Productos");
        productos.setBorder(null);
        productos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productosActionPerformed(evt);
            }
        });
        jPanel1.add(productos, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 140, 130, 40));

        jPanel1.add(combotienda, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 40, 180, 30));

        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Tienda Actual:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 40, 110, 30));

        pedidos.setBackground(new java.awt.Color(153, 153, 153));
        pedidos.setForeground(new java.awt.Color(51, 51, 51));
        pedidos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Reloj.png"))); // NOI18N
        pedidos.setText("Pedidos");
        pedidos.setBorder(null);
        pedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pedidosActionPerformed(evt);
            }
        });
        jPanel1.add(pedidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, 120, 40));

        visualizar.setBackground(new java.awt.Color(153, 153, 153));
        visualizar.setForeground(new java.awt.Color(51, 51, 51));
        visualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Descripcion.png"))); // NOI18N
        visualizar.setText("Visualizar/Modificar");
        visualizar.setBorder(null);
        visualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                visualizarActionPerformed(evt);
            }
        });
        jPanel1.add(visualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 300, 180, 40));

        reporte.setBackground(new java.awt.Color(153, 153, 153));
        reporte.setForeground(new java.awt.Color(51, 51, 51));
        reporte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fabricante.png"))); // NOI18N
        reporte.setText("Reportes");
        reporte.setBorder(null);
        reporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reporteActionPerformed(evt);
            }
        });
        jPanel1.add(reporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 220, 130, 40));

        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 580, 250));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FondoNuevaTienda.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cargarActionPerformed
        CargarArchivo cargar = new CargarArchivo();
        cargar.setVisible(true);
    }//GEN-LAST:event_cargarActionPerformed

    private void usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuarioActionPerformed
        CrearUsuario usuario = new CrearUsuario();
        usuario.setVisible(true);
    }//GEN-LAST:event_usuarioActionPerformed

    private void tiempoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tiempoActionPerformed
        CrearTiempo tiempo = new CrearTiempo();
        tiempo.setVisible(true);
        codigoTiendaOrigen = String.valueOf(combotienda.getSelectedItem());
    }//GEN-LAST:event_tiempoActionPerformed

    private void tiendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tiendasActionPerformed
        CrearTienda tienda = new CrearTienda();
        tienda.setVisible(true);
    }//GEN-LAST:event_tiendasActionPerformed

    private void productosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productosActionPerformed
        CrearProducto producto = new CrearProducto();
        producto.setVisible(true);
        codigoTiendaOrigen = String.valueOf(combotienda.getSelectedItem());
    }//GEN-LAST:event_productosActionPerformed

    /**
     * Cargamos las tiendas existentes en un combobox y comprobamos si la base de datos esta llena
     * Para habilitar los botones
     * @param evt 
     */
    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        String Query = "SELECT CODIGO FROM TIENDA";
        Conexion conexion = new Conexion();
        ResultSet Result = conexion.ComboBox(Query);
        try {
            while (Result.next()) {
                
                combotienda.addItem(String.valueOf(Result.getObject("codigo")));
            }
            
        } catch (Exception e) {
        }
        String[] Nombres = {"TIENDA", "CLIENTE", "TIEMPO_TIENDA", "FACTURA", "EMPLEADO", "PRODUCTO", "VENTA", "PEDIDO", "RECIBO"};
        Query = "";
        boolean vacia=true;
        for (int i = 0; i < Nombres.length; i++) {
            Query = "SELECT * FROM " + Nombres[i];
            Result = Main.conexion.ComboBox(Query);
            try {
                if (Result != null && Result.next()) {
                    vacia=false;
                    break;
                } else {
                    vacia=true;
                }

            } catch (Exception e) {
            }
        }
        if(vacia){
            tiendas.setEnabled(false);
            tiempo.setEnabled(false);
            productos.setEnabled(false);
            ventas.setEnabled(false);
            usuario.setEnabled(false);
            tiendas.setEnabled(false);
            reporte.setEnabled(false);
            tiendas.setEnabled(false);
            pedidos.setEnabled(false);
            visualizar.setEnabled(false);
        }
    }//GEN-LAST:event_formComponentShown

    private void ventasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ventasActionPerformed
        CrearVenta venta = new CrearVenta();
        venta.setVisible(true);
        codigoTiendaOrigen = String.valueOf(combotienda.getSelectedItem());
    }//GEN-LAST:event_ventasActionPerformed

    private void pedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pedidosActionPerformed
        CrearPedido pedido = new CrearPedido();
        pedido.setVisible(true);
        codigoTiendaOrigen = String.valueOf(combotienda.getSelectedItem());
    }//GEN-LAST:event_pedidosActionPerformed

    private void visualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_visualizarActionPerformed
        VisualizarMENU menu = new VisualizarMENU();
        menu.setVisible(true);
        codigoTiendaOrigen = String.valueOf(combotienda.getSelectedItem());
    }//GEN-LAST:event_visualizarActionPerformed

    private void reporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reporteActionPerformed
        ReportesMenu reporte = new ReportesMenu();
        reporte.setVisible(true);
        codigoTiendaOrigen = String.valueOf(combotienda.getSelectedItem());
    }//GEN-LAST:event_reporteActionPerformed

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
            java.util.logging.Logger.getLogger(MenuEmpresa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuEmpresa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuEmpresa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuEmpresa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuEmpresa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cargar;
    private javax.swing.JComboBox<String> combotienda;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton pedidos;
    private javax.swing.JButton productos;
    private javax.swing.JButton reporte;
    private javax.swing.JButton tiempo;
    private javax.swing.JButton tiendas;
    private javax.swing.JButton usuario;
    private javax.swing.JButton ventas;
    private javax.swing.JButton visualizar;
    // End of variables declaration//GEN-END:variables
}
