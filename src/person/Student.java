package person;

import person.consciousness.Knowledge;

public class Student {

    private String name;
    private Knowledge knowledge;

    public Student(String name) {
        this.name = name;
    }

    public void setKnowledge(Knowledge knowledge) {
        this.knowledge = knowledge;
    }

    //Maybe) knowledge = 1 - 100;
    public Knowledge getKnowledge() {
        return knowledge;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return String.format("Name:%s, Knowledge level:%d", name, knowledge.getlvl());
    }
}
