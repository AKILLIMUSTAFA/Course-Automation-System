package tr.edu.gtu.mustafa.akilli.Document;

/**
 * HW01_131044017_Mustafa_Akilli
 *
 * File:   AbstractDocument
 *
 * Description:
 *
 * AbstractDocument implements Document interface
 *
 * @author Mustafa_Akilli
 * @since Wednesday 24 February 2016, 07:55 by Mustafa_Akilli
 */
public class AbstractDocument implements Document{

    private String documentName;/*Document's Name*/

    /**
     * Set Document Name
     *
     * @param newDocumentName Document's new name
     */
    public void setDocumentName(String newDocumentName) { documentName = new String(newDocumentName);}

    /**
     * Get Document Name
     *
     * @return Document's name
     */
    public String getDocumentName() {return documentName;}
}
