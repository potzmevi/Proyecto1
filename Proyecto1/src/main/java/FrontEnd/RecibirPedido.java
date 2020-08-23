/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FrontEnd;

import BackEnd.Main;
import BaseDeDatos.Conexion;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author potz
 */
public class RecibirPedido extends javax.swing.JFrame {

    /**
     * Creates new form RecibirPedido
     */
    public RecibirPedido() {
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
        jScrollPane1 = new javax.swing.JScrollPane();
        pedidotable = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        codigotxt = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Confirmar");
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pedidotable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(pedidotable);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 100, 570, 180));

        jButton1.setBackground(new java.awt.Color(153, 153, 153));
        jButton1.setForeground(new java.awt.Color(51, 51, 51));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Reloj.png"))); // NOI18N
        jButton1.setText("Confirmar Pedido");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 290, 180, 50));

        codigotxt.setBackground(new java.awt.Color(153, 153, 153));
        codigotxt.setForeground(new java.awt.Color(51, 51, 51));
        codigotxt.setBorder(null);
        jPanel1.add(codigotxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 60, 180, 30));

        jLabel15.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(51, 51, 51));
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Codigo.png"))); // NOI18N
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, -1, 30));

        jLabel16.setBackground(new java.awt.Color(153, 153, 153));
        jLabel16.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(51, 51, 51));
        jLabel16.setOpaque(true);
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, 30, 30));

        jLabel10.setFont(new java.awt.Font("Ubuntu", 1, 21)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setText("Confirmar Pedido:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FondoRecibo1.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 380));

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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int filaselected = pedidotable.getSelectedRow();
        if (filaselected >= 0) {
            String[] datos = new String[5];
            datos[0] = pedidotable.getValueAt(filaselected, 0).toString();
            datos[1] = pedidotable.getValueAt(filaselected, 1).toString();
            datos[2] = pedidotable.getValueAt(filaselected, 2).toString();
            datos[3] = pedidotable.getValueAt(filaselected, 3).toString();
            datos[4] = pedidotable.getValueAt(filaselected, 4).toString();

            Conexion conexion = new Conexion();
            String Query = "SELECT ID FROM TIEMPO_TIENDA WHERE ((codigo_tienda='" + datos[2] + "' && codigo_tienda2='" + datos[3] + "')||(codigo_tienda='" + datos[3] + "' && codigo_tienda2='" + datos[2] + "'))";

            ResultSet Result = conexion.ComboBox(Query);
            int ID=0;
            try {
                while (Result.next()) {
                    if (!(Result.equals(Result.getObject("ID")))) {
                        ID = Integer.parseInt(Result.getObject("ID").toString());
                    }
                }
                Result.close();
                conexion.disconnectDB();

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error " + e);
            }
            JOptionPane.showMessageDialog(null, MenuEmpresa.codigoTiendaOrigen);
            LocalDate fecha = LocalDate.now();
            String query2 = ("INSERT INTO RECIBO VALUES('" + 0 + "','" + fecha + "','" + MenuEmpresa.codigoTiendaOrigen + "','" + datos[0] + "','" + ID + "')");
            Main.conexion.Insert(query2);
        } else {
            JOptionPane.showMessageDialog(null, "Por favor seleccione un pedido");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        llenarTabla(codigotxt, "SELECT codigo, fecha, codigo_tienda, codigo_tienda2, total FROM PEDIDO ", true, pedidotable, "codigo", "");
        Keilstener();

    }//GEN-LAST:event_formComponentShown
    public void llenarTabla(JTextField filtro, String accion, boolean cliente, JTable tabla, String value, String tienda) {
        String campo = filtro.getText();
        String where = "";

        where = "WHERE " + value + " LIKE '%" + campo + "%' ";
        try {
            DefaultTableModel model = new DefaultTableModel() {
                @Override
                public boolean isCellEditable(int row, int column) {
                    return false;
                }
            };

            tabla.setModel(model);
            String query = accion + where + tienda;
            ResultSet Result = Main.conexion.ComboBox(query);
            ResultSetMetaData rsMd = Result.getMetaData();
            int cantidadColumnas = rsMd.getColumnCount();
            model.addColumn("Codigo");
            model.addColumn("Fecha");
            model.addColumn("Tienda 1");
            model.addColumn("Tienda 2");
            model.addColumn("Total");
            while (Result.next()) {
                Object[] filas = new Object[cantidadColumnas];
                for (int i = 0; i < cantidadColumnas; i++) {
                    filas[i] = Result.getObject(i + 1);

                }
                model.addRow(filas);
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
    }

    public void Keilstener() {
        codigotxt.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent de) {
                llenarTabla(codigotxt, "SELECT codigo, fecha, codigo_tienda, codigo_tienda2, total FROM PEDIDO ", true, pedidotable, "codigo", "");
            }

            @Override
            public void removeUpdate(DocumentEvent de) {
                llenarTabla(codigotxt, "SELECT codigo, fecha, codigo_tienda, codigo_tienda2, total FROM PEDIDO ", true, pedidotable, "codigo", "");
            }

            @Override
            public void changedUpdate(DocumentEvent de) {
                llenarTabla(codigotxt, "SELECT codigo, fecha, codigo_tienda, codigo_tienda2, total FROM PEDIDO ", true, pedidotable, "codigo", "");
            }
        });
    }


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
            java.util.logging.Logger.getLogger(RecibirPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RecibirPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RecibirPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RecibirPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RecibirPedido().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField codigotxt;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable pedidotable;
    // End of variables declaration//GEN-END:variables
}
