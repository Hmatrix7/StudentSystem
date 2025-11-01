import java.io.Serializable;

class Course implements Serializable {
    String courseId, courseName;

    public Course(String courseId, String courseName) {
        this.courseId = courseId;
        this.courseName = courseName;
    }
}