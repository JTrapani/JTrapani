/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package academicsystem;

/**
 *
 * @author JTrapani
 */
class Students extends StudentType {
   
    
    private ContactInfo TempContact = new ContactInfo();
//default constructor
    Students(){
        
    }//end default constructor
    
    
    //get and set methods for tempcontactinfo object
    /**
     * 
     * @param TempoContact 
     * sets temporary contact info object
     */
    public void setTempContact(ContactInfo TempoContact){
        TempContact = TempoContact;
    }//end method
    /**
     * 
     * @return 
     * returns student contact info object
     */
    public ContactInfo getTempContact(){
        return TempContact;
    }//end method
    

        
        
   
    
}//end class Students
