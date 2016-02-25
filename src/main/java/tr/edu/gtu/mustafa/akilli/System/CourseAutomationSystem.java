package tr.edu.gtu.mustafa.akilli.System;

import tr.edu.gtu.mustafa.akilli.User.Student;

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

    private static final int ZERO = 0;/*ZERO*/
    private static final int ONE = 1; /*ONE */
    private static final int NOT_EXIST = -1; /*ONE */

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

    /**
     * Only Teacher can add Student into Course.
     *
     * @param teacherUsername Teacher Username
     * @param teacherPassword Teacher Password
     * @param courseName      Course Name
     * @param studentUsername will add into course
     */
    @Override
    public void addStudentIntoCourse(String teacherUsername, String teacherPassword, String courseName, String studentUsername) {

        int teacherIndex = getTeacherIndexInTeacherArrayList(teacherUsername, teacherPassword);
        int courseIndex= getCourseIndexInCourseArrayList(courseName);
        int studentIndex= getStudentIndexInStudentArrayList(studentUsername);
        int courseStudentAlreadyExist = getStudentIndexInStudentCourseArrayList(courseName, studentUsername);

        //if everything is fine. So add Student Into Course
        if(teacherIndex != NOT_EXIST && courseIndex != NOT_EXIST && studentIndex != NOT_EXIST &&
           courseStudentAlreadyExist == NOT_EXIST){
                getCurrentCoursesArrayList().get(courseIndex).getStudentsArrayList().add(new Student(studentUsername,"DontCare"));
                java.lang.System.out.println("Add "+ studentUsername + " into " + courseName + " successful");
        }

        if(teacherIndex == NOT_EXIST)
            java.lang.System.out.println("Teacher userName or Password is invalid");

        if(courseIndex == NOT_EXIST)
            java.lang.System.out.println("Course not exist: " + courseName );

        if(studentIndex == NOT_EXIST)
            java.lang.System.out.println("Student not registered in the system: "+ studentUsername);

        if(courseStudentAlreadyExist != NOT_EXIST)
            java.lang.System.out.println("Student already exist in the course: "+ studentUsername);
    }

    /**
     * Only Teacher can remove Student into Course.
     *
     * @param teacherUsername Teacher Username
     * @param teacherPassword Teacher Password
     * @param courseName      Course Name
     * @param studentUsername will remove into course
     */
    @Override
    public void removeStudentIntoCourse(String teacherUsername, String teacherPassword, String courseName, String studentUsername) {

        int teacherIndex = getTeacherIndexInTeacherArrayList(teacherUsername, teacherPassword);
        int courseIndex= getCourseIndexInCourseArrayList(courseName);
        int studentIndex= getStudentIndexInStudentArrayList(studentUsername);
        int courseStudentIndex = getStudentIndexInStudentCourseArrayList(courseName, studentUsername);

        //if everything is fine. So remove Student Into Course
        if(teacherIndex != NOT_EXIST && courseIndex != NOT_EXIST && studentIndex != NOT_EXIST &&
                courseStudentIndex != NOT_EXIST){
            getCurrentCoursesArrayList().get(courseIndex).getStudentsArrayList().remove(courseStudentIndex);
            java.lang.System.out.println("Remove "+ studentUsername + " into " + courseName + " successful");
        }

        if(teacherIndex == NOT_EXIST)
            java.lang.System.out.println("Teacher userName or Password is invalid");

        if(courseIndex == NOT_EXIST)
            java.lang.System.out.println("Course not exist: " + courseName );

        if(studentIndex == NOT_EXIST)
            java.lang.System.out.println("Student not registered in the system: "+ studentUsername);

        if(courseStudentIndex == NOT_EXIST)
            java.lang.System.out.println("Student not exist in the course: "+ studentUsername);
    }

    /**
     * Add Tutor Into Course
     *
     * @param teacherUsername Teacher Username
     * @param teacherPassword Teacher Password
     * @param courseName      Course Name
     * @param tutorUsername   will add into course
     */
    @Override
    public void addTutorIntoCourse(String teacherUsername, String teacherPassword, String courseName, String tutorUsername) {

        int teacherIndex = getTeacherIndexInTeacherArrayList(teacherUsername, teacherPassword);
        int courseIndex= getCourseIndexInCourseArrayList(courseName);
        int studentIndex= getStudentIndexInStudentArrayList(tutorUsername);
        int courseTutorAlreadyExist = getTutorIndexInTutorCourseArrayList(courseName, tutorUsername);
        int courseStudentAlreadyExist = getStudentIndexInStudentCourseArrayList(courseName, tutorUsername);

        //if everything is fine. So add Student Into Course
        if(teacherIndex != NOT_EXIST && courseIndex != NOT_EXIST && studentIndex != NOT_EXIST &&
                courseStudentAlreadyExist == NOT_EXIST && courseTutorAlreadyExist == NOT_EXIST){
            getCurrentCoursesArrayList().get(courseIndex).getTutorsArrayList().add(new Student(tutorUsername,"DontCare"));
            java.lang.System.out.println("Add tutor "+ tutorUsername + " into " + courseName + " successful");
        }

        if(teacherIndex == NOT_EXIST)
            java.lang.System.out.println("Teacher userName or Password is invalid");

        if(courseIndex == NOT_EXIST)
            java.lang.System.out.println("Course not exist: " + courseName );

        if(studentIndex == NOT_EXIST)
            java.lang.System.out.println("Tutor not registered in the system: "+ tutorUsername);

        if(courseTutorAlreadyExist != NOT_EXIST)
            java.lang.System.out.println("Tutor already exist in the course: "+ tutorUsername);

        if(courseStudentAlreadyExist != NOT_EXIST)
            java.lang.System.out.println( tutorUsername+ " already student in this course");

    }

    /**
     * Remove Tutor Into Course
     *
     * @param teacherUsername Teacher Username
     * @param teacherPassword Teacher Password
     * @param courseName      Course Name
     * @param tutorUsername   will remove into course
     */
    @Override
    public void removeTutorIntoCourse(String teacherUsername, String teacherPassword, String courseName, String tutorUsername) {

        int teacherIndex = getTeacherIndexInTeacherArrayList(teacherUsername, teacherPassword);
        int courseIndex= getCourseIndexInCourseArrayList(courseName);
        int studentIndex= getStudentIndexInStudentArrayList(tutorUsername);
        int courseTutorIndex = getTutorIndexInTutorCourseArrayList(courseName, tutorUsername);

        //if everything is fine. So remove Student Into Course
        if(teacherIndex != NOT_EXIST && courseIndex != NOT_EXIST && studentIndex != NOT_EXIST &&
                courseTutorIndex != NOT_EXIST){
            getCurrentCoursesArrayList().get(courseIndex).getTutorsArrayList().remove(courseTutorIndex);
            java.lang.System.out.println("Remove "+ tutorUsername + " into " + courseName + " successful");
        }

        if(teacherIndex == NOT_EXIST)
            java.lang.System.out.println("Teacher userName or Password is invalid");

        if(courseIndex == NOT_EXIST)
            java.lang.System.out.println("Course not exist: " + courseName );

        if(studentIndex == NOT_EXIST)
            java.lang.System.out.println("Tutor not registered in the system: "+ tutorUsername);

        if(courseTutorIndex == NOT_EXIST)
            java.lang.System.out.println("Tutor not exist in the course: "+ tutorUsername);
    }

    /**
     * Get Course Index In Course ArrayList
     *
     * @param courseName Course's Name
     * @return Course Index In Course ArrayList
     */
    private int getCourseIndexInCourseArrayList(String courseName){
        int courseIndex = NOT_EXIST;

        for(int index = 0; index < getCurrentCoursesArrayList().size() ;++index)
            if(getCurrentCoursesArrayList().get(index).getCourseName() == courseName)
                courseIndex = index;

        return courseIndex;
    }

    /**
     * Get Teacher Index In Teacher ArrayList
     *
     * @param  teacherUsername Teacher's Username
     * @param  teacherPassword Teacher's Password
     * @return Teacher Index In Teacher ArrayList
     */
    private int getTeacherIndexInTeacherArrayList(String teacherUsername, String teacherPassword){
        int teacherIndex = NOT_EXIST;

        for(int index = 0; index < getTeachersArrayList().size() ;++index)
            if(getTeachersArrayList().get(index).getUsername() == teacherUsername &&
                    getTeachersArrayList().get(index).getPassword() == teacherPassword)
                teacherIndex = index;

        return teacherIndex;
    }

    /**
     * Get Teacher Index In Teacher ArrayList
     *
     * @param  teacherUsername Teacher's Username
     * @return Teacher Index In Teacher ArrayList
     */
    private int getTeacherIndexInTeacherArrayList(String teacherUsername){
        int teacherIndex = NOT_EXIST;

        for(int index = 0; index < getTeachersArrayList().size() ;++index)
            if(getTeachersArrayList().get(index).getUsername() == teacherUsername)
                teacherIndex = index;

        return teacherIndex;
    }

    /**
     * Get Student Index In Student ArrayList
     *
     * @param studentUsername Student's Username
     * @return Student Index In Student ArrayList
     */
    private int getStudentIndexInStudentArrayList (String studentUsername){
        int studentIndex = NOT_EXIST;

        for(int index = 0; index < getStudentsArrayList().size() ;++index)
            if(getStudentsArrayList().get(index).getUsername() == studentUsername)
                studentIndex = index;

        return studentIndex;
    }

    /**
     * Get Student Index In Student ArrayList
     *
     * @param  studentUsername Student's Username
     * @param  studentPassword Student's Password
     * @return Student Index In Student ArrayList
     */
    private int getStudentIndexInStudentArrayList (String studentUsername, String studentPassword){
        int studentIndex = NOT_EXIST;

        for(int index = 0; index < getStudentsArrayList().size() ;++index)
            if(getStudentsArrayList().get(index).getUsername() == studentUsername &&
                    getStudentsArrayList().get(index).getPassword() == studentPassword)
                studentIndex = index;

        return studentIndex;
    }

    /**
     * Get Student Index In Student in Course ArrayList
     *
     * @param  courseName      Course's Name
     * @param  studentUsername Student's Username
     * @return Student Index In Student in Course ArrayList
     */
    private int getStudentIndexInStudentCourseArrayList (String courseName, String studentUsername){

        int courseIndex = getCourseIndexInCourseArrayList(courseName);
        int studentIndex = NOT_EXIST;

        if(courseIndex != NOT_EXIST){
            for(int index = 0; index < getCurrentCoursesArrayList().get(courseIndex).getStudentsArrayList().size() ;++index)
                if(getCurrentCoursesArrayList().get(courseIndex).getStudentsArrayList().get(index).getUsername() == studentUsername)
                    studentIndex = index;
        }

        return studentIndex;
    }

    /**
     * Get Tutor Index In Tutor in Course ArrayList
     *
     * @param  courseName      Course's Name
     * @param  tutorUsername   Tutor's Username
     * @return Tutor Index In Tutor in Course ArrayList
     */
    private int getTutorIndexInTutorCourseArrayList (String courseName, String tutorUsername){

        int courseIndex = getCourseIndexInCourseArrayList(courseName);
        int tutorIndex = NOT_EXIST;

        if(courseIndex != NOT_EXIST){
            for(int index = 0; index < getCurrentCoursesArrayList().get(courseIndex).getStudentsArrayList().size() ;++index)
                if(getCurrentCoursesArrayList().get(courseIndex).getTutorsArrayList().get(index).getUsername() == tutorUsername)
                    tutorIndex = index;
        }

        return tutorIndex;
    }

}
