/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package academicsystem;

/**
 *
 * @author JTrapani
 */
public class FAUMember extends ContactInfo{
    //declare variables
    public String sMemberID = null;
    public String sFName = null;
    public String sLName = null;
    public ContactInfo ContactInfo = null;

    //default constructor
    FAUMember(){
    
    }//end default constructor
    
    //begin get and set methods
    /**
     *
     * @param sMemID
     */
    public void setMemberID(String sMemID){
        sMemberID = sMemID;
    }//end method
    /**
     *
     * @return
     */
    public String getMemberID(){
        return sMemberID;
    }//end method
    /**
     *
     * @param FName
     */
    public void setFName(String FName){
        sFName = FName;
    }//end method
    /**
     *
     * @return
     */
    public String getFName(){
        return sFName;
    }//end method
    /**
     *
     * @param LName
     */
    public void setLName(String LName){
        sLName = LName;
    }//end method
    /**
     *
     * @return
     */
    public String getLName(){
        return sLName;
    }//end method
    /**
     *
     * @param Contact
     */
    public void setContactInfo(ContactInfo Contact){
        ContactInfo = Contact;
    }//end method
    /**
     *
     * @return
     */
    public ContactInfo getContactInfo(){
        return ContactInfo;
    }//end method
}//end class FAUMember
