package tr.edu.gtu.mustafa.akilli.System;

import tr.edu.gtu.mustafa.akilli.Assignment.AbstractAssignment;
import tr.edu.gtu.mustafa.akilli.Assignment.Assignment;
import tr.edu.gtu.mustafa.akilli.Course.CourseClass;
import tr.edu.gtu.mustafa.akilli.Document.AbstractDocument;
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

    private static final int ZERO = 0;
    private static final int ONE = 1;
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
    protected ArrayList<CourseClass> getCurrentCoursesArrayList() {return currentCoursesArrayList;}

    /**
     * Get Current Course for Teacher
     *
     * @param teacherUsername Teacher's Username
     * @param teacherPassword Teacher's Password
     * @param courseName      Course's Name
     * @return Current Course
     */
    public abstract CourseClass getCurrentCourseforTeacher(String teacherUsername, String teacherPassword, String courseName);

    /**
     * Get Current Course for Tutor
     *
     * @param tutorUsername Tutor's Username
     * @param tutorPassword Tutor's Password
     * @param courseName    Course's Name
     * @return Current Course
     */
    public abstract CourseClass getCurrentCourseforTutor(String tutorUsername, String tutorPassword, String courseName);

    /**
     * Only Teacher can add CurrentCourses to System.
     * Add element into CurrentCourses ArrayList.
     *
     * @param adminUsername Admin's Username
     * @param adminPassword Admin's password
     * @param newteacherUsername Course Teacher Username
     * @param newCourseName New course's name
     */
    public void addCurrentCourse(String adminUsername, String adminPassword, String newteacherUsername, String newCourseName) {

        int courseNameAlreadyExist = ZERO;

        for(int j = 0; j < getCurrentCoursesArrayList().size() ;++j)
            if(getCurrentCoursesArrayList().get(j).getCourseName().equals(newCourseName))
                courseNameAlreadyExist = ONE;

        if(courseNameAlreadyExist == ZERO){

            if(admin.getUsername().equals(adminUsername) && admin.getPassword().equals(adminPassword)){
                getCurrentCoursesArrayList().add(new CourseClass(newCourseName, newteacherUsername));
                java.lang.System.out.println("Add course successful: " + newCourseName);
            }
            else
                java.lang.System.out.println("Admin userName or Password is invalid: ");

        }
        else
            java.lang.System.out.println("Course Name already exist: "+ newCourseName);

    }

    /**
     * Only Teacher can remove CurrentCourses to System.
     * Remove element into CurrentCourses ArrayList.
     * Add element into OldCourses ArrayList.
     *
     * @param adminUsername Admin's Username
     * @param adminPassword Admin's password
     * @param teacherUsername Course Teacher Username
     * @param courseName    The name of the course to be remove
     */
    public void removeCurrentCourse(String adminUsername, String adminPassword, String teacherUsername, String courseName) {
        int courseNameExist = ZERO;

        if(admin.getUsername().equals(adminUsername) && admin.getPassword().equals(adminPassword)) {
            for (int j = 0; j < getCurrentCoursesArrayList().size(); ++j)
                if (getCurrentCoursesArrayList().get(j).getCourseName().equals(courseName)){
                    getCurrentCoursesArrayList().remove(j);
                    getOldCoursesArrayList().add(new CourseClass(courseName, teacherUsername));
                    java.lang.System.out.println("Remove course successful: " + courseName);
                    courseNameExist = ONE;
                }

            if(courseNameExist == ZERO)
                java.lang.System.out.println("Course Name not exist: "+ courseName);
        }
        else
            java.lang.System.out.println("Admin userName or Password is invalid: ");

    }

    /**
     * Only Teacher can add Student into Course.
     *
     * @param teacherUsername Teacher Username
     * @param teacherPassword Teacher Password
     * @param courseName      Course Name
     * @param studentUsername will add into course
     */
    public abstract void addStudentIntoCourse(String teacherUsername, String teacherPassword, String courseName, String studentUsername);

    /**
     * Only Teacher can remove Student into Course.
     *
     * @param teacherUsername Teacher Username
     * @param teacherPassword Teacher Password
     * @param courseName      Course Name
     * @param studentUsername will remove into course
     */
    public abstract void removeStudentIntoCourse(String teacherUsername, String teacherPassword, String courseName, String studentUsername);

    /**
     * Add Tutor Into Course
     *
     * @param teacherUsername Teacher Username
     * @param teacherPassword Teacher Password
     * @param courseName      Course Name
     * @param tutorUsername   will add into course
     */
    public abstract void addTutorIntoCourse(String teacherUsername, String teacherPassword, String courseName, String tutorUsername);

    /**
     * Remove Tutor Into Course
     *
     * @param teacherUsername Teacher Username
     * @param teacherPassword Teacher Password
     * @param courseName      Course Name
     * @param tutorUsername   will remove into course
     */
    public abstract void removeTutorIntoCourse(String teacherUsername, String teacherPassword, String courseName, String tutorUsername);

    /**
     * Add Document Into Course
     *
     * @param teacherUsername Teacher's Username
     * @param teacherPassword Teacher's Password
     * @param courseName      Course's Name
     * @param newDocument     (AbstractDocument)new Document like Book, File, Slide, Url, Whiteboard description.
     */
    public abstract void addDocumentIntoCourse(String teacherUsername, String teacherPassword, String courseName, AbstractDocument newDocument);

    /**
     * Remove Document Into Course
     *
     * @param teacherUsername Teacher's Username
     * @param teacherPassword Teacher's Password
     * @param courseName      Course's Name
     * @param newDocument     (AbstractDocument)new Document like Book, File, Slide, Url, Whiteboard description.
     */
    public abstract void removeDocumentIntoCourse(String teacherUsername, String teacherPassword, String courseName, AbstractDocument newDocument);

    /**
     * Add Assignment Into Course
     *
     * @param teacherUsername Teacher's Username
     * @param teacherPassword Teacher's Password
     * @param courseName      Course's Name
     * @param newAssignment   (AbstractAssignment) newAssignment like Quiz, Homework, Group Project.
     */
    public abstract void addAssignmentIntoCourse(String teacherUsername, String teacherPassword, String courseName, AbstractAssignment newAssignment);

    /**
     * Set OldCourses ArrayList.
     * İf the OldCourses ArrayList already set, then OldCourses ArrayList reset.
     */
    public void setOldCoursesArrayList() { oldCoursesArrayList = new ArrayList<CourseClass>();}

    /**
     * Get OldCourses ArrayList
     *
     * @return OldCourses ArrayList
     */
    protected ArrayList<CourseClass> getOldCoursesArrayList(){return oldCoursesArrayList;}

    /**
     * Print OldCourses ArrayList for Teacher
     *
     * @param teacherUsername Teacher Username
     * @param teacherPassword Teacher Password
     */
    public abstract void printOldCoursesArrayListforTeacher(String teacherUsername, String teacherPassword);

    /**
     * Print OldCourse for Tutor
     *
     * @param tutorUsername Tutor's Username
     * @param tutorPassword Tutor's Password
     */
    public abstract void printOldCourseforTutor(String tutorUsername, String tutorPassword) ;

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

        if(admin.getUsername().equals(adminUsername) && admin.getPassword().equals(adminPassword)) {
            for (int j = 0; j < getTeachersArrayList().size(); ++j)
                if (getTeachersArrayList().get(j).getUsername().equals(newTeacherUsername))
                    existCourse = 1;

            if (existCourse == 0) {
                java.lang.System.out.println("New Teacher added: " + newTeacherUsername);
                getTeachersArrayList().add(new Teacher(newTeacherUsername, newTeacherPassword));
            } else {
                java.lang.System.out.println("Teacher username already exist: " + newTeacherUsername);
            }
        }
        else{
            java.lang.System.out.println("Admin username or password is invalid");
        }
    }

    /**
     * Only Admin can remove Teacher to System.
     * Remove element into Teacher ArrayList.
     *
     * @param adminUsername   Admin Username
     * @param adminPassword   Admin Password
     * @param teacherUsername Teacher's Username
     */
    public void removeTeacher(String adminUsername, String adminPassword, String teacherUsername){

        int existCourse=ZERO;

        if(admin.getUsername().equals(adminUsername) && admin.getPassword().equals(adminPassword)) {
            for (int index = 0; index < getTeachersArrayList().size(); ++index)
                if (getTeachersArrayList().get(index).getUsername().equals(teacherUsername)){
                    existCourse = ONE;
                    java.lang.System.out.println("Teacher remove: " + teacherUsername);
                    getTeachersArrayList().remove(index);
                }

            if (existCourse == ZERO)
                java.lang.System.out.println("Teacher username not exist: " + teacherUsername);

        }
        else{
            java.lang.System.out.println("Admin username or password is invalid");
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
            if(getStudentsArrayList().get(j).getUsername().equals(newStudentUsername))
                existCourse=1;

        if(existCourse == 0){
            java.lang.System.out.println("New Student added: " + newStudentUsername);
            getStudentsArrayList().add(new Student(newStudentUsername, newStudentPassword));
        }

        else {
            java.lang.System.out.println("Student username already exist: " + newStudentUsername);
        }

    }

    /**
     * Student Upload Assignment
     *
     * @param newAssignment  New Student Assignment
     */
    public void studentUploadAssignment(Assignment newAssignment){;}

    /**
     * Student Grades in the Course
     *
     * @param studentUsername Student's Username
     * @param studentPassword Student's Password
     * @param courseName      Course Name
     */
    public abstract void studentGrade(String studentUsername, String studentPassword, String courseName);

    /**
     * Student Lecture Notes in the Course
     *
     * @param studentUsername Student's Username
     * @param studentPassword Student's Password
     * @param courseName      Course Name
     */
    public abstract void studentLectureNote(String studentUsername, String studentPassword, String courseName);
}
