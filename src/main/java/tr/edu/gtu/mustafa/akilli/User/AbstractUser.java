package tr.edu.gtu.mustafa.akilli.User;

/**
 * HW01_131044017_Mustafa_Akilli
 *
 * File:   AbstractUser.java
 *
 * Description:
 *
 * AbstractUser implements User interface
 *
 * @author Mustafa_Akilli
 * @since Tuesday 23 February 2016, 21:07 by Mustafa_Akilli
 */
public abstract class AbstractUser implements User{

    private String userName;
    private String password;

    /**
     * Set User's new username
     *
     * @param newUsername User's new username
     */
    public void setUsername(String newUsername) {userName = new String(newUsername);}

    /**
     * Get Username
     *
     * @return User's username
     */
    public String getUsername() {return userName;}

    /**
     * Set new Password
     *
     * @param newPassword User's new Password
     */
    public void setPassword(String newPassword) {password = new String(newPassword);}

    /**
     * Get User's Password
     *
     * @return User's Password
     */
    public String getPassword() {return password;}
}
