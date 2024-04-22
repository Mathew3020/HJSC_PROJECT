package hjsc_project;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class DashboardGUI extends javax.swing.JFrame {
    private SwimmingSchool swimmingSchool;
    private int role_id;
    private String booking_no;
    private String user_name;
    private String u_name;
    private String class_code;
    private String lesson;
    private String coach;
    private String date;
    private String day;
    private String grade;
    private String time;
    private int capacity;
    private String status = null;
    private String amount;
    private int total_book = 0;
    private int total_cancel = 0;
    private int total_attend = 0;
    DefaultTableModel table_model;

    public DashboardGUI(SwimmingSchool swimmingSchool) {
        this.swimmingSchool = swimmingSchool;
        this.user_name = swimmingSchool.getUser_name();
        initComponents();
        table_model = (DefaultTableModel) booking_table.getModel();
        //validation of user_name and admin
        if (!swimmingSchool.getUser_name().isBlank()) {
            //show text if user open dashboard
            roleLabel.setText("User");
            //get role_id 
            role_id = swimmingSchool.getRoleIdByName("Learner");
            //set booking_table enabled
            booking_table.setEnabled(true);
        } else {
            //show admin if admin open dashboard
            role_id = swimmingSchool.getRoleIdByName("Admin");
            //set booking_table enabled
            booking_table.setEnabled(true);
            bookLessonButton.setVisible(false);
            attendButton.setVisible(false);
            profileButton.setVisible(false);
        }
        hideButton();
        swimmingSchool.bookingLesson(0);
        bookingDetails();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        booking_table = new javax.swing.JTable();
        cancelButton = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        bookLabel = new javax.swing.JLabel();
        changeButton = new javax.swing.JButton();
        bookLessonButton = new javax.swing.JButton();
        logoutButton = new javax.swing.JButton();
        reportButton = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        cancelLabel = new javax.swing.JLabel();
        attenLabel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        attendLabel = new javax.swing.JLabel();
        roleLabel = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        attendButton = new javax.swing.JButton();
        profileButton = new javax.swing.JButton();
        ratingButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1530, 830));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setPreferredSize(new java.awt.Dimension(1530, 830));
        jPanel1.setVerifyInputWhenFocusTarget(false);
        jPanel1.setLayout(null);

        booking_table.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        booking_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "BOOKING NO", "CLASS CODE", "LESSON", "COACH", "LEARNER", "GRADE", "DATE", "TIME", "BOOKING STATUS", "TOTAL AMOUNT"
            }
        ));
        booking_table.setToolTipText("");
        booking_table.setRowHeight(30);
        booking_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                booking_tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(booking_table);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(410, 210, 970, 370);

        cancelButton.setBackground(new java.awt.Color(255, 51, 0));
        cancelButton.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        cancelButton.setForeground(new java.awt.Color(255, 255, 255));
        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });
        jPanel1.add(cancelButton);
        cancelButton.setBounds(1020, 600, 280, 45);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 5, true));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Total Booking");

        bookLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        bookLabel.setForeground(new java.awt.Color(102, 102, 102));
        bookLabel.setText("0");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(bookLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2))
                .addGap(30, 30, 30))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bookLabel)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel4);
        jPanel4.setBounds(450, 70, 170, 101);

        changeButton.setBackground(new java.awt.Color(0, 102, 255));
        changeButton.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        changeButton.setForeground(new java.awt.Color(255, 255, 255));
        changeButton.setText("Change");
        changeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeButtonActionPerformed(evt);
            }
        });
        jPanel1.add(changeButton);
        changeButton.setBounds(480, 610, 410, 40);

        bookLessonButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        bookLessonButton.setText("Book Lesson");
        bookLessonButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookLessonButtonActionPerformed(evt);
            }
        });
        jPanel1.add(bookLessonButton);
        bookLessonButton.setBounds(50, 370, 270, 40);

        logoutButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        logoutButton.setText("Logout");
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });
        jPanel1.add(logoutButton);
        logoutButton.setBounds(50, 710, 270, 40);

        reportButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        reportButton.setText("Report");
        reportButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reportButtonActionPerformed(evt);
            }
        });
        jPanel1.add(reportButton);
        reportButton.setBounds(50, 640, 270, 40);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 5, true));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Total Cancel");

        cancelLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        cancelLabel.setForeground(new java.awt.Color(102, 102, 102));
        cancelLabel.setText("0");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(cancelLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(33, 33, 33))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cancelLabel)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel5);
        jPanel5.setBounds(780, 70, 170, 101);

        attenLabel.setBackground(new java.awt.Color(255, 255, 255));
        attenLabel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 5, true));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Total Attend");

        attendLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        attendLabel.setForeground(new java.awt.Color(102, 102, 102));
        attendLabel.setText("0");

        javax.swing.GroupLayout attenLabelLayout = new javax.swing.GroupLayout(attenLabel);
        attenLabel.setLayout(attenLabelLayout);
        attenLabelLayout.setHorizontalGroup(
            attenLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(attenLabelLayout.createSequentialGroup()
                .addGroup(attenLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(attenLabelLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel3))
                    .addGroup(attenLabelLayout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(attendLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        attenLabelLayout.setVerticalGroup(
            attenLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(attenLabelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(attendLabel)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        jPanel1.add(attenLabel);
        attenLabel.setBounds(1200, 70, 168, 101);

        roleLabel.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        roleLabel.setText("Admin");
        jPanel1.add(roleLabel);
        roleLabel.setBounds(160, 260, 80, 50);

        jLabel11.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel11.setText("Dashboard");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(130, 70, 180, 50);

        attendButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        attendButton.setText("Attend Class");
        attendButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                attendButtonActionPerformed(evt);
            }
        });
        jPanel1.add(attendButton);
        attendButton.setBounds(50, 570, 270, 40);

        profileButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        profileButton.setText("Profile");
        profileButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                profileButtonActionPerformed(evt);
            }
        });
        jPanel1.add(profileButton);
        profileButton.setBounds(50, 440, 270, 40);

        ratingButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        ratingButton.setText("Rating Details");
        ratingButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ratingButtonActionPerformed(evt);
            }
        });
        jPanel1.add(ratingButton);
        ratingButton.setBounds(50, 510, 270, 40);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1570, 830);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void changeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeButtonActionPerformed
        changeBooking();
    }//GEN-LAST:event_changeButtonActionPerformed

    private void bookLessonButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookLessonButtonActionPerformed
        //redirect to LessonDetailGUI page
        swimmingSchool.SetAction("Book");
        this.setVisible(false);
        new LessonDetailGUI(swimmingSchool).setVisible(true);
    }//GEN-LAST:event_bookLessonButtonActionPerformed

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        //set role id
        swimmingSchool.setRole_id(role_id);
        //redirect to login page after logout
        this.setVisible(false);
        new LoginGUI(swimmingSchool).setVisible(true);
    }//GEN-LAST:event_logoutButtonActionPerformed

    private void reportButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reportButtonActionPerformed
        this.setVisible(false);
        new ReportGUI(swimmingSchool).setVisible(true);
    }//GEN-LAST:event_reportButtonActionPerformed

    private void booking_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_booking_tableMouseClicked
        //select booking lesson for attend change or cancel
        int row = booking_table.getSelectedRow();
        status = (String) booking_table.getModel().getValueAt(row, 7);
        if (!user_name.isBlank()) {
            //show change and cancel button if bookings not cancel or attend
            if (!(status.equalsIgnoreCase("Cancel") || status.equalsIgnoreCase("Attend"))) {
                showButton();
            } else {
                //hide button if bookings is cancel or attended
                hideButton();
            }
        } else {
            //hide button if admin open dashboard
            hideButton();
        }


    }//GEN-LAST:event_booking_tableMouseClicked

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        cancelBooking();
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void attendButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_attendButtonActionPerformed
        //redirect to attend class
        this.setVisible(false);
        new AttendClassGUI(swimmingSchool).setVisible(true);
    }//GEN-LAST:event_attendButtonActionPerformed

    private void profileButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profileButtonActionPerformed
         this.setVisible(false);
        new ProfileGUI(swimmingSchool).setVisible(true);
    }//GEN-LAST:event_profileButtonActionPerformed

    private void ratingButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ratingButtonActionPerformed
        this.setVisible(false);
        new RatingGUI(swimmingSchool).setVisible(true);
    }//GEN-LAST:event_ratingButtonActionPerformed

    //hide change cancel attend button
    public void hideButton() {
        changeButton.setVisible(false);
        cancelButton.setVisible(false);
    }

    //show change cancel attend button
    public void showButton() {
        changeButton.setVisible(true);
        cancelButton.setVisible(true);
    }

    //show booking details in table
    public void bookingDetails() {
        // start from first row
        table_model.setRowCount(0);
        //get booking details
        List<List<String>> bookings = swimmingSchool.getBookings();
        //read bookings by for loop
        for (List<String> booking : bookings) {
            // get booking details from the list
            if (!user_name.isBlank()) {
                if (booking.get(1).equalsIgnoreCase(user_name)) {
                    booking_no = booking.get(0);
                    class_code = booking.get(2);
                    u_name = booking.get(1);
                    lesson = booking.get(3);
                    date = booking.get(4);
                    time = booking.get(5);
                    grade = booking.get(6);
                    coach = booking.get(7);
                    status = booking.get(8);
                    amount = booking.get(9);
                    // Add booking details to the table model
                    String[] bookingData = {"BOOKING_" + u_name.toUpperCase().substring(0, 3) + "_0" + booking_no, "CLASS_HJSC_0" + class_code, lesson, coach, u_name, grade,date, time, status, amount};
                    table_model.addRow(bookingData);
                    //hide learner columns
                    booking_table.getColumnModel().getColumn(4).setMinWidth(0);
                    booking_table.getColumnModel().getColumn(4).setMaxWidth(1);
                    //get total booking
                    if (status.equalsIgnoreCase("Booked") || status.equalsIgnoreCase("Change")) {
                        total_book++;
                    }
                    //get total cancel
                    if (status.equalsIgnoreCase("Cancel")) {
                        total_cancel++;
                    }
                    //get total attend
                    if (status.equalsIgnoreCase("Attend")) {
                        total_attend++;
                    }
                }
            } else {
                booking_no = booking.get(0);
                u_name = booking.get(1);
                class_code = booking.get(2);
                lesson = booking.get(3);
                date = booking.get(4);
                time = booking.get(5);
                grade = booking.get(6);
                coach = booking.get(7);
                status = booking.get(8);
                amount = booking.get(9);
                // Add booking details to the table model
                 String[] bookingData = {"BOOKING_" + u_name.toUpperCase().substring(0, 3) + "_0" + booking_no, "CLASS_HJSC_0" + class_code, lesson, coach, u_name, grade,date, time, status, amount};
                table_model.addRow(bookingData);
                //get total booking
                if (status.equalsIgnoreCase("Booked") || status.equalsIgnoreCase("Change")) {
                    total_book++;
                }
                //get total cancel
                if (status.equalsIgnoreCase("Cancel")) {
                    total_cancel++;
                }
                //get total attend
                if (status.equalsIgnoreCase("Attend")) {
                    total_attend++;
                }
            }
        }
        //show total booking cancel attend and ratings
        bookLabel.setText(String.valueOf(total_book));
        cancelLabel.setText(String.valueOf(total_cancel));
        attendLabel.setText(String.valueOf(total_attend));

    }

    //cancel booking
    public void cancelBooking() {
        //get selected row
        int row = booking_table.getSelectedRow();
        //get booking no and lesson
        booking_no = (String) booking_table.getModel().getValueAt(row, 0);
        String lesson = booking_table.getModel().getValueAt(row, 1).toString().substring(12);
        //set booking no
        swimmingSchool.setBooking_no(booking_no);
        //call cancel booking function
        swimmingSchool.cancelBookings();
        //update seat after cancel booking
        swimmingSchool.seatUpdate("Cancel", Integer.parseInt(lesson));
         JOptionPane.showMessageDialog(this, "Booking Cancel", "Alert", JOptionPane.WARNING_MESSAGE);
        //refresh booking table
        bookingDetails();
        //hide button
        hideButton();
    }

    //change bookings
    public void changeBooking() {
        //get selected row
        int row = booking_table.getSelectedRow();
        //get booking no and lesson
        booking_no = (String) booking_table.getModel().getValueAt(row, 0);
        int lesson = Integer.parseInt(booking_table.getModel().getValueAt(row, 0).toString().substring(12));
        //store previous class name before change booking
        swimmingSchool.setPrevious_class(lesson);
        //set booking number
        swimmingSchool.setBooking_no(booking_no);
        //store change action 
        swimmingSchool.SetAction("Change");
        //redirect to lesson details class
        this.setVisible(false);
        new LessonDetailGUI(swimmingSchool).setVisible(true);
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel attenLabel;
    private javax.swing.JButton attendButton;
    private javax.swing.JLabel attendLabel;
    private javax.swing.JLabel bookLabel;
    private javax.swing.JButton bookLessonButton;
    private javax.swing.JTable booking_table;
    private javax.swing.JButton cancelButton;
    private javax.swing.JLabel cancelLabel;
    private javax.swing.JButton changeButton;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton logoutButton;
    private javax.swing.JButton profileButton;
    private javax.swing.JButton ratingButton;
    private javax.swing.JButton reportButton;
    private javax.swing.JLabel roleLabel;
    // End of variables declaration//GEN-END:variables

}
