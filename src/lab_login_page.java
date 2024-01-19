import java.awt.*;
import javax.swing.*;
import java.sql.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fola
 */
public class lab_login_page extends javax.swing.JFrame {

    /**
     * Creates new form lab_login_page
     */
    Connection conn = null;
    Statement stmt = null;
    ResultSet rs = null;
    PreparedStatement st = null;
    private String path;
    private String s;
    
    public lab_login_page() {
         super("Add Criminal info");
        conn = dbaseConnx.openConnection();
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        password_login = new javax.swing.JPasswordField();
        labid_login = new javax.swing.JTextField();
        password_label = new javax.swing.JLabel();
        username_label = new javax.swing.JLabel();
        no_acc = new javax.swing.JButton();
        action_window2 = new javax.swing.JLabel();
        user_login_heading = new javax.swing.JLabel();
        login_btn = new javax.swing.JButton();
        back_btn = new javax.swing.JButton();
        bottom_banner = new javax.swing.JLabel();
        title_banner = new javax.swing.JLabel();
        action_window = new javax.swing.JLabel();
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Welcome to Covid Manager ");

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        password_login.setBackground(new java.awt.Color(242, 242, 242));
        password_login.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        password_login.setForeground(new java.awt.Color(46, 56, 80));
        password_login.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        password_login.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.add(password_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 290, 370, 40));

        labid_login.setBackground(new java.awt.Color(242, 242, 242));
        labid_login.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        labid_login.setForeground(new java.awt.Color(46, 56, 80));
        labid_login.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        labid_login.setToolTipText("Please enter correct Username");
        labid_login.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        labid_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                labid_loginActionPerformed(evt);
            }
        });
        jPanel3.add(labid_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 210, 370, 40));

        password_label.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        password_label.setForeground(new java.awt.Color(46, 56, 80));
        password_label.setText("Password :");
        jPanel3.add(password_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 290, 120, 50));

        username_label.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        username_label.setForeground(new java.awt.Color(46, 56, 80));
        username_label.setText("Lab ID :");
        jPanel3.add(username_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 210, 130, 50));

        no_acc.setBackground(new java.awt.Color(241, 241, 241));
        no_acc.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        no_acc.setForeground(new java.awt.Color(46, 56, 80));
        no_acc.setText("Do not have an account? Click Here");
        no_acc.setBorder(null);
        no_acc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                no_accActionPerformed(evt);
            }
        });
        jPanel3.add(no_acc, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 390, 320, 40));

        action_window2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bg.png"))); // NOI18N
        jPanel3.add(action_window2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 150, 630, 300));

        user_login_heading.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/lab_login_heading.png"))); // NOI18N
        jPanel3.add(user_login_heading, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 240, 50));

        login_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/login_btn.png"))); // NOI18N
        login_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                login_btnActionPerformed(evt);
            }
        });
        jPanel3.add(login_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 540, 180, 40));

        back_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/back_btn.png"))); // NOI18N
        back_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_btnActionPerformed(evt);
            }
        });
        jPanel3.add(back_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 540, 180, 40));

        bottom_banner.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/banner_low.png"))); // NOI18N
        jPanel3.add(bottom_banner, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 600, 1140, 40));

        title_banner.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/title_banner.png"))); // NOI18N
        jPanel3.add(title_banner, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1140, 50));

        action_window.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bgWHITE.png"))); // NOI18N
        jPanel3.add(action_window, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 1140, 550));
        jPanel3.add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1140, 640));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void labid_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_labid_loginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_labid_loginActionPerformed

    private void no_accActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_no_accActionPerformed
        lab_signup_page usp = new lab_signup_page();
        usp.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_no_accActionPerformed

    private void login_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_login_btnActionPerformed
        // TODO add your handling code here:
        try{
            if(!(labid_login.getText().equals("") && new String(password_login.getPassword()).equals(""))){
                Class.forName("com.mysql.jdbc.Driver");
                Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/covid_management","root","2099");
                PreparedStatement ps = conn.prepareStatement("select * from covid_management.lablogin where labid =? and labpassword=?;");
                ps.setString(1, labid_login.getText());
                ps.setString(2, new String(password_login.getPassword()));
                ResultSet rs = ps.executeQuery();
                if(rs.next()) {
                    JOptionPane.showMessageDialog(null,"Login Successful!");
                    lab_loggedin_page ulp = new lab_loggedin_page();
                    ulp.setVisible(true);
                    setVisible(false);
                } else{JOptionPane.showMessageDialog(null,"Login unsuccessful, Please enter valid credentials to login!!");}
            }else{JOptionPane.showMessageDialog(null,"Please fill out all the fields");}
        }catch(Exception e1) {JOptionPane.showMessageDialog(null,"Please fill out all the fields");}
    }//GEN-LAST:event_login_btnActionPerformed

    private void back_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_btnActionPerformed
        // TODO add your handling code here:
        MainAdmin ma = new MainAdmin();
        ma.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_back_btnActionPerformed

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
            java.util.logging.Logger.getLogger(lab_login_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(lab_login_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(lab_login_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(lab_login_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new lab_login_page().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel action_window;
    private javax.swing.JLabel action_window2;
    private javax.swing.JButton back_btn;
    private javax.swing.JLabel bg;
    private javax.swing.JLabel bottom_banner;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField labid_login;
    private javax.swing.JButton login_btn;
    private javax.swing.JButton no_acc;
    private javax.swing.JLabel password_label;
    private javax.swing.JPasswordField password_login;
    private javax.swing.JLabel title_banner;
    private javax.swing.JLabel user_login_heading;
    private javax.swing.JLabel username_label;
    // End of variables declaration//GEN-END:variables
}
