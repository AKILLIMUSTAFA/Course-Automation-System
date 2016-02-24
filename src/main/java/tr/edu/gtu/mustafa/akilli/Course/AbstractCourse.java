package tr.edu.gtu.mustafa.akilli.Course;

import tr.edu.gtu.mustafa.akilli.Assignment.AbstractAssignment;
import tr.edu.gtu.mustafa.akilli.Document.AbstractDocument;

import java.util.ArrayList;

/**
 * HW01_131044017_Mustafa_Akilli
 *
 * File:   AbstractCourse
 *
 * Description:
 *
 * AbstractCourse implements Course
 *
 * @author Mustafa_Akilli
 * @since Wednesday 24 February 2016, 17:19 by Mustafa_Akilli
 */
public abstract class AbstractCourse implements Course{

    private String courseName;/*Course Name */
    private ArrayList<AbstractDocument> documentsArrayList;
    private ArrayList<AbstractAssignment> assignmentsArrayList;

    /**
     * AbstractCourse one parameters constructor
     *
     * @param newCourseName newCourse's Name
     */
    public AbstractCourse(String newCourseName){
        setCourseName(newCourseName);
        setDocumentsArrayList();
        setAssignmentsArrayList();
    }

    /**
     * Set Course Name
     *
     * @param newCourseName Course's new name
     */
    public void setCourseName(String newCourseName) { courseName = new String(newCourseName);}

    /**
     * Get Course Name
     *
     * @return Course's name
     */
    public String getCourseName() {return courseName;}

    /**
     * Set Documents ArrayList.
     * İf the Documents ArrayList already set, then Documents ArrayList reset.
     */
    public void setDocumentsArrayList() { documentsArrayList = new ArrayList<AbstractDocument>();}

    /**
     * Get Documents ArrayList
     *
     * @return Documents ArrayList in the System
     */
    public ArrayList<AbstractDocument> getDocumentsArrayList() {return documentsArrayList;}

    /**
     * Set Assignments ArrayList
     * İf the Assignments ArrayList already set, then Assignments ArrayList reset.
     */
    public void setAssignmentsArrayList() { assignmentsArrayList = new ArrayList<AbstractAssignment>(); }

    /**
     * Get Assignments ArrayList
     *
     * @return Assignments ArrayList in the System
     */
    public ArrayList<AbstractAssignment> getAssignmentsArrayList() {return assignmentsArrayList;}
}
