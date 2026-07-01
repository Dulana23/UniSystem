/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

/**
 *
 * @author dulan
 */

import java.util.Scanner;

public class main {

    static void displayWelcomeMessage(){
         System.out.println("===== UNIVERSITY STUDENT MANAGEMENT SYSTEM =====");
         System.out.println("");
    }
    
    static void loadMainMenu(){
        
        System.out.println(" 1.  Add New Student");
        System.out.println(" 2.  View All Students");
        System.out.println(" 3.  Search Student by ID");
        System.out.println(" 4.  Add Course");
        System.out.println(" 5.  View All Course");
        System.out.println(" 6.  Add Marks For a Student");
        System.out.println(" 7.  Calculate Grade");
        System.out.println(" 8.  Generate Student Report");
        System.out.println(" 9.  Save Data to File ");
        System.out.println(" 10. Load Data from File");
        System.out.println(" 11. Exit ");
        
        System.out.println("");
        
        Scanner scanner1 = new Scanner(System.in);
        
        System.out.println("Enter your Choice : ");
        int choice = scanner1.nextInt();
           
             switch(choice){
                 case 1 :
                     System.out.println("Add New Student");
                     break;
                 case 2 :
                     System.out.println("View All Student");
                     break;
                 case 3 :
                     System.out.println("Search Student by ID");
                     break;
                 case 4 :
                     System.out.println("Add Course");
                     break;
                 case 5 :
                     System.out.println("View All Course");
                     break;
                 case 6:
                     System.out.println("Add Marks For a Student");
                     break;
                 case 7:
                     System.out.println("Calculate Grade");
                     break;
                 case 8:
                     System.out.println("Generate Student Report");
                     break;
                 case 9:
                     System.out.println("Save Data to File");
                     break;
                 case 10:
                     System.out.println("Load Data from File");
                     break;
                 case 11:
                     System.out.println("Thank you! Exiting...");
                     break;
                 default:
                     System.out.println("Invalid Choice");
             }
    }
    
    public static void main(String[] args) {
        displayWelcomeMessage();
        loadMainMenu();
    }
    
}
