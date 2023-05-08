/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package bookreview;

import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author Lenovo
 */
public class Register extends javax.swing.JFrame {

    /**
     * Creates new form register
     */
    public Register() {
        initComponents();
        txtFirstName.setBackground(new java.awt.Color(0,0,0,1));
        txtLastName.setBackground(new java.awt.Color(0,0,0,1));
        txtusername.setBackground(new java.awt.Color(0,0,0,1));
        txtpassword.setBackground(new java.awt.Color(0,0,0,1));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        lblSignUp = new javax.swing.JLabel();
        lblSubTitle = new javax.swing.JLabel();
        txtFirstName = new javax.swing.JTextField();
        lblFirstNameUnderscore = new javax.swing.JLabel();
        lblFirstName = new javax.swing.JLabel();
        txtLastName = new javax.swing.JTextField();
        lblLastName = new javax.swing.JLabel();
        lblUnderscore2 = new javax.swing.JLabel();
        txtusername = new javax.swing.JTextField();
        lblUsername = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtpassword = new javax.swing.JPasswordField();
        lblPassword = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lblAlreadyHaveAnAccount = new javax.swing.JLabel();
        lblLogin = new javax.swing.JLabel();
        disable = new javax.swing.JLabel();
        show = new javax.swing.JLabel();
        btnRegister = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(25, 118, 211));
        setUndecorated(true);
        addWindowStateListener(new java.awt.event.WindowStateListener() {
            public void windowStateChanged(java.awt.event.WindowEvent evt) {
                formWindowStateChanged(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(25, 118, 211));
        jPanel2.setForeground(new java.awt.Color(25, 118, 211));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblSignUp.setFont(new java.awt.Font("Segoe UI", 0, 32)); // NOI18N
        lblSignUp.setForeground(new java.awt.Color(255, 255, 255));
        lblSignUp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSignUp.setText("Sign Up");
        jPanel2.add(lblSignUp, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 54, 410, 41));

        lblSubTitle.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        lblSubTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblSubTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSubTitle.setText("Read, rate, and review your favorite books");
        jPanel2.add(lblSubTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 101, 410, -1));

        txtFirstName.setFont(txtFirstName.getFont().deriveFont(txtFirstName.getFont().getSize()+2f));
        txtFirstName.setForeground(new java.awt.Color(255, 255, 255));
        txtFirstName.setBorder(null);
        jPanel2.add(txtFirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 164, 240, 30));

        lblFirstNameUnderscore.setForeground(new java.awt.Color(255, 255, 255));
        lblFirstNameUnderscore.setText("_________________________________________");
        jPanel2.add(lblFirstNameUnderscore, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 171, 290, 39));

        lblFirstName.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        lblFirstName.setForeground(new java.awt.Color(199, 226, 255));
        lblFirstName.setText("First Name");
        jPanel2.add(lblFirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 147, 245, -1));

        txtLastName.setFont(txtLastName.getFont().deriveFont(txtLastName.getFont().getSize()+2f));
        txtLastName.setForeground(new java.awt.Color(255, 255, 255));
        txtLastName.setBorder(null);
        jPanel2.add(txtLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 245, 240, 30));

        lblLastName.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        lblLastName.setForeground(new java.awt.Color(199, 226, 255));
        lblLastName.setText("Last Name");
        jPanel2.add(lblLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 228, 245, -1));

        lblUnderscore2.setForeground(new java.awt.Color(255, 255, 255));
        lblUnderscore2.setText("_________________________________________");
        jPanel2.add(lblUnderscore2, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 252, 290, 39));

        txtusername.setFont(txtusername.getFont().deriveFont(txtusername.getFont().getSize()+2f));
        txtusername.setForeground(new java.awt.Color(255, 255, 255));
        txtusername.setBorder(null);
        jPanel2.add(txtusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 326, 240, 30));

        lblUsername.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        lblUsername.setForeground(new java.awt.Color(199, 226, 255));
        lblUsername.setText("Username");
        jPanel2.add(lblUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 309, 245, -1));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("_________________________________________");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 333, 290, 39));

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_user_20px_1.png"))); // NOI18N
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(348, 326, 40, 39));

        txtpassword.setFont(txtpassword.getFont().deriveFont(txtpassword.getFont().getSize()+2f));
        txtpassword.setForeground(new java.awt.Color(255, 255, 255));
        txtpassword.setBorder(null);
        txtpassword.setCaretColor(new java.awt.Color(255, 255, 255));
        txtpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpasswordActionPerformed(evt);
            }
        });
        jPanel2.add(txtpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 408, 240, 30));

        lblPassword.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        lblPassword.setForeground(new java.awt.Color(199, 226, 255));
        lblPassword.setText("Password");
        jPanel2.add(lblPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 390, 341, -1));

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("_________________________________________");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 414, 290, 40));

        lblAlreadyHaveAnAccount.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        lblAlreadyHaveAnAccount.setForeground(new java.awt.Color(199, 226, 255));
        lblAlreadyHaveAnAccount.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblAlreadyHaveAnAccount.setText("Already have an account?");
        jPanel2.add(lblAlreadyHaveAnAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 544, 213, -1));

        lblLogin.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        lblLogin.setForeground(new java.awt.Color(255, 255, 255));
        lblLogin.setText("Log in");
        lblLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLoginMouseClicked(evt);
            }
        });
        lblLogin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                lblLoginKeyPressed(evt);
            }
        });
        jPanel2.add(lblLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(253, 544, 122, -1));

        disable.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        disable.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_invisible_20px_1.png"))); // NOI18N
        disable.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        disable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                disableMouseClicked(evt);
            }
        });
        jPanel2.add(disable, new org.netbeans.lib.awtextra.AbsoluteConstraints(348, 414, 40, 40));

        show.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        show.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_eye_20px_1.png"))); // NOI18N
        show.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        show.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                showMouseClicked(evt);
            }
        });
        jPanel2.add(show, new org.netbeans.lib.awtextra.AbsoluteConstraints(348, 414, 40, 40));

        btnRegister.setBackground(new java.awt.Color(255, 255, 255));
        btnRegister.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnRegister.setForeground(new java.awt.Color(25, 118, 211));
        btnRegister.setText("Register");
        btnRegister.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });
        jPanel2.add(btnRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 472, 341, 40));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("X");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel2MouseExited(evt);
            }
        });
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 0, 40, 29));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblLoginKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lblLoginKeyPressed
        // TODO add your handling code here:
        Login login = new Login();
        login.setLocationRelativeTo(null);
        login.setVisible(true);
    }//GEN-LAST:event_lblLoginKeyPressed
    
    private void txtpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpasswordActionPerformed

    private void disableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_disableMouseClicked
        txtpassword.setEchoChar((char)0);
        disable.setVisible(false);
        disable.setEnabled(false);
        show.setEnabled(true);
        show.setEnabled(true);
    }//GEN-LAST:event_disableMouseClicked

    private void showMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showMouseClicked
        txtpassword.setEchoChar((char)8226);
        disable.setVisible(true);
        disable.setEnabled(true);
        show.setEnabled(false);
        show.setEnabled(false);
    }//GEN-LAST:event_showMouseClicked

    private void formWindowStateChanged(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowStateChanged
        // TODO add your handling code here:
        setUndecorated(true);
        for (double i = 0.0; i <=1.0; i = i+0.1){
            String val = i+ "";
            float f = Float.valueOf(val);
            this.setOpacity(f);
            try{
                Thread.sleep(50);
            }catch(Exception e){
                
            }
        }
    }//GEN-LAST:event_formWindowStateChanged

    private void lblLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLoginMouseClicked
        // TODO add your handling code here:
        Login log = new Login();
        log.setLocationRelativeTo(null);
        log.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblLoginMouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        // TODO add your handling code here:
        Connect conn = new Connect();
        txtpassword.setEchoChar((char)8226);
        String password = String.valueOf(txtpassword.getPassword());
        User user = new User(txtFirstName.getText(), txtLastName.getText(), txtusername.getText(), password);
        boolean success = conn.registerUser(user);
        if(success) {
            JOptionPane.showMessageDialog(rootPane, "User successfully added!");
            this.dispose();
            Login log = new Login();
            log.setLocationRelativeTo(null);
            log.setVisible(true);
        }
    }//GEN-LAST:event_btnRegisterActionPerformed

    private void jLabel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseEntered
        // TODO add your handling code here:
        jLabel2.setForeground(new Color(51,51,51));
    }//GEN-LAST:event_jLabel2MouseEntered

    private void jLabel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseExited
        // TODO add your handling code here:
        jLabel2.setForeground(Color.WHITE);
    }//GEN-LAST:event_jLabel2MouseExited

    
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
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegister;
    private javax.swing.JLabel disable;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblAlreadyHaveAnAccount;
    private javax.swing.JLabel lblFirstName;
    private javax.swing.JLabel lblFirstNameUnderscore;
    private javax.swing.JLabel lblLastName;
    private javax.swing.JLabel lblLogin;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblSignUp;
    private javax.swing.JLabel lblSubTitle;
    private javax.swing.JLabel lblUnderscore2;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JLabel show;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JPasswordField txtpassword;
    private javax.swing.JTextField txtusername;
    // End of variables declaration//GEN-END:variables
}
