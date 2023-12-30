package MiniProject.Classes.ManagementSystem;

import java.util.ArrayList;
import java.util.List;

import MiniProject.Classes.Course.Course;
import MiniProject.Classes.Person.Student;
import MiniProject.Classes.Person.Teacher;

public class UniversityManagementSystem {
private List<Student> students;
    private List<Teacher> teachers;
    private List<Course> courses;

    public UniversityManagementSystem() {
        students = new ArrayList<>();
        teachers = new ArrayList<>();
        courses = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public Student getStudentById(String studentId) {
        for (Student student : students) {
            if (student.id.equals(studentId)) {
                return student;
            }
        }
        return null;
    }

    public Teacher getTeacherById(String teacherId) {
        for (Teacher teacher : teachers) {
            if (teacher.id.equals(teacherId)) {
                return teacher;
            }
        }
        return null;
    }

    public Course getCourseByCode(String courseCode) {
        for (Course course : courses) {
            if (course.courseCode.equals(courseCode)) {
                return course;
            }
        }
        return null;
    }
}
 

