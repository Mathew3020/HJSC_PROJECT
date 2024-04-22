package hjsc_project;

public class User {
    private int user_id;
    private int role_id;
    private String full_name;
    private String user_name;
    private String user_email;
    private String user_contact;
    private String user_age;
    private String user_gender;
    private String user_grade;
    private String user_password;

   
    /**
     * @return the user_id
     */
    public int getUser_id() {
        return user_id;
    }

    /**
     * @param user_id the user_id to set
     */
    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    /**
     * @return the role_id
     */
    public int getRole_id() {
        return role_id;
    }

    /**
     * @param role_id the role_id to set
     */
    public void setRole_id(int role_id) {
        this.role_id = role_id;
    }

    /**
     * @return the user_name
     */
    public String getUser_name() {
        return user_name;
    }

    /**
     * @param user_name the user_name to set
     */
    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    /**
     * @return the user_email
     */
    public String getUser_email() {
        return user_email;
    }

    /**
     * @param user_email the user_email to set
     */
    public void setUser_email(String user_email) {
        this.user_email = user_email;
    }

    /**
     * @return the user_contact
     */
    public String getUser_contact() {
        return user_contact;
    }

    /**
     * @param user_contact the user_contact to set
     */
    public void setUser_contact(String user_contact) {
        this.user_contact = user_contact;
    }

    /**
     * @return the user_age
     */
    public String getUser_age() {
        return user_age;
    }

    /**
     * @param user_age the user_age to set
     */
    public void setUser_age(String user_age) {
        this.user_age = user_age;
    }

    /**
     * @return the user_gender
     */
    public String getUser_gender() {
        return user_gender;
    }

    /**
     * @param user_gender the user_gender to set
     */
    public void setUser_gender(String user_gender) {
        this.user_gender = user_gender;
    }

    /**
     * @return the user_grade
     */
    public String getUser_grade() {
        return user_grade;
    }

    /**
     * @param user_grade the user_grade to set
     */
    public void setUser_grade(String user_grade) {
        this.user_grade = user_grade;
    }

    /**
     * @return the user_password
     */
    public String getUser_password() {
        return user_password;
    }

    /**
     * @param user_password the user_password to set
     */
    public void setUser_password(String user_password) {
        this.user_password = user_password;
    }

    /**
     * @return the full_name
     */
    public String getFull_name() {
        return full_name;
    }

    /**
     * @param full_name the full_name to set
     */
    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }
    
    //create constructor
    public User(int user_id, int role_id, String full_name, String user_name, String user_email, String user_contact, String user_age, String user_gender, String user_grade, String user_password) {
        this.user_id = user_id;
        this.role_id = role_id;
        this.full_name = full_name;
        this.user_name = user_name;
        this.user_email = user_email;
        this.user_contact = user_contact;
        this.user_age = user_age;
        this.user_gender = user_gender;
        this.user_grade = user_grade;
        this.user_password = user_password;
    }

    
    public User()
    {
        
    }

    

    

}
