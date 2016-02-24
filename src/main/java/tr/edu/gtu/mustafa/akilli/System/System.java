package tr.edu.gtu.mustafa.akilli.System;

import tr.edu.gtu.mustafa.akilli.Course.CourseClass;
import tr.edu.gtu.mustafa.akilli.User.Administrator;
import tr.edu.gtu.mustafa.akilli.User.Student;
import tr.edu.gtu.mustafa.akilli.User.Teacher;
import tr.edu.gtu.mustafa.akilli.User.User;
import java.util.ArrayList;

/**
 * HW01_131044017_Mustafa_Akilli
 *
 * File:   System Interface
 *
 * Description:
 *
 * System have users.
 *
 * @author Mustafa_Akilli
 * @since Sunday 22 February 2016, 20:46 by Mustafa_Akilli
 */
public interface System {

    /**
     * Get Administrator
     *
     * @return Admin of the System
     */
    Administrator getAdministrator();

    /**
     * Set CurrentCourses ArrayList.
     * İf the CurrentCourses ArrayList already set, then CurrentCourses ArrayList reset.
     */
    void setCurrentCoursesArrayList();

    /**
     * Get CurrentCourses ArrayList
     *
     * @return CurrentCourses ArrayList in the System
     */
    ArrayList<CourseClass> getCurrentCoursesArrayList();

    /**
     *
     * Only Teacher can add CurrentCourses to System.
     * Add element into CurrentCourses ArrayList.
     *
     * @param teacherUsername Teacher's Username
     * @param teacherPassword Teacher's password
     * @param newCourseName New course's name
     */
    void addCurrentCourse(String teacherUsername, String teacherPassword,
                    String newCourseName);

    /**
     * Only Teacher can remove CurrentCourses to System.
     * Remove element into CurrentCourses ArrayList.
     * Add element into OldCourses ArrayList.
     *
     * @param teacherUsername Teacher's Username
     * @param teacherPassword Teacher's password
     * @param courseName The name of the course to be remove
     */
    void removeCurrentCourse(String teacherUsername, String teacherPassword,
                           String courseName);

    /**
     * Set OldCourses ArrayList.
     * İf the OldCourses ArrayList already set, then OldCourses ArrayList reset.
     */
    void setOldCoursesArrayList();

    /**
     * Get OldCourses ArrayList
     *
     * @return OldCourses ArrayList in the System
     */
    ArrayList<CourseClass> getOldCoursesArrayList();

    /**
     * Set Teachers ArrayList.
     * İf the Teachers ArrayList already set, then Teachers ArrayList reset.
     */
    void setTeachersArrayList();

    /**
     * Get Teachers ArrayList
     *
     * @return Teachers ArrayList in the System
     */
    ArrayList<Teacher> getTeachersArrayList();

    /**
     * Only Admin can add Teacher to System.
     * Add element into Teacher ArrayList.
     *
     * @param adminUsername Admin Username
     * @param adminPassword Admin Password
     * @param newTeacherUsername New Teacher Username
     * @param newTeacherPassword New Teacher Password
     */
    void addTeacher(String adminUsername, String adminPassword,
            String newTeacherUsername, String newTeacherPassword);

    /**
     * Set Students ArrayList.
     * İf the Students ArrayList already set, then Students ArrayList reset.
     */
    void setStudentsArrayList();

    /**
     * Get Students ArrayList
     *
     * @return Students ArrayList in the System
     */
    ArrayList<Student> getStudentsArrayList();

    /**
     * Students Register to System.
     * Add element into Students ArrayList.
     *
     * @param newStudentUsername newStudent's Username
     * @param newStudentPassword newStudent's Password
     */
    void studentRegister(String newStudentUsername, String newStudentPassword);

}//end interface System
