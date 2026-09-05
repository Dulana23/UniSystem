/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.add_course;

/**
 *
 * @author ASUS
 */
public class Course {
    
     private String courseCode;
    private String courseName;
    private int credits;
    private int academicYear;
    private  int semester;
    
    
    
    public Course(String courseCode,String courseName,int credits,int academicYear,int semester)
    {
        this.courseCode=courseCode;
        this.courseName=courseName;
        this.credits=credits;
        this.academicYear=academicYear;
        this.semester=semester;
        
    }
    
    public String getCourseCode()
    {
        return courseCode;
    }
    
 public String getCourseName()
 {
     return courseName;
 }
 
 public int getCreadit()
 {   
     
     return credits;
 }
 
 public int getAcademicYear()
         {
             return academicYear;
         }
 
 public  int getsemester()
 {
     return semester;
 }
 
 public void displayDeatils()
 {
      System.out.printf("%-10s %-25s %-8d %-6d %-8d%n",
                courseCode, courseName, credits,academicYear, semester);
 }
}
