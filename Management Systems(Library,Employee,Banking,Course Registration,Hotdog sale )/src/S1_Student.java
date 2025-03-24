import java.util.ArrayList;
import java.util.List;

public class S1_Student {
    private int studentId;
    private String name;
    private List<S1_Course> courses;

    public S1_Student(int studentId, String name) {
        this.studentId = studentId;
        this.name = name;
        this.courses = new ArrayList<>();
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<S1_Course> getCourses() {
        return courses;
    }

    public void setCourses(List<S1_Course> courses) {
        this.courses = courses;
    }
    public void registerCourse(S1_Course course) {
        courses.add(course);
        System.out.println(name + " registered for " + course.getCourseName());
    }

    public void displayCourses() {
        System.out.println("Courses registered by " + name + ":");
        for (S1_Course c : courses) {
            System.out.println("- " + c.getCourseName() + " (" + c.getCredit_hour() + " credit hours)");
        }
    }
}
