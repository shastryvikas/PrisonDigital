/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.Prison;

import Model.CriminalJusticeSystem.Case;
import Model.Employee.Employee;
import Model.FoodCateringService.FoodCateringService;
import Model.Prison.CateringContract;
import Model.Prison.Prison;
import Model.PrisonEcosystem;
import Model.UserAccountManagement.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author udayindukuri
 */
public class DiningSupervisorJPanel extends javax.swing.JPanel {

    /**
     * Creates new form DiningSupervisorJPanel
     */
    JPanel container;
    CardLayout layout;
    PrisonEcosystem system;
    UserAccount user;
    Prison prison;
    
    public DiningSupervisorJPanel(JPanel container,UserAccount user, PrisonEcosystem system) {
        initComponents();
        this.container = container;
        layout = (CardLayout) container.getLayout();
        this.user = user;
        this.system = system;
        this.prison = (Prison) user.getEnterprise();
        
        txtPrisonerCount.setText((prison.getInfrastructure().getCellsEmpty().size() + prison.getInfrastructure().getCellsOccupied().size()) + "");
        populateTable();
    }
    
    private void populateTable() {

        DefaultTableModel tablemodel = (DefaultTableModel) CateringServicesJTable.getModel();
        tablemodel.setRowCount(0);
        
        for (FoodCateringService c : system.getCateringServices()) {
            Object[] row = new Object[2];
            row[0] = c;
            row[1] = c.getLocation().distanceTo(user.getEnterprise().getLocation());

            tablemodel.addRow(row);
        }
        
        CateringContract contract = prison.getManagement().getCateringContract();
        if(contract == null){
            endButton.setEnabled(false);
            btnPlaceRequest.setEnabled(true);
            status.setText("");
            prisonerCount.setText("");
            loc.setText("");
            name.setText("");
        } else {
            endButton.setEnabled(true);
            btnPlaceRequest.setEnabled(false);
            status.setText(contract.getStatus());
            prisonerCount.setText(contract.getPrisonerCount() + "");
            loc.setText(contract.getFoodCateringService().getLocation().toString());
            name.setText(contract.getFoodCateringService().getName());
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

        DiningSupervisorjLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        CateringServicesJTable = new javax.swing.JTable();
        lblPrisonerCount = new javax.swing.JLabel();
        txtPrisonerCount = new javax.swing.JTextField();
        btnPlaceRequest = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        loc = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        status = new javax.swing.JTextField();
        endButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        prisonerCount = new javax.swing.JTextField();

        DiningSupervisorjLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        DiningSupervisorjLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DiningSupervisorjLabel.setText("Dining Supervisor Work Area");
        DiningSupervisorjLabel.setOpaque(true);

        CateringServicesJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Name", "Location"
            }
        ));
        jScrollPane1.setViewportView(CateringServicesJTable);

        lblPrisonerCount.setText("Prisoner Count:");

        btnPlaceRequest.setText("Request Contract");
        btnPlaceRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlaceRequestActionPerformed(evt);
            }
        });

        jLabel1.setText("Current Contract:");

        jLabel2.setText("Caterer's name:");

        name.setText("jTextField1");

        jLabel3.setText("Caterer's Location:");

        loc.setText("jTextField2");

        jLabel4.setText("Status of contract:");

        status.setText("jTextField3");
        status.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statusActionPerformed(evt);
            }
        });

        endButton.setText("End Contract");
        endButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                endButtonActionPerformed(evt);
            }
        });

        jLabel5.setText("Prisoner Count:");

        prisonerCount.setText("jTextField4");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(643, 643, 643)
                                .addComponent(btnPlaceRequest))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblPrisonerCount)
                                .addGap(34, 34, 34)
                                .addComponent(txtPrisonerCount, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(DiningSupervisorjLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(status)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(loc, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(prisonerCount))
                                        .addGap(286, 286, 286)
                                        .addComponent(endButton))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(680, 680, 680))))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(DiningSupervisorjLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(loc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(status, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(endButton)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(prisonerCount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnPlaceRequest)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblPrisonerCount)
                        .addComponent(txtPrisonerCount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(171, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnPlaceRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlaceRequestActionPerformed
        // TODO add your handling code here:
        
        int prisonerCount = Integer.parseInt(txtPrisonerCount.getText().toString());
        
        if(prisonerCount > 0){
            int selectedRow = CateringServicesJTable.getSelectedRow();
            if (selectedRow >= 0) {
                int selectionButton = JOptionPane.YES_NO_OPTION;
                int selectionResult = JOptionPane.showConfirmDialog(null, "Confirm order?", "Warning", selectionButton);
                if (selectionResult == JOptionPane.YES_OPTION) {
                    FoodCateringService f = (FoodCateringService) CateringServicesJTable.getValueAt(selectedRow, 0);
                        
                    CateringContract contract = new CateringContract();
                    contract.setFoodCateringService(f);
                    contract.setPrison(prison);
                    contract.setPrisonerCount(prisonerCount);
                    contract.setStatus("Requested Approval");
                    
                    prison.getManagement().setCateringContract(contract);
                    f.getManagement().getFoodOrders().add(contract);

                    populateTable();
                }
            } else {
                JOptionPane.showMessageDialog(null, "Please select a row to delete the account");
            }
        }
        
    }//GEN-LAST:event_btnPlaceRequestActionPerformed

    private void statusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_statusActionPerformed

    private void endButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_endButtonActionPerformed
        // TODO add your handling code here:
        
        int selectionButton = JOptionPane.YES_NO_OPTION;
            int selectionResult = JOptionPane.showConfirmDialog(null, "Confirm Termination?", "Warning", selectionButton);
            if (selectionResult == JOptionPane.YES_OPTION) {
                CateringContract c = prison.getManagement().getCateringContract();
                prison.getManagement().setCateringContract(null);
                c.getFoodCateringService().getManagement().getFoodOrders().remove(c);
                populateTable();
            }
        
    }//GEN-LAST:event_endButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable CateringServicesJTable;
    private javax.swing.JLabel DiningSupervisorjLabel;
    private javax.swing.JButton btnPlaceRequest;
    private javax.swing.JButton endButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblPrisonerCount;
    private javax.swing.JTextField loc;
    private javax.swing.JTextField name;
    private javax.swing.JTextField prisonerCount;
    private javax.swing.JTextField status;
    private javax.swing.JTextField txtPrisonerCount;
    // End of variables declaration//GEN-END:variables
}
