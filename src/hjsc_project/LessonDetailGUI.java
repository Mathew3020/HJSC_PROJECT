package hjsc_project;

import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class LessonDetailGUI extends javax.swing.JFrame {
    private SwimmingSchool swimmingSchool;
    DefaultTableModel table_model; 
    DefaultComboBoxModel<String> coachModel;
    private int class_code;
    private String action;
    private String lessonName;
    private String date;
    private String day;
    private String time;
    private String grade;
    private String coach;
    private String no_of_seat;
    private String amount;
    
    public LessonDetailGUI(SwimmingSchool swimmingSchool) {
        initComponents();
        this.swimmingSchool=swimmingSchool;
        table_model = (DefaultTableModel) lessonTable.getModel();
        this.coachModel = new DefaultComboBoxModel<>();
        this.action=swimmingSchool.getAction();
        bookLessonButton.setVisible(false);
        //change button text according to action
        if(action.equalsIgnoreCase("Book"))
        {
            bookLessonButton.setText("Book Lesson");
             bookLessonButton.setVisible(true);
        }else
        {
            this.action="Change";
            bookLessonButton.setText("Change Lesson");
             bookLessonButton.setVisible(true);
        }
        //store coach details in select button
        selectCoach();
        //show lesson details
        lessonDetails();
        
    }
    
    
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        backButton = new javax.swing.JButton();
        bookLessonButton = new javax.swing.JButton();
        select_day = new javax.swing.JComboBox<>();
        select_coach = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lessonTable = new javax.swing.JTable();
        select_grade = new javax.swing.JSpinner();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1530, 830));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setPreferredSize(new java.awt.Dimension(1530, 830));

        backButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        bookLessonButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        bookLessonButton.setText("Book Lesson");
        bookLessonButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookLessonButtonActionPerformed(evt);
            }
        });

        select_day.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        select_day.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Day", "Monday", "Wednesday", "Friday", "Saturday" }));
        select_day.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                select_dayActionPerformed(evt);
            }
        });

        select_coach.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        select_coach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                select_coachActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Show lesson by grade");

        lessonTable.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lessonTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CLASS CODE", "LESSON", "DAY", "DATE", "TIME", "COACH", "GRADE", "NO OF SEAT", "AMOUNT"
            }
        ));
        lessonTable.setRowHeight(30);
        lessonTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lessonTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(lessonTable);

        select_grade.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        select_grade.setModel(new javax.swing.SpinnerNumberModel(0, 0, 5, 1));
        select_grade.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                select_gradeStateChanged(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Show lesson by day ");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Show lesson by coach");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setText("Lesson Details");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(157, 157, 157)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(select_day, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(108, 108, 108)
                        .addComponent(select_coach, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(124, 124, 124)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(select_grade, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(153, 153, 153))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(53, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1419, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bookLessonButton, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(248, 248, 248))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(select_coach, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(select_grade, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(56, 56, 56)
                            .addComponent(select_day, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bookLessonButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(171, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1540, 830);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        //redirect to dashboard table
        this.setVisible(false);
        new DashboardGUI(swimmingSchool).setVisible(true);
       
    }//GEN-LAST:event_backButtonActionPerformed

    private void bookLessonButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookLessonButtonActionPerformed
        //call function accordint to action
        if (action.equalsIgnoreCase("Book")) {
            bookLesson();
        } else {
            changeLesson();
        }
    }//GEN-LAST:event_bookLessonButtonActionPerformed

    private void lessonTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lessonTableMouseClicked
         bookLessonButton.setVisible(false);
        int row = lessonTable.getSelectedRow();
        String lesson = lessonTable.getModel().getValueAt(row, 0).toString().substring(12);
        boolean isClassBook = swimmingSchool.classBookingStatus(lesson);
        no_of_seat = (String) lessonTable.getModel().getValueAt(row, 7);
        int capacity = Integer.parseInt(no_of_seat);
        int lesson_grade =Integer.parseInt(lessonTable.getModel().getValueAt(row, 6).toString());
       
        int user_grade = Integer.parseInt(swimmingSchool.getUserGrade());
        if (isClassBook) {
            JOptionPane.showMessageDialog(this, "class already booked", "Alert", JOptionPane.WARNING_MESSAGE);
        } else if (!(capacity >= 1 && capacity <= 4)) {
            JOptionPane.showMessageDialog(this, "Seat not available", "Alert", JOptionPane.WARNING_MESSAGE);
        } else {
            
            if (lesson_grade == user_grade || user_grade+1 ==lesson_grade) {
                class_code = Integer.parseInt(lesson);
                System.out.println("class 1 " + class_code);
                bookLessonButton.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(this, "grade not match", "Alert", JOptionPane.WARNING_MESSAGE);
            }

        }

    }//GEN-LAST:event_lessonTableMouseClicked

    private void select_dayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_select_dayActionPerformed
      lessonDetails();
    }//GEN-LAST:event_select_dayActionPerformed

    private void select_gradeStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_select_gradeStateChanged
        lessonDetails();
    }//GEN-LAST:event_select_gradeStateChanged

    private void select_coachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_select_coachActionPerformed
        lessonDetails();
    }//GEN-LAST:event_select_coachActionPerformed

    //store coach details in combo box
    public void selectCoach()
    {
        List<User>coaches=swimmingSchool.getCoaches();
        System.out.println("Coach size : "+coaches.size());
        
        coachModel.addElement("Select Coach");
        for(User coach : coaches)
        {
            coachModel.addElement(coach.getFull_name());
        }
        select_coach.setModel(coachModel);
    }
    
    //show lesson details in table
    public void lessonDetails() {
        // start from first row
        table_model.setRowCount(0);
        //get selected value
        String selectedDay = (String) select_day.getSelectedItem();
        int selectedGrade = (int) select_grade.getValue();
        String selectedCoach = (String) select_coach.getSelectedItem();
        //get lesson details
        List<Lesson> lessons = swimmingSchool.getLessons();
        //show lesson details by using for loop
        for (Lesson lesson : lessons) {
            boolean matchSelection = true;
            //validation of selected day
            if (!selectedDay.equals("Select Day") && !lesson.getDay().equalsIgnoreCase(selectedDay)) {
                matchSelection = false;
            }
            //validation of selected grade
            if (selectedGrade!=0 && !lesson.getGrade().equalsIgnoreCase(String.valueOf(selectedGrade))) {
                matchSelection = false;
            }
            //validation of selected coach
            if (!selectedCoach.equals("Select Coach") && !lesson.getCoach().equalsIgnoreCase(selectedCoach)) {
                matchSelection = false;
            }

            // if match all selection
            if (matchSelection || (selectedDay.equals("Select Day") && selectedGrade==0 && selectedCoach.equals("Select Coach"))) {
                class_code = lesson.getClass_code();
                lessonName = lesson.getName();
                date = lesson.getDate();
                day = lesson.getDay();
                time = lesson.getTime();
                grade = lesson.getGrade();
                coach = lesson.getCoach();
                no_of_seat = lesson.getNo_of_seat();
                amount = lesson.getAmount();
                //add details in jtable
                String[] lesson_details = {"CLASS_HJSC_0"+class_code, lessonName, day, date, time, coach,grade, no_of_seat, amount};
                table_model.addRow(lesson_details);
            }
        }
    }
    
    //book Lesson
    public void lessonBooking() {

        int row = lessonTable.getSelectedRow();
        class_code = (int) lessonTable.getModel().getValueAt(row, 0);
        int capacity = (int)lessonTable.getModel().getValueAt(row, 7);
        if (capacity >= 1 && capacity <= 4) {
            swimmingSchool.bookingLesson(0);
            this.setVisible(false);
            new DashboardGUI(swimmingSchool).setVisible(true);
        }else
        {
             JOptionPane.showMessageDialog(this, "No seat available", "Alert", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    //book lesson
    public void bookLesson() {
        boolean book=swimmingSchool.bookingLesson(class_code);
        if(book)
        {
            swimmingSchool.seatUpdate("Booked", class_code);
            JOptionPane.showMessageDialog(this, "Class joined", "Alert", JOptionPane.INFORMATION_MESSAGE);
            this.setVisible(false);
            new DashboardGUI(swimmingSchool).setVisible(true);
        }else
        {
             JOptionPane.showMessageDialog(this, "Class not joined", "Alert", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    //change lesson
    public void changeLesson()
    {
       swimmingSchool.changeBookings(class_code);
       int pre_class=swimmingSchool.getPrevious_class();
       swimmingSchool.seatUpdate("Cancel", pre_class);
       swimmingSchool.seatUpdate("Booked", class_code);
       JOptionPane.showMessageDialog(this, "Class changed", "Alert", JOptionPane.INFORMATION_MESSAGE);
       this.setVisible(false);
       new DashboardGUI(swimmingSchool).setVisible(true);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JButton bookLessonButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable lessonTable;
    private javax.swing.JComboBox<String> select_coach;
    private javax.swing.JComboBox<String> select_day;
    private javax.swing.JSpinner select_grade;
    // End of variables declaration//GEN-END:variables
}
