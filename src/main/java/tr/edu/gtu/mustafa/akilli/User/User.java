package tr.edu.gtu.mustafa.akilli.User;

import tr.edu.gtu.mustafa.akilli.Course.Course;

import java.util.ArrayList;

/**
 * HW01_131044017_Mustafa_Akilli
 *
 * File:   User Interface
 *
 * Description:
 *
 * Users like administrators,teachers,tutors and students.
 * Users must have username and password.
 * Users can login into system.
 *
 *
 * @author Mustafa_Akilli
 * @since Sunday 22 February 2016, 18:41 by Mustafa_Akilli
 */
public interface User {

    /**
     * Set Course Automation System
     *
     * @param newCourse new Course Automation System
     */
    void setCourseAutomationSystem(Course newCourse);

    /**
     * Get Course Automation System
     *
     * @return Course Automation System
     */
    Course getCourseAutomationSystem();

    /**
     * Set User's new username
     *
     * @param newUsername User's new username
     */
    void setUsername(String newUsername);

    /**
     * Get Username
     *
     * @return User's username
     */
    String getUsername();

    /**
     * Set new Password
     *
     * @param newPassword User's new Password
     */
    void setPassword(String newPassword);

    /**
     * Get User's Password
     *
     * @return User's Password
     */
    String getPassword();

    /**
     * Login into Course Automation System.
     * User can not do anything until login.
     */
    void loginIntoSystem();

    /**
     * Logout into Course Automation System.
     */
    void logoutIntoSystem();

    /**
     * Set Courses ArrayList.
     * İf the Courses ArrayList already set, then Courses ArrayList reset.
     */
    void setCoursesArrayList();

    /**
     * Get Courses ArrayList
     *
     * @return Courses ArrayList in the System
     */
    ArrayList<Course> getCoursesArrayList();

    /**
     * Set Old Courses ArrayList.
     * İf the Old Courses ArrayList already set, then Old Courses ArrayList reset.
     */
    void setOldCoursesArrayList();

    /**
     * Get Old Courses ArrayList
     *
     * @return Old Courses ArrayList in the System
     */
    ArrayList<Course> getOldCoursesArrayList();

}//end interface User
