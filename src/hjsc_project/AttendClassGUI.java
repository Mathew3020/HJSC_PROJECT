package hjsc_project;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class AttendClassGUI extends javax.swing.JFrame {
    DefaultTableModel table_model; 
    private SwimmingSchool swimmingSchool;
    private int role_id;
    private String booking_no;
    private String user_name;
    private String u_name;
    private String class_code;
    private String lesson;
    private String coach;
    private String date;
    private String grade;
    private String time;
    private String status=null;
    private String amount;
    public AttendClassGUI(SwimmingSchool swimmingSchool) {
        this.swimmingSchool = swimmingSchool;
       this.user_name=swimmingSchool.getUser_name();
       initComponents();
       table_model = (DefaultTableModel) booking_table.getModel();
       bookingDetails(); 
       attendButton.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        booking_table = new javax.swing.JTable();
        ratingPanel = new javax.swing.JPanel();
        nameLabel = new javax.swing.JLabel();
        bookingField = new javax.swing.JTextField();
        nameLabel1 = new javax.swing.JLabel();
        slotField = new javax.swing.JTextField();
        nameLabel2 = new javax.swing.JLabel();
        lessonField = new javax.swing.JTextField();
        nameLabel3 = new javax.swing.JLabel();
        ratingField = new javax.swing.JTextField();
        nameLabel4 = new javax.swing.JLabel();
        dateField = new javax.swing.JTextField();
        nameLabel5 = new javax.swing.JLabel();
        reviewField = new javax.swing.JTextField();
        attendButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1530, 830));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setMinimumSize(new java.awt.Dimension(100, 100));
        jPanel1.setName(""); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(1530, 830));
        jPanel1.setLayout(null);

        booking_table.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        booking_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "BOOKING NO", "CLASS CODE", "LESSON", "COACH", "GRADE", "DATE", "TIME", "BOOKING STATUS", "TOTAL AMOUNT"
            }
        ));
        booking_table.setToolTipText("");
        booking_table.setPreferredSize(new java.awt.Dimension(1530, 343));
        booking_table.setRowHeight(30);
        booking_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                booking_tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(booking_table);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(16, 94, 1518, 432);

        ratingPanel.setBackground(new java.awt.Color(255, 255, 255));

        nameLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        nameLabel.setText("Booking No  : ");

        bookingField.setEditable(false);
        bookingField.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        nameLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        nameLabel1.setText("Slot                :");

        slotField.setEditable(false);
        slotField.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        nameLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        nameLabel2.setText("Lesson         :");

        lessonField.setEditable(false);
        lessonField.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        nameLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        nameLabel3.setText("Ratings         :");

        ratingField.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        nameLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        nameLabel4.setText("Date              :");

        dateField.setEditable(false);
        dateField.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        nameLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        nameLabel5.setText("Review          :");

        reviewField.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        attendButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        attendButton.setText("Attend Class");
        attendButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                attendButtonActionPerformed(evt);
            }
        });

        backButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ratingPanelLayout = new javax.swing.GroupLayout(ratingPanel);
        ratingPanel.setLayout(ratingPanelLayout);
        ratingPanelLayout.setHorizontalGroup(
            ratingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ratingPanelLayout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addGroup(ratingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(ratingPanelLayout.createSequentialGroup()
                        .addComponent(nameLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(slotField, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ratingPanelLayout.createSequentialGroup()
                        .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bookingField, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(93, 93, 93)
                .addGroup(ratingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(ratingPanelLayout.createSequentialGroup()
                        .addComponent(nameLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ratingField, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ratingPanelLayout.createSequentialGroup()
                        .addComponent(nameLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lessonField, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(99, 99, 99)
                .addGroup(ratingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(ratingPanelLayout.createSequentialGroup()
                        .addComponent(nameLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(reviewField, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ratingPanelLayout.createSequentialGroup()
                        .addComponent(nameLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dateField, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ratingPanelLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 227, Short.MAX_VALUE)
                .addComponent(attendButton, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(368, 368, 368))
        );
        ratingPanelLayout.setVerticalGroup(
            ratingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ratingPanelLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(ratingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(ratingPanelLayout.createSequentialGroup()
                        .addGroup(ratingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nameLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dateField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(ratingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nameLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(reviewField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(ratingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(ratingPanelLayout.createSequentialGroup()
                            .addGroup(ratingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(nameLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lessonField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(ratingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(nameLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ratingField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(ratingPanelLayout.createSequentialGroup()
                            .addGroup(ratingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(bookingField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(ratingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(nameLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(slotField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(ratingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(attendButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29))
        );

        jPanel1.add(ratingPanel);
        ratingPanel.setBounds(14, 530, 1520, 245);

        jLabel11.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel11.setText("Attend Class");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(487, 26, 180, 50);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1550, 830);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void booking_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_booking_tableMouseClicked
        //get selected row 
        int row = booking_table.getSelectedRow();
        //get selected booking number
        booking_no = (String) booking_table.getModel().getValueAt(row, 0);
        // set booking number
        swimmingSchool.setBooking_no(booking_no);
        //get selected class code lesson date time 
        class_code=(String) booking_table.getModel().getValueAt(row, 1);
        lesson = (String) booking_table.getModel().getValueAt(row, 2);
        date = (String) booking_table.getModel().getValueAt(row, 5);
        time = (String) booking_table.getModel().getValueAt(row, 6);
        grade=(String) booking_table.getModel().getValueAt(row, 7);
        bookingField.setText(booking_no);
        lessonField.setText(lesson);
        dateField.setText(date);
        slotField.setText(time);
        attendButton.setVisible(true);

    }//GEN-LAST:event_booking_tableMouseClicked

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        //redirect to dasboard
        this.setVisible(false);
      new DashboardGUI(swimmingSchool).setVisible(true);
    }//GEN-LAST:event_backButtonActionPerformed

    private void attendButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_attendButtonActionPerformed
        // TODO add your handling code here:
       attenClass();
    }//GEN-LAST:event_attendButtonActionPerformed

    
    //show booking details
    public void bookingDetails()
    {
        List<List<String>> bookings = swimmingSchool.getBookings();
        //read bookings by for loop
        for (List<String> booking : bookings) {
            // get booking details from the list
            if (booking.get(8).equalsIgnoreCase("Booked")||booking.get(8).equalsIgnoreCase("Change")) {
                if (booking.get(1).equalsIgnoreCase(user_name)) {
                    booking_no = booking.get(0);
                    class_code = booking.get(2);
                    u_name = "";
                    lesson = booking.get(3);
                    date = booking.get(4);
                    time = booking.get(5);
                    grade = booking.get(6);
                    coach = booking.get(7);
                    status = booking.get(8);
                    amount = booking.get(9);
                    // Add booking details to the table model
                    String[] bookingData = {"BOOKING_" + user_name.toUpperCase().substring(0, 3) + "_0" + booking_no, "CLASS_HJSC_0" + class_code, lesson, coach, grade,date, time, status, amount};
                    table_model.addRow(bookingData);
                    //hide learner columns
                    booking_table.getColumnModel().getColumn(4).setMinWidth(0);
                    booking_table.getColumnModel().getColumn(4).setMaxWidth(1);
                }
            }
        }
    }
    
    
    //attend class
    public void attenClass() {
        //change class code into integer
        int lesson1 = Integer.parseInt(class_code.substring(12));
        //get rating and review by learner
        String rating = ratingField.getText();
        String review = reviewField.getText();

        if (rating.isBlank() || review.isBlank()) {
            JOptionPane.showMessageDialog(this, "All fields are required", "Alert", JOptionPane.WARNING_MESSAGE);
        } else {
            if (rating.matches("[1-5]")) {
                swimmingSchool.attendClass(lesson1, rating, review);
                JOptionPane.showMessageDialog(this, "Class attended successfully", "Alert", JOptionPane.INFORMATION_MESSAGE);
                swimmingSchool.updateStudenLevel(grade);
                bookingDetails();
                this.setVisible(false);
                new DashboardGUI(swimmingSchool).setVisible(true);
            } else {
                JOptionPane.showMessageDialog(this, "Plese give valid rating 1 to 5", "Alert", JOptionPane.WARNING_MESSAGE);
            }

        }

    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton attendButton;
    private javax.swing.JButton backButton;
    private javax.swing.JTextField bookingField;
    private javax.swing.JTable booking_table;
    private javax.swing.JTextField dateField;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField lessonField;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JLabel nameLabel1;
    private javax.swing.JLabel nameLabel2;
    private javax.swing.JLabel nameLabel3;
    private javax.swing.JLabel nameLabel4;
    private javax.swing.JLabel nameLabel5;
    private javax.swing.JTextField ratingField;
    private javax.swing.JPanel ratingPanel;
    private javax.swing.JTextField reviewField;
    private javax.swing.JTextField slotField;
    // End of variables declaration//GEN-END:variables
}
