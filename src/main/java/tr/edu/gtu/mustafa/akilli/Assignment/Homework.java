package tr.edu.gtu.mustafa.akilli.Assignment;

/**
 * HW01_131044017_Mustafa_Akilli
 *
 * File:   Homework
 *
 * Description:
 *
 * Homework extends AbstractAssignment
 *
 * @author Mustafa_Akilli
 * @since Wednesday 24 February 2016, 16:47 by Mustafa_Akilli
 */
public class Homework extends AbstractAssignment{
    /**
     * Homework two parameter constructor
     *
     * @param newHomeworkName        new Homework's Name
     * @param newDeadLineTimeDay       new DeadLineTime Day
     * @param newDeadLineTimeMonth     new DeadLineTime Month
     * @param newDeadLineTimeYear      new DeadLineTime Year
     * @param newLateDeadLineTimeDay   new LateDeadLineTime Day
     * @param newLateDeadLineTimeMonth new LateDeadLineTime Month
     * @param newLateDeadLineTimeYear  new LateDeadLineTime Year
     */
    public Homework(String newHomeworkName,
                    int newDeadLineTimeDay, int newDeadLineTimeMonth, int newDeadLineTimeYear,
                    int newLateDeadLineTimeDay, int newLateDeadLineTimeMonth, int newLateDeadLineTimeYear) {
        super(newHomeworkName, newDeadLineTimeDay, newDeadLineTimeMonth,
                newDeadLineTimeYear, newLateDeadLineTimeDay, newLateDeadLineTimeMonth, newLateDeadLineTimeYear);
    }
}
