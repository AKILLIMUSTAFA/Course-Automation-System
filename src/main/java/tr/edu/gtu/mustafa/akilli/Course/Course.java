package tr.edu.gtu.mustafa.akilli.Course;

import tr.edu.gtu.mustafa.akilli.Assignment.Assignment;
import tr.edu.gtu.mustafa.akilli.Document.Document;
import java.util.ArrayList;

/**
 * HW01_131044017_Mustafa_Akilli
 *
 * File:   Course Interface
 *
 * Description:
 *
 * Courses have name, documents and assigments.
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
     * Set Documents ArrayList.
     * İf the Documents ArrayList already set, then Documents ArrayList reset.
     */
    void setDocumentsArrayList();

    /**
     * Get Documents ArrayList
     *
     * @return Documents ArrayList in the System
     */
    ArrayList<Document> getDocumentsArrayList();

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
    ArrayList<Assignment> getAssignmentsArrayList();

}//end interface Course
