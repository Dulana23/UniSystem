

public class add_mark {
    


    // Result class
    static class Result {
        private  String studentId;
        private String courseCode;
        private int academicYear;
        private int semester;
        private double marks;
        private String grade;
        private double gradePoint;

        public Result(String studentId, String courseCode, int academicYear,
                       int semester, double marks, String grade, double gradePoint) {
            this.studentId = studentId;
            this.courseCode = courseCode;
            this.academicYear = academicYear;
            this.semester = semester;
            this.marks = marks;
            this.grade = grade;
            this.gradePoint = gradePoint;
        }

        public String getStudentId() { 
            return studentId; 
        }
        public String getCourseCode() { 
            return courseCode; 
        }
        public int getAcademicYear() { 
            return academicYear; 
        }
        public int getSemester() {
            return semester; 
        }
        public double getMarks() {
            return marks; 
        }
        public String getGrade() { 
            return grade; 
        }
        public double getGradePoint() { 
            return gradePoint; 
        }
    }

    // Grade calculate 
    static String calculateGradeLetter(double marks) {
        if (marks >= 85){
            return "A";
        }
        if (marks >= 75){ 
            return "B+";
        }
        if (marks >= 70) {
            return "B";
        }
        if (marks >= 65){
            return "C+";
        }
        if (marks >= 60) {
            return "C";
        }
        if (marks >= 55){
            return "D+";
        }
        if (marks >= 50) {
            return "D";
        }
        return "E";
    }

    static double calculateGradePointValue(double marks) {
        String grade = calculateGradeLetter(marks);
         switch (grade) {
            case "A" : 
                return 4.0;
            case "B+" :
                return 3.7;
            case "B" : 
                return 3.3;
            case "C+" :
                return 3.0;
            case "C" : 
                return 2.7;
            case "D+" : 
                return 2.3;
            case "D" : 
                return 2.0;
            default : 
                 return 0.0;
        }
    }

    // addMarks method
    public void addMarks(String studentId, String courseCode, double marks) {

        Student student = findStudent(studentId);
        if (student == null) {
            System.out.println("Error: A student must exist before marks are added.");
            return;
        }

        Course course = findCourse(courseCode);
        if (course == null) {
            System.out.println("Error: A course must exist before marks are added.");
            return;
        }

        if (marks < 0 || marks > 100) {
            System.out.println("Error: Marks must be between 0 and 100.");
            return;
        }

        if (resultExists(studentId, courseCode)) {
            System.out.println("Error: This student already has marks recorded for this course.");
            return;
        }

        String grade = calculateGradeLetter(marks);
        double gradePoint = calculateGradePointValue(marks);

        // course year/semester automatic copy 
        results.add(new Result(studentId, courseCode, course.getAcademicYear(),
                course.getSemester(), marks, grade, gradePoint));

        System.out.println("Marks added successfully.");
        System.out.println("Grade : " + grade);
        System.out.println("Grade Point : " + gradePoint);
    }

    private boolean resultExists(String studentId, String courseCode) {
        for (Result r : results) {
            if (r.getStudentId().equals(studentId) && r.getCourseCode().equals(courseCode)) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        
    }
}

