package unisystem;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.File;
import java.io.FileReader;
/**
 *
 * @author dulan
 */
public class FileManager1 {
      String studentfilePath = "students.txt";
      String coursefilePath = "course.txt";
      
    public void saveStudentData(Student student){
               
       File file = new File(studentfilePath);
       boolean isNewFile = !file.exists() || file.length() ==0;
       
       try( BufferedWriter bufferWriter = new BufferedWriter(new FileWriter(file, true))){
       
        
          if(isNewFile){
              String header = "studentId,registrationNumber,indexNumber,name,degreeProgram,currentYear,currentSemester,email";
              bufferWriter.write(header);
              bufferWriter.newLine();
          }
          
          String studentData = student.getStudentId() + "," +
                               student.getRegistrationNumber() +","+
                               student.getIndexNumber() +","+
                               student.getName()+","+
                               student.getDegreeProgram()+","+
                               student.getCurrentYear()+","+
                               student.getCurrentSemester()+","+
                               student.getEmail();
          
           bufferWriter.write(studentData);
           bufferWriter.newLine();
           System.out.println("Student Add Successfuly");
           
    }catch(FileNotFoundException e){
           System.out.println("Could not locate file location"); 
        
    }catch(IOException e){
           System.out.println("could not write file");

    }
   
     
   }
    
    
}
