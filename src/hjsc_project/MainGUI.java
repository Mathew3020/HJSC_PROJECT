package hjsc_project;



public class MainGUI extends javax.swing.JFrame {
    private int role_id;
   private SwimmingSchool swimmingSchool;

    public MainGUI(SwimmingSchool swimmingSchool) {
        this.swimmingSchool = swimmingSchool;
         initComponents();
    }
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        learnerButton = new javax.swing.JButton();
        adminButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1530, 830));
        getContentPane().setLayout(null);

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setPreferredSize(new java.awt.Dimension(1530, 830));
        jPanel2.setLayout(null);

        learnerButton.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        learnerButton.setText("Learner");
        learnerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                learnerButtonActionPerformed(evt);
            }
        });
        jPanel2.add(learnerButton);
        learnerButton.setBounds(40, 470, 440, 70);

        adminButton.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        adminButton.setText("Admin");
        adminButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminButtonActionPerformed(evt);
            }
        });
        jPanel2.add(adminButton);
        adminButton.setBounds(40, 630, 440, 70);

        jLabel1.setFont(new java.awt.Font("Arial", 3, 48)); // NOI18N
        jLabel1.setText("Hatfield Junior Swimming School");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(330, 20, 790, 60);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hjsc_project/image/hjsc.jpg"))); // NOI18N
        jLabel2.setToolTipText("");
        jLabel2.setAlignmentX(0.5F);
        jPanel2.add(jLabel2);
        jLabel2.setBounds(530, 130, 1020, 690);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 1560, 840);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void learnerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_learnerButtonActionPerformed
        //get learner role id
        role_id=swimmingSchool.getRoleIdByName("Learner");
        //set learner role id 
        swimmingSchool.setRole_id(role_id);
        //redirect to login page
        this.setVisible(false);
        new LoginGUI(swimmingSchool).setVisible(true);
    }//GEN-LAST:event_learnerButtonActionPerformed

    private void adminButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminButtonActionPerformed
       //get admin role id
        role_id=swimmingSchool.getRoleIdByName("Admin");
        //set admin role id
        swimmingSchool.setRole_id(role_id);
        //redirect to login page
        this.setVisible(false);
        new LoginGUI(swimmingSchool).setVisible(true);
    }//GEN-LAST:event_adminButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // Initialize the swimming school
        SwimmingSchool swimmingSchool = SwimmingSchool.getInstance();
        // Create and display the main GUI
        new MainGUI(swimmingSchool).setVisible(true);
    }
    
    
    
    
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adminButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton learnerButton;
    // End of variables declaration//GEN-END:variables
}
