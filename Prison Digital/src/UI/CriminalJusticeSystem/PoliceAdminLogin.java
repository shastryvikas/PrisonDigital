/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.CriminalJusticeSystem;

import Model.CriminalJusticeSystem.Case;
import Model.CriminalJusticeSystem.Court;
import Model.CriminalJusticeSystem.CriminalJusticeSystem;
import Model.Employee.Employee;
import Model.PrisonEcosystem;
import Model.UserAccountManagement.UserAccount;
import java.awt.CardLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import javax.swing.JPanel;
import Model.CriminalJusticeSystem.Police;
import Model.DB4OUtil.DB4OUtil;
import Model.WorkQueue.WorkRequest;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Thejas
 */
public class PoliceAdminLogin extends javax.swing.JPanel {

    CardLayout cardLayoutPointer;
    JPanel container;
    PrisonEcosystem system;
    UserAccount account;
    Employee selectedStaff;
    Police policeDepartment;
    ArrayList<Employee> employeeList;
    CriminalJusticeSystem criminalJusticeSystem;
    Case selectedCase;

    /**
     * Creates new form PoliceAdminLogin
     *
     * @param container
     * @param account
     * @param system
     */
    public PoliceAdminLogin(JPanel container, UserAccount account, PrisonEcosystem system) {
        initComponents();
        this.setSize(800, 600);
        this.container = container;
        cardLayoutPointer = (CardLayout) container.getLayout();
        this.system = system;
        this.account = account;
        initializeStaffTable();
        initializeCaseTable();
        tblPoliceOfficers.addMouseListener(new MouseListener() {
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

            private void initializeFields() {
                selectedStaff = (Employee) tblPoliceOfficers.getModel().getValueAt(tblPoliceOfficers.getSelectedRow(), 0);
                txtOfficerName.setText(selectedStaff.getName());
                txtOfficerUsername.setText(selectedStaff.getUserAccount().getUsername());
                txtOfficerPassword.setText(selectedStaff.getUserAccount().getPassword());
            }
        });
        tblCasesAssigned.addMouseListener(new MouseListener() {
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

            private void initializeFields() {
                selectedCase = (Case) tblCasesAssigned.getModel().getValueAt(tblCasesAssigned.getSelectedRow(), 0);
                btnAssignCase.setEnabled(true);
                drpdwnPoliceOfficers.setEnabled(true);
            }
        });
        drpdwnPoliceOfficers.setEnabled(false);
        btnAssignCase.setEnabled(false);
        drpdwnPoliceOfficers.removeAllItems();
        drpdwnPoliceOfficers.addItem("");
        for (Employee employee : policeDepartment.getListOfPoliceOfficers()) {
            drpdwnPoliceOfficers.addItem(employee.getUserAccount().getUsername());
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

        jScrollPane2 = new javax.swing.JScrollPane();
        tblPoliceOfficers = new javax.swing.JTable();
        drpdwnPoliceOfficers = new javax.swing.JComboBox<>();
        btnAssignCase = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCasesAssigned = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        lblOfficerName = new javax.swing.JLabel();
        txtOfficerName = new javax.swing.JTextField();
        lblOfficerUsername = new javax.swing.JLabel();
        txtOfficerUsername = new javax.swing.JTextField();
        lblOfficerPassword = new javax.swing.JLabel();
        txtOfficerPassword = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnRefreshDropdown = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblPoliceOfficers.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        tblPoliceOfficers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Officer Name", "Username", "Password"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblPoliceOfficers);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 1110, 150));

        add(drpdwnPoliceOfficers, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 640, 244, -1));

        btnAssignCase.setText("Assign Case");
        btnAssignCase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignCaseActionPerformed(evt);
            }
        });
        add(btnAssignCase, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 630, 140, 40));

        tblCasesAssigned.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        tblCasesAssigned.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Case Number", "Name", "Start date", "Years of Imprisonment", "Imprisoned", "Transported By", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblCasesAssigned);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 1110, 200));

        jLabel7.setBackground(new java.awt.Color(71, 120, 197));
        jLabel7.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("   Police Department Administrator");
        jLabel7.setMaximumSize(new java.awt.Dimension(231, 25));
        jLabel7.setMinimumSize(new java.awt.Dimension(231, 25));
        jLabel7.setOpaque(true);
        jLabel7.setPreferredSize(new java.awt.Dimension(231, 25));
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 1090, 60));

        jPanel2.setBackground(new java.awt.Color(84, 127, 206));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, 60));

        lblOfficerName.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        lblOfficerName.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblOfficerName.setText("Name");

        lblOfficerUsername.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        lblOfficerUsername.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblOfficerUsername.setText("Officer Username");

        lblOfficerPassword.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        lblOfficerPassword.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblOfficerPassword.setText("Officer Password");

        btnAdd.setBackground(new java.awt.Color(244, 208, 129));
        btnAdd.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAdd.setText("Add");
        btnAdd.setPreferredSize(new java.awt.Dimension(85, 30));
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnUpdate.setBackground(new java.awt.Color(244, 208, 129));
        btnUpdate.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.setPreferredSize(new java.awt.Dimension(85, 30));
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(244, 208, 129));
        btnDelete.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.setPreferredSize(new java.awt.Dimension(85, 30));
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(lblOfficerName, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtOfficerName, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 99, Short.MAX_VALUE)
                        .addComponent(lblOfficerUsername)
                        .addGap(12, 12, 12)
                        .addComponent(txtOfficerUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(81, 81, 81)
                        .addComponent(lblOfficerPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtOfficerPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(238, 238, 238)
                        .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(104, 104, 104))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lblOfficerName)
                    .addComponent(txtOfficerName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblOfficerUsername)
                    .addComponent(txtOfficerUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblOfficerPassword)
                    .addComponent(txtOfficerPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 1110, 120));

        jLabel1.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jLabel1.setText("Choose Police Officer");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 640, -1, 30));

        btnRefreshDropdown.setText("Refresh Dropdown");
        btnRefreshDropdown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshDropdownActionPerformed(evt);
            }
        });
        add(btnRefreshDropdown, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 630, -1, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        if (checkInputFields(txtOfficerName) && checkInputFields(txtOfficerUsername) && checkInputFields(txtOfficerPassword)) {
            //Validate
            if(!checkInputFields(txtOfficerName, "^[\\p{L} .'-]+$") || !checkInputFields(txtOfficerUsername, "^[\\p{L} .'-]+$") || !checkInputFields(txtOfficerPassword, "^[\\p{L} .'-]+$")){
                JOptionPane.showMessageDialog(this, "Please enter valid details");
                return;
            }
//            if (checkIfCatererNameIsUnique()) {

            Employee newOfficer = new Employee(system, txtOfficerName.getText(), txtOfficerUsername.getText(), txtOfficerPassword.getText(), criminalJusticeSystem, new Model.Role.Police());
            policeDepartment.getListOfPoliceOfficers().add(newOfficer);
            initializeStaffTable();
            resetFields();
            JOptionPane.showMessageDialog(this, "New Police officer has been added");
            DB4OUtil.storeSystem(system);
//            } else {
//                JOptionPane.showMessageDialog(this, "Caterer name already exists, try a different name");
//            }
        } else {
            JOptionPane.showMessageDialog(this, "Fields cannot be empty for adding a new Police officer");
        }
    }//GEN-LAST:event_btnAddActionPerformed

    public boolean checkInputFields(javax.swing.JTextField txtField, String regex) {
        return txtField.getText() != null && !txtField.getText().isEmpty() && txtField.getText().matches(regex);
    }

    public boolean checkInputFields(javax.swing.JTextField txtField) {
        return txtField.getText() != null && !txtField.getText().isEmpty();
    }

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        if (checkInputFields(txtOfficerName) && checkInputFields(txtOfficerUsername) && checkInputFields(txtOfficerPassword)) {
            //Validate
            if(!checkInputFields(txtOfficerName, "^[\\p{L} .'-]+$") || !checkInputFields(txtOfficerUsername, "^[\\p{L} .'-]+$") || !checkInputFields(txtOfficerPassword, "^[\\p{L} .'-]+$")){
                JOptionPane.showMessageDialog(this, "Please enter valid details before updating");
                return;
            }
            if (selectedStaff != null) {
                for (Employee employee : employeeList) {
                    if (selectedStaff.getName().equals(employee.getName())) {
                        employee.setName(txtOfficerName.getText());
                        employee.getUserAccount().setPassword(txtOfficerPassword.getText());
                        employee.getUserAccount().setUsername(txtOfficerUsername.getText());
                        JOptionPane.showMessageDialog(this, "Officer details updated successfully");
                        initializeStaffTable();
                        resetFields();
                        DB4OUtil.storeSystem(system);
                    }
                }
            } else {
                JOptionPane.showMessageDialog(this, "Please select a officer to update from the table");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Fields cannot be empty for updating the officer's details");
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        if (selectedStaff != null) {
            policeDepartment.getListOfPoliceOfficers().remove(selectedStaff);
            system.getUserAccountDirectory().deleteUserAccount(selectedStaff.getUserAccount());
            JOptionPane.showMessageDialog(this, "Officer details deleted successfully");
            initializeStaffTable();
            resetFields();
            DB4OUtil.storeSystem(system);
        } else {
            JOptionPane.showMessageDialog(this, "Please select a officer to delete from the table");
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnAssignCaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignCaseActionPerformed
        // TODO add your handling code here:
        if (drpdwnPoliceOfficers.getSelectedIndex() > 0) {
            if (selectedCase.getTransportedToPrisonBy() == null) {
                ArrayList<WorkRequest> listOfWorkRequests = selectedCase.getProcessingCourt().getJudge().getUserAccount().getWorkQueue().getWorkRequestList();
                WorkRequest tempWorkRequest = null;
                for (WorkRequest listOfWorkRequest : listOfWorkRequests) {
                    if (listOfWorkRequest.getReceiver()!=null && listOfWorkRequest.getReceiver().equals(account) && listOfWorkRequest.getPrisoner().getName().equals(selectedCase.getAccused().getName())) {
                        tempWorkRequest = listOfWorkRequest;
                    }
                }
                for (Employee employee : policeDepartment.getListOfPoliceOfficers()) {
                    if (employee.getUserAccount().getUsername().equals(drpdwnPoliceOfficers.getSelectedItem())) {
                        selectedCase.setTransportedToPrisonBy(employee);
                        if (tempWorkRequest != null) {
                            tempWorkRequest.setReceiver(employee.getUserAccount());
                        }
                        JOptionPane.showMessageDialog(this, "Assigned the case to the selected police officer");
                        initializeCaseTable();
                        DB4OUtil.storeSystem(system);
                        break;
                    }
                }
            } else {
                JOptionPane.showMessageDialog(this, "Officer already assigned");
            }
        }
    }//GEN-LAST:event_btnAssignCaseActionPerformed

    private void btnAssignCase1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_btnRefreshActionPerformed

    private void btnRefreshDropdownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshDropdownActionPerformed
        // TODO add your handling code here:
        initializeStaffTable();
        initializeCaseTable();
        drpdwnPoliceOfficers.removeAllItems();
        drpdwnPoliceOfficers.addItem("");
        for (Employee employee : policeDepartment.getListOfPoliceOfficers()) {
            drpdwnPoliceOfficers.addItem(employee.getUserAccount().getUsername());
        }
    }//GEN-LAST:event_btnRefreshDropdownActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnAssignCase;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnRefreshDropdown;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> drpdwnPoliceOfficers;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblOfficerName;
    private javax.swing.JLabel lblOfficerPassword;
    private javax.swing.JLabel lblOfficerUsername;
    private javax.swing.JTable tblCasesAssigned;
    private javax.swing.JTable tblPoliceOfficers;
    private javax.swing.JTextField txtOfficerName;
    private javax.swing.JTextField txtOfficerPassword;
    private javax.swing.JTextField txtOfficerUsername;
    // End of variables declaration//GEN-END:variables

    private void initializeStaffTable() {
        criminalJusticeSystem = (CriminalJusticeSystem) account.getEnterprise();
        for (Police police : criminalJusticeSystem.getListOfPolice()) {
            if (police.getPoliceAdmin().getUserAccount().getUsername().equals(account.getUsername())) {
                policeDepartment = police;
                employeeList = new ArrayList<>();
                employeeList = police.getListOfPoliceOfficers();
                DefaultTableModel tablemodel = (DefaultTableModel) tblPoliceOfficers.getModel();
                tablemodel.setRowCount(0);
                for (Employee employee : employeeList) {
                    if (employee != null) {
                        Object[] row = new Object[3];
                        row[0] = employee;
                        row[1] = employee.getUserAccount().getUsername();
                        row[2] = employee.getUserAccount().getPassword();
                        tablemodel.addRow(row);
                    }
                }

            }
        }
    }

    private void resetFields() {
        txtOfficerName.setText("");
        txtOfficerUsername.setText("");
        txtOfficerPassword.setText("");
    }

    private void initializeCaseTable() {
        ArrayList<Court> courtList = criminalJusticeSystem.getListOfCourts();
        for (Court court : courtList) {
            ArrayList<Case> cases = court.getCaseDirectory().getListOfCases();
            DefaultTableModel model = (DefaultTableModel) tblCasesAssigned.getModel();
            model.setRowCount(0);
            for (Case aCase : cases) {
                if (aCase.getProcessingPoliceDepartment() != null && aCase.getProcessingPoliceDepartment().getPoliceAdmin().getUserAccount().getUsername()
                        .equals(account.getUsername())) {

                    Object[] row = new Object[7];
                        row[0] = aCase;
                        row[1] = aCase.getAccused().getName();
                        row[2] = aCase.getStartDate().toString();
                        row[3] = aCase.getYearsOfImprisonment() + "";
                        row[4] = aCase.isImprisoned()==true?"Yes":"No";
                        row[5] = aCase.getTransportedToPrisonBy() != null ? aCase.getTransportedToPrisonBy().getUserAccount().getUsername() : "-";
                        row[6] = aCase.getStatus();
                    model.addRow(row);
                }
            }
        }
    }

}
