package MiniProject.Classes.Course;
import java.util.ArrayList;
import MiniProject.Classes.Classroom.*;
import MiniProject.Classes.Subject.*;
import MiniProject.Classes.Person.*;
import MiniProject.Classes.Exam.*;


public class Course {
    public String courseCode;
    public Subject subject;
    public Teacher teacher;
    public Classroom classroom;
    public ArrayList<Student> enrolledStudents;
    public ArrayList<Exam> exams;

    public Course(String courseCode, Subject subject, Classroom classroom) {
        this.courseCode = courseCode;
        this.subject = subject;
        this.classroom = classroom;
        enrolledStudents = new ArrayList<>();
        exams = new ArrayList<>();
    }

    public void enrollStudent(Student student) {
        enrolledStudents.add(student);
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public void addExam(Exam exam) {
        exams.add(exam);
    }

    public void displayEnrolledStudents() {
        System.out.println("Enrolled students for course " + courseCode + ":");
        for (Student student : enrolledStudents) {
            System.out.println(student.name + " (ID: " + student.id + ")");
        }
    }
}
