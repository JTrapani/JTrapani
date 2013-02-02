/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package academicsystem;

/**
 *
 * @author JTrapani
 */
class ContactInfo {
    //declare variables
    private String sStreet = null;
    private String sCity = null;
    private String sState = null;
    private String sZip = null;
    private String sPhone = null;
    private String sEmail = null;
    
    
//begin default constructor
    ContactInfo(){
        
    }//end default constructor
    
    //begin constructor with parameters
    ContactInfo(String Street, String City, String State, String Zip, String Phone, String Email){
        sStreet = Street;
        sCity = City;
        sState = State;
        sZip = Zip;
        sPhone = Phone;
        sEmail = Email;
    }//end constructor with parameters
    
    
    
//begin get and set methods for contactinfo objects
/**
 * 
 * @param sStrt 
 */    
public void setStreet(String sStrt){
    sStreet = sStrt;
}//end setStreet method
/**
 * 
 * @return 
 */
public String getStreet (){
    return sStreet;
}//end getStreet method
/**
 * 
 * @param sCty 
 */
public void setCity(String sCty){
    sCity = sCty;
}//end setCity method
/**
 * 
 * @return 
 */
public String getCity(){
    return sCity;
}//end method getCity
/**
 * 
 * @param sSt 
 */
public void setState(String sSt){
    sState = sSt;
}//end method setState
/**
 * 
 * @return 
 */
public String getState(){
    return sState;
}//end method
/**
 * 
 * @param sZipCode 
 */
public void setZip(String sZipCode){
    sZip = sZipCode;
}//end method setZip
/**
 * 
 * @return 
 */
public String getZip(){
    return sZip;
}//end method getZip
/**
 * 
 * @param Phone 
 */
public void setPhone (String Phone){
    sPhone = Phone;
}//end method
/**
 * 
 * @return 
 */
public String getPhone(){
    return sPhone;
}//end method
/**
 * 
 * @param Email 
 */
public void setEmail(String Email){
    sEmail = Email;
}//end method
/**
 * 
 * @return 
 */
public String getEmail(){
    return sEmail;
}//end method


    
}//end class ContactInfo
