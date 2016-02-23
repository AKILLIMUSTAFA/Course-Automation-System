package tr.edu.gtu.mustafa.akilli.System;

import tr.edu.gtu.mustafa.akilli.User.Administrator;
import tr.edu.gtu.mustafa.akilli.User.Student;
import tr.edu.gtu.mustafa.akilli.User.Teacher;

import java.util.ArrayList;

/**
 * HW01_131044017_Mustafa_Akilli
 *
 * File:   AbstractSystem.java
 *
 * Description:
 *
 * AbstractSystem implements System interface
 *
 * @author Mustafa_Akilli
 * @since Tuesday 23 February 2016, 20:49 by Mustafa_Akilli
 */
public abstract class AbstractSystem implements System{

    private Administrator admin;/*Admin of the system*/
    private ArrayList<CourseClass> currentCoursesArrayList;/*Current Courses ArrayList*/
    private ArrayList<CourseClass> oldCoursesArrayList;/*Old Courses ArrayList*/
    private ArrayList<Teacher> teachersArrayList;/*Teachers ArrayList*/
    private ArrayList<Student> studentsArrayList;/*Students ArrayList*/

    /**
     * AbstractSystem two parameters constructor
     * Make a new admin.
     * Set CurrentCoursesArrayList, OldCoursesArrayList, TeachersArrayList and StudentsArrayList.
     *
     * @param newAdminUsername new Admin Username
     * @param newAdminPassword new Admin Password
     */
    public AbstractSystem(String newAdminUsername, String newAdminPassword){

        admin = new Administrator(newAdminUsername, newAdminPassword);
        setCurrentCoursesArrayList();
        setOldCoursesArrayList();
        setTeachersArrayList();
        setStudentsArrayList();
    }

    /**
     * Get Administrator
     *
     * @return Admin of the System
     */
    public Administrator getAdministrator() {return admin;}

    /**
     * Set CurrentCourses ArrayList.
     * İf the CurrentCourses ArrayList already set, then CurrentCourses ArrayList reset.
     */
    public void setCurrentCoursesArrayList() { currentCoursesArrayList = new ArrayList<CourseClass>();}

    /**
     * Get CurrentCourses ArrayList
     *
     * @return CurrentCourses ArrayList in the System
     */
    public ArrayList<CourseClass> getCurrentCoursesArrayList() {return currentCoursesArrayList;}

    /**
     * Only Teacher can add CurrentCourses to System.
     * Add element into CurrentCourses ArrayList.
     *
     * @param teacherUsername Teacher's Username
     * @param teacherPassword Teacher's password
     * @param newCourseName   New course's name
     */
    public void addCurrentCourse(String teacherUsername, String teacherPassword, String newCourseName) {
        int existTeacher = 0;
        int alreadyCourseNameExist = 0;

        for(int i = 0; i < getTeachersArrayList().size() ;++i)
            if(getTeachersArrayList().get(i).getUsername() == teacherUsername &&
            getTeachersArrayList().get(i).getPassword() == teacherPassword){

                existTeacher = 1;

                for(int j = 0; j < getCurrentCoursesArrayList().size() ;++j)
                    if(getCurrentCoursesArrayList().get(j).getCourseName() == newCourseName){
                        alreadyCourseNameExist = 1;
                    }

                if(alreadyCourseNameExist!=1)
                    getCurrentCoursesArrayList().add(new CourseClass(newCourseName, teacherUsername));
            }

        if(admin.getUsername() == teacherUsername && admin.getPassword() == teacherPassword){
            getCurrentCoursesArrayList().add(new CourseClass(newCourseName, teacherUsername));
            java.lang.System.out.println("Add course successful: " + newCourseName);
        }

        else{
            if(existTeacher==0)
                java.lang.System.out.println("Teacher userName or password wrong: "+ teacherUsername);

            else if(alreadyCourseNameExist ==1)
                java.lang.System.out.println("Course Name already exist: "+ newCourseName);

            else
                java.lang.System.out.println("Add course successful: " + newCourseName);}
    }

    /**
     * Only Teacher can remove CurrentCourses to System.
     * Remove element into CurrentCourses ArrayList.
     * Add element into OldCourses ArrayList.
     *
     * @param teacherUsername Teacher's Username
     * @param teacherPassword Teacher's password
     * @param courseName      The name of the course to be remove
     */
    public void removeCurrentCourse(String teacherUsername, String teacherPassword, String courseName) {
        int existCourse=0;

        for(int j = 0; j < getCurrentCoursesArrayList().size() ;++j)
            if(getCurrentCoursesArrayList().get(j).getCourseName() == courseName){
                getCurrentCoursesArrayList().remove(j);
                getOldCoursesArrayList().add(new CourseClass(courseName, teacherUsername));
                existCourse=1;
            }

        if(existCourse == 1)
            java.lang.System.out.println(courseName + " deleted.");

        else
            java.lang.System.out.println("Course not found: " + courseName);
    }

    /**
     * Set OldCourses ArrayList.
     * İf the OldCourses ArrayList already set, then OldCourses ArrayList reset.
     */
    public void setOldCoursesArrayList() { oldCoursesArrayList = new ArrayList<CourseClass>();}

    /**
     * Get OldCourses ArrayList
     *
     * @return OldCourses ArrayList in the System
     */
    public ArrayList<CourseClass> getOldCoursesArrayList() {return oldCoursesArrayList;}

    /**
     * Set Teachers ArrayList.
     * İf the Teachers ArrayList already set, then Teachers ArrayList reset.
     */
    public void setTeachersArrayList() {teachersArrayList = new ArrayList<Teacher>();}

    /**
     * Get Teachers ArrayList
     *
     * @return Teachers ArrayList in the System
     */
    public ArrayList<Teacher> getTeachersArrayList() {return teachersArrayList;}

    /**
     * Only Admin can add Teacher to System.
     * Add element into Teacher ArrayList.
     *
     * @param adminUsername Admin Username
     * @param adminPassword Admin Password
     * @param newTeacherUsername New Teacher Username
     * @param newTeacherPassword New Teacher Password
     */
    public void addTeacher(String adminUsername, String adminPassword, String newTeacherUsername, String newTeacherPassword) {
        int existCourse=0;

        for(int j = 0; j < getTeachersArrayList().size() ;++j)
            if(getTeachersArrayList().get(j).getUsername() == newTeacherUsername)
                existCourse=1;

        if(existCourse == 0){
            java.lang.System.out.println("New Teacher added: " + newTeacherUsername);
            getTeachersArrayList().add(new Teacher(newTeacherUsername, newTeacherPassword));
        }

        else {
            java.lang.System.out.println("Teacher username already exist: " + newTeacherUsername);
        }
    }

    /**
     * Set Students ArrayList.
     * İf the Students ArrayList already set, then Students ArrayList reset.
     */
    public void setStudentsArrayList() {studentsArrayList = new ArrayList<Student>();}

    /**
     * Get Students ArrayList
     *
     * @return Students ArrayList in the System
     */
    public ArrayList<Student> getStudentsArrayList() {return studentsArrayList;}

    /**
     * Students Register to System.
     * Add element into Students ArrayList.
     *
     * @param newStudentUsername newStudent's Username
     * @param newStudentPassword newStudent's Password
     */
    public void studentRegister(String newStudentUsername, String newStudentPassword){
        int existCourse=0;

        for(int j = 0; j < getStudentsArrayList().size() ;++j)
            if(getStudentsArrayList().get(j).getUsername() == newStudentUsername)
                existCourse=1;

        if(existCourse == 0){
            java.lang.System.out.println("New Student added: " + newStudentUsername);
            getStudentsArrayList().add(new Student(newStudentUsername, newStudentPassword));
        }

        else {
            java.lang.System.out.println("Student username already exist: " + newStudentUsername);
        }

    }
}
