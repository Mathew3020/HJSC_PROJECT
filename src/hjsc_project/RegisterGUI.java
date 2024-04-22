package hjsc_project;

import java.awt.Color;
import java.util.List;
import javax.swing.JOptionPane;

public class RegisterGUI extends javax.swing.JFrame {
    private SwimmingSchool swimmingSchool;
    private int role_id;
    private String full_name;
    private String user_name;
    private String email;
    private String contact;
    private String gender;
    private String age;
    private String grade;
    private String password;
    private String role="Learner";

    public RegisterGUI(SwimmingSchool swimmingSchool) {
        this.swimmingSchool = swimmingSchool;
        initComponents();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        passwordField = new javax.swing.JPasswordField();
        loginButton = new javax.swing.JButton();
        loginLabel = new javax.swing.JLabel();
        ageField = new javax.swing.JTextField();
        contactField = new javax.swing.JTextField();
        emailField = new javax.swing.JTextField();
        gradeField = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        usernameField = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        selectGender = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1530, 830));
        getContentPane().setLayout(null);

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setMinimumSize(new java.awt.Dimension(1530, 830));
        jPanel2.setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 5));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setText("Learner Register");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(120, 30, 180, 22);

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setText("Full Name     :");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(50, 80, 96, 17);

        nameField.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        nameField.setForeground(new java.awt.Color(204, 204, 204));
        nameField.setText("Full Name");
        nameField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                nameFieldFocusGained(evt);
            }
        });
        jPanel1.add(nameField);
        nameField.setBounds(160, 70, 182, 32);

        passwordField.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel1.add(passwordField);
        passwordField.setBounds(160, 340, 180, 32);

        loginButton.setBackground(new java.awt.Color(204, 204, 204));
        loginButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        loginButton.setForeground(new java.awt.Color(255, 255, 255));
        loginButton.setText("Register");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });
        jPanel1.add(loginButton);
        loginButton.setBounds(90, 390, 216, 24);

        loginLabel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        loginLabel.setForeground(new java.awt.Color(102, 102, 102));
        loginLabel.setText("Go to Login Page ");
        loginLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginLabelMouseClicked(evt);
            }
        });
        jPanel1.add(loginLabel);
        loginLabel.setBounds(120, 430, 200, 17);

        ageField.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        ageField.setForeground(new java.awt.Color(204, 204, 204));
        ageField.setText("4 to 11 only");
        ageField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                ageFieldFocusGained(evt);
            }
        });
        jPanel1.add(ageField);
        ageField.setBounds(160, 260, 182, 32);

        contactField.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        contactField.setForeground(new java.awt.Color(204, 204, 204));
        contactField.setText(" 9876543210");
        contactField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                contactFieldFocusGained(evt);
            }
        });
        contactField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contactFieldActionPerformed(evt);
            }
        });
        jPanel1.add(contactField);
        contactField.setBounds(160, 190, 182, 32);

        emailField.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        emailField.setForeground(new java.awt.Color(204, 204, 204));
        emailField.setText("abc@gmail.com");
        emailField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                emailFieldFocusGained(evt);
            }
        });
        jPanel1.add(emailField);
        emailField.setBounds(160, 150, 182, 32);

        gradeField.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        gradeField.setForeground(new java.awt.Color(204, 204, 204));
        gradeField.setText("Enter grade 0 to 5");
        gradeField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                gradeFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                gradeFieldFocusLost(evt);
            }
        });
        jPanel1.add(gradeField);
        gradeField.setBounds(160, 300, 182, 32);

        jLabel10.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel10.setText("Password      :");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(50, 350, 96, 17);

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setText("User Name  :");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(50, 120, 96, 17);

        usernameField.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        usernameField.setForeground(new java.awt.Color(204, 204, 204));
        usernameField.setText("User Name");
        usernameField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                usernameFieldFocusGained(evt);
            }
        });
        jPanel1.add(usernameField);
        usernameField.setBounds(160, 110, 182, 32);

        jLabel11.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel11.setText("Grade            :");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(50, 310, 96, 17);

        jLabel12.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel12.setText("Age                :");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(50, 270, 96, 17);

        jLabel13.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel13.setText("Gender         :");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(50, 240, 96, 17);

        jLabel14.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel14.setText("Contact        :");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(50, 200, 96, 17);

        jLabel15.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel15.setText("Email            :");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(50, 160, 96, 17);

        selectGender.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        selectGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Gender", "Male", "Female" }));
        jPanel1.add(selectGender);
        selectGender.setBounds(160, 230, 180, 26);

        jPanel2.add(jPanel1);
        jPanel1.setBounds(70, 160, 410, 470);

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hjsc_project/image/hjsc2.jpg"))); // NOI18N
        jLabel5.setToolTipText("");
        jLabel5.setAlignmentX(0.5F);
        jPanel2.add(jLabel5);
        jLabel5.setBounds(650, 90, 1020, 690);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 1430, 670);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        // TODO add your handling code here:
        learnerDetails();
    }//GEN-LAST:event_loginButtonActionPerformed

    private void gradeFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_gradeFieldFocusGained
       gradeField.setText("");
        gradeField.setForeground(Color.black);
    }//GEN-LAST:event_gradeFieldFocusGained

    private void gradeFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_gradeFieldFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_gradeFieldFocusLost

    private void emailFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailFieldFocusGained
        emailField.setText("");
        emailField.setForeground(Color.black);
    }//GEN-LAST:event_emailFieldFocusGained

    private void contactFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_contactFieldFocusGained
        contactField.setText("");
        contactField.setForeground(Color.black);
    }//GEN-LAST:event_contactFieldFocusGained

    private void ageFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ageFieldFocusGained
        // TODO add your handling code here:
        ageField.setText("");
        ageField.setForeground(Color.black);
    }//GEN-LAST:event_ageFieldFocusGained

    private void contactFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contactFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contactFieldActionPerformed

    private void loginLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginLabelMouseClicked
        this.setVisible(false);
        new LoginGUI(swimmingSchool).setVisible(true);
    }//GEN-LAST:event_loginLabelMouseClicked

    private void nameFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nameFieldFocusGained
        nameField.setText("");
        nameField.setForeground(Color.black);
    }//GEN-LAST:event_nameFieldFocusGained

    private void usernameFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usernameFieldFocusGained
        usernameField.setText("");
        usernameField.setForeground(Color.black);
    }//GEN-LAST:event_usernameFieldFocusGained


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ageField;
    private javax.swing.JTextField contactField;
    private javax.swing.JTextField emailField;
    private javax.swing.JTextField gradeField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton loginButton;
    private javax.swing.JLabel loginLabel;
    private javax.swing.JTextField nameField;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JComboBox<String> selectGender;
    private javax.swing.JTextField usernameField;
    // End of variables declaration//GEN-END:variables

    //empty form field if user not enter
    public void getUserInput() {
        if(nameField.getText().equalsIgnoreCase("Full Name"))
        {
            full_name="";
        }else if(usernameField.getText().equalsIgnoreCase("User Name"))
        {
            user_name="";
        }else if (emailField.getText().equalsIgnoreCase("abc@gmail.com")) {
            email = "";
        } else if (contactField.getText().equalsIgnoreCase(" 9876543210")) {
            contact = "";
        }  else if (ageField.getText().equalsIgnoreCase("4 to 11 only")) {
            age = "";
        } else if (gradeField.getText().equalsIgnoreCase("Enter grade 0 to 5")) {
            grade = "";
        } else {
            full_name = nameField.getText();
            user_name=usernameField.getText();
            email = emailField.getText();
            contact = contactField.getText();
            gender = (String) selectGender.getSelectedItem();
            age = ageField.getText();
            grade = gradeField.getText();
            password = passwordField.getText();
        }
    }

    //learner register
    public void learnerDetails() {
        full_name="";
        user_name="";
        getUserInput();
        role_id=swimmingSchool.getRoleIdByName("Learner");
        boolean isUserNameExist = learnerNameExist(user_name);
        if (!(full_name.isEmpty() ||user_name.isBlank()|| email.isEmpty() || contact.isEmpty() || gender.equalsIgnoreCase("Select Gender") || age.isEmpty() || grade.isEmpty() || password.isEmpty())) {
            if (isUserNameExist) {
                JOptionPane.showMessageDialog(this, "Learner name already exist", "Alert", JOptionPane.WARNING_MESSAGE);
            } else if (!email.matches("^(.+)@(\\S+)$")) {
                JOptionPane.showMessageDialog(this, "Please enter valid email", "Alert", JOptionPane.WARNING_MESSAGE);
            } else if (!contact.matches("\\d{10}")) {
                JOptionPane.showMessageDialog(this, "Please enter valid contact", "Alert", JOptionPane.WARNING_MESSAGE);
            } else if (!age.matches("\\d+")) {
                JOptionPane.showMessageDialog(this, "Please enter valid age", "Alert", JOptionPane.WARNING_MESSAGE);
            } else if (!grade.matches("[0-5]")) {
                JOptionPane.showMessageDialog(this, "Please enter valid grade", "Alert", JOptionPane.WARNING_MESSAGE);
            } else if (age.matches("\\d+")) {
                int valid_age = Integer.parseInt(age);
                if (!(valid_age >= 4 && valid_age <= 11)) {
                    JOptionPane.showMessageDialog(this, "Please enter valid age 4 to 11", "Alert", JOptionPane.WARNING_MESSAGE);
              } else {
                    User user= new User(0,role_id,full_name,user_name,email,contact,age,gender,grade,password);
                    swimmingSchool.learnerRegister(user);
                    JOptionPane.showMessageDialog(this, "Registration Successfully", "Alert", JOptionPane.INFORMATION_MESSAGE);
                    this.setVisible(false);
                    new LoginGUI(swimmingSchool).setVisible(true);
                
                }
            }
        } else {

            JOptionPane.showMessageDialog(this, "All fields are required ", "Alert", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    
    //check learner name pre registered
    public boolean learnerNameExist(String name) {
        List<User> learner_details = swimmingSchool.getLearners();
        for (User learner : learner_details) {
            if (learner.getUser_name().equalsIgnoreCase(name)) {
                return true;
            }
        }
        return false;
    }

}
