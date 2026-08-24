
package pkg5.viewallcourses;
import java.util.ArrayList;

public class ViewAllCourses {

   
    public static void main(String[] args) {
        
         ArrayList<Course> courses = new ArrayList<>();

         courses.add(new Course("PST12112", "OOP Lab", 2, 1, 2));
        courses.add(new Course("PST12113", "Database Mgt Lab", 3, 1, 2));
        
       System.out.println("=======COURSE LIST======");
       System.out.println();
       System.out.printf("%-10s %-20s %-8s %-6s %-8s%n","Code", "Course Name", "Credits", "Year", "Semester");
       
       for (Course c : courses) {
            System.out.printf("%-10s %-20s %-8d %-6d %-8d%n",
                    c.getCourseCode(), c.getCourseName(),
                    c.getCredits(), c.getAcademicYear(), c.getSemester());
        }
    }
    
}
