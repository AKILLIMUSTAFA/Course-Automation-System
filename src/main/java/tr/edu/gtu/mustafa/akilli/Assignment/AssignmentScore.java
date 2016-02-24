package tr.edu.gtu.mustafa.akilli.Assignment;

/**
 * HW01_131044017_Mustafa_Akilli
 *
 * File:   AssignmentScore
 *
 * Description:
 *
 * AssignmentsScore class have a student name.
 * AssignmentsScore class have a student's score of Assignment
 *
 * @author Mustafa_Akilli
 * @since Wednesday 24 February 2016, 15:10 by Mustafa_Akilli
 */
public class AssignmentScore {

    private String studentUsername; /*Student Username */
    private int studentAssignmentScore;/* Student's Assignment Score*/

    /**
     * AssignmentScore two parameters constructor
     *
     * @param newStudentUsername new Student's Username
     * @param newStudentAssignmentScore new Student's AssignmentScore
     */
    public AssignmentScore(String newStudentUsername, int newStudentAssignmentScore){
        setStudentUsername(newStudentUsername);
        setStudentAssignmentScore(newStudentAssignmentScore);
    }

    /**
     * Set Student Username
     *
     * @param newStudentUsername new Student's Username
     */
    public void setStudentUsername(String newStudentUsername) {studentUsername = new String(newStudentUsername);}

    /**
     * Set Student's Assignment Score
     *
     * @param newStudentAssignmentScore new Student's Assignment Score
     */
    public void setStudentAssignmentScore(int newStudentAssignmentScore) {studentAssignmentScore = newStudentAssignmentScore;}

    /**
     * Get Student Username
     *
     * @return Student Username
     */
    public String getStudentUsername(){return studentUsername;}

    /**
     * Get Student Assignment Score
     *
     * @return student Assignment Score
     */
    public int getStudentAssignmentScore(){return studentAssignmentScore;}
}
