/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package bookreview;
import bookreview.admin.*;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.*;

/**
 *
 * @author Lenovo
 */
public class Dashboard extends javax.swing.JFrame {

    /**
     * Creates new form Dash
     */
    public Dashboard() {
        initComponents();
        setLocationRelativeTo(null);
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
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        rSButton2 = new rojeru_san.RSButton();
        btnOverview = new rojeru_san.RSButton();
        btnSettings = new rojeru_san.RSButton();
        btnUsers = new rojeru_san.RSButton();
        btnModerator = new rojeru_san.RSButton();
        btnBook = new rojeru_san.RSButton();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(25, 118, 211));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
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

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_user_32px.png"))); // NOI18N
        jLabel1.setText("Hello, Admin!");

        jLabel3.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_book_reading_64px.png"))); // NOI18N
        jLabel3.setText("Admin Dashboard");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 810, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(58, 58, 58))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56)))
                .addGap(0, 15, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 100));

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rSButton2.setBackground(new java.awt.Color(51, 51, 51));
        rSButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_Logout_32px.png"))); // NOI18N
        rSButton2.setText("Logout");
        rSButton2.setFont(new java.awt.Font("Roboto Bold", 1, 18)); // NOI18N
        rSButton2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        rSButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(rSButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 542, 160, 50));

        btnOverview.setBackground(new java.awt.Color(51, 51, 51));
        btnOverview.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_overview_26px.png"))); // NOI18N
        btnOverview.setText("Overview");
        btnOverview.setFont(new java.awt.Font("Roboto Bold", 1, 18)); // NOI18N
        btnOverview.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnOverview.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOverviewActionPerformed(evt);
            }
        });
        jPanel2.add(btnOverview, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 160, 50));

        btnSettings.setBackground(new java.awt.Color(51, 51, 51));
        btnSettings.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_settings_32px.png"))); // NOI18N
        btnSettings.setText("Settings");
        btnSettings.setFont(new java.awt.Font("Roboto Bold", 1, 18)); // NOI18N
        btnSettings.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnSettings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSettingsActionPerformed(evt);
            }
        });
        jPanel2.add(btnSettings, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 160, 50));

        btnUsers.setBackground(new java.awt.Color(51, 51, 51));
        btnUsers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_member_32px.png"))); // NOI18N
        btnUsers.setText("Users");
        btnUsers.setFont(new java.awt.Font("Roboto Bold", 1, 18)); // NOI18N
        btnUsers.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnUsers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsersActionPerformed(evt);
            }
        });
        jPanel2.add(btnUsers, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 160, 50));

        btnModerator.setBackground(new java.awt.Color(51, 51, 51));
        btnModerator.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_protect_32px.png"))); // NOI18N
        btnModerator.setText("Moderators");
        btnModerator.setFont(new java.awt.Font("Roboto Bold", 1, 16)); // NOI18N
        btnModerator.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnModerator.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModeratorActionPerformed(evt);
            }
        });
        jPanel2.add(btnModerator, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 160, 50));

        btnBook.setBackground(new java.awt.Color(51, 51, 51));
        btnBook.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_book_32px.png"))); // NOI18N
        btnBook.setText("Book");
        btnBook.setFont(new java.awt.Font("Roboto Bold", 1, 18)); // NOI18N
        btnBook.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBookActionPerformed(evt);
            }
        });
        jPanel2.add(btnBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 160, 50));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 160, 680));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(1120, 680));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnOverviewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOverviewActionPerformed
        // TODO add your handling code here:
        toggleButtonBackground(btnOverview);
        resetButtonBackground(btnUsers);
        resetButtonBackground(btnModerator);
        resetButtonBackground(btnBook);
        resetButtonBackground(btnSettings);
        jPanel3.removeAll();
        
    }//GEN-LAST:event_btnOverviewActionPerformed

    private void btnUsersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsersActionPerformed
        // TODO add your handling code here:
        toggleButtonBackground(btnUsers);
        resetButtonBackground(btnOverview);
        resetButtonBackground(btnModerator);
        resetButtonBackground(btnBook);
        resetButtonBackground(btnSettings);
        jPanel3.removeAll();
        jPanel3.add(new UserForm()).setVisible(true);
    }//GEN-LAST:event_btnUsersActionPerformed

    private void btnModeratorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModeratorActionPerformed
        // TODO add your handling code here:
        toggleButtonBackground(btnModerator);
        resetButtonBackground(btnOverview);
        resetButtonBackground(btnUsers);
        resetButtonBackground(btnBook);
        resetButtonBackground(btnSettings);
        jPanel3.removeAll();
        jPanel3.add(new ModeratorForm()).setVisible(true);
    }//GEN-LAST:event_btnModeratorActionPerformed

    private void btnBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBookActionPerformed
        // TODO add your handling code here:
        toggleButtonBackground(btnBook);
        resetButtonBackground(btnOverview);
        resetButtonBackground(btnUsers);
        resetButtonBackground(btnModerator);
        resetButtonBackground(btnSettings);
        jPanel3.removeAll();
        jPanel3.add(new BookForm()).setVisible(true);
    }//GEN-LAST:event_btnBookActionPerformed

    private void btnSettingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSettingsActionPerformed
        // TODO add your handling code here:
        toggleButtonBackground(btnSettings);
        resetButtonBackground(btnOverview);
        resetButtonBackground(btnUsers);
        resetButtonBackground(btnModerator);
        resetButtonBackground(btnBook);
        jPanel3.removeAll();
        resetPanel3();
    }//GEN-LAST:event_btnSettingsActionPerformed

    private void jLabel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseEntered
        // TODO add your handling code here:
        jLabel2.setForeground(Color.BLUE);
    }//GEN-LAST:event_jLabel2MouseEntered

    private void jLabel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseExited
        // TODO add your handling code here:
        jLabel2.setForeground(Color.WHITE);
    }//GEN-LAST:event_jLabel2MouseExited

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void rSButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButton2ActionPerformed
        // TODO add your handling code here:
        Login log = new Login();
        log.setLocationRelativeTo(null);
        log.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_rSButton2ActionPerformed
    
    private void resetPanel3() {
        jPanel3.removeAll();
        JPanel panel = new JPanel();
        panel.setBackground(Color.WHITE);
        jPanel3.add(panel);
    }
    
    private void toggleButtonBackground(JButton button) {
        if (button.getBackground().equals(new Color(25, 118, 211))) {
            button.setBackground(new Color(51, 51, 51));
        } else {
            button.setBackground(new Color(25, 118, 211));
        }
    }

    private void resetButtonBackground(JButton button) {
        button.setBackground(new Color(51, 51, 51));
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
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojeru_san.RSButton btnBook;
    private rojeru_san.RSButton btnModerator;
    private rojeru_san.RSButton btnOverview;
    private rojeru_san.RSButton btnSettings;
    private rojeru_san.RSButton btnUsers;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private rojeru_san.RSButton rSButton2;
    // End of variables declaration//GEN-END:variables
}
