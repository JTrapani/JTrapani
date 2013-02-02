/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package academicsystem;
//import statements
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author JTrapani
 */
public class ProcessFiles {
    /**
     * 
     * @param StudentList
     * @throws FileNotFoundException 
     * this method processes the information found in the student txt file
     * and creates student objects with the data. It then stores all objects
     * into the Students ArrayList
     */
    public void processStudentFile(ArrayList <Students> StudentList) throws FileNotFoundException{
      //declare variables
        String[] saStudentTokens = null; 
        String sNextLine = null; 
        String sStudentFile =  null;
        Scanner StudentsIn = null;
        Students newStudent = null;
        ContactInfo TempoContact = null;
        ContactInfo PermaContact = null;
        //open file
        sStudentFile = ("Students.txt");
        
        //create scanner object
        StudentsIn = new Scanner(new File(sStudentFile));
        
        //while loop to read all data in from file
        while(StudentsIn.hasNext()){
            
            //read next line from file
            sNextLine = StudentsIn.nextLine();
            
            //split tokens
            saStudentTokens = sNextLine.split(";");
            
            //create instance of Student object and assign attributes from string array
            
            newStudent = new Students();
            
            newStudent.setMemberID(saStudentTokens[0]);
            newStudent.setFName(saStudentTokens[1]);
            newStudent.setLName(saStudentTokens[2]);
            //create perm contactinfo object
            PermaContact = new ContactInfo(saStudentTokens[3], saStudentTokens[4], saStudentTokens[5],
                    saStudentTokens[6],saStudentTokens[7],saStudentTokens[13]);
            newStudent.setContactInfo(PermaContact);
            //create temp contact info object
            TempoContact = new ContactInfo(saStudentTokens[8], saStudentTokens[9], saStudentTokens[10], saStudentTokens[11],
                    saStudentTokens[12], saStudentTokens[13]);
            newStudent.setTempContact(TempoContact);
            newStudent.setMajorID(saStudentTokens[14]);
            newStudent.setGradDate(saStudentTokens[15]);
            
            //add Student to Arraylist of Students
            StudentList.add(newStudent);
            
     
        }//end while loop
}//end method ProcessStudentFile
    /**
     * 
     * @param FacultyList
     * @throws FileNotFoundException 
     * this method processes the information found in the faculty txt file
     * and creates faculty objects with the data. It then stores all objects
     * into the Faculty ArrayList
     */
    public void ProcessFacultyFile(ArrayList<Faculty> FacultyList) throws FileNotFoundException{
        //declare variables
        String[] saFacultyTokens = null;
        String sNextLine = null;
        String sFacultyFile = null;
        Scanner FacultyIn = null;
        int nSalary = 0;
        Faculty newFaculty = null;
        ContactInfo FacultyContact = null;
        
        //locate and define faculty info file
        sFacultyFile = ("Faculty.txt");
        
        //create scanner object
        FacultyIn = new Scanner(new File(sFacultyFile));
        
        while(FacultyIn.hasNext()){
            //read data from file
            sNextLine = FacultyIn.nextLine();
            
            //split tokens
            saFacultyTokens = sNextLine.split(";");
            
            //parse string to int for salary
            nSalary = Integer.parseInt(saFacultyTokens[5]);
            
            //new Faculty object
            newFaculty = new Faculty();
            
            //use Faculty methods to set attributes of Faculty object
            newFaculty.setMemberID(saFacultyTokens[0]);
            newFaculty.setFName(saFacultyTokens[1]);
            newFaculty.setLName(saFacultyTokens[2]);
            newFaculty.setHireDate(saFacultyTokens[3]);
            newFaculty.setTitle(saFacultyTokens[4]);
            newFaculty.setSalary(nSalary);
            //create contactinfo object using overloaded constructor
            FacultyContact = new ContactInfo(saFacultyTokens[6], saFacultyTokens[7], saFacultyTokens[8], saFacultyTokens[9]
                    , saFacultyTokens[10], saFacultyTokens[11]);
            newFaculty.setContactInfo(FacultyContact);
            newFaculty.setDeptID(saFacultyTokens[12]);
            
            //add new faculty object to arraylist
            FacultyList.add(newFaculty);
            
        }//end while loop
    }//end method ProcessFacultyFile
    /**
     * 
     * @param AlumnusList
     * @throws FileNotFoundException 
     * this method processes the information found in the Alumni txt file
     * and creates Alumni objects with the data. It then stores all objects
     * into the Alumni ArrayList
     */
    public void ProcessAlumnusFile(ArrayList<Alumnus> AlumnusList) throws FileNotFoundException{
        //declare variables
        String[] saAlumniTokens = null;
        String sNextLine = null;
        String sAlumniFile = null;
        Scanner AlumnusIn = null;
        Alumnus newAlumnus = null;
        int nDonate = 0;
        ContactInfo AlumContact = null;
        
        
        //locate alumnus file
        sAlumniFile = ("Alumni.txt");
        
        //create scanner object
        AlumnusIn = new Scanner(new File(sAlumniFile));
        
        while(AlumnusIn.hasNext()){
            //read line from file
            sNextLine = AlumnusIn.nextLine();
            
            //split tokens into array
            saAlumniTokens = sNextLine.split(";");
            
            //create new Alumnus object
            newAlumnus = new Alumnus();
            
            //parse int
            nDonate = Integer.parseInt(saAlumniTokens[11]);
            
            //use Alumnus methods to set attributes for Alumnus object
            newAlumnus.setMemberID(saAlumniTokens[0]);
            newAlumnus.setFName(saAlumniTokens[1]);
            newAlumnus.setLName(saAlumniTokens[2]);
            //create contactinfo object using overloaded constructor
            AlumContact = new ContactInfo(saAlumniTokens[3], saAlumniTokens[4], saAlumniTokens[5], saAlumniTokens[6],
                    saAlumniTokens[7], saAlumniTokens[8]);
            newAlumnus.setContactInfo(AlumContact);
            newAlumnus.setMajorID(saAlumniTokens[9]);
            newAlumnus.setGradDate(saAlumniTokens[10]);
            newAlumnus.setDonation(nDonate);
            newAlumnus.setEmployer(saAlumniTokens[12]);
            
            //add newAlumnus to AlumnusList
            AlumnusList.add(newAlumnus);
            
        }//end while loop
    }//end method ProcessAlumnusFile
    
}//end class ProcessFiles

