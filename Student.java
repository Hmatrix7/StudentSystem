import java.util.HashMap;
import java.util.Map;

class Student extends Person {
    Map<String, Integer> courseScores;
    String programme;

    public Student(String id, String name, String programme) {
        super(id, name);
        this.programme = programme;
        this.courseScores = new HashMap<>();
    }

    public void assignScore(String courseId, int score) {
        courseScores.put(courseId, score);
    }
}