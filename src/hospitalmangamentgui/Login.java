/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospitalmangamentgui;

import Connector.ConnectionProvider;
import java.awt.Color;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
/**
 *
 * @author cy759
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
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

        labelusername = new javax.swing.JLabel();
        labelpassword = new javax.swing.JLabel();
        jTextpassword = new javax.swing.JPasswordField();
        jTextuser = new javax.swing.JTextField();
        Loginbutton = new javax.swing.JButton();
        closebutton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelusername.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelusername.setText("UserName");
        getContentPane().add(labelusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, 80, 30));

        labelpassword.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelpassword.setText("Password");
        getContentPane().add(labelpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 73, 27));
        getContentPane().add(jTextpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 90, 112, -1));

        jTextuser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextuserActionPerformed(evt);
            }
        });
        getContentPane().add(jTextuser, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 30, 112, -1));

        Loginbutton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Loginbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospitalmangamentgui/icons8-login-30.png"))); // NOI18N
        Loginbutton.setText("Login");
        Loginbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginbuttonActionPerformed(evt);
            }
        });
        getContentPane().add(Loginbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, -1, -1));

        closebutton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        closebutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospitalmangamentgui/icons8-close-30.png"))); // NOI18N
        closebutton.setText("Close");
        closebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closebuttonActionPerformed(evt);
            }
        });
        getContentPane().add(closebutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 200, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospitalmangamentgui/pexels-pixabay-247786.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextuserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextuserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextuserActionPerformed

    private void closebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closebuttonActionPerformed
        // TODO add your handling code here:
        int flag=JOptionPane.showConfirmDialog(null, "Are you sure want to exit", "submit",JOptionPane.YES_NO_OPTION);
        if(flag==0)
        {
            setVisible(false);
            new SignUp().setVisible(true);
        }
    }//GEN-LAST:event_closebuttonActionPerformed

    private void LoginbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginbuttonActionPerformed
        // TODO add your handling code here:
        String user=jTextuser.getText();
        String password=jTextpassword.getText();
           try {
                    Connection con =ConnectionProvider.getcon();
                     Statement st = con.prepareStatement("create", ResultSet.TYPE_SCROLL_SENSITIVE, 
                        ResultSet.CONCUR_UPDATABLE);
                       ResultSet rs = st.executeQuery("Select Username, Password from signup where Username=' "+user+" ' and Password=' "+password+" '");

                     if(rs.first()){             
//                String userc= rs.getString(1);
//                String passwordc=rs.getString(2);
//                System.out.print(userc);
//                System.out.print(passwordc);
            
                    setVisible(false);
                    new Home().setVisible(true);
                
              
                   
            }
            else{
                         
               JOptionPane.showMessageDialog(null, "user not found");
               
            }
                    
                    
                }
           catch (Exception e) {
                   JOptionPane.showMessageDialog(null, e.toString());
                }
    }//GEN-LAST:event_LoginbuttonActionPerformed

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
    private javax.swing.JButton Loginbutton;
    private javax.swing.JButton closebutton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPasswordField jTextpassword;
    private javax.swing.JTextField jTextuser;
    private javax.swing.JLabel labelpassword;
    private javax.swing.JLabel labelusername;
    // End of variables declaration//GEN-END:variables
}
