/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Forms;

import com.formdev.flatlaf.FlatIntelliJLaf;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author clare
 */
public class HomePage extends javax.swing.JFrame {

    /**
     * Creates new form HomePage
     */
    public HomePage() {
        initComponents();
    }
    
    String userName;

    HomePage(String u) {
        initComponents();
        this.userName = u;
        //userNameAppear.setText("Hello, " + userName + "!");
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
        overviewPanel = new javax.swing.JPanel();
        noTickets = new javax.swing.JLabel();
        ttlTickets = new javax.swing.JLabel();
        noRoutes = new javax.swing.JLabel();
        ttlRoutes = new javax.swing.JLabel();
        noBuses = new javax.swing.JLabel();
        ttlBuses = new javax.swing.JLabel();
        tIxIcon = new javax.swing.JLabel();
        tIxIcon1 = new javax.swing.JLabel();
        noBuses1 = new javax.swing.JLabel();
        ttlBuses1 = new javax.swing.JLabel();
        tIxIcon2 = new javax.swing.JLabel();
        tIxIcon3 = new javax.swing.JLabel();
        ovrvwTxt = new javax.swing.JLabel();
        ticketPanel = new javax.swing.JPanel();
        ttlTxt1 = new javax.swing.JLabel();
        tixDesc = new javax.swing.JLabel();
        addTicketsBtn = new javax.swing.JButton();
        viewTicketsBtn = new javax.swing.JButton();
        busPanel = new javax.swing.JPanel();
        ttlTxt2 = new javax.swing.JLabel();
        busDesc = new javax.swing.JLabel();
        addBusBtn = new javax.swing.JButton();
        busPanel1 = new javax.swing.JPanel();
        ttlTxt3 = new javax.swing.JLabel();
        drvrDesc = new javax.swing.JLabel();
        addDriversBtn = new javax.swing.JButton();
        busPanel2 = new javax.swing.JPanel();
        ttlTxt4 = new javax.swing.JLabel();
        routeDesc = new javax.swing.JLabel();
        addRoutesBtn = new javax.swing.JButton();
        ttlTickets1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        rootPanel.setPreferredSize(new java.awt.Dimension(1280, 720));

        menuPanel.setBackground(new java.awt.Color(255, 255, 255));
        menuPanel.setPreferredSize(new java.awt.Dimension(227, 720));

        javax.swing.GroupLayout menuPanelLayout = new javax.swing.GroupLayout(menuPanel);
        menuPanel.setLayout(menuPanelLayout);
        menuPanelLayout.setHorizontalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 227, Short.MAX_VALUE)
        );
        menuPanelLayout.setVerticalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 720, Short.MAX_VALUE)
        );

        overviewPanel.setBackground(new java.awt.Color(255, 255, 255));
        overviewPanel.setPreferredSize(new java.awt.Dimension(1009, 112));

        noTickets.setFont(new java.awt.Font("Open Sans", 1, 23)); // NOI18N
        noTickets.setForeground(new java.awt.Color(255, 159, 28));
        noTickets.setText("000");

        ttlTickets.setFont(new java.awt.Font("Open Sans", 0, 15)); // NOI18N
        ttlTickets.setForeground(new java.awt.Color(85, 85, 85));
        ttlTickets.setText("Total Ticketss");

        noRoutes.setFont(new java.awt.Font("Open Sans", 1, 23)); // NOI18N
        noRoutes.setForeground(new java.awt.Color(255, 159, 28));
        noRoutes.setText("000");

        ttlRoutes.setFont(new java.awt.Font("Open Sans", 0, 15)); // NOI18N
        ttlRoutes.setForeground(new java.awt.Color(85, 85, 85));
        ttlRoutes.setText("Total Routes");

        noBuses.setFont(new java.awt.Font("Open Sans", 1, 23)); // NOI18N
        noBuses.setForeground(new java.awt.Color(255, 159, 28));
        noBuses.setText("000");

        ttlBuses.setFont(new java.awt.Font("Open Sans", 0, 15)); // NOI18N
        ttlBuses.setForeground(new java.awt.Color(85, 85, 85));
        ttlBuses.setText("Total Buses");

        tIxIcon.setFont(new java.awt.Font("Open Sans", 0, 15)); // NOI18N
        tIxIcon.setForeground(new java.awt.Color(85, 85, 85));
        tIxIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Icons/Ticket-64x64.png"))); // NOI18N

        tIxIcon1.setFont(new java.awt.Font("Open Sans", 0, 15)); // NOI18N
        tIxIcon1.setForeground(new java.awt.Color(85, 85, 85));
        tIxIcon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Icons/driver-64x64.png"))); // NOI18N

        noBuses1.setFont(new java.awt.Font("Open Sans", 1, 23)); // NOI18N
        noBuses1.setForeground(new java.awt.Color(255, 159, 28));
        noBuses1.setText("000");

        ttlBuses1.setFont(new java.awt.Font("Open Sans", 0, 15)); // NOI18N
        ttlBuses1.setForeground(new java.awt.Color(85, 85, 85));
        ttlBuses1.setText("Total Drivers");

        tIxIcon2.setFont(new java.awt.Font("Open Sans", 0, 15)); // NOI18N
        tIxIcon2.setForeground(new java.awt.Color(85, 85, 85));
        tIxIcon2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Icons/route-64x64.png"))); // NOI18N

        tIxIcon3.setFont(new java.awt.Font("Open Sans", 0, 15)); // NOI18N
        tIxIcon3.setForeground(new java.awt.Color(85, 85, 85));
        tIxIcon3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Icons/bus-64x64.png"))); // NOI18N

        javax.swing.GroupLayout overviewPanelLayout = new javax.swing.GroupLayout(overviewPanel);
        overviewPanel.setLayout(overviewPanelLayout);
        overviewPanelLayout.setHorizontalGroup(
            overviewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(overviewPanelLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(tIxIcon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(overviewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ttlTickets)
                    .addComponent(noTickets))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 93, Short.MAX_VALUE)
                .addComponent(tIxIcon2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(overviewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ttlRoutes)
                    .addComponent(noRoutes))
                .addGap(80, 80, 80)
                .addComponent(tIxIcon1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(overviewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ttlBuses1)
                    .addComponent(noBuses1))
                .addGap(77, 77, 77)
                .addComponent(tIxIcon3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(overviewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ttlBuses)
                    .addComponent(noBuses))
                .addGap(59, 59, 59))
        );
        overviewPanelLayout.setVerticalGroup(
            overviewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(overviewPanelLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(overviewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tIxIcon3)
                    .addComponent(tIxIcon1)
                    .addComponent(tIxIcon)
                    .addGroup(overviewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(overviewPanelLayout.createSequentialGroup()
                            .addComponent(ttlBuses)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(noBuses))
                        .addGroup(overviewPanelLayout.createSequentialGroup()
                            .addComponent(ttlRoutes)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(noRoutes))
                        .addGroup(overviewPanelLayout.createSequentialGroup()
                            .addComponent(ttlTickets)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(noTickets))
                        .addGroup(overviewPanelLayout.createSequentialGroup()
                            .addComponent(ttlBuses1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(noBuses1)))
                    .addComponent(tIxIcon2))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        ovrvwTxt.setFont(new java.awt.Font("Open Sans", 1, 20)); // NOI18N
        ovrvwTxt.setForeground(new java.awt.Color(255, 159, 28));
        ovrvwTxt.setText("Overview");

        ticketPanel.setBackground(new java.awt.Color(28, 162, 150));
        ticketPanel.setPreferredSize(new java.awt.Dimension(322, 192));

        ttlTxt1.setFont(new java.awt.Font("Open Sans", 1, 28)); // NOI18N
        ttlTxt1.setForeground(new java.awt.Color(255, 255, 255));
        ttlTxt1.setText("Tickets");

        tixDesc.setFont(new java.awt.Font("Open Sans", 0, 17)); // NOI18N
        tixDesc.setForeground(new java.awt.Color(255, 255, 255));
        tixDesc.setText("Manange bookings, and  add tickets.");

        addTicketsBtn.setBackground(new java.awt.Color(255, 159, 28));
        addTicketsBtn.setFont(new java.awt.Font("Open Sans", 0, 16)); // NOI18N
        addTicketsBtn.setForeground(new java.awt.Color(255, 255, 255));
        addTicketsBtn.setText("Add Now");
        addTicketsBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 159, 28), 1, true));
        addTicketsBtn.setPreferredSize(new java.awt.Dimension(104, 39));
        addTicketsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addTicketsBtnActionPerformed(evt);
            }
        });

        viewTicketsBtn.setBackground(new java.awt.Color(28, 162, 150));
        viewTicketsBtn.setFont(new java.awt.Font("Open Sans", 0, 16)); // NOI18N
        viewTicketsBtn.setForeground(new java.awt.Color(255, 255, 255));
        viewTicketsBtn.setText("View All");
        viewTicketsBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        viewTicketsBtn.setPreferredSize(new java.awt.Dimension(104, 39));
        viewTicketsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewTicketsBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ticketPanelLayout = new javax.swing.GroupLayout(ticketPanel);
        ticketPanel.setLayout(ticketPanelLayout);
        ticketPanelLayout.setHorizontalGroup(
            ticketPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ticketPanelLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(ticketPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ticketPanelLayout.createSequentialGroup()
                        .addComponent(addTicketsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(viewTicketsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(tixDesc)
                    .addComponent(ttlTxt1))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        ticketPanelLayout.setVerticalGroup(
            ticketPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ticketPanelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(ttlTxt1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tixDesc)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(ticketPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addTicketsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(viewTicketsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );

        busPanel.setBackground(new java.awt.Color(255, 255, 255));
        busPanel.setPreferredSize(new java.awt.Dimension(246, 147));

        ttlTxt2.setFont(new java.awt.Font("Open Sans", 1, 28)); // NOI18N
        ttlTxt2.setForeground(new java.awt.Color(255, 159, 28));
        ttlTxt2.setText("Bus");

        busDesc.setFont(new java.awt.Font("Open Sans", 0, 17)); // NOI18N
        busDesc.setForeground(new java.awt.Color(51, 51, 51));
        busDesc.setText("Add buses and assign drivers");

        addBusBtn.setBackground(new java.awt.Color(28, 162, 150));
        addBusBtn.setFont(new java.awt.Font("Open Sans", 0, 16)); // NOI18N
        addBusBtn.setForeground(new java.awt.Color(255, 255, 255));
        addBusBtn.setText("Add Now");
        addBusBtn.setBorder(null);
        addBusBtn.setPreferredSize(new java.awt.Dimension(104, 39));
        addBusBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBusBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout busPanelLayout = new javax.swing.GroupLayout(busPanel);
        busPanel.setLayout(busPanelLayout);
        busPanelLayout.setHorizontalGroup(
            busPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(busPanelLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(busPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addBusBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(busDesc)
                    .addComponent(ttlTxt2))
                .addContainerGap(84, Short.MAX_VALUE))
        );
        busPanelLayout.setVerticalGroup(
            busPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(busPanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(ttlTxt2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(busDesc)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(addBusBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        busPanel1.setBackground(new java.awt.Color(255, 255, 255));
        busPanel1.setPreferredSize(new java.awt.Dimension(246, 147));

        ttlTxt3.setFont(new java.awt.Font("Open Sans", 1, 28)); // NOI18N
        ttlTxt3.setForeground(new java.awt.Color(255, 159, 28));
        ttlTxt3.setText("Drivers");

        drvrDesc.setFont(new java.awt.Font("Open Sans", 0, 17)); // NOI18N
        drvrDesc.setForeground(new java.awt.Color(51, 51, 51));
        drvrDesc.setText("Add and manage drivers.");

        addDriversBtn.setBackground(new java.awt.Color(28, 162, 150));
        addDriversBtn.setFont(new java.awt.Font("Open Sans", 0, 16)); // NOI18N
        addDriversBtn.setForeground(new java.awt.Color(255, 255, 255));
        addDriversBtn.setText("Add Now");
        addDriversBtn.setBorder(null);
        addDriversBtn.setPreferredSize(new java.awt.Dimension(104, 39));
        addDriversBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addDriversBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout busPanel1Layout = new javax.swing.GroupLayout(busPanel1);
        busPanel1.setLayout(busPanel1Layout);
        busPanel1Layout.setHorizontalGroup(
            busPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(busPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(busPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addDriversBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(drvrDesc)
                    .addComponent(ttlTxt3))
                .addContainerGap(115, Short.MAX_VALUE))
        );
        busPanel1Layout.setVerticalGroup(
            busPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(busPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(ttlTxt3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(drvrDesc)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(addDriversBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        busPanel2.setBackground(new java.awt.Color(255, 255, 255));
        busPanel2.setPreferredSize(new java.awt.Dimension(246, 147));

        ttlTxt4.setFont(new java.awt.Font("Open Sans", 1, 28)); // NOI18N
        ttlTxt4.setForeground(new java.awt.Color(255, 159, 28));
        ttlTxt4.setText("Routes");

        routeDesc.setFont(new java.awt.Font("Open Sans", 0, 17)); // NOI18N
        routeDesc.setForeground(new java.awt.Color(51, 51, 51));
        routeDesc.setText("Manage routes and departure. ");

        addRoutesBtn.setBackground(new java.awt.Color(28, 162, 150));
        addRoutesBtn.setFont(new java.awt.Font("Open Sans", 0, 16)); // NOI18N
        addRoutesBtn.setForeground(new java.awt.Color(255, 255, 255));
        addRoutesBtn.setText("Add Now");
        addRoutesBtn.setBorder(null);
        addRoutesBtn.setPreferredSize(new java.awt.Dimension(104, 39));
        addRoutesBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addRoutesBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout busPanel2Layout = new javax.swing.GroupLayout(busPanel2);
        busPanel2.setLayout(busPanel2Layout);
        busPanel2Layout.setHorizontalGroup(
            busPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(busPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(busPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addRoutesBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(routeDesc)
                    .addComponent(ttlTxt4))
                .addContainerGap(67, Short.MAX_VALUE))
        );
        busPanel2Layout.setVerticalGroup(
            busPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(busPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(ttlTxt4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(routeDesc)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(addRoutesBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        ttlTickets1.setFont(new java.awt.Font("Open Sans", 0, 15)); // NOI18N
        ttlTickets1.setForeground(new java.awt.Color(85, 85, 85));
        ttlTickets1.setText("USER001");

        javax.swing.GroupLayout rootPanelLayout = new javax.swing.GroupLayout(rootPanel);
        rootPanel.setLayout(rootPanelLayout);
        rootPanelLayout.setHorizontalGroup(
            rootPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rootPanelLayout.createSequentialGroup()
                .addComponent(menuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(rootPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(rootPanelLayout.createSequentialGroup()
                        .addComponent(ticketPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(busPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(busPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(busPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(rootPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(rootPanelLayout.createSequentialGroup()
                            .addComponent(ovrvwTxt)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ttlTickets1))
                        .addComponent(overviewPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 26, Short.MAX_VALUE))
        );
        rootPanelLayout.setVerticalGroup(
            rootPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rootPanelLayout.createSequentialGroup()
                .addComponent(menuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(rootPanelLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(rootPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ovrvwTxt)
                    .addComponent(ttlTickets1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(overviewPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(rootPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(busPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ticketPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(busPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(busPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void addTicketsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addTicketsBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addTicketsBtnActionPerformed

    private void viewTicketsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewTicketsBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_viewTicketsBtnActionPerformed

    private void addBusBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBusBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addBusBtnActionPerformed

    private void addDriversBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addDriversBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addDriversBtnActionPerformed

    private void addRoutesBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addRoutesBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addRoutesBtnActionPerformed

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
                new HomePage().setVisible(true);
            }
        });
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBusBtn;
    private javax.swing.JButton addDriversBtn;
    private javax.swing.JButton addRoutesBtn;
    private javax.swing.JButton addTicketsBtn;
    private javax.swing.JLabel busDesc;
    private javax.swing.JPanel busPanel;
    private javax.swing.JPanel busPanel1;
    private javax.swing.JPanel busPanel2;
    private javax.swing.JLabel drvrDesc;
    private javax.swing.JPanel menuPanel;
    private javax.swing.JLabel noBuses;
    private javax.swing.JLabel noBuses1;
    private javax.swing.JLabel noRoutes;
    private javax.swing.JLabel noTickets;
    private javax.swing.JPanel overviewPanel;
    private javax.swing.JLabel ovrvwTxt;
    private javax.swing.JPanel rootPanel;
    private javax.swing.JLabel routeDesc;
    private javax.swing.JLabel tIxIcon;
    private javax.swing.JLabel tIxIcon1;
    private javax.swing.JLabel tIxIcon2;
    private javax.swing.JLabel tIxIcon3;
    private javax.swing.JPanel ticketPanel;
    private javax.swing.JLabel tixDesc;
    private javax.swing.JLabel ttlBuses;
    private javax.swing.JLabel ttlBuses1;
    private javax.swing.JLabel ttlRoutes;
    private javax.swing.JLabel ttlTickets;
    private javax.swing.JLabel ttlTickets1;
    private javax.swing.JLabel ttlTxt1;
    private javax.swing.JLabel ttlTxt2;
    private javax.swing.JLabel ttlTxt3;
    private javax.swing.JLabel ttlTxt4;
    private javax.swing.JButton viewTicketsBtn;
    // End of variables declaration//GEN-END:variables
}
