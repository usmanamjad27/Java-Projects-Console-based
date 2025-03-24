//Scenario 1: Course Registration System
//A university wants to develop a Course Registration System where students can register for courses.
//The system should have the following:
//         A Student class with attributes studentId, name, and a list of registered courses.
//         A Course class with attributes courseId, courseName, and creditHours.
//         A Registration class that associates students with courses (use Aggregation).
//Problem Statement:
//         Draw a class diagram representing the system.
//         Implement the Student, Course, and Registration classes in Java.
// Demonstrate object creation and interaction in a main method.

public class S1_Course_Registration_system {
    public static void main(String[] args) {
        // Creating Course Objects
        S1_Course course1 = new S1_Course(101, 3,"Java Programming");
        S1_Course course2 = new S1_Course(102, 4,"Data Structures" );
        S1_Course course3 = new S1_Course(103, 4,"Database Management" );

        // Creating Student Objects
        S1_Student student1 = new S1_Student(1, "Usman");
        S1_Student student2 = new S1_Student(2, "Ali");

        // Registering Students for Courses
        student1.registerCourse(course1);
        student1.registerCourse(course2);
        student1.registerCourse(course3);

        student2.registerCourse(course1);
        student2.registerCourse(course3);
        student2.registerCourse(course1); // Duplicate registration test

        // Displaying Registered Courses
        System.out.println();
        student1.displayCourses();
        System.out.println();
        student2.displayCourses();
    }
}

