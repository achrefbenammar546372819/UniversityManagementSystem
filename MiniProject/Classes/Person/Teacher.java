package MiniProject.Classes.Person;

import java.util.ArrayList;
import java.util.List;

import MiniProject.Classes.Course.Course;

public class Teacher extends Person {
    public List<Course> teachingCourses;

    public Teacher(String name, String id) {
        super(name, id);
        teachingCourses = new ArrayList<>();
    }

    public void assignCourse(Course course) {
        teachingCourses.add(course);
        course.setTeacher(this);
    }

    public void displayTeachingCourses() {
        System.out.println("Teaching courses for teacher " + name + " (ID: " + id + "):");
        for (Course course : teachingCourses) {
            System.out.println(course.courseCode + ": " + course.subject.name);
        }
    }   
}
