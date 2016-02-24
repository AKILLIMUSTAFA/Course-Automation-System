package tr.edu.gtu.mustafa.akilli.Course;

/**
 * HW01_131044017_Mustafa_Akilli
 *
 * File:   CourseClass
 *
 * Description:
 *
 * CourseClass extends AbstractCourse
 *
 * @author Mustafa_Akilli
 * @since Wednesday 24 February 2016, 17:19 by Mustafa_Akilli
 */
public class CourseClass extends AbstractCourse{

    /**
     * CourseClass two parameters constructor
     *
     * @param newCourseName        new Course's Name
     * @param newCourseTeacherName new Course Teacher's Name
     */
    public CourseClass(String newCourseName, String newCourseTeacherName) {
        super(newCourseName, newCourseTeacherName);
    }
}
