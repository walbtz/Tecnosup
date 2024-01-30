/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package windows;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author Walter Benítez
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        getContentPane().setBackground(new java.awt.Color(20, 34, 34));
        setSize(400, 550);
        setResizable(false);
        setTitle("Acceso");
        setLocationRelativeTo(null);
        
        //ICONO DE LA PANTALLA PRINCIPAL
        ImageIcon img_ic = new ImageIcon("src/images/main_icon.png");
        Icon icon_ic = new ImageIcon(img_ic.getImage().getScaledInstance(label_main_icon.getWidth(), label_main_icon.getHeight(), Image.SCALE_DEFAULT));
        label_main_icon.setIcon(icon_ic);
        this.repaint();
        
        //ICONO DE LOG
        ImageIcon img_log = new ImageIcon("src/images/log.png");
        Icon icon_log = new ImageIcon(img_log.getImage().getScaledInstance(label_log.getWidth(), label_log.getHeight(), Image.SCALE_DEFAULT));
        label_log.setIcon(icon_log);
        this.repaint();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        boton_ini = new javax.swing.JButton();
        boton_exit = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        label_log = new javax.swing.JLabel();
        label_main_icon = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        boton_ini.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/boton_ini.png"))); // NOI18N
        boton_ini.setBorderPainted(false);
        boton_ini.setContentAreaFilled(false);
        boton_ini.setMaximumSize(new java.awt.Dimension(220, 50));
        boton_ini.setMinimumSize(new java.awt.Dimension(220, 50));
        boton_ini.setPreferredSize(new java.awt.Dimension(220, 50));
        boton_ini.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/boton_ini_press.png"))); // NOI18N
        boton_ini.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/boton_ini_select.png"))); // NOI18N
        boton_ini.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_iniActionPerformed(evt);
            }
        });
        getContentPane().add(boton_ini, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 440, 220, 50));

        boton_exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/close.png"))); // NOI18N
        boton_exit.setBorder(null);
        boton_exit.setBorderPainted(false);
        boton_exit.setContentAreaFilled(false);
        boton_exit.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/close_selected.png"))); // NOI18N
        boton_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_exitActionPerformed(evt);
            }
        });
        getContentPane().add(boton_exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 8, 32, 32));

        jTextField1.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jTextField1.setOpaque(false);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 328, 170, 30));

        jPasswordField1.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        getContentPane().add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 375, 170, 30));
        getContentPane().add(label_log, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 260, 230, 150));
        getContentPane().add(label_main_icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 200, 200));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boton_iniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_iniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton_iniActionPerformed

    private void boton_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_exitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_boton_exitActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton_exit;
    private javax.swing.JButton boton_ini;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel label_log;
    private javax.swing.JLabel label_main_icon;
    // End of variables declaration//GEN-END:variables
}
