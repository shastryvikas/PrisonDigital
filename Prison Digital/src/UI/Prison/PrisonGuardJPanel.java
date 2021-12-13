/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.Prison;

import Model.DB4OUtil.DB4OUtil;
import Model.Prison.Attendance;
import Model.Prison.Prison;
import Model.PrisonEcosystem;
import Model.UserAccountManagement.UserAccount;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author udayindukuri
 */
public class PrisonGuardJPanel extends javax.swing.JPanel {

    /**
     * Creates new form PrisonGuardJPanel
     */
    CardLayout cardLayoutPointer;
    JPanel container;
    PrisonEcosystem system;
    UserAccount user;
    Prison prison;

    public PrisonGuardJPanel(JPanel container, UserAccount user, PrisonEcosystem system) {
        initComponents();
        this.container = container;
        cardLayoutPointer = (CardLayout) container.getLayout();
        this.system = system;
        this.user = user;
        this.prison = (Prison) user.getEnterprise();

    }

    private void populateTable() {

        DefaultTableModel tablemodel = (DefaultTableModel) jTable1.getModel();

        tablemodel.setRowCount(0);

        for (Attendance c : prison.getManagement().getAttendanceRecords()) {
            Object[] row = new Object[4];
            row[0] = c.getDate();
            row[1] = c.getPresent() + "";
            row[2] = (c.getTotal() - c.getPresent()) + "";
            row[3] = c.getTotal() + "";

            tablemodel.addRow(row);
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
        jTable1 = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        date = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        present = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        total = new javax.swing.JTextField();
        btnSubmitAttendance = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "Present", "Absent", "Total"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 1110, 320));

        jLabel7.setBackground(new java.awt.Color(71, 120, 197));
        jLabel7.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("   Prison Security Administrator");
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

        jLabel1.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jLabel1.setText("Date:");

        date.setFont(new java.awt.Font("Monospaced", 0, 13)); // NOI18N
        date.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jLabel2.setText("Present:");

        present.setFont(new java.awt.Font("Monospaced", 0, 13)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jLabel3.setText("Total:");

        total.setFont(new java.awt.Font("Monospaced", 0, 13)); // NOI18N

        btnSubmitAttendance.setFont(new java.awt.Font("Monospaced", 0, 13)); // NOI18N
        btnSubmitAttendance.setText("Submit Attendance");
        btnSubmitAttendance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitAttendanceActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnSubmitAttendance, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(total)
                            .addComponent(date)
                            .addComponent(present))))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(49, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel1))
                    .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel2))
                    .addComponent(present, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel3))
                    .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnSubmitAttendance, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
        );

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, 350, 260));

        jButton1.setFont(new java.awt.Font("Monospaced", 0, 13)); // NOI18N
        jButton1.setText("Analytics");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(877, 609, 190, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void btnSubmitAttendanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitAttendanceActionPerformed
        // TODO add your handling code here:
        
        if (checkInputFields(date) && checkInputFields(present) && checkInputFields(total)) {
          
            if(!checkInputFields(present, "[1-9][0-9]*") || !checkInputFields(total, "[1-9][0-9]*")){
                JOptionPane.showMessageDialog(this, "Please enter valid Attendance");
                return;
            }
           //date format: dd/mm/yyyy.
            if(!checkInputFields(date, "^(3[01]|[12][0-9]|0[1-9])/(1[0-2]|0[1-9])/[0-9]{4}$")){
                JOptionPane.showMessageDialog(this, "Please use valid date format: dd/mm/yyyy");
                return;
            }
            if(Integer.parseInt(present.getText()) > Integer.parseInt(total.getText())){
                JOptionPane.showMessageDialog(this, "Present value cannot be greater then Total");
                return;
            }

        Attendance a = new Attendance();
        a.setDate(date.getText());
        a.setPresent(Integer.parseInt(present.getText()));
        a.setTotal(Integer.parseInt(total.getText()));
        prison.getManagement().getAttendanceRecords().add(a);
        populateTable();
        resetFields();
        JOptionPane.showMessageDialog(this, "Attendance has been marked successfully");
        DB4OUtil.storeSystem(system);
		}
        else{
            JOptionPane.showMessageDialog(this, "Input fields cannot be empty");
        }
    }//GEN-LAST:event_btnSubmitAttendanceActionPerformed

    private void dateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dateActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        DefaultCategoryDataset dataset1 = new DefaultCategoryDataset();
        for (Attendance a : prison.getManagement().getAttendanceRecords()) {
            String[] date = a.getDate().split("/");
            dataset1.addValue((((float)a.getPresent() / (float)a.getTotal()) * 100), "Attendance Percentage", date[0]);
        }
        JFreeChart lineChart1 = ChartFactory.createBarChart("Attendance Percentage Vs Day of the month", "Date", "Attendance Percentage", dataset1, PlotOrientation.VERTICAL, true, true, false);
        CategoryPlot plot1 = lineChart1.getCategoryPlot();
        plot1.setRangeGridlinePaint(Color.BLACK);
        ChartFrame cf1 = new ChartFrame("std", lineChart1, true);
        cf1.setVisible(true);
        cf1.setSize(1000, 700);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void resetFields() {
        date.setText("");
        present.setText("");
        total.setText("");
    }
    public boolean checkInputFields(javax.swing.JTextField txtField, String regex) {
        return txtField.getText() != null && !txtField.getText().isEmpty() && txtField.getText().matches(regex);
    }

    public boolean checkInputFields(javax.swing.JTextField txtField) {
        return txtField.getText() != null && !txtField.getText().isEmpty();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSubmitAttendance;
    private javax.swing.JTextField date;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField present;
    private javax.swing.JTextField total;
    // End of variables declaration//GEN-END:variables
}
