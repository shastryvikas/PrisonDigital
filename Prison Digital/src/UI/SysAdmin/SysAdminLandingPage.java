/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.SysAdmin;

import Model.PrisonEcosystem;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author Thejas
 */
public class SysAdminLandingPage extends javax.swing.JPanel {

    /**
     * Creates new form SysAdminLandingPage
     */
    JPanel container;
    PrisonEcosystem system;

    public SysAdminLandingPage(JPanel container, PrisonEcosystem system) {
        initComponents();
        this.container = container;
        this.system = system;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnManagePrisons = new javax.swing.JButton();
        btnManageAdmin = new javax.swing.JButton();
        btnManageHospitals = new javax.swing.JButton();
        btnManageJudicialSystems = new javax.swing.JButton();

        btnManagePrisons.setBackground(new java.awt.Color(244, 208, 129));
        btnManagePrisons.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnManagePrisons.setForeground(new java.awt.Color(0, 0, 0));
        btnManagePrisons.setText("Manage Prisons");
        btnManagePrisons.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManagePrisonsActionPerformed(evt);
            }
        });

        btnManageAdmin.setBackground(new java.awt.Color(244, 208, 129));
        btnManageAdmin.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnManageAdmin.setForeground(new java.awt.Color(0, 0, 0));
        btnManageAdmin.setText("Manage Caterers");
        btnManageAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageAdminActionPerformed(evt);
            }
        });

        btnManageHospitals.setBackground(new java.awt.Color(244, 208, 129));
        btnManageHospitals.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnManageHospitals.setForeground(new java.awt.Color(0, 0, 0));
        btnManageHospitals.setText("Manage Hospitals");
        btnManageHospitals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageHospitalsActionPerformed(evt);
            }
        });

        btnManageJudicialSystems.setBackground(new java.awt.Color(244, 208, 129));
        btnManageJudicialSystems.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnManageJudicialSystems.setForeground(new java.awt.Color(0, 0, 0));
        btnManageJudicialSystems.setText("Manage Judicial Systems");
        btnManageJudicialSystems.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageJudicialSystemsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(248, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnManageJudicialSystems, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnManageAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnManagePrisons, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnManageHospitals, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(240, 240, 240))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addComponent(btnManagePrisons, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(btnManageAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66)
                .addComponent(btnManageHospitals, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(btnManageJudicialSystems, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(120, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnManagePrisonsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManagePrisonsActionPerformed
        ManagePrisons managePrisons = new  ManagePrisons(this.container);
        container.add("Manage Prison", managePrisons);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.next(container);
    }//GEN-LAST:event_btnManagePrisonsActionPerformed

    private void btnManageAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageAdminActionPerformed
        ManageCaterers manageCaterers = new ManageCaterers(container);
        container.add("Manage Caterers", manageCaterers);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.next(container);
    }//GEN-LAST:event_btnManageAdminActionPerformed

    private void btnManageHospitalsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageHospitalsActionPerformed
        // TODO add your handling code here:
        ManageHospitals manageHospitals = new  ManageHospitals(container);
        container.add("Manage Hospitals", manageHospitals);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.next(container);
    }//GEN-LAST:event_btnManageHospitalsActionPerformed

    private void btnManageJudicialSystemsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageJudicialSystemsActionPerformed
        // TODO add your handling code here:
        ManageJudicialSystem manageJudicialSystem = new ManageJudicialSystem(container);
        container.add("Manage Judicial System", manageJudicialSystem);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.next(container);
    }//GEN-LAST:event_btnManageJudicialSystemsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnManageAdmin;
    private javax.swing.JButton btnManageHospitals;
    private javax.swing.JButton btnManageJudicialSystems;
    private javax.swing.JButton btnManagePrisons;
    // End of variables declaration//GEN-END:variables

}
