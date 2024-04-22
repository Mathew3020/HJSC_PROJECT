package hjsc_project;

import java.util.List;
import javax.swing.table.DefaultTableModel;


public class RatingGUI extends javax.swing.JFrame {
    private SwimmingSchool swimmingSchool;
    DefaultTableModel table_model;
    public RatingGUI(SwimmingSchool swimmingSchool) {
        this.swimmingSchool=swimmingSchool;
        initComponents();
        table_model = (DefaultTableModel) ratingTable.getModel();
        ratingReport();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        ratingTable = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1530, 830));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setPreferredSize(new java.awt.Dimension(1530, 830));
        jPanel1.setLayout(null);

        ratingTable.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        ratingTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Rating No", "Class Code", "User Name", "Coach", "Date", "Time", "Rating", "Review"
            }
        ));
        ratingTable.setRowHeight(30);
        jScrollPane2.setViewportView(ratingTable);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(50, 180, 1439, 500);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Rating Details");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(710, 140, 157, 22);

        backButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        jPanel1.add(backButton);
        backButton.setBounds(50, 30, 216, 40);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1530, 830);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        this.setVisible(false);
        new DashboardGUI(swimmingSchool).setVisible(true);
    }//GEN-LAST:event_backButtonActionPerformed

    //show ratings details
    public void ratingReport() {
        table_model = (DefaultTableModel) ratingTable.getModel();
        // table clear
        table_model.setRowCount(0);
        List<List<String>> ratings = swimmingSchool.getRatings();
        //get rating details by for loop
        for (List<String> rating : ratings) {
            String rating_no = rating.get(0);
            String class_code = rating.get(1);
            String user = rating.get(2);
            String coach = rating.get(3);
            String date = rating.get(4);
            String time = rating.get(5);
            String rating1 = rating.get(6);
            String review = rating.get(7);
            //store details in table
            String[] rating_report = {"RATING_CHJC_0" + rating_no, "CLASS_HJSC_0" + class_code, user, coach, date, time, rating1, review};
            table_model.addRow(rating_report);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable ratingTable;
    // End of variables declaration//GEN-END:variables
}
