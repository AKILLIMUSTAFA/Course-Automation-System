package tr.edu.gtu.mustafa.akilli.cse222;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;


/**
 * HW01_131044017_Mustafa_Akilli
 *
 * File:   AppTest.java
 *
 * Description:
 *
 * Unit test for simple App.
 *
 * @author Mustafa_Akilli
 * @since Sunday 21 February 2016, 16:06 by Mustafa_Akilli
 */
public class AppTest extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
}
