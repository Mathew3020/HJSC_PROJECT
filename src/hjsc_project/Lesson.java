package hjsc_project;

public class Lesson {
    int class_code;
    String name;
    String date;
    String day;
    String time;
    String grade;
    String coach;
    String no_of_seat;
    String amount;

    
    /**
     * @return the time
     */
    public String getTime() {
        return time;
    }

    /**
     * @param time the time to set
     */
    public void setTime(String time) {
        this.time = time;
    }
    
    /**
     * @return the class_code
     */
    public int getClass_code() {
        return class_code;
    }

    /**
     * @param class_code the class_code to set
     */
    public void setClass_code(int class_code) {
        this.class_code = class_code;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * @return the day
     */
    public String getDay() {
        return day;
    }

    /**
     * @param day the day to set
     */
    public void setDay(String day) {
        this.day = day;
    }

    /**
     * @return the grade
     */
    public String getGrade() {
        return grade;
    }

    /**
     * @param grade the grade to set
     */
    public void setGrade(String grade) {
        this.grade = grade;
    }

    /**
     * @return the coach
     */
    public String getCoach() {
        return coach;
    }

    /**
     * @param coach the coach to set
     */
    public void setCoach(String coach) {
        this.coach = coach;
    }

    /**
     * @return the no_of_seat
     */
    public String getNo_of_seat() {
        return no_of_seat;
    }

    /**
     * @param no_of_seat the no_of_seat to set
     */
    public void setNo_of_seat(String no_of_seat) {
        this.no_of_seat = no_of_seat;
    }

    /**
     * @return the amount
     */
    public String getAmount() {
        return amount;
    }

    /**
     * @param amount the Amount to set
     */
    public void setAmount(String amount) {
        this.amount = amount;
    }
    
    public Lesson(int class_code, String name, String date, String day, String time, String grade, String coach, String no_of_seat, String amount) {
        this.class_code = class_code;
        this.name = name;
        this.date = date;
        this.day = day;
        this.time = time;
        this.grade = grade;
        this.coach = coach;
        this.no_of_seat = no_of_seat;
        this.amount = amount;
    }
    
    
    public Lesson()
    {
        
    }
    
    
    
}
