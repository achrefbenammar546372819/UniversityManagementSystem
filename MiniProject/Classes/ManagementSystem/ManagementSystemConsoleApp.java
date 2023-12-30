package MiniProject.Classes.ManagementSystem;

import java.util.Scanner;

import MiniProject.Classes.Classroom.Classroom;
import MiniProject.Classes.Course.Course;
import MiniProject.Classes.Subject.Subject;
import MiniProject.Classes.TimeTable.Timetable;
import MiniProject.Classes.Person.*
;


public class ManagementSystemConsoleApp {
private static UniversityManagementSystem universityManagementSystem = new UniversityManagementSystem();
    private static Timetable timetable = new Timetable();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;

        do {
            System.out.println("University Management System Menu:");
            System.out.println("1. Add Student");
            System.out.println("2. Add Teacher");
            System.out.println("3. Add Course");
            System.out.println("4. Enroll Student in Course");
            System.out.println("5. Assign Teacher to Course");
            System.out.println("6. Add Course to Timetable");
            System.out.println("7. Display Timetable");
            System.out.println("8. Display Enrolled Students for Course");
            System.out.println("9. Display Enrolled Courses for Student");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    addTeacher();
                    break;
                case 3:
                    addCourse();
                    break;
                case 4:
                    enrollStudentInCourse();
                    break;
                case 5:
                    assignTeacherToCourse();
                    break;
                case 6:
                    addCourseToTimetable();
                    break;
                case 7:
                    displayTimetable();
                    break;
                case 8:
                    displayEnrolledStudentsForCourse();
                    break;
                case 9:
                    displayEnrolledCoursesForStudent();
                    break;
                case 0:
                    System.out.println("Exiting the program. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 0);
    }

    private static void addStudent() {
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();
        System.out.print("Enter student ID: ");
        String id = scanner.nextLine();

        Student student = new Student(name, id);
        universityManagementSystem.addStudent(student);
        System.out.println("Student added: " + student.name);
    }

    private static void addTeacher() {
        System.out.print("Enter teacher name: ");
        String name = scanner.nextLine();
        System.out.print("Enter teacher ID: ");
        String id = scanner.nextLine();

        Teacher teacher = new Teacher(name, id);
        universityManagementSystem.addTeacher(teacher);
        System.out.println("Teacher added: " + teacher.name);
    }

    private static void addCourse() {
        System.out.print("Enter course code: ");
        String courseCode = scanner.nextLine();
        System.out.print("Enter subject name: ");
        String subjectName = scanner.nextLine();
        System.out.print("Enter subject code: ");
        String subjectCode = scanner.nextLine();
        System.out.print("Enter classroom number: ");
        String roomNumber = scanner.nextLine();

        Subject subject = new Subject(subjectName, subjectCode);
        Classroom classroom = new Classroom(roomNumber);

        Course course = new Course(courseCode, subject, classroom);
        universityManagementSystem.addCourse(course);

        System.out.println("Course added: " + course.courseCode + " - " + course.subject.name);
    }

    private static void enrollStudentInCourse() {
        System.out.print("Enter student ID: ");
        String studentId = scanner.nextLine();
        System.out.print("Enter course code: ");
        String courseCode = scanner.nextLine();

        Student student = universityManagementSystem.getStudentById(studentId);
        Course course = universityManagementSystem.getCourseByCode(courseCode);

        if (student != null && course != null) {
            student.enrollCourse(course);
            System.out.println("Student " + student.name + " enrolled in course " + course.courseCode);
        } else {
            System.out.println("Student or course not found. Please check the IDs and course code.");
        }
    }

    private static void assignTeacherToCourse() {
        System.out.print("Enter teacher ID: ");
        String teacherId = scanner.nextLine();
        System.out.print("Enter course code: ");
        String courseCode = scanner.nextLine();

        Teacher teacher = universityManagementSystem.getTeacherById(teacherId);
        Course course = universityManagementSystem.getCourseByCode(courseCode);

        if (teacher != null && course != null) {
            teacher.assignCourse(course);
            System.out.println("Teacher " + teacher.name + " assigned to course " + course.courseCode);
        } else {
            System.out.println("Teacher or course not found. Please check the IDs and course code.");
        }
    }

    private static void addCourseToTimetable() {
        System.out.print("Enter course code: ");
        String courseCode = scanner.nextLine();

        Course course = universityManagementSystem.getCourseByCode(courseCode);

        if (course != null) {
            System.out.println("Enter the schedule for the course (e.g., MWF, 10:00 AM - 11:30 AM):");
            System.out.print("Day 1: ");
            String day1 = scanner.nextLine();
            System.out.print("Day 2: ");
            String day2 = scanner.nextLine();
            System.out.print("Day 3: ");
            String day3 = scanner.nextLine();

            String[][] courseSchedule = {{day1}, {day2}, {day3}};
            timetable.addCourseToTimetable(course, courseSchedule);
        } else {
            System.out.println("Course not found. Please check the course code.");
        }
    }

    private static void displayTimetable() {
        timetable.displayTimetable();
    }

    private static void displayEnrolledStudentsForCourse() {
        System.out.print("Enter course code: ");
        String courseCode = scanner.nextLine();

        Course course = universityManagementSystem.getCourseByCode(courseCode);

        if (course != null) {
            course.displayEnrolledStudents();
        } else {
            System.out.println("Course not found. Please check the course code.");
        }
    }

    private static void displayEnrolledCoursesForStudent() {
        System.out.print("Enter student ID: ");
        String studentId = scanner.nextLine();

        Student student = universityManagementSystem.getStudentById(studentId);

        if (student != null) {
            student.displayEnrolledCourses();
        } else {
            System.out.println("Student not found. Please check the student ID.");
        }
    }

}
