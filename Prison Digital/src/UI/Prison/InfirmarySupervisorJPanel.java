/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.Prison;

import java.awt.CardLayout;

/**
 *
 * @author udayindukuri
 */
public class InfirmarySupervisorJPanel extends javax.swing.JPanel {

    /**
     * Creates new form InfirmarySupervisorJPanel
     */
    
    CardLayout cardLayoutPointer;
    
    public InfirmarySupervisorJPanel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblGenPhysicianReq = new javax.swing.JLabel();
        txtGeneralPhysicianReq = new javax.swing.JTextField();
        lblPsychologistReq = new javax.swing.JLabel();
        txtPsychologistReq = new javax.swing.JTextField();
        btnPlaceRequest = new javax.swing.JButton();
        DiningSupervisorjLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        PlacedOrderJTable = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        HospitalJTable = new javax.swing.JTable();
        lblTechnician = new javax.swing.JLabel();
        txtTechnician = new javax.swing.JTextField();
        btnLogout = new javax.swing.JButton();

        lblGenPhysicianReq.setText("General Physician Requirement:");

        lblPsychologistReq.setText("Psychologist Requirement:");

        btnPlaceRequest.setText("Place Request");

        DiningSupervisorjLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        DiningSupervisorjLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DiningSupervisorjLabel.setText("Infirmary Supervisor Work Area");
        DiningSupervisorjLabel.setOpaque(true);

        PlacedOrderJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Hospital Name", "Technicians", "Physicians", "Psychologists"
            }
        ));
        jScrollPane2.setViewportView(PlacedOrderJTable);

        HospitalJTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(HospitalJTable);

        lblTechnician.setText("Patient Care Technician Requirement");

        btnLogout.setText("Logout");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblGenPhysicianReq)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtGeneralPhysicianReq, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblTechnician)
                        .addGap(18, 18, 18)
                        .addComponent(txtTechnician, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(71, 71, 71)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblPsychologistReq)
                        .addGap(18, 18, 18)
                        .addComponent(txtPsychologistReq, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnPlaceRequest))
                .addGap(19, 19, 19))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnLogout))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1)
                        .addComponent(DiningSupervisorjLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 788, Short.MAX_VALUE))
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(282, 282, 282)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTechnician)
                    .addComponent(txtTechnician, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPsychologistReq)
                    .addComponent(txtPsychologistReq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGenPhysicianReq)
                    .addComponent(txtGeneralPhysicianReq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPlaceRequest))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(btnLogout))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(8, 8, 8)
                    .addComponent(DiningSupervisorjLabel)
                    .addGap(18, 18, 18)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(350, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DiningSupervisorjLabel;
    private javax.swing.JTable HospitalJTable;
    private javax.swing.JTable PlacedOrderJTable;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnPlaceRequest;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblGenPhysicianReq;
    private javax.swing.JLabel lblPsychologistReq;
    private javax.swing.JLabel lblTechnician;
    private javax.swing.JTextField txtGeneralPhysicianReq;
    private javax.swing.JTextField txtPsychologistReq;
    private javax.swing.JTextField txtTechnician;
    // End of variables declaration//GEN-END:variables
}