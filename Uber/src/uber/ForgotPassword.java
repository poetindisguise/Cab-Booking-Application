/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uber;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author NITJ
 */
public class ForgotPassword extends javax.swing.JFrame {

    /**
     * Creates new form ForgotPassword
     */
    public ForgotPassword() {
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
        id = new javax.swing.JTextField();
        no = new javax.swing.JTextField();
        pass1 = new javax.swing.JPasswordField();
        pass2 = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        bu = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(500, 400));
        setPreferredSize(new java.awt.Dimension(500, 400));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Reset Password");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(150, 20, 290, 40);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("User Id");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 80, 120, 40);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Registered Ph No.");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 140, 130, 40);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("New Password");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(30, 200, 120, 40);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Confirm Password");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(30, 260, 130, 50);
        getContentPane().add(id);
        id.setBounds(210, 80, 180, 40);
        getContentPane().add(no);
        no.setBounds(210, 140, 180, 40);
        getContentPane().add(pass1);
        pass1.setBounds(210, 200, 180, 40);
        getContentPane().add(pass2);
        pass2.setBounds(210, 260, 180, 40);

        jButton1.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jButton1.setText("Reset");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(190, 310, 130, 40);

        jButton2.setText("Back");
        getContentPane().add(jButton2);
        jButton2.setBounds(370, 320, 70, 30);

        bu.setFont(new java.awt.Font("Tahoma", 3, 10)); // NOI18N
        bu.setText("Show Password");
        bu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buActionPerformed(evt);
            }
        });
        getContentPane().add(bu);
        bu.setBounds(30, 310, 130, 21);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uber/forgot.png"))); // NOI18N
        getContentPane().add(jLabel6);
        jLabel6.setBounds(-920, -150, 1480, 570);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
           try {  
            Class.forName("com.mysql.jdbc.Driver");
            Connection obj=(Connection) DriverManager.getConnection("jdbc:mysql://localhost/uber", "root", "");
            String query="SELECT * FROM `users` WHERE  UserId = '"+id.getText()+"' and PhNo = '"+no.getText()+"'";
           PreparedStatement ps=(PreparedStatement) obj.prepareStatement(query);
           //Arrays.toString(pass.getPassword())
           ResultSet rs=ps.executeQuery();
           if(rs.next())
           {
           Connection obj1=(Connection) DriverManager.getConnection("jdbc:mysql://localhost/uber", "root", "");
           String query1="UPDATE `users` SET `Password`=? WHERE UserId= '"+id.getText()+"'";
           PreparedStatement ps1=(PreparedStatement) obj.prepareStatement(query1);
           
           if((pass1.getText()).equals(pass2.getText()))
           {
           ps1.setString(1,(pass1.getText()));
           ps1.executeUpdate();
           JOptionPane.showMessageDialog(rootPane,"Done");
           this.setVisible(false);
           new Home().setVisible(true);
           }
           else
               JOptionPane.showMessageDialog(rootPane,"Passwords does'nt match");
           }
           else
               JOptionPane.showMessageDialog(rootPane,"Invalid User");
       } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(rootPane,"Error"+ex.getMessage());
       }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void buActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buActionPerformed
if(bu.isSelected())
        {
        pass1.setEchoChar((char)0);
pass2.setEchoChar((char)0);
        }
if(!bu.isSelected())
        {
        pass1.setEchoChar((char)9733);
pass2.setEchoChar((char)9733);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_buActionPerformed

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
            java.util.logging.Logger.getLogger(ForgotPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ForgotPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ForgotPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ForgotPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ForgotPassword().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton bu;
    private javax.swing.JTextField id;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField no;
    private javax.swing.JPasswordField pass1;
    private javax.swing.JPasswordField pass2;
    // End of variables declaration//GEN-END:variables
}
