/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FrontEnd;

import BackEnd.Main;
import BaseDeDatos.Conexion;
import javax.swing.JOptionPane;

/**
 *
 * @author potz
 */
public class CrearTienda extends javax.swing.JFrame {

    /**
     * Creates new form Tienda
     */
    public CrearTienda() {
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
        jLabel4 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        nombretxt = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        direcciontxt = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        correotxt = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        codigotxt = new javax.swing.JTextField();
        telefono1txt = new javax.swing.JTextField();
        telefono2txt = new javax.swing.JTextField();
        horariotxt = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tienda");

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("  Correo:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 280, 70, 30));

        jLabel11.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 51, 51));
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Telefono.png"))); // NOI18N
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, 30, 30));

        jLabel3.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Reloj.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 320, 30, 30));

        jLabel2.setBackground(new java.awt.Color(153, 153, 153));
        jLabel2.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setOpaque(true);
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 320, 30, 30));

        jLabel5.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Usuarios.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 80, 30, 30));

        jLabel6.setBackground(new java.awt.Color(153, 153, 153));
        jLabel6.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setOpaque(true);
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 80, 30, 30));

        nombretxt.setBackground(new java.awt.Color(153, 153, 153));
        nombretxt.setForeground(new java.awt.Color(102, 102, 102));
        nombretxt.setBorder(null);
        nombretxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                nombretxtFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                nombretxtFocusLost(evt);
            }
        });
        nombretxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nombretxtMouseClicked(evt);
            }
        });
        nombretxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombretxtActionPerformed(evt);
            }
        });
        jPanel1.add(nombretxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, 200, 30));

        jLabel7.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Direccion.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 120, 30, 30));

        direcciontxt.setBackground(new java.awt.Color(153, 153, 153));
        direcciontxt.setForeground(new java.awt.Color(102, 102, 102));
        direcciontxt.setBorder(null);
        direcciontxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                direcciontxtFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                direcciontxtFocusLost(evt);
            }
        });
        direcciontxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                direcciontxtMouseClicked(evt);
            }
        });
        jPanel1.add(direcciontxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 120, 200, 30));

        jLabel8.setBackground(new java.awt.Color(153, 153, 153));
        jLabel8.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setOpaque(true);
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 120, 30, 30));

        correotxt.setBackground(new java.awt.Color(153, 153, 153));
        correotxt.setForeground(new java.awt.Color(102, 102, 102));
        correotxt.setBorder(null);
        correotxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                correotxtMouseClicked(evt);
            }
        });
        correotxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                correotxtActionPerformed(evt);
            }
        });
        correotxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                correotxtKeyTyped(evt);
            }
        });
        jPanel1.add(correotxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 280, 200, 30));

        jLabel9.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Codigo.png"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 160, 30, 30));

        jLabel10.setBackground(new java.awt.Color(153, 153, 153));
        jLabel10.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setOpaque(true);
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 160, 30, 30));

        jButton1.setBackground(new java.awt.Color(153, 153, 153));
        jButton1.setForeground(new java.awt.Color(51, 51, 51));
        jButton1.setText("Crear");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 360, 90, 30));

        codigotxt.setBackground(new java.awt.Color(153, 153, 153));
        codigotxt.setForeground(new java.awt.Color(102, 102, 102));
        codigotxt.setBorder(null);
        codigotxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                codigotxtFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                codigotxtFocusLost(evt);
            }
        });
        codigotxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                codigotxtMouseClicked(evt);
            }
        });
        jPanel1.add(codigotxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 160, 200, 30));

        telefono1txt.setBackground(new java.awt.Color(153, 153, 153));
        telefono1txt.setForeground(new java.awt.Color(102, 102, 102));
        telefono1txt.setBorder(null);
        telefono1txt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                telefono1txtMouseClicked(evt);
            }
        });
        telefono1txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                telefono1txtKeyTyped(evt);
            }
        });
        jPanel1.add(telefono1txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 200, 200, 30));

        telefono2txt.setBackground(new java.awt.Color(153, 153, 153));
        telefono2txt.setForeground(new java.awt.Color(102, 102, 102));
        telefono2txt.setBorder(null);
        telefono2txt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                telefono2txtMouseClicked(evt);
            }
        });
        telefono2txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telefono2txtActionPerformed(evt);
            }
        });
        telefono2txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                telefono2txtKeyTyped(evt);
            }
        });
        jPanel1.add(telefono2txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 240, 200, 30));

        horariotxt.setBackground(new java.awt.Color(153, 153, 153));
        horariotxt.setForeground(new java.awt.Color(102, 102, 102));
        horariotxt.setBorder(null);
        horariotxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                horariotxtMouseClicked(evt);
            }
        });
        horariotxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                horariotxtActionPerformed(evt);
            }
        });
        horariotxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                horariotxtKeyTyped(evt);
            }
        });
        jPanel1.add(horariotxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 320, 200, 30));

        jLabel16.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(51, 51, 51));
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Correo.png"))); // NOI18N
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 280, 30, 30));

        jLabel15.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(51, 51, 51));
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Telefono.png"))); // NOI18N
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 240, 30, 30));

        jLabel12.setBackground(new java.awt.Color(153, 153, 153));
        jLabel12.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 51, 51));
        jLabel12.setOpaque(true);
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, 30, 30));

        jLabel13.setBackground(new java.awt.Color(153, 153, 153));
        jLabel13.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(51, 51, 51));
        jLabel13.setOpaque(true);
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 240, 30, 30));

        jLabel14.setBackground(new java.awt.Color(153, 153, 153));
        jLabel14.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(51, 51, 51));
        jLabel14.setOpaque(true);
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 280, 30, 30));

        jLabel17.setFont(new java.awt.Font("Ubuntu", 1, 21)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(51, 51, 51));
        jLabel17.setText("Ingresar TIenda:");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 30, -1, -1));

        jLabel18.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(51, 51, 51));
        jLabel18.setText("* Nombre:");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 80, 30));

        jLabel19.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(51, 51, 51));
        jLabel19.setText("* Direccion:");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 90, 30));

        jLabel20.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(51, 51, 51));
        jLabel20.setText("* Codigo:");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 70, 30));

        jLabel21.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(51, 51, 51));
        jLabel21.setText("* Telefono1:");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, 90, 30));

        jLabel22.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(51, 51, 51));
        jLabel22.setText("  Horario:");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 320, 70, 30));

        jLabel23.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(51, 51, 51));
        jLabel23.setText("  Telefono2:");
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 240, 90, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FondoNuevaTienda.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 410));

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

    private void nombretxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombretxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombretxtActionPerformed

    private void nombretxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nombretxtMouseClicked

    }//GEN-LAST:event_nombretxtMouseClicked

    private void direcciontxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_direcciontxtMouseClicked

    }//GEN-LAST:event_direcciontxtMouseClicked

    private void correotxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_correotxtMouseClicked

    }//GEN-LAST:event_correotxtMouseClicked

    private void codigotxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_codigotxtMouseClicked

    }//GEN-LAST:event_codigotxtMouseClicked

    private void correotxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_correotxtKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_correotxtKeyTyped

    private void telefono1txtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_telefono1txtMouseClicked

    }//GEN-LAST:event_telefono1txtMouseClicked

    private void telefono1txtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_telefono1txtKeyTyped
         char c = evt.getKeyChar();
        if(c<'0' || c>'9') evt.consume();
        if (telefono1txt.getText().length()== 13) evt.consume();
    }//GEN-LAST:event_telefono1txtKeyTyped

    private void correotxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_correotxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_correotxtActionPerformed

    private void telefono2txtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_telefono2txtMouseClicked

    }//GEN-LAST:event_telefono2txtMouseClicked

    private void telefono2txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telefono2txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telefono2txtActionPerformed

    private void telefono2txtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_telefono2txtKeyTyped
       char c = evt.getKeyChar();
        if(c<'0' || c>'9') evt.consume();
        if (telefono2txt.getText().length()== 13) evt.consume();
    }//GEN-LAST:event_telefono2txtKeyTyped

    private void horariotxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_horariotxtMouseClicked

    }//GEN-LAST:event_horariotxtMouseClicked

    private void horariotxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_horariotxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_horariotxtActionPerformed

    private void horariotxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_horariotxtKeyTyped
      
    }//GEN-LAST:event_horariotxtKeyTyped

    /**
     * Insertar Tienda en la base de datos comprobando todos los datos correspondientes
     * @param evt 
     */
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (nombretxt.getText().length() == 0 || direcciontxt.getText().length() == 0 || codigotxt.getText().length() == 0 || telefono1txt.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Por favor llene los primeros 4 campos");
        }
        else{
            String nombre=nombretxt.getText();
            String direccion=direcciontxt.getText();
            String codigo=codigotxt.getText();
            String telefono1=telefono1txt.getText();
            String telefono2=telefono2txt.getText();
            String correo= correotxt.getText();
            String horario=horariotxt.getText();
            String query = ("INSERT INTO TIENDA VALUES('"+codigo+"','"+nombre+"','"+direccion+"','"+telefono1+"','"+telefono2+"','"+correo+"','"+horario+"')");
            Main.conexion.Insert(query);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void nombretxtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nombretxtFocusGained

    }//GEN-LAST:event_nombretxtFocusGained

    private void nombretxtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nombretxtFocusLost

    }//GEN-LAST:event_nombretxtFocusLost

    private void direcciontxtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_direcciontxtFocusGained

    }//GEN-LAST:event_direcciontxtFocusGained

    private void direcciontxtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_direcciontxtFocusLost

    }//GEN-LAST:event_direcciontxtFocusLost

    private void codigotxtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_codigotxtFocusGained

    }//GEN-LAST:event_codigotxtFocusGained

    private void codigotxtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_codigotxtFocusLost

    }//GEN-LAST:event_codigotxtFocusLost

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
            java.util.logging.Logger.getLogger(CrearTienda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CrearTienda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CrearTienda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CrearTienda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CrearTienda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField codigotxt;
    private javax.swing.JTextField correotxt;
    private javax.swing.JTextField direcciontxt;
    private javax.swing.JTextField horariotxt;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nombretxt;
    private javax.swing.JTextField telefono1txt;
    private javax.swing.JTextField telefono2txt;
    // End of variables declaration//GEN-END:variables
}
