/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.Catering;

import Model.DB4OUtil.DB4OUtil;
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tblCateringStaff = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        PrisonStaffJTable1 = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lblStaffName = new javax.swing.JLabel();
        txtStaffName = new javax.swing.JTextField();
        lblDesignation = new javax.swing.JLabel();
        drpdwnDesignation = new javax.swing.JComboBox<>();
        lblUserName = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        txtPassword = new javax.swing.JTextField();
        lblPassword = new javax.swing.JLabel();
        btnUpdate = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        lblDeliveryManAssignement = new javax.swing.JLabel();
        jComboDeleiveryManAssignment = new javax.swing.JComboBox<>();
        lblChefAssignment = new javax.swing.JLabel();
        jComboChefAssignement = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        btnSubmit = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblCateringStaff.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
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

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 1109, 160));

        PrisonStaffJTable1.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
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

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 1110, 200));

        jLabel7.setBackground(new java.awt.Color(71, 120, 197));
        jLabel7.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("   Food Catering Service Administrator");
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

        lblStaffName.setFont(new java.awt.Font("Monospaced", 0, 13)); // NOI18N
        lblStaffName.setText("Staff Name:");

        txtStaffName.setFont(new java.awt.Font("Monospaced", 0, 13)); // NOI18N

        lblDesignation.setFont(new java.awt.Font("Monospaced", 0, 13)); // NOI18N
        lblDesignation.setText("Designation:");

        drpdwnDesignation.setFont(new java.awt.Font("Monospaced", 0, 13)); // NOI18N
        drpdwnDesignation.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Chef", "DeliveryMan" }));

        lblUserName.setFont(new java.awt.Font("Monospaced", 0, 13)); // NOI18N
        lblUserName.setText("User Name:");

        txtUserName.setFont(new java.awt.Font("Monospaced", 0, 13)); // NOI18N
        txtUserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserNameActionPerformed(evt);
            }
        });

        txtPassword.setFont(new java.awt.Font("Monospaced", 0, 13)); // NOI18N

        lblPassword.setFont(new java.awt.Font("Monospaced", 0, 13)); // NOI18N
        lblPassword.setText("Password:");

        btnUpdate.setFont(new java.awt.Font("Monospaced", 0, 13)); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnAdd.setFont(new java.awt.Font("Monospaced", 0, 13)); // NOI18N
        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnDelete.setFont(new java.awt.Font("Monospaced", 0, 13)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblStaffName)
                    .addComponent(lblDesignation))
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtStaffName)
                    .addComponent(drpdwnDesignation, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(79, 79, 79)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblUserName)
                    .addComponent(lblPassword))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtUserName)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 111, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnAdd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnUpdate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDelete))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(lblUserName)
                            .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblStaffName)
                            .addComponent(txtStaffName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(lblDesignation)
                            .addComponent(drpdwnDesignation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPassword)
                            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 1110, 110));

        jPanel3.setBackground(new java.awt.Color(242, 248, 255));

        lblDeliveryManAssignement.setFont(new java.awt.Font("Monospaced", 0, 13)); // NOI18N
        lblDeliveryManAssignement.setText("Delivery Man Assignment");

        jComboDeleiveryManAssignment.setFont(new java.awt.Font("Monospaced", 0, 13)); // NOI18N

        lblChefAssignment.setFont(new java.awt.Font("Monospaced", 0, 13)); // NOI18N
        lblChefAssignment.setText("Chef Assignment");

        jComboChefAssignement.setFont(new java.awt.Font("Monospaced", 0, 13)); // NOI18N
        jComboChefAssignement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboChefAssignementActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Monospaced", 0, 13)); // NOI18N
        jButton1.setText("Assign Delivery Man");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Monospaced", 0, 13)); // NOI18N
        jButton2.setText("Assign Chef");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        btnSubmit.setFont(new java.awt.Font("Monospaced", 0, 13)); // NOI18N
        btnSubmit.setText("Approve");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lblDeliveryManAssignement)
                        .addGap(12, 12, 12)
                        .addComponent(jComboDeleiveryManAssignment, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lblChefAssignment)
                        .addGap(45, 45, 45)
                        .addComponent(jComboChefAssignement, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 94, Short.MAX_VALUE)
                .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboDeleiveryManAssignment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboChefAssignement, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblDeliveryManAssignement)
                                    .addComponent(lblChefAssignment))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jButton2)
                            .addComponent(jButton1)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 580, 1110, 100));
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
            DB4OUtil.storeSystem(system);
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
                        DB4OUtil.storeSystem(system);
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
            DB4OUtil.storeSystem(system);
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
        DB4OUtil.storeSystem(system);

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
        DB4OUtil.storeSystem(system);

    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:
        if (PrisonStaffJTable1.getSelectedRow() > -1) {
            CateringContract a = (CateringContract) PrisonStaffJTable1.getModel().getValueAt(PrisonStaffJTable1.getSelectedRow(), 0);
            a.setStatus("Approved and Active");
            populateContractTable();
            JOptionPane.showMessageDialog(this, "Contract approved");
            DB4OUtil.storeSystem(system);
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
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
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
