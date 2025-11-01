import java.io.Serializable;

//java FileBasedStudentSystem
//javac FileBasedStudentSystem.java
//javac *.java
class Person implements Serializable {
    String id, name;

    public Person(String id, String name) {
        this.id = id;
        this.name = name;
    }
}