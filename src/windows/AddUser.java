/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package windows;

import java.sql.*;
import classes.Conexion;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.WindowConstants;

/**
 *
 * @author Walter Benítez
 */
public class AddUser extends javax.swing.JFrame {
    /**
     * Creates new form Admin
     */
    public AddUser() {
        initComponents();
        getContentPane().setBackground(new java.awt.Color(20, 34, 34));
        setSize(650, 430);
        setResizable(false);
        setTitle("Tecnosup - Agregar usuario");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
        //AGREGO AQUÍ LOS CAMPOS PARA COMPLETAR EN MODO IMAGEN PNG
        ImageIcon img_fields = new ImageIcon("src/images/add_user_field.png");
        Icon icon_fields = new ImageIcon(img_fields.getImage().getScaledInstance(label_fields.getWidth(), label_fields.getHeight(), Image.SCALE_DEFAULT));
        label_fields.setIcon(icon_fields);
        this.repaint();
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

        label_ref = new javax.swing.JLabel();
        boton_exit = new javax.swing.JButton();
        label_fields = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label_ref.setForeground(new java.awt.Color(204, 204, 204));
        label_ref.setText("Software creado por Walter Eduardo Benítez ©");
        getContentPane().add(label_ref, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 405, -1, -1));

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
        getContentPane().add(label_fields, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 430));

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
            java.util.logging.Logger.getLogger(AddUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton_exit;
    private javax.swing.JLabel label_fields;
    private javax.swing.JLabel label_ref;
    // End of variables declaration//GEN-END:variables
}