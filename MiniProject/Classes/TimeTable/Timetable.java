package MiniProject.Classes.TimeTable;

import java.util.HashMap;
import java.util.Map;

import MiniProject.Classes.Course.Course;

public class Timetable {
    private Map<String, String[][]> schedule; // Map<CourseCode, ScheduleArray>

    public Timetable() {
        schedule = new HashMap<>();
    }

    public void addCourseToTimetable(Course course, String[][] courseSchedule) {
        String courseCode = course.courseCode;

        if (!schedule.containsKey(courseCode)) {
            schedule.put(courseCode, courseSchedule);
            System.out.println("Course added to the timetable: " + courseCode);
        } else {
            System.out.println("Course already exists in the timetable: " + courseCode);
        }
    }

    public void displayTimetable() {
        System.out.println("Timetable:");
        for (Map.Entry<String, String[][]> entry : schedule.entrySet()) {
            String courseCode = entry.getKey();
            String[][] courseSchedule = entry.getValue();

            System.out.println("Course Code: " + courseCode);
            System.out.println("Schedule:");

            for (int i = 0; i < courseSchedule.length; i++) {
                System.out.print("Day " + (i + 1) + ": ");
                for (int j = 0; j < courseSchedule[i].length; j++) {
                    System.out.print(courseSchedule[i][j] + "\t");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
