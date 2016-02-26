package tr.edu.gtu.mustafa.akilli.cse222;


import tr.edu.gtu.mustafa.akilli.Assignment.GroupProject;
import tr.edu.gtu.mustafa.akilli.Assignment.Homework;
import tr.edu.gtu.mustafa.akilli.Assignment.Quiz;
import tr.edu.gtu.mustafa.akilli.Assignment.AssignmentScore;
import tr.edu.gtu.mustafa.akilli.Document.*;
import tr.edu.gtu.mustafa.akilli.System.CourseAutomationSystem;

/**
 * HW01_131044017_Mustafa_Akilli
 *
 * File:   TestScenario.java
 *
 * Description:
 *
 * TestScenario for the Course Automation System
 *
 * @author Mustafa_Akilli
 * @since Sunday 21 February 2016, 15:30 by Mustafa_Akilli
 */
public class TestScenario {

    /**
     * Main of TestScenario
     *
     * @param args
     */
    public static void main( String[] args )
    {
        //System Created
        CourseAutomationSystem courseAutomationSystem = new CourseAutomationSystem("SystemAdmin","123");
        java.lang.System.out.println("********************************************************************");

        //Administrators adding teacher.
        courseAutomationSystem.addTeacher("SystemAdmin", "123" , "AhmetHoca", "1453");
        java.lang.System.out.println("********************************************************************");

        //Administrators adding courses
        courseAutomationSystem.addCurrentCourse("SystemAdmin", "123" , "AhmetHoca", "CSE241");
        java.lang.System.out.println("********************************************************************");

        //Student Register into system.
        courseAutomationSystem.studentRegister("MehmetOgrenci", "777");
        java.lang.System.out.println("********************************************************************");

        //Student Register into system.
        courseAutomationSystem.studentRegister("KamilTutor", "888");
        java.lang.System.out.println("********************************************************************");

        //Teacher adding students  into course
        courseAutomationSystem.addStudentIntoCourse("AhmetHoca", "1453", "CSE241", "MehmetOgrenci");
        java.lang.System.out.println("********************************************************************");

        //Teacher adding tutors
        courseAutomationSystem.addTutorIntoCourse("AhmetHoca", "1453", "CSE241", "KamilTutor");
        java.lang.System.out.println("********************************************************************");

        //Teacher adding documents
        courseAutomationSystem.addDocumentIntoCourse("AhmetHoca", "1453", "CSE241", new Book("Java language Book"));
        courseAutomationSystem.addDocumentIntoCourse("AhmetHoca", "1453", "CSE241", new File("Java language File"));
        courseAutomationSystem.addDocumentIntoCourse("AhmetHoca", "1453", "CSE241", new Slide("Java language Slide"));
        courseAutomationSystem.addDocumentIntoCourse("AhmetHoca", "1453", "CSE241", new Url("Java language Url"));
        courseAutomationSystem.addDocumentIntoCourse("AhmetHoca", "1453", "CSE241", new WhiteboardDescription("Java language WhiteboardDescription"));
        java.lang.System.out.println("********************************************************************");

        //Teacher give assignments
        courseAutomationSystem.addAssignmentIntoCourse("AhmetHoca", "1453","CSE241",new Quiz("JavaQuiz1",2,3,2016,3,3,2016));
        courseAutomationSystem.addAssignmentIntoCourse("AhmetHoca", "1453","CSE241",new Homework("JavaHomework1",14,3,2016,16,3,2016));
        courseAutomationSystem.addAssignmentIntoCourse("AhmetHoca", "1453","CSE241",new GroupProject("JavaGroupProject1",25,3,2016,28,3,2016));
        java.lang.System.out.println("********************************************************************");

        //Student upload assignments.(Not realy)
        courseAutomationSystem.studentUploadAssignment(new Quiz("JavaQuiz1",2,3,2016,3,3,2016));
        courseAutomationSystem.studentUploadAssignment(new Homework("JavaHomework1",14,3,2016,16,3,2016));
        courseAutomationSystem.studentUploadAssignment(new GroupProject("JavaGroupProject1",25,3,2016,28,3,2016));

        //Teacher give score for assignments.
        courseAutomationSystem.getCurrentCourseforTeacher("AhmetHoca", "1453", "CSE241").getAssignmentsArrayList().get(0).getAssignmentStudentScoreArrayList().add(0,new AssignmentScore("MehmetOgrenci",95));
        courseAutomationSystem.getCurrentCourseforTeacher("AhmetHoca", "1453", "CSE241").getAssignmentsArrayList().get(1).getAssignmentStudentScoreArrayList().add(0,new AssignmentScore("MehmetOgrenci",65));
        courseAutomationSystem.getCurrentCourseforTeacher("AhmetHoca", "1453", "CSE241").getAssignmentsArrayList().get(2).getAssignmentStudentScoreArrayList().add(0,new AssignmentScore("MehmetOgrenci",70));

        //Student view grades
        courseAutomationSystem.studentGrade("MehmetOgrenci", "777", "CSE241");
        java.lang.System.out.println("********************************************************************");

        //Student lecture notes
        courseAutomationSystem.studentLectureNote("MehmetOgrenci", "777", "CSE241");
        java.lang.System.out.println("********************************************************************");

    }// end method main

}// end class TestScenario
