/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.Prison;

import Model.Employee.Employee;
import Model.Prison.Prison;
import Model.PrisonEcosystem;
import Model.Role.DiningAdmin;
import Model.Role.InfirmaryAdmin;
import Model.Role.PrisonStaff;
import Model.UserAccountManagement.UserAccount;
import java.awt.CardLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author udayindukuri
 */
public class PrisonAdminStaffManagementPage extends javax.swing.JPanel {

    CardLayout cardLayoutPointer;
    JPanel container;
    PrisonEcosystem system;
    UserAccount user;
    Prison prison;

    /**
     * Creates new form PrisonAdminJPanel
     */
    public PrisonAdminStaffManagementPage(JPanel container, UserAccount user, PrisonEcosystem system) {
        initComponents();
        this.container = container;
        cardLayoutPointer = (CardLayout) container.getLayout();
        this.system = system;
        this.user = user;
        this.prison = (Prison) user.getEnterprise();
        populateTable();
        
        PrisonStaffJTable.addMouseListener(new MouseListener() {
                @Override
                public void mouseClicked(MouseEvent e) {
                }

                @Override
                public void mousePressed(MouseEvent e) {
                    Employee a = (Employee) PrisonStaffJTable.getModel().getValueAt(PrisonStaffJTable.getSelectedRow(), 0);
                    displayDataInFields(a);
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
    
    private void displayDataInFields(Employee a) {
        
        txtStaffName.setText(a.getName());
        txtUserName.setText(a.getUserAccount().getUsername());
        txtPassword.setText(a.getUserAccount().getPassword());
        
        if(a.getRole().equals(InfirmaryAdmin.class.getName())){
            des.setSelectedIndex(1);
        } else if(a.getRole().equals(DiningAdmin.class.getName())){
            des.setSelectedIndex(2);
        } else {
            des.setSelectedIndex(0);
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
        PrisonStaffJTable = new javax.swing.JTable();
        lblStaffName = new javax.swing.JLabel();
        lblDesignation = new javax.swing.JLabel();
        lblUserName = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        txtStaffName = new javax.swing.JTextField();
        txtUserName = new javax.swing.JTextField();
        txtPassword = new javax.swing.JTextField();
        btnUpdate = new javax.swing.JButton();
        btnCreate1 = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        des = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Prison Admin Work Area");
        jLabel1.setOpaque(true);

        PrisonStaffJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Name", "Designation", "UserName", "Password"
            }
        ));
        jScrollPane1.setViewportView(PrisonStaffJTable);

        lblStaffName.setText("Staff Name:");

        lblDesignation.setText("Designation:");

        lblUserName.setText("User Name:");

        lblPassword.setText("Password:");

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

        btnCreate1.setText("Create");
        btnCreate1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreate1ActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        des.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Guard", "Infirmary Supervisor", "Dining Supervisor" }));

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 788, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblStaffName)
                                .addGap(18, 18, 18)
                                .addComponent(txtStaffName, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblUserName)
                                    .addComponent(lblPassword)
                                    .addComponent(btnCreate1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnUpdate)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnDelete))
                                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblDesignation)
                        .addGap(32, 32, 32)
                        .addComponent(des, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(37, 37, 37))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblStaffName)
                    .addComponent(lblDesignation)
                    .addComponent(txtStaffName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(des, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUserName)
                    .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPassword)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpdate)
                    .addComponent(btnDelete)
                    .addComponent(btnCreate1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap(22, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtUserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserNameActionPerformed

    private void btnCreate1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreate1ActionPerformed
        // TODO add your handling code here:

        String name = txtStaffName.getText().toString();
        String username = txtUserName.getText().toString();
        String password = txtPassword.getText().toString();

        if (des.getSelectedItem().toString().equals("Guard")) {
            Employee staff = new Employee(system, name, username, password, user.getEnterprise(), new PrisonStaff());
            prison.getManagement().getStaff().addEmployee(staff);
            JOptionPane.showMessageDialog(null, "Guard Added");
        } else if (des.getSelectedItem().toString().equals("Infirmary Supervisor")) {
            if (prison.getManagement().getInfirmaryAdmin() != null) {
                JOptionPane.showMessageDialog(null, "Infirmary Supervisor Already Exists");
                return;
            }
            Employee staff = new Employee(system, name, username, password, user.getEnterprise(), new InfirmaryAdmin());
            prison.getManagement().setInfirmaryAdmin(staff);
            JOptionPane.showMessageDialog(null, "Infirmary Supervisor Added");
        } else if (des.getSelectedItem().toString().equals("Dining Supervisor")) {
            if (prison.getManagement().getDiningAdmin() != null) {
                JOptionPane.showMessageDialog(null, "Dining Supervisor Already Exists");
                return;
            }
            Employee staff = new Employee(system, name, username, password, user.getEnterprise(), new DiningAdmin());
            prison.getManagement().setDiningAdmin(staff);
            JOptionPane.showMessageDialog(null, "Dining Supervisor Added");
        };

        populateTable();

    }//GEN-LAST:event_btnCreate1ActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:

        int selectedRow = PrisonStaffJTable.getSelectedRow();
        if (selectedRow >= 0) {
            int selectionButton = JOptionPane.YES_NO_OPTION;
            int selectionResult = JOptionPane.showConfirmDialog(null, "Confirm delete?", "Warning", selectionButton);
            if (selectionResult == JOptionPane.YES_OPTION) {
                Employee e = (Employee) PrisonStaffJTable.getValueAt(selectedRow, 0);

                if (e.getRole().toString() == "Model.Role.InfirmaryAdmin") {
                    prison.getManagement().setInfirmaryAdmin(null);
                } else if (e.getRole().toString() == "Model.Role.DiningAdmin") {
                    prison.getManagement().setDiningAdmin(null);
                } else {
                    prison.getManagement().getStaff().removeEmployee(e);
                }

                populateTable();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please select a row to delete the account");
        }


    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:

        int selectedRow = PrisonStaffJTable.getSelectedRow();
        if (selectedRow >= 0) {
            int selectionButton = JOptionPane.YES_NO_OPTION;
            int selectionResult = JOptionPane.showConfirmDialog(null, "Confirm update?", "Warning", selectionButton);
            if (selectionResult == JOptionPane.YES_OPTION) {
                Employee e = (Employee) PrisonStaffJTable.getValueAt(selectedRow, 0);

                String name = txtStaffName.getText().toString();
                String username = txtUserName.getText().toString();
                String password = txtPassword.getText().toString();
                
                
                if(e.getRole().equals(InfirmaryAdmin.class.getName()) || e.getRole().equals(DiningAdmin.class.getName())){
                    e.setRole(null);
                }

                if (des.getSelectedItem().toString().equals("Guard")) {
                    e.setRole(new PrisonStaff());
                    e.setName(name);
                    e.getUserAccount().setUsername(username);
                    e.getUserAccount().setPassword(password);
                    JOptionPane.showMessageDialog(null, "Guard Added");
                } else if (des.getSelectedItem().toString().equals("Infirmary Supervisor")) {
                    if (prison.getManagement().getInfirmaryAdmin() == null) {
                        JOptionPane.showMessageDialog(null, "Infirmary Supervisor Already Exists");
                        return;
                    }
                    e.setRole(new InfirmaryAdmin());
                    prison.getManagement().setInfirmaryAdmin(e);
                    e.setName(name);
                    e.getUserAccount().setUsername(username);
                    e.getUserAccount().setPassword(password);
                    JOptionPane.showMessageDialog(null, "Infirmary Supervisor Added");
                } else if (des.getSelectedItem().toString().equals("Dining Supervisor")) {
                    if (prison.getManagement().getDiningAdmin() == null) {
                        JOptionPane.showMessageDialog(null, "Dining Supervisor Already Exists");
                        return;
                    }
                    e.setRole(new DiningAdmin());
                    prison.getManagement().setInfirmaryAdmin(e);
                    e.setName(name);
                    e.getUserAccount().setUsername(username);
                    e.getUserAccount().setPassword(password);
                    JOptionPane.showMessageDialog(null, "Dining Supervisor Added");
                };

                populateTable();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please select a row to delete the account");
        }

    }//GEN-LAST:event_btnUpdateActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        container.remove(this);
        cardLayoutPointer.previous(container);
        
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable PrisonStaffJTable;
    private javax.swing.JButton btnCreate1;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> des;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDesignation;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblStaffName;
    private javax.swing.JLabel lblUserName;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtStaffName;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {

        DefaultTableModel tablemodel = (DefaultTableModel) PrisonStaffJTable.getModel();

        tablemodel.setRowCount(0);

        //adding infirmary
        Employee e = prison.getManagement().getInfirmaryAdmin();
        if (e != null) {
            Object[] row = new Object[4];
            row[0] = e;
            row[1] = e.getRole().toString();
            row[2] = e.getUserAccount().getUsername();
            row[3] = e.getUserAccount().getPassword();
            tablemodel.addRow(row);
        }
        

        for (Employee user : prison.getManagement().getStaff().getEmployeeList()) {
            Object[] row = new Object[4];
            row[0] = user;
            row[1] = user.getRole().toString();
            row[2] = user.getUserAccount().getUsername();
            row[3] = user.getUserAccount().getPassword();

            tablemodel.addRow(row);
        }
        
        //adding Dining
        Employee f = prison.getManagement().getDiningAdmin();
        if (f != null) {
            Object[] row = new Object[4];
            row[0] = f;
            row[1] = f.getRole().toString();
            row[2] = f.getUserAccount().getUsername();
            row[3] = f.getUserAccount().getPassword();
            tablemodel.addRow(row);
        }

    }
}
