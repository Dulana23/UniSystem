



import java.util.ArrayList;

import java.util.Scanner;





public class add_mark {
    



ArrayList<Student> students = new ArrayList<>();



Scanner input = new Scanner(System.in);






public class JavaApplication5 {
    
    
    public void addMarks() {
    
     System.out.println("\n===== ADD MARKS =====");
    
    // Get Student ID
    System.out.print("Enter Student ID: ");
    String studentId = input.nextLine();
    
    
    
    public Student findStudentById(String studentId) {

    for (Student student : students) {

        if (student.getStudentId().equals(studentId)) {
            return student;
        }
    }

    return null;
}
    
    
      // Check student
    Student student = findStudentById(studentId);
    
     if (student == null) {
        System.out.println("Student not found.");
        return;
    }
    
    
     
     
    
    
    
    
    
    
    
    
    
    
  
    
    
    
    
    
    }
 
    public static void main(String[] args) {
        
        
            
             // Check student
    Student student = findStudentById(studentId);
     
    }
    
}