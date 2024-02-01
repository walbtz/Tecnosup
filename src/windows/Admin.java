/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package windows;

import java.awt.Image;
import java.awt.Toolkit;

/**
 *
 * @author Walter Benítez
 */
public class Admin extends javax.swing.JFrame {

    /**
     * Creates new form Admin
     */
    public Admin() {
        initComponents();
        getContentPane().setBackground(new java.awt.Color(20, 34, 34));
        setSize(650, 430);
        setResizable(false);
        setTitle("Administrador");
        setLocationRelativeTo(null);
    }
    
    @Override
    public Image getIconImage(){
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("images/icon.png"));
        return retValue;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label_name_user = new javax.swing.JLabel();
        boton_registrar = new javax.swing.JButton();
        boton_gestion_user = new javax.swing.JButton();
        boton_provisorio = new javax.swing.JButton();
        boton_receptor = new javax.swing.JButton();
        boton_tecnico = new javax.swing.JButton();
        boton_info = new javax.swing.JButton();
        boton_exit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label_name_user.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        label_name_user.setForeground(new java.awt.Color(255, 255, 255));
        label_name_user.setText("jLabel1");
        getContentPane().add(label_name_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));
        getContentPane().add(boton_registrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, 128, 128));
        getContentPane().add(boton_gestion_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 80, 128, 128));
        getContentPane().add(boton_provisorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 80, 128, 128));
        getContentPane().add(boton_receptor, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, 128, 128));
        getContentPane().add(boton_tecnico, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 250, 128, 128));
        getContentPane().add(boton_info, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 250, 128, 128));

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
        getContentPane().add(boton_exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(619, -1, 32, 32));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boton_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_exitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_boton_exitActionPerformed

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
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton_exit;
    private javax.swing.JButton boton_gestion_user;
    private javax.swing.JButton boton_info;
    private javax.swing.JButton boton_provisorio;
    private javax.swing.JButton boton_receptor;
    private javax.swing.JButton boton_registrar;
    private javax.swing.JButton boton_tecnico;
    private javax.swing.JLabel label_name_user;
    // End of variables declaration//GEN-END:variables
}
