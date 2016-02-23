package tr.edu.gtu.mustafa.akilli.User;

/**
 * HW01_131044017_Mustafa_Akilli
 *
 * File:   Teacher.java
 *
 * Description:
 *
 *Teachers can manage courses:
 *      adding students
 *      removing students,
 *      adding tutors,
 *      removing tutors,
 *      adding documents,
 *      removing documents.
 *Teachers can give assignments.
 *Teachers can manage multiple course in a course term.
 *Teachers can view older courses but cannot make any changes.
 *
 * @author Mustafa_Akilli
 * @since Tuesday 23 February 2016, 22:41 by Mustafa_Akilli
 */
public class Teacher extends AbstractUser {
    /**
     * AbstractUser two parameters constructor
     * Make a new User.
     * Set Username and Password.
     *
     * @param newUsername new Username
     * @param newPassword new Password
     */
    public Teacher(String newUsername, String newPassword) {
        super(newUsername, newPassword);
    }
}
