/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Forms;

import UtilityClasses.StaticVar;
import com.formdev.flatlaf.FlatIntelliJLaf;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author clare
 */
public class AdminPage extends javax.swing.JFrame {

    /**
     * Creates new form AdminPage
     */
    public AdminPage() {
        initComponents();
        userTxt.setText(StaticVar.userId);
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
        menuPanel = new javax.swing.JPanel();
        homeBtn = new javax.swing.JButton();
        admBtn = new javax.swing.JButton();
        staffPanel = new javax.swing.JPanel();
        ttlTxt1 = new javax.swing.JLabel();
        tixDesc = new javax.swing.JLabel();
        addStaffBtn = new javax.swing.JButton();
        userTxt = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        rootPanel.setPreferredSize(new java.awt.Dimension(1280, 720));

        menuPanel.setBackground(new java.awt.Color(255, 255, 255));
        menuPanel.setPreferredSize(new java.awt.Dimension(227, 720));

        homeBtn.setFont(new java.awt.Font("Open Sans", 1, 16)); // NOI18N
        homeBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Icons/home-24x24.png"))); // NOI18N
        homeBtn.setText(" HOME");
        homeBtn.setToolTipText("");
        homeBtn.setBorder(null);
        homeBtn.setPreferredSize(new java.awt.Dimension(104, 39));
        homeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeBtnActionPerformed(evt);
            }
        });

        admBtn.setBackground(new java.awt.Color(28, 162, 150));
        admBtn.setFont(new java.awt.Font("Open Sans", 1, 16)); // NOI18N
        admBtn.setForeground(new java.awt.Color(255, 255, 255));
        admBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Icons/admin-24x24-white.png"))); // NOI18N
        admBtn.setText("ADMIN");
        admBtn.setToolTipText("");
        admBtn.setBorder(null);
        admBtn.setPreferredSize(new java.awt.Dimension(104, 39));
        admBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                admBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout menuPanelLayout = new javax.swing.GroupLayout(menuPanel);
        menuPanel.setLayout(menuPanelLayout);
        menuPanelLayout.setHorizontalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(homeBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(admBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE)
        );
        menuPanelLayout.setVerticalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuPanelLayout.createSequentialGroup()
                .addGap(197, 197, 197)
                .addComponent(homeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(admBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(433, Short.MAX_VALUE))
        );

        staffPanel.setBackground(new java.awt.Color(28, 162, 150));
        staffPanel.setPreferredSize(new java.awt.Dimension(322, 192));

        ttlTxt1.setFont(new java.awt.Font("Open Sans", 1, 28)); // NOI18N
        ttlTxt1.setForeground(new java.awt.Color(255, 255, 255));
        ttlTxt1.setText("Staff");

        tixDesc.setFont(new java.awt.Font("Open Sans", 0, 17)); // NOI18N
        tixDesc.setForeground(new java.awt.Color(255, 255, 255));
        tixDesc.setText("Manange and add staff.");

        addStaffBtn.setBackground(new java.awt.Color(255, 159, 28));
        addStaffBtn.setFont(new java.awt.Font("Open Sans", 0, 16)); // NOI18N
        addStaffBtn.setForeground(new java.awt.Color(255, 255, 255));
        addStaffBtn.setText("Add Now");
        addStaffBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 159, 28), 1, true));
        addStaffBtn.setPreferredSize(new java.awt.Dimension(104, 39));
        addStaffBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addStaffBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout staffPanelLayout = new javax.swing.GroupLayout(staffPanel);
        staffPanel.setLayout(staffPanelLayout);
        staffPanelLayout.setHorizontalGroup(
            staffPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(staffPanelLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(staffPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addStaffBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tixDesc)
                    .addComponent(ttlTxt1))
                .addContainerGap(125, Short.MAX_VALUE))
        );
        staffPanelLayout.setVerticalGroup(
            staffPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(staffPanelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(ttlTxt1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tixDesc)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(addStaffBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        userTxt.setFont(new java.awt.Font("Open Sans", 0, 15)); // NOI18N
        userTxt.setForeground(new java.awt.Color(85, 85, 85));
        userTxt.setText("USER001");

        javax.swing.GroupLayout rootPanelLayout = new javax.swing.GroupLayout(rootPanel);
        rootPanel.setLayout(rootPanelLayout);
        rootPanelLayout.setHorizontalGroup(
            rootPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rootPanelLayout.createSequentialGroup()
                .addComponent(menuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(rootPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(rootPanelLayout.createSequentialGroup()
                        .addGap(964, 964, 964)
                        .addComponent(userTxt))
                    .addGroup(rootPanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(staffPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 26, Short.MAX_VALUE))
        );
        rootPanelLayout.setVerticalGroup(
            rootPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rootPanelLayout.createSequentialGroup()
                .addComponent(menuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(rootPanelLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(userTxt)
                .addGap(10, 10, 10)
                .addComponent(staffPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(rootPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(rootPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    public void close()
    {
        WindowEvent closeWindow = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closeWindow);
    }
    
    private void addStaffBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addStaffBtnActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        AddStaff as = new AddStaff();
        as.setVisible(true);
    }//GEN-LAST:event_addStaffBtnActionPerformed

    private void admBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_admBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_admBtnActionPerformed

    private void homeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeBtnActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        HomePage hp = new HomePage();
        hp.setVisible(true);
        
    }//GEN-LAST:event_homeBtnActionPerformed

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
            public void run() {
                new AdminPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addStaffBtn;
    private javax.swing.JButton admBtn;
    private javax.swing.JButton homeBtn;
    private javax.swing.JPanel menuPanel;
    private javax.swing.JPanel rootPanel;
    private javax.swing.JPanel staffPanel;
    private javax.swing.JLabel tixDesc;
    private javax.swing.JLabel ttlTxt1;
    private javax.swing.JLabel userTxt;
    // End of variables declaration//GEN-END:variables
}
