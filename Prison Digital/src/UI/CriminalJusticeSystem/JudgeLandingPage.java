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
import Model.Person;
import Model.PrisonEcosystem;
import Model.UserAccountManagement.UserAccount;
import java.awt.CardLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

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
    }

    private void initializeFields() {
        selectedCase = (Case) tblCases.getModel().getValueAt(tblCases.getSelectedRow(), 0);
        txtCaseVerdict.setText(selectedCase.getVerdict());
        txtPersonName.setText(selectedCase.getAccused().getName());
        txtImprisonmentStartDate.setText(selectedCase.getStartDate().toString());
        txtYearsOfImprisonment.setText(selectedCase.getYearsOfImprisonment() + "");
        if(selectedCase.getPrison() == null)
            jTextField2.setText("Not Assigned");
        else
            jTextField2.setText(selectedCase.getPrison().getName());
        
        if(selectedCase.getProcessingPoliceDepartment() == null)
            jTextField3.setText("Not Assigned");
        else
            jTextField3.setText(selectedCase.getProcessingPoliceDepartment().getName());
            

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
        txtPersonName = new javax.swing.JTextField();
        lblPersonName = new javax.swing.JLabel();
        lblCaseVerdict = new javax.swing.JLabel();
        btnCreateCase = new javax.swing.JButton();
        btnProvideJudgement = new javax.swing.JButton();
        btnUpdateCase = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        lblImprisonmentStartDate = new javax.swing.JLabel();
        txtImprisonmentStartDate = new javax.swing.JTextField();
        lblYearsOfImprisonment = new javax.swing.JLabel();
        txtYearsOfImprisonment = new javax.swing.JTextField();
        txtCaseVerdict = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();

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

        lblPersonName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblPersonName.setText("Person Name");

        lblCaseVerdict.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCaseVerdict.setText("Case verdict");

        btnCreateCase.setBackground(new java.awt.Color(244, 208, 129));
        btnCreateCase.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCreateCase.setText("Create new Case");
        btnCreateCase.setPreferredSize(new java.awt.Dimension(85, 30));
        btnCreateCase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateCaseActionPerformed(evt);
            }
        });

        btnProvideJudgement.setBackground(new java.awt.Color(244, 208, 129));
        btnProvideJudgement.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnProvideJudgement.setText("Assign prison and police");
        btnProvideJudgement.setPreferredSize(new java.awt.Dimension(85, 30));
        btnProvideJudgement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProvideJudgementActionPerformed(evt);
            }
        });

        btnUpdateCase.setBackground(new java.awt.Color(244, 208, 129));
        btnUpdateCase.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnUpdateCase.setText("Update Case");
        btnUpdateCase.setPreferredSize(new java.awt.Dimension(85, 30));
        btnUpdateCase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateCaseActionPerformed(evt);
            }
        });

        btnBack.setBackground(new java.awt.Color(244, 208, 129));
        btnBack.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnBack.setText("Back");
        btnBack.setPreferredSize(new java.awt.Dimension(85, 30));
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        lblImprisonmentStartDate.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblImprisonmentStartDate.setText("Imprisonment start date");

        lblYearsOfImprisonment.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblYearsOfImprisonment.setText("Years of Imprisonment");

        txtCaseVerdict.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCaseVerdictActionPerformed(evt);
            }
        });

        jLabel1.setText("Prison Assigned:");

        jLabel2.setText("Police Department Assigned:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 703, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblCaseVerdict)
                                    .addComponent(lblPersonName))
                                .addGap(67, 67, 67)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtPersonName, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCaseVerdict, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(120, 120, 120)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField3)
                                    .addComponent(jTextField2)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblImprisonmentStartDate)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtYearsOfImprisonment, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtImprisonmentStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblYearsOfImprisonment)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnCreateCase, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnUpdateCase, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnProvideJudgement, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPersonName)
                    .addComponent(txtPersonName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCaseVerdict)
                    .addComponent(txtCaseVerdict, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblImprisonmentStartDate)
                    .addComponent(txtImprisonmentStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblYearsOfImprisonment)
                    .addComponent(txtYearsOfImprisonment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCreateCase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUpdateCase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnProvideJudgement, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(123, 123, 123)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateCaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateCaseActionPerformed
        // TODO add your handling code here:
        if (checkInputFields(txtCaseVerdict) && checkInputFields(txtImprisonmentStartDate) && checkInputFields(txtPersonName) && checkInputFields(txtYearsOfImprisonment)) {
            Person person = new Person(txtPersonName.getText());
            try {
                Case newCase;
                newCase = new Case(txtCaseVerdict.getText(), person, false, new SimpleDateFormat("MM-dd-YYYY").parse(txtImprisonmentStartDate.getText()), Integer.parseInt(txtYearsOfImprisonment.getText()), currentCourt);
                currentCourt.getCaseDirectory().addCase(newCase);
            } catch (ParseException ex) {
                Logger.getLogger(JudgeLandingPage.class.getName()).log(Level.SEVERE, null, ex);
            }

            initializeTable();
            resetFields();
            JOptionPane.showMessageDialog(this, "New Case has been added");
        } else {
            JOptionPane.showMessageDialog(this, "Fields cannot be empty for adding a new case");
        }
    }//GEN-LAST:event_btnCreateCaseActionPerformed

    private void btnProvideJudgementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProvideJudgementActionPerformed
        // TODO add your handling code here:
        JudgementPage judgementPage = new JudgementPage(container, selectedCase, criminalJusticeSystem, system);
        container.add("judgementPage", judgementPage);
        layout.next(container);

    }//GEN-LAST:event_btnProvideJudgementActionPerformed

    public boolean checkInputFields(javax.swing.JTextField txtField) {
        return txtField.getText() != null && !txtField.getText().isEmpty();
    }

    public boolean checkInputFields(javax.swing.JTextArea txtField) {
        return txtField.getText() != null && !txtField.getText().isEmpty();
    }

    private void btnUpdateCaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateCaseActionPerformed
        // TODO add your handling code here:
        if (checkInputFields(txtCaseVerdict) && checkInputFields(txtPersonName)) {
            if (selectedCase != null) {
                for (Case cases : currentCourt.getCaseDirectory().getListOfCases()) {
                    if (selectedCase.getCaseNumber() == cases.getCaseNumber()) {
                        cases.setAccused(new Person(txtPersonName.getText()));
                        JOptionPane.showMessageDialog(this, "Staff details updated successfully");
                        initializeTable();
                        resetFields();
                    }
                }
            } else {
                JOptionPane.showMessageDialog(this, "Please select a case to update from the table");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Fields cannot be empty for updating the case");
        }
    }//GEN-LAST:event_btnUpdateCaseActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        container.remove(this);
        layout.previous(container);
    }//GEN-LAST:event_btnBackActionPerformed

    private void txtCaseVerdictActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCaseVerdictActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCaseVerdictActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreateCase;
    private javax.swing.JButton btnProvideJudgement;
    private javax.swing.JButton btnUpdateCase;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JLabel lblCaseVerdict;
    private javax.swing.JLabel lblImprisonmentStartDate;
    private javax.swing.JLabel lblPersonName;
    private javax.swing.JLabel lblYearsOfImprisonment;
    private javax.swing.JTable tblCases;
    private javax.swing.JTextField txtCaseVerdict;
    private javax.swing.JTextField txtImprisonmentStartDate;
    private javax.swing.JTextField txtPersonName;
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
                if(listOfCases != null)
                for (Case tempCase : listOfCases.getListOfCases()) {

                    if (tempCase != null) {
                        Object[] row = new Object[7];
                        row[0] = tempCase;
                        row[1] = tempCase.getAccused().getName();
                        row[2] = tempCase.getVerdict();
                        row[3] = tempCase.getStartDate().toString();
                        row[4] = tempCase.getYearsOfImprisonment() + "";
                        row[5] = tempCase.isImprisoned().toString();
                        row[6] = tempCase.getStatus();
                        tablemodel.addRow(row);
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
