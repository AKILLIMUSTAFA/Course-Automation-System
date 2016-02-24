package tr.edu.gtu.mustafa.akilli.Course;

import tr.edu.gtu.mustafa.akilli.Assignment.AbstractAssignment;
import tr.edu.gtu.mustafa.akilli.Document.AbstractDocument;
import java.util.ArrayList;

/**
 * HW01_131044017_Mustafa_Akilli
 *
 * File:   Course Interface
 *
 * Description:
 *
 * Courses have a name, documents and assigments.
 *
 * @author Mustafa_Akilli
 * @since Sunday 22 February 2016, 21:14 by Mustafa_Akilli
 */
public interface Course {

    /**
     * Set Course Name
     *
     * @param newCourseName Course's new name
     */
    void setCourseName(String newCourseName);

    /**
     * Get Course Name
     *
     * @return Course's name
     */
    String getCourseName();

    /**
     * Set Course Teacher Name
     *
     * @param newCourseTeacherName new Course Teacher Name
     */
    void setCourseTeacherName(String newCourseTeacherName);

    /**
     * Get Course Teacher Name
     *
     * @return Course Teacher Name
     */
    String getCourseTeacherName();

    /**
     * Set Documents ArrayList.
     * İf the Documents ArrayList already set, then Documents ArrayList reset.
     */
    void setDocumentsArrayList();

    /**
     * Get Documents ArrayList
     *
     * @return Documents ArrayList in the System
     */
    ArrayList<AbstractDocument> getDocumentsArrayList();

    /**
     * Set Assignments ArrayList
     * İf the Assignments ArrayList already set, then Assignments ArrayList reset.
     */
    void setAssignmentsArrayList();

    /**
     * Get Assignments ArrayList
     *
     * @return Assignments ArrayList in the System
     */
    ArrayList<AbstractAssignment> getAssignmentsArrayList();

}//end interface Course
