/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package windows;

import classes.Utilidades;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.WindowConstants;
import java.sql.*;
import javax.swing.JOptionPane;
import classes.CustomComboBoxUI;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Walter Benítez
 */
public class AddUser extends javax.swing.JFrame {

    /**
     * Creates new form Admin
     */
    public AddUser() throws NoSuchFieldException, IllegalArgumentException, IllegalAccessException {
        initComponents();
        combo_rol.setUI(new CustomComboBoxUI());
        Utilidades.actualizarIconBotonComboBox(combo_rol);
        getContentPane().setBackground(new java.awt.Color(20, 34, 34));
        setSize(650, 430);
        setResizable(false);
        setTitle("Tecnosup - Agregar usuario");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        //AGREGO AQUÍ LAS LÍNEAS DE LOS CAMPOS
        Utilidades.colocarImagen("src/images/add_user_field.png", label_fields);
        this.repaint();

        //ACTUALIZACIÓN DE LABELS CUANDO SE ESCRIBE ALGO EN LOS CAMPOS Y CUANDO SE DEJA EN BLANCO LOS MISMOS
        Utilidades.actualizarLabel(txt_name, label_name, "NOMBRE");
        Utilidades.actualizarLabel(txt_last_name, label_last_name, "APELLIDO");
        Utilidades.actualizarLabel(txt_phone, label_phone, "TELÉFONO");
        Utilidades.actualizarLabel(txt_mail, label_mail, "CORREO ELECTRÓNICO");
        Utilidades.actualizarLabel(txt_user, label_user, "USUARIO");
        Utilidades.actualizarLabel(txt_pass, label_pass, "CONTRASEÑA");

        //ACTUALIZACIÓN DE ICONO DE VALIDACION SI EL USUARIO YA SE ENCUENTRA EN LA BASE DE DATOS
        Utilidades.verificarUsuario(txt_user, label_user_ver);

        //CAMBIO DE ICONO VALIDACIÓN PARA TODOS LOS CAMPOS
        Utilidades.verificarCampo(txt_name, label_name_ver, 3, 20, false);
        Utilidades.verificarCampo(txt_last_name, label_last_name_ver, 3, 20, false);
        Utilidades.verificarCampo(txt_phone, label_phone_ver, 10, 13, false);
        Utilidades.verificarCampo(txt_mail, label_mail_ver, 6, 30, true);
        Utilidades.verificarCampo(txt_user, label_user_ver, 3, 20, false);
        Utilidades.verificarCampo(txt_pass, label_pass_ver, 4, 20, false);
    }

    //PONEMOS UN ICONO PERSONALIZADO A NUESTRO JFRAME
    @Override
    public Image getIconImage() {
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

        label_name = new javax.swing.JLabel();
        label_name_ver = new javax.swing.JLabel();
        txt_name = new javax.swing.JTextField();
        label_last_name = new javax.swing.JLabel();
        label_last_name_ver = new javax.swing.JLabel();
        txt_last_name = new javax.swing.JTextField();
        label_phone = new javax.swing.JLabel();
        label_phone_ver = new javax.swing.JLabel();
        txt_phone = new javax.swing.JTextField();
        label_mail = new javax.swing.JLabel();
        label_mail_ver = new javax.swing.JLabel();
        txt_mail = new javax.swing.JTextField();
        label_user = new javax.swing.JLabel();
        label_user_ver = new javax.swing.JLabel();
        txt_user = new javax.swing.JTextField();
        label_pass = new javax.swing.JLabel();
        label_pass_ver = new javax.swing.JLabel();
        txt_pass = new javax.swing.JTextField();
        label_rango = new javax.swing.JLabel();
        label_ref = new javax.swing.JLabel();
        boton_atras = new javax.swing.JButton();
        boton_save = new javax.swing.JButton();
        combo_rol = new javax.swing.JComboBox<>();
        boton_exit = new javax.swing.JButton();
        label_fields = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label_name.setForeground(new java.awt.Color(204, 204, 204));
        label_name.setText("NOMBRE");
        getContentPane().add(label_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 98, -1, -1));

        label_name_ver.setForeground(new java.awt.Color(204, 204, 204));
        getContentPane().add(label_name_ver, new org.netbeans.lib.awtextra.AbsoluteConstraints(283, 96, 20, 20));

        txt_name.setBackground(new java.awt.Color(20, 34, 34));
        txt_name.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        txt_name.setForeground(new java.awt.Color(255, 255, 255));
        txt_name.setBorder(null);
        txt_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nameActionPerformed(evt);
            }
        });
        getContentPane().add(txt_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 92, 247, 30));

        label_last_name.setForeground(new java.awt.Color(204, 204, 204));
        label_last_name.setText("APELLIDO");
        getContentPane().add(label_last_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(349, 98, -1, -1));

        label_last_name_ver.setForeground(new java.awt.Color(204, 204, 204));
        getContentPane().add(label_last_name_ver, new org.netbeans.lib.awtextra.AbsoluteConstraints(597, 96, 20, 20));

        txt_last_name.setBackground(new java.awt.Color(20, 34, 34));
        txt_last_name.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        txt_last_name.setForeground(new java.awt.Color(255, 255, 255));
        txt_last_name.setBorder(null);
        txt_last_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_last_nameActionPerformed(evt);
            }
        });
        getContentPane().add(txt_last_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(349, 92, 247, 30));

        label_phone.setForeground(new java.awt.Color(204, 204, 204));
        label_phone.setText("TELÉFONO");
        getContentPane().add(label_phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 171, -1, -1));

        label_phone_ver.setForeground(new java.awt.Color(204, 204, 204));
        getContentPane().add(label_phone_ver, new org.netbeans.lib.awtextra.AbsoluteConstraints(283, 169, 20, 20));

        txt_phone.setBackground(new java.awt.Color(20, 34, 34));
        txt_phone.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        txt_phone.setForeground(new java.awt.Color(255, 255, 255));
        txt_phone.setBorder(null);
        txt_phone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_phoneActionPerformed(evt);
            }
        });
        getContentPane().add(txt_phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 165, 247, 30));

        label_mail.setForeground(new java.awt.Color(204, 204, 204));
        label_mail.setText("CORREO ELECTRÓNICO");
        getContentPane().add(label_mail, new org.netbeans.lib.awtextra.AbsoluteConstraints(349, 171, -1, -1));

        label_mail_ver.setForeground(new java.awt.Color(204, 204, 204));
        getContentPane().add(label_mail_ver, new org.netbeans.lib.awtextra.AbsoluteConstraints(597, 169, 20, 20));

        txt_mail.setBackground(new java.awt.Color(20, 34, 34));
        txt_mail.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        txt_mail.setForeground(new java.awt.Color(255, 255, 255));
        txt_mail.setBorder(null);
        txt_mail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_mailActionPerformed(evt);
            }
        });
        getContentPane().add(txt_mail, new org.netbeans.lib.awtextra.AbsoluteConstraints(349, 165, 247, 30));

        label_user.setForeground(new java.awt.Color(204, 204, 204));
        label_user.setText("USUARIO");
        getContentPane().add(label_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 243, -1, -1));

        label_user_ver.setForeground(new java.awt.Color(204, 204, 204));
        getContentPane().add(label_user_ver, new org.netbeans.lib.awtextra.AbsoluteConstraints(283, 242, 20, 20));

        txt_user.setBackground(new java.awt.Color(20, 34, 34));
        txt_user.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        txt_user.setForeground(new java.awt.Color(255, 255, 255));
        txt_user.setBorder(null);
        txt_user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_userActionPerformed(evt);
            }
        });
        getContentPane().add(txt_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 237, 247, 30));

        label_pass.setForeground(new java.awt.Color(204, 204, 204));
        label_pass.setText("CONTRASEÑA");
        getContentPane().add(label_pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(349, 243, -1, -1));

        label_pass_ver.setForeground(new java.awt.Color(204, 204, 204));
        getContentPane().add(label_pass_ver, new org.netbeans.lib.awtextra.AbsoluteConstraints(597, 242, 20, 20));

        txt_pass.setBackground(new java.awt.Color(20, 34, 34));
        txt_pass.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        txt_pass.setForeground(new java.awt.Color(255, 255, 255));
        txt_pass.setBorder(null);
        txt_pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_passActionPerformed(evt);
            }
        });
        getContentPane().add(txt_pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(349, 237, 247, 30));

        label_rango.setForeground(new java.awt.Color(204, 204, 204));
        label_rango.setText("RANGO USUARIO:");
        getContentPane().add(label_rango, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 340, -1, -1));

        label_ref.setForeground(new java.awt.Color(204, 204, 204));
        label_ref.setText("Software creado por Walter Eduardo Benítez ©");
        getContentPane().add(label_ref, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 405, -1, -1));

        boton_atras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/atras.png"))); // NOI18N
        boton_atras.setBorderPainted(false);
        boton_atras.setContentAreaFilled(false);
        boton_atras.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/atras_select.png"))); // NOI18N
        boton_atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_atrasActionPerformed(evt);
            }
        });
        getContentPane().add(boton_atras, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 28, 50, 50));

        boton_save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/save.png"))); // NOI18N
        boton_save.setBorderPainted(false);
        boton_save.setContentAreaFilled(false);
        boton_save.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/save_press.png"))); // NOI18N
        boton_save.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/save_select.png"))); // NOI18N
        boton_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_saveActionPerformed(evt);
            }
        });
        getContentPane().add(boton_save, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 303, 90, 90));

        combo_rol.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        combo_rol.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ADMINISTRADOR", "RECEPTOR", "TÉCNICO" }));
        getContentPane().add(combo_rol, new org.netbeans.lib.awtextra.AbsoluteConstraints(142, 333, 159, 30));

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

    private void txt_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nameActionPerformed

    }//GEN-LAST:event_txt_nameActionPerformed

    private void txt_last_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_last_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_last_nameActionPerformed

    private void txt_phoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_phoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_phoneActionPerformed

    private void txt_mailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_mailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_mailActionPerformed

    private void txt_userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_userActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_userActionPerformed

    private void txt_passActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_passActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_passActionPerformed

    private void boton_atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_atrasActionPerformed
        new Admin().setVisible(true);
        dispose();
    }//GEN-LAST:event_boton_atrasActionPerformed

    private void boton_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_saveActionPerformed
        int i = 0;

        //ACTUALIZACIÓN DE ICONO DE VALIDACION DE CAMPO DE TEXTO
        if (txt_name.getText().trim().equals("")) {
            Utilidades.colocarImagen("src/images/warn_20x20.png", label_name_ver);
            i++;
        }

        if (txt_last_name.getText().trim().equals("")) {
            Utilidades.colocarImagen("src/images/warn_20x20.png", label_last_name_ver);
            i++;
        }

        if (txt_phone.getText().trim().equals("")) {
            Utilidades.colocarImagen("src/images/warn_20x20.png", label_phone_ver);
            i++;
        }

        if (txt_mail.getText().trim().equals("")) {
            Utilidades.colocarImagen("src/images/warn_20x20.png", label_mail_ver);
            i++;
        }

        if (txt_user.getText().trim().equals("")) {
            Utilidades.colocarImagen("src/images/warn_20x20.png", label_user_ver);
            i++;
        }

        if (txt_pass.getText().trim().equals("")) {
            Utilidades.colocarImagen("src/images/warn_20x20.png", label_pass_ver);
            i++;
        }

        //VERIFICACIÓN DE DATOS VÁLIDOS POR CADA CAMPO Y AVISO AL USUARIO DE ACUERDO AL ERROR
        if (i == 0) {

        } else {
            JOptionPane.showMessageDialog(null, "Debe completar todos los campos");
            i = 0;
        }
    }//GEN-LAST:event_boton_saveActionPerformed

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
                try {
                    new AddUser().setVisible(true);
                } catch (NoSuchFieldException | IllegalArgumentException | IllegalAccessException ex) {
                    Logger.getLogger(AddUser.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton_atras;
    private javax.swing.JButton boton_exit;
    private javax.swing.JButton boton_save;
    private javax.swing.JComboBox<String> combo_rol;
    private javax.swing.JLabel label_fields;
    private javax.swing.JLabel label_last_name;
    private javax.swing.JLabel label_last_name_ver;
    private javax.swing.JLabel label_mail;
    private javax.swing.JLabel label_mail_ver;
    private javax.swing.JLabel label_name;
    private javax.swing.JLabel label_name_ver;
    private javax.swing.JLabel label_pass;
    private javax.swing.JLabel label_pass_ver;
    private javax.swing.JLabel label_phone;
    private javax.swing.JLabel label_phone_ver;
    private javax.swing.JLabel label_rango;
    private javax.swing.JLabel label_ref;
    private javax.swing.JLabel label_user;
    private javax.swing.JLabel label_user_ver;
    private javax.swing.JTextField txt_last_name;
    private javax.swing.JTextField txt_mail;
    private javax.swing.JTextField txt_name;
    private javax.swing.JTextField txt_pass;
    private javax.swing.JTextField txt_phone;
    private javax.swing.JTextField txt_user;
    // End of variables declaration//GEN-END:variables
}
