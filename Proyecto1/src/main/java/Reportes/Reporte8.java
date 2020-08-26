/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reportes;

import BackEnd.Main;
import FrontEnd.MenuEmpresa;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author potz
 */
public class Reporte8 extends javax.swing.JFrame {

    /**
     * Creates new form Reporte8
     */
    public Reporte8() {
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
        jButton3 = new javax.swing.JButton();
        fecha1txt = new javax.swing.JFormattedTextField();
        jButton2 = new javax.swing.JButton();
        fecha2txt = new javax.swing.JFormattedTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        pedidotable = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        Nombretxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Productos mas vendidos");
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton3.setBackground(new java.awt.Color(153, 153, 153));
        jButton3.setForeground(new java.awt.Color(204, 204, 204));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Loginicono.png"))); // NOI18N
        jButton3.setText("Generar Reporte");
        jButton3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 390, 170, 30));

        fecha1txt.setBackground(new java.awt.Color(153, 153, 153));
        fecha1txt.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        fecha1txt.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("yyyy-MM-dd"))));
        jPanel1.add(fecha1txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 210, 30));

        jButton2.setBackground(new java.awt.Color(153, 153, 153));
        jButton2.setForeground(new java.awt.Color(51, 51, 51));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Reloj.png"))); // NOI18N
        jButton2.setText("Filtrar tiempo");
        jButton2.setBorder(null);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 60, 140, 30));

        fecha2txt.setBackground(new java.awt.Color(153, 153, 153));
        fecha2txt.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        fecha2txt.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("yyyy-MM-dd"))));
        jPanel1.add(fecha2txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 60, 210, 30));

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

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 610, 250));

        jLabel11.setFont(new java.awt.Font("Ubuntu", 1, 21)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 51, 51));
        jLabel11.setText("Productos mas Vendidos");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, -1, -1));

        Nombretxt.setBackground(new java.awt.Color(153, 153, 153));
        Nombretxt.setForeground(new java.awt.Color(51, 51, 51));
        jPanel1.add(Nombretxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 390, 150, 30));

        jLabel2.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Nombre del Reporte:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 360, 150, 20));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FondoVentaPedido.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 430));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Comparamos las dos fechas para comparar el intervalo de tiempo
     * @param evt 
     */
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (fecha1txt.getText().length() == 0 && fecha2txt.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Por favor llene las dos fechas");
        } else {

            String fecha1 = fecha1txt.getText();
            String fecha2 = fecha2txt.getText();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            LocalDate fecha11 = LocalDate.parse(fecha1, formatter);
            LocalDate fecha22 = LocalDate.parse(fecha2, formatter);
            llenarTabla("SELECT P.codigo,P.nombre,COUNT(*) AS VENTAS FROM PRODUCTO P,VENTA V,FACTURA F WHERE P.codigo=V.codigo_producto AND F.codigo=V.codigo_factura && F.fecha BETWEEN '" + fecha11 + "' AND '" + fecha22 + "' && P.codigo_tienda='" + MenuEmpresa.codigoTiendaOrigen + "' GROUP BY P.codigo ORDER BY COUNT(*)  ", true, pedidotable, "codigo", "");
        }
    }//GEN-LAST:event_jButton2ActionPerformed
    /**
     * Metodo para Crear el reporte en html mandandole el nombre del reporte y
     * el titulo de este
     *
     * @param tabla
     * @param titulo
     */
    public void CrearArchivo(JTable tabla, String titulo) {
        if (Nombretxt.getText().length() != 0) {
            try {
                PrintWriter writer = new PrintWriter("Reportes/" + Nombretxt.getText(), "UTF-8");
                writer.println("<html>");
                writer.println("<h1><center>" + titulo + "</center</h1>");
                writer.println("<style type=" + "\"" + "text/css" + "\"" + ">");
                writer.println("table, th, td {");
                writer.println("border: 1px solid black;");
                writer.println("border-collapse: collapse;");
                writer.println("}");
                writer.println(" th, td {");
                writer.println("padding: 10px;");

                writer.println("}");
                writer.println(" th {");
                writer.println("background-color: #246355;");
                writer.println("border-bottom: solid 5px #0F362D;");
                writer.println("color: white;");
                writer.println("}");
                writer.println(" tr:nth-child(even) {");
                writer.println("background-color: #ddd;");
                writer.println("}");
                writer.println(" tr:hover td{");
                writer.println("background-color: #369681;");
                writer.println("color: white;");
                writer.println("}");
                writer.println("</style>");
                writer.println("<table style=" + "\"" + "width: 100%" + "\"" + " >");
                writer.println("<tr>");
                for (int i = 0; i < tabla.getColumnCount(); i++) {
                    writer.println("<th><strong>" + tabla.getColumnName(i) + "</strong></th>");

                }
                writer.println("</tr>");
                for (int i = 0; i < tabla.getRowCount(); i++) {
                    writer.println("<tr>");
                    for (int j = 0; j < tabla.getColumnCount(); j++) {
                        writer.println("<td>" + tabla.getModel().getValueAt(i, j).toString() + "</td>");

                    }
                    writer.println("<tr>");
                }
                writer.println("</table>");
                writer.println("</html>");
                writer.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }else {
            JOptionPane.showMessageDialog(null, "Por favor llene el nombre del archivo");
        }

    }
    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        llenarTabla("SELECT P.codigo,P.nombre,COUNT(*) AS VENTAS FROM PRODUCTO P INNER JOIN VENTA V ON P.codigo=V.codigo_producto INNER JOIN FACTURA F ON V.codigo_factura=F.codigo WHERE P.codigo_tienda='" + MenuEmpresa.codigoTiendaOrigen + "' GROUP BY P.codigo ORDER BY COUNT(*) ", true, pedidotable, "codigo", "");
    }//GEN-LAST:event_formComponentShown

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        CrearArchivo(pedidotable, "Productos mas vendidos en la tienda:");
    }//GEN-LAST:event_jButton3ActionPerformed
/**
 * Metodo para llenar la tabla con los productos mas vendidos
 * @param accion
 * @param cliente
 * @param tabla
 * @param value
 * @param tienda 
 */
    public void llenarTabla(String accion, boolean cliente, JTable tabla, String value, String tienda) {
        String campo = "";
        String where = "";

        where = "WHERE  codigo_tienda2='" + MenuEmpresa.codigoTiendaOrigen + "'";
        try {
            DefaultTableModel model = new DefaultTableModel() {
                @Override
                public boolean isCellEditable(int row, int column) {
                    return false;
                }
            };
            tabla.setModel(model);
            String query = accion;
            ResultSet Result = Main.conexion.ComboBox(query);
            ResultSetMetaData rsMd = Result.getMetaData();
            int cantidadColumnas = rsMd.getColumnCount();
            model.addColumn("Codigo");
            model.addColumn("Nombre");
            model.addColumn("Cantidad de Ventas");
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
            java.util.logging.Logger.getLogger(Reporte8.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Reporte8.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Reporte8.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Reporte8.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Reporte8().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Nombretxt;
    private javax.swing.JFormattedTextField fecha1txt;
    private javax.swing.JFormattedTextField fecha2txt;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable pedidotable;
    // End of variables declaration//GEN-END:variables
}
