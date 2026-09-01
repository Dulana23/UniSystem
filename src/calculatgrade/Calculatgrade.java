/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculatgrade;

import java.util.Scanner;


public class Calculatgrade {
    
        public static void main(String[] args) {
            
            Scanner sc = new Scanner(System.in);
            
            System.out.print("Enter marks: ");
            double marks =sc.nextDouble();
            
         calculateGrade(marks);
         
        }   
         static String getGrade(double marks){
              if (marks >= 90)
                  return "A+";
              if (marks >= 80 && marks <= 89)
                  return "A";
              if (marks >= 75 && marks <= 79) 
                  return "A-";
              if (marks >= 70 && marks <= 74) 
                  return "B+";
              if (marks >= 65 && marks <= 69) 
                  return "B";
              if (marks >= 60 && marks <= 64) 
                  return "B-";
              if (marks >= 55 && marks <= 59) 
                  return "C+";
              if (marks >= 50 && marks <= 54) 
                  return "C";
              if (marks >= 45 && marks <= 49) 
                  return "C-";
              if (marks >= 40 && marks <= 44) 
                  return "D+";
              if (marks >= 30 && marks <= 39) 
                  return "D";
              return "E";
         
         }
         
         
         static double getGPA(double marks){
             
           String grade = getGrade(marks);
           
           switch(grade){
           case "A+":
                return 4.00;
            case "A":
                return 4.00;
            case "A-":
                return 3.70;      
            case "B+":
                return 3.30;
            case "B":
                return 3.00;
            case "B-":
                return 2.70;
            case "C+":
                return 2.30;
            case "C":
                return 2.00;
            case "C-":
                return 1.70;
            case "D+":
                return 1.30;
            case "D":
                return 1.00;
            default:
                return 0.00;
        }               
             
           }
         
             
        public static void calculateGrade(double marks){
           if(marks < 0 || marks > 100){
           System.out.println("Invalid Marks! Please enter marks between 0 and 100");
           return;
           }
            
         String grade=getGrade(marks);
         double gpa=getGPA(marks);
         

         System.out.println("Grade:" +grade);
         System.out.println("GPA:" +gpa);
        }  
         
         }
            