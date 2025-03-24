public class S1_Registration {

    private S1_Student student;
    private S1_Course course;

    public S1_Registration(S1_Student student, S1_Course course) {
        this.student = student;
        this.course = course;
        student.registerCourse(course);
    }
}

