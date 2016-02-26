package tr.edu.gtu.mustafa.akilli.System;

import tr.edu.gtu.mustafa.akilli.Assignment.AbstractAssignment;
import tr.edu.gtu.mustafa.akilli.Assignment.Assignment;
import tr.edu.gtu.mustafa.akilli.Course.CourseClass;
import tr.edu.gtu.mustafa.akilli.Document.AbstractDocument;
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
     * Get Current Course for Teacher
     *
     * @param teacherUsername Teacher's Username
     * @param teacherPassword Teacher's Password
     * @param courseName      Course's Name
     * @return Current Course
     */
    CourseClass getCurrentCourseforTeacher(String teacherUsername, String teacherPassword, String courseName);

    /**
     * Get Current Course for Tutor
     *
     * @param tutorUsername Tutor's Username
     * @param tutorPassword Tutor's Password
     * @param courseName    Course's Name
     * @return Current Course
     */
    CourseClass getCurrentCourseforTutor(String tutorUsername, String tutorPassword, String courseName);

    /**
     *
     * Only Admin can add CurrentCourses to System.
     * Add element into CurrentCourses ArrayList.
     *
     * @param adminUsername Admin's Username
     * @param adminPassword Admin's password
     * @param newteacherUsername Course Teacher Username
     * @param newCourseName New course's name
     */
    void addCurrentCourse(String adminUsername, String adminPassword, String newteacherUsername, String newCourseName);

    /**
     * Only Admin can remove CurrentCourses to System.
     * Remove element into CurrentCourses ArrayList.
     * Add element into OldCourses ArrayList.
     *
     * @param adminUsername Admin's Username
     * @param adminPassword Admin's password
     * @param teacherUsername Course Teacher Username
     * @param courseName The name of the course to be remove
     */
    void removeCurrentCourse(String adminUsername, String adminPassword, String teacherUsername, String courseName);

    /**
     * Only Teacher can add Student into Course.
     *
     * @param teacherUsername Teacher Username
     * @param teacherPassword Teacher Password
     * @param courseName      Course Name
     * @param studentUsername will add into course
     */
    void addStudentIntoCourse(String teacherUsername, String teacherPassword, String courseName, String studentUsername);

    /**
     * Only Teacher can remove Student into Course.
     *
     * @param teacherUsername Teacher Username
     * @param teacherPassword Teacher Password
     * @param courseName      Course Name
     * @param studentUsername will remove into course
     */
    void removeStudentIntoCourse(String teacherUsername, String teacherPassword, String courseName, String studentUsername);

    /**
     * Add Tutor Into Course
     *
     * @param teacherUsername Teacher Username
     * @param teacherPassword Teacher Password
     * @param courseName      Course Name
     * @param tutorUsername   will add into course
     */
    void addTutorIntoCourse(String teacherUsername, String teacherPassword, String courseName, String tutorUsername);

    /**
     * Remove Tutor Into Course
     *
     * @param teacherUsername Teacher Username
     * @param teacherPassword Teacher Password
     * @param courseName      Course Name
     * @param tutorUsername   will remove into course
     */
    void removeTutorIntoCourse(String teacherUsername, String teacherPassword, String courseName, String tutorUsername);

    /**
     * Add Document Into Course
     *
     * @param teacherUsername Teacher's Username
     * @param teacherPassword Teacher's Password
     * @param courseName      Course's Name
     * @param newDocument     (AbstractDocument)new Document like Book, File, Slide, Url, Whiteboard description.
     */
    void addDocumentIntoCourse(String teacherUsername, String teacherPassword, String courseName, AbstractDocument newDocument);

    /**
     * Remove Document Into Course
     *
     * @param teacherUsername Teacher's Username
     * @param teacherPassword Teacher's Password
     * @param courseName      Course's Name
     * @param newDocument     (AbstractDocument)new Document like Book, File, Slide, Url, Whiteboard description.
     */
    void removeDocumentIntoCourse(String teacherUsername, String teacherPassword, String courseName, AbstractDocument newDocument);

    /**
     * Add Assignment Into Course
     *
     * @param teacherUsername Teacher's Username
     * @param teacherPassword Teacher's Password
     * @param courseName      Course's Name
     * @param newAssignment   (AbstractAssignment) newAssignment like Quiz, Homework, Group Project.
     */
    void addAssignmentIntoCourse(String teacherUsername, String teacherPassword, String courseName, AbstractAssignment newAssignment);

    /**
     * Set OldCourses ArrayList.
     * İf the OldCourses ArrayList already set, then OldCourses ArrayList reset.
     */
    void setOldCoursesArrayList();

    /**
     * Print OldCourses ArrayList for Teacher
     *
     * @param teacherUsername Teacher Username
     * @param teacherPassword Teacher Password
     */
    void printOldCoursesArrayListforTeacher(String teacherUsername, String teacherPassword);

    /**
     * Print OldCourse for Tutor
     *
     * @param tutorUsername Tutor Username
     * @param tutorPassword Tutor Password
     */
    void printOldCourseforTutor(String tutorUsername, String tutorPassword);

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
     * Only Admin can remove Teacher to System.
     * Remove element into Teacher ArrayList.
     *
     * @param adminUsername   Admin Username
     * @param adminPassword   Admin Password
     * @param teacherUsername Teacher's Username
     */
    void removeTeacher(String adminUsername, String adminPassword, String teacherUsername);

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

    /**
     * Student Upload Assignment
     *
     * @param newAssignment  New Student Assignment
     */
    void studentUploadAssignment(Assignment newAssignment);

    /**
     * Student Grades in the Course
     *
     * @param studentUsername Student's Username
     * @param studentPassword Student's Password
     * @param courseName      Course Name
     */
    void studentGrade(String studentUsername, String studentPassword, String courseName);

    /**
     * Student Lecture Notes in the Course
     *
     * @param studentUsername Student's Username
     * @param studentPassword Student's Password
     * @param courseName      Course Name
     */
    void studentLectureNote(String studentUsername, String studentPassword, String courseName);

}//end interface System
