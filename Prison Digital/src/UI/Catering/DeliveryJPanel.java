/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.Catering;

import Model.FoodCateringService.FoodCateringService;
import Model.Prison.CateringContract;
import Model.PrisonEcosystem;
import Model.UserAccountManagement.UserAccount;
import java.awt.CardLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author udayindukuri
 */
public class DeliveryJPanel extends javax.swing.JPanel {

    /**
     * Creates new form DeliveryJPanel
     */
    
    JPanel container;
    CardLayout layout;
    PrisonEcosystem system;
    FoodCateringService cateringService;
    UserAccount user;
    
    public DeliveryJPanel(JPanel container,UserAccount user, PrisonEcosystem system) {
        initComponents();
        this.container = container;
        layout = (CardLayout) container.getLayout();
        this.system = system;
        cateringService = (FoodCateringService) user.getEnterprise();
        this.user = user;
        
        populateTable();
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
    
    private void updateDetails(CateringContract contract){
        if(contract.getDeliveryManApproval()){
            jButton1.setEnabled(false);
        } else {
            jButton1.setEnabled(true);
        }
    }
    
    private void populateTable(){
        
        DefaultTableModel tablemodel = (DefaultTableModel) PrisonStaffJTable1.getModel();
        tablemodel.setRowCount(0);
        for (CateringContract c : cateringService.getManagement().getFoodOrders()) {
                if (c != null & c.getDeliveryMan().getUserAccount().getUsername().equals(user.getUsername())) {
                    Object[] row = new Object[5];
                    row[0] = c;
                    row[1] = c.getPrisonerCount() + "";
                    row[2] = c.getDeliveryMan().getName();
                    row[3] = c.getDeliveryManApproval().toString();
                    row[4] = c.getStatus();
                    
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
        jScrollPane2 = new javax.swing.JScrollPane();
        PrisonStaffJTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Delivery Work Area");
        jLabel1.setOpaque(true);

        PrisonStaffJTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Prison", "Prisoner Count", "Chef", "Chef Approval", "Order Status"
            }
        ));
        jScrollPane2.setViewportView(PrisonStaffJTable1);

        jButton1.setText("Approve");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 788, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 788, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 121, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(jButton1)
                .addGap(187, 187, 187))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        CateringContract a = (CateringContract) PrisonStaffJTable1.getModel().getValueAt(PrisonStaffJTable1.getSelectedRow(), 0);
        a.setDeliveryManApproval(Boolean.TRUE);
        jButton1.setEnabled(false);
        populateTable();
        
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable PrisonStaffJTable1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
