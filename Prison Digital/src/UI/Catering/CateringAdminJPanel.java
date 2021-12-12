/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.Catering;

import Model.Employee.Employee;
import Model.Employee.EmployeeDirectory;
import Model.FoodCateringService.FoodCateringService;
import Model.Prison.CateringContract;
import Model.PrisonEcosystem;
import Model.Role.Chef;
import Model.Role.DeliveryMan;
import Model.UserAccountManagement.UserAccount;
import java.awt.CardLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author udayindukuri
 */
public class CateringAdminJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CateringAdminJPanel
     */
    JPanel container;
    CardLayout layout;
    PrisonEcosystem system;
    UserAccount account;
    Employee selectedStaff;
    FoodCateringService cateringService;
    ArrayList<Employee> employeeList;

    public CateringAdminJPanel(JPanel container, UserAccount account, PrisonEcosystem system) {
        initComponents();
        this.container = container;
        layout = (CardLayout) container.getLayout();
        this.system = system;
        this.account = account;
        cateringService = (FoodCateringService) account.getEnterprise();
        initializeStaffTable();
        tblCateringStaff.addMouseListener(new MouseListener() {
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
                selectedStaff = (Employee) tblCateringStaff.getModel().getValueAt(tblCateringStaff.getSelectedRow(), 0);
                txtStaffName.setText(selectedStaff.getName());
                txtUserName.setText(selectedStaff.getUserAccount().getUsername());
                txtPassword.setText(selectedStaff.getUserAccount().getPassword());

                drpdwnDesignation.setSelectedIndex(getRole(selectedStaff).equals("Chef") ? 0 : 1);
            }
        });

        populateContractTable();
        PrisonStaffJTable1.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
            }

            @Override
            public void mousePressed(MouseEvent e) {
                CateringContract a = (CateringContract) PrisonStaffJTable1.getModel().getValueAt(PrisonStaffJTable1.getSelectedRow(), 0);
                updateDetails(a);
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

    private void updateDetails(CateringContract contract) {

        if (contract.getChefApproval() && contract.getDeliveryManApproval()) {
            btnSubmit.setEnabled(true);
        } else {
            btnSubmit.setEnabled(false);
        }

        if (contract.getStatus().equals("Approved and Active")) {
            btnSubmit.setEnabled(false);
        }

        if (contract.getChef() != null) {
            jComboChefAssignement.setEnabled(false);
            jButton2.setEnabled(false);
        } else {
            ArrayList<Employee> chefs = cateringService.getKitchen().getStaff().getEmployeeList();
            for (CateringContract c : cateringService.getManagement().getFoodOrders()) {
                if (chefs.contains(c.getChef())) {
                    chefs.remove(c.getChef());
                }
            }
            jComboChefAssignement.removeAllItems();
            for (Employee e : chefs) {
                jComboChefAssignement.addItem(e.getUserAccount().getUsername());
            }
            jComboChefAssignement.setEnabled(true);
            jButton2.setEnabled(true);
        }

        if (contract.getDeliveryMan() != null) {
            jComboDeleiveryManAssignment.setEnabled(false);
            jButton1.setEnabled(false);
        } else {
            ArrayList<Employee> del = cateringService.getTransport().getStaff().getEmployeeList();
            for (CateringContract c : cateringService.getManagement().getFoodOrders()) {
                if (del.contains(c.getChef())) {
                    del.remove(c.getChef());
                }
            }
            jComboDeleiveryManAssignment.removeAllItems();
            for (Employee e : del) {
                jComboDeleiveryManAssignment.addItem(e.getUserAccount().getUsername());
            }
            jComboDeleiveryManAssignment.setEnabled(true);
            jButton1.setEnabled(true);
        }

    }

    private void populateContractTable() {

        DefaultTableModel tablemodel = (DefaultTableModel) PrisonStaffJTable1.getModel();
        tablemodel.setRowCount(0);
        for (CateringContract c : cateringService.getManagement().getFoodOrders()) {
            if (c != null) {
                Object[] row = new Object[7];
                row[0] = c;
                row[1] = c.getPrisonerCount() + "";

                if (c.getChef() == null) {
                    row[2] = "Not Assigned";
                } else {
                    row[2] = c.getChef().getName();
                }

                if (c.getDeliveryMan() == null) {
                    row[4] = "Not Assigned";
                } else {
                    row[4] = c.getDeliveryMan().getName();
                }

                row[3] = c.getChefApproval().toString();
                row[5] = c.getDeliveryManApproval().toString();
                row[6] = c.getStatus();

                tablemodel.addRow(row);
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

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCateringStaff = new javax.swing.JTable();
        lblStaffName = new javax.swing.JLabel();
        lblDesignation = new javax.swing.JLabel();
        lblUserName = new javax.swing.JLabel();
        drpdwnDesignation = new javax.swing.JComboBox<>();
        txtStaffName = new javax.swing.JTextField();
        txtUserName = new javax.swing.JTextField();
        btnUpdate = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        lblPassword = new javax.swing.JLabel();
        txtPassword = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        PrisonStaffJTable1 = new javax.swing.JTable();
        lblChefAssignment = new javax.swing.JLabel();
        jComboChefAssignement = new javax.swing.JComboBox<>();
        lblDeliveryManAssignement = new javax.swing.JLabel();
        jComboDeleiveryManAssignment = new javax.swing.JComboBox<>();
        btnSubmit = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Catering Admin Work Area");
        jLabel1.setOpaque(true);

        tblCateringStaff.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Designation", "UserName", "Password"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblCateringStaff);

        lblStaffName.setText("Staff Name:");

        lblDesignation.setText("Designation:");

        lblUserName.setText("User Name:");

        drpdwnDesignation.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Chef", "DeliveryMan" }));

        txtUserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserNameActionPerformed(evt);
            }
        });

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        lblPassword.setText("Password:");

        PrisonStaffJTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Prison", "Prisoner Count", "Chef Assigned", "Chef Approval", "Delivery Man Assigned", "Delivery Man Approval", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(PrisonStaffJTable1);

        lblChefAssignment.setText("Chef Assignment");

        jComboChefAssignement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboChefAssignementActionPerformed(evt);
            }
        });

        lblDeliveryManAssignement.setText("Delivery Man Assignment");

        btnSubmit.setText("Approve");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        jButton1.setText("Assign Delivery Man");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Assign Chef");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblDeliveryManAssignement)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jComboDeleiveryManAssignment, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jButton1))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblChefAssignment)
                                        .addGap(45, 45, 45)
                                        .addComponent(jComboChefAssignement, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jButton2))
                                .addGap(85, 85, 85)
                                .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblStaffName)
                    .addComponent(lblDesignation))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(drpdwnDesignation, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtStaffName)
                    .addComponent(btnAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 189, Short.MAX_VALUE)
                .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(234, 234, 234)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblUserName)
                            .addGap(18, 18, 18)
                            .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblPassword)
                            .addGap(27, 27, 27)
                            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnDelete, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(152, 152, 152))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblStaffName)
                            .addComponent(txtStaffName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDesignation)
                            .addComponent(drpdwnDesignation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblUserName)
                            .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPassword)
                            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnDelete))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAdd)
                            .addComponent(btnUpdate))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDeliveryManAssignement)
                    .addComponent(jComboDeleiveryManAssignment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblChefAssignment)
                    .addComponent(jComboChefAssignement, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSubmit))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(50, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void initializeStaffTable() {
        cateringService = (FoodCateringService) account.getEnterprise();
        employeeList = new ArrayList<>();
        EmployeeDirectory kitchenStaff = cateringService.getKitchen().getStaff();
        if (kitchenStaff != null) {
            employeeList.addAll(kitchenStaff.getEmployeeList());
        }
        EmployeeDirectory transportStaff = cateringService.getTransport().getStaff();
        if (transportStaff != null) {
            employeeList.addAll(cateringService.getTransport().getStaff().getEmployeeList());
        }

        DefaultTableModel tablemodel = (DefaultTableModel) tblCateringStaff.getModel();
        tablemodel.setRowCount(0);
        if (!employeeList.isEmpty()) {
            for (Employee employee : employeeList) {
                if (employee != null) {
                    Object[] row = new Object[4];
                    row[0] = employee;
                    row[1] = getRole(employee);
                    row[2] = employee.getUserAccount().getUsername();
                    row[3] = employee.getUserAccount().getPassword();

                    tablemodel.addRow(row);
                }
            }
        }
    }
    private void txtUserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserNameActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        if (checkInputFields(txtStaffName) && checkInputFields(txtUserName) && checkInputFields(txtPassword)) {
//            if (checkIfCatererNameIsUnique()) {
            Employee newEmployee;
            if (drpdwnDesignation.getSelectedItem().equals("Chef")) {
                newEmployee = new Employee(system, txtStaffName.getText(), txtUserName.getText(), txtPassword.getText(), cateringService, new Chef());
                cateringService.getKitchen().getStaff().addEmployee(newEmployee);
            } else {
                newEmployee = new Employee(system, txtStaffName.getText(), txtUserName.getText(), txtPassword.getText(), cateringService, new DeliveryMan());
                cateringService.getTransport().getStaff().addEmployee(newEmployee);
            }

            initializeStaffTable();
            resetFields();
            JOptionPane.showMessageDialog(this, "New Employee has been added");
//            } else {
//                JOptionPane.showMessageDialog(this, "Caterer name already exists, try a different name");
//            }
        } else {
            JOptionPane.showMessageDialog(this, "Fields cannot be empty for adding a new Employee");
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        if (checkInputFields(txtStaffName) && checkInputFields(txtUserName) && checkInputFields(txtPassword)) {
            if (selectedStaff != null) {
                for (Employee employee : employeeList) {
                    if (selectedStaff.getName().equals(employee.getName())) {
                        employee.setName(txtStaffName.getText());
                        employee.getUserAccount().setPassword(txtPassword.getText());
                        employee.getUserAccount().setUsername(txtUserName.getText());
                        employee.setRole(drpdwnDesignation.getSelectedIndex() == 0 ? new Chef() : new DeliveryMan());
                        JOptionPane.showMessageDialog(this, "Staff details updated successfully");
                        initializeStaffTable();
                        resetFields();
                    }
                }
            } else {
                JOptionPane.showMessageDialog(this, "Please select a staff member to update from the table");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Fields cannot be empty for adding a new employee");
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        if (selectedStaff != null) {
            if (getRole(selectedStaff).equals("Chef")) {
                cateringService.getKitchen().getStaff().removeEmployee(selectedStaff);
            } else {
                cateringService.getTransport().getStaff().removeEmployee(selectedStaff);
            }
            system.getUserAccountDirectory().deleteUserAccount(selectedStaff.getUserAccount());
            JOptionPane.showMessageDialog(this, "Staff details deleted successfully");
            initializeStaffTable();
            resetFields();

        } else {
            JOptionPane.showMessageDialog(this, "Please select a staff member to delete from the table");
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void jComboChefAssignementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboChefAssignementActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboChefAssignementActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        for (Employee e : cateringService.getTransport().getStaff().getEmployeeList()) {
            if (e.getUserAccount().getUsername().equals(jComboDeleiveryManAssignment.getSelectedItem().toString())) {
                CateringContract a = (CateringContract) PrisonStaffJTable1.getModel().getValueAt(PrisonStaffJTable1.getSelectedRow(), 0);
                a.setDeliveryMan(e);
            }
        }

        populateContractTable();
        JOptionPane.showMessageDialog(this, "Delivery Man Assigned");

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:

        for (Employee e : cateringService.getKitchen().getStaff().getEmployeeList()) {
            if (e.getUserAccount().getUsername().equals(jComboChefAssignement.getSelectedItem().toString())) {
                CateringContract a = (CateringContract) PrisonStaffJTable1.getModel().getValueAt(PrisonStaffJTable1.getSelectedRow(), 0);
                a.setChef(e);
            }
        }

        populateContractTable();
        JOptionPane.showMessageDialog(this, "Chef Assigned");

    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:
        if (PrisonStaffJTable1.getSelectedRow() > -1) {
            CateringContract a = (CateringContract) PrisonStaffJTable1.getModel().getValueAt(PrisonStaffJTable1.getSelectedRow(), 0);
            a.setStatus("Approved and Active");
            populateContractTable();
            JOptionPane.showMessageDialog(this, "Contract approved");
        } else {
            JOptionPane.showMessageDialog(this, "Please select a contract to approve");
        }
    }//GEN-LAST:event_btnSubmitActionPerformed

    public boolean checkInputFields(javax.swing.JTextField txtField, String regex) {
        return txtField.getText() != null && !txtField.getText().isEmpty() && txtField.getText().matches(regex);
    }

    private String getRole(Employee employee) {
        if (employee != null) {
            String roleName = employee.getUserAccount().getRole().getClass().toString();
            return roleName.subSequence(roleName.lastIndexOf(".") + 1, roleName.length()).toString();
        }
        return null;
    }

    public boolean checkInputFields(javax.swing.JTextField txtField) {
        return txtField.getText() != null && !txtField.getText().isEmpty();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable PrisonStaffJTable1;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> drpdwnDesignation;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboChefAssignement;
    private javax.swing.JComboBox<String> jComboDeleiveryManAssignment;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblChefAssignment;
    private javax.swing.JLabel lblDeliveryManAssignement;
    private javax.swing.JLabel lblDesignation;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblStaffName;
    private javax.swing.JLabel lblUserName;
    private javax.swing.JTable tblCateringStaff;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtStaffName;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables

    private void resetFields() {
        txtPassword.setText("");
        txtStaffName.setText("");
        txtUserName.setText("");
        drpdwnDesignation.setSelectedIndex(0);
    }

}
