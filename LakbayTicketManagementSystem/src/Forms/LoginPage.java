/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Forms;

import com.formdev.flatlaf.FlatIntelliJLaf;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import jdk.dynalink.beans.StaticClass;

import UtilityClasses.StaticVar;

/**
 *
 * @author clare
 */
public class LoginPage extends javax.swing.JFrame {

    /**
     * Creates new form LoginPage
     */
    public LoginPage() {
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

        rootPanel = new javax.swing.JPanel();
        loginBasePanel = new javax.swing.JPanel();
        userField = new javax.swing.JTextField();
        passField = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        loginBasePanel.setBackground(new java.awt.Color(255, 255, 255));
        loginBasePanel.setPreferredSize(new java.awt.Dimension(461, 720));

        userField.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
        userField.setToolTipText("HELLO");
        userField.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(46, 196, 182), 2, true), "Username:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Open Sans", 0, 16), new java.awt.Color(102, 102, 102))); // NOI18N

        passField.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
        passField.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(46, 196, 182), 2, true), "Password:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Open Sans", 0, 16), new java.awt.Color(102, 102, 102))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Open Sans", 1, 27)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 159, 28));
        jLabel2.setText("LOGIN");

        jLabel1.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
        jLabel1.setText("Enter your account details");

        jButton1.setBackground(new java.awt.Color(46, 196, 182));
        jButton1.setFont(new java.awt.Font("Open Sans", 1, 20)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Login");
        jButton1.setToolTipText("");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout loginBasePanelLayout = new javax.swing.GroupLayout(loginBasePanel);
        loginBasePanel.setLayout(loginBasePanelLayout);
        loginBasePanelLayout.setHorizontalGroup(
            loginBasePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginBasePanelLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(loginBasePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(loginBasePanelLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(loginBasePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(loginBasePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(userField, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(passField, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel1))))
                    .addComponent(jLabel2))
                .addContainerGap(75, Short.MAX_VALUE))
        );
        loginBasePanelLayout.setVerticalGroup(
            loginBasePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginBasePanelLayout.createSequentialGroup()
                .addGap(154, 154, 154)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(50, 50, 50)
                .addComponent(userField, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(passField, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(196, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout rootPanelLayout = new javax.swing.GroupLayout(rootPanel);
        rootPanel.setLayout(rootPanelLayout);
        rootPanelLayout.setHorizontalGroup(
            rootPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rootPanelLayout.createSequentialGroup()
                .addComponent(loginBasePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(819, Short.MAX_VALUE))
        );
        rootPanelLayout.setVerticalGroup(
            rootPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rootPanelLayout.createSequentialGroup()
                .addComponent(loginBasePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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
               System.out.println("Connected to the database.");
           }
           
        } catch (SQLException ex) {
            System.out.println("An error occurred. Maybe user/password is invalid");
            ex.printStackTrace();
        }
    }
    
    public boolean Login(String u, String p){
        sqlConnect();
        try {
            ps = con.prepareStatement("SELECT * FROM staff");
            rs = ps.executeQuery();
            
            while(rs.next())
            {
                String uname = rs.getString("user_name");
                String pword = rs.getString("pass_word");
                String fname = rs.getString("staff_id");
                
                if(u.equals(uname) && p.equals(pword))
                {
                    close();
                    return true;
                }
                            
            }
                    
        } catch (SQLException ex) 
        {
            Logger.getLogger(LoginPage.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    // Retrieve Dataa
    public String getString(String u)
    {
        String fName = null;
        
        String query = 
                "SELECT staff_id FROM staff WHERE user_name = ?";
        
        try {
            ps = con.prepareStatement(query);
            ps.setString(1, u);
            rs = ps.executeQuery();
            
            while(rs.next())
            {    
                fName = rs.getString("staff_id");
                return fName;
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(LoginPage.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return fName;
    }
    
    
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
       

        // TODO add your handling code here:
        String username = userField.getText();
        String password = String.valueOf(passField.getText());
        
        
        
        if (Login(username, password))
        {
            StaticVar.userId = getString(username);
            StaticVar.userName = username;
            
            if(StaticVar.userId.contains("AD"))
            {
                StaticVar.privilege = "Admin";
            }
            else if (StaticVar.userId.contains("MG")) {
                StaticVar.privilege = "Manager";
            }
            else if (StaticVar.userId.contains("CS")) {
                StaticVar.privilege = "Cashier";
            }
            
            
            HomePage hp = new HomePage();
            hp.setVisible(true);
        }
        else if(!Login(username, password))
        {
          JOptionPane.showMessageDialog(rootPane, "Please double check your details or\n"
                  + "contact the administrator.",
                  "Account not found.", 
                  JOptionPane.ERROR_MESSAGE);
        }
 
    }//GEN-LAST:event_jButton1ActionPerformed

    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        
        
        // region Set the Look and Feel of the Project
        try {
            UIManager.setLookAndFeel(new FlatIntelliJLaf());
        } catch (UnsupportedLookAndFeelException e) {
            
        }
        // endregion
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new LoginPage().setVisible(true);
            }
        });
        
           
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel loginBasePanel;
    private javax.swing.JPasswordField passField;
    private javax.swing.JPanel rootPanel;
    private javax.swing.JTextField userField;
    // End of variables declaration//GEN-END:variables
}
