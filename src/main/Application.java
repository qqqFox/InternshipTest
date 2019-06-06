package main;

import institution.University;
import institution.interlink.Internship;
import person.Student;
import person.consciousness.Knowledge;

public class Application {
    public static void main(String[] args) {

        Student student1 = new Student("Andrew Kostenko");
        Student student2 = new Student("Julia Veselkina");
        Student student3 = new Student("Maria Perechrest");
        Student student4 = new Student("Maksim Prudko");
        Student student5 = new Student("Fray Vasovsky");
        student1.setKnowledge(new Knowledge(63));
        student2.setKnowledge(new Knowledge(79));
        student3.setKnowledge(new Knowledge(40));
        student4.setKnowledge(new Knowledge(95));
        student5.setKnowledge(new Knowledge(50));

        University univer = new University("CH.U.I.");
        univer.addStudent(student1);
        univer.addStudent(student2);
        univer.addStudent(student3);
        univer.addStudent(student4);
        univer.addStudent(student5);

        //Univer TEST
        System.out.println("Список студентів з Univer");
        System.out.println(univer.getStudentsList());
        System.out.println("\n\nStudents from Univery with higher than average level\n(students to adding to internship)");
        System.out.println(univer.getStudentsToInternship());

        Internship internship = new Internship("Interlink");
        internship.addStudent(student5);
        //Add student with the highest LVL of knowledge in univer
        internship.addStudent(univer.getStudentsToInternship().get(1));
        //after this add second student by univer LVL
        internship.addStudent(univer.getStudentsToInternship().get(0));

        System.out.println("\n\nList of internships students:");
        System.out.println(internship.getStudents());
    }
}
