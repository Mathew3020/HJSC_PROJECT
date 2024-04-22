package hjsc_project;

import java.util.List;
import java.util.Map;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class SwimmingSchoolTest {

    SwimmingSchool instance = SwimmingSchool.getInstance();
    private String booking_no;
    private int class_code;
    private String user_name;

    public SwimmingSchoolTest() {
        instance.bookingLesson(0);
        instance.setUser_name("William@123");
        instance.setBooking_no("Booking_WIL_01");
        instance.bookingLesson(0);
        instance.learnerRegister(new User());
        instance.saveRole();
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    
   

    /**
     * Test of getRoleIdByName method, of class SwimmingSchool.
     */
    @Test
    public void testGetRoleIdByName() {
        System.out.println("getRoleIdByName");
        boolean exp_result = false;
        String role_name = "Learner";
        int result = instance.getRoleIdByName(role_name);
        List<Role> role1=instance.getRole();
        for(Role role : role1)
        {
            if(role.getRole_id()==result)
            {
               exp_result=true;
            }
           
        }
        System.out.println(exp_result);
    }
    
 

    /**
     * Test of learnerRegister method, of class SwimmingSchool.
     */
    @Test
    public void testLearnerRegister() {
        System.out.println("learnerRegister");
        int role_id = instance.getRoleIdByName("Learner");
        String full_name = "Mathew Dissuza";
        String user_name = "Mathew@123";
        String email = "mathew@gmail.com";
        String contact = "9876543210";
        String gender = "Male";
        String grade = "1";
        String age = "9";
        String password = "123456";
        boolean isUserNameExist = new SwimmingSchoolTest().learnerNameExist(user_name);
        if (!(full_name.isEmpty() || user_name.isBlank() || email.isEmpty() || contact.isEmpty() || gender.isEmpty() || age.isEmpty() || grade.isEmpty() || password.isEmpty())) {
            if (isUserNameExist) {
                System.out.println("User already exist");
            } else if (!email.matches("^(.+)@(\\S+)$")) {
                System.out.println("Please enter valid email");
            } else if (!contact.matches("\\d+")) {
                System.out.println("Please enter valid contact");
            } else if (!age.matches("\\d+")) {
                System.out.println("Please enter valid age");
            } else if (!grade.matches("[0-5]")) {
                System.out.println("Please enter valid grade");
            } else if (age.matches("\\d+")) {
                int valid_age = Integer.parseInt(age);
                if (!(valid_age >= 4 && valid_age <= 11)) {
                    System.out.println("Age should be 4 to 7 years");
                } else {
                    User learner = new User(0, role_id, full_name, user_name, email, contact, age, gender, grade, password);
                    SwimmingSchool instance = new SwimmingSchool();
                    boolean result = instance.learnerRegister(learner);
                    assertTrue(result);
                    System.out.println("Registration Successfully");

                }
            }
        } else {

        }
    }

    /**
     * Test of getLearners method, of class SwimmingSchool.
     */
    @Test
    public void testGetLearners() {
        System.out.println("getLearners");
        List<User> result = instance.getLearners();
        System.out.println("user_id | Full Name | User Name | Email | Contact | Age | Grade | Gender | Password");
        for (User learner : result) {
            System.out.print(learner.getFull_name().substring(0, 3).toUpperCase() + "_000" + learner.getUser_id() + " | ");
            System.out.print(learner.getFull_name() + " | ");
            System.out.print(learner.getUser_name() + " | ");
            System.out.print(learner.getUser_email() + " | ");
            System.out.print(learner.getUser_contact() + " | ");
            System.out.print(learner.getUser_age() + " | ");
            System.out.print(learner.getUser_grade() + " | ");
            System.out.print(learner.getUser_gender() + " | ");
            System.out.print(learner.getUser_password() + " | ");
            System.out.println();
        }

    }

    /**
     * Test of getCoaches method, of class SwimmingSchool.
     */
    @Test
    public void testGetCoaches() {
        System.out.println("getCoaches");
        List<User> result = instance.getCoaches();
        System.out.println("Coach id | Full Name | Email | Contact | Age | Gender |");
        for (User learner : result) {
            System.out.print(learner.getFull_name().substring(0, 3).toUpperCase() + "_000" + learner.getUser_id() + " | ");
            System.out.print(learner.getFull_name() + " | ");
            System.out.print(learner.getUser_email() + " | ");
            System.out.print(learner.getUser_contact() + " | ");
            System.out.print(learner.getUser_age() + " | ");
            System.out.print(learner.getUser_gender() + " | ");
            System.out.println();
        }
    }

    /**
     * Test of userLogin method, of class SwimmingSchool.
     */
    @Test
    public void testUserLogin() {
        System.out.println("userLogin");
        user_name = "William@123";
        String password = "12343";
        int role_id = 1;
        boolean result = instance.userLogin(user_name, password, role_id);
        if (result) {
            System.out.println("Login successful");
        } else {
            System.out.println("Login failed");
        }
    }

    /**
     * Test of getLessons method, of class SwimmingSchool.
     */
    @Test
    public void testGetLessons() {
        System.out.println("getLessons");
        List<Lesson> result = instance.getLessons();
        System.out.println("Class Code | Name | Date | Day | Time | Grade | Coach | Number of Seats | Amount |");
        for (Lesson lesson : result) {
            System.out.print(lesson.getClass_code());
            System.out.print(" | " + lesson.getName());
            System.out.print(" | " + lesson.getDate());
            System.out.print(" | " + lesson.getDay());
            System.out.print(" | " + lesson.getTime());
            System.out.print(" | " + lesson.getGrade());
            System.out.print(" | " + lesson.getCoach());
            System.out.print(" | " + lesson.getNo_of_seat());
            System.out.print(" | " + lesson.getAmount());
            System.out.println();
        }
    }

    /**
     * Test of getLessonDetails method, of class SwimmingSchool.
     */
    @Test
    public void testGetLessonDetails() {
        System.out.println("getLessonDetails");
        class_code = 1;
        boolean valid_class = new SwimmingSchoolTest().validClass_code(class_code);
        if (valid_class) {
            Lesson lesson = instance.getLessonDetails(class_code);
            System.out.println("Class Code: " + lesson.getClass_code());
            System.out.println("Name: " + lesson.getName());
            System.out.println("Date: " + lesson.getDate());
            System.out.println("Day: " + lesson.getDay());
            System.out.println("Time: " + lesson.getTime());
            System.out.println("Grade: " + lesson.getGrade());
            System.out.println("Coach: " + lesson.getCoach());
            System.out.println("Number of Seats: " + lesson.getNo_of_seat());
            System.out.println("Amount: " + lesson.getAmount());
            System.out.println(); 
        } else {
            System.out.println("class not valid");
        }

    }

    /**
     * Test of bookingLesson method, of class SwimmingSchool.
     */
    @Test
    public void testBookingLesson() {
        System.out.println("bookingLesson");
        class_code = 1;
        user_name = "William@123";
        boolean valid_class = new SwimmingSchoolTest().validClass_code(class_code);
        if (valid_class) {
            boolean preBookedClass = new SwimmingSchoolTest().classAlreadyBooked(String.valueOf(class_code), user_name);
            if (!preBookedClass) {
                boolean result = instance.bookingLesson(class_code);
                if (result) {
                    System.out.println("Booking Successfully");
                } else {
                    System.out.println("Booking unsuccessed");
                }

            } else {
                System.out.println("Class already booked");
            }

        } else {
            System.out.println("Class not valid");
        }

    }

    /**
     * Test of getBookings method, of class SwimmingSchool.
     */
    @Test
    public void testGetBookings() {
        System.out.println("getBookings");
        List<List<String>> result = instance.getBookings();
        System.out.println("Booking id | Lesson Name | UserName | Coach | Date | Time | Grade | Status |");
        for (List<String> booking : result) {
            System.out.print(booking.get(0));
            System.out.print(" | " + booking.get(2));
            System.out.print(" | " + booking.get(1));
            System.out.print(" | " + booking.get(7));
            System.out.print(" | " + booking.get(4));
            System.out.print(" | " + booking.get(5));
            System.out.print(" | " + booking.get(6));
            System.out.print(" | " + booking.get(8));
            System.out.print("");
        }

    }

    /**
     * Test of cancelBookings method, of class SwimmingSchool.
     */
    @Test
    public void testCancelBookings() {
        System.out.println("cancelBookings");
        instance.cancelBookings();
        boolean validBookingNo = new SwimmingSchoolTest().validBookingNo("1");
        if (validBookingNo) {
            List<List<String>> bookings = instance.getBookings();
            for (List<String> booking : bookings) {
                if (booking.get(0).equals("1") && booking.get(8).equals("Cancel")) {
                    System.out.println("Class cancel");

                } else {
                    System.out.println("Class not cancel");
                }
            }
        } else {
            System.out.println("Booking no not valid");
        }

    }

    /**
     * Test of changeBookings method, of class SwimmingSchool.
     */
    @Test
    public void testChangeBookings() {
        System.out.println("changeBookings");
        class_code = 2;
        user_name = "William@123";
        boolean valid_class = new SwimmingSchoolTest().validClass_code(class_code);
        boolean preBookedClass = new SwimmingSchoolTest().classAlreadyBooked(String.valueOf(class_code), user_name);
        if (valid_class) {
            if (!preBookedClass) {
                instance.changeBookings(class_code);
                List<List<String>> bookings = instance.getBookings();
                for (List<String> booking : bookings) {
                    if (booking.get(0).equals("1")) {
                        if (booking.get(2).equals(String.valueOf(class_code))) {
                            System.out.println("Class changed");
                        } else {
                            System.out.println("class not change");
                        }
                    } else {
                        System.out.println("Not valid class");
                    }
                }

            } else {
                System.out.println("class alredy booked");
            }

        } else {
            System.out.println("Not valid class");
        }
    }

    /**
     * Test of seatUpdate method, of class SwimmingSchool.
     */
    @Test
    public void testSeatUpdate() {
        System.out.println("seatUpdate");
        String status = "Booked";
        class_code = 1;
        Lesson lesson = instance.getLessonDetails(class_code);
        String current_seat = lesson.getNo_of_seat();
        int exp_result = Integer.parseInt(current_seat) - 1;
        boolean valid_class = new SwimmingSchoolTest().validClass_code(class_code);
        if (valid_class) {
            instance.seatUpdate(status, class_code);
            String result = lesson.getNo_of_seat();
            if (result.equalsIgnoreCase(String.valueOf(exp_result))) {
                System.out.println("Seat updated");
            } else {
                System.out.println("Seat not updated");
            }
        } else {
            System.out.println("Not valid class");
        }
    }

    /**
     * Test of attendClass method, of class SwimmingSchool.
     */
    @Test
    public void testAttendClass() {
        System.out.println("attendClass");
        class_code = 1;
        String rating1 = "5";
        String review = "best class";
        booking_no = "Booking_WIL_01";
        user_name = "William@123";
        boolean valid_class = new SwimmingSchoolTest().validClass_code(class_code);
        boolean validBookingNo = new SwimmingSchoolTest().validBookingNo("1");
        boolean preBookedClass = new SwimmingSchoolTest().classAlreadyBooked(String.valueOf(class_code), user_name);
        if (validBookingNo) {
            if (valid_class) {
                if (preBookedClass) {
                    instance.setBooking_no(booking_no);
                    instance.attendClass(class_code, rating1, review);
                    List<List<String>> bookings = instance.getBookings();
                    for (List<String> booking : bookings) {
                        if (booking.get(0).equals("1") && booking.get(8).equalsIgnoreCase("Attend")) {
                            System.out.println("Class attended");
                        } else {
                            System.out.println("class not attended");
                        }
                    }

                } else {
                    System.out.println("Class not booked");
                }
            } else {
                System.out.println("class not valid");
            }

        } else {
            System.out.println("Booking no not valid");
        }
    }

    /**
     * Test of getRatings method, of class SwimmingSchool.
     */
    @Test
    public void testGetRatings() {
        System.out.println("getRatings");
        List<List<String>> result = instance.getRatings();
        System.out.println("Booking No | Lesson | Username | Coach | Date | Time | Ratings | Review ");
        for (List<String> rating : result) {
            System.out.print(rating.get(0));
            System.out.print(" | " + rating.get(1));
            System.out.print(" | " + rating.get(2));
            System.out.print(" | " + rating.get(3));
            System.out.print(" | " + rating.get(4));
            System.out.print(" | " + rating.get(5));
            System.out.print(" | " + rating.get(6));
            System.out.print(" | " + rating.get(7));
            System.out.print("");
        }

    }

    /**
     * Test of coachAverageRatings method, of class SwimmingSchool.
     */
    @Test
    public void testCoachAverageRatings() {
        System.out.println("coachAverageRatings");
        instance.bookingLesson(0);
        Map<String, Map<String, Double>> result = instance.coachAverageRatings();
        result.forEach((class_code, coachRatings) -> {
            coachRatings.forEach((coach, averageRating) -> {
                System.out.println("Coach " + coach);
                System.out.println("Class code : " + class_code);
                System.out.println("Average rating " + averageRating);

            });
        });
        if(result.isEmpty())
        {
            System.out.println("No ratings details");
        }
    }

    /**
     * Test of learnerBookings method, of class SwimmingSchool.
     */
    @Test
    public void testLearnerBookings() {
        System.out.println("learnerBookings");
        Map<String, Map<String, Long>> result = instance.learnerBookings();
        //get booking status by for each loop
        result.forEach((u_name, statusCounts) -> {
            long booked = statusCounts.getOrDefault("Booked", 0L);
            long attend = statusCounts.getOrDefault("Attend", 0L);
            long changed = statusCounts.getOrDefault("Cancel", 0L);
            long cancel = statusCounts.getOrDefault("Cancel", 0L);
            long total_book = booked + changed + attend;
            System.out.println("User : " + u_name);
            System.out.println("Total book : " + total_book);
            System.out.println("Total Attend : " + attend);
            System.out.println("Total Cancel : " + cancel);
        });

    }

    /**
     * Test of classBookingStatus method, of class SwimmingSchool.
     */
    @Test
    public void testClassBookingStatus() {
        System.out.println("classBookingStatus");
        int class_code = 1;
        SwimmingSchool instance = new SwimmingSchool();
        boolean valid_class = new SwimmingSchoolTest().validClass_code(class_code);
        boolean result = instance.classBookingStatus(String.valueOf(class_code));
        if (valid_class) {
            if (result) {
                System.out.println("Class already booked");
            } else {
                System.out.println("Class not booked");
            }
        } else {
            System.out.println("Class not valid");
        }

    }

    /**
     * Test of updateStudenLevel method, of class SwimmingSchool.
     */
    @Test
    public void testUpdateStudenLevel() {
        System.out.println("updateStudenLevel");
        String level = "1";
        SwimmingSchool instance = new SwimmingSchool();
        instance.updateStudenLevel(level);
        System.out.println("learner grade updated successfully");
    }

    //check learner name pre registered
    public boolean learnerNameExist(String name) {
        List<User> learner_details = instance.getLearners();
        for (User learner : learner_details) {
            if (learner.getUser_name().equalsIgnoreCase(name)) {
                return true;
            }
        }
        return false;
    }

    //check valide class code
    public boolean validClass_code(int class_code) {
        List<Lesson> lessons = instance.getLessons();
        for (Lesson lesson : lessons) {
            if (lesson.getClass_code() == class_code) {
                return true;
            }
        }
        return false;
    }

    //chech user not booking this class
    public boolean classAlreadyBooked(String class_code, String user_name) {
        instance.bookingLesson(0);
        instance.setUser_name(user_name);
        List<List<String>> bookings = instance.getBookings();
        for (List<String> booking : bookings) {
            if ((booking.get(1).equalsIgnoreCase(user_name) && booking.get(2).equalsIgnoreCase(class_code)) && !booking.get(8).equalsIgnoreCase("Cancel")) {
                return true;
            }
        }
        return false;
    }

    //check valid booking no
    public boolean validBookingNo(String booking_no) {
        List<List<String>> bookings = instance.getBookings();
        for (List<String> booking : bookings) {
            if (booking.get(0).equals(booking_no)) {
                return true;
            }
        }

        return true;
    }

}
