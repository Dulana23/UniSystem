/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unisystem;

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
public class FileManager {
    
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
   
   public void readAllStudents(){
   
        File file = new File(studentfilePath);
         
        if(!file.exists() || file.length() ==0){
            System.out.println("\n No student records founf in " +studentfilePath);
            return;
            
        }
        
        System.out.println("====== Student List =====");
        
        try(BufferedReader bufferReader = new BufferedReader(new FileReader(file))){
            String line;
            boolean isHeader = true;
            
            while ((line = bufferReader.readLine()) !=null) {                
                  if(line.trim().isEmpty()){
                      continue;
                  }
                  
                  if(isHeader){
                      isHeader =false;
                      continue;
                  
                  }
                  
                  String data[] = line.split(",");
                  
                  if(data.length >=8){
                      System.out.println("Student Id   - " +data[0]);
                      System.out.println("Name         - " + data[3]);
                      System.out.println("Degree       - " + data[4]);
                      System.out.println("Year         - " +data[5]);
                      System.out.println("Semester     - "+data[6]);
                      
                      System.out.println("---------------------------------------");
                  }
            }
            
        
        }catch(IOException e){
             System.out.println("Data couldn't loaded");
        }
   
   }
   
   public void searchStudentyId(String searchedId){
            
          File file = new File(studentfilePath);
   
          if(!file.exists() || file.length() ==0) {
              System.out.println("Data Not Founded");
              return;
              
          }
          
          boolean found = false;
          
          try(BufferedReader bufferReader = new BufferedReader(new FileReader(file))){
              String  line;
              
              while ((line = bufferReader.readLine()) !=null) {                  
                   if(line.trim().isEmpty()){
                       continue;
                   }
                   
                   String data[] = line.split(",");
                   
                   if(data.length >= 8 && data[0].trim().equalsIgnoreCase(searchedId.trim())){
                          System.out.println("\n======= STUDENT FOUND ======");
                          System.out.println("Student Id :- " +data[0]);
                          System.out.println("Name       :- " +data[3]);
                          System.out.println("Degree     :- " +data[4]);
                          System.out.println("Year       :- " +data[5]);
                          System.out.println("Semester   :- " +data[6]);
                         found = true;
                          break;
                   }
                   System.out.println("Student not found ");
              }
                  
          
          }catch(FileNotFoundException e){
              System.out.println("Fill not found ");
          }catch(IOException e){
               System.out.println("Could not be loaded");
          
          }
   
   }
   
   public void saveCourseData(Course course){
                File file = new File(coursefilePath);
                Boolean isNewFile = !file.exists() || file.length()==0;
                
                try(BufferedWriter bufferWriter = new BufferedWriter(new FileWriter(file,true))){
                        
                    if(isNewFile){
                         String header = "courseCode,courseName,credits,academicYear,semester";
                        bufferWriter.write(header);
                        bufferWriter.newLine();
                    
                    }
                    
                    String courseData = course.getCourseCode()+","+
                                        course.getCourseName()+","+
                                        course.getCredits() +","+
                                        course.getAcademicYear() +","+
                                        course.getSemester();
                    
                     bufferWriter.write(courseData);
                     bufferWriter.newLine();
                     bufferWriter.close();
                     System.out.println("\nCourse add successful");
                             
                }catch (FileNotFoundException e){
                    System.out.println("File could not found");
                }catch (IOException e){
                    System.out.println("could not write file");
                }
   
   
   }
   
    public void readAllCourses() {
        
           File file = new File(coursefilePath);
           Boolean isFile = !file.exists() || file.length() == 0;
           
             boolean found = false;
             
           if(isFile){
                  System.out.println("No courses in file");
                  return;
                  
                  
            }
           
           System.out.println("====== COURSES LIST ======");
               
           try(BufferedReader reader = new BufferedReader(new FileReader(file))){
           
               String line;
                
                while ((line = reader.readLine()) !=null) {                
                  if(line.trim().isEmpty()){
                      continue;
                  }
                  
                 
                  
                  String data[] = line.split(",");
                  
                  if(data.length >=8){
                      System.out.println("Course Code   - " +data[0]);
                      System.out.println("Course Name   - " +data[1]);
                      System.out.println("Credits       - " +data[2]);
                      System.out.println("Year          - " +data[3]);
                      System.out.println("Semester      - " +data[4]);
                      
                      System.out.println("---------------------------------------");
                  }
            }
            
           }catch (FileNotFoundException e){
                    System.out.println("File could not found");
           
           }catch(IOException e){
                     System.out.println("Could not be loaded");
           }
    }
}
