package MiniProject.Classes.Club;

import java.util.ArrayList;
import java.util.List;

import MiniProject.Classes.Person.Student;

public class Club {
    public String clubName;
    public List<Student> members;

    public Club(String clubName) {
        this.clubName = clubName;
        members = new ArrayList<>();
    }

    public void addMember(Student student) {
        members.add(student);
    }   
}
