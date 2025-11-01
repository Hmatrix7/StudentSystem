import java.util.ArrayList;
import java.util.List;

class Lecturer extends Person {
    List<String> assignedCourses;

    public Lecturer(String id, String name) {
        super(id, name);
        this.assignedCourses = new ArrayList<>();
    }

    public void assignCourse(String courseId) {
        if (assignedCourses.size() < 2) {
            assignedCourses.add(courseId);
        }
    }
}
