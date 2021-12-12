/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.Hospital;

import Model.DB4OUtil.DB4OUtil;
import Model.Employee.Employee;
import Model.Hospital.Hospital;
import Model.Prison.HospitalContract;
import Model.PrisonEcosystem;
import Model.Role.PatientCareTechStaff;
import Model.Role.generalStaff;
import Model.Role.psychologyStaff;
import Model.UserAccountManagement.UserAccount;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Thejas
 */
public class HospitalAdminLandingPage extends javax.swing.JPanel {

    JPanel container;
    PrisonEcosystem system;
    Hospital hospital;
    String currDesignation;
    UserAccount account;
    ArrayList<HospitalContract> contractList;

    /**
     * Creates new form InfirmaryAdminLandingPage
     *
     * @param container
     */
    public HospitalAdminLandingPage(JPanel container, UserAccount account, PrisonEcosystem system) {
        initComponents();
        this.container = container;
        this.system = system;
        this.account = account;
        hospital = (Hospital) account.getEnterprise();

        this.contractList = hospital.getManagement().getContract();

        //Disable Approal Button.
        btnApproval.setEnabled(false);

        /*
        //Designation drop down list.
        ArrayList<String> designationDownList = new ArrayList<String>();
        
        designationDownList.add("Patient Care Technician");
        designationDownList.add("General Physician");
        designationDownList.add("Psychologist");
        
        for(String x : designationDownList){
            jComboBox1.addItem(x);
        }
         */
        populateContractListTable(contractList);

        contractListTable.addMouseListener(new MouseListener() {
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
        int viewselectedRowIndex = contractListTable.getSelectedRow();
        HospitalContract selectedContract = (HospitalContract) contractListTable.getModel().getValueAt(viewselectedRowIndex, 0);

        //Approval Button Enable
        if (selectedContract.getGeneralDocsApproval() && selectedContract.getPatientCareTechApproval() && selectedContract.getPsychologistsApproval()) {
            btnApproval.setEnabled(true);
        } else {
            btnApproval.setEnabled(false);
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
        jPanel1 = new javax.swing.JPanel();
        manageStaffPanel = new javax.swing.JPanel();
        lblInfirmaryStaffName = new javax.swing.JLabel();
        txtInfirmaryStaffName = new javax.swing.JTextField();
        lblInfirmaryStaffUsername = new javax.swing.JLabel();
        txtInfirmaryStaffUsername = new javax.swing.JTextField();
        lblInfirmaryStaffPassword = new javax.swing.JLabel();
        txtInfirmaryStaffPassword = new javax.swing.JTextField();
        btnGeneralPhy = new javax.swing.JButton();
        btnPatientCarTec = new javax.swing.JButton();
        btnPsychologist = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        lblDesignation = new javax.swing.JLabel();
        txtDesignation = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        contractListTable = new javax.swing.JTable();
        btnApproval = new javax.swing.JButton();

        jPanel1.setPreferredSize(new java.awt.Dimension(800, 600));

        manageStaffPanel.setPreferredSize(new java.awt.Dimension(800, 600));

        lblInfirmaryStaffName.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblInfirmaryStaffName.setText("Name");

        lblInfirmaryStaffUsername.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblInfirmaryStaffUsername.setText(" Username");

        lblInfirmaryStaffPassword.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblInfirmaryStaffPassword.setText(" Password");

        btnGeneralPhy.setBackground(new java.awt.Color(244, 208, 129));
        btnGeneralPhy.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnGeneralPhy.setText("General Physician");
        btnGeneralPhy.setPreferredSize(new java.awt.Dimension(85, 30));
        btnGeneralPhy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGeneralPhyActionPerformed(evt);
            }
        });

        btnPatientCarTec.setBackground(new java.awt.Color(244, 208, 129));
        btnPatientCarTec.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnPatientCarTec.setText("Patient Care Technician");
        btnPatientCarTec.setPreferredSize(new java.awt.Dimension(85, 30));
        btnPatientCarTec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPatientCarTecActionPerformed(evt);
            }
        });

        btnPsychologist.setBackground(new java.awt.Color(244, 208, 129));
        btnPsychologist.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnPsychologist.setText("Psychologist");
        btnPsychologist.setPreferredSize(new java.awt.Dimension(85, 30));
        btnPsychologist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPsychologistActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Infirmary Admin Work Area");
        jLabel1.setOpaque(true);

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        lblDesignation.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblDesignation.setText("Designation");

        contractListTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Prison", "General Physician", "General Physician Approval", "Patient Care", "Patient Care Approval", "Psychologist", "Psychologist Approval", "Contract Status"
            }
        ));
        jScrollPane3.setViewportView(contractListTable);

        btnApproval.setText("Approve");
        btnApproval.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApprovalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout manageStaffPanelLayout = new javax.swing.GroupLayout(manageStaffPanel);
        manageStaffPanel.setLayout(manageStaffPanelLayout);
        manageStaffPanelLayout.setHorizontalGroup(
            manageStaffPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(manageStaffPanelLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(manageStaffPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(manageStaffPanelLayout.createSequentialGroup()
                        .addGroup(manageStaffPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDesignation)
                            .addComponent(lblInfirmaryStaffName, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(manageStaffPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtInfirmaryStaffName, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDesignation, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(manageStaffPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, manageStaffPanelLayout.createSequentialGroup()
                                .addComponent(lblInfirmaryStaffPassword)
                                .addGap(21, 21, 21)
                                .addComponent(txtInfirmaryStaffPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, manageStaffPanelLayout.createSequentialGroup()
                                .addComponent(lblInfirmaryStaffUsername)
                                .addGap(18, 18, 18)
                                .addComponent(txtInfirmaryStaffUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(83, 83, 83))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, manageStaffPanelLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(btnGeneralPhy, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnPatientCarTec, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnPsychologist, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 29, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, manageStaffPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(manageStaffPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, manageStaffPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnApproval)))
                .addContainerGap())
        );
        manageStaffPanelLayout.setVerticalGroup(
            manageStaffPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, manageStaffPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(37, 37, 37)
                .addGroup(manageStaffPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblInfirmaryStaffName)
                    .addComponent(txtInfirmaryStaffName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtInfirmaryStaffUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblInfirmaryStaffUsername))
                .addGap(33, 33, 33)
                .addGroup(manageStaffPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblInfirmaryStaffPassword)
                    .addComponent(txtInfirmaryStaffPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDesignation)
                    .addComponent(txtDesignation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(manageStaffPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(manageStaffPanelLayout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(manageStaffPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnGeneralPhy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnPatientCarTec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnPsychologist, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, manageStaffPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSave)))
                .addGap(65, 65, 65)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnApproval)
                .addGap(211, 211, 211))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(manageStaffPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(manageStaffPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 627, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnGeneralPhyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGeneralPhyActionPerformed
        // TODO add your handling code here:
        currDesignation = "General Physician";

        if (hospital.getPatientCare().getGeneralStaff() == null || hospital.getPatientCare().getGeneralStaff().getName().isEmpty() || hospital.getPatientCare().getGeneralStaff().getName() == null) {
            JOptionPane.showMessageDialog(this, "Please add " + currDesignation);
            return;
        }

        txtInfirmaryStaffName.setText(hospital.getPatientCare().getGeneralStaff().getName());
        txtInfirmaryStaffPassword.setText(hospital.getPatientCare().getGeneralStaff().getUserAccount().getPassword());
        txtInfirmaryStaffUsername.setText(hospital.getPatientCare().getGeneralStaff().getUserAccount().getUsername());
        txtDesignation.setText(currDesignation);
        txtDesignation.setEnabled(false);
    }//GEN-LAST:event_btnGeneralPhyActionPerformed

    private void btnPatientCarTecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPatientCarTecActionPerformed
        // TODO add your handling code here:
        currDesignation = "Patient Care Technician";

        if (hospital.getPatientCare().getPhysiotherapyStaff() == null || hospital.getPatientCare().getPhysiotherapyStaff().getName().isEmpty() || hospital.getPatientCare().getPhysiotherapyStaff().getName() == null) {
            JOptionPane.showMessageDialog(this, "Please add " + currDesignation);
            return;
        }

        txtInfirmaryStaffName.setText(hospital.getPatientCare().getPhysiotherapyStaff().getName());
        txtInfirmaryStaffPassword.setText(hospital.getPatientCare().getPhysiotherapyStaff().getUserAccount().getPassword());
        txtInfirmaryStaffUsername.setText(hospital.getPatientCare().getPhysiotherapyStaff().getUserAccount().getUsername());
        txtDesignation.setText(currDesignation);
        txtDesignation.setEnabled(false);
    }//GEN-LAST:event_btnPatientCarTecActionPerformed

    private void btnPsychologistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPsychologistActionPerformed
        // TODO add your handling code here:
        currDesignation = "Psychologist";

        if (hospital.getPatientCare().getPsychologyStaff() == null || hospital.getPatientCare().getPsychologyStaff().getName().isEmpty() || hospital.getPatientCare().getPsychologyStaff().getName() == null) {
            JOptionPane.showMessageDialog(this, "Please add " + currDesignation);
            return;
        }

        txtInfirmaryStaffName.setText(hospital.getPatientCare().getPsychologyStaff().getName());
        txtInfirmaryStaffPassword.setText(hospital.getPatientCare().getPsychologyStaff().getUserAccount().getPassword());
        txtInfirmaryStaffUsername.setText(hospital.getPatientCare().getPsychologyStaff().getUserAccount().getUsername());
        txtDesignation.setText(currDesignation);
        txtDesignation.setEnabled(false);

    }//GEN-LAST:event_btnPsychologistActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        if (checkInputFields(txtInfirmaryStaffName) && checkInputFields(txtInfirmaryStaffUsername) && checkInputFields(txtInfirmaryStaffPassword)) {
//            if (checkIfCatererNameIsUnique()) {
            Employee newEmployee;

            if (txtDesignation.getText().equals("General Physician")) {
                newEmployee = new Employee(system, txtInfirmaryStaffName.getText(), txtInfirmaryStaffUsername.getText(), txtInfirmaryStaffPassword.getText(), hospital, new generalStaff());
                hospital.getPatientCare().setGeneralStaff(newEmployee);
            } else if (txtDesignation.getText().equals("Patient Care Technician")) {
                newEmployee = new Employee(system, txtInfirmaryStaffName.getText(), txtInfirmaryStaffUsername.getText(), txtInfirmaryStaffPassword.getText(), hospital, new PatientCareTechStaff());
                hospital.getPatientCare().setPhysiotherapyStaff(newEmployee);
            } else if (txtDesignation.getText().equals("Psychologist")) {
                newEmployee = new Employee(system, txtInfirmaryStaffName.getText(), txtInfirmaryStaffUsername.getText(), txtInfirmaryStaffPassword.getText(), hospital, new psychologyStaff());
                hospital.getPatientCare().setPsychologyStaff(newEmployee);
            }

            //initializeStaffTable();
            JOptionPane.showMessageDialog(this, txtDesignation.getText() + " Head Appointed");
            resetFields();
            DB4OUtil.storeSystem(system);
//            } else {
//                JOptionPane.showMessageDialog(this, "Caterer name already exists, try a different name");
//            }
        } else {
            JOptionPane.showMessageDialog(this, "Fields cannot be empty for adding a new Employee");
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnApprovalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApprovalActionPerformed
        // TODO add your handling code here:
        int viewselectedRowIndex = contractListTable.getSelectedRow();
        HospitalContract selectedContract = (HospitalContract) contractListTable.getModel().getValueAt(viewselectedRowIndex, 0);

        selectedContract.setStatus("Approved");

        populateContractListTable(contractList);
        JOptionPane.showMessageDialog(this, "The contract has been apporved");
        DB4OUtil.storeSystem(system);
    }//GEN-LAST:event_btnApprovalActionPerformed

    public boolean checkInputFields(javax.swing.JTextField txtField) {
        return txtField.getText() != null && !txtField.getText().isEmpty();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnApproval;
    private javax.swing.JButton btnGeneralPhy;
    private javax.swing.JButton btnPatientCarTec;
    private javax.swing.JButton btnPsychologist;
    private javax.swing.JButton btnSave;
    private javax.swing.JTable contractListTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblDesignation;
    private javax.swing.JLabel lblInfirmaryStaffName;
    private javax.swing.JLabel lblInfirmaryStaffPassword;
    private javax.swing.JLabel lblInfirmaryStaffUsername;
    private javax.swing.JPanel manageStaffPanel;
    private javax.swing.JTextField txtDesignation;
    private javax.swing.JTextField txtInfirmaryStaffName;
    private javax.swing.JTextField txtInfirmaryStaffPassword;
    private javax.swing.JTextField txtInfirmaryStaffUsername;
    // End of variables declaration//GEN-END:variables

    private void resetFields() {

        txtInfirmaryStaffName.setText("");
        txtInfirmaryStaffPassword.setText("");
        txtInfirmaryStaffUsername.setText("");
        txtDesignation.setText("");
    }

    private void populateContractListTable(ArrayList<HospitalContract> contractList) {
        DefaultTableModel model = (DefaultTableModel) contractListTable.getModel();
        //delete empty records
        model.setRowCount(0);

        for (HospitalContract hc : contractList) {

            Object[] row = new Object[8];
            row[0] = hc;
            row[1] = hc.getGeneralDocs();
            row[2] = hc.getGeneralDocsApproval() == true ? "Yes" : "No";
            row[3] = hc.getPatientCareTech();
            row[4] = hc.getPatientCareTechApproval() == true ? "Yes" : "No";
            row[5] = hc.getPsychologists();
            row[6] = hc.getPsychologistsApproval() == true ? "Yes" : "No";
            row[7] = hc.getStatus();

            model.addRow(row);
        }
    }

}
