package tr.edu.gtu.mustafa.akilli.System;

/**
 * HW01_131044017_Mustafa_Akilli
 *
 * File:   CourseAutomationSystem.java
 *
 * Description:
 *
 * CourseAutomationSystem extends AbstractSystem
 *
 * @author Mustafa_Akilli
 * @since Tuesday 23 February 2016, 20:52 by Mustafa_Akilli
 */
public class CourseAutomationSystem extends AbstractSystem{
    /**
     * AbstractSystem two parameters constructor
     * Make a new admin.
     * Set CurrentCoursesArrayList, OldCoursesArrayList, TeachersArrayList and StudentsArrayList.
     *
     * @param newAdminUsername new Admin Username
     * @param newAdminPassword new Admin Password
     */
    public CourseAutomationSystem(String newAdminUsername, String newAdminPassword) {
        super(newAdminUsername, newAdminPassword);
    }
}
