package hjsc_project;

import java.util.List;
import java.util.Map;
import javax.swing.table.DefaultTableModel;

public class ReportGUI extends javax.swing.JFrame {

    private SwimmingSchool swimmingSchool;
    DefaultTableModel table_model;
    private String user_name;

    public ReportGUI(SwimmingSchool swimmingSchool) {
        this.swimmingSchool = swimmingSchool;
        this.user_name = swimmingSchool.getUser_name();
        initComponents();
        coachReport();
        learnerReport();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        coachReportTable = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        learnerTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1530, 830));
        getContentPane().setLayout(null);

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setPreferredSize(new java.awt.Dimension(1530, 830));
        jPanel3.setLayout(null);

        coachReportTable.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        coachReportTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Coach", "Class Code", "Average Ratings"
            }
        ));
        coachReportTable.setRowHeight(30);
        jScrollPane1.setViewportView(coachReportTable);

        jPanel3.add(jScrollPane1);
        jScrollPane1.setBounds(60, 120, 629, 650);

        learnerTable.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        learnerTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Learner", "Total Booking", "Total Cancel", "Total Attend"
            }
        ));
        learnerTable.setRowHeight(30);
        jScrollPane3.setViewportView(learnerTable);

        jPanel3.add(jScrollPane3);
        jScrollPane3.setBounds(710, 120, 800, 660);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Learner Booking Details");
        jPanel3.add(jLabel1);
        jLabel1.setBounds(950, 90, 230, 22);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Coach Ratings");
        jPanel3.add(jLabel3);
        jLabel3.setBounds(310, 90, 157, 22);

        backButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        jPanel3.add(backButton);
        backButton.setBounds(50, 30, 216, 40);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(0, 0, 1530, 830);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        this.setVisible(false);
        new DashboardGUI(swimmingSchool).setVisible(true);
    }//GEN-LAST:event_backButtonActionPerformed

    //show coach details
    public void coachReport() {
        table_model = (DefaultTableModel) coachReportTable.getModel();
        // table clear
        table_model.setRowCount(0);
        //coach average rating details
        Map<String, Map<String, Double>> averageRatings = swimmingSchool.coachAverageRatings();
        // Display average ratings
        averageRatings.forEach((class_code, coachRatings) -> {
            coachRatings.forEach((coach, averageRating) -> {
                // Add coach details
                table_model.addRow(new Object[]{coach, "CLASS_HJSC_0" + class_code, averageRating});
            });
        });
    }

    //get learner booking status
    public void learnerReport() {
        table_model = (DefaultTableModel) learnerTable.getModel();
        Map<String, Map<String, Long>> userStats = swimmingSchool.learnerBookings();
        //get booking status by for each loop
        userStats.forEach((u_name, statusCounts) -> {
            long booked = statusCounts.getOrDefault("Booked", 0L);
            long attend = statusCounts.getOrDefault("Attend", 0L);
            long changed = statusCounts.getOrDefault("Cancel", 0L);
            long cancel = statusCounts.getOrDefault("Cancel", 0L);
            long total_book = booked + changed + attend;
            Object[] rowData = {u_name, total_book, cancel, attend};
            table_model.addRow(rowData);
        });
        learnerTable.setModel(table_model);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JTable coachReportTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable learnerTable;
    // End of variables declaration//GEN-END:variables
}
