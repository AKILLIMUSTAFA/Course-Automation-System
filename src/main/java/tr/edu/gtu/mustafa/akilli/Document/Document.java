package tr.edu.gtu.mustafa.akilli.Document;

/**
 * HW01_131044017_Mustafa_Akilli
 *
 * File:   Document Interface
 *
 * Description:
 *
 * The Documents can be in different formats like books, files, slides, urls and whiteboard descriptions.
 * Documents have a name.
 *
 * @author Mustafa_Akilli
 * @since Sunday 22 February 2016, 22:46 by Mustafa_Akilli
 */
public interface Document {

    /**
     * Set Document Name
     *
     * @param newDocumentName Document's new name
     */
    void setDocumentName(String newDocumentName);

    /**
     * Get Document Name
     *
     * @return Document's name
     */
    String getDocumentName();

}//end interface Document
