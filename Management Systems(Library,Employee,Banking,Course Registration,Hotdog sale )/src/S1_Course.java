public class S1_Course {
    private int courseId , credit_hour;
    private String courseName;

    public S1_Course(int courseId, int credit_hour, String courseName) {
        this.courseId = courseId;
        this.credit_hour = credit_hour;
        this.courseName = courseName;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public int getCredit_hour() {
        return credit_hour;
    }

    public void setCredit_hour(int credit_hour) {
        this.credit_hour = credit_hour;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
}
