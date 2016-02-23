package tr.edu.gtu.mustafa.akilli.User;

/**
 * HW01_131044017_Mustafa_Akilli
 *
 * File:   Administrator.java
 *
 * Description:
 *
 * Administrator extends AbstractUser
 * Administratorscan manage the system:
 *      adding users,
 *      removing users,
 *      adding courses,
 *      removing courses.
 *
 * @author Mustafa_Akilli
 * @since Tuesday 23 February 2016, 22:33 by Mustafa_Akilli
 */
public class Administrator extends AbstractUser{

    /**
     * AbstractUser two parameters constructor
     * Make a new User.
     * Set Username and Password.
     *
     * @param newUsername new Username
     * @param newPassword new Password
     */
    public Administrator(String newUsername, String newPassword) {
        super(newUsername, newPassword);
    }
}
