/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uber;

import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
//import static uber.Ride.n1;

/**
 *
 * @author NITJ
 */
public class Login extends javax.swing.JFrame {
static String s,userid,wall;
static int wa=0;
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

        jTextField2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        pass = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        bu = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();

        jTextField2.setText("jTextField2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(600, 400));
        setMinimumSize(new java.awt.Dimension(600, 400));
        setPreferredSize(new java.awt.Dimension(600, 400));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 0));
        jLabel1.setText("Login Page");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 150, 40));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 0));
        jLabel2.setText("User id");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 70, 40));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 0));
        jLabel3.setText("Password");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 80, 40));

        id.setForeground(new java.awt.Color(204, 204, 204));
        id.setText("User id");
        id.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                idFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                idFocusLost(evt);
            }
        });
        id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idActionPerformed(evt);
            }
        });
        getContentPane().add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 210, 40));

        pass.setForeground(new java.awt.Color(204, 204, 204));
        pass.setText("password");
        pass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                passFocusLost(evt);
            }
        });
        getContentPane().add(pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 210, 40));

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton1.setText("Login");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 210, 73, 40));

        jButton2.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jButton2.setText("Forgot Password");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, 130, 30));

        jButton3.setText("Back");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 320, 70, 40));

        bu.setBackground(new java.awt.Color(51, 204, 0));
        bu.setFont(new java.awt.Font("Tahoma", 3, 10)); // NOI18N
        bu.setForeground(new java.awt.Color(255, 255, 0));
        bu.setText("Show Password");
        bu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buActionPerformed(evt);
            }
        });
        getContentPane().add(bu, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 120, -1));

        jLabel5.setBackground(new java.awt.Color(102, 153, 255));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uber/im11.jpg"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 610, 380));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {  
            Class.forName("com.mysql.jdbc.Driver");
           Connection obj=(Connection) DriverManager.getConnection("jdbc:mysql://localhost/uber", "root", "");
            String query="SELECT * FROM `users` WHERE  UserId = '"+id.getText()+"' and Password = '"+pass.getText()+"'";
           PreparedStatement ps=(PreparedStatement) obj.prepareStatement(query);
           ResultSet rs=ps.executeQuery();
           
           if(rs.next()){  
               s=rs.getString("Name");
               userid=rs.getString("UserId");
               wall=rs.getString("Wallet");
             
                //JOptionPane.showMessageDialog(rootPane,"Hello "+rs.getString("Name"));
                
           }else{
             JOptionPane.showMessageDialog(rootPane,"Invalid User");
           }
           DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
           LocalDateTime now = LocalDateTime.now(); 
            int n1=0;
         n1=n1+((dtf.format(now)).charAt(8)-48)*10000000;
         n1=n1+((dtf.format(now)).charAt(9)-48)*1000000;
         n1=n1+((dtf.format(now)).charAt(11)-48)*100000;
         n1=n1+((dtf.format(now)).charAt(12)-48)*10000;
         n1=n1+((dtf.format(now)).charAt(14)-48)*1000;
         n1=n1+((dtf.format(now)).charAt(15)-48)*100;
         n1=n1+((dtf.format(now)).charAt(17)-48)*10;
         n1=n1+((dtf.format(now)).charAt(18)-48)*1;
         if(n1>rs.getInt(7))   
         {
         this.setVisible(true);
              new Login1().setVisible(true);
         }
         else
         {
             JOptionPane.showMessageDialog(rootPane,"Another Booking cant be made while riding a cab ");
         }
       } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(rootPane,"Error "+ex.getMessage());
       }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
            this.setVisible(false);
            new ForgotPassword().setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
                   this.setVisible(false);
            new Home().setVisible(true); // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void buActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buActionPerformed
    if(bu.isSelected())
        {
        pass.setEchoChar((char)0);

        }
if(!bu.isSelected())
        {
        pass.setEchoChar((char)9733);

        }        // TODO add your handling code here:
    }//GEN-LAST:event_buActionPerformed

    private void idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idActionPerformed

    private void idFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_idFocusGained
        if(id.getText().equals("User id"))
        {
            id.setText("");
            id.setForeground(Color.black);
// TODO add your handling code here:
        }
    }//GEN-LAST:event_idFocusGained

    private void idFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_idFocusLost
        
if(id.getText().trim().toLowerCase().equals("User id")||id.getText().equals(""))
        {
            id.setText("User id");
            id.setForeground(Color.gray);
// TODO add your handling code here:
        }// TODO add your handling code here:
    }//GEN-LAST:event_idFocusLost

    private void passFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passFocusGained
if(pass.getText().equals("password"))
        {
            pass.setText("");
            pass.setForeground(Color.black);
// TODO add your handling code here:
        }        
// TODO add your handling code here:
    }//GEN-LAST:event_passFocusGained

    private void passFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passFocusLost
       if(pass.getText().equals("password")||pass.getText().equals(""))
        {
            pass.setText("password");
            pass.setForeground(Color.gray);
// TODO add your handling code here:
        } // TODO add your handling code here:
    }//GEN-LAST:event_passFocusLost

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
    private javax.swing.JRadioButton bu;
    private javax.swing.JTextField id;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JPasswordField pass;
    // End of variables declaration//GEN-END:variables
}
