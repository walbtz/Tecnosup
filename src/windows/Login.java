/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package windows;

import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.sql.*;
import classes.Conexion;
import javax.swing.JOptionPane;

/**
 *
 * @author Walter Benítez
 */
public class Login extends javax.swing.JFrame {
    
    public static String user = "";
    public static String pass = "";

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

        boton_ini = new javax.swing.JButton();
        boton_exit = new javax.swing.JButton();
        txt_user = new javax.swing.JTextField();
        txt_pass = new javax.swing.JPasswordField();
        label_log = new javax.swing.JLabel();
        label_main_icon = new javax.swing.JLabel();
        label_ref = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
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
        getContentPane().add(boton_exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(369, -2, 32, 32));

        txt_user.setBackground(new java.awt.Color(20, 34, 34));
        txt_user.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        txt_user.setForeground(new java.awt.Color(255, 255, 255));
        txt_user.setBorder(null);
        txt_user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_userActionPerformed(evt);
            }
        });
        getContentPane().add(txt_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 329, 170, 30));

        txt_pass.setBackground(new java.awt.Color(20, 34, 34));
        txt_pass.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        txt_pass.setForeground(new java.awt.Color(255, 255, 255));
        txt_pass.setBorder(null);
        txt_pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_passActionPerformed(evt);
            }
        });
        getContentPane().add(txt_pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 375, 170, 30));
        getContentPane().add(label_log, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 260, 230, 150));
        getContentPane().add(label_main_icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 200, 200));

        label_ref.setForeground(new java.awt.Color(255, 255, 255));
        label_ref.setText("Software creado por Walter Eduardo Benítez ©");
        getContentPane().add(label_ref, new org.netbeans.lib.awtextra.AbsoluteConstraints(74, 520, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boton_iniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_iniActionPerformed
        
        //RECUPERACIÓN DE LOS DATOS USUARIO Y CONTRASEÑA EN LAS VARIABLES ESTÁTICAS USER Y PASS.
        user = txt_user.getText().trim();
        pass = txt_pass.getText().trim();
        
        //VALIDACIÓN DE DATOS DE LOS CAMPOS USUARIO Y CONTRASEÑA.
        if(user.equals("") && pass.equals("")){
            JOptionPane.showMessageDialog(null, "Complete todos los campos");
        } else if(user.equals("")){
            JOptionPane.showMessageDialog(null, "Complete el campo de USUARIO");
        } else if(pass.equals("")){
            JOptionPane.showMessageDialog(null, "Complete el campo de CONTRASEÑA");
        } else if((user.length() < 4 || user.length() > 20) && (pass.length() < 4 || pass.length() > 20)){
            JOptionPane.showMessageDialog(null, "Longitud de USUARIO y CONTRASEÑA incorrectos (4 a 20 carácteres)");
        } else if(user.length() < 4 || user.length() > 20){
            JOptionPane.showMessageDialog(null, "Longitud de USUARIO incorrecto (4 a 20 carácteres)");
        } else if(pass.length() < 4 || pass.length() > 20){
            JOptionPane.showMessageDialog(null, "Longitud de CONTRASEÑA incorrecto (4 a 20 carácteres)");
        } else{
            try {
                Connection cn = Conexion.connect();
                PreparedStatement pst = cn.prepareStatement("select level, status, username, password from users where username = '" + user + "' and password = '" + pass + "'");
                
                ResultSet rs = pst.executeQuery();
                
                if(rs.next()){
                    String level = rs.getString("level");
                    String status = rs.getString("status");
                    
                    if(level.equalsIgnoreCase("ADM") && status.equalsIgnoreCase("active")){
                        new Admin().setVisible(true);
                        dispose();
                    } else if(level.equalsIgnoreCase("REC") && status.equalsIgnoreCase("active")){
                        new Receptor().setVisible(true);
                        dispose();
                    } else if(level.equalsIgnoreCase("TEC") && status.equalsIgnoreCase("active")){
                        new Tecnico().setVisible(true);
                        dispose();
                    }
                } else{
                    JOptionPane.showMessageDialog(null, "Datos de acceso incorrectos");
                    txt_user.setText("");
                    txt_pass.setText("");
                }
                
            } catch (SQLException e) {
                System.err.println("Error en el botón de INICIAR " + e);
                JOptionPane.showMessageDialog(null, "Error al iniciar sesión, contacte al administrador");
            }
        }
        
    }//GEN-LAST:event_boton_iniActionPerformed

    private void boton_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_exitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_boton_exitActionPerformed

    private void txt_userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_userActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_userActionPerformed

    private void txt_passActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_passActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_passActionPerformed

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
    private javax.swing.JLabel label_log;
    private javax.swing.JLabel label_main_icon;
    private javax.swing.JLabel label_ref;
    private javax.swing.JPasswordField txt_pass;
    private javax.swing.JTextField txt_user;
    // End of variables declaration//GEN-END:variables
}
