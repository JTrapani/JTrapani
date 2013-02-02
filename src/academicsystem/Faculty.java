/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package academicsystem;

/**
 *
 * @author JTrapani
 */
class Faculty extends FAUMember {
    private String sHireDate = null;
    private String sTitle = null; 
    private int nSalary = 0;
    private String sDeptID = null;
    
    //default constructor
    Faculty(){
        
    }//end default constructor
    
    
 
    
    //begin get and set methods
    /**
     * 
     * @param sHire 
     */
    public void setHireDate(String sHire){
        sHireDate = sHire;
    }//end method
    /**
     * 
     * @return 
     */
    public String getHireDate(){
        return sHireDate;
    }//end method
    /**
     * 
     * @param Title 
     */
    public void setTitle(String Title){
        sTitle = Title;
    }//end method
    /**
     * 
     * @return 
     */
    public String getTitle(){
        return sTitle;
    }//end method
    /**
     * 
     * @param Salary 
     */
    public void setSalary (int Salary){
        nSalary = Salary;
    }//end method
    /**
     * 
     * @return 
     */
    public int getSalary(){
        return nSalary;
    }//end method
    /**
     * 
     * @param DeptID 
     */
    public void setDeptID(String DeptID){
        sDeptID = DeptID;
    }//end method
    /**
     * 
     * @return 
     */
    public String getDeptID(){
        return sDeptID;
    }//end method
    
    
    
}//end class Faculty
