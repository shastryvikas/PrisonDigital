/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.SysAdmin;

import Model.CriminalJusticeSystem.CriminalJusticeSystem;
import Model.Employee.Employee;
import Model.Location;
import Model.PrisonEcosystem;
import Model.Role.CriminalJusticeSystemAdmin;
import java.awt.CardLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Thejas G R
 */
public class ManageJudicialSystem extends javax.swing.JPanel {

    /**
     * Creates new form ManageJudicialSystem
     */
    JPanel container;
    PrisonEcosystem system;
    CriminalJusticeSystem selectedJudicialSystem;

    public ManageJudicialSystem(JPanel container, PrisonEcosystem system) {
        initComponents();
        this.container = container;
        this.system = system;
        initializeTable();
        tblJudicialSytemAdmin.addMouseListener(new MouseListener() {
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
                selectedJudicialSystem = (CriminalJusticeSystem) tblJudicialSytemAdmin.getModel().getValueAt(tblJudicialSytemAdmin.getSelectedRow(), 0);
                txtJudicialSystemName.setText(selectedJudicialSystem.getName());
                txtJudicialSystemLocation.setText(String.valueOf(selectedJudicialSystem.getLocation()));
                txtJudicialSystemAdminPassword.setText(selectedJudicialSystem.getAdmin().getUserAccount().getPassword());
                txtJudicialSystemAdminUsername.setText(selectedJudicialSystem.getAdmin().getUserAccount().getUsername());
                txtJudicialSystemAdminName.setText(selectedJudicialSystem.getAdmin().getName());
                drpdwnStatus.setSelectedIndex(selectedJudicialSystem.getStatus() == true ? 0 : 1);
            }
        });
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
        tblJudicialSytemAdmin = new javax.swing.JTable();
        lblJudicialSystemName = new javax.swing.JLabel();
        txtJudicialSystemName = new javax.swing.JTextField();
        lblJudicialSystemLocation = new javax.swing.JLabel();
        txtJudicialSystemLocation = new javax.swing.JTextField();
        lblJudicialSystemAdminUsername = new javax.swing.JLabel();
        txtJudicialSystemAdminUsername = new javax.swing.JTextField();
        lblJudicialSystemAdminPassword = new javax.swing.JLabel();
        txtJudicialSystemAdminPassword = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        lblJudicialSystemStatus = new javax.swing.JLabel();
        drpdwnStatus = new javax.swing.JComboBox<>();
        lblJudicialSystemAdminName = new javax.swing.JLabel();
        txtJudicialSystemAdminName = new javax.swing.JTextField();

        setPreferredSize(new java.awt.Dimension(800, 600));

        tblJudicialSytemAdmin.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Judicial System Name", "Admin Name", "Username", "Password", "Location", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblJudicialSytemAdmin);

        lblJudicialSystemName.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblJudicialSystemName.setText("Judicial System Name");

        lblJudicialSystemLocation.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblJudicialSystemLocation.setText("Location");

        lblJudicialSystemAdminUsername.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblJudicialSystemAdminUsername.setText("Admin Username");

        lblJudicialSystemAdminPassword.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblJudicialSystemAdminPassword.setText("Admin Password");

        btnAdd.setBackground(new java.awt.Color(244, 208, 129));
        btnAdd.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(0, 0, 0));
        btnAdd.setText("Add");
        btnAdd.setPreferredSize(new java.awt.Dimension(85, 30));
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnUpdate.setBackground(new java.awt.Color(244, 208, 129));
        btnUpdate.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(0, 0, 0));
        btnUpdate.setText("Update");
        btnUpdate.setPreferredSize(new java.awt.Dimension(85, 30));
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
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

        lblJudicialSystemStatus.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblJudicialSystemStatus.setText("Status");

        drpdwnStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "In Service", "Out of Service" }));

        lblJudicialSystemAdminName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblJudicialSystemAdminName.setText("Admin Name");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblJudicialSystemLocation)
                            .addComponent(lblJudicialSystemStatus)))
                    .addComponent(lblJudicialSystemName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtJudicialSystemName)
                    .addComponent(txtJudicialSystemLocation, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                    .addComponent(drpdwnStatus, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addComponent(lblJudicialSystemAdminName, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtJudicialSystemAdminName, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnUpdate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblJudicialSystemAdminUsername, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblJudicialSystemAdminPassword, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtJudicialSystemAdminUsername)
                                    .addComponent(txtJudicialSystemAdminPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(125, 125, 125))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblJudicialSystemName)
                            .addComponent(txtJudicialSystemName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblJudicialSystemLocation, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtJudicialSystemLocation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblJudicialSystemAdminUsername)
                            .addComponent(txtJudicialSystemAdminUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblJudicialSystemAdminPassword)
                            .addComponent(txtJudicialSystemAdminPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblJudicialSystemAdminName)
                            .addComponent(txtJudicialSystemAdminName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(drpdwnStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblJudicialSystemStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(97, 97, 97)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        if (checkInputFields(txtJudicialSystemLocation) && checkInputFields(txtJudicialSystemAdminName) && checkInputFields(txtJudicialSystemName) && checkInputFields(txtJudicialSystemAdminPassword) && checkInputFields(txtJudicialSystemAdminUsername)) {
//            if (system.getPrisons().checkIfUsernameIsUnique(txtJudicialSystemAdminName.getText())) {
//String[] locationData =  txtJudicialSystemLocation.getText().split(", ");
//CriminalJusticeSystem newCJS = new CriminalJusticeSystem(txtJudicialSystemName.getText(), new Location(Double.parseDouble(locationData[0]), Double.parseDouble(locationData[1])), drpdwnStatus.getSelectedIndex()==0);
            if (checkIfCJSNameIsUnique()) {
                CriminalJusticeSystem newCriminalJusticeSystem = new CriminalJusticeSystem(txtJudicialSystemName.getText(), new Location(42.338767, -71.087863), true);
                Employee cjsAdmin = new Employee(system,txtJudicialSystemAdminName.getText(), txtJudicialSystemAdminUsername.getText(), txtJudicialSystemAdminPassword.getText(), newCriminalJusticeSystem, new CriminalJusticeSystemAdmin());
                newCriminalJusticeSystem.setAdmin(cjsAdmin);
                system.getCriminalJusticeSystems().add(newCriminalJusticeSystem);
                initializeTable();
                resetFields();
                JOptionPane.showMessageDialog(this, "New Criminal Justice System(CJS) has been added");
            } else {
                JOptionPane.showMessageDialog(this, "CJS name already exists, try a different name");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Fields cannot be empty for adding a new CJS");
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        if (checkInputFields(txtJudicialSystemLocation) && checkInputFields(txtJudicialSystemAdminName) && checkInputFields(txtJudicialSystemName) && checkInputFields(txtJudicialSystemAdminPassword) && checkInputFields(txtJudicialSystemAdminUsername)) {
            if (selectedJudicialSystem != null) {
                for (CriminalJusticeSystem cjs : system.getCriminalJusticeSystems()) {
                    if (selectedJudicialSystem.getName().equals(cjs.getName())) {
//                        String[] locationData =  txtJudicialSystemLocation.getText().split(", ");
                        cjs.setName(txtJudicialSystemName.getText());
//                         cjs.setLocation(new Location(Double.parseDouble(locationData[0]), Double.parseDouble(locationData[1])));
                        cjs.setLocation(new Location(42.338767, -71.087863));
                        cjs.getAdmin().getUserAccount().setUsername(txtJudicialSystemAdminUsername.getText());
                        cjs.getAdmin().getUserAccount().setPassword(txtJudicialSystemAdminPassword.getText());
                        cjs.getAdmin().setName(txtJudicialSystemAdminName.getText());
                        cjs.setStatus(drpdwnStatus.getSelectedIndex() == 0);
                        initializeTable();
                        resetFields();
                        JOptionPane.showMessageDialog(this, "Criminal Justice System details updated successfully");
                        break;
                    }
                }
            } else {
                JOptionPane.showMessageDialog(this, "Please select a criminal justice system to update from the table");
            }
        }
    }//GEN-LAST:event_btnUpdateActionPerformed
    private void initializeTable() {
        ArrayList<CriminalJusticeSystem> cjsDetials = system.getCriminalJusticeSystems();
        DefaultTableModel tablemodel = (DefaultTableModel) tblJudicialSytemAdmin.getModel();
        tablemodel.setRowCount(0);
        if (cjsDetials != null) {
            for (CriminalJusticeSystem cjs : cjsDetials) {
                if (cjs != null) {
                    Object[] row = new Object[6];
                    row[0] = cjs;
                    row[1] = cjs.getAdmin().getName();
                    row[2] = cjs.getAdmin().getUserAccount().getUsername();
                    row[3] = cjs.getAdmin().getUserAccount().getPassword();
                    row[4] = String.valueOf(cjs.getLocation());
                    row[5] = cjs.getStatus() == true ? "In service"
                            : "Out of service";
                    tablemodel.addRow(row);
                }
            }
        }
    }

    public boolean checkInputFields(javax.swing.JTextField txtField, String regex) {
        return txtField.getText() != null && !txtField.getText().isEmpty() && txtField.getText().matches(regex);
    }

    public boolean checkInputFields(javax.swing.JTextField txtField) {
        return txtField.getText() != null && !txtField.getText().isEmpty();
    }

    private void resetFields() {
        txtJudicialSystemLocation.setText("");
        txtJudicialSystemName.setText("");
        txtJudicialSystemAdminPassword.setText("");
        txtJudicialSystemAdminUsername.setText("");
        txtJudicialSystemAdminName.setText("");
        drpdwnStatus.setSelectedIndex(0);
    }
    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        container.remove(this);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.previous(container);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> drpdwnStatus;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblJudicialSystemAdminName;
    private javax.swing.JLabel lblJudicialSystemAdminPassword;
    private javax.swing.JLabel lblJudicialSystemAdminUsername;
    private javax.swing.JLabel lblJudicialSystemLocation;
    private javax.swing.JLabel lblJudicialSystemName;
    private javax.swing.JLabel lblJudicialSystemStatus;
    private javax.swing.JTable tblJudicialSytemAdmin;
    private javax.swing.JTextField txtJudicialSystemAdminName;
    private javax.swing.JTextField txtJudicialSystemAdminPassword;
    private javax.swing.JTextField txtJudicialSystemAdminUsername;
    private javax.swing.JTextField txtJudicialSystemLocation;
    private javax.swing.JTextField txtJudicialSystemName;
    // End of variables declaration//GEN-END:variables

    private boolean checkIfCJSNameIsUnique() {
        if (checkInputFields(txtJudicialSystemName)) {
            for (CriminalJusticeSystem criminalJusticeSystem : system.getCriminalJusticeSystems()) {
                if (criminalJusticeSystem.getName().equals(txtJudicialSystemName.getText())) {
                    return false;
                }
            }
        }
        return true;
    }
}
