/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospitalmangamentgui;
import Connector.ConnectionProvider;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author cy759
 */
public class AddNewPatient extends javax.swing.JFrame {

    /**
     * Creates new form AddNewPatient
     */
    public AddNewPatient() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        submitbutton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        jTextFieldpatientid = new javax.swing.JTextField();
        jTextFieldname = new javax.swing.JTextField();
        jTextFieldage = new javax.swing.JTextField();
        jTextFieldcontact = new javax.swing.JTextField();
        jTextFieldbloodgroup = new javax.swing.JTextField();
        jTextFieldaddress = new javax.swing.JTextField();
        jTextFieldgender = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Patient Id");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 31, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Name");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 88, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Age");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 166, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Contact");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 230, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Gender");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 296, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Blood Group");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 351, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Address");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 415, -1, -1));

        submitbutton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        submitbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospitalmangamentgui/icons8-submit-document-32.png"))); // NOI18N
        submitbutton.setText("Submit");
        submitbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitbuttonActionPerformed(evt);
            }
        });
        getContentPane().add(submitbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(366, 480, -1, -1));

        cancelButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cancelButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospitalmangamentgui/icons8-cancel-24.png"))); // NOI18N
        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });
        getContentPane().add(cancelButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(102, 480, -1, 41));

        jTextFieldpatientid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldpatientidActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldpatientid, new org.netbeans.lib.awtextra.AbsoluteConstraints(376, 29, 100, -1));
        getContentPane().add(jTextFieldname, new org.netbeans.lib.awtextra.AbsoluteConstraints(376, 86, 100, -1));
        getContentPane().add(jTextFieldage, new org.netbeans.lib.awtextra.AbsoluteConstraints(376, 164, 100, -1));
        getContentPane().add(jTextFieldcontact, new org.netbeans.lib.awtextra.AbsoluteConstraints(376, 228, 100, -1));
        getContentPane().add(jTextFieldbloodgroup, new org.netbeans.lib.awtextra.AbsoluteConstraints(376, 349, 100, -1));
        getContentPane().add(jTextFieldaddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(376, 410, 100, -1));

        jTextFieldgender.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextFieldgender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        jTextFieldgender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldgenderActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldgender, new org.netbeans.lib.awtextra.AbsoluteConstraints(376, 293, 100, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospitalmangamentgui/bed.jpg"))); // NOI18N
        jLabel8.setText("jLabel8");
        jLabel8.setMinimumSize(new java.awt.Dimension(1080, 720));
        jLabel8.setPreferredSize(new java.awt.Dimension(1080, 720));
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 570, 560));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void submitbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitbuttonActionPerformed
        // TODO add your handling code here:
    String PatientId = jTextFieldpatientid.getText();
        String Name = jTextFieldname.getText();
        String Age = jTextFieldage.getText();
        String Contact = jTextFieldcontact.getText();
        String Gender = (String)jTextFieldgender.getSelectedItem();
        String BloodGroup = jTextFieldbloodgroup.getText();
        String Address = jTextFieldaddress.getText();

        try{
            Connection con = ConnectionProvider.getcon();
            Statement st = con.createStatement();
            st.executeUpdate("insert into patient values('"+ PatientId + "', '" + Name +"', '"+ Age +"', '"+ Contact +"', '"+ Gender +"', '"+ BloodGroup +"', '"+ Address+ "')");
            JOptionPane.showMessageDialog(null, "Successfully Added");
            setVisible(false);
            AddNewPatient frame = new AddNewPatient();
            frame.setVisible(true);
            frame.setLocationRelativeTo(null);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e.toString());
        }
        
    }//GEN-LAST:event_submitbuttonActionPerformed

    private void jTextFieldgenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldgenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldgenderActionPerformed

    private void jTextFieldpatientidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldpatientidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldpatientidActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        // TODO add your handling code here:
        int flag=JOptionPane.showConfirmDialog(null, "Are you sure want to exit", "Submit", JOptionPane.YES_NO_OPTION);
        if(flag==0)
        {
            setVisible(false);
            new Home().setVisible(true);
        }
    }//GEN-LAST:event_cancelButtonActionPerformed

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
            java.util.logging.Logger.getLogger(AddNewPatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddNewPatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddNewPatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddNewPatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddNewPatient().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField jTextFieldaddress;
    private javax.swing.JTextField jTextFieldage;
    private javax.swing.JTextField jTextFieldbloodgroup;
    private javax.swing.JTextField jTextFieldcontact;
    private javax.swing.JComboBox<String> jTextFieldgender;
    private javax.swing.JTextField jTextFieldname;
    private javax.swing.JTextField jTextFieldpatientid;
    private javax.swing.JButton submitbutton;
    // End of variables declaration//GEN-END:variables
}
