/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.SysAdmin;

import Model.Employee.Employee;
import Model.FoodCateringService.FoodCateringService;
import Model.Location;
import Model.PrisonEcosystem;
import Model.Role.FoodCateringServiceAdmin;
import java.awt.CardLayout;
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
public class ManageCaterers extends javax.swing.JPanel {

    JPanel container;
    PrisonEcosystem system;
    FoodCateringService selectedCateringService;

    /**
     * Creates new form ManageCaterers
     *
     * @param container
     * @param system
     */
    public ManageCaterers(JPanel container, PrisonEcosystem system) {
        initComponents();
        this.container = container;
        this.system = system;
        initializeTable();
        tblCaterers.addMouseListener(new MouseListener() {
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
                selectedCateringService = (FoodCateringService) tblCaterers.getModel().getValueAt(tblCaterers.getSelectedRow(), 0);
                txtCatererName.setText(selectedCateringService.getName());
                txtCatererLocation.setText(String.valueOf(selectedCateringService.getLocation()));
                txtCatererAdminPassword.setText(selectedCateringService.getManagement().getAdmin().getUserAccount().getPassword());
                txtCatererAdminUsername.setText(selectedCateringService.getManagement().getAdmin().getUserAccount().getUsername());
                txtCatererAdminName.setText(selectedCateringService.getManagement().getAdmin().getName());
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
        tblCaterers = new javax.swing.JTable();
        lblCatererName = new javax.swing.JLabel();
        txtCatererName = new javax.swing.JTextField();
        lblCatererLocation = new javax.swing.JLabel();
        txtCatererLocation = new javax.swing.JTextField();
        lblCatererAdminUsername = new javax.swing.JLabel();
        txtCatererAdminUsername = new javax.swing.JTextField();
        lblCatererAdminPassword = new javax.swing.JLabel();
        txtCatererAdminPassword = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        lblCatererAdminName = new javax.swing.JLabel();
        txtCatererAdminName = new javax.swing.JTextField();
        lblCatererLocation1 = new javax.swing.JLabel();
        drpdwnStatus = new javax.swing.JComboBox<>();

        tblCaterers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Caterer Name", "Admin Name", "Username", "Password", "Location", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblCaterers);

        lblCatererName.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblCatererName.setText("Caterer Name");

        lblCatererLocation.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblCatererLocation.setText("Location");

        lblCatererAdminUsername.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCatererAdminUsername.setText("Admin Username");

        lblCatererAdminPassword.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCatererAdminPassword.setText("Admin Password");

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

        lblCatererAdminName.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblCatererAdminName.setText("Admin Name");

        lblCatererLocation1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblCatererLocation1.setText("Status");

        drpdwnStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "In Service", "Out of service" }));

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
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblCatererName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblCatererLocation1)
                                    .addComponent(lblCatererLocation))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtCatererName)
                            .addComponent(txtCatererLocation, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                            .addComponent(drpdwnStatus, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(158, 158, 158)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblCatererAdminUsername, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblCatererAdminPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblCatererAdminName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtCatererAdminName)
                                .addComponent(txtCatererAdminUsername)
                                .addComponent(txtCatererAdminPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)))
                        .addGap(125, 125, 125))))
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
                            .addComponent(lblCatererName)
                            .addComponent(txtCatererName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCatererLocation, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCatererLocation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCatererAdminUsername)
                            .addComponent(txtCatererAdminUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCatererAdminPassword)
                            .addComponent(txtCatererAdminPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblCatererAdminName)
                        .addComponent(txtCatererAdminName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblCatererLocation1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(drpdwnStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
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
        if (checkInputFields(txtCatererName) && checkInputFields(txtCatererAdminName) && checkInputFields(txtCatererAdminUsername) && checkInputFields(txtCatererAdminPassword) && checkInputFields(txtCatererLocation)) {
            if (checkIfCatererNameIsUnique()) {
                FoodCateringService newCaterer = new FoodCateringService(txtCatererName.getText(), new Location(42.338767, -71.087863), true);
                Employee CateringAdmin = new Employee(system,txtCatererAdminName.getText(), txtCatererAdminUsername.getText(), txtCatererAdminPassword.getText(), newCaterer, new FoodCateringServiceAdmin());
                newCaterer.getManagement().setAdmin(CateringAdmin);
                system.getCateringServices().add(newCaterer);
                initializeTable();
                resetFields();
                JOptionPane.showMessageDialog(this, "New Caterer has been added");
            } else {
                JOptionPane.showMessageDialog(this, "Caterer name already exists, try a different name");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Fields cannot be empty for adding a new Caterer");
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
//        if (checkInputFields(txtCatererName) && checkInputFields(txtCatererAdminUsername) && checkInputFields(txtCatererAdminPassword) && checkInputFields(txtCatererLocation)) {
//            if (selectedCateringService != null) {
//                for (FoodCateringService cateringService : system.getCateringServices()) {
//                    if (selectedCateringService.getName().equals(cateringService.getName())) {
//                        cateringService.setName(txtCatererName.getText());
////                       String[] locationData =  txtCatererLocation.getText().split(", ");
////                       cateringService.setLocation(new Location(Double.parseDouble(locationData[0]), Double.parseDouble(locationData[1])));
//                        cateringService.setLocation(new Location(42.338767, -71.087863));
//                        cateringService.getManagement().getAdmin().getUserAccount().setUsername(txtCatererAdminUsername.getText());
//                        cateringService.getManagement().getAdmin().getUserAccount().setPassword(txtCatererAdminPassword.getText());
//                        cateringService.getManagement().getAdmin().setName(txtCatererAdminName.getText());
//                        cateringService.setStatus(drpdwnStatus.getSelectedIndex()==0);
//                        initializeTable();
//                        resetFields();
//                        JOptionPane.showMessageDialog(this, "Caterer details updated successfully");
//                        break;
//                    }
//                }
//            } else {
//                JOptionPane.showMessageDialog(this, "Please select a caterer to update from the table");
//            }
//        }else{
//             JOptionPane.showMessageDialog(this, "Fields cannot be empty for updating caterer's details");
//        }

    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        container.remove(this);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.previous(container);
    }//GEN-LAST:event_btnBackActionPerformed

    public boolean checkInputFields(javax.swing.JTextField txtField, String regex) {
        return txtField.getText() != null && !txtField.getText().isEmpty() && txtField.getText().matches(regex);
    }

    public boolean checkInputFields(javax.swing.JTextField txtField) {
        return txtField.getText() != null && !txtField.getText().isEmpty();
    }

    private void initializeTable() {
        ArrayList<FoodCateringService> catererDetails = system.getCateringServices();
        DefaultTableModel tablemodel = (DefaultTableModel) tblCaterers.getModel();
        tablemodel.setRowCount(0);
        if (catererDetails != null) {
            for (FoodCateringService caterer : catererDetails) {
                if (caterer != null) {
                    Object[] row = new Object[6];
                    row[0] = caterer;
                    row[1] = caterer.getManagement().getAdmin().getName();
                    row[2] = caterer.getManagement().getAdmin().getUserAccount().getUsername();
                    row[3] = caterer.getManagement().getAdmin().getUserAccount().getPassword();
                    row[4] = caterer.getLocation();
                    row[5] = caterer.getStatus() == true ? "In service" : "Out of service";
                    tablemodel.addRow(row);
                }
            }
        }
    }

    private void resetFields() {
        txtCatererLocation.setText("");
        txtCatererAdminUsername.setText("");
        txtCatererAdminPassword.setText("");
        txtCatererName.setText("");
        txtCatererAdminName.setText("");
        drpdwnStatus.setSelectedIndex(0);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> drpdwnStatus;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCatererAdminName;
    private javax.swing.JLabel lblCatererAdminPassword;
    private javax.swing.JLabel lblCatererAdminUsername;
    private javax.swing.JLabel lblCatererLocation;
    private javax.swing.JLabel lblCatererLocation1;
    private javax.swing.JLabel lblCatererName;
    private javax.swing.JTable tblCaterers;
    private javax.swing.JTextField txtCatererAdminName;
    private javax.swing.JTextField txtCatererAdminPassword;
    private javax.swing.JTextField txtCatererAdminUsername;
    private javax.swing.JTextField txtCatererLocation;
    private javax.swing.JTextField txtCatererName;
    // End of variables declaration//GEN-END:variables

    private boolean checkIfCatererNameIsUnique() {
        if(checkInputFields(txtCatererName))
        for (FoodCateringService cateringService : system.getCateringServices()) {
            if (cateringService.getName().equals(txtCatererName.getText())) {
                return false;
            }
        }
        return true;
    }
}
