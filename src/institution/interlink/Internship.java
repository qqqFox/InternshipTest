package institution.interlink;

import person.Student;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Internship {

    private String name;
    private List<Student> students;

    public Internship(String name) {
        this.name = name;
        this.students = new ArrayList();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public String getStudents() {
        return students.stream()
                .sorted(Comparator.comparing(student -> student.getKnowledge().getlvl()))
                .map(Student::toString)
                .reduce("", (student1, student2) -> String.format("%s %s\n", student1, student2));
    }
}
