package hjsc_project;

import javax.swing.JOptionPane;


public class LoginGUI extends javax.swing.JFrame {
    private SwimmingSchool swimmingSchool;
    private String name;
    private String password;
    private int role_id;
    
   
   
    public LoginGUI(SwimmingSchool swimmingSchool) {
         this.swimmingSchool = swimmingSchool;
         //get role id
         this.role_id=swimmingSchool.getRole_id();
        initComponents();
        //update dashboard for admin
        if(role_id==swimmingSchool.getRoleIdByName("Admin"))
        {
            //change nameLabel for admin
            nameLabel.setText("Admin Name");
            //hide register label for admin
            registerLable.setVisible(false);
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        passwordField = new javax.swing.JPasswordField();
        registerLable = new javax.swing.JLabel();
        loginButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1530, 830));
        getContentPane().setLayout(null);

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setMinimumSize(new java.awt.Dimension(1530, 830));
        jPanel2.setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 5));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setText("Login Form");

        nameLabel.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        nameLabel.setText("User Name   :");

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setText("Password     :");

        nameField.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        passwordField.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        registerLable.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        registerLable.setForeground(new java.awt.Color(102, 102, 102));
        registerLable.setText("Go to Register Page");
        registerLable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                registerLableMouseClicked(evt);
            }
        });

        loginButton.setBackground(new java.awt.Color(204, 204, 204));
        loginButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        loginButton.setForeground(new java.awt.Color(255, 255, 255));
        loginButton.setText("Login");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(passwordField))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(jLabel1)))
                .addContainerGap(68, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(registerLable, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(91, 91, 91))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(loginButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(registerLable)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel1);
        jPanel1.setBounds(130, 320, 410, 250);

        backButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        jPanel2.add(backButton);
        backButton.setBounds(120, 70, 216, 40);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hjsc_project/image/hjsc2.jpg"))); // NOI18N
        jLabel2.setToolTipText("");
        jLabel2.setAlignmentX(0.5F);
        jPanel2.add(jLabel2);
        jLabel2.setBounds(650, 90, 1020, 690);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 1410, 720);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
       this.setVisible(false);
       new MainGUI(swimmingSchool).setVisible(true);
    }//GEN-LAST:event_backButtonActionPerformed

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        // TODO add your handling code here:
         Login();
    }//GEN-LAST:event_loginButtonActionPerformed

    private void registerLableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerLableMouseClicked
        // TODO add your handling code here:
         this.setVisible(false);
        new RegisterGUI(swimmingSchool).setVisible(true);
    }//GEN-LAST:event_registerLableMouseClicked

    //user login
    public void Login() {
        //get user name and password from user
        name = nameField.getText();
        password = passwordField.getText();
        //validation any field can not be empty
        if (name.isBlank() || password.isBlank()) {
            JOptionPane.showMessageDialog(this, "All fields are required", "Alert", JOptionPane.INFORMATION_MESSAGE);
        } else {
            //get result of login
            boolean login = swimmingSchool.userLogin(name, password, role_id);
            if (login) {
                //print message after login
                JOptionPane.showMessageDialog(this, "Login successfully", "Alert", JOptionPane.INFORMATION_MESSAGE);
                //redirect to dashboard class after login
                this.setVisible(false);
                new DashboardGUI(swimmingSchool).setVisible(true);
            } else {
                //print error message
                JOptionPane.showMessageDialog(this, "Wrong username or password", "Alert", JOptionPane.INFORMATION_MESSAGE);

            }

        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton loginButton;
    private javax.swing.JTextField nameField;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel registerLable;
    // End of variables declaration//GEN-END:variables
}
