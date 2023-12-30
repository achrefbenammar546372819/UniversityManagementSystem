package MiniProject.Classes.Group;

import java.util.ArrayList;

import MiniProject.Classes.Person.Student;

public class Group {
    public String groupName;
    public ArrayList<Student> students;

    public Group(String groupName) {
        this.groupName = groupName;
        students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }
}
