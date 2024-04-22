package hjsc_project;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SwimmingSchool extends Role {
    private static SwimmingSchool instance = null;
    private static String admin_name = "Admin";
    private static String admin_password = "123456";
    private String user_grade;
    private String user_name;
    private int role_id;
    private String booking_no;
    private int previous_class;
    private String action;
    private List<Lesson> lessons;
    private List<User> users;
    private List<Role> roles;
    private List<List<String>> bookings;
    private List<List<String>> ratings;

    public SwimmingSchool(int role_id, String role_name) {
        super(role_id, role_name);
    }

    public SwimmingSchool() {
        lessons = new ArrayList<>();
        users = new ArrayList<>();
        roles = new ArrayList<>();
        bookings = new ArrayList<>();
        ratings = new ArrayList<>();
        learnerRegister(new User());
        saveRole();
        saveLesson();

    }

    public String getBooking_no() {
        return booking_no;
    }

    public void setBooking_no(String booking_no) {
        this.booking_no = booking_no;
    }

    public void setPrevious_class(int previous_class) {
        this.previous_class = previous_class;
    }

    public int getPrevious_class() {
        return previous_class;
    }

    public void SetAction(String action) {
        this.action = action;
    }

    public String getAction() {
        return action;
    }

    public String getUserGrade() {
        return user_grade;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_name() {
        return user_name;
    }

    public int getRole_id() {
        return role_id;
    }

    public void setRole_id(int role_id) {
        this.role_id = role_id;
    }

    public static synchronized SwimmingSchool getInstance() {
        if (instance == null) {
            instance = new SwimmingSchool();
        }
        return instance;
    }

    //save role
    public void saveRole() {
        roles.add(new Role(1, "Learner"));
        roles.add(new Role(2, "Admin"));
        roles.add(new Role(3, "Coach"));
    }
    
    //get role
    public List<Role>getRole()
    {
        return roles;
    }
    
    //get role name by id
    public int getRoleIdByName(String role_name) {
        int role_id = 0;
        for (Role role : roles) {
            if (role.getRole_name().equalsIgnoreCase(role_name)) {
                role_id = role.getRole_id();
            }
        }
        return role_id;
    }
    
    
    //save learner in arrayList
    public boolean learnerRegister(User learner) {
        users.add(new User(1, 1, "William", "William@123", "william@gmail.com", "9876543210", "11", "Male", "1", "12343"));
        users.add(new User(2, 1, "Olivia", "Olivia@123", "olivia@gmail.com", "9876541275", "4", "Male", "1", "12343"));
        users.add(new User(3, 1, "Amelia", "Amelia@123", "amelia@gmail.com", "9878963210", "8", "Male", "1", "12343"));
        users.add(new User(4, 1, "Robin", "Robin@123", "robin@gmail.com", "9876549874", "9", "Female", "1", "12343"));
        users.add(new User(5, 1, "Montgomery", "Montgomery@123", "montgomery@gmail.com", "9876542309", "6", "Female", "1", "12343"));
        users.add(new User(6, 3, "Monty", "", "monty@gmail.com", "1234567891", "35", "Male", "", ""));
        users.add(new User(7, 3, "David", "", "david@gmail.com", "9876542986", "40", "Male", "", ""));
        users.add(new User(8, 3, "Andrew", "", "andrew@gmail.com", "1234567892", "45", "Male", "", ""));
        users.add(new User(9, 3, "Mathew", "", "mathew@gmail.com", "9876542987", "50", "Male", "", ""));
        users.add(new User(10, 3, "Charls", "", "Charls@gmail.com", "1234567893", "55", "Male", "", ""));
        int learner_id = users.size() + 1;
        learner.setUser_id(learner_id);
        users.add(learner);
        return true;
    }

    //get learners
    public List<User> getLearners() {
        List<User> learners = new ArrayList<>();
        for (User user : users) {
            int role_id = getRoleIdByName("Learner");
            if (role_id == user.getRole_id()) {
                learners.add(user);
            }
        }
        return learners;
    }
    
     //get coach details
    public List<User> getCoaches() {
        List<User> coaches = new ArrayList<>();
        for (User user : users) {
            if (user.getRole_id() == instance.getRoleIdByName("Coach")) {
                coaches.add(user);
            }
        }
        return coaches;
    }
    
    //login
    public boolean userLogin(String name, String password, int role_id) {
        if (role_id == instance.getRoleIdByName("Admin")) {
            if (name.equals(admin_name) && password.equals(admin_password)) {
                user_name = "";
                return true;
            }
        } else {
            for (User user : users) {
                if (user.getUser_name() != null && user.getUser_password() != null) {
                    if (user.getUser_name().equals(name) && user.getUser_password().equals(password)) {
                        user_name = user.getUser_name();
                        user_grade = user.getUser_grade();
                        return true;
                    }
                }
            }

        }
        return false;
    }
    
    //save static data of lesson in arraylist
    public void saveLesson() {
        lessons.add(new Lesson(1, "Aqua Infants", "04-03-2024", "Monday", "4:00pm - 5:00pm", "1", "Monty", "3", "$789.99"));
        lessons.add(new Lesson(2, "Aquatic Education", "04-02-2024", "Monday", "5:00pm - 6:00pm", "1", "Monty", "4", "$789.99"));
        lessons.add(new Lesson(3, "Tiny Swimmers", "04-02-2024", "Monday", "6:00pm - 7:00pm", "5", "Monty", "4", "$789.99"));
        lessons.add(new Lesson(4, "Infant Floats", "06-03-2024", "Wednesday", "4:00pm - 5:00pm", "3", "David", "4", "$789.99"));
        lessons.add(new Lesson(5, "Junior Paddlers", "06-03-2024", "Wednesday", "5:00pm - 6:00pm", "4", "David", "4", "$789.99"));
        lessons.add(new Lesson(6, "Mini Splashes", "06-03-2024", "Wednesday", "6:00pm - 7:00pm", "3", "David", "4", "$789.99"));
        lessons.add(new Lesson(7, "Tot Treading", "08-03-2024", "Friday", "4:00pm - 5:00pm", "2", "Andrew", "4", "$789.99"));
        lessons.add(new Lesson(8, "Water Explorers", "08-03-2024", "Friday", "5:00pm - 6:00pm", "3", "Andrew", "4", "$789.99"));
        lessons.add(new Lesson(9, "Guppy Squad", "08-03-2024", "Friday", "6:00pm - 7:00pm", "2", "Monty", "4", "$789.99"));
        lessons.add(new Lesson(10, "Splash Team", "09-03-2024", "Saturday", "2:00pm - 3:00pm", "5", "David", "4", "$789.99"));
        lessons.add(new Lesson(11, "Basic Aquatics", "09-03-2024", "Saturday", "3:00pm - 4:00pm", "4", "Mathew", "4", "$789.99"));
        lessons.add(new Lesson(12, "Swimming Starters", "11-03-2024", "Monday", "4:00pm - 5:00pm", "3", "Charls", "4", "$789.99"));
        lessons.add(new Lesson(13, "Junior Swimmers", "11-03-2024", "Monday", "5:00pm - 6:00pm", "4", "Mathew", "4", "$789.99"));
        lessons.add(new Lesson(14, "Aqua Wizards", "11-03-2024", "Monday", "6:00pm - 7:00pm", "1", "David", "4", "$789.99"));
        lessons.add(new Lesson(15, "Diving Dynamics", "13-03-2024", "Wednesday", "4:00pm - 5:00pm", "1", "Monty", "4", "$789.99"));
        lessons.add(new Lesson(16, "Aquatic Stars", "13-03-2024", "Wednesday", "5:00pm - 6:00pm", "5", "Andrew", "4", "$789.99"));
        lessons.add(new Lesson(17, "Advanced Swimming", "13-03-2024", "Wednesday", "6:00pm - 7:00pm", "5", "Mathew", "4", "$789.99"));
        lessons.add(new Lesson(18, "Swimming Strides", "15-03-2024", "Friday", "4:00pm - 5:00pm", "2", "Charls", "4", "$789.99"));
        lessons.add(new Lesson(19, "Butterfly Swimmers", "15-03-2024", "Friday", "5:00pm - 6:00pm", "3", "Charls", "4", "$789.99"));
        lessons.add(new Lesson(20, "Rapids Racers", "15-03-2024", "Friday", "6:00pm - 7:00pm", "4", "Andrew", "3", "$789.99"));
        lessons.add(new Lesson(21, "Aquatic Force", "16-03-2024", "Saturday", "2:00pm - 3:00pm", "3", "David", "4", "$789.99"));
        lessons.add(new Lesson(22, "Crawl Competitors", "16-03-2024", "Saturday", "3:00pm - 4:00pm", "4", "Monty", "4", "$789.99"));
        lessons.add(new Lesson(23, "Swim Tactics", "18-03-2024", "Monday", "4:00pm - 5:00pm", "5", "Andrew", "4", "$789.99"));
        lessons.add(new Lesson(24, "Finesse Freestyle", "18-03-2024", "Monday", "5:00pm - 6:00pm", "2", "Charls", "4", "$789.99"));
        lessons.add(new Lesson(25, "Backstroke Brilliance", "18-03-2024", "Monday", "6:00pm - 7:00pm", "1", "David", "4", "$789.99"));
        lessons.add(new Lesson(26, "Breaststroke Breakthrough", "20-03-2024", "Wednesday", "4:00pm - 5:00pm", "4", "Monty", "4", "$789.99"));
        lessons.add(new Lesson(27, "Butterfly Mastery", "20-03-2024", "Wednesday", "5:00pm - 6:00pm", "3", "Charls", "4", "$789.99"));
        lessons.add(new Lesson(28, "Medley Mastery", "20-03-2024", "Wednesday", "6:00pm - 7:00pm", "2", "Mathew", "4", "$789.99"));
        lessons.add(new Lesson(29, "Aquatic Skills Showcase", "22-03-2024", "Friday", "4:00pm - 5:00pm", "1", "Mathew", "4", "$789.99"));
        lessons.add(new Lesson(30, "Adapted Aquatics", "22-03-2024", "Friday", "5:00pm - 6:00pm", "5", "Monty", "4", "$789.99"));
        lessons.add(new Lesson(31, "Aqua Workout", "22-03-2024", "Friday", "6:00pm - 7:00pm", "4", "David", "4", "$789.99"));
        lessons.add(new Lesson(32, "Lifesaving Skills", "23-03-2024", "Saturday", "2:00pm - 3:00pm", "3", "Charls", "4", "$789.99"));
        lessons.add(new Lesson(33, "Relaxing Splash", "23-03-2024", "Saturday", "3:00pm - 4:00pm", "2", "David", "4", "$789.99"));
        lessons.add(new Lesson(34, "Aquatic Yoga", "25-03-2024", "Monday", "4:00pm - 5:00pm", "1", "Andrew", "4", "$789.99"));
        lessons.add(new Lesson(35, "Senior Swimming", "25-03-2024", "Monday", "5:00pm - 6:00pm", "5", "David", "4", "$789.99"));
        lessons.add(new Lesson(36, "Aquatic Arthritis", "25-03-2024", "Monday", "6:00pm - 7:00pm", "4", "Mathew", "4", "$789.99"));
        lessons.add(new Lesson(37, "Hydro Healing", "27-03-2024", "Wednesday", "4:00pm - 5:00pm", "3", "Monty", "4", "$789.99"));
        lessons.add(new Lesson(38, "Pool Masters", "27-03-2024", "Wednesday", "5:00pm - 6:00pm", "2", "Andrew", "4", "$789.99"));
        lessons.add(new Lesson(39, "Triathlete Lessons", "27-03-2024", "Wednesday", "6:00pm - 7:00pm", "1", "Charls", "4", "$789.99"));
        lessons.add(new Lesson(40, "Aqua Playtime", "29-03-2024", "Friday", "4:00pm - 5:00pm", "5", "David", "4", "$789.99"));
        lessons.add(new Lesson(41, "Aqua Safety", "29-03-2024", "Friday", "5:00pm - 6:00pm", "4", "Monty", "4", "$789.99"));
        lessons.add(new Lesson(42, "Olympic Hopefuls", "29-03-2024", "Friday", "6:00pm - 7:00pm", "3", "Mathew", "4", "$789.99"));
        lessons.add(new Lesson(43, "Aquatic Adventure Camp", "30-03-2024", "Saturday", "2:00pm - 3:00pm", "2", "Charls", "4", "$789.99"));
        lessons.add(new Lesson(44, "Pool Party Madness", "30-03-2024", "Saturday", "3:00pm - 4:00pm", "5", "Monty", "4", "$789.99"));
    }
    
    //get lessons
    public List<Lesson> getLessons() {
        return lessons;
    }

    //get lesson by class code
    public Lesson getLessonDetails(int class_code) {
        Lesson lesson1 = new Lesson();
        for (Lesson lesson : lessons) {
            if (lesson.getClass_code() == class_code) {
                lesson1 = lesson;
            }
        }
        return lesson1;
    }
    
     //booking lesson
    public boolean bookingLesson(int class_code) {
        //add static booking details if bookings empty
        if (bookings.isEmpty()) {
            List<String> booking = new ArrayList<>();
            booking.add("1");
            booking.add("William@123");
            booking.add("1");
            booking.add("Aqua Infants");
            booking.add("04-03-2024");
            booking.add("4:00pm - 5:00pm");
            booking.add("1");
            booking.add("Monty");
            booking.add("Booked");
            booking.add("$789.99");
            bookings.add(booking);
        }
        //add booking detail on user booking
        Lesson lesson = instance.getLessonDetails(class_code);
        List<String> booking1 = new ArrayList<>();
        if (class_code != 0) {
            booking1.add(String.valueOf(bookings.size() + 1));
            booking1.add(instance.user_name);
            booking1.add(String.valueOf(lesson.class_code));
            booking1.add(lesson.name);
            booking1.add(lesson.date);
            booking1.add(lesson.time);
            booking1.add(lesson.grade);
            booking1.add(lesson.coach);
            booking1.add("Booked");
            booking1.add(lesson.amount);
            bookings.add(booking1);
            return true;
        }
        return false;
    }
    
    
    //get booking details
    public List<List<String>> getBookings() {
        return bookings;
    }
    

    //cancel booking
    public void cancelBookings() {
        booking_no = instance.booking_no.substring(13);
        for (List<String> booking : bookings) {
            if (booking.get(0).equalsIgnoreCase(booking_no)) {
                booking.set(8, "Cancel");
                break;
            }
        }

    }

    //change booking lesson
    public void changeBookings(int class_code) {
        booking_no = instance.booking_no.substring(13);
        Lesson lesson = instance.getLessonDetails(class_code);
        for (List<String> booking : bookings) {
            if (booking.get(0).equalsIgnoreCase(booking_no)) {
                booking.set(1, instance.user_name);
                booking.set(2, String.valueOf(lesson.class_code));
                booking.set(3, lesson.name);
                booking.set(4, lesson.date);
                booking.set(5, lesson.time);
                booking.set(6, lesson.grade);
                booking.set(7, lesson.coach);
                booking.set(8, "Change");
                booking.set(9, lesson.amount);
                break;
            }
        }
    }

   

    //seat update 
    public void seatUpdate(String status, int class_code) {
        int current_seat;
        for (Lesson lesson : lessons) {
            if (lesson.getClass_code() == class_code) {
                current_seat = Integer.parseInt(lesson.getNo_of_seat());
                if (status.equalsIgnoreCase("Booked")) {
                    lesson.setNo_of_seat(String.valueOf(current_seat - 1));
                    break;
                } else {
                    lesson.setNo_of_seat(String.valueOf(current_seat + 1));
                    break;
                }
            }
        }
    }

    //attend class
    public void attendClass(int class_code, String rating, String review) {
        booking_no = instance.booking_no.substring(13);
        Lesson lesson = instance.getLessonDetails(class_code);
        if (class_code != 0) {
            List<String> rating1 = new ArrayList<>();
            rating1.add(String.valueOf(ratings.size() + 1));
            rating1.add(String.valueOf(class_code));
            rating1.add(instance.user_name);
            rating1.add(lesson.coach);
            rating1.add(lesson.date);
            rating1.add(lesson.time);
            rating1.add(rating);
            rating1.add(review);
            ratings.add(rating1);

            //change booking status
            for (List<String> booking : bookings) {
                if (booking.get(0).equalsIgnoreCase(booking_no)) {
                    booking.set(8, "Attend");
                    break;
                }
            }

        }

    }

    //get rating details
    public List<List<String>> getRatings() {
        return ratings;
    }

    //get average ratings of coach
    public Map<String, Map<String, Double>> coachAverageRatings() {
        // get average ratings by coach
        return ratings.stream()
                .collect(Collectors.groupingBy(
                        rating -> rating.get(1),
                        Collectors.groupingBy(
                                rating -> rating.get(3),
                                Collectors.averagingDouble(rating -> Double.parseDouble(rating.get(6)))
                        )
                ));
    }

    public Map<String, Map<String, Long>> learnerBookings() {
      //get learner booking by status
        return bookings.stream()
                .collect(
                       //user name
                        Collectors.groupingBy(
                                booking -> booking.get(1),
                                //count status
                                Collectors.groupingBy(
                                        booking -> booking.get(8),
                                        Collectors.counting()
                                )
                        )
                );
    }

    //check class not pre booked by user
    public boolean classBookingStatus(String class_code) {
        for (List<String> booking : bookings) {
            if (booking.get(1).equalsIgnoreCase(user_name)) {
                if (booking.get(2).equalsIgnoreCase(class_code) && !booking.get(8).equalsIgnoreCase("Cancel")) {
                    return true;
                }
            }

        }
        return false;
    }

    //update student level
    public void updateStudenLevel(String level) {
        for (User user : users) {
            if (user.getUser_name().equalsIgnoreCase(instance.user_name)) {
                user.setUser_grade(level);
                this.user_grade = level;
                break;
            }
        }

    }

}
