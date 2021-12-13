/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.SysAdmin;

import Model.DB4OUtil.DB4OUtil;
import Model.Employee.Employee;
import Model.Location;
import Model.Prison.Prison;
import Model.PrisonEcosystem;
import Model.Role.PrisonAdmin;
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
public class ManagePrisons extends javax.swing.JPanel {

    JPanel container;
    PrisonEcosystem system;
    Prison selectedPrison;

    /**
     * Creates new form ManagePrisons
     *
     * @param container
     * @param system
     */
    public ManagePrisons(JPanel container, PrisonEcosystem system) {
        initComponents();
        this.container = container;
        this.system = system;
        initializeTable();
        tblPrisons.addMouseListener(new MouseListener() {
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
                selectedPrison = (Prison) tblPrisons.getModel().getValueAt(tblPrisons.getSelectedRow(), 0);
                txtPrisonName.setText(selectedPrison.getName());
                txtPrisonAdminName.setText(selectedPrison.getManagement().getAdmin().getName());
                txtPrisonLocation.setText(String.valueOf(selectedPrison.getLocation()));
                txtPrisonAdminPassword.setText(selectedPrison.getManagement().getAdmin().getUserAccount().getPassword());
                txtPrisonAdminUsername.setText(selectedPrison.getManagement().getAdmin().getUserAccount().getUsername());
                drpdwnStatus.setSelectedIndex(selectedPrison.getStatus() == true ? 0 : 1);
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
        tblPrisons = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        addBtn = new javax.swing.JLabel();
        updateBtn = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblPrisonLocation = new javax.swing.JLabel();
        lblPrisonStatus = new javax.swing.JLabel();
        txtPrisonName = new javax.swing.JTextField();
        txtPrisonLocation = new javax.swing.JTextField();
        drpdwnStatus = new javax.swing.JComboBox<>();
        lblPrisonAdminUsername = new javax.swing.JLabel();
        txtPrisonAdminUsername = new javax.swing.JTextField();
        lblPrisonAdminPassword = new javax.swing.JLabel();
        txtPrisonAdminPassword = new javax.swing.JTextField();
        lblPrisonAdminName = new javax.swing.JLabel();
        txtPrisonAdminName = new javax.swing.JTextField();
        lblPrisonName = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(1000, 660));
        setMinimumSize(new java.awt.Dimension(1000, 660));
        setPreferredSize(new java.awt.Dimension(1000, 660));
        setSize(new java.awt.Dimension(1000, 660));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblPrisons.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        tblPrisons.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Prison Name", "Admin Name", "Username", "Password", "Location", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblPrisons);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 960, 280));

        jPanel1.setBackground(new java.awt.Color(235, 242, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        addBtn.setBackground(new java.awt.Color(120, 168, 255));
        addBtn.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        addBtn.setForeground(new java.awt.Color(255, 255, 255));
        addBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        addBtn.setText("Add");
        addBtn.setOpaque(true);
        addBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addBtnMouseClicked(evt);
            }
        });
        jPanel1.add(addBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 50));

        updateBtn.setBackground(new java.awt.Color(120, 168, 255));
        updateBtn.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        updateBtn.setForeground(new java.awt.Color(255, 255, 255));
        updateBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        updateBtn.setText("Update");
        updateBtn.setOpaque(true);
        updateBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateBtnMouseClicked(evt);
            }
        });
        jPanel1.add(updateBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 0, 500, 50));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 560, 1000, 50));

        jPanel2.setBackground(new java.awt.Color(242, 248, 255));

        lblPrisonLocation.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        lblPrisonLocation.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblPrisonLocation.setText("Location");

        lblPrisonStatus.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        lblPrisonStatus.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblPrisonStatus.setText("Status");

        txtPrisonName.setFont(new java.awt.Font("Monospaced", 0, 13)); // NOI18N

        txtPrisonLocation.setFont(new java.awt.Font("Monospaced", 0, 13)); // NOI18N

        drpdwnStatus.setFont(new java.awt.Font("Monospaced", 0, 13)); // NOI18N
        drpdwnStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "In Service", "Out of Service" }));

        lblPrisonAdminUsername.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        lblPrisonAdminUsername.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblPrisonAdminUsername.setText("Admin Username");

        txtPrisonAdminUsername.setFont(new java.awt.Font("Monospaced", 0, 13)); // NOI18N

        lblPrisonAdminPassword.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        lblPrisonAdminPassword.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblPrisonAdminPassword.setText("Admin Password");

        txtPrisonAdminPassword.setFont(new java.awt.Font("Monospaced", 0, 13)); // NOI18N

        lblPrisonAdminName.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        lblPrisonAdminName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblPrisonAdminName.setText("Admin Name");

        txtPrisonAdminName.setFont(new java.awt.Font("Monospaced", 0, 13)); // NOI18N

        lblPrisonName.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        lblPrisonName.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblPrisonName.setText("Name");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPrisonName)
                    .addComponent(lblPrisonLocation)
                    .addComponent(lblPrisonStatus))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtPrisonName)
                    .addComponent(txtPrisonLocation)
                    .addComponent(drpdwnStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 141, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPrisonAdminName)
                    .addComponent(lblPrisonAdminUsername)
                    .addComponent(lblPrisonAdminPassword))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtPrisonAdminUsername, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                    .addComponent(txtPrisonAdminPassword)
                    .addComponent(txtPrisonAdminName))
                .addGap(78, 78, 78))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPrisonAdminUsername)
                            .addComponent(txtPrisonAdminUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPrisonAdminPassword)
                            .addComponent(txtPrisonAdminPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPrisonAdminName)
                            .addComponent(txtPrisonAdminName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPrisonName)
                            .addComponent(txtPrisonName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPrisonLocation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPrisonLocation))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(drpdwnStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPrisonStatus))))
                .addGap(39, 39, 39))
        );

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 1000, 200));
    }// </editor-fold>//GEN-END:initComponents

    private void addBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addBtnMouseClicked
        // TODO add your handling code here:
        
        if (checkInputFields(txtPrisonName) && checkInputFields(txtPrisonAdminName) && checkInputFields(txtPrisonAdminUsername) && checkInputFields(txtPrisonAdminPassword) && checkInputFields(txtPrisonLocation)) {
//            if (system.getPrisons().checkIfUsernameIsUnique(txtPrisonName.getText())) {

            //Validation
            if(!checkInputFields(txtPrisonName, "^[\\p{L} .'-]+$") || !checkInputFields(txtPrisonAdminName, "^[\\p{L} .'-]+$") || !checkInputFields(txtPrisonAdminUsername, "^[\\p{L} .'-]+$")
                    || !checkInputFields(txtPrisonAdminPassword, "^[\\p{L} .'-]+$") || !checkInputFields(txtPrisonLocation, "^[\\p{L} .'-]+$")){
                JOptionPane.showMessageDialog(this, "Please enter valid Prison details");
                return;
            }

            if (checkIfPrisonNameIsUnique()) {
                //String[] locationData =  txtPrisonLocation.getText().split(", ");
//Prison newPrison = new Prison(txtPrisonName.getText(), new Location(Double.parseDouble(locationData[0]), Double.parseDouble(locationData[1])));
                Prison newPrison = new Prison(txtPrisonName.getText(), txtPrisonLocation.getText(), true);
                Employee prisonAdmin = new Employee(system, txtPrisonAdminName.getText(), txtPrisonAdminUsername.getText(), txtPrisonAdminPassword.getText(), newPrison, new PrisonAdmin());
                newPrison.getManagement().setAdmin(prisonAdmin);
                system.getPrisons().add(newPrison);
                initializeTable();
                resetFields();
                JOptionPane.showMessageDialog(this, "New Prison has been added");
                DB4OUtil.storeSystem(system);
            } else {
                JOptionPane.showMessageDialog(this, "Prison name already exists, try a different name");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Fields cannot be empty for adding a new Prison");
        }
        
    }//GEN-LAST:event_addBtnMouseClicked

    private void updateBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateBtnMouseClicked
        // TODO add your handling code here:
        
        if (checkInputFields(txtPrisonName) && checkInputFields(txtPrisonAdminName) && checkInputFields(txtPrisonAdminUsername) && checkInputFields(txtPrisonAdminPassword) && checkInputFields(txtPrisonLocation)) {
            if (selectedPrison != null) {
                
                 //Validation
            if(!checkInputFields(txtPrisonName, "^[\\p{L} .'-]+$") || !checkInputFields(txtPrisonAdminName, "^[\\p{L} .'-]+$") || !checkInputFields(txtPrisonAdminUsername, "^[\\p{L} .'-]+$")
                    || !checkInputFields(txtPrisonAdminPassword, "^[\\p{L} .'-]+$") || !checkInputFields(txtPrisonLocation, "^[\\p{L} .'-]+$")){
                JOptionPane.showMessageDialog(this, "Please enter valid Prison details before updating");
                return;
            }
                
                for (Prison prison : system.getPrisons()) {
                    if (selectedPrison.getName().equals(prison.getName())) {
                        //String[] locationData =  txtPrisonLocation.getText().split(", ");
                        prison.setName(txtPrisonName.getText());
                        // prison.setLocation(new Location(Double.parseDouble(locationData[0]), Double.parseDouble(locationData[1])));
                        //prison.setLocation(new Location(42.338767, -71.087863));
                        prison.setLocation(txtPrisonLocation.getText());
                        prison.getManagement().getAdmin().getUserAccount().setUsername(txtPrisonAdminUsername.getText());
                        prison.getManagement().getAdmin().getUserAccount().setPassword(txtPrisonAdminPassword.getText());
                        prison.getManagement().getAdmin().setName(txtPrisonAdminName.getText());
                        prison.setStatus(drpdwnStatus.getSelectedIndex() == 0);
                        initializeTable();
                        resetFields();
                        JOptionPane.showMessageDialog(this, "Prison details updated successfully");
                        DB4OUtil.storeSystem(system);
                        break;
                    }
                }
            } else {
                JOptionPane.showMessageDialog(this, "Please select a prison to update from the table");
            }
        }

        
    }//GEN-LAST:event_updateBtnMouseClicked

    public boolean checkInputFields(javax.swing.JTextField txtField, String regex) {
        return txtField.getText() != null && !txtField.getText().isEmpty() && txtField.getText().matches(regex);
    }

    public boolean checkInputFields(javax.swing.JTextField txtField) {
        return txtField.getText() != null && !txtField.getText().isEmpty();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addBtn;
    private javax.swing.JComboBox<String> drpdwnStatus;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblPrisonAdminName;
    private javax.swing.JLabel lblPrisonAdminPassword;
    private javax.swing.JLabel lblPrisonAdminUsername;
    private javax.swing.JLabel lblPrisonLocation;
    private javax.swing.JLabel lblPrisonName;
    private javax.swing.JLabel lblPrisonStatus;
    private javax.swing.JTable tblPrisons;
    private javax.swing.JTextField txtPrisonAdminName;
    private javax.swing.JTextField txtPrisonAdminPassword;
    private javax.swing.JTextField txtPrisonAdminUsername;
    private javax.swing.JTextField txtPrisonLocation;
    private javax.swing.JTextField txtPrisonName;
    private javax.swing.JLabel updateBtn;
    // End of variables declaration//GEN-END:variables

    private void initializeTable() {
        ArrayList<Prison> prisonDetails = system.getPrisons();
        DefaultTableModel tablemodel = (DefaultTableModel) tblPrisons.getModel();
        tablemodel.setRowCount(0);
        if (prisonDetails != null) {
            for (Prison prison : prisonDetails) {
                if (prison != null) {
                    Object[] row = new Object[6];
                    row[0] = prison;
                    row[1] = prison.getManagement().getAdmin().getName();
                    row[2] = prison.getManagement().getAdmin().getUserAccount().getUsername();
                    row[3] = prison.getManagement().getAdmin().getUserAccount().getPassword();
                    row[4] = String.valueOf(prison.getLocation());
                    row[5] = prison.getStatus() == true ? "In service" : "Out of service";
                    tablemodel.addRow(row);
                }
            }
        }
    }

    private void resetFields() {
        txtPrisonLocation.setText("");
        txtPrisonAdminUsername.setText("");
        txtPrisonAdminPassword.setText("");
        txtPrisonName.setText("");
        txtPrisonAdminName.setText("");
        drpdwnStatus.setSelectedIndex(0);
    }

    private boolean checkIfPrisonNameIsUnique() {
        if (checkInputFields(txtPrisonName)) {
            for (Prison prison : system.getPrisons()) {
                if (prison.getName().equals(txtPrisonName.getText())) {
                    return false;
                }
            }
        }
        return true;
    }
}
