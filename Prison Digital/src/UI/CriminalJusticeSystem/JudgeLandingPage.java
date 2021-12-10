/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.CriminalJusticeSystem;

import Model.PrisonEcosystem;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author Thejas
 */
public class JudgeLandingPage extends javax.swing.JPanel {

    JPanel container;
    CardLayout layout;
    PrisonEcosystem system;

    /**
     * Creates new form JudgeLandingPage
     *
     * @param container
     */
    public JudgeLandingPage(JPanel container, PrisonEcosystem system) {
        initComponents();
        this.container = container;
        layout = (CardLayout) container.getLayout();
        this.system = system;
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
        tblHospitals = new javax.swing.JTable();
        lblCaseNumber = new javax.swing.JLabel();
        txtCaseNumber = new javax.swing.JTextField();
        lblPersonName = new javax.swing.JLabel();
        lblCaseDescription = new javax.swing.JLabel();
        btnCreateCase = new javax.swing.JButton();
        btnProvideJudgement = new javax.swing.JButton();
        btnUpdateCase = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        lblJudgement = new javax.swing.JLabel();
        txtJudgement = new javax.swing.JTextField();
        drpdwnPerson = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtCaseDescription = new javax.swing.JTextArea();

        tblHospitals.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Case Number", "Name", "Age", "Case Description", "Judgement"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblHospitals);

        lblCaseNumber.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblCaseNumber.setText("Case Number");

        lblPersonName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblPersonName.setText("Person Name");

        lblCaseDescription.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCaseDescription.setText("Case Description");

        btnCreateCase.setBackground(new java.awt.Color(244, 208, 129));
        btnCreateCase.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCreateCase.setForeground(new java.awt.Color(0, 0, 0));
        btnCreateCase.setText("Create new Case");
        btnCreateCase.setPreferredSize(new java.awt.Dimension(85, 30));
        btnCreateCase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateCaseActionPerformed(evt);
            }
        });

        btnProvideJudgement.setBackground(new java.awt.Color(244, 208, 129));
        btnProvideJudgement.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnProvideJudgement.setForeground(new java.awt.Color(0, 0, 0));
        btnProvideJudgement.setText("Provide judgement");
        btnProvideJudgement.setPreferredSize(new java.awt.Dimension(85, 30));
        btnProvideJudgement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProvideJudgementActionPerformed(evt);
            }
        });

        btnUpdateCase.setBackground(new java.awt.Color(244, 208, 129));
        btnUpdateCase.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnUpdateCase.setForeground(new java.awt.Color(0, 0, 0));
        btnUpdateCase.setText("Update Case");
        btnUpdateCase.setPreferredSize(new java.awt.Dimension(85, 30));
        btnUpdateCase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateCaseActionPerformed(evt);
            }
        });

        btnBack.setBackground(new java.awt.Color(244, 208, 129));
        btnBack.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnBack.setForeground(new java.awt.Color(0, 0, 0));
        btnBack.setText("Back");
        btnBack.setPreferredSize(new java.awt.Dimension(85, 30));
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        lblJudgement.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblJudgement.setText("Judgement");

        txtCaseDescription.setColumns(20);
        txtCaseDescription.setRows(5);
        jScrollPane2.setViewportView(txtCaseDescription);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 703, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(lblCaseNumber))
                            .addComponent(lblJudgement, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtCaseNumber, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                            .addComponent(txtJudgement))
                        .addGap(88, 88, 88)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblPersonName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblCaseDescription, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2)
                            .addComponent(drpdwnPerson, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(43, 43, 43))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(btnCreateCase, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnUpdateCase, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(83, 83, 83)
                        .addComponent(btnProvideJudgement, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(93, 93, 93))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCaseNumber)
                            .addComponent(txtCaseNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtJudgement, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblJudgement)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPersonName)
                            .addComponent(drpdwnPerson, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCaseDescription)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCreateCase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUpdateCase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnProvideJudgement, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateCaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateCaseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCreateCaseActionPerformed

    private void btnProvideJudgementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProvideJudgementActionPerformed
        // TODO add your handling code here:
        JudgementPage judgementPage = new JudgementPage(container);
        container.add("judgementPage", judgementPage);
        layout.next(container);

    }//GEN-LAST:event_btnProvideJudgementActionPerformed

    private void btnUpdateCaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateCaseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUpdateCaseActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        container.remove(this);

        layout.previous(container);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreateCase;
    private javax.swing.JButton btnProvideJudgement;
    private javax.swing.JButton btnUpdateCase;
    private javax.swing.JComboBox<String> drpdwnPerson;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblCaseDescription;
    private javax.swing.JLabel lblCaseNumber;
    private javax.swing.JLabel lblJudgement;
    private javax.swing.JLabel lblPersonName;
    private javax.swing.JTable tblHospitals;
    private javax.swing.JTextArea txtCaseDescription;
    private javax.swing.JTextField txtCaseNumber;
    private javax.swing.JTextField txtJudgement;
    // End of variables declaration//GEN-END:variables
}
