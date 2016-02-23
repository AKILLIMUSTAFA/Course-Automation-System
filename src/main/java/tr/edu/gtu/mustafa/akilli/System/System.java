package tr.edu.gtu.mustafa.akilli.System;

import tr.edu.gtu.mustafa.akilli.User.User;
import java.util.ArrayList;

/**
 * HW01_131044017_Mustafa_Akilli
 *
 * File:   System Interface
 *
 * Description:
 *
 * System have users.
 *
 * @author Mustafa_Akilli
 * @since Sunday 22 February 2016, 20:46 by Mustafa_Akilli
 */
public interface System {

    /**
     * Set Users ArrayList.
     * İf the Users ArrayList already set, then Users ArrayList reset.
     */
    void setUsersArrayList();

    /**
     * Get Users ArrayList
     *
     * @return Users ArrayList in the System
     */
    ArrayList<User> getUsersArrayList();

    /**
     * User Register to System.
     * Add element into Users ArrayList.
     */
    void userRegister();

}//end interface System
