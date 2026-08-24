
package pkg5.viewallcourses;


public class Course {
   private String courseCode;
   private String courseName;
   private int credits;
   private int academicYear;
   private int semester;
   
   public Course(String courseCode, String courseName, int credits, int academicYear, int semester){
       this.courseCode = courseCode;
        this.courseName = courseName;
        this.credits = credits;
        this.academicYear = academicYear;
        this.semester = semester;
   }

   public String getCourseCode() {
        return courseCode;
    }
   
   public String getCourseName() {
        return courseName;
    }
   
   public int getCredits() {
        return credits;
    }
   
   public int getAcademicYear() {
        return academicYear;
    }

    public int getSemester() {
        return semester;
    }
   
}

