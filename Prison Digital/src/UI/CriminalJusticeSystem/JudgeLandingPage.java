/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.CriminalJusticeSystem;

import Model.CriminalJusticeSystem.Case;
import Model.CriminalJusticeSystem.CaseDirectory;
import Model.CriminalJusticeSystem.Court;
import Model.CriminalJusticeSystem.CriminalJusticeSystem;
import Model.DB4OUtil.DB4OUtil;
import Model.Person;
import Model.PrisonEcosystem;
import Model.UserAccountManagement.UserAccount;
import Model.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author Thejas
 */
public class JudgeLandingPage extends javax.swing.JPanel {

    JPanel container;
    CardLayout layout;
    PrisonEcosystem system;
    Case selectedCase;
    UserAccount account;
    CriminalJusticeSystem criminalJusticeSystem;
    Court currentCourt;
    WorkRequest prisonWorkreq, policeWorkreq;

    /**
     * Creates new form JudgeLandingPage
     *
     * @param container
     * @param account
     * @param system
     */
    public JudgeLandingPage(JPanel container, UserAccount account, PrisonEcosystem system) {
        initComponents();
        this.container = container;
        layout = (CardLayout) container.getLayout();
        this.system = system;
        this.account = account;

        initializeTable();
        lblPrisonWorkrequestFeedback.setEnabled(false);
        lblPoliceWorkrequestFeedback.setEnabled(false);
        txtPrisonWorkrequestFeedback.setEnabled(false);
        txtPoliceWorkrequestFeedback.setEnabled(false);
        btnProvideFeedback.setEnabled(false);
        tblCases.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
            }

            @Override
            public void mousePressed(MouseEvent e) {
                initializeFields();
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }

        });
        lblPrisonWorkrequestFeedback.setEnabled(false);
        lblPoliceWorkrequestFeedback.setEnabled(false);
        txtPrisonWorkrequestFeedback.setEnabled(false);
        txtPoliceWorkrequestFeedback.setEnabled(false);
        btnProvideFeedback.setEnabled(false);
    }

    private void initializeFields() {
        selectedCase = (Case) tblCases.getModel().getValueAt(tblCases.getSelectedRow(), 0);
        txtCaseVerdict.setText(selectedCase.getVerdict());
        txtPersonName.setText(selectedCase.getAccused().getName());
        txtImprisonmentStartDate.setText(selectedCase.getStartDate().toString());
        txtYearsOfImprisonment.setText(selectedCase.getYearsOfImprisonment() + "");
        if (selectedCase.getPrison() == null) {
            jTextField2.setText("Not Assigned");
        } else {
            jTextField2.setText(selectedCase.getPrison().getName());
        }

        if (selectedCase.getProcessingPoliceDepartment() == null) {
            jTextField3.setText("Not Assigned");
        } else {
            jTextField3.setText(selectedCase.getProcessingPoliceDepartment().getName());
        }
        if (selectedCase.getProcessingCourt().getJudge().getUserAccount().getWorkQueue() != null && selectedCase.getProcessingCourt().getJudge().getUserAccount().getWorkQueue().getWorkRequestList() != null) {
            ArrayList<WorkRequest> listOfWorkRequests = selectedCase.getProcessingCourt().getJudge().getUserAccount().getWorkQueue().getWorkRequestList();
            for (WorkRequest listOfWorkRequest : listOfWorkRequests) {
                if (listOfWorkRequest.getPrisoner() != null && listOfWorkRequest.getPrisoner().getName().equals(selectedCase.getAccused().getName())
                        && listOfWorkRequest.getStatus() != null && listOfWorkRequest.getStatus().contains("Prisoner work req")) {

                    prisonWorkreq = listOfWorkRequest;

                }
                if (listOfWorkRequest.getPrisoner() != null && listOfWorkRequest.getPrisoner().getName().equals(selectedCase.getAccused().getName())
                        && listOfWorkRequest.getStatus() != null && listOfWorkRequest.getStatus().contains("Police work req")) {
                    policeWorkreq = listOfWorkRequest;
                }
            }
            if (selectedCase.isImprisoned() && null != prisonWorkreq && (prisonWorkreq.getMessage() == null || prisonWorkreq.getMessage().isEmpty()) && null != policeWorkreq && (policeWorkreq.getMessage() == null || policeWorkreq.getMessage().isEmpty())) {
                lblPrisonWorkrequestFeedback.setEnabled(true);
                lblPoliceWorkrequestFeedback.setEnabled(true);
                txtPrisonWorkrequestFeedback.setEnabled(true);
                txtPoliceWorkrequestFeedback.setEnabled(true);
                btnProvideFeedback.setEnabled(true);
            } else {
                lblPrisonWorkrequestFeedback.setEnabled(false);
                lblPoliceWorkrequestFeedback.setEnabled(false);
                txtPrisonWorkrequestFeedback.setEnabled(false);
                txtPoliceWorkrequestFeedback.setEnabled(false);
                btnProvideFeedback.setEnabled(false);
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblCases = new javax.swing.JTable();
        btnRefresh = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lblPersonName = new javax.swing.JLabel();
        txtPersonName = new javax.swing.JTextField();
        lblCaseVerdict = new javax.swing.JLabel();
        txtCaseVerdict = new javax.swing.JTextField();
        lblImprisonmentStartDate = new javax.swing.JLabel();
        txtImprisonmentStartDate = new javax.swing.JTextField();
        lblYearsOfImprisonment = new javax.swing.JLabel();
        txtYearsOfImprisonment = new javax.swing.JTextField();
        btnCreateCase = new javax.swing.JButton();
        btnUpdateCase = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        btnProvideJudgement = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        lblPrisonWorkrequestFeedback = new javax.swing.JLabel();
        lblPoliceWorkrequestFeedback = new javax.swing.JLabel();
        txtPrisonWorkrequestFeedback = new javax.swing.JTextField();
        txtPoliceWorkrequestFeedback = new javax.swing.JTextField();
        btnProvideFeedback = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblCases.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        tblCases.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Case Number", "Name", "Verdict", "Start date", "Years of Imprisonment", "Imprisoned", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblCases);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 1110, 230));

        btnRefresh.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        btnRefresh.setText("Refresh Table");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });
        add(btnRefresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(838, 320, 290, 40));

        jLabel7.setBackground(new java.awt.Color(71, 120, 197));
        jLabel7.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("   Court Administrator");
        jLabel7.setMaximumSize(new java.awt.Dimension(231, 25));
        jLabel7.setMinimumSize(new java.awt.Dimension(231, 25));
        jLabel7.setOpaque(true);
        jLabel7.setPreferredSize(new java.awt.Dimension(231, 25));
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 1090, 60));

        jPanel1.setBackground(new java.awt.Color(84, 127, 206));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, 60));

        jPanel2.setBackground(new java.awt.Color(242, 248, 255));

        lblPersonName.setFont(new java.awt.Font("Monospaced", 0, 13)); // NOI18N
        lblPersonName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblPersonName.setText("Person Name");

        txtPersonName.setFont(new java.awt.Font("Monospaced", 0, 13)); // NOI18N

        lblCaseVerdict.setFont(new java.awt.Font("Monospaced", 0, 13)); // NOI18N
        lblCaseVerdict.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCaseVerdict.setText("Case verdict");

        txtCaseVerdict.setFont(new java.awt.Font("Monospaced", 0, 13)); // NOI18N
        txtCaseVerdict.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCaseVerdictActionPerformed(evt);
            }
        });

        lblImprisonmentStartDate.setFont(new java.awt.Font("Monospaced", 0, 13)); // NOI18N
        lblImprisonmentStartDate.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblImprisonmentStartDate.setText("Imprisonment start date");

        txtImprisonmentStartDate.setFont(new java.awt.Font("Monospaced", 0, 13)); // NOI18N

        lblYearsOfImprisonment.setFont(new java.awt.Font("Monospaced", 0, 13)); // NOI18N
        lblYearsOfImprisonment.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblYearsOfImprisonment.setText("Years of Imprisonment");

        txtYearsOfImprisonment.setFont(new java.awt.Font("Monospaced", 0, 13)); // NOI18N

        btnCreateCase.setBackground(new java.awt.Color(244, 208, 129));
        btnCreateCase.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        btnCreateCase.setText("Create new Case");
        btnCreateCase.setPreferredSize(new java.awt.Dimension(85, 30));
        btnCreateCase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateCaseActionPerformed(evt);
            }
        });

        btnUpdateCase.setBackground(new java.awt.Color(244, 208, 129));
        btnUpdateCase.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        btnUpdateCase.setText("Update Case");
        btnUpdateCase.setPreferredSize(new java.awt.Dimension(85, 30));
        btnUpdateCase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateCaseActionPerformed(evt);
            }
        });

        jLabel16.setBackground(new java.awt.Color(120, 168, 255));
        jLabel16.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("   Manage Cases");
        jLabel16.setMaximumSize(new java.awt.Dimension(231, 25));
        jLabel16.setMinimumSize(new java.awt.Dimension(231, 25));
        jLabel16.setOpaque(true);
        jLabel16.setPreferredSize(new java.awt.Dimension(231, 25));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPersonName)
                            .addComponent(lblCaseVerdict)
                            .addComponent(lblImprisonmentStartDate)
                            .addComponent(lblYearsOfImprisonment))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPersonName)
                            .addComponent(txtCaseVerdict)
                            .addComponent(txtImprisonmentStartDate)
                            .addComponent(txtYearsOfImprisonment)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnCreateCase, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnUpdateCase, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)))
                .addGap(57, 57, 57))
            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lblPersonName)
                    .addComponent(txtPersonName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lblCaseVerdict)
                    .addComponent(txtCaseVerdict, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lblImprisonmentStartDate)
                    .addComponent(txtImprisonmentStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lblYearsOfImprisonment)
                    .addComponent(txtYearsOfImprisonment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpdateCase, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCreateCase, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 510, 310));

        jPanel3.setBackground(new java.awt.Color(242, 248, 255));

        jLabel1.setFont(new java.awt.Font("Monospaced", 0, 13)); // NOI18N
        jLabel1.setText("Prison Assigned:");

        jTextField2.setFont(new java.awt.Font("Monospaced", 0, 13)); // NOI18N
        jTextField2.setEnabled(false);

        jLabel2.setFont(new java.awt.Font("Monospaced", 0, 13)); // NOI18N
        jLabel2.setText("Police Department Assigned:");

        jTextField3.setFont(new java.awt.Font("Monospaced", 0, 13)); // NOI18N
        jTextField3.setEnabled(false);

        btnProvideJudgement.setBackground(new java.awt.Color(244, 208, 129));
        btnProvideJudgement.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        btnProvideJudgement.setText("Assign prison and police");
        btnProvideJudgement.setPreferredSize(new java.awt.Dimension(85, 30));
        btnProvideJudgement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProvideJudgementActionPerformed(evt);
            }
        });

        jLabel15.setBackground(new java.awt.Color(120, 168, 255));
        jLabel15.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("   Process Case");
        jLabel15.setMaximumSize(new java.awt.Dimension(231, 25));
        jLabel15.setMinimumSize(new java.awt.Dimension(231, 25));
        jLabel15.setOpaque(true);
        jLabel15.setPreferredSize(new java.awt.Dimension(231, 25));

        lblPrisonWorkrequestFeedback.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        lblPrisonWorkrequestFeedback.setText("Feedback for Prison:");

        lblPoliceWorkrequestFeedback.setFont(new java.awt.Font("Monospaced", 0, 13)); // NOI18N
        lblPoliceWorkrequestFeedback.setText("Feedback for Police:");

        txtPrisonWorkrequestFeedback.setFont(new java.awt.Font("Monospaced", 0, 13)); // NOI18N

        txtPoliceWorkrequestFeedback.setFont(new java.awt.Font("Monospaced", 0, 13)); // NOI18N

        btnProvideFeedback.setFont(new java.awt.Font("Monospaced", 0, 13)); // NOI18N
        btnProvideFeedback.setText("Provide Feedback");
        btnProvideFeedback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProvideFeedbackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnProvideJudgement, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnProvideFeedback, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addGap(106, 106, 106)
                                    .addComponent(jTextField2))
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(18, 18, 18)
                                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(lblPrisonWorkrequestFeedback)
                            .addGap(32, 32, 32)
                            .addComponent(txtPrisonWorkrequestFeedback, javax.swing.GroupLayout.DEFAULT_SIZE, 308, Short.MAX_VALUE))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(lblPoliceWorkrequestFeedback)
                            .addGap(32, 32, 32)
                            .addComponent(txtPoliceWorkrequestFeedback))))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnProvideJudgement, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnProvideFeedback, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPrisonWorkrequestFeedback)
                    .addComponent(txtPrisonWorkrequestFeedback, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPoliceWorkrequestFeedback)
                    .addComponent(txtPoliceWorkrequestFeedback, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 370, 570, 310));

        jButton1.setText("Analytics");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 270, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateCaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateCaseActionPerformed
        // TODO add your handling code here:
        if (checkInputFields(txtCaseVerdict) && checkInputFields(txtImprisonmentStartDate) && checkInputFields(txtPersonName) && checkInputFields(txtYearsOfImprisonment)) {
            //Validate
            if(!checkInputFields(txtPersonName, "^[\\p{L} .'-]+$") || !checkInputFields(txtCaseVerdict, "^[\\p{L} .'-]+$")){
                JOptionPane.showMessageDialog(this, "Please enter valid Case details");
                return;
            }
            
            if(!checkInputFields(txtYearsOfImprisonment, "[1-9][0-9]*") || Integer.parseInt(txtYearsOfImprisonment.getText()) > 100){
                JOptionPane.showMessageDialog(this, "Please enter valid Prison Sentence Duration");
                return;
            }
             //date format: dd/mm/yyyy.
            if(!checkInputFields(txtImprisonmentStartDate, "^(3[01]|[12][0-9]|0[1-9])/(1[0-2]|0[1-9])/[0-9]{4}$")){
                JOptionPane.showMessageDialog(this, "Please use valid date format: dd/mm/yyyy");
                return;
            }
            
            Person person = new Person(txtPersonName.getText());

            Case newCase;
            newCase = new Case(txtCaseVerdict.getText(), person, false, txtImprisonmentStartDate.getText(), Integer.parseInt(txtYearsOfImprisonment.getText()), currentCourt);

            prisonWorkreq = new WorkRequest();
            prisonWorkreq.setSender(account);
            prisonWorkreq.setPrisoner(person);
            prisonWorkreq.setStatus("Prisoner work req, New Case");
            newCase.getProcessingCourt().getJudge().getUserAccount().getWorkQueue().getWorkRequestList().add(prisonWorkreq);
            policeWorkreq = new WorkRequest();
            policeWorkreq.setSender(account);
            policeWorkreq.setPrisoner(person);
            policeWorkreq.setStatus("Police work req, New Case");
            newCase.getProcessingCourt().getJudge().getUserAccount().getWorkQueue().getWorkRequestList().add(policeWorkreq);
            currentCourt.getCaseDirectory().addCase(newCase);

            initializeTable();
            resetFields();
            JOptionPane.showMessageDialog(this, "New Case has been added");
            DB4OUtil.storeSystem(system);
        } else {
            JOptionPane.showMessageDialog(this, "Fields cannot be empty for adding a new case");
        }
    }//GEN-LAST:event_btnCreateCaseActionPerformed

    private void btnProvideJudgementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProvideJudgementActionPerformed
        // TODO add your handling code here:
        if (selectedCase != null) {
            JudgementPage judgementPage = new JudgementPage(container, selectedCase, account, criminalJusticeSystem, prisonWorkreq, policeWorkreq, system);
            container.add("judgementPage", judgementPage);
            layout.next(container);
        } else {
            JOptionPane.showMessageDialog(this, "Please select a case from table to assign prison and police to");
        }

    }//GEN-LAST:event_btnProvideJudgementActionPerformed

    public boolean checkInputFields(javax.swing.JTextField txtField) {
        return txtField.getText() != null && !txtField.getText().isEmpty();
    }

    public boolean checkInputFields(javax.swing.JTextField txtField, String regex) {
        return txtField.getText() != null && !txtField.getText().isEmpty() && txtField.getText().matches(regex);
    }

    private void btnUpdateCaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateCaseActionPerformed
        // TODO add your handling code here:
        if (checkInputFields(txtCaseVerdict) && checkInputFields(txtPersonName)) {
            //Validate
            if (!checkInputFields(txtPersonName, "^[\\p{L} .'-]+$") || !checkInputFields(txtCaseVerdict, "^[\\p{L} .'-]+$")) {
                JOptionPane.showMessageDialog(this, "Please enter valid Case details before updating");
                return;
            }

            if (!checkInputFields(txtYearsOfImprisonment, "[1-9][0-9]*") || Integer.parseInt(txtYearsOfImprisonment.getText()) > 100) {
                JOptionPane.showMessageDialog(this, "Please enter valid Prison Sentence Duration before updating");
                return;
            }
            //date format: dd/mm/yyyy.
            if (!checkInputFields(txtImprisonmentStartDate, "^(3[01]|[12][0-9]|0[1-9])/(1[0-2]|0[1-9])/[0-9]{4}$")) {
                JOptionPane.showMessageDialog(this, "Please use valid date format: dd/mm/yyyy");
                return;
            }
            if (selectedCase != null) {
                for (Case cases : currentCourt.getCaseDirectory().getListOfCases()) {
                    if (selectedCase.getCaseNumber() == cases.getCaseNumber()) {
                        cases.setAccused(new Person(txtPersonName.getText()));
                        JOptionPane.showMessageDialog(this, "Case details updated successfully");
                        initializeTable();
                        resetFields();
                        DB4OUtil.storeSystem(system);
                    }
                }
            } else {
                JOptionPane.showMessageDialog(this, "Please select a case to update from the table");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Fields cannot be empty for updating the case");
        }
    }//GEN-LAST:event_btnUpdateCaseActionPerformed

    private void txtCaseVerdictActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCaseVerdictActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCaseVerdictActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        // TODO add your handling code here:
        initializeTable();
        resetFields();
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void btnProvideFeedbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProvideFeedbackActionPerformed
        // TODO add your handling code here:
        if (checkInputFields(txtPrisonWorkrequestFeedback) && checkInputFields(txtPoliceWorkrequestFeedback)) {
            prisonWorkreq.setMessage(txtPrisonWorkrequestFeedback.getText());
            policeWorkreq.setMessage(txtPoliceWorkrequestFeedback.getText());
            JOptionPane.showMessageDialog(this, "Feedback updated successfully");
            lblPrisonWorkrequestFeedback.setEnabled(false);
            lblPoliceWorkrequestFeedback.setEnabled(false);
            txtPrisonWorkrequestFeedback.setEnabled(false);
            txtPoliceWorkrequestFeedback.setEnabled(false);
            btnProvideFeedback.setEnabled(false);
            DB4OUtil.storeSystem(system);
        } else {
            JOptionPane.showMessageDialog(this, "Feedback fields can't be empty");
        }
    }//GEN-LAST:event_btnProvideFeedbackActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        String series1 = "Murder";
        String series2 = "Theft";
        String series3 = "Fraud";
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(245, series1, "2001");
        dataset.addValue(290, series1, "2002");
        dataset.addValue(230, series1, "2003");
        dataset.addValue(280, series1, "2004");
        dataset.addValue(345, series1, "2005");
        dataset.addValue(355, series1, "2006");
        dataset.addValue(380, series1, "2007");
        dataset.addValue(210, series2, "2001");
        dataset.addValue(220, series2, "2002");
        dataset.addValue(205, series2, "2003");
        dataset.addValue(235, series2, "2004");
        dataset.addValue(200, series2, "2005");
        dataset.addValue(300, series2, "2006");
        dataset.addValue(330, series2, "2007");
        dataset.addValue(230, series3, "2001");
        dataset.addValue(260, series3, "2002");
        dataset.addValue(100, series3, "2003");
        dataset.addValue(125, series3, "2004");
        dataset.addValue(360, series3, "2005");
        dataset.addValue(320, series3, "2006");
        dataset.addValue(310, series3, "2007");
        JFreeChart lineChart = ChartFactory.createBarChart("Type of Crime Vs Year", "Year", "Number of crimes", dataset, PlotOrientation.VERTICAL, true, true, false);
        CategoryPlot plot = lineChart.getCategoryPlot();
        plot.setRangeGridlinePaint(Color.BLACK);
        ChartFrame cf = new ChartFrame("Chart", lineChart, true);
        cf.setVisible(true);
        cf.setSize(1000, 700);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreateCase;
    private javax.swing.JButton btnProvideFeedback;
    private javax.swing.JButton btnProvideJudgement;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnUpdateCase;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JLabel lblCaseVerdict;
    private javax.swing.JLabel lblImprisonmentStartDate;
    private javax.swing.JLabel lblPersonName;
    private javax.swing.JLabel lblPoliceWorkrequestFeedback;
    private javax.swing.JLabel lblPrisonWorkrequestFeedback;
    private javax.swing.JLabel lblYearsOfImprisonment;
    private javax.swing.JTable tblCases;
    private javax.swing.JTextField txtCaseVerdict;
    private javax.swing.JTextField txtImprisonmentStartDate;
    private javax.swing.JTextField txtPersonName;
    private javax.swing.JTextField txtPoliceWorkrequestFeedback;
    private javax.swing.JTextField txtPrisonWorkrequestFeedback;
    private javax.swing.JTextField txtYearsOfImprisonment;
    // End of variables declaration//GEN-END:variables

    private void initializeTable() {
        criminalJusticeSystem = (CriminalJusticeSystem) account.getEnterprise();
        for (Court court : criminalJusticeSystem.getListOfCourts()) {
            if (court.getJudge().getUserAccount().getUsername().equals(account.getUsername())) {
                currentCourt = court;
                CaseDirectory listOfCases = court.getCaseDirectory();
                DefaultTableModel tablemodel = (DefaultTableModel) tblCases.getModel();
                tablemodel.setRowCount(0);
                if (listOfCases != null) {
                    for (Case tempCase : listOfCases.getListOfCases()) {

                        if (tempCase != null) {
                            Object[] row = new Object[7];
                            row[0] = tempCase;
                            row[1] = tempCase.getAccused().getName();
                            row[2] = tempCase.getVerdict();
                            row[3] = tempCase.getStartDate();
                            row[4] = tempCase.getYearsOfImprisonment() + "";
                            row[5] = tempCase.isImprisoned() == true ? "Yes" : "No";
                            row[6] = tempCase.getStatus();
                            tablemodel.addRow(row);
                        }
                    }
                }
            }
        }
    }

    private void resetFields() {
        txtCaseVerdict.setText("");
        txtImprisonmentStartDate.setText("");
        txtPersonName.setText("");
        txtYearsOfImprisonment.setText("");
    }
}
