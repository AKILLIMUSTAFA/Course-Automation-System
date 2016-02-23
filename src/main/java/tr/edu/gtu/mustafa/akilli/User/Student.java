package tr.edu.gtu.mustafa.akilli.User;

import tr.edu.gtu.mustafa.akilli.System.AbstractSystem;

import java.util.ArrayList;

/**
 * HW01_131044017_Mustafa_Akilli
 *
 * File:   Student.java
 *
 * Description:
 *
 * Tutors can view older courses but cannot make any changes.
 * Tutors only can view their course materials and assignments.
 * Tutors can be a student in a different course.
 *
 * Students can Register into system.
 * Students can upload assignments.
 * Students can view grades and lecture notes.
 *
 * @author Mustafa_Akilli
 * @since Tuesday 23 February 2016, 22:46 by Mustafa_Akilli
 */
public class Student extends AbstractUser{

    private ArrayList<String> tutorCoursesNameArrayList;/*Student can be tutor that courses*/

    /**
     * AbstractUser two parameters constructor
     * Make a new User.
     * Set Username and Password.
     *
     * @param newUsername new Username
     * @param newPassword new Password
     */
    public Student(String newUsername, String newPassword) {
        super(newUsername, newPassword);
    }

    /**
     * Set TutorCoursesName ArrayList
     * İf the TutorCoursesName ArrayList already set, then TutorCoursesName ArrayList reset.
     */
    public void setTutorCoursesNameArrayList(){tutorCoursesNameArrayList = new ArrayList<String>();}

    /**
     * Get TutorCoursesName ArrayList
     *
     * @return Tutor Courses Name Array List
     */
    public ArrayList<String> getTutorCoursesNameArrayList(){return tutorCoursesNameArrayList;}

    /**
     * Add Element Tutor Courses Name ArrayList
     *
     * @param newTutorCoursesName New Tutor Courses Name
     */
    public void addElementTutorCoursesNameArrayList(String newTutorCoursesName){

        int existCourse=0;

        for(int j = 0; j < getTutorCoursesNameArrayList().size() ;++j)
            if(getTutorCoursesNameArrayList().get(j) == newTutorCoursesName)
                existCourse=1;

        if(existCourse==1){
            getTutorCoursesNameArrayList().add(newTutorCoursesName);
            java.lang.System.out.println("Added new Tutor Courses Name: " + newTutorCoursesName + "for tutor: " + getUsername());
        }
        else
            java.lang.System.out.println("Student already tutor that course: " + newTutorCoursesName);

    }
}
