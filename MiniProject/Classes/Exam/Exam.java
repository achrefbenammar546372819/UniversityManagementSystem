package MiniProject.Classes.Exam;

import MiniProject.Classes.Course.Course;

public class Exam {
    public String examCode;
    public Course course;

    public Exam(String examCode, Course course) {
        this.examCode = examCode;
        this.course = course;
    }
}
