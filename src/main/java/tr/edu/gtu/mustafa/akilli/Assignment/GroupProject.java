package tr.edu.gtu.mustafa.akilli.Assignment;

/**
 * HW01_131044017_Mustafa_Akilli
 *
 * File:   GroupProject
 *
 * Description:
 *
 * GroupProject extends AbstractAssignment
 *
 * @author Mustafa_Akilli
 * @since Wednesday 24 February 2016, 16:49 by Mustafa_Akilli
 */
public class GroupProject extends AbstractAssignment{
    /**
     * GroupProject two parameter constructor
     *
     * @param newGroupProjectName      new GroupProject's Name
     * @param newDeadLineTimeDay       new DeadLineTime Day
     * @param newDeadLineTimeMonth     new DeadLineTime Month
     * @param newDeadLineTimeYear      new DeadLineTime Year
     * @param newLateDeadLineTimeDay   new LateDeadLineTime Day
     * @param newLateDeadLineTimeMonth new LateDeadLineTime Month
     * @param newLateDeadLineTimeYear  new LateDeadLineTime Year
     */
    public GroupProject(String newGroupProjectName,
                        int newDeadLineTimeDay, int newDeadLineTimeMonth, int newDeadLineTimeYear,
                        int newLateDeadLineTimeDay, int newLateDeadLineTimeMonth, int newLateDeadLineTimeYear) {
        super(newGroupProjectName, newDeadLineTimeDay, newDeadLineTimeMonth,
                newDeadLineTimeYear, newLateDeadLineTimeDay, newLateDeadLineTimeMonth, newLateDeadLineTimeYear);
    }
}
