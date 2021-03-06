/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FrontEnd;

import BackEnd.Main;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
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
public class VisualizarCliente extends javax.swing.JFrame {

    /**
     * Creates new form VisualizarCliente
     */
    public VisualizarCliente() {
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
        clientetable = new javax.swing.JTable();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        codigotxt = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        correo = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        telefono = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        nit = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        credito = new javax.swing.JTextField();
        dpitxt = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        direccion = new javax.swing.JTextField();
        nombre = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Ver Cliente");
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        clientetable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(clientetable);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 550, 110));

        jLabel15.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(51, 51, 51));
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Codigo.png"))); // NOI18N
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, -1, 30));

        jLabel16.setBackground(new java.awt.Color(153, 153, 153));
        jLabel16.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(51, 51, 51));
        jLabel16.setOpaque(true);
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, 30, 30));

        codigotxt.setBackground(new java.awt.Color(153, 153, 153));
        codigotxt.setForeground(new java.awt.Color(51, 51, 51));
        codigotxt.setBorder(null);
        jPanel1.add(codigotxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, 180, 30));

        jLabel10.setFont(new java.awt.Font("Ubuntu", 1, 21)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setText("Visualizar Cliente:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 40, -1, -1));

        jLabel14.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(51, 51, 51));
        jLabel14.setText("DPI:");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 430, 40, 30));

        jLabel13.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(51, 51, 51));
        jLabel13.setText("Credito:");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 310, 60, 30));

        jLabel9.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("NIT:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 40, 30));

        correo.setEditable(false);
        correo.setBackground(new java.awt.Color(153, 153, 153));
        correo.setForeground(new java.awt.Color(51, 51, 51));
        correo.setBorder(null);
        jPanel1.add(correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 350, 180, 30));

        jLabel17.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(51, 51, 51));
        jLabel17.setText("Correo:");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 350, 60, 30));

        telefono.setEditable(false);
        telefono.setBackground(new java.awt.Color(153, 153, 153));
        telefono.setForeground(new java.awt.Color(51, 51, 51));
        telefono.setBorder(null);
        jPanel1.add(telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 390, 180, 30));

        jButton1.setBackground(new java.awt.Color(153, 153, 153));
        jButton1.setForeground(new java.awt.Color(51, 51, 51));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Usuarios.png"))); // NOI18N
        jButton1.setText("Ver Cliente");
        jButton1.setToolTipText("");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 260, 180, 30));

        nit.setEditable(false);
        nit.setBackground(new java.awt.Color(153, 153, 153));
        nit.setForeground(new java.awt.Color(51, 51, 51));
        nit.setBorder(null);
        jPanel1.add(nit, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 310, 180, 30));

        jLabel11.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 51, 51));
        jLabel11.setText("Nombre:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 70, 30));

        credito.setEditable(false);
        credito.setBackground(new java.awt.Color(153, 153, 153));
        credito.setForeground(new java.awt.Color(51, 51, 51));
        credito.setBorder(null);
        credito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                creditoActionPerformed(evt);
            }
        });
        jPanel1.add(credito, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 310, 180, 30));

        dpitxt.setEditable(false);
        dpitxt.setBackground(new java.awt.Color(153, 153, 153));
        dpitxt.setForeground(new java.awt.Color(51, 51, 51));
        dpitxt.setBorder(null);
        jPanel1.add(dpitxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 430, 180, 30));

        jLabel12.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 51, 51));
        jLabel12.setText("Direccion:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 390, 80, 30));

        jLabel7.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("Telefono:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, 70, 30));

        direccion.setEditable(false);
        direccion.setBackground(new java.awt.Color(153, 153, 153));
        direccion.setForeground(new java.awt.Color(51, 51, 51));
        direccion.setBorder(null);
        jPanel1.add(direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 390, 180, 30));

        nombre.setEditable(false);
        nombre.setBackground(new java.awt.Color(153, 153, 153));
        nombre.setForeground(new java.awt.Color(51, 51, 51));
        nombre.setBorder(null);
        jPanel1.add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 350, 180, 30));

        jButton2.setBackground(new java.awt.Color(153, 153, 153));
        jButton2.setForeground(new java.awt.Color(51, 51, 51));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Descripcion.png"))); // NOI18N
        jButton2.setText("Editar Cliente");
        jButton2.setBorder(null);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 430, 180, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VisualizarCliente.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -5, 610, 490));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Agrega los datos a los textfiel para editarlos
     * @param evt 
     */
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int filaselected = clientetable.getSelectedRow();
        if (filaselected >= 0) {
            String[] datos = new String[7];
            try {
                datos[0] = clientetable.getValueAt(filaselected, 0).toString();
                datos[1] = clientetable.getValueAt(filaselected, 1).toString();
                datos[2] = clientetable.getValueAt(filaselected, 2).toString();
                datos[3] = clientetable.getValueAt(filaselected, 3).toString();
                datos[4] = clientetable.getValueAt(filaselected, 4).toString();
                datos[5] = clientetable.getValueAt(filaselected, 5).toString();
                datos[6] = clientetable.getValueAt(filaselected, 6).toString();
                nit.setText(datos[0]);
                nombre.setText(datos[1]);
                telefono.setText(datos[2]);
                dpitxt.setText(datos[3]);
                credito.setText(datos[4]);
                correo.setText(datos[5]);
                direccion.setText(datos[6]);
                nombre.setEditable(true);
                direccion.setEditable(true);
                telefono.setEditable(true);
                dpitxt.setEditable(true);
                correo.setEditable(true);
                credito.setEditable(true);
            } catch (Exception e) {
            }

        } else {
            JOptionPane.showMessageDialog(null, "Por favor seleccione un empleado");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void creditoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_creditoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_creditoActionPerformed

    /**
     * Comprueba que los datos esten bien y actualiza la informacion del cliente a los nuevos datos
     * @param evt 
     */
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int filaselected = clientetable.getSelectedRow();
        if (filaselected >= 0 && nit.getText().length() > 0 && nombre.getText().length()>0 && telefono.getText().length()>0) {
            String[] datos = new String[7];
            
            try {
                datos[0] = clientetable.getValueAt(filaselected, 0).toString();
                datos[1] = clientetable.getValueAt(filaselected, 1).toString();
                datos[2] = clientetable.getValueAt(filaselected, 2).toString();
                datos[3] = clientetable.getValueAt(filaselected, 3).toString();
                datos[4] = clientetable.getValueAt(filaselected, 4).toString();
                datos[5] = clientetable.getValueAt(filaselected, 5).toString();
                datos[6] = clientetable.getValueAt(filaselected, 6).toString();

                String nombreupdate = nombre.getText();
                String telefonoupdate = telefono.getText();
                Double creditoupdate =Double.parseDouble( credito.getText());
                String dpiupdate = dpitxt.getText();
                String correoupdate = correo.getText();
                String direccionupdate = direccion.getText();
                String query = ("UPDATE CLIENTE SET nombre = '" + nombreupdate + "', telefono='" + telefonoupdate + "', DPI='" + dpiupdate + "', credito='" + creditoupdate + "', correo='" + correoupdate + "', direccion='" + direccionupdate + "'WHERE NIT='" + datos[0] + "'");

                Main.conexion.Insert(query);
                llenarTabla(codigotxt, "SELECT * FROM CLIENTE ", true, clientetable, "NIT", "");
            } catch (Exception e) {
            }

        } else {
            JOptionPane.showMessageDialog(null, "Por favor seleccione una tienda y llene los datos obligatorios");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        llenarTabla(codigotxt, "SELECT * FROM CLIENTE ", true, clientetable, "NIT", "");
        Keilstener();
    }//GEN-LAST:event_formComponentShown

    /**
     * Metodo para llenar la tabla del cliente
     * @param filtro
     * @param accion
     * @param cliente
     * @param tabla
     * @param value
     * @param tienda 
     */
    public void llenarTabla(JTextField filtro, String accion, boolean cliente, JTable tabla, String value, String tienda) {
        String campo = filtro.getText();
        String where = "";

        where = "WHERE " + value + " LIKE '%" + campo + "%' || nombre LIKE '%" + campo + "%' ORDER BY NIT ASC";
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
            model.addColumn("NIT");
            model.addColumn("Nombre");
            model.addColumn("Telefono");
            model.addColumn("DPI");
            model.addColumn("Credito");
            model.addColumn("Correo");
            model.addColumn("Direccion");
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

    /**
     * Keylistener para filtrar al cliente por nit
     */
    public void Keilstener() {
        codigotxt.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent de) {
                llenarTabla(codigotxt, "SELECT * FROM CLIENTE ", true, clientetable, "NIT", "");
            }

            @Override
            public void removeUpdate(DocumentEvent de) {
                 llenarTabla(codigotxt, "SELECT * FROM CLIENTE ", true, clientetable, "NIT", "");
            }

            @Override
            public void changedUpdate(DocumentEvent de) {
                 llenarTabla(codigotxt, "SELECT * FROM CLIENTE ", true, clientetable, "NIT", "");
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
            java.util.logging.Logger.getLogger(VisualizarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VisualizarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VisualizarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VisualizarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VisualizarCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable clientetable;
    private javax.swing.JTextField codigotxt;
    private javax.swing.JTextField correo;
    private javax.swing.JTextField credito;
    private javax.swing.JTextField direccion;
    private javax.swing.JTextField dpitxt;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nit;
    private javax.swing.JTextField nombre;
    private javax.swing.JTextField telefono;
    // End of variables declaration//GEN-END:variables
}
