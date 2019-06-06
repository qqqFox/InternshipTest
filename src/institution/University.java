package institution;

import person.Student;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class University {

    private String name;
    private List<Student> students;

    public University(String name) {
        this.name = name;
        students = new ArrayList();
    }

    public void addStudent(Student student) {
        try {
            students.add(student);
        } catch (Error err) {
            System.out.printf("Failed to add student: %s to university %s%n", student.getName(), this.name);
        }
    }

    public List getStudentsList() {
        return students;
    }

    public String getName() {
        return name;
    }

    public List<Student> getStudentsToInternship() {
        return students.stream()
                .filter(student -> student.getKnowledge().getlvl() > getAverageKnowledgelvl())
                .sorted(Comparator.comparing(student -> student.getKnowledge().getlvl()))
                .collect(Collectors.toList());
    }

    //Get average knowledge lvl in univer
    private int getAverageKnowledgelvl() {
        return (int) students.stream()
                .mapToDouble(student -> student.getKnowledge().getlvl())
                .average()
                .orElse(0);
    }
}
