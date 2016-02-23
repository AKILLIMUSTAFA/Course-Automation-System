package tr.edu.gtu.mustafa.akilli.Assignment;

/**
 * HW01_131044017_Mustafa_Akilli
 *
 * File:   Assignment Interface
 *
 * Description:
 *
 * Assignments can be in different formats like quiz, homework or group project.
 * Assignments have a name.
 * Assignments have a deadline.
 * Assignments have a late deadline.
 *
 * @author Mustafa_Akilli
 * @since Sunday 22 February 2016, 23:00 by Mustafa_Akilli
 */
public interface Assignment {

    /**
     * Set Assignment Name
     *
     * @param newAssignmentName Assignment's new name
     */
    void setAssignmentName(String newAssignmentName);

    /**
     * Get Assignment Name
     *
     * @return Assignment's name
     */
    String getAssignmentName();

    /**
     * Set Deadline Time
     *
     * @param newDay Deadline Time's new Day
     * @param newMonth Deadline Time's new Month
     * @param newYear Deadline Time's new Year
     */
    void setDeadlineTime(int newDay, int newMonth, int newYear);

    /**
     * Get Deadline Time's Day
     *
     * @return Deadline Time's Day
     */
    int getDeadlineTimeDay();

    /**
     * Get Deadline Time's Month
     *
     * @return Deadline Time's Month
     */
    int getDeadlineTimeMonth();

    /**
     * Get Deadline Time's Year
     *
     * @return Deadline Time's Year
     */
    int getDeadlineTimeYear();

    /**
     * Set LateDeadline Time
     *
     * @param newDay LateDeadline Time's new Day
     * @param newMonth LateDeadline Time's new Month
     * @param newYear LateDeadline Time's new Year
     */
    void setLateDeadlineTime(int newDay, int newMonth, int newYear);

    /**
     * Get LateDeadline Time's Day
     *
     * @return LateDeadline Time's Day
     */
    int getLateDeadlineTimeDay();

    /**
     * Get LateDeadline Time's Month
     *
     * @return LateDeadline Time's Month
     */
    int getLateDeadlineTimeMonth();

    /**
     * Get LateDeadline Time's Year
     *
     * @return LateDeadline Time's Year
     */
    int getLateDeadlineTimeYear();

}////end interface Assignment
