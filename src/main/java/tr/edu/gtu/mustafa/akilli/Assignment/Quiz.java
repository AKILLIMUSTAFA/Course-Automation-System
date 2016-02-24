package tr.edu.gtu.mustafa.akilli.Assignment;

/**
 * HW01_131044017_Mustafa_Akilli
 *
 * File:   Quiz
 *
 * Description:
 *
 * Quiz extends AbstractAssignment
 *
 * @author Mustafa_Akilli
 * @since Wednesday 24 February 2016, 16:19 by Mustafa_Akilli
 */
public class Quiz extends AbstractAssignment{

    /**
     * Quiz two parameter constructor
     *
     * @param newQuizName              new Quiz's Name
     * @param newDeadLineTimeDay       new DeadLineTime Day
     * @param newDeadLineTimeMonth     new DeadLineTime Month
     * @param newDeadLineTimeYear      new DeadLineTime Year
     * @param newLateDeadLineTimeDay   new LateDeadLineTime Day
     * @param newLateDeadLineTimeMonth new LateDeadLineTime Month
     * @param newLateDeadLineTimeYear  new LateDeadLineTime Year
     */
    public Quiz(String newQuizName,
                int newDeadLineTimeDay, int newDeadLineTimeMonth, int newDeadLineTimeYear,
                int newLateDeadLineTimeDay, int newLateDeadLineTimeMonth, int newLateDeadLineTimeYear) {
        super(newQuizName, newDeadLineTimeDay, newDeadLineTimeMonth, newDeadLineTimeYear,
                newLateDeadLineTimeDay, newLateDeadLineTimeMonth, newLateDeadLineTimeYear);
    }
}
