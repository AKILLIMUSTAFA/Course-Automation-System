package tr.edu.gtu.mustafa.akilli.System;

import tr.edu.gtu.mustafa.akilli.Assignment.AbstractAssignment;
import tr.edu.gtu.mustafa.akilli.Course.CourseClass;
import tr.edu.gtu.mustafa.akilli.Document.AbstractDocument;
import tr.edu.gtu.mustafa.akilli.User.Student;

import java.util.ArrayList;

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
     * Get Current Course for Teacher
     *
     * @param teacherUsername Teacher's Username
     * @param teacherPassword Teacher's Password
     * @param courseName      Course's Name
     * @return Current Course
     */
    @Override
    public CourseClass getCurrentCourseforTeacher(String teacherUsername, String teacherPassword, String courseName) {

        int teacherIndex = getTeacherIndexInTeacherArrayList(teacherUsername, teacherPassword);
        int courseIndex= getCourseIndexInCourseArrayList(courseName);

        if(teacherIndex != NOT_EXIST && courseIndex != NOT_EXIST)
            return getCurrentCoursesArrayList().get(courseIndex);

        if(teacherIndex == NOT_EXIST)
            java.lang.System.out.println("Teacher userName or Password is invalid");

        if(courseIndex == NOT_EXIST)
            java.lang.System.out.println("Course not exist: " + courseName );

        return null;
    }

    /**
     * Get Current Course for Tutor
     *
     * @param tutorUsername Tutor's Username
     * @param tutorPassword Tutor's Password
     * @param courseName    Course's Name
     * @return Current Course
     */
    @Override
    public CourseClass getCurrentCourseforTutor(String tutorUsername, String tutorPassword, String courseName) {

        int tutorIndex = getStudentIndexInStudentArrayList(tutorUsername, tutorPassword);
        int courseIndex= getCourseIndexInCourseArrayList(courseName);
        int isStudentTutorThisCourse = NOT_EXIST;

        if(tutorIndex != NOT_EXIST && courseIndex != NOT_EXIST){
            for(int i = 0; i < getCurrentCoursesArrayList().get(courseIndex).getTutorsArrayList().size() ;++i)
                if(getCurrentCoursesArrayList().get(courseIndex).getTutorsArrayList().get(i).getUsername().equals(tutorUsername)){
                    return getCurrentCoursesArrayList().get(courseIndex);
                }
        }

        if(tutorIndex == NOT_EXIST)
            java.lang.System.out.println("Tutor not exist.");

        if(courseIndex == NOT_EXIST)
            java.lang.System.out.println("Course not exist: " + courseName );

        if(isStudentTutorThisCourse == NOT_EXIST)
            java.lang.System.out.println("Student not tutor this course.");

        return null;
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
     * Add Document Into Course
     *
     * @param teacherUsername Teacher's Username
     * @param teacherPassword Teacher's Password
     * @param courseName      Course's Name
     * @param newDocument     (AbstractDocument)new Document like Book, File, Slide, Url, Whiteboard description.
     */
    @Override
    public void addDocumentIntoCourse(String teacherUsername, String teacherPassword, String courseName, AbstractDocument newDocument) {

        int teacherIndex = getTeacherIndexInTeacherArrayList(teacherUsername, teacherPassword);
        int courseIndex= getCourseIndexInCourseArrayList(courseName);
        int courseDocumentAlreadyExist = getDocumentIndexInDocumentinCourseArrayList(courseName, newDocument.getDocumentName());

        //if everything is fine. So add Student Into Course
        if(teacherIndex != NOT_EXIST && courseIndex != NOT_EXIST && courseDocumentAlreadyExist == NOT_EXIST){
            getCurrentCoursesArrayList().get(courseIndex).getDocumentsArrayList().add(newDocument);
            java.lang.System.out.println("Add "+ newDocument.getDocumentName() + " into " + courseName + " successful");
        }

        if(teacherIndex == NOT_EXIST)
            java.lang.System.out.println("Teacher userName or Password is invalid");

        if(courseIndex == NOT_EXIST)
            java.lang.System.out.println("Course not exist: " + courseName );

        if(courseDocumentAlreadyExist != NOT_EXIST)
            java.lang.System.out.println("Document already exist in the course: "+ newDocument.getDocumentName());
    }

    /**
     * Remove Document Into Course
     *
     * @param teacherUsername Teacher's Username
     * @param teacherPassword Teacher's Password
     * @param courseName      Course's Name
     * @param newDocument     (AbstractDocument)new Document like Book, File, Slide, Url, Whiteboard description.
     */
    @Override
    public void removeDocumentIntoCourse(String teacherUsername, String teacherPassword, String courseName, AbstractDocument newDocument) {

        int teacherIndex = getTeacherIndexInTeacherArrayList(teacherUsername, teacherPassword);
        int courseIndex= getCourseIndexInCourseArrayList(courseName);
        int courseDocumentAlreadyExist = getDocumentIndexInDocumentinCourseArrayList(courseName, newDocument.getDocumentName());

        //if everything is fine. So add Student Into Course
        if(teacherIndex != NOT_EXIST && courseIndex != NOT_EXIST && courseDocumentAlreadyExist != NOT_EXIST){
            getCurrentCoursesArrayList().get(courseIndex).getDocumentsArrayList().remove(newDocument);
            java.lang.System.out.println("Remove "+ newDocument.getDocumentName() + " into " + courseName + " successful");
        }

        if(teacherIndex == NOT_EXIST)
            java.lang.System.out.println("Teacher userName or Password is invalid");

        if(courseIndex == NOT_EXIST)
            java.lang.System.out.println("Course not exist: " + courseName );

        if(courseDocumentAlreadyExist == NOT_EXIST)
            java.lang.System.out.println("Document not exist in the course: "+ newDocument.getDocumentName());
    }

    /**
     * Add Assignment Into Course
     *
     * @param teacherUsername Teacher's Username
     * @param teacherPassword Teacher's Password
     * @param courseName      Course's Name
     * @param newAssignment   (AbstractAssignment) newAssignment like Quiz, Homework, Group Project.
     */
    @Override
    public void addAssignmentIntoCourse(String teacherUsername, String teacherPassword, String courseName, AbstractAssignment newAssignment) {
        int teacherIndex = getTeacherIndexInTeacherArrayList(teacherUsername, teacherPassword);
        int courseIndex= getCourseIndexInCourseArrayList(courseName);
        int courseAssignmentAlreadyExist = getAssignmentIndexInDocumentinCourseArrayList(courseName, newAssignment.getAssignmentName());

        //if everything is fine. So add Student Into Course
        if(teacherIndex != NOT_EXIST && courseIndex != NOT_EXIST && courseAssignmentAlreadyExist == NOT_EXIST){
            getCurrentCoursesArrayList().get(courseIndex).getAssignmentsArrayList().add(newAssignment);
            java.lang.System.out.println("Add "+ newAssignment.getAssignmentName() + " into " + courseName + " successful");
        }

        if(teacherIndex == NOT_EXIST)
            java.lang.System.out.println("Teacher userName or Password is invalid");

        if(courseIndex == NOT_EXIST)
            java.lang.System.out.println("Course not exist: " + courseName );

        if(courseAssignmentAlreadyExist != NOT_EXIST)
            java.lang.System.out.println("Assignment already exist in the course: "+ newAssignment.getAssignmentName());
    }

    /**
     * Print OldCourses ArrayList for Teacher
     *
     * @param teacherUsername Teacher Username
     * @param teacherPassword Teacher Password
     */
    @Override
    public void printOldCoursesArrayListforTeacher(String teacherUsername, String teacherPassword) {

        int teacherIndex = getTeacherIndexInTeacherArrayList(teacherUsername, teacherPassword);

        if(teacherIndex != NOT_EXIST){
            for(int index = 0; index < getOldCoursesArrayList().size() ;++index)
                java.lang.System.out.println("Old Course Name: " + getOldCoursesArrayList().get(index).getCourseName());
        }

        else
            java.lang.System.out.println("Teacher userName or Password is invalid");
    }

    /**
     * Print OldCourse for Tutor
     *
     * @param tutorUsername Tutor's Username
     * @param tutorPassword Tutor's Password
     */
    @Override
    public void printOldCourseforTutor(String tutorUsername, String tutorPassword) {

        int TutorExist = NOT_EXIST;

        for(int index = 0; index < getOldCoursesArrayList().size() ;++index){
            for(int i = 0; i < getOldCoursesArrayList().get(index).getTutorsArrayList().size() ;++i)
                if(getOldCoursesArrayList().get(index).getTutorsArrayList().get(i).getUsername().equals(tutorUsername)){
                    java.lang.System.out.println("Old Course Name: " + getOldCoursesArrayList().get(index).getCourseName());
                    TutorExist = ONE;
                }
        }

        if(TutorExist == NOT_EXIST)
            java.lang.System.out.println("Tutor userName or Password is invalid or This student not Tutor any course");
    }

    /**
     * Student Grades in the Course
     *
     * @param studentUsername Student's Username
     * @param studentPassword Student's Password
     * @param courseName      Course Name
     */
    @Override
    public void studentGrade(String studentUsername, String studentPassword, String courseName) {

        int studentIndex = getStudentIndexInStudentArrayList(studentUsername, studentPassword);
        int courseIndex= getCourseIndexInCourseArrayList(courseName);

        if(studentIndex != NOT_EXIST && courseIndex != NOT_EXIST){
            for(int i = 0; i < getCurrentCoursesArrayList().get(courseIndex).getAssignmentsArrayList().size(); ++i)
                for(int j = 0; j < getCurrentCoursesArrayList().get(courseIndex).getAssignmentsArrayList().
                        get(i).getAssignmentStudentScoreArrayList().size(); ++j)
                    if(getCurrentCoursesArrayList().get(courseIndex).getAssignmentsArrayList().get(i).
                            getAssignmentStudentScoreArrayList().get(j).getStudentUsername().equals(studentUsername)) {
                        java.lang.System.out.println(getCurrentCoursesArrayList().get(courseIndex).getAssignmentsArrayList().
                                get(i).getAssignmentName() + ": " + getCurrentCoursesArrayList().get(courseIndex).
                                getAssignmentsArrayList().get(i).getAssignmentStudentScoreArrayList().get(j).getStudentAssignmentScore());
                    }
        }

        if(studentIndex == NOT_EXIST)
            java.lang.System.out.println("Tutor not exist.");

        if(courseIndex == NOT_EXIST)
            java.lang.System.out.println("Course not exist: " + courseName );
    }

    /**
     * Student Lecture Notes in the Course
     *
     * @param studentUsername Student's Username
     * @param studentPassword Student's Password
     * @param courseName      Course Name
     */
    @Override
    public void studentLectureNote(String studentUsername, String studentPassword, String courseName) {

        int studentIndex = getStudentIndexInStudentArrayList(studentUsername, studentPassword);
        int courseIndex= getCourseIndexInCourseArrayList(courseName);
        int studentInCourse = getStudentIndexInStudentCourseArrayList(courseName, studentUsername);

        if(studentIndex != NOT_EXIST && courseIndex != NOT_EXIST && studentInCourse!=NOT_EXIST)
            for(int index = 0; index < getCurrentCoursesArrayList().get(courseIndex).getDocumentsArrayList().size(); ++index)
                java.lang.System.out.println(getCurrentCoursesArrayList().get(courseIndex).getDocumentsArrayList().get(index).getDocumentName() );

        if(studentIndex == NOT_EXIST)
            java.lang.System.out.println("Tutor not exist.");

        if(courseIndex == NOT_EXIST)
            java.lang.System.out.println("Course not exist: " + courseName );

        if(studentInCourse == NOT_EXIST)
            java.lang.System.out.println("Student not registered this course." );
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
            if(getCurrentCoursesArrayList().get(index).getCourseName().equals(courseName))
                courseIndex = index;

        return courseIndex;
    }

    /**
     * Get OldCourse Index In OldCourse ArrayList
     *
     * @param courseName Course's Name
     * @return OldCourse Index In OldCourse ArrayList
     */
    private int getOldCourseIndexInOldCourseArrayList(String courseName){
        int oldCourseIndex = NOT_EXIST;

        for(int index = 0; index < getOldCoursesArrayList().size() ;++index)
            if(getOldCoursesArrayList().get(index).getCourseName().equals(courseName))
                oldCourseIndex = index;

        return oldCourseIndex;
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
            if(getTeachersArrayList().get(index).getUsername().equals(teacherUsername) &&
                    getTeachersArrayList().get(index).getPassword().equals(teacherPassword))
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
            if(getTeachersArrayList().get(index).getUsername().equals(teacherUsername))
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
            if(getStudentsArrayList().get(index).getUsername().equals(studentUsername))
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
            if(getStudentsArrayList().get(index).getUsername().equals(studentUsername) &&
                    getStudentsArrayList().get(index).getPassword().equals(studentPassword))
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
                if(getCurrentCoursesArrayList().get(courseIndex).getStudentsArrayList().get(index).getUsername().equals(studentUsername))
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
            try{
                for(int index = 0; index < getCurrentCoursesArrayList().get(courseIndex).getStudentsArrayList().size() ;++index)
                    if(getCurrentCoursesArrayList().get(courseIndex).getTutorsArrayList().get(index).getUsername().equals(tutorUsername))
                        tutorIndex = index;
            }
            catch (Exception e){}
        }

        return tutorIndex;
    }

    /**
     * Get Document Index In Document in Course ArrayList
     *
     * @param courseName   Course's Name
     * @param documentName Document's Name
     * @return             Document Index In Document in Course ArrayList
     */
    private int getDocumentIndexInDocumentinCourseArrayList(String courseName, String documentName){
        int courseIndex = getCourseIndexInCourseArrayList(courseName);
        int documentIndex = NOT_EXIST;

        if(courseIndex != NOT_EXIST){
            for(int index = 0; index < getCurrentCoursesArrayList().get(courseIndex).getDocumentsArrayList().size();++index)
                if(getCurrentCoursesArrayList().get(courseIndex).getDocumentsArrayList().get(index).getDocumentName().equals(documentName))
                    documentIndex = index;
        }

        return documentIndex;
    }

    /**
     * Get Assignment Index In Document in Course ArrayList
     *
     * @param courseName     Course's Name
     * @param assignmentName Assignment's Name
     * @return               Assignment Index In Document in Course ArrayList
     */
    private int getAssignmentIndexInDocumentinCourseArrayList(String courseName, String assignmentName ){
        int courseIndex = getCourseIndexInCourseArrayList(courseName);
        int assignmentIndex = NOT_EXIST;

        if(courseIndex != NOT_EXIST){
            for(int index = 0; index < getCurrentCoursesArrayList().get(courseIndex).getAssignmentsArrayList().size();++index)
                if(getCurrentCoursesArrayList().get(courseIndex).getAssignmentsArrayList().get(index).getAssignmentName().equals(assignmentIndex))
                    assignmentIndex = index;
        }

        return assignmentIndex;
    }

}
