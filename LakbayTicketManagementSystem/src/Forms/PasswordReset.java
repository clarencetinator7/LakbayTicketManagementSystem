/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Forms;

import UtilityClasses.JTextFieldCharLimit;
import com.formdev.flatlaf.FlatIntelliJLaf;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author clare
 */
public class PasswordReset extends javax.swing.JFrame {

    /**
     * Creates new form PasswordReset
     */
    public PasswordReset() {
        initComponents();
        newPasswordField.setDocument(new JTextFieldCharLimit(6));
        conPasswordField.setDocument(new JTextFieldCharLimit(6));
        
        setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\clare\\Documents\\Programming\\JavaNetbeans\\LakbayTicketManagementSystem\\LakbayTicketManagementSystem\\LakbayTicketManagementSystem\\LakbayTicketManagementSystem\\src\\Images\\Icons\\bus_window_icon_64x64.png"));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rootPanel = new javax.swing.JPanel();
        loginBasePanel = new javax.swing.JPanel();
        conPasswordField = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        confirmPassBtn = new javax.swing.JButton();
        emailField = new javax.swing.JTextField();
        checkEmailBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        emailWarningTxt = new javax.swing.JLabel();
        passWarningTxt = new javax.swing.JLabel();
        newPasswordField = new javax.swing.JPasswordField();
        checkEmailBtn1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Reset Password");

        loginBasePanel.setBackground(new java.awt.Color(255, 255, 255));
        loginBasePanel.setPreferredSize(new java.awt.Dimension(461, 720));

        conPasswordField.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
        conPasswordField.setToolTipText("");
        conPasswordField.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(46, 196, 182), 2, true), "Confirm New Password:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Open Sans", 0, 14), new java.awt.Color(102, 102, 102))); // NOI18N
        conPasswordField.setEnabled(false);

        jLabel2.setFont(new java.awt.Font("Open Sans", 1, 27)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 159, 28));
        jLabel2.setText("Password Reset");

        jLabel1.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
        jLabel1.setText("Enter the email you registered:");

        confirmPassBtn.setBackground(new java.awt.Color(46, 196, 182));
        confirmPassBtn.setFont(new java.awt.Font("Open Sans", 1, 18)); // NOI18N
        confirmPassBtn.setForeground(new java.awt.Color(255, 255, 255));
        confirmPassBtn.setText("Confirm");
        confirmPassBtn.setToolTipText("");
        confirmPassBtn.setEnabled(false);
        confirmPassBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmPassBtnActionPerformed(evt);
            }
        });

        emailField.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
        emailField.setToolTipText("");
        emailField.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(46, 196, 182), 2, true), "Email", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Open Sans", 0, 16), new java.awt.Color(102, 102, 102))); // NOI18N

        checkEmailBtn.setBackground(new java.awt.Color(46, 196, 182));
        checkEmailBtn.setFont(new java.awt.Font("Open Sans", 1, 20)); // NOI18N
        checkEmailBtn.setForeground(new java.awt.Color(255, 255, 255));
        checkEmailBtn.setText("Check");
        checkEmailBtn.setToolTipText("");
        checkEmailBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkEmailBtnActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
        jLabel3.setText("Enter New Password:");

        emailWarningTxt.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
        emailWarningTxt.setForeground(new java.awt.Color(204, 0, 0));
        emailWarningTxt.setToolTipText("");

        passWarningTxt.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
        passWarningTxt.setForeground(new java.awt.Color(204, 0, 0));
        passWarningTxt.setToolTipText("");

        newPasswordField.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
        newPasswordField.setToolTipText("");
        newPasswordField.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(46, 196, 182), 2, true), "New Password:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Open Sans", 0, 14), new java.awt.Color(102, 102, 102))); // NOI18N
        newPasswordField.setEnabled(false);

        checkEmailBtn1.setBackground(new java.awt.Color(46, 196, 182));
        checkEmailBtn1.setFont(new java.awt.Font("Open Sans", 1, 20)); // NOI18N
        checkEmailBtn1.setForeground(new java.awt.Color(255, 255, 255));
        checkEmailBtn1.setText("Back");
        checkEmailBtn1.setToolTipText("");
        checkEmailBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkEmailBtn1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout loginBasePanelLayout = new javax.swing.GroupLayout(loginBasePanel);
        loginBasePanel.setLayout(loginBasePanelLayout);
        loginBasePanelLayout.setHorizontalGroup(
            loginBasePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginBasePanelLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(loginBasePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(loginBasePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel2)
                        .addComponent(jLabel1))
                    .addGroup(loginBasePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(loginBasePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(loginBasePanelLayout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addGroup(loginBasePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(conPasswordField, javax.swing.GroupLayout.DEFAULT_SIZE, 316, Short.MAX_VALUE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginBasePanelLayout.createSequentialGroup()
                                        .addComponent(checkEmailBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(confirmPassBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(passWarningTxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(newPasswordField, javax.swing.GroupLayout.DEFAULT_SIZE, 316, Short.MAX_VALUE))))
                        .addGroup(loginBasePanelLayout.createSequentialGroup()
                            .addGap(34, 34, 34)
                            .addGroup(loginBasePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(loginBasePanelLayout.createSequentialGroup()
                                    .addComponent(emailWarningTxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGap(18, 18, 18)
                                    .addComponent(checkEmailBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(75, Short.MAX_VALUE))
        );
        loginBasePanelLayout.setVerticalGroup(
            loginBasePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginBasePanelLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel2)
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(loginBasePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(checkEmailBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginBasePanelLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(emailWarningTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(46, 46, 46)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(newPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(conPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passWarningTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addGroup(loginBasePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(confirmPassBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checkEmailBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(131, Short.MAX_VALUE))
        );

        jLabel4.setFont(new java.awt.Font("Open Sans", 1, 27)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 159, 28));
        jLabel4.setText("LAKBAY BUS TICKET MANAGEMENT SYSTEM");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Cashier-Illustration.jpg"))); // NOI18N

        javax.swing.GroupLayout rootPanelLayout = new javax.swing.GroupLayout(rootPanel);
        rootPanel.setLayout(rootPanelLayout);
        rootPanelLayout.setHorizontalGroup(
            rootPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rootPanelLayout.createSequentialGroup()
                .addComponent(loginBasePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                .addGroup(rootPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(rootPanelLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel4)))
                .addGap(89, 89, 89))
        );
        rootPanelLayout.setVerticalGroup(
            rootPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rootPanelLayout.createSequentialGroup()
                .addComponent(loginBasePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(rootPanelLayout.createSequentialGroup()
                .addGap(163, 163, 163)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rootPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rootPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void close()
    {
        WindowEvent closeWindow = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closeWindow);
    }
    
    //REGION - SQL Connection
    
        // Connect database code
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
    public void sqlConnect()
    {
        try {
           String url1 = "jdbc:mysql://localhost:3306/lakbay_ticket_management_system";
           String user = "root";
           String password = "Cj06032002";
           
           con = DriverManager.getConnection(url1, user, password);
           if(con != null)
           {
               //System.out.println("Connected to the database.");
           }
           
        } catch (SQLException ex) {
            System.out.println("An error occurred. Maybe user/password is invalid");
            ex.printStackTrace();
        }
    }
    
    //ENDREGION - SQL Connection
    
    
    //REGION - Local Methods
    
    
    public boolean isEmailExist(String emailStr)
    {
        sqlConnect();
        try {
            ps = con.prepareStatement("SELECT email_address FROM staff");
            rs = ps.executeQuery();
            
            while(rs.next())
            {
                String emailAdd = rs.getString("email_address");
                
                if(emailAdd.equals(emailStr))
                {
                    return true;
                }
                            
            }
                    
        } catch (SQLException ex) 
        {
            Logger.getLogger(LoginPage.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return false;
    }
    
    public void resetPassword(String newPassword, String email)
    {
      
        sqlConnect();
        
        String query = "UPDATE staff SET "
                + "pass_word = ? "
                + "WHERE email_address = ?";
        
        
        
        try {
            ps = con.prepareStatement(query);
        
            ps.setString(1, newPassword);
            ps.setString(2, email);
            
            int k = ps.executeUpdate();
            
            if(k==1)
            {
                JOptionPane.showMessageDialog(this, "Record Updated Successfuly.");
            }
            
        } catch (Exception e) {
            System.out.println("Error in password reset: " + e);
        }
        
    }
    
    
    
    
    //END REGION;
    
    
    
    
    
    //REGION - Button events
    
    private void confirmPassBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmPassBtnActionPerformed
        
        if(!newPasswordField.getText().equals("") || !conPasswordField.getText().equals(""))
        {
            
            if(newPasswordField.getText().equals(conPasswordField.getText()))
            {
                resetPassword(conPasswordField.getText(), emailField.getText());
                
                //ENABLE EMAIL CHECK
                emailField.setEnabled(true);
                checkEmailBtn.setEnabled(true);
                emailField.setText("");
                
                //DISABLE NEW PASSWORD
                newPasswordField.setEnabled(false);
                conPasswordField.setEnabled(false);
                confirmPassBtn.setEnabled(false);
                
                newPasswordField.setText("");
                conPasswordField.setText("");
                
                this.setVisible(false);
                LoginPage lp = new LoginPage();
                lp.setVisible(true);
                
                
                
            }
            else
            {
                passWarningTxt.setText("Password does not match.");
                newPasswordField.setText("");
                conPasswordField.setText("");
                
            }
            
        }
        else
        {
            passWarningTxt.setText("Please fill the required fields.");
        }
        
    }//GEN-LAST:event_confirmPassBtnActionPerformed

    private void checkEmailBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkEmailBtnActionPerformed
        // TODO add your handling code here:
        
        if(!emailField.getText().equals(""))
        {
            if (isEmailExist(emailField.getText())) {
                
                emailWarningTxt.setText("");
                
                //DISABLE EMAIL CHECK
                emailField.setEnabled(false);
                checkEmailBtn.setEnabled(false);
                
                //ENABLE NEW PASSWORD
                newPasswordField.setEnabled(true);
                conPasswordField.setEnabled(true);
                confirmPassBtn.setEnabled(true);
               
            }
            else
            {
                JOptionPane.showMessageDialog(rootPane, "The email you input is not found in database.",
                    "Email not found",
                    JOptionPane.ERROR_MESSAGE);
                emailField.setText("");
            }
        }
        else
        {
            emailWarningTxt.setText("Please fill the field.");
        }
        
    }//GEN-LAST:event_checkEmailBtnActionPerformed

    private void checkEmailBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkEmailBtn1ActionPerformed
        // TODO add your handling code here:
        
        this.setVisible(false);
        LoginPage lp = new LoginPage();
        lp.setVisible(true);
    }//GEN-LAST:event_checkEmailBtn1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel(new FlatIntelliJLaf());
        } catch (UnsupportedLookAndFeelException e) {
            
        }
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PasswordReset().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton checkEmailBtn;
    private javax.swing.JButton checkEmailBtn1;
    private javax.swing.JPasswordField conPasswordField;
    private javax.swing.JButton confirmPassBtn;
    private javax.swing.JTextField emailField;
    private javax.swing.JLabel emailWarningTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel loginBasePanel;
    private javax.swing.JPasswordField newPasswordField;
    private javax.swing.JLabel passWarningTxt;
    private javax.swing.JPanel rootPanel;
    // End of variables declaration//GEN-END:variables
}