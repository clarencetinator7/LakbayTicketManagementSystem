    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Forms;

import UtilityClasses.Driver;
import UtilityClasses.JTextFieldCharLimit;

import com.formdev.flatlaf.FlatIntelliJLaf;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.mysql.cj.jdbc.result.ResultSetMetaData;
import com.mysql.cj.xdevapi.Statement;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author clare
 */
public class AddDriver extends javax.swing.JFrame {

    /**
     * Creates new form AddBus
     */
    public AddDriver() {
        initComponents();
        sqlConnect();
        fetch();
        setID();
        
        contactNoField.setDocument(new JTextFieldCharLimit(11));
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
        headerPanel = new javax.swing.JPanel();
        ovrvwTxt2 = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();
        passengerDetailsPanel = new javax.swing.JPanel();
        ovrvwTxt = new javax.swing.JLabel();
        lastNameField = new javax.swing.JTextField();
        firstNameField = new javax.swing.JTextField();
        middleNameField = new javax.swing.JTextField();
        emailField = new javax.swing.JTextField();
        contactNoField = new javax.swing.JTextField();
        driverIdField = new javax.swing.JTextField();
        addDriverBtn = new javax.swing.JButton();
        clearForm = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        driverTable = new javax.swing.JTable();
        warningTxt = new javax.swing.JLabel();
        editSelectedBtn = new javax.swing.JButton();
        conEditBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        rootPanel.setPreferredSize(new java.awt.Dimension(1280, 720));

        headerPanel.setBackground(new java.awt.Color(255, 255, 255));
        headerPanel.setPreferredSize(new java.awt.Dimension(1280, 70));

        ovrvwTxt2.setFont(new java.awt.Font("Open Sans", 1, 20)); // NOI18N
        ovrvwTxt2.setForeground(new java.awt.Color(255, 159, 28));
        ovrvwTxt2.setText("ADD DRIVER");

        backBtn.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        backBtn.setForeground(new java.awt.Color(255, 159, 28));
        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout headerPanelLayout = new javax.swing.GroupLayout(headerPanel);
        headerPanel.setLayout(headerPanelLayout);
        headerPanelLayout.setHorizontalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPanelLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(backBtn)
                .addGap(482, 482, 482)
                .addComponent(ovrvwTxt2)
                .addContainerGap(573, Short.MAX_VALUE))
        );
        headerPanelLayout.setVerticalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPanelLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ovrvwTxt2)
                    .addComponent(backBtn))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        passengerDetailsPanel.setBackground(new java.awt.Color(255, 255, 255));
        passengerDetailsPanel.setPreferredSize(new java.awt.Dimension(373, 620));

        ovrvwTxt.setFont(new java.awt.Font("Open Sans", 1, 20)); // NOI18N
        ovrvwTxt.setForeground(new java.awt.Color(255, 159, 28));
        ovrvwTxt.setText("Staff Details");

        lastNameField.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
        lastNameField.setToolTipText("HELLO");
        lastNameField.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 2, true), "Last Name:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Open Sans", 0, 14), new java.awt.Color(102, 102, 102))); // NOI18N

        firstNameField.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
        firstNameField.setToolTipText("HELLO");
        firstNameField.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 2, true), "First Name:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Open Sans", 0, 14), new java.awt.Color(102, 102, 102))); // NOI18N

        middleNameField.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
        middleNameField.setToolTipText("HELLO");
        middleNameField.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 2, true), "Middle Name (Optional)", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Open Sans", 0, 14), new java.awt.Color(102, 102, 102))); // NOI18N

        emailField.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
        emailField.setToolTipText("HELLO");
        emailField.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 2, true), "Email:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Open Sans", 0, 14), new java.awt.Color(102, 102, 102))); // NOI18N

        contactNoField.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
        contactNoField.setToolTipText("HELLO");
        contactNoField.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 2, true), "Contact No.:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Open Sans", 0, 14), new java.awt.Color(102, 102, 102))); // NOI18N
        contactNoField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contactNoFieldActionPerformed(evt);
            }
        });
        contactNoField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                contactNoFieldKeyTyped(evt);
            }
        });

        driverIdField.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
        driverIdField.setToolTipText("HELLO");
        driverIdField.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 2, true), "Driver ID:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Open Sans", 0, 14), new java.awt.Color(102, 102, 102))); // NOI18N
        driverIdField.setEnabled(false);

        javax.swing.GroupLayout passengerDetailsPanelLayout = new javax.swing.GroupLayout(passengerDetailsPanel);
        passengerDetailsPanel.setLayout(passengerDetailsPanelLayout);
        passengerDetailsPanelLayout.setHorizontalGroup(
            passengerDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(passengerDetailsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(passengerDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(emailField)
                    .addComponent(contactNoField)
                    .addComponent(lastNameField)
                    .addComponent(middleNameField)
                    .addComponent(firstNameField)
                    .addComponent(driverIdField))
                .addGap(15, 15, 15))
            .addGroup(passengerDetailsPanelLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(ovrvwTxt)
                .addContainerGap(259, Short.MAX_VALUE))
        );
        passengerDetailsPanelLayout.setVerticalGroup(
            passengerDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(passengerDetailsPanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(ovrvwTxt)
                .addGap(18, 18, 18)
                .addComponent(driverIdField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(firstNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(middleNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(lastNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(contactNoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );

        addDriverBtn.setBackground(new java.awt.Color(255, 159, 28));
        addDriverBtn.setFont(new java.awt.Font("Open Sans", 0, 16)); // NOI18N
        addDriverBtn.setForeground(new java.awt.Color(255, 255, 255));
        addDriverBtn.setText("Add");
        addDriverBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 159, 28), 1, true));
        addDriverBtn.setPreferredSize(new java.awt.Dimension(104, 39));
        addDriverBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addDriverBtnActionPerformed(evt);
            }
        });

        clearForm.setBackground(new java.awt.Color(242, 242, 242));
        clearForm.setFont(new java.awt.Font("Open Sans", 0, 16)); // NOI18N
        clearForm.setForeground(new java.awt.Color(28, 162, 150));
        clearForm.setText("Clear");
        clearForm.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(28, 162, 150), 2, true));
        clearForm.setPreferredSize(new java.awt.Dimension(104, 39));
        clearForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearFormActionPerformed(evt);
            }
        });

        driverTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Driver ID", "First Name", "Middle Name", "Last Name", "Contact Number", "Email"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(driverTable);
        if (driverTable.getColumnModel().getColumnCount() > 0) {
            driverTable.getColumnModel().getColumn(0).setResizable(false);
        }

        warningTxt.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
        warningTxt.setForeground(new java.awt.Color(204, 0, 0));
        warningTxt.setToolTipText("");

        editSelectedBtn.setBackground(new java.awt.Color(255, 159, 28));
        editSelectedBtn.setFont(new java.awt.Font("Open Sans", 0, 16)); // NOI18N
        editSelectedBtn.setForeground(new java.awt.Color(255, 255, 255));
        editSelectedBtn.setText("Edit Selected");
        editSelectedBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 159, 28), 1, true));
        editSelectedBtn.setPreferredSize(new java.awt.Dimension(104, 39));
        editSelectedBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editSelectedBtnActionPerformed(evt);
            }
        });

        conEditBtn.setBackground(new java.awt.Color(255, 159, 28));
        conEditBtn.setFont(new java.awt.Font("Open Sans", 0, 16)); // NOI18N
        conEditBtn.setForeground(new java.awt.Color(255, 255, 255));
        conEditBtn.setText("Confirm Edit");
        conEditBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 159, 28), 1, true));
        conEditBtn.setEnabled(false);
        conEditBtn.setPreferredSize(new java.awt.Dimension(104, 39));
        conEditBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conEditBtnActionPerformed(evt);
            }
        });

        deleteBtn.setBackground(new java.awt.Color(255, 159, 28));
        deleteBtn.setFont(new java.awt.Font("Open Sans", 0, 16)); // NOI18N
        deleteBtn.setForeground(new java.awt.Color(255, 255, 255));
        deleteBtn.setText("Delete Selected");
        deleteBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 159, 28), 1, true));
        deleteBtn.setPreferredSize(new java.awt.Dimension(104, 39));
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout rootPanelLayout = new javax.swing.GroupLayout(rootPanel);
        rootPanel.setLayout(rootPanelLayout);
        rootPanelLayout.setHorizontalGroup(
            rootPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rootPanelLayout.createSequentialGroup()
                .addComponent(headerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(rootPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(passengerDetailsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(rootPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(clearForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(warningTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 467, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(rootPanelLayout.createSequentialGroup()
                        .addComponent(addDriverBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(editSelectedBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(conEditBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(92, 92, 92)
                        .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 852, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        rootPanelLayout.setVerticalGroup(
            rootPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rootPanelLayout.createSequentialGroup()
                .addComponent(headerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(rootPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(rootPanelLayout.createSequentialGroup()
                        .addComponent(passengerDetailsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 18, Short.MAX_VALUE))
                    .addGroup(rootPanelLayout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(rootPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addDriverBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(editSelectedBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(conEditBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(clearForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(warningTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
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

    
    static boolean editingMode;
    
    // REGION - sql connection
    
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Statement st;
    
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
    
    // END REGION 
    
    // REGION - methods
    
    public boolean isFieldEmpty()
    {
        if(driverIdField.getText().isEmpty() || firstNameField.getText().isEmpty() || lastNameField.getText().isEmpty() || contactNoField.getText().isEmpty() || emailField.getText().isEmpty())
        {
            return true;
        }
        
        return false;
    }
    
    public void clearFields()
    {
        driverIdField.setText("");
        firstNameField.setText("");
        middleNameField.setText("");
        lastNameField.setText("");
        contactNoField.setText("");
        emailField.setText("");
        warningTxt.setText("");
        
        setID();
    }
    
    public void fetch()
    {
        int q;
        String query = "SELECT * FROM driver";
        
        try {
            ps = con.prepareStatement(query);
            rs = ps.executeQuery();
            java.sql.ResultSetMetaData rss = rs.getMetaData();
            q = rss.getColumnCount();
            
            DefaultTableModel df = (DefaultTableModel)driverTable.getModel();
            df.setRowCount(0);
            
            while (rs.next()) {                
                Vector v2 = new Vector();
                for(int a=1; a<=q; a++)
                {
                    v2.add(rs.getString("driver_id"));
                    v2.add(rs.getString("first_name"));
                    v2.add(rs.getString("middle_name")); 
                    v2.add(rs.getString("last_name")); 
                    v2.add(rs.getString("contact_number")); 
                    v2.add(rs.getString("email_address")); 
                }
                df.addRow(v2);
            }
        
        } catch (SQLException ex) {
            Logger.getLogger(AddStaff.class.getName()).log(Level.SEVERE, null, ex);
        } 
    
    }
    
    public int countRec()
    {
        String query = "SELECT count(*) FROM driver";
        
        try {
            ps = con.prepareStatement(query);
            rs = ps.executeQuery();
            
            rs.next();
            return rs.getInt(1);
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(AddStaff.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return 0;
    }
    
    public boolean isSameId(String id)
    {
        try {
            String query = "SELECT * FROM driver WHERE driver_id = ?";
            
            ps = con.prepareStatement(query);
            ps.setString(1, id);
            
            rs = ps.executeQuery();
            
            while(rs.next())
            {
                String idc = rs.getString("driver_id");
                
                if(idc.equals(id))
                {
                  return true;
                }
                
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(AddDriver.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return false;
    }
    
    public void setID()
    {  
            int id = 1;
            String initFormat = String.format("%03d", id);
            String initDrvId = "DR-" + initFormat;

            while(isSameId(initDrvId))
            {
                id++;
                initDrvId = "DR-" + String.format("%03d", id);
            }   

            driverIdField.setText(initDrvId);
    }
    
    public void inserRecord()
    {
        try {
            sqlConnect();
            Driver dr = new Driver();
            
            dr.setDriverID(driverIdField.getText());
            dr.setfName(firstNameField.getText());
            dr.setmName(middleNameField.getText());
            dr.setlName(lastNameField.getText());
            dr.setPhoneNo(contactNoField.getText());
            dr.setEmail(emailField.getText());
            
            String query = "INSERT INTO driver "
                    + "(driver_id, first_name, middle_name, last_name, contact_number, email_address) VALUES "
                    + "(?,?,?,?,?,?)";
            ps = con.prepareStatement(query);
            
            ps.setString(1, dr.getDriverID());
            ps.setString(2, dr.getfName());
            ps.setString(3, dr.getmName());
            ps.setString(4, dr.getlName());
            ps.setString(5, dr.getPhoneNo());
            ps.setString(6, dr.getEmail());
            
            int k = ps.executeUpdate();
            
            if (k == 1) {
                JOptionPane.showMessageDialog(this, "Record Added Successfuly");
                fetch();
                
            }else
            {
                JOptionPane.showMessageDialog(this, "Record is not added");
            } 
        } catch (Exception e) {
            System.out.println("may error: " + e);
        }
    }
    
    public void searchInDb(String pk)
    {
        try {
            String query = "SELECT * FROM driver WHERE driver_id = ?";
            ps = con.prepareStatement(query);
            ps.setString(1, pk);
            
            rs = ps.executeQuery();
            
            while(rs.next())
            {
                driverIdField.setText(rs.getString("driver_id"));
                firstNameField.setText(rs.getString("first_name"));
                middleNameField.setText(rs.getString("middle_name"));
                lastNameField.setText(rs.getString("last_name"));
                contactNoField.setText(rs.getString("contact_number"));
                emailField.setText(rs.getString("email_address"));              
            }
            
        } catch (Exception e) {
        }
    }
    
    public void updateRecord(String pk)
    {
        
        try {
            sqlConnect();
            String query = "UPDATE driver SET "
                    + "driver_id = ?, first_name = ?, middle_name = ?, last_name = ?, contact_number = ?, email_address = ? "
                    + "WHERE driver_id = ?";
            
            Driver dr = new Driver();
            
            dr.setDriverID(driverIdField.getText());
            dr.setfName(firstNameField.getText());
            dr.setmName(middleNameField.getText());
            dr.setlName(lastNameField.getText());
            dr.setPhoneNo(contactNoField.getText());
            dr.setEmail(emailField.getText());
            
            ps = con.prepareStatement(query);
            
            ps.setString(1, dr.getDriverID());
            ps.setString(2, dr.getfName());
            ps.setString(3, dr.getmName());
            ps.setString(4, dr.getlName());
            ps.setString(5, dr.getPhoneNo());
            ps.setString(6, dr.getEmail());
            ps.setString(7, dr.getDriverID());
            
            int k = ps.executeUpdate();
            
            if(k==1)
            {
                JOptionPane.showMessageDialog(this, "Record Updated Successfuly");
            }
            
            
        } catch (Exception e) {
        }     
    }
    
    public void deleteRecord(String d)
    {
        String query = "DELETE FROM driver WHERE driver_id = ?";
        
        try {
            ps = con.prepareStatement(query);
            ps.setString(1, d);
            
            int k = ps.executeUpdate();
            
            if(k==1)
            {
                JOptionPane.showMessageDialog(rootPane, d + " has been deleted from the record.", "Delete Success", JOptionPane.OK_OPTION);
                
            }
                    
        } catch (SQLException ex) {
            Logger.getLogger(ViewStaff.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    //END REGION
    
    // REGION - button events
    
    private void addDriverBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addDriverBtnActionPerformed
        // TODO add your handling code here:
        
        if (!isFieldEmpty()) {
            //ADD TO DB
            inserRecord();
            clearFields();
            setID();
        }
        else if(isFieldEmpty())
        {
            warningTxt.setText("Make sure to fill all required spaces.");
        }
        

    }//GEN-LAST:event_addDriverBtnActionPerformed

    private void clearFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearFormActionPerformed
        // TODO add your handling code here:
        if (!editingMode) {
            clearFields();
        }
        else if(editingMode)
        {
            clearFields();
            editingMode = false;
            conEditBtn.setEnabled(false);
            editSelectedBtn.setEnabled(true);
            addDriverBtn.setEnabled(true);  
        }
        
    }//GEN-LAST:event_clearFormActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        HomePage hp = new HomePage();
        hp.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_backBtnActionPerformed

    private void editSelectedBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editSelectedBtnActionPerformed
        // TODO add your handling code here:
        editingMode = true;
        conEditBtn.setEnabled(true);
        editSelectedBtn.setEnabled(false);
        addDriverBtn.setEnabled(false);
        
        int column = 0;
        int row = driverTable.getSelectedRow();
        
        if(row >= 0)
        {
           String val = driverTable.getModel().getValueAt(row, column).toString();
           
           searchInDb(val);
           
        }
        else
        {
            // walang naka select
        }
        
        
    }//GEN-LAST:event_editSelectedBtnActionPerformed

    private void conEditBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_conEditBtnActionPerformed
        // TODO add your handling code here:
        if (!isFieldEmpty()) {
            //ADD TO DB
            updateRecord(driverIdField.getText());
            fetch();
            clearFields();
            setID();
            
            conEditBtn.setEnabled(false);
            editSelectedBtn.setEnabled(true);
            addDriverBtn.setEnabled(true);  
            
        }
        else if(isFieldEmpty())
        {
            warningTxt.setText("Make sure to fill all reuqired spaces.");
        }
    }//GEN-LAST:event_conEditBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        // TODO add your handling code here:
        
        int column = 0;
        int row = driverTable.getSelectedRow();
        
        if (row >= 0) {
            String val = driverTable.getModel().getValueAt(row, column).toString();
        
            //System.out.println(val);
        
            Object[] options = { "CONFIRM", "CANCEL" };
            int choice = JOptionPane.showOptionDialog(null, "You are deleting: " + val, "Warning",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE,
                    null, options, options[0]);
        
            if(choice == 0)
            {
                deleteRecord(val);
                fetch();
                setID();
            }
        }
        else
        {
            //WALANNG NAKA SELECT
        }
        
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void contactNoFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contactNoFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contactNoFieldActionPerformed

    private void contactNoFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_contactNoFieldKeyTyped
        // TODO add your handling code here:
        
        char c = evt.getKeyChar();
        if(!Character.isDigit(c))
        {
            evt.consume();
        }
        
    }//GEN-LAST:event_contactNoFieldKeyTyped
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // region Set the Look and Feel of the Project
        try {
            UIManager.setLookAndFeel(new FlatIntelliJLaf());
        } catch (UnsupportedLookAndFeelException e) {
            
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddDriver().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addDriverBtn;
    private javax.swing.JButton backBtn;
    private javax.swing.JButton clearForm;
    private javax.swing.JButton conEditBtn;
    private javax.swing.JTextField contactNoField;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JTextField driverIdField;
    private javax.swing.JTable driverTable;
    private javax.swing.JButton editSelectedBtn;
    private javax.swing.JTextField emailField;
    private javax.swing.JTextField firstNameField;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField lastNameField;
    private javax.swing.JTextField middleNameField;
    private javax.swing.JLabel ovrvwTxt;
    private javax.swing.JLabel ovrvwTxt2;
    private javax.swing.JPanel passengerDetailsPanel;
    private javax.swing.JPanel rootPanel;
    private javax.swing.JLabel warningTxt;
    // End of variables declaration//GEN-END:variables
}
