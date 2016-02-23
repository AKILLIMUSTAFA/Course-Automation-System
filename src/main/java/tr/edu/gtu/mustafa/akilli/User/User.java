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
 * Users must have a username and a password.
 * Users can login into system.
 *
 *
 * @author Mustafa_Akilli
 * @since Sunday 22 February 2016, 18:41 by Mustafa_Akilli
 */
public interface User {

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

}//end interface User
