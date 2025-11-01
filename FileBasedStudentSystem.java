import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileBasedStudentSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String filename = "students.dat";

        // Sample student records
        List<Student> students = new ArrayList<>();
        students.add(new Student("S001", "John Doe", "Computer Science"));
        students.add(new Student("S002", "Jane Smith", "Information Technology"));
        students.add(new Student("S003", "Alice Brown", "Software Engineering"));

        // Assigning scores
        students.get(0).assignScore("CS101", 85);
        students.get(0).assignScore("CS102", 90);
        students.get(1).assignScore("IT101", 78);
        students.get(2).assignScore("SE101", 92);

        // Save students to file
        FileStorage.saveToFile(filename, students);

        // Retrieve student by ID
        System.out.print("Enter Student ID to search: ");
        String searchId = scanner.nextLine();

        List<Student> retrievedStudents = (List<Student>) FileStorage.readFromFile(filename);
        boolean found = false;

        for (Student student : retrievedStudents) {
            if (student.id.equals(searchId)) {
                System.out.println("Student Found: " + student.name);
                System.out.println("Programme: " + student.programme);
                System.out.println("Scores: " + student.courseScores);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Student not found.");
        }

        scanner.close();
    }
}