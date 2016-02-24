package tr.edu.gtu.mustafa.akilli.Assignment;

import java.util.ArrayList;

/**
 * HW01_131044017_Mustafa_Akilli
 *
 * File:   AbstractAssignment
 *
 * Description:
 *
 * AbstractAssignment implements Assignment
 *
 * @author Mustafa_Akilli
 * @since Wednesday 24 February 2016, 15:24 by Mustafa_Akilli
 */
public abstract class AbstractAssignment implements Assignment{

    private String assignmentName; /* Assignment's Name */
    private ArrayList<AssignmentScore> assignmentStudentScoreArrayList; /* Assignment Student Score ArrayList*/
    private int deadLineTimeDay;/* DeadLine Time's Day */
    private int deadLineTimeMonth;/* DeadLine Time's Month */
    private int deadLineTimeYear;/* DeadLine Time's Year */
    private int lateDeadLineTimeDay;/* DeadLine Time's Day */
    private int lateDeadLineTimeMonth;/* DeadLine Time's Month */
    private int lateDeadLineTimeYear;/* DeadLine Time's Year */

    /**
     * AbstractAssignment two parameter constructor
     *
     * @param newAssignmentName  new Assignment's Name
     * @param newDeadLineTimeDay new DeadLineTime Day
     * @param newDeadLineTimeMonth new DeadLineTime Month
     * @param newDeadLineTimeYear new DeadLineTime Year
     * @param newLateDeadLineTimeDay new LateDeadLineTime Day
     * @param newLateDeadLineTimeMonth new LateDeadLineTime Month
     * @param newLateDeadLineTimeYear new LateDeadLineTime Year
     */
    public AbstractAssignment(String newAssignmentName,
                              int newDeadLineTimeDay, int newDeadLineTimeMonth, int newDeadLineTimeYear,
                              int newLateDeadLineTimeDay, int newLateDeadLineTimeMonth, int newLateDeadLineTimeYear){
        setAssignmentName(newAssignmentName);
        setAssignmentStudentScoreArrayList();
        setDeadlineTime(newDeadLineTimeDay, newDeadLineTimeMonth, newDeadLineTimeYear);
        setLateDeadlineTime(newLateDeadLineTimeDay, newLateDeadLineTimeMonth, newLateDeadLineTimeYear);
    }

    /**
     * Set Assignment Name
     *
     * @param newAssignmentName Assignment's new name
     */
    public void setAssignmentName(String newAssignmentName) {assignmentName = new String(newAssignmentName);}

    /**
     * Get Assignment Name
     *
     * @return Assignment's name
     */
    public String getAssignmentName() {return assignmentName;}

    /**
     * Set AssignmentStudentScore ArrayList.
     * İf the AssignmentStudentScore ArrayList already set, then AssignmentStudentScore ArrayList reset.
     */
    public void setAssignmentStudentScoreArrayList() {assignmentStudentScoreArrayList = new ArrayList<AssignmentScore>();}

    /**
     * Get Assignment Student Score ArrayList
     *
     * @return Assignment Student Score ArrayList
     */
    public ArrayList<AssignmentScore> getAssignmentStudentScoreArrayList() {return assignmentStudentScoreArrayList;}

    /**
     * Set Deadline Time
     *
     * @param newDay   Deadline Time's new Day
     * @param newMonth Deadline Time's new Month
     * @param newYear  Deadline Time's new Year
     */
    public void setDeadlineTime(int newDay, int newMonth, int newYear) {
        deadLineTimeDay = newDay;/* DeadLine Time's Day */
        deadLineTimeMonth = newMonth;/* DeadLine Time's Month */
        deadLineTimeYear = newYear;/* DeadLine Time's Year */
    }

    /**
     * Get Deadline Time's Day
     *
     * @return Deadline Time's Day
     */
    public int getDeadlineTimeDay() {
        return deadLineTimeDay;
    }

    /**
     * Get Deadline Time's Month
     *
     * @return Deadline Time's Month
     */
    public int getDeadlineTimeMonth() {
        return deadLineTimeMonth;
    }

    /**
     * Get Deadline Time's Year
     *
     * @return Deadline Time's Year
     */
    public int getDeadlineTimeYear() {
        return deadLineTimeYear;
    }

    /**
     * Set LateDeadline Time
     *
     * @param newDay   LateDeadline Time's new Day
     * @param newMonth LateDeadline Time's new Month
     * @param newYear  LateDeadline Time's new Year
     */
    public void setLateDeadlineTime(int newDay, int newMonth, int newYear) {
        lateDeadLineTimeDay = newDay;/* DeadLine Time's Day */
        lateDeadLineTimeMonth = newMonth;/* DeadLine Time's Month */
        lateDeadLineTimeYear = newYear;/* DeadLine Time's Year */
    }

    /**
     * Get LateDeadline Time's Day
     *
     * @return LateDeadline Time's Day
     */
    public int getLateDeadlineTimeDay() {
        return lateDeadLineTimeDay;
    }

    /**
     * Get LateDeadline Time's Month
     *
     * @return LateDeadline Time's Month
     */
    public int getLateDeadlineTimeMonth() {
        return lateDeadLineTimeMonth;
    }

    /**
     * Get LateDeadline Time's Year
     *
     * @return LateDeadline Time's Year
     */
    public int getLateDeadlineTimeYear() {
        return lateDeadLineTimeYear;
    }
}
