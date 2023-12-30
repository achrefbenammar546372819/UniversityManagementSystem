package MiniProject.Classes.Person;

import java.util.ArrayList;
import java.util.List;

import MiniProject.Classes.Course.Course;

public class Student extends Person {
    public List<Course> enrolledCourses;

    public Student(String name, String id) {
        super(name, id);
        enrolledCourses = new ArrayList<>();
    }

    public void enrollCourse(Course course) {
        enrolledCourses.add(course);
        course.enrollStudent(this);
    }

    public void displayEnrolledCourses() {
        System.out.println("Enrolled courses for student " + name + " (ID: " + id + "):");
        for (Course course : enrolledCourses) {
            System.out.println(course.courseCode + ": " + course.subject.name);
        }
    }  
}
