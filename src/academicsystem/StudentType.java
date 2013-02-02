/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package academicsystem;

/**
 *
 * @author JTrapani
 */
public class StudentType extends FAUMember {
    //declare variables
    private String sGradDate = null;
    private String sMajorID = null;
    
    //default Constructor
    StudentType(){
    
    }//end default constructor
    
//begin get and set methods    
    /**
     *
     * @param GradDate
     */
    public void setGradDate(String GradDate){
    sGradDate = GradDate;
}//end method
    /**
     *
     * @return
     */
    public String getGradDate(){
    return sGradDate;
}//end method
    /**
     *
     * @param Major
     */
    public void setMajorID(String Major){
    sMajorID = Major;
}//end method
    /**
     *
     * @return
     */
    public String getMajorID(){
    return sMajorID;
}//end method
}//end class StudentType
