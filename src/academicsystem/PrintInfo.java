/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package academicsystem;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author JTrapani
 */
public class PrintInfo {
    //declare variables
    private int nCount = 0;
    private String sMemberIDIn = null;
    
    
    /**
     *
     * @param StudentList
     * this method prompts user for student ID, matches/validates ID entered
     * and displays all student information to the screen
     */
    public void printStudentInfo(ArrayList<Students> StudentList){
    //declare variables
    boolean bStudentFound = false;
    //prompt user for member id
    sMemberIDIn = JOptionPane.showInputDialog(null, "Please enter the Student's Member ID", "Academic System",
            JOptionPane.QUESTION_MESSAGE);
    //reset nCount
    nCount = 0;
    //begin while loop to match member id
    while(nCount < StudentList.size() && !bStudentFound){
        if(sMemberIDIn.equalsIgnoreCase(StudentList.get(nCount).getMemberID())){
           System.out.println("Student ID Found!");
            System.out.println("Student ID: " + StudentList.get(nCount).getMemberID());
            System.out.println("Student Name: " + StudentList.get(nCount).getFName() + " " + StudentList.get(nCount).getLName());
            System.out.println("Permanent Address: " + StudentList.get(nCount).getContactInfo().getStreet() + " " + 
                    StudentList.get(nCount).getContactInfo().getCity() + ", " + StudentList.get(nCount).getContactInfo().getState()
                    + " " + StudentList.get(nCount).getContactInfo().getZip());
            System.out.println("Permanent Phone: " + StudentList.get(nCount).getContactInfo().getPhone());
            System.out.println("Email: " + StudentList.get(nCount).getContactInfo().getEmail());
            System.out.println("Temporary Address: " + StudentList.get(nCount).getTempContact().getStreet() + " " + StudentList.get(nCount).getTempContact().getCity()
                    + ", " + StudentList.get(nCount).getTempContact().getState() + " " + StudentList.get(nCount).getTempContact().getZip());
            System.out.println("Temporary Phone Number: " + StudentList.get(nCount).getTempContact().getPhone());
            System.out.println("Temporary Email: " + StudentList.get(nCount).getTempContact().getEmail());
            System.out.println("Major ID: " + StudentList.get(nCount).getMajorID());
            System.out.println("Expected Graduation Date: " + StudentList.get(nCount).getGradDate());
            bStudentFound = true;
        }//end if
        else{
            nCount++;
        }
    }//end while loop
    if(!bStudentFound){
        System.out.println("Invalid ID entered, please start again.");
    }//end if   
    
}//end method printStudentInfo
    /**
     * 
     * @param FacultyList 
     * this method prompts user for Faculty ID, matches/validates ID entered
     * and displays all Faculty information to the screen
     */
public void printFacultyInfo(ArrayList<Faculty> FacultyList){
    //prompt user for faculty ID
    sMemberIDIn = JOptionPane.showInputDialog(null, "Please enter the Faculty's Member ID", "Academic System",
            JOptionPane.QUESTION_MESSAGE);
    //reset nCount
    nCount = 0;
    //for statement to match entered member id 
    for(nCount = 0; nCount < FacultyList.size() && !sMemberIDIn.equalsIgnoreCase(FacultyList.get(nCount).getMemberID()); nCount++){
        
    }//end for loop
    //if statement to use matched ID and index location to print info to screen
    if(sMemberIDIn.equalsIgnoreCase(FacultyList.get(nCount).getMemberID())){
        System.out.println("Faculty ID found!");
        System.out.println("Faculty ID: " + FacultyList.get(nCount).getMemberID());
        System.out.println("Faculty Name: " + FacultyList.get(nCount).getFName() + " " + FacultyList.get(nCount).getLName());
        System.out.println("Address: " + FacultyList.get(nCount).getContactInfo().getStreet() + " " + 
                    FacultyList.get(nCount).getContactInfo().getCity() + ", " + FacultyList.get(nCount).getContactInfo().getState()
                    + " " + FacultyList.get(nCount).getContactInfo().getZip());
        System.out.println("Phone: " + FacultyList.get(nCount).getContactInfo().getPhone());
        System.out.println("Email: " + FacultyList.get(nCount).getContactInfo().getEmail());
        System.out.println("Department ID: " + FacultyList.get(nCount).getDeptID());
        System.out.println("Hire Date: " + FacultyList.get(nCount).getHireDate());
        System.out.println("Job Title: " + FacultyList.get(nCount).getTitle());
        System.out.println("Salary: $" + FacultyList.get(nCount).getSalary());
    }//end if
    else{//else error statement for non-matched ID
        System.out.println("Faculty ID not found, please start again.");
        
    }//end else no match found
  
}//end method processFacultyInfo
/**
 * 
 * @param AlumnusList
 * this method prompts user for Alumni ID, matches/validates ID entered
 * and displays all Alumni information to the screen 
 */
public void printAlumnusInfo(ArrayList<Alumnus> AlumnusList){
    //declare variables
    boolean bAlumFound = false;
    //prompt user for faculty ID
    sMemberIDIn = JOptionPane.showInputDialog(null, "Please enter the Alumni's Member ID", "Academic System",
            JOptionPane.QUESTION_MESSAGE);
    //reset nCount
    nCount = 0;
    //while loop to find matching location of Member Id entered
    while(nCount < AlumnusList.size() && !bAlumFound){
        
    //if statement to display alumni information from matched id location
    if(sMemberIDIn.equalsIgnoreCase(AlumnusList.get(nCount).getMemberID())){
        System.out.println("Alumni ID found!");
        System.out.println("Alumni Name: " + AlumnusList.get(nCount).getFName() + " " + AlumnusList.get(nCount).getLName());
        System.out.println("Alumni ID: " + AlumnusList.get(nCount).getMemberID());
        System.out.println("Address: " + AlumnusList.get(nCount).getContactInfo().getStreet() + " " + 
                    AlumnusList.get(nCount).getContactInfo().getCity() + ", " + AlumnusList.get(nCount).getContactInfo().getState()
                    + " " + AlumnusList.get(nCount).getContactInfo().getZip());
        System.out.println("Phone: " + AlumnusList.get(nCount).getContactInfo().getPhone());
        System.out.println("Email: " + AlumnusList.get(nCount).getContactInfo().getEmail());
        System.out.println("Major ID: " + AlumnusList.get(nCount).getMajorID());
        System.out.println("Graduation Date: " + AlumnusList.get(nCount).getGradDate());
        System.out.println("Donation Amount: " + AlumnusList.get(nCount).getDonation());
        System.out.println("Current Employer: " + AlumnusList.get(nCount).getEmployer());
        bAlumFound = true;
    }//end if matched id
    else{
        nCount++;
    }//end else
        
    }//end while loop    

    if(!bAlumFound){
        System.out.println("Alumni ID not found, please start again.");
    }//end if no match
   }//end method printAlumnusInfo 
/**
 * 
 * @param AlumnusList
 * @param FacultyList
 * @param StudentList 
 * This method prompts user for any member Id, finds the matching ID,
 * and prints basic member info to the screen (name/contact info)
 */
public void printMemberInfo(ArrayList<Alumnus> AlumnusList, ArrayList<Faculty> FacultyList, ArrayList<Students> StudentList){
    //declare variables
    int nAlumCount = 0;
    int nStudentCount = 0;
    int nFacultyCount = 0;
    boolean bAlumFound = false;
    boolean bStudentFound = false;
    boolean bFacultyFound = false;
    
  //prompt user for member ID
    sMemberIDIn = JOptionPane.showInputDialog(null, "Please enter the Member's ID", "Academic System",
            JOptionPane.QUESTION_MESSAGE);
    //while loop to look for match of general member id in alumnuslist 
    while( nAlumCount < AlumnusList.size()&& !bAlumFound){
        if(sMemberIDIn.equalsIgnoreCase(AlumnusList.get(nAlumCount).getMemberID())){
            FAUMember AlumMember = AlumnusList.get(nAlumCount);
            System.out.println("Member ID Found");
            System.out.println("Member Type: Alumni");
            System.out.println("Member ID: " + AlumMember.getMemberID());
            System.out.println("Member Name: " + AlumMember.getFName() + " " + AlumMember.getLName());
            System.out.println("Address: " + AlumMember.getContactInfo().getStreet() + " " + AlumMember.getContactInfo().getCity() + ", " 
                    + AlumMember.getContactInfo().getState() + " " + AlumMember.getContactInfo().getZip());
            System.out.println("Phone: " + AlumMember.getContactInfo().getPhone());
            System.out.println("Email: " + AlumMember.getContactInfo().getEmail());
            bAlumFound = true;
        }//end if
        else{
            nAlumCount++;
        }//end else
    }//end while loop
    //for loop to match member id entered in studentlist
    while(nStudentCount < StudentList.size() && !bStudentFound){
        if(sMemberIDIn.equalsIgnoreCase(StudentList.get(nStudentCount).getMemberID())){
            FAUMember StudentMember = StudentList.get(nStudentCount);
            System.out.println("Member ID Found!");
            System.out.println("Member type: Student");
            System.out.println("Member ID: " + StudentMember.getMemberID());
            System.out.println("Member Name: " + StudentMember.getFName() + " " + StudentMember.getLName());
            System.out.println("Address: " + StudentMember.getContactInfo().getStreet() + " " + StudentMember.getContactInfo().getCity() + ", " 
                    + StudentMember.getContactInfo().getState() + " " + StudentMember.getContactInfo().getZip());
            System.out.println("Phone: " + StudentMember.getContactInfo().getPhone());
            System.out.println("Email: " + StudentMember.getContactInfo().getEmail());
            bStudentFound = true;
        }//end if
        else{
            nStudentCount++;
        }//end else
        
    }//end while loop
    //while loop to match member id entered in faculty list
    while(nFacultyCount < FacultyList.size() && !bFacultyFound){
       if(sMemberIDIn.equalsIgnoreCase(FacultyList.get(nFacultyCount).getMemberID())){
           FAUMember FacultyMember = FacultyList.get(nFacultyCount);
          System.out.println("Member ID Found!");
          System.out.println("Member type: Faculty"); 
          System.out.println("Member ID: " + FacultyMember.getMemberID());
          System.out.println("Member Name: " + FacultyMember.getFName() + " " + FacultyMember.getLName());
          System.out.println("Address: " + FacultyMember.getContactInfo().getStreet() + " " + FacultyMember.getContactInfo().getCity() + ", " 
                    + FacultyMember.getContactInfo().getState() + " " + FacultyMember.getContactInfo().getZip());
          System.out.println("Phone: " + FacultyMember.getContactInfo().getPhone());
          System.out.println("Email: " + FacultyMember.getContactInfo().getEmail());
          bFacultyFound = true;
       } //end if
       else{
           nFacultyCount++;
       }//end else
    }//end while loop
    if(!bAlumFound && !bStudentFound && !bFacultyFound){
        System.out.println("Invalid ID entered, please start again.");
    }//end if no match found
    
}//end method printMemberInfo
/**
 * 
 * @param StudentList 
 * @param AlumnusList
 * this method prompts user for student ID, matches/validates ID entered
 * and displays only the student graduation date and major ID to the screen
 */
public void printStudentMajor_GradDate(ArrayList<Students> StudentList, ArrayList<Alumnus> AlumnusList){
    //declare variables
    nCount = 0;
    boolean bStudentFound = false;
    int nAlumCount = 0;
    boolean bAlumFound = false;
    sMemberIDIn = JOptionPane.showInputDialog(null, "Please enter the Student's Member ID", "Academic System",
            JOptionPane.QUESTION_MESSAGE);
    //while loop to match member id entered in studentlist
    while(nCount < StudentList.size() && !bStudentFound){
        if(sMemberIDIn.equalsIgnoreCase(StudentList.get(nCount).getMemberID())){
        StudentType newStudent = StudentList.get(nCount);
        System.out.println("Student ID Found!");
        System.out.println("Student ID: " + newStudent.getMemberID());
        System.out.println("Major ID: " + newStudent.getMajorID());
        System.out.println("Expected Graduation Date: " + newStudent.getGradDate());
            bStudentFound = true;
        }//end if
        else{
            nCount++;
        }//end else
        
    }//end while loop
    
    while (nAlumCount< AlumnusList.size() && !bAlumFound){
        if(sMemberIDIn.equalsIgnoreCase(AlumnusList.get(nAlumCount).getMemberID())){
        StudentType newAlumnus = AlumnusList.get(nAlumCount);
        System.out.println("Alumnus ID Found!");
        System.out.println("Alumnus ID: " + newAlumnus.getMemberID());
        System.out.println("Major ID: " + newAlumnus.getMajorID());
        System.out.println("Graduation Date: " + newAlumnus.getGradDate());
        bAlumFound = true;
        }//end if
        else{
            nAlumCount++;
        }//end else
        
    }//end while loop
    if(!bStudentFound && !bAlumFound){//if statement - no match found
        System.out.println("Member ID not found, please start again.");
    }//end if no match
}//end method printStudentMajor_GradDate
}//end Class PrintInfo
