/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.Prison;

import Model.PrisonEcosystem;
import Model.UserAccountManagement.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author udayindukuri
 */
public class PrisonAdminLandingPage extends javax.swing.JPanel {

    CardLayout cardLayoutPointer;
    JPanel container;
    PrisonEcosystem system;
    UserAccount user;
    
    /**
     * Creates new form PrisonAdminJPanel
     */
    public PrisonAdminLandingPage(JPanel container,UserAccount user, PrisonEcosystem system) {
        initComponents();
        //this.container = container;
        //cardLayoutPointer = (CardLayout) container.getLayout();
        this.system = system;
        this.user = user;
        
        PrisonAdminStaffManagementPage prisonAdminStaffManagementPage = new PrisonAdminStaffManagementPage(container2, user, system);
        container2.add("PrisonAdminStaffManagementPage", prisonAdminStaffManagementPage);
        CardLayout layout = (CardLayout) container2.getLayout();
        layout.next(container2);
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
        jPanel1 = new javax.swing.JPanel();
        btnPrison = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnPrison1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        btnPrison2 = new javax.swing.JPanel();
        container2 = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(71, 120, 197));
        jLabel1.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("   Prison Administrator");
        jLabel1.setMaximumSize(new java.awt.Dimension(231, 25));
        jLabel1.setMinimumSize(new java.awt.Dimension(231, 25));
        jLabel1.setOpaque(true);
        jLabel1.setPreferredSize(new java.awt.Dimension(231, 25));
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 1090, 60));

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

        btnPrison.setBackground(new java.awt.Color(120, 168, 255));
        btnPrison.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPrisonMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Monospaced", 0, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("<Html>Manage<br>Staff");

        javax.swing.GroupLayout btnPrisonLayout = new javax.swing.GroupLayout(btnPrison);
        btnPrison.setLayout(btnPrisonLayout);
        btnPrisonLayout.setHorizontalGroup(
            btnPrisonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnPrisonLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );
        btnPrisonLayout.setVerticalGroup(
            btnPrisonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnPrisonLayout.createSequentialGroup()
                .addContainerGap(46, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );

        add(btnPrison, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 150, 120));

        btnPrison1.setBackground(new java.awt.Color(84, 127, 206));
        btnPrison1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPrison1MouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Monospaced", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("<Html>Work<br>Requests");

        javax.swing.GroupLayout btnPrison1Layout = new javax.swing.GroupLayout(btnPrison1);
        btnPrison1.setLayout(btnPrison1Layout);
        btnPrison1Layout.setHorizontalGroup(
            btnPrison1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnPrison1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );
        btnPrison1Layout.setVerticalGroup(
            btnPrison1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnPrison1Layout.createSequentialGroup()
                .addContainerGap(52, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );

        add(btnPrison1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 150, 140));

        btnPrison2.setBackground(new java.awt.Color(71, 120, 197));
        btnPrison2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPrison2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btnPrison2Layout = new javax.swing.GroupLayout(btnPrison2);
        btnPrison2.setLayout(btnPrison2Layout);
        btnPrison2Layout.setHorizontalGroup(
            btnPrison2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );
        btnPrison2Layout.setVerticalGroup(
            btnPrison2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 380, Short.MAX_VALUE)
        );

        add(btnPrison2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, -1, 380));

        container2.setBackground(new java.awt.Color(255, 255, 255));
        container2.setMaximumSize(new java.awt.Dimension(1000, 675));
        container2.setMinimumSize(new java.awt.Dimension(1000, 675));
        container2.setPreferredSize(new java.awt.Dimension(1000, 675));
        container2.setLayout(new java.awt.CardLayout());
        add(container2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, 1000, 640));
    }// </editor-fold>//GEN-END:initComponents

    private void btnPrisonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPrisonMouseClicked
        // TODO add your handling code here:

        PrisonAdminStaffManagementPage prisonAdminStaffManagementPage = new PrisonAdminStaffManagementPage(container2, user, system);
        container2.add("PrisonAdminStaffManagementPage", prisonAdminStaffManagementPage);
        CardLayout layout = (CardLayout) container2.getLayout();
        layout.next(container2);

    }//GEN-LAST:event_btnPrisonMouseClicked

    private void btnPrison1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPrison1MouseClicked
        // TODO add your handling code here:
        
        PrisonAdminWorkManagementPage prisonAdminWorkManagementPage = new PrisonAdminWorkManagementPage(container2, user, system);
        container2.add("PrisonAdminWorkManagementPage", prisonAdminWorkManagementPage);
        CardLayout layout = (CardLayout) container2.getLayout();
        layout.next(container2);
        
    }//GEN-LAST:event_btnPrison1MouseClicked

    private void btnPrison2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPrison2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPrison2MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnPrison;
    private javax.swing.JPanel btnPrison1;
    private javax.swing.JPanel btnPrison2;
    private javax.swing.JPanel container2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
