/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package academicsystem;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author JTrapani
 */
public class AcademicSystem {
        static ArrayList<Students> StudentList = new ArrayList<>();//create arraylist for students
        static ArrayList<Faculty> FacultyList = new ArrayList<>();//create arraylist for faculty
        static ArrayList<Alumnus> AlumnusList = new ArrayList<>();//create arraylist for alumnus
    /**
     * @param args the command line arguments
     * this method processes the file information and stores it to memory, then it
     * displays the user menu and prompts user for a selection, then uses the user 
     * selection to pass control to the appropriate class 
     */
    public static void main(String[] args) throws FileNotFoundException {
        //declare variables
        int nMenuOption = 0;
        final int SENTINEL = 6;
        ProcessFiles start = new ProcessFiles();
        PrintInfo option = new PrintInfo();
        Scanner input = new Scanner(System.in);//declare scanner object
        start.ProcessAlumnusFile(AlumnusList);
        start.ProcessFacultyFile(FacultyList);
        start.processStudentFile(StudentList);
        
        do{
            
        // design for menu options / prompt user for input
        System.out.println("ACADEMIC SYSTEM MENU");
        System.out.println("1. View faculty member information");
        System.out.println("2. View student information");
        System.out.println("3. View alumnus information");
        System.out.println("4. View Member Information");
        System.out.println("5. View Student Information (Graduation date, major)");
        System.out.println("6. Exit");
        System.out.print("Please select a menu option: ");
        
        //get input from user
        nMenuOption = input.nextInt();
        
        //switch statement for menu options
        switch (nMenuOption){
            case 1:
                option.printFacultyInfo(FacultyList);
                break;
            case 2:
                option.printStudentInfo(StudentList);
                break;
            case 3:
                option.printAlumnusInfo(AlumnusList);
                break;
            case 4:
                option.printMemberInfo(AlumnusList, FacultyList, StudentList);
                break;
            case 5:
                option.printStudentMajor_GradDate(StudentList, AlumnusList);
                break;
            case 6:
                System.out.println("Exiting Program. Good-Bye.");
                break;
            default:
              System.out.println("Invalid menu option, please try again.");//error message for invalid choices
        }//end switch sMenuOption
            
        }while(nMenuOption != SENTINEL); //end do...while loop when user chooses exit option
    }//end main method
}//end class Academic System
