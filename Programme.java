import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

class Programme implements Serializable {
    String programmeId, programmeName;
    List<String> courses;

    public Programme(String programmeId, String programmeName) {
        this.programmeId = programmeId;
        this.programmeName = programmeName;
        this.courses = new ArrayList<>();
    }

    public void attachCourse(String courseId) {
        courses.add(courseId);
    }
}