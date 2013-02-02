/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package academicsystem;

/**
 *
 * @author JTrapani
 */
class Alumnus extends StudentType {
    //declare variables
    private int nDonation = 0;
    private String sEmployer = null;
    
    //default constructor
    Alumnus(){
        
    }//end default constructor
    
    //begin get and set methods for Alumnus object
    /**
     * 
     * @param nDonate 
     */
    public void setDonation(int nDonate){
        nDonation = nDonate;
    }//end method
    /**
     * 
     * @return 
     */
    public int getDonation(){
        return nDonation;
    }//end method
    /**
     * 
     * @param Employer 
     */
    public void setEmployer(String Employer){
        sEmployer = Employer;
    }//end method
    /**
     * 
     * @return 
     */
    public String getEmployer(){
        return sEmployer;
    }//end method
}//end class Alumnus
