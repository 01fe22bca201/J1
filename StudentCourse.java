 package J1;

import java.util.HashMap;
import java.util.Map;

public class StudentCourse {
   private String studentName;
   private String program;
   private String semester;
   private Map<String, Integer> marks;

   public StudentCourse(String studentName, String program, String semester) {
       this.studentName = studentName;
       this.program = program;
       this.semester = semester;
       this.marks = new HashMap<>();
   }

   public void registerCourse(String courseName, int mark) {
       marks.put(courseName, mark);
   }

   public void retrieveCourseDetails() {
       System.out.println("Student: " + studentName);
       System.out.println("Program: " + program);
       System.out.println("Semester: " + semester);
       System.out.println("Courses Registered:");
       for (String course : marks.keySet()) {
           System.out.println(course);
       }
   }

   public void retrieveLowMarksCourses() {
       System.out.println("Courses with marks less than 40:");
       for (Map.Entry<String, Integer> entry : marks.entrySet()) {
           if (entry.getValue() < 40) {
               System.out.println(entry.getKey() + ": " + entry.getValue());
           }
       }
   }
       public static void main(String[] args) {
           // Create a StudentCourse object
           StudentCourse student1 = new StudentCourse("John", "Engineering", "4TH");
   
           // Register courses for student1
           student1.registerCourse("Math", 80);
           student1.registerCourse("Physics", 35);
           student1.registerCourse("Chemistry", 45);
   
           // Retrieve and display student details
           System.out.println("Retrieving Student Details:");
           student1.retrieveCourseDetails();
   
           // Retrieve and display courses with marks less than 40
           System.out.println("\nRetrieving Courses with Marks Less Than 40:");
           student1.retrieveLowMarksCourses();
       }
   }
  